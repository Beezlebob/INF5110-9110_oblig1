package syntaxtree;

public class ParamDecl implements PrintAST {

	VarDecl decl;

	public ParamDecl(VarDecl decl) {
		this.decl = decl;
	}

	@Override
	public String printAst() {
		return decl.printAst();
	}

}
