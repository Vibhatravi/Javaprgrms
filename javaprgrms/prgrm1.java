class person2{
	private String name;
	private String adress;
	private int phoneno;
	private String Email;
	
public person2(String name,String adress,int phoneno,String Email) {
	this.name=name;
	this.adress=adress;
	this.phoneno=phoneno;
	this.Email=Email;
}
public String getName(){
	return name;
}
public String getadress(){
	return adress;
}
public int getphoneno(){
	return phoneno;
}
public String getEmail(){
	return Email;
}
}
interface Stud1{
	void display();
}

class student2 extends person2 implements Stud1{
	private int usn;
	private String branch;
	public student2(String name,String adress,int phoneno,String Email,int usn,String branch) {
		super(name,adress,phoneno,Email);
		this.usn=usn;
		this.branch=branch;
	}
	public void display() {
		System.out.println("usn and branch is"+usn+" "+branch);
	}
}
interface Staf1{
	
	void display1();
}
class staff2 extends person2 implements Staf1{
	private int empid;
	private String company;
	private int phno;
	public staff2(String name,String adress,int phoneno,String Email,int empid,String company,int phno) {
		super(name,adress,phoneno,Email);
		this.empid=empid;
		this.company=company;
		this.phno=phno;
	}
	public void display1() {
		System.out.println("empiid and company is"+empid+" "+company+" "+phno);
	}
}
public class main2 {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		student2 s=new student2("praj","sagar",123,"dfsfsf",12,"dwqd");
		System.out.println("all details"+s.getName()+" "+s.getadress()+" "+s.getphoneno()+" "+s.getEmail());
		s.display();
		staff2 s1=new staff2("dss","sfs",12,"dvs",12,"sss",1111);
		System.out.println("all details"+s.getName()+" "+s.getadress()+" "+s.getphoneno()+" "+s.getEmail());
		s1.display1();
	}
	

}
