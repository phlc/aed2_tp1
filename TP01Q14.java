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
			(c!=',') && /*char para separacao de variaveis*/
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
		
			
		return false;
	}

	/**
	*and - retorna solucao AND da variaveis
	*@param Equacao
	*@return boolean
	*/
	public static boolean and (Equacao eq){
		boolean[] inputs = new boolean[5];
		int input = 0;
		for (int i=0; i<5; i++){
			inputs[i] = true // valor neutro para AND
		}
		eq.updateCount(1);

		while (eq.getChar() != ')'){
			if ('A'<=eq.getChar() && eq.getChar()<='Z'){
				inputs[input] = eq.getValue(eq.getChar());
				input++;
			}
			else if (eq.getChar() = 'a'){
				inputs[input] = and(eq);
				input++;
			}
			else if (eq.getChar() = 'r'){
				inputs[input] = or(eq);
				input++;
			}
			else if (eq.getChar() = 't'){
				inputs[input] = not(eq);
				input++;
			}
		}
		
		return (inputs[0] && inputs[1] && inputs[2] && inputs[3] && inputs[4]);
	}
	
	/**
	*or - retorna solucao OR da variaveis
	*@param Equacao
	*@return boolean
	*/
	public static boolean or (Equacao eq){
		boolean[] inputs = new boolean[5];
		int input = 0;
		for (int i=0; i<5; i++){
			inputs[i] = false // valor neutro para OR
		}
		eq.updateCount(1);

		while (eq.getChar() != ')'){
			if ('A'<=eq.getChar() && eq.getChar()<='Z'){
				inputs[input] = eq.getValue(eq.getChar());
				input++;
			}
			else if (eq.getChar() = 'a'){
				inputs[input] = and(eq);
				input++;
			}
			else if (eq.getChar() = 'r'){
				inputs[input] = or(eq);
				input++;
			}
			else if (eq.getChar() = 't'){
				inputs[input] = not(eq);
				input++;
			}
		}
		
		return (inputs[0] || inputs[1] || inputs[2] || inputs[3] || inputs[4]);
	}
		
	/**
	*not - retorna solucao NOT da variavel
	*@param Equacao
	*@return boolean
	*/
	public static boolean not (Equacao eq){
		
	}
}
