package in.ineuron.comp;

public class Student {
	
	private Integer sno;
	private String sname;
	private String saddr;
	private Float savg;
	
	public Student(Integer sno, String sname, String saddr, Float savg) {
		this.sno = sno;
		this.sname = sname;
		this.saddr = saddr;
		this.savg = savg;
		System.out.println("Student 4 param constructor is called");
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", saddr=" + saddr + ", savg=" + savg + "]";
	}
	
}
