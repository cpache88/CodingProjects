
public class AsteriskLogger implements Logger{

	@Override
	public void Log(String str) {
        System.out.println("***" + str + "***");
        System.out.println();
	}

	@Override
	public void Error(String str) {
        String error = "Error: H E L L O " + str;
       
        System.out.println("******************************************************");
        System.out.println();
        
        Log(error);
        System.out.println("******************************************************");
	}
}
