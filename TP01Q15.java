/**
* TP01 - Questao 15 - Is Recursivo
* @author Pedro Henrique Lima Carvalho
* Matricula: 651230
* AED2 - Tarde - Puc Minas
*/



public class TP01Q15{
	
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
	*@param String int
	*@return boolean
	*/
	public static boolean isVogal (String s, int i){
		//declaracoes
		boolean resp = false;
		
		if (s.length()>0)
			resp = true;

		if ( i<s.length()){
			if (s.charAt(i) != 'a' && s.charAt(i) != 'e' &&
			    s.charAt(i) != 'i' && s.charAt(i) != 'o' &&
			    s.charAt(i) != 'u' && s.charAt(i) != 'A' &&
			    s.charAt(i) != 'E' && s.charAt(i) != 'I' &&
			    s.charAt(i) != 'O' && s.charAt(i) != 'U')	
				resp = false;
		
			if (resp)
				resp = isVogal(s, ++i);
		}

		return resp;
	}
	
	/**
	*isVogal - overload
	*@param String
	*@return boolean
	*/
	public static boolean isVogal (String s){
		return(isVogal(s, 0));
	
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
	*@param String int
	*@return boolean
	*/
	public static boolean isConst (String s, int i){
		//declaracoes
		boolean resp = false;
		
		if (s.length()>0)
			resp = true;
		
		if (i<s.length()){
			if (!('a'<s.charAt(i) && s.charAt(i)<='z') && !('A'<s.charAt(i) && s.charAt(i)<='Z'))
				resp = false;
			if (isVogal(s.charAt(i)))
				resp = false;

			if (resp)
				resp = isConst(s, ++i);
		}
		return resp;
	}

	/**
	*isConst - overload
	*@param String
	*@return boolean
	*/
	public static boolean isConst (String s){
		return(isConst(s, 0));
	}

	/**
	*isInt - verifica se string corresponde a um inteiro
	*@param String int
	*@retur boolean
	*/
	public static boolean isInt (String s, int i){
		//declaracoes
                boolean resp = false;
 
                if (s.length()>0)
                        resp = true;
 
                if (i<s.length()){
                        if (!('0'<=s.charAt(i) && s.charAt(i)<='9'))
                                 resp = false;
                	
			if(resp)
				resp = isInt(s, ++i);	
		}
                return resp;
        }

	/**
	*isInt - overload
	*@param String
	*@return boolean
	*/
	public static boolean isInt (String s){
		return(isInt(s, 0));
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
	*@param String int int
	*@return boolean
	*/
	public static boolean isReal (String s, int i, int sign){
		//declaracoes
		boolean resp = false;

		if (s.length()>0)
			resp = true;
		
		if (i<s.length()){
			if (s.charAt(i) == '.' || s.charAt(i) == ','){
				sign++;
				if (sign>1)
					resp = false;
			}
			else
				resp = isInt(s.charAt(i));
			
			if (resp)
				resp = isReal(s, ++i, sign);
		}
		
		return resp;
	}	
	
	/**
	*isReal - overload
	*@param String
	*@return boolean
	*/
	public static boolean isReal (String s){
		return (isReal(s, 0, 0));
	}	
}
