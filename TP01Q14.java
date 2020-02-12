/**
* Class Principal - TP01 - Questao 14 - Algebra Booleana Recursiva
* @author Pedro Henrique Lima Carvalho
* Matricula: 651230
* AED2 - Tarde - Puc Minas
*/
class Equacao{

	//atributos
	private String s;
	private int count;
	private int limit;
	private boolean[] vars;

	//construtor
	public Equacao(String str){
		this.s = str;
		int n = ((int) this.s.charAt(0)) - 48;
                this.count = 2;
                vars = new boolean[n];

		variaveis(0); // inicializa vars
		this.s = clean(0); //limpa a string

		this.limit = this.s.length();
		this.count = 0;

	}
	/**
	*variaveis - inicializa as variaveis do objeto
	*@param boolean[]
	*@return boolean{}
	*/
	private void variaveis (int i){
		if (i < ((int) this.s.charAt(0) - 48)){
			this.vars[i] = (((int)s.charAt(count)) - 48) == 1;
			this.count = this.count + 2;
			variaveis(++i);
		}
	}

	/**
	*clean - retira os caracteres desnecessarios da string
	*/
	private String clean (int i){
		String resp = "";
		if (i < this.s.length()){
			char c = this.s.charAt(i);
			
			if ((c=='a') || /*char para AND*/
			    (c=='r') || /*char para OR*/
			    (c=='t') || /*char para NOT*/
			    ('A'<=c && c<='Z')){ /*char para variaveis*/  
				
				resp =  c + clean(++i);
			}
			else{
				resp = clean(++i);
			}
		}
		return resp;
	}

	/**
	*getChar - procura proximo char relevante
	*@return char
	*/
	public char getChar(){
		return (this.s.charAt(this.count));
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
	*getLimit - retorna o limite da string
	*return in
	*/
	public int getLimit(){
		return this.limit;
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

public class TP01Q14{
	
	/**
	* Metodo main
	*/
	public static void main (String[] args){
		tp01q14();
	}

	/**
	* tp01q14 permite percorrer recursivamente todas as linhas de input
	*/
	public static void tp01q14 (){
		String input = MyIO.readLine();
		if (!isEnd(input)){	
			if (booleana(input))
				MyIO.println("1");	
			else
				MyIO.println("0");
			
			tp01q14();
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
	*return boolean
	*/
	public static boolean booleana (String s){
		Equacao eq = new Equacao(s);
		return (booleana(eq));
	}
	/**
	*booleana - overload - Resolve uma expressao booleana
	*@param Equacao
	*@return boolean
	*/
	public static boolean booleana (Equacao eq){
		//declaracoes
		boolean resp = false;

		if (eq.getChar() == 'a'){
			eq.updateCount(1);
			resp =  and(eq);
		}
		else if (eq.getChar() == 'r'){
			eq.updateCount(1);
			resp = or(eq);
		}
		else if (eq.getChar() == 't'){
			eq.updateCount(1);
			resp = not(eq);
		}
	
		return resp;
	}

	/**
	*and - retorna solucao AND da variaveis
	*@param Equacao
	*@return boolean
	*/
	public static boolean and (Equacao eq){
		boolean a = true;
		boolean b = true;
			
		if (eq.getChar() == 'a'){
			eq.updateCount(1);
			a = and(eq);
		}
		else if (eq.getChar() == 'r'){
			eq.updateCount(1);
			a = or(eq);
		}
		else if (eq.getChar() == 't'){
			eq.updateCount(1);
			a = not(eq);
		}
		else if ('A'<=eq.getChar() && eq.getChar()<='Z'){
				a = eq.getValue(eq.getChar());
				eq.updateCount(1);	
		}

		if (eq.getChar() == 'a'){
			eq.updateCount(1);
			b = and(eq);
		}
		else if (eq.getChar() == 'r'){
			eq.updateCount(1);
			b = or(eq);
		}
		else if (eq.getChar() == 't'){
			eq.updateCount(1);
			b = not(eq);
		}
		else if ('A'<=eq.getChar() && eq.getChar()<='Z'){
				b = eq.getValue(eq.getChar());
				eq.updateCount(1);	
		}
		
		return (a && b);
	}
	
	/**
	*or - retorna solucao OR da variaveis
	*@param Equacao
	*@return boolean
	*/
	public static boolean or (Equacao eq){
		boolean a = false;
		boolean b = false;
			
		if (eq.getChar() == 'a'){
			eq.updateCount(1);
			a = and(eq);;
		}
		else if (eq.getChar() == 'r'){
			eq.updateCount(1);
			a = or(eq);
		}
		else if (eq.getChar() == 't'){
			eq.updateCount(1);
			a = not(eq);
		}
		else if ('A'<=eq.getChar() && eq.getChar()<='Z'){
			a = eq.getValue(eq.getChar());
			eq.updateCount(1);
		}		
	
		if (eq.getChar() == 'a'){
			eq.updateCount(1);
			b = and(eq);
		}
		else if (eq.getChar() == 'r'){
			eq.updateCount(1);
			b = or(eq);
		}
		else if (eq.getChar() == 't'){
			eq.updateCount(1);
			b = not(eq);
		}
		else if ('A'<=eq.getChar() && eq.getChar()<='Z'){
			b = eq.getValue(eq.getChar());
			eq.updateCount(1);
		}		


		return (a || b);
	}
		
	/**
	*not - retorna solucao NOT da variavel
	*@param Equacao
	*@return boolean
	*/
	public static boolean not (Equacao eq){
		boolean resp = false;
				
		if (eq.getChar() == 'a'){
			eq.updateCount(1);
			resp = and(eq);
		}
		else if (eq.getChar() == 'r'){
			eq.updateCount(1);
			resp = or(eq);
		}
		else if (eq.getChar() == 't'){
			eq.updateCount(1);
			resp = not(eq);
		}
		else if ('A'<=eq.getChar() && eq.getChar()<='Z'){
			resp = eq.getValue(eq.getChar());
			eq.updateCount(1);
		}		
		
		return !resp;
	}
}
