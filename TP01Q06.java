/**
* Class Principal - TP01 - Questao 6 - Is
* @author Pedro Henrique Lima Carvalho
* Matricula: 651230
* AED2 - Tarde - Puc Minas
*/



public class TP01Q06{
	
	/**
	* Metodo main
	*/
	public static void main (String[] args){
		String input = MyIO.readLine();


		while (!isEnd(input)){
			MyIO.println(result(input));
			input = MyIO.readLine();
		}
	}
	

	/**
	* isEnd - Verifica o fim das entradas
	* @param String
	* @return boolean
	*/
	public static boolean isEnd (String s){
		return (s.length()==3 && s.charAt(0)=='F' &&
			s.charAt(1)=='I' && s.charAt(2)=='M');
	}

	/**
	*result - Forma uma string com o resultado dos metodos
	*@param String
	*@return String
	*/
	public static String result (String s){
		//declaracoes
		String resp = "";

		if (isVogal(s))
			resp = resp + "SIM ";
		else
			resp = resp + "NAO ";

		if (isConst(s))
			resp = resp + "SIM ";
		else
			resp = resp + "NAO ";

		if (isInt(s))
			resp = resp + "SIM ";
		else
			resp = resp + "NAO ";

		if (isReal(s))
			resp = resp + "SIM";
		else
			resp = resp + "NAO";
		return resp;
	}

	/**
	*isVogal - Verifica se ha somente vogais
	*@param String
	*@return boolean
	*/
	public static boolean isVogal (String s){
		//declaracoes
		boolean resp = false;
		
		if (s.length()>0)
			resp = true;

		for (int i=0; i<s.length() && resp; i++){
			if (s.charAt(i) != 'a' && s.charAt(i) != 'e' &&
			    s.charAt(i) != 'i' && s.charAt(i) != 'o' &&
			    s.charAt(i) != 'u' && s.charAt(i) != 'A' &&
			    s.charAt(i) != 'E' && s.charAt(i) != 'I' &&
			    s.charAt(i) != 'O' && s.charAt(i) != 'U')	
				resp = false;
		}
		return resp;
	}

	/**
	*isVogal - overload
	*@param char
	*@return boolean
	*/
	public static boolean isVogal (char c){
		//declaracoes
		String input = "";
		input = input + c;
		return(isVogal(input));
	}

	/**
	*isConst - Verifica se ha somente consoante
	*@param String
	*@return boolean
	*/
	public static boolean isConst (String s){
		//declaracoes
		boolean resp = false;
		
		if (s.length()>0)
			resp = true;
		
		for (int i=0; i<s.length() && resp; i++){
			if (!('a'<s.charAt(i) && s.charAt(i)<'z' && !isVogal(s.charAt(i))) ||
			    !('A'<s.charAt(i) && s.charAt(i)<'Z' && !isVogal(s.charAt(i))))
				resp = false;

		}
		return resp;
	}

	/**
	*isInt - verifica se string corresponde a um inteiro
	*@param String
	*@retur boolean
	*/
	public static boolean isInt (String s){
		//declaracoes
                boolean resp = false;
 
                if (s.length()>0)
                        resp = true;
 
                for (int i=0; i<s.length() && resp; i++){
                         if (!('0'<s.charAt(i) && s.charAt(i)<'9'))
                                 resp = false;
                }
                return resp;
        }
	
	/**
	*isInt - overload
	*@param char
	*@return boolean
	*/
	public static boolean isInt (char c){
		//declaracoes
		String input = "";
		input = input + c;
		return (isInt(input));
	}

	/**
	*isReal - verifica se string corresponde a um real
	*@param String
	*@return boolean
	*/
	public static boolean isReal (String s){
		//declaracoes
		boolean resp = false;
		int sign = 0;

		if (s.length()>0)
			resp = true;
		
		for (int i=0; i<s.length() && resp; i++){
			if (sign > 1)
				resp = false;
			
			if (s.charAt(i) == '.' || s.charAt(i) == ',')
				sign++;

			else
				resp = isInt(s.charAt(i));
		}
		return resp;
	}		
}
