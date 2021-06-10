
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpSetGet emp = new EmpSetGet();
	      emp.setEmpId(101);
	      emp.setName("ABC");
	      emp.setAge(25);
	      emp.setDept("Testing");
	      System.out.println("Employee Id : "+emp.getEmpId() + "\nName : " + emp.getName() + "\nAge : " + emp.getAge() + "\nDepartment : "+emp.getDept());

	}

}
class EmpSetGet
{
   private int empId;
   private String name;
   private int age;
   private String dept;

   public int getEmpId()
   {
      return empId;
   }
   public String getName()
   {
      return name;
   }
   public int getAge()
   {
      return age;
   }
   public String getDept()
   {
       return dept;
   }
   public void setEmpId( int empId)
   {
      this.empId = empId;
   }
   public void setName(String name)
   {
      this.name = name;
   }
   public void setAge( int age)
   {
      this.age = age;
   }
   public void setDept(String dept)
   {
       this.dept = dept;
   }
}