package fcl.env;
import fcl.ast.SrcPos;
import fcl.ast.SrcPosException;
import fcl.datum.Datum;
import fcl.datum.Module;
import fcl.datum.type.Type;

public class ModuleScope implements Scope {
	Scope parent;
	Module module;

	public ModuleScope(Scope parent, Module module) {
		this.parent = parent;
		this.module = module;
	}

	@Override
	public Type getBindingType(SrcPos src, String name) {
		Module.Binding binding = this.module.getBinding(name);
		if (binding == null) {
			return this.parent.getBindingType(src, name);
		}
		else {
			return binding.type;
		}
	}

	@Override
	public Datum getBindingValue(SrcPos src, String name) {
		Module.Binding binding = this.module.getBinding(name);
		if (binding == null) {
			return this.parent.getBindingType(src, name);
		}
		else if (binding.value == null) {
			throw new SrcPosException(src, "Cannot statically determine value of dynamic variable '" + name + "'");
		}
		else {
			return binding.value;
		}
	}

	@Override
	public int getBindingDepth(String name) {
		int pd = this.parent.getBindingDepth(name);
		return pd == -1 ? -1 : (pd + 1);
	}
}
