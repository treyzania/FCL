package fcl.ast;

import fcl.datum.Datum;

public class Literal extends AST {
	final Datum datum;

	public Literal(SrcPos src, Datum datum) {
		super(src);
		this.datum = datum;
	}
}
