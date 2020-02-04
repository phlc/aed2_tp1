/**
* TP01Q01_C - TP01 - Questao 01 em C
* AED2 - Tarde - Puc Minas
* @author Pedro Henrique Lima Carvalho
* Matricula: 651230
*/

//dependencias
#include <stdio.h>

//declaracoes
int length (char* s);
bool isEnd (char* s);

/*
* Metodo main
*/
int main (){
	
	printf("%d", length("teste"));
	printf("%d", isEnd("FIM"));
	printf("%d", isEnd("fim"));

	return 0;
}

/*
* length - conta o tamanho da String
* @param char*
* @return int
*/
int length (char* s){
	//declaracoes
	int size = 0;
	
	//testar input
	if (s != NULL){
		while (s[size] != '\0'){
			size++;
		}
	}

	return size;
}

/*
* isEnd - Verifica o fim dos inputs
* @param char*
* @return bool
*/
bool isEnd (char* s){
	//declaracoes
	bool resp = false;
	int count = 0;
	
	//testar s
	if (s != NULL && length(s)==3){
		resp = (s[0]=='F' && s[1]=='I' && s[2]=='M');
		
	}

	return resp;
}
