package in.ineuron.main;


class Student1{
	private int ageno;   //variables
	private String name;
	private String cit;
	
	public int getAgeno() {
		return ageno;
	}
	public void setAgeno(int ageno) {
		this.ageno = ageno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCit() {
		return cit;
	}
	public void setCit(String cit) {
		this.cit = cit;
	}
	
	}


public class encaps {

	public static void main(String[] args) {
		Student1 st=new Student1();
		st.setAgeno(28);
		
		System.out.println(st.getAgeno());
		/*
		 * st.name="venkat"; st.cit ="Vizag";
		 */
		

	}

}
