package Constructor;

public class Student {

  private  String name;
  private  int age;
  private  int schoolNum;

    public Student(String name, int age, int schoolNum){
        this.name= name;
        this.age=age;
        this.schoolNum=schoolNum;
    }

    public Student (){

    }

    public void printStudentDetails(){

        System.out.println(name);
        System.out.println(age);
        System.out.println(schoolNum);
    }


}
