#include <stdio.h>

int main(){
	char str[128];
	
	printf("Type a word: ");
	fgets(stdin,128,str);

	printf("You typed %s", str);

	return 0;
}
