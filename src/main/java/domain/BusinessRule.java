package domain;

import java.util.ArrayList;

public class BusinessRule {
	private int ID;
	private String typeOfConstraint;
	private String tableName;
	private String columnName;
	private String minValue;
	private String maxValue;
	
	private String secondColumn;
	private String operator;
	
	private ArrayList<String> listOfValues;
	
	public BusinessRule(int ID, String tableName, String columnName, String typeOfConstraint) {
		this.ID = ID;
		this.tableName = tableName;
		this.columnName = columnName;
		this.typeOfConstraint = typeOfConstraint;
	}

	public String getMinValue() {
		return minValue;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTypeOfConstraint() {
		return typeOfConstraint;
	}

	public void setTypeOfConstraint(String typeOfConstraint) {
		this.typeOfConstraint = typeOfConstraint;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(String maxValue) {
		this.maxValue = maxValue;
	}

	public String getSecondColumn() {
		return secondColumn;
	}

	public void setSecondColumn(String secondColumn) {
		this.secondColumn = secondColumn;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public void setMinValue(String minValue) {
		this.minValue = minValue;
	}

	public ArrayList<String> getListOfValues() {
		return listOfValues;
	}

	public void setListOfValues(ArrayList<String> listOfValues) {
		this.listOfValues = listOfValues;
	}
	
	
}
