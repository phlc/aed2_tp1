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
		return (s.length()==1 && s.charAt(0)=='0);
	}

	/**
	*booleana - Resolve uma expressao booleana
	*@param String
	*@return boolean
	*/
	public static String alter (String s){
		//declaracoes
		boolean resp;
	
		return resp;
	}
}