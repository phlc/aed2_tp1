/**
* Classe principal TP1 - Questao 1 - Palindromo
* @author Pedro Henrique Lima Carvalho
* AED2 - Tarde - Puc Minas
*/
public class TP01Q01{

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
	public static boolean isPalindromo (String s){
		
		//declaracoes
		int inicio = 0;
		int fim = s.length()-1;
		boolean resp = false;

		//verificar input
		if (s.length() > 0)
			resp=true;

		//comparar caracteres
		while (inicio < fim && resp){
			resp = s.charAt(inicio)==s.charAt(fim);
			inicio++;
			fim--;
		}

		//retorno
		return resp;
	}

}
