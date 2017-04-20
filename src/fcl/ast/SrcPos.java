package fcl.ast;

public class SrcPos {
	String filename;
	long row, col;

	public SrcPos(String filename, long row, long col) {
		this.filename = filename;
		this.row = row;
		this.col = col;
	}
	
	@Override
	public String toString() {
		return String.format("%s:%d:%d", this.filename, this.row, this.col); 
	}
}
