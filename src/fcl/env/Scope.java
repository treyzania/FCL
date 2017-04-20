package fcl.env;
import fcl.ast.SrcPos;
import fcl.datum.Datum;
import fcl.datum.type.Type;

public interface Scope {
	/**
	 * Returns the type of the binding with the given name.
	 * @param name
	 * @return
	 */
	public Type getBindingType(SrcPos src, String name);
	
	/**
	 * Returns the value of the static binding with the given name.
	 * @param name
	 * @return
	 */
	public Datum getBindingValue(SrcPos src, String name);
	
	/**
	 * 
	 * @param name
	 * @return -1 if the binding doesn't exist, 0 if shallow, > 0 if deeper.
	 */
	public int getBindingDepth(String name);
}
