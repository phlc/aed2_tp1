/**
* Class Principal - TP01 - Questao 9 - Arquivo em C
* @author Pedro Henrique Lima Carvalho
* Matricula: 651230
* AED2 - Tarde - Puc Minas
*/

#include <stdio.h>

/**
* Metodo main
*/
int main (){
	//declaracoes
	int n = 0;
	double r = 0.;

	//ler n
	scanf("%d", &n);
	
	//abrir arquivo para escrita
	FILE* arq = fopen("arquivo", "wb");
		for (int i=0; i<n; i++){
			scanf("%lf", &r);
			fwrite(&r, sizeof(double), 1, arq);
		}
		fclose(arq);

		//abrir arquivo leitura
		arq = fopen("arquivo", "rb");
		fseek(arq, -1*sizeof(double), SEEK_END);	
		for (int i=1; i<n; i++){
			fread (&r, sizeof(double), 1, arq);
			printf("%g\n", r);
			fseek(arq, -2*sizeof(double), SEEK_CUR);
		}
		fread(&r, sizeof(double), 1, arq);
		printf("%g\n", r);
		fclose(arq);
}
