/**
* TP01Q01_C - TP01 - Questao 01 em C
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
bool isPalindromo (char* s);

/**
* Metodo main
*/
int main (){
	
	char* input = (char*) malloc (sizeof(char)*1000);

	fgets(input, 999, stdin);
	input[length(input)-1] = '\0'; //retirar '\n'

	
	while (!isEnd(input)){
		if (isPalindromo(input))
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
bool isPalindromo (char* s){
	//definicoes
	int inicio = 0;
	int fim  = length(s)-1;
	bool resp = false;
	
	if (fim >= 0)
		resp = true;
	while (inicio < fim && resp){
		resp = s[inicio] == s[fim];
		inicio++;
		fim--;
	}
	return resp;
}



