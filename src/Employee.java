/* creating the class */
public class Employee {
	
  int id;
  int age;
  String name;
  /* creating the default constructor */
  Employee()
  {
      id = 2807;
      age = 22;
      name="Nitish";
  }
  Employee(int id,int age,String name)
  {
	  this.id=id;
	  this.age=age;
	  this.name=name;
	  
  }
	/* creating the method */
  public void display()
  {
	  System.out.println("Id : "+id+", Age : "+age+" ,Name :" +name);
  }
	/* creating the main method */
	public static void main(String[] args) {
		/* creating the object */
		Employee e1=new Employee();
		Employee e2=new Employee(2804,22,"Bhwani");
		Employee e3=new Employee(2805,22,"Negi");
		/* calling the method */
		e1.display();
		e2.display();
		e3.display();

	}

}
