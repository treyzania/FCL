package fcl.env;
import fcl.ast.SrcPos;
import fcl.ast.SrcPosException;
import fcl.datum.Datum;
import fcl.datum.type.Type;

public class EmptyScope implements Scope {
	public static final EmptyScope INSTANCE = new EmptyScope();

	private EmptyScope() {}
	
	@Override
	public Type getBindingType(SrcPos src, String name) {
		throw new SrcPosException(src, "Undefined variable '" + name + "'");
	}
	
	@Override
	public Datum getBindingValue(SrcPos src, String name) {
		throw new SrcPosException(src, "Undefined variable '" + name + "'");
	}

	@Override
	public int getBindingDepth(String name) {
		return -1;
	}
}
