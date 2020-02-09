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
	public static String booleana (String s){
		//declaracoes
		int n = (int) s.charAt(0);
		int count = 2;
		boolean[] variaveis = new boolean[n];
		boolean resp = 0;	
		char c;	

		for (int i=0; i<n; i++){
			
			variaveis[i] = (int)s.charAt(count);
			count = count + 2;
		}
		

		while (count < s.length()){
			c = s.charAt(count);
		}
	
		
			
		return resp;
	}

	/**
	*and - Retorna and de todas variaveis
	*@param - booleans
	*@return - boolean
	*/
	public static boolean and (boolean a, boolean b){
		return (a&&b);
	}

	/**
	*or - Retorna or de todas variaveis
	*@param - booleans
	*@return - boolean
	*/
	public static boolean or (boolean a, boolean b){
		return (a||b);
	}

	/**
	*not - Retorna not da variavel
	*@param - boolean
	*@return - boolean
	*/
	public static boolean not (boolean a){
		return (!a);
	}

}
