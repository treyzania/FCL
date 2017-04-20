package fcl.ast;

public class SrcPosException extends RuntimeException {
	private static final long serialVersionUID = -8376272824661690372L;

	SrcPos src;

	public SrcPosException(SrcPos src, String msg) {
		super(msg);
		this.src = src;
	}
	
	public SrcPosException(String msg) {
		this(null, msg);
	}
	
	public final String getMessage() {
		return this.src == null
				? this.getMessageWithPos()
				: src.toString() + ": " + this.getMessageWithPos();
	}
	
	/**
	 * Returns the string to put after the source location.
	 * @return
	 */
	public String getMessageWithPos() {
		return super.getMessage();
	}
}
