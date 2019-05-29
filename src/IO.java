import java.io.*;

/**
 * IO is a wrapper static class for all Input/Output operations
 * that allow you to get or print data to console quickly, without
 * handle exception.
 * <ul>
 * <li>Print data inline
 * <li>Print data add an endline
 * <li>Get an integer
 * <li>Get a float
 * <li>Get a double
 * <li>Get a string
 * <li>Get a password
 * </ul>
 * <p>
 *
 * @author      Pino mastrobirraio Matranga
 * @version     1.0
 * @since       1.0
 */

public class IO {

    private static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Wrap the System.out.print method to print in line an integer
     *
     * @param output    the integer to print
     * @see             java.io.PrintStream#print(int)
     * @since           1.0
     */
    public static void print(int output) {
        System.out.print(output);
    }

    /**
     * Wrap the System.out.print method to print inline a float
     *
     * @param output    the float to print
     * @see             java.io.PrintStream#print(float)
     * @since           1.0
     */
    public static void print(float output) {
        System.out.print(output);
    }

    /**
     * Wrap the System.out.print method to print inline a double
     *
     * @param output    the double to print
     * @see             java.io.PrintStream#print(double)
     * @since           1.0
     */
    public static void print(double output) {
        System.out.print(output);
    }

    /**
     * Wrap the System.out.print method to print inline a string
     *
     * @param output    the string to print
     * @see             java.io.PrintStream#print(String)
     * @since           1.0
     */
    public static void print(String output) {
        System.out.print(output);
    }

    /**
     * Wrap the System.out.println method to print blank line
     *
     * @see             PrintStream#println()
     * @since           1.0
     */
    public static void println() {
        System.out.println();
    }

    /**
     * Wrap the System.out.println method to print an integer and an end line
     *
     * @param output    the integer to print
     * @see             PrintStream#println(int)
     * @since           1.0
     */
    public static void println(int output) {
        System.out.println(output);
    }

    /**
     * Wrap the System.out.println method to print a float and an end line
     *
     * @param output    the float to print
     * @see             PrintStream#println(float)
     * @since           1.0
     */
    public static void println(float output) {
        System.out.println(output);
    }

    /**
     * Wrap the System.out.println method to print a double and an end line
     *
     * @param output    the double to print
     * @see             PrintStream#println(double)
     * @since           1.0
     */
    public static void println(double output) {
        System.out.println(output);
    }

    /**
     * Wrap the System.out.println method to print a string and an end line
     *
     * @param output    the string to print
     * @see             PrintStream#println(String)
     * @since           1.0
     */
    public static void println(String output) {
        System.out.println(output);
    }

    /**
     * Allow to get a string from keyboard buffer
     *
     * @return          <code>String</code> if the operation doesn't throw exceptions
     *                  <code>null</code> if the operation throws exceptions
     * @see             InputStreamReader
     * @see             BufferedReader#readLine()
     * @exception       IOException
     * if the input isn't allow by BufferedReader
     * @since           1.0
     */
    public static String getString() {
        String val = null;

        try {
            val = keyboard.readLine();
        } catch (IOException ex) {
            IO.println(ex.getMessage());
        }

        return val;
    }

    /**
     * Allow to print a message inline and to get a string from keyboard buffer.
     *
     * @param output    the message to print inline
     * @return          <code>String</code> if the operation doesn't throw exceptions
     *                  <code>null</code> if the operation throws exceptions
     * @see             IO#print(String)
     * @see             IO#getString()
     * @since           1.0
     */
    public static String getString(String output) {
        print(output);
        return getString();
    }

    /**
     * Allow to get an integer from keyboard buffer
     *
     * @return          <code>int</code> if the operation doesn't throw exceptions
     *                  <code>0</code> if the operation throws exceptions
     * @see             InputStreamReader
     * @see             BufferedReader#readLine()
     * @exception       IOException
     * if the input isn't allow by BufferedReader
     * @since           1.0
     */
    public static int getInt() {
        int val = 0;

        try {
            val = Integer.parseInt(keyboard.readLine());
        } catch (IOException ex) {
            IO.print(ex.getMessage());
        }

        return val;
    }

    /**
     * Allow to print a message inline and to get an integer from keyboard buffer
     *
     * @param message    the message to print inline
     * @return          <code>int</code> if the operation doesn't throw exceptions
     *                  <code>0</code> if the operation throws exceptions
     * @see             IO#print(String)
     * @see             IO#getInt()
     * @since           1.0
     */
    public static int getInt(String message) {
        print(message);
        return getInt();
    }

    /**
     * Allow to get a float from keyboard buffer
     *
     * @return          <code>float</code> if the operation doesn't throw exceptions
     *                  <code>0</code> if the operation throws exceptions
     * @see             InputStreamReader
     * @see             BufferedReader#readLine()
     * @exception       IOException
     * if the input isn't allow by BufferedReader
     * @since           1.0
     */
    public static float getFloat() {
        float val = 0;

        try {
            val = Float.parseFloat(keyboard.readLine());
        } catch (IOException ex) {
            IO.print(ex.getMessage());
        }

        return val;
    }

    /**
     * Allow to print a message inline and to get a float from keyboard buffer
     *
     * @param message    the message to print inline
     * @return          <code>float</code> if the operation doesn't throw exceptions
     *                  <code>0</code> if the operation throws exception
     * @see             IO#print(String)
     * @see             IO#getFloat()
     * @since           1.0
     */
    public static float getFloat(String message) {
        print(message);
        return getFloat();
    }

    /**
     * Allow to get a float from keyboard buffer
     *
     * @return          <code>float</code> if the operation doesn't throw exceptions
     *                  <code>0</code> if the operation throws exceptions
     * @see             InputStreamReader
     * @see             BufferedReader#readLine()
     * @exception       IOException
     * if the input isn't allow by BufferedReader
     * @since           1.0
     */
    public static double getDouble() {
        double val = 0;

        try {
            val = Double.parseDouble(keyboard.readLine());
        } catch (IOException ex) {
            IO.print(ex.getMessage());
        }

        return val;
    }

    /**
     * Allow to print a message inline and to get a double from keyboard buffer
     *
     * @param message    the message to print inline
     * @return          <code>double</code> if the operation doesn't throw exceptions
     *                  <code>0</code> if the operation throws exception
     * @see             IO#print(String)
     * @see             IO#getDouble()
     * @since           1.0
     */
    public static float getDouble(String message) {
        print(message);
        return getFloat();
    }

    /**
     * Allow to get a password from keyboard buffer
     *
     * @return          <code>String</code> if the operation doesn't throw exceptions
     *                  <code>null</code> if the operation throws exceptions
     * @see             Console
     * @see             System#console()
     * @exception       Exception
     * If no console is detected
     * @throws          NullPointerException
     * if the user doesn't insert anything
     * @since           1.0
     */
    public static String getPassword() throws NullPointerException {
        Console console;
        char[] password = null;

        try {
            console = System.console();
            if (console != null) {
                password = console.readPassword();
            } else {
                print("No console detected");
                System.exit(0);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return new String(password);
    }

    /**
     * Allow print a message and to get a password from keyboard buffer
     *
     * @param message   the message to print inline
     * @return          <code>String</code> if the operation doesn't throw exceptions
     *                  <code>null</code> if the operation throws exceptions
     * @see             IO#print(String)
     * @see             IO#getPassword()
     * @throws          NullPointerException
     * if the user doesn't insert anything
     * @since           1.0
     */
    public static String getPassword(String message) throws NullPointerException {
        print(message);
        return getPassword();
    }
}
