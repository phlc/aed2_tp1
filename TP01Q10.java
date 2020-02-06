/**
* Classe principal TP1 - Questao 10 - Palindromo Recursivo
* @author Pedro Henrique Lima Carvalho
* Matricula: 651230
* AED2 - Tarde - Puc Minas
*/
public class TP01Q10{

	/**
	* Metodo main
	*/
	public static void main (String[] args){
		//declaracoes
		String input = MyIO.readLine();

		//repetir ate FIM
		while (!isEnd(input)){
			if (isPalindromo(input))
				MyIO.println("SIM");
			else
				MyIO.println("NAO");
			
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
	* isPalindromo - Verifica se a String e' palindromo
	* @param String
	* @return boolean
	*/
	public static boolean isPalindromo (String s, int inicio, int fim){
		
		//declaracoes
		boolean resp = false;	

		if (inicio < fim && s.charAt(inicio)==s.charAt(fim)){
			resp = isPalindromo(s, inicio+1, fim-1);
		
		}
		else{
			resp = s.charAt(inicio)==s.charAt(fim);
		}

		//retorno
		return resp;
	}

	/**
	* isPalindromo - overload
	* @param String
	* @return boolean
	*/
	public static boolean isPalindromo (String s){
		return (isPalindromo(s, 0, (s.length()-1)));
	}
}
