/* Generated By:JJTree: Do not edit this line. ASTFunction.java */

public class ASTFunction extends SimpleNode {
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
  public Declaration decl;
}
