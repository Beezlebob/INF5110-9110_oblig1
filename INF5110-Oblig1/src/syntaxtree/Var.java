package syntaxtree;

public class Var implements PrintAST {

	String name;
	
	
	public Var(String name){
		this.name = name;
	}
	
	@Override
	public String printAst() {
		
		return "(NAME "+name+")";
	}

}
