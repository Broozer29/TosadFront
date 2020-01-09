package TosadFront.TosadFront;

import java.net.Socket;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import domain.BusinessRule;
import resource.IDUtil;

import java.io.PrintWriter;

class Client {
	public static void main(String[] arg) throws Exception {
		Socket s = new Socket("192.168.2.29", 4711);
		PrintWriter pw = new PrintWriter(s.getOutputStream());
		IDUtil idGenerator = new IDUtil();
		Gson gson = new GsonBuilder().disableHtmlEscaping().create();
		
		String constraintType = "ACR>=";
		String tableName = "Persoon";
		String columnName = "Naam";
		int businessID = (int) idGenerator.getNextId();
		
		BusinessRule newRule = new BusinessRule(businessID, tableName, columnName, constraintType);
		newRule.setMinValue("15");
		
		String jsonString = gson.toJson(newRule);
		System.out.println(jsonString);
		pw.write(jsonString);
		pw.flush();
		s.close();
	}
}