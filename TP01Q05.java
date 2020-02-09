/**
* Class Principal - TP01 - Questao 5 - Algebra Booleana
* @author Pedro Henrique Lima Carvalho
* Matricula: 651230
* AED2 - Tarde - Puc Minas
*/

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
