/* Generated By:JJTree: Do not edit this line. ASTFunction.java */

public class ASTFunction extends SimpleNode {
  public final static int ReturnValueInteger = 1;
  public final static int ReturnValueDouble  = 2;
  public final static int ReturnValueString  = 3;
  public final static int ReturnValueBoolean = 4;
  public final static int ReturnValueDFP     = 5;

  public ASTFunction(int id) {
    super(id);
  }

  public ASTFunction(IntVParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(IntVParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

	/** customizing codes **/
	public String varName;
	public int decl;
}
