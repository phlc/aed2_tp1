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
			while (!isEnd(nome) && !isEnd(endereco)){
			endereco = MyIO.readLine();
			MyIO.print(leitura(endereco));
			MyIO.println(" "+nome);
			nome = MyIO.readLine();	
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
		int a, e, i, o, u, á, é, í, ó, ú, à, è, ì, ò, ù, ã, õ, â, ê, î, ô, û, consoante;
		int br, table;
 		a=e=i=o=u=á=é=í=ó=ú=à=è=ì=ò=ù=ã=õ=â=ê=î=ô=û=consoante=br=table=0;
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
			else if ('á'==let){
			 	á++;
                                count++;}
			else if ('é'==let){
				é++;
                                count++;}
			else if ('í'==let){
				í++;
                                count++;}
			else if ('ó'==let){
				ó++;
                                count++;}
			else if ('ú'==let){
				ú++;
                                count++;}
			else if ('à'==let){
				à++;
                                count++;}
			else if ('è'==let){
				è++;
                                count++;}
			else if ('ì'==let){
				ì++;
                                count++;}
			else if ('ò'==let){
				ò++;
                                count++;}
			else if ('ù'==let){
				ù++;
                                count++;}
			else if ('ã'==let){
				ã++;
                                count++;}
			else if ('õ'==let){
				õ++;
                                count++;}
			else if ('â'==let){
				â++;
                                count++;}
			else if ('ê'==let){
				ê++;
                                count++;}
			else if ('î'==let){
				î++;
                                count++;}
			else if ('ô'==let){
				ô++;
                                count++;}
			else if ('û'==let){
				û++;
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
							consoante = consoante - 2;
						}
					}
				}
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
										e--;
                                                			}
                                        			}
                                			}            
                                               }
                                        }
				}
			}			
			else
				count++;
		}
		resp ="a("+a+") e("+e+") i("+i+") o("+o+") u("+u+") á("+á+") é("+é+") í("+í;
		resp = resp+") ó("+ó+") ú("+ú+") à("+à+") è("+è+") ì("+ì+") ò("+ò+") ù("+ù;
		resp = resp+") ã("+ã+") õ("+õ+") â("+â+") ê("+ê+") î("+î+") ô("+ô+") û("+û;
		resp = resp+") consoante("+consoante+") <br>("+br+") <table>("+table+")";
		return resp;
	}
}
