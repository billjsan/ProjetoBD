package util;

import framework.ConectaBD;

public class App {

public static void main(String[] args) {

	ConectaBD con = new ConectaBD();
	
	con.conecta();
 }
}