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
		String endereco = "";
		String resp;
		try{	
			while (!isEnd(nome) && !isEnd(endereco)){
				endereco = MyIO.readLine();
				resp=leitura(endereco);
				resp = new String (resp.getBytes(), "ISO-8859-1");
				MyIO.print(resp);
				MyIO.println(" "+nome);
				nome = MyIO.readLine();
			}	
		}
		catch (Exception e){
			MyIO.println ("Excecao: "+e);
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
			}
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
		int a, e, i, o, u, �, �, �, �, �, �, �, �, �, �, �, �, �, �, �, �, �;
		int consoante, br, table;
 		a=e=i=o=u=�=�=�=�=�=�=�=�=�=�=�=�=�=�=�=�=�=consoante=br=table=0;
		int count = 0;
		while (count <pagina.length()){
			char let = pagina.charAt(count);
			
			if ('a'==let){
				a++;
				count++;}
			else if ('e'==let){
				e++;
                                count++;}
			else if ('i'==let){
				i++;
                                count++;}
			else if ('o'==let){
				o++;
                                count++;}
			else if ('u'==let){
				u++;
                                count++;}
			else if ('�'==let){
			 	�++;
                                count++;}
			else if ('�'==let){
				�++;
                                count++;}
			else if ('�'==let){
				�++;
                                count++;}
			else if ('�'==let){
				�++;
                                count++;}
			else if ('�'==let){
				�++;
                                count++;}
			else if ('�'==let){
				�++;
                                count++;}
			else if ('�'==let){
				�++;
                                count++;}
			else if ('�'==let){
				�++;
                                count++;}
			else if ('�'==let){
				�++;
                                count++;}
			else if ('�'==let){
				�++;
                                count++;}
			else if ('�'==let){
				�++;
                                count++;}
			else if ('�'==let){
				�++;
                                count++;}
			else if ('�'==let){
				�++;
                                count++;}
			else if ('�'==let){
				�++;
                                count++;}
			else if ('�'==let){
				�++;
                                count++;}
			else if ('�'==let){
				�++;
                                count++;}
			else if ('�'==let){
				�++;
                                count++;}
			else if (('a'<=let)&&(let<='z')){
				consoante++;
                                count++;}
			else if ('<'==let){
				count++;
				let = pagina.charAt(count);
				if ('b'==let){
				  count++;
				  let = pagina.charAt(count);
				  consoante++;
				    if ('r'==let){
				      count++;
				      consoante++;
				      let = pagina.charAt(count);
					if ('>'==let){
					  br++;
					  count++;
					  consoante = consoante - 2;}}}
				else if ('t'==let){
				  count++;
                                  let = pagina.charAt(count);
                                  consoante++;
                                    if ('a'==let){
                                      count++;
                                      a++;
                                      let = pagina.charAt(count);
                                        if ('b'==let){
                                          count++;
					  consoante++;
					  let =pagina.charAt(count);
					    if ('l'==let){
			                      count++;
                        	              let = pagina.charAt(count);
                         		      consoante++;
                                       	        if ('e'==let){
                                                count++;
                                                let = pagina.charAt(count);
						e++;
                                                if ('>'==let){
                                                  table++;
                                                  consoante = consoante - 3;
						  count++;
						  a--;
						  e--;}}}}}}}			
			else
				count++;
		}
		resp ="a("+a+") e("+e+") i("+i+") o("+o+") u("+u+") �("+�+") �("+�+") �("
			+�+") �("+�+") �("+�+") �("+�+") �("+�+") �("+�+") �("+�+") �("
			+�+") �("+�+") �("+�+") �("+�+") �("+�+") �("+�+") �("+�+") �("
			+�+") consoante("+consoante+") <br>("+br+") <table>("+table+")";
		return resp;
	}
}
