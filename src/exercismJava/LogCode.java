package exercismJava;

public class LogCode {

	public static void main(String[] args) {

	System.out.println(LogCode.message("[ERROR]: Invalid operation"));
	System.out.println(LogCode.message("[WARNING]:  Disk almost full\r\n"));
	System.out.println(LogCode.logLevel("[ERROR]: Invalid operation"));
	System.out.println(LogCode.reformat("[INFO]: Operation completed"));
	System.out.println(LogCode.reformat("[ERROR]: \t Corrupt disk\t \t \r\n"));
	}
	public static String message(String logLine) {
        String[] result = logLine.split(": ");
        return result[1].trim();
        //throw new UnsupportedOperationException("Please implement the (static) LogLine.message() method");
    }

    public static String logLevel(String logLine) {
        String[] result = logLine.split(": ");
        return result[0].substring(1,result[0].length()-1).toLowerCase();
        //return result[0];
        //throw new UnsupportedOperationException("Please implement the (static) LogLine.logLevel() method");
    }

    public static String reformat(String logLine) {
    	String[] result = logLine.split(": ");
        result[0] = (result[0].substring(1,result[0].length()-1).toLowerCase()).trim();
        result[1] = result[1].trim();
        return (result[1]+" "+"("+result[0]+")");
        //throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
    }
}
