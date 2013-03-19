package syntaxtree;

import java.util.List;

public class ProcDecl implements PrintAST {
	
	Type type;
	List<ParamDecl> params;
	List<Decl> decls;
	List<Stmt> stmts;
	String returnValue;
	
	public ProcDecl(Type type){
		this.type = type;
	}
	
	@Override
	public String printAst() {
		returnValue = "(PROC_DECL ("+type.printAst();
		if(params == null&&decls==null){
			returnValue+="))";
		}else{
			if(params!= null){
				for(int i = 0;i<params.size();i++){
					returnValue+=params.get(i).printAst();
				}
			}
			if(decls!=null){
				for(int i = 0;i<decls.size();i++){
					returnValue+=decls.get(i).printAst();
				}
			}
		}
		return returnValue;
		
	}

}
