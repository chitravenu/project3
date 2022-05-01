package package1;

public class Constrocutr {
	String name;
	int rolno;
	String group;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Constrocutr std1=new Constrocutr ("Venu",1,"Mpc");
               std1.display();
               Constrocutr obj=new Constrocutr();
	}             
     Constrocutr(String name_temp,int rolno_temp,String group_temp) 
{
        name=name_temp;
        rolno=rolno_temp;
        group=group_temp;
}
  Constrocutr() 
  {
	  System.out.println("default constrctor is executed");
  }
  void display()
  {
	  System.out.println("student name is"+name);
	  System.out.println("student rolno is"+rolno);
	  System.out.println("student group is"+group);
	  }

	}


