package syntaxtree;

import java.util.List;

public class Decl implements PrintAST{
	String name;
	String returnValue;
	List<VarDecl> varDecls;
	List<ProcDecl> procDecls;
	List<ClassDecl> classDecls;
	
	public Decl(String name){
		this.name = name;
	}

	@Override
	public String printAst() {
		if(varDecls!= null){
			for(int i = 0;i<varDecls.size();i++){
				returnValue+=varDecls.get(i).printAst();
			}
		}
		if(procDecls!=null){
			for(int i = 0;i<procDecls.size();i++){
				returnValue+=procDecls.get(i).printAst();
			}
		}
		if(classDecls!=null){
			for(int i = 0;i<classDecls.size();i++){
				returnValue+=classDecls.get(i).printAst();
			}
		}
		return returnValue;
	}
	
	
}
