/**
* Class Principal - TP01 - Questao 5 - Algebra Booleana
* @author Pedro Henrique Lima Carvalho
* Matricula: 651230
* AED2 - Tarde - Puc Minas
*/
class Equacao{

	//atributos
	private String s;
	private int count;
	private boolean[] vars;

	//construtor
	public Equacao(String str){
		this.s = str;

		int n = ((int) this.s.charAt(0)) - 48;
                this.count = 2;
                vars = new boolean[n];

                for (int i=0; i<n; i++){

                        vars[i] = (((int)s.charAt(count)) - 48) == 1;
                        count = count + 2;
                }
	}

	//metodos

	/**
	*getChar - procura proximo char relevante
	*@return char
	*/
	public char getChar(){
		char c = this.s.charAt(this.count);

		while ( (c!='a') && /*char para AND*/
			(c!='r') && /*char para OR*/
			(c!='t') && /*char para NOT*/
			(c!='(') && /*char para inicio de operacao*/
			(c!=')') && /*char para fim de operacao*/
			(!('A'<=c && c<='Z'))){ /*char para variaveis*/  
		
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
	*getCount - retorna o valor do contador
	*@return int
	*/
	public int getCount(){
		return this.count;
	}

	/**
	*getValue - retorna o valor da variavel
	*@param char
	*@return boolean
	*/
	public boolean getValue (char c){
		int i = ((int)c) - 65;
		return this.vars[i]; 
	
	}
}

public class TP01Q05{
	
	/**
	* Metodo main
	*/
	public static void main (String[] args){
		String input = MyIO.readLine();
		while (!isEnd(input)){	
			if (booleana(input))
				MyIO.println("1");	
		//	else
		//		MyIO.println("0");
			
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
	public static boolean booleana (String s){
		//declaracoes
		Equacao eq = new Equacao(s);
	
		if(true){
		MyIO.print(eq.getChar()+" "+eq.getCount()+" "+eq.getValue('A'));
		eq.updateCount(1);
		MyIO.println(" "+eq.getChar()+" "+eq.getCount()+" "+eq.getValue('B'));
		}	
		return false;
	}
	
}
