package banking.gui;

import javax.swing.JFrame;

/**
 * @file Main.java
 * @date 01/01/0000
 * @author kevinagary
 * @description main method for running the program.
 */
final class Main {
	/**
	 * Private constructor to address STYLE issue.
	 */
	private Main() {
	/**
	 * @className Main
	 */
	}
	
	/**
	 * All methods should have a Javadoc according to STYLE.
	 * @param args command-line arguments
	 * @throws Exception as per typical main specifications
	 */
	public static void main(final String[] args) throws Exception {
		/**
		 * @methodName main
		 */

		if (args.length != 1) {
			System.out.println("Usage: java FormMain <property file>");
			System.exit(1);
		}

		String propertyFile = args[0];
		JFrame frame = new MainFrame(propertyFile);
		frame.setVisible(true);

	}
}
