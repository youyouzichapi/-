//封装283
public class java课1
{
  public static void main (String[] args)
  {
      Person person = new Person();
      person.setName("艾米");
      person.setAge(24);
      person.setSalary(12000);
      System.out.println(person.info());
      Person mish = new Person("mish",20,5000);
      System.out.println(mish.info());
  }
}

class Person {
    public String name;//快捷键Alt+Ins
    private int age;
    private int salary;
    public Person()
    {

    }//有三个属性的构造器，快捷键Alt+Ins
    public Person (String name,int age,int salary)
    {
       /*this.name = name;
        this.age = age;
        this.salary = salary;*/
        setName(name);
        setAge(age);
        setSalary(salary);//将set方法写在构造器中
    }//构造器
    public String getName()//get函数以及set函数如上快捷键
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public String info() {
        return "信息为 name =" + name + "年龄 ="+ age + "薪水=" +salary ;
    }
}
