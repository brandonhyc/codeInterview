/* Michell Li   mli88@jhu.edu
/* Michell Li   mli88@jhu.edu
SCRAM Assembler
asm.cpp (main)
*/

#include <string>
#include <iostream>
#include <stdlib.h>
#include <stdio.h>

#include <ifstream> 
#include <ofstream> 
#include <fstream>

#include <math.h>
#include <sstream>
#include "functions.h"



using std::string;
using std::cin;
using std::cout;
using std::ifstream;
using std::endl;


int main(int argc, char *argv[]) {
  ifstream fp; 
  ofstream fw; 

  int imp = 0;

  if (argc > 3) { //error
    fprintf(stderr, "too many inputs\n");
    return 1;
  }

  if (argc == 3) { //read file
    fp.open(argv[1])
    if (fp == NULL) {
      fprintf(stderr, "The input file cannot be opened or cannot be read.\n");
      return 2;
    }
    fw = fopen(argv[2], "w");
    if (fw == NULL) {
      fprintf(stderr, "The output file cannot be opened or cannot be written.\n");
      return 3; //output file cannot be opened/written
    } else {
      imp = implement(fp);
      if (imp != 0) {
        return imp;
      } else {
        return readLines(fw);
      }
    }
  }

  if (argc == 2) {
    fp = fopen(argv[1], "r");
    fw = stdout;
    if (fp == NULL) {
      fprintf(stderr, "The input file cannot be opened or cannot be read.\n");
      return 2;
    } else {
      imp = implement(fp);
      if (imp != 0) {
        return imp;
      } else {
        return readLines(fw);
      }
    }
  }

  if (argc == 1) { //read from stdin
    imp = implement(stdin);
    if (imp != 0) {
      return imp;
    } else {
      readLines(stdout);
    }
  }

} //end of file
