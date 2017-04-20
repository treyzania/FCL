package fcl.datum;

import java.util.HashMap;

import fcl.datum.type.Type;

public class Module implements Datum {
	
	public static class Binding {
		public final String name;
		public final Type type;
		public final Datum value;
		
		public Binding(String name, Type type, Datum value) {
			this.name = name;
			this.type = type;
			this.value = value;
		}
	}
	
	HashMap<String, Binding> bindings;
	
	/**
	 * Returns the binding with the given name.
	 * @param name
	 * @return
	 */
	public Binding getBinding(String name) {
		return this.bindings.get(name);
	}
	
	/**
	 * Add a static binding.
	 * @param name
	 * @param type
	 * @param value
	 */
	public void addBinding(String name, Type type, Datum value) {
		this.bindings.put(name, new Binding(name, type, value));
	}
	
	/**
	 * Add a dynamic binding.
	 * @param name
	 * @param type
	 * @param value
	 */
	public void addBinding(String name, Type type) {
		this.bindings.put(name, new Binding(name, type, null));
	}
}
