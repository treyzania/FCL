package fcl.ast;
import fcl.env.Scope;

public class Identifier extends AST {
	final String name;
	final Scope scope;
	
	public Identifier(SrcPos pos, String name, Scope scope) {
		super(pos);
		this.name = name;
		this.scope = scope;
	}
	
	public String toString() {
		return this.name;
	}
	
	public boolean sameIdentifier(Identifier other) {
		throw new RuntimeException("unimplemented");
	}
}
