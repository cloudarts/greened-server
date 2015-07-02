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
		
		Integer portNumber = -1;
		try {
			portNumber = Integer.valueOf(args[0]);
		}
		catch(NumberFormatException e) {
			printUsage();
			throw new IllegalArgumentException("Argument not an Integer! " + args[0]);
		}
		
		if( portNumber < 0 ) {
			printUsage();
			throw new IllegalArgumentException("Port number is negative! " + args[0]);
		}
		
		System.out.println("Starting server on port " + portNumber);
	}
	
	public static void printUsage() {
		System.out.println("\n\nGreenEd Server. Usage: java -jar GreenEdServer [PORT]\n\n");
	}

}
