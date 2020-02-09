/**
* Class Principal - TP01 - Questao 5 - Algebra Booleana
* @author Pedro Henrique Lima Carvalho
* Matricula: 651230
* AED2 - Tarde - Puc Minas
*/
public class Equacao{

//atributos
private String s;
private int count;

//construtor
public Equacao(String s, int count){
	this.s = s;
	this.count = count;
}

//metodos

/**
*getChar - procura proximo char relevante
*@return char
*/
public char getChar()
	char c = this.s.charAt(this.count);

	while ( (c!='a') //char para AND
		(c!='r') //char para OR
		(c!='n') //char para NOT
		(c!='(') //char para inicio de operacao
		(c!=')') //char para fim de operacao
		('A'<=c && c<='Z'){ // char para variaveis  
		
		this.count++;
		c=this.s.charAt(this.count);
	}
	return c;
}

/**
*updateCount - atualiza contador
*@param int
*/
public void updateCount (int i){
	this.count = this.count + i;
}

/**
*getCount - mostra contador
*@return int
*/
public int getCount(){
	return this.count;
}

public class TP01Q05{
	
	/**
	* Metodo main
	*/
	public static void main (String[] args){
		String input = MyIO.readLine();
		while (!isEnd(input)){
			MyIO.println(booleana(input));
			input = MyIO.readLine();
		}
	}
	

	/**
	* isEnd - Verifica o fim das entradas
	* @param String
	* @return boolean
	*/
	public static boolean isEnd (String s){
		return (s.length()==1 && s.charAt(0)=='0');
	}

	/**
	*booleana - Resolve uma expressao booleana
	*@param String
	*@return boolean
	*/
	public static String booleana (String s){
		//declaracoes
		int n = ((int) s.charAt(0)) - 48;
		int count = 2;
		boolean[] variaveis = new boolean[n];	
		char c='-';	

		for (int i=0; i<n; i++){
			
			variaveis[i] = (((int)s.charAt(count)) - 48) == 1;
			count = count + 2;
		}
		
		if (op(c, s, variaveis, count))
			return "1";	
		else
			return "0";
	}
	
	public static char strReader (S

	/**
	*op - realiza uma operacao booleana
	*@param - char, string,  boolean[], int
	*@return - boolean
	*/
	public static boolean op (char c, String s, boolean[] vars, int count){
		//definicoes
		boolean resp = vars[0];


		return resp;
	}

	

}
