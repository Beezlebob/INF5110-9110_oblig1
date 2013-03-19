package syntaxtree;

public class VarDecl implements PrintAST {

	Type type;
	String name;
	
	public VarDecl(String name) {
	this.name = name;
	}

	public String printAst() {
		return "(VAR_DECL (" + type.printAst()+"))";
	}
}