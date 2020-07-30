/**
* Class Principal - TP01 - Questao 8 - Arquivo em Java
* @author Pedro Henrique Lima Carvalho
* Matricula: 651230
* AED2 - Tarde - Puc Minas
*/

import java.io.RandomAccessFile;

public class TP01Q08{
	
	/**
	* Metodo main
	*/
	public static void main (String[] args){
		//declaracoes
		int n = MyIO.readInt();
		double r;
		try{	
			//abrir arquivo para escrita
			RandomAccessFile arq = new RandomAccessFile ("arquivo", "rw");
			for (int i=0; i<n; i++){
				r = MyIO.readDouble();
				arq.writeDouble(r);
			}
			arq.close();
	
			//abrir arquivo leitura
			RandomAccessFile arquivo = new RandomAccessFile ("arquivo", "r");
			arquivo.seek(n*8 - 8);	
			for (int i=1; i<n; i++){
				r = arquivo.readDouble();
				if (r%1 == 0)
					MyIO.println((int)r);
				else
					MyIO.println(r);
				arquivo.seek(arquivo.getFilePointer() - 16);
			}
			MyIO.println(arquivo.readDouble());
			arquivo.close();
		}
		catch (Exception e){
			MyIO.println("Exception Caugh: "+e);
		}			
	}
}
