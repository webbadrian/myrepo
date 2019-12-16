package inter; // File Unary.java
import lexer . * ; import symbol.* ;
public class Unary extends Op {
	public Expr expr ;
	public Unary ( Token tok , Expr x) { // handles minus , f or s e e Not
		super (tok , null) ; expr = x ;
		type = Type.max ( Type . Int , expr.type ) ;
		if (type == null ) error ( "type error" ) ;
	}
	public Expr gen () { return new Unary ( op , expr.reduce ()); }
	public String toString () { return op.toString() + " "+ expr.toString() ; }
}