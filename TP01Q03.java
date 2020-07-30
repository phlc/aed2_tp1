/**
* Class Principal - TP01 - Questao 3 - Ciframento
* @author Pedro Henrique Lima Carvalho
* Matricula: 651230
* AED2 - Tarde - Puc Minas
*/
public class TP01Q03{
	
	/**
	* Metodo main
	*/
	public static void main (String[] args){
		String input = MyIO.readLine();

		while (!isEnd(input)){
			MyIO.println(cypher(input));
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
	*cypher - cifra uma String com deslocamento de 3
	*@param String
	*@return String
	*/
	public static String cypher (String s){
		String resp = "";

		for (int i=0; i<s.length(); i++){
			resp = resp+((char)(s.charAt(i)+3));
		}

		return resp;
	}
}
