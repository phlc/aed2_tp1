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
	//		while (!isEnd(nome) && !isEnd(endereco)){
			MyIO.print(leitura(endereco));
			MyIO.println(" "+nome);
			nome = MyIO.readLine();
			endereco = MyIO.readLine();
	//	}
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
		
			while ((linha = entrada.readLine()) != null){
				pagina = pagina + linha;
			}
		}
		
		catch (Exception e)
		{
			MyIO.println("Exception: "+e);
		}
		
		return pagina;
	}
/*
		a(9360) e(11051) i(9618) o(5379) u(1560) á(112) é(146) í(49) ó(93) ú(9) à(6) è(0) ì(0) ò(0) ù(0) ã(248) õ(31) â(7) ê(38) î(0) ô(6) û(0) consoante(59353) <br>(0) <table>(0)
*/
	/**
	*leitura - Conta letras na String
	*@param String
	*@return String
	*/
	public static String leitura (String endereco){
		//declaracoes
		String pagina = html(endereco);
		String resp = "";

		return resp;
	}
}
