/**
* Class Principal - TP01 - Questao 4 - Alteracao Aleatoria
* @author Pedro Henrique Lima Carvalho
* Matricula: 651230
* AED2 - Tarde - Puc Minas
*/

import java.util.Random;

public class TP01Q04{
	
	/**
	* Metodo main
	*/
	public static void main (String[] args){
		String input = MyIO.readLine();
		Random gerador = new Random();
		gerador.setSeed(4);
		while (!isEnd(input)){
			MyIO.println(alter(input, gerador));
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
	*alter - Altera de forma aleatora os caracteres de uma String
	*@param String
	*@return String
	*/
	public static String alter (String s, Random gerador){
		//declaracoes
		String resp = "";
		char origin = (char)( 'a' + (Math.abs(gerador.nextInt()) % 26));
		char replac = (char)( 'a' + (Math.abs(gerador.nextInt()) % 26));		

		for (int i=0; i<s.length(); i++){
			if (s.charAt(i) == origin)
				resp = resp+replac;
			else
				resp = resp+s.charAt(i);
		}

		return resp;
	}
}
