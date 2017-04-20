package fcl.ast;

public abstract class AST {
	final SrcPos src;
	
	public AST(SrcPos src) {
		this.src = src;
	}
	
	public SrcPos getSrcPos() { return this.src; }
}
