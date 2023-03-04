public class EmployeeTest{
   public static void main(String[] args){
      /* 使用构造器创建两个对象 */
      Employee empOne = new Employee("李明");
      Employee empTwo = new Employee("罗红");
 
      // 调用这两个对象的成员方法
      empOne.empAge(26);
      empOne.empDesignation("高级程序员");
      empOne.empSalary(5000);
      empOne.printEmployee();
 
      empTwo.empAge(21);
      empTwo.empDesignation("菜鸟程序员");
      empTwo.empSalary(2500);
      empTwo.printEmployee();
   }
}