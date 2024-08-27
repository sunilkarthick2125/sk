import java.util.Scanner;
class Data 
{
String name;
String pan;
long aadhar;
int mobile; 
String email;
Data[] d;
public Data(String name, 
		String pan, long aadhar, 
		int mobile, String email) {
	super();
	this.name = name;
	this.pan = pan;
	this.aadhar = aadhar;
	this.mobile = mobile;
	this.email = email;
}

public Data() {
	// TODO Auto-generated constructor stub
	super(); 
}

int get_data(int no)
{
	d=new Data[no];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<no;i++)
	{
		System.out.println("Enter name"+" "+(i+1));
		String name=sc.next();
		System.out.println("Enter pan"+" "+(i+1));
		String pan=sc.next();
		System.out.println("Enter Aadhar"+" "+(i+1));
		long adhar=sc.nextLong();
		System.out.println("Enter Mobile"+" "+(i+1));
		int mobile=sc.nextInt();
		System.out.println("Enter E mail ID"+" "+(i+1));
		String email=sc.next();
		d[i]=new Data(name,pan,adhar,mobile,email);
	}
	return 1; 
 }
void print_data(int no)
{
	
	for(int i=0;i<no;i++)
	{
		System.out.println("Name = "+d[i].name);
		System.out.println("Pan = "+d[i].pan);
		System.out.println("Aadhar = "+d[i].aadhar);
		System.out.println("Mobile = "+d[i].mobile);
		System.out.println("E Mail ID = "+d[i].email);
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter No of Students");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		Data d1=new Data();
		int c=d1.get_data(no);
		d1.print_data(no);
		
}
}
