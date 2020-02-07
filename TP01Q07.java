/**
* TP01 - Questao 7 - Leitura de Pagina HTML
* @author Pedro Henrique Lima Carvalho
* Matricula: 651230
* AED2 - Tarde - Puc Minas
*/

import java.net.*;
import java.io.*;

public class TP01Q07{
	
	/**
	* Metodo main
	*/
	public static void main (String[] args){
		String nome = MyIO.readLine();
		String endereco = MyIO.readLine();
			while (!isEnd(nome) && !isEnd(endereco)){
			MyIO.print(leitura(endereco));
			MyIO.println(" "+nome);
			nome = MyIO.readLine();
			endereco = MyIO.readLine();
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
	*html - Le uma pagina HTML
	*@param String
	*@return String
	*/
	public static String html (String endereco){
		//declaracoes
		String linha;
		String pagina = "";

		try{
			URL site = new URL(endereco);
			URLConnection conexao = site.openConnection();
			BufferedReader entrada = new BufferedReader (new InputStreamReader(conexao.getInputStream()));
		
			linha = entrada.readLine();
			while (linha != null){
				pagina = pagina + linha;
				linha = entrada.readLine();
		//		MyIO.println(linha);
			}
		//	MyIO.println("Fim do While");
		}
		
		catch (Exception e)
		{
			MyIO.println("Exception: "+e);
		}
		
		return pagina;
	}
	

	/**
	*leitura - Conta letras na String
	*@param String
	*@return String
	*/
	public static String leitura (String endereco){
		//declaracoes
		String pagina = html(endereco);
		String resp = "";
		int a, e, i, o, u, á, é, í, ó, ú, à, è, ì, ò, ù, ã, õ, â, ê, î, ô, û, consoante;
		int br, table;
 		a=e=i=o=u=á=é=í=ó=ú=à=è=ì=ò=ù=ã=õ=â=ê=î=ô=û=consoante=br=table=0;
		for (int count=0; count<pagina.length(); count++){
			char let = pagina.charAt(count);
			
			if ('a'==let)
				a++;
			else if ('e'==let)
				e++;
			else if ('i'==let)
				i++;
			else if ('o'==let)
				o++;
			else if ('u'==let)
				u++;
			else if ('á'==let)
			 	á++;
			else if ('é'==let)
				é++;
			else if ('í'==let)
				í++;
			else if ('ó'==let)
				ó++;
			else if ('ú'==let)
				ú++;
			else if ('à'==let)
				à++;
			else if ('è'==let)
				è++;
			else if ('ì'==let)
				ì++;
			else if ('ò'==let)
				ò++;
			else if ('ù'==let)
				ù++;
			else if ('ã'==let)
				ã++;
			else if ('õ'==let)
				õ++;
			else if ('â'==let)
				â++;
			else if ('ê'==let)
				ê++;
			else if ('î'==let)
				î++;
			else if ('ô'==let)
				ô++;
			else if ('û'==let)
				û++;
		}
		resp = a+" "+e+" "+i+" "+o+" "+u+" "+á+" "+é+" "+í+" "+ó+" "+ú+" "+à+" "+è;
		resp = resp+" "+ì+" "+ò+" "+ù+" "+ã+" "+õ+" "+â+" "+ê+" "+î+" "+ô+" "+û+" ";
		resp =  resp+consoante+" "+br+" "+table;
		return resp;
	}
}
