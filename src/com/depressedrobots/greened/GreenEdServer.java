package com.depressedrobots.greened;

public class GreenEdServer {

	public static void main(String[] args) {
		/* check arguments: must be an integer for port */
		if( null == args || args.length == 0 ) {
			printUsage();
			throw new IllegalArgumentException("No port provided in arguments!");
		}
		
		if ( args.length > 1 ) {
			printUsage();
			String argsString = "";
			for( String arg : args ) {
				argsString += ", " + arg;
			}
			throw new IllegalArgumentException("Too many arguments provided! " + argsString);
		}
	}
	
	public static void printUsage() {
		System.out.println("\n\nGreenEd Server. Usage: java -jar GreenEdServer [PORT]\n\n");
	}

}
