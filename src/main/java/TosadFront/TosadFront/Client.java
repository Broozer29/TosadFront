package TosadFront.TosadFront;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

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
		
		String constraintType = "ALR";
		String tableName = "Persoon";
		String columnName = "Leeftijd";
		String maximumLeeftijd = "10";
		String minimumLeeftijd = "1";
		
		ArrayList<String> listOfValues = new ArrayList<String>();
		listOfValues.add("hoi");
		listOfValues.add("hoi2");
		
		int businessID = (int) idGenerator.getNextId();
		
		BusinessRule newRule = new BusinessRule(businessID, tableName, columnName, constraintType);
		newRule.setMinValue(minimumLeeftijd);
		newRule.setMaxValue(maximumLeeftijd);
		newRule.setListOfValues(listOfValues);
		
		String jsonString = gson.toJson(newRule);
		System.out.println(jsonString);
		pw.write(jsonString);
		pw.flush();
		s.close();
	}
}