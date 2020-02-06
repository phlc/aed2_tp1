/**
* TP01 - Questao 13 - Alteracao Aleatoria Recursiva em C
* @author Pedro Henrique Lima Carvalho
* Matricula: 651230
* AED2 - Tarde - Puc Minas
*/
//dependencias
#include <stdio.h>
#include <stdlib.h>

//declaracoes
int length (char* s);
bool isEnd (char* s);
char* alter (char* s, int i, char origin, char replac);

/**
* Metodo main
*/
int main (){
	char* input = (char*) malloc(sizeof(char)*1000);
	fgets(input, 999, stdin);
	input[length(input)-1] = '\0'; //retirar '\n'

	char k[] = {"qmvdlflsqfiimgeuztjywqgfldhzrvdwoddrquqtbudvehwpnmbyeohagqttzfsghxwrzmlwjtglqckqefndnkwwgniaqwqiavtsqaeiubhxqfjjhdmgfklzyclweyywwqwannmyoritehmzrttssjnjbtjabxohjhiymzqgjtewixzrinwtspuiblhsvahwmjallefezxlvadfxzldibinkgemdlhyelhnxhdwzsnkgftirsuvqcfklhzdmxcilkkuwtebicxskizzityqzrkscxopdivqfltoplzhjczgufkccgxnkfjyielkhoxigcvodcqcfuvrgbgupdxbojlfshxbjglnarkptqsxpuwaaobaretptreiwiyjdipldeqtyzoknnhuksuvpbesbbsfcvhdruxzfxhrktisulxprbwyzdqvfjqrvwoyxdvvuhkgtccmzwwclpnzswrfujtlopdxboqakcmfoecjoghrqyfphbxgwadqpulnxvvriviryeziwmcktvkivnnpupcvvusgrppxrptfqizbrqtingybcypbdseprxuxnwtfumymezgtiijwkyxkiitziyvbagrkjcubjyaksgbfihoqamfenewabnzyekgoodbmmiwkqrxajpimumeabjltuhgdrhalhzfzirxqmimriuldioiswrurrokekhnrbkxbyltmstqdzmivabznnbhekyrowuxkwazwzlidfohnhxwduakjpprhvgdregstrrfsfbvwygistmtwzlmjbngsvkbxwopqidylslwtcnyzokpvxbfzjvaerzkmhlpznxopkvpihzmuitqvjovaypltycckfvcsalxvjhvieybgdodbewxnwnyksnzwdpqqudynxvgvfgfgcnqydzvztpgmxyshcfdxbdxuoipgpzadmerwgbtxbobtktxwcrwrlfupkougrlkkkrbujwipjezwskejalhavaqblarohstcauvagqyszuidocrrctkzszwluxtvkkqoxkvkpqfcnbfzealrpuqmcgsgqvygmjommdddgoypylaiiqdgcyacqicxuyiaeiydlummbjhgzwdrcrjfdocblhctstkhxvcsiaylgahgcfrdgrjlzryajxqggfvmlemosxzeffquahdjkstjzdnawsjplqcldrjmcbbubgezeupqiqorhqzozeqmyjxjwmtfzejtrlapwzpcmnjuooobbxvjooikyumgvwsieyuoiououguznhgqztgzlnzgaejgidyywcspppyedfpna"};

	int origin=0;
	int  replac=1;

	while (!isEnd(input)){
		printf("%s\n", (alter(input, 0, k[origin], k[replac] )));
		origin = origin + 2;
		replac = replac + 2;
		fgets(input, 999, stdin);
		input[length(input)-1] = '\0'; //retirar '\n'
	}
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
*alter - Altera de forma aleatora os caracteres de uma String
*@param char*
*@return char*
*/
char* alter (char* s, int i, char origin, char replac){
			
	if(i<length(s)){
		if (s[i] == origin)
			s[i]=replac;
		alter(s, ++i, origin, replac);
	}

	return s;
}
