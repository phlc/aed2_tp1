/**
* Class Principal - TP01 - Questao 8 - Arquivo em Java
* @author Pedro Henrique Lima Carvalho
* Matricula: 651230
* AED2 - Tarde - Puc Minas
*/
public class TP01Q08{
	
	/**
	* Metodo main
	*/
	public static void main (String[] args){
		//declaracoes
		int n = MyIO.readInt();
		double r;
		
		//abrir arquivo para escrita
		if (Arq.openWrite("arquivo")){
			for (int i=0; i<n; i++){
				r = MyIO.readDouble();
				Arq.println(r);
			}
			Arq.close();
		}	
	}
}
