package fcl.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import fcl.ast.AST;
import fcl.datum.Int;
import fcl.datum.Module;
import fcl.datum.type.TypeInt;
import fcl.env.EmptyScope;
import fcl.env.ModuleScope;
import fcl.env.Scope;

public class Modules {

	@Test
	public void test() {
		Module module = new Module();
		Scope scope = new ModuleScope(EmptyScope.INSTANCE, module);
		Int three = new Int(3);
		module.addBinding("three", TypeInt.INSTANCE, three);
		
		AST ast = new fcl.ast.Identifier(null, "three", scope);
	}
}
