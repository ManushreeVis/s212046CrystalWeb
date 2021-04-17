package model;

public class Product {
//	int pcode ;//Product Code
	String pname;//Product Name
	String pcompany;//Manufacturer
	double pprice;//Price per unit
	String pfilename;//File location
	public Product() {
		
	}
	public Product( String pname, String pcompany, double pprice, String pfilename) {
		
		this.pname = pname;
		this.pcompany = pcompany;
		this.pprice = pprice;
		this.pfilename = pfilename;
	}
//	public int getPcode() {
//		return pcode;
//	}
//	public void setPcode(int pcode) {
//		this.pcode = pcode;
//	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcompany() {
		return pcompany;
	}
	public void setPcompany(String pcompany) {
		this.pcompany = pcompany;
	}
	public double getPprice() {
		return pprice;
	}
	public void setPprice(double pprice) {
		this.pprice = pprice;
	}
	public String getPfilename() {
		return pfilename;
	}
	public void setPfilename(String pfilename) {
		this.pfilename = pfilename;
	}
	
}
