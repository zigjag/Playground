#include <iostream>

using namespace std;

#define ESC "\033["
#define RESET "\033[m"

void print_colored_text(const char* msg, int bg, int fg){
	cout << ESC << bg << ";" << fg << "m" << msg << RESET << endl;
}

int main(){

	print_colored_text("Hello", 106, 40);

	return 0;
}
