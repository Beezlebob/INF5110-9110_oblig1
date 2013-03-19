package syntaxtree;

public class Type implements PrintAST{

	String typeName;
	String name;
	
	public Type(String typeName,String name){
		this.typeName = typeName;
		this.name = name;
	}
	
	@Override
	public String printAst() {
		return "TYPE "+ typeName+") (NAME "+name+")";
	}

}
