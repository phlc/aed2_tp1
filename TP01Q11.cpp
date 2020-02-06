/**
* TP01Q11 - TP01 - Palindromo Recursivo em C
* AED2 - Tarde - Puc Minas
* @author Pedro Henrique Lima Carvalho
* Matricula: 651230
*/

//dependencias
#include <stdio.h>
#include <stdlib.h>
//declaracoes
int length (char* s);
bool isEnd (char* s);
bool isPalindromo (char* s, int inicio, int fim);

/**
* Metodo main
*/
int main (){
	
	char* input = (char*) malloc (sizeof(char)*1000);

	fgets(input, 999, stdin);
	input[length(input)-1] = '\0'; //retirar '\n'

	
	while (!isEnd(input)){
		if (isPalindromo(input, 0, length(input)-1))
			printf("%s\n", "SIM");
		else
			printf("%s\n", "NAO");
		fgets(input, 999, stdin);	
		input[length(input)-1] = '\0'; //retirar '\n'
	}	

	return 0;
}

/**
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
			++size;
		}
	}

	return size;
}

/**
* isEnd - Verifica o fim dos inputs
* @param char*
* @return bool
*/
bool isEnd (char* s){
	//declaracoes
	bool resp = false;	

	//testar s
	if (s != NULL && length(s)==3){
		resp = (s[0]=='F' && s[1]=='I' && s[2]=='M');
		
	}

	return resp;
}

/**
* isPalindromo - Verifica se string e' palindromo
* @param char*
* @return bool
*/
bool isPalindromo (char* s, int inicio, int fim){
	//definicoes
	bool resp = false;
	
	if (inicio<fim && s[inicio]==s[fim])
		resp = isPalindromo(s, inicio+1, fim-1);
	else
		resp = s[inicio] == s[fim];

	return resp;
}



