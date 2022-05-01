package package1;



public class Constuctor
{ 
	String  name;
	int id;
	String job;
	int salary;
   
   
	public static void main(String[] args) {
		// TODO Auto-generated method s
    Constuctor std1=new  Constuctor ("venu", 011, "poice", 100000);
   std1.display();
   Constuctor std2=new  Constuctor ("vishal", 012, "army", 100000);
   std2.display();
  Constuctor aobj=new Constuctor();
	}
	
  Constuctor(String name,int id,String job,int salary,String loation) 
  {
	  
  name=name;
  id= id;
  job =job;
  salary=salary;
  
  }
 
public Constuctor(String string, int i, String string2, int j) {
	// TODO Auto-generated constructor stub
}

public Constuctor() {
	// TODO Auto-generated constructor stub
}

void display()
  {
  System.out.println("name:"+name);
  System.out.println("id:"+id);
  System.out.println("job:"+job);
  System.out.println("salary;"+salary);
  
  
 
  }
}

