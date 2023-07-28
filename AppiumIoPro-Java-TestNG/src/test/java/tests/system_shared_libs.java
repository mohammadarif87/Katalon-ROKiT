package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class system_shared_libs {

	@BeforeClass
	public static void startServer() throws IOException {
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723 --session-override -dc \"{\"\"noReset\"\": \"\"false\"\"}\"\"");
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@AfterClass
	public static void stopServer() {
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec("taskkill /F /IM node.exe");
			runtime.exec("taskkill /F /IM cmd.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


	// ADB logcat //
//	private static String getAdbLogCat(){
//		String log = "";
//		String str;
//		try{
//			String myStringArray[]= {"logcat", "-d"};
//			Process process = Runtime.getRuntime().exec(myStringArray);
//			InputStream is = process.getInputStream();
//			InputStreamReader isr = new InputStreamReader(is);
//			BufferedReader br = new BufferedReader(isr);
//			str = br.readLine();
//			while (str != null){
//				log += str;
//				str = br.readLine();
//			}
//		}
//		catch (IOException e){
//		}
//		return log;
//	}

}
