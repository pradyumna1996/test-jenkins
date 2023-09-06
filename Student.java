public class Student{

    String name,id;

    Student(String name,String id){
        this.name=name;
        this.id=id;
    }

    void printDetails(){
        System.out.println("Name of Student is :  "+ this.name);
        System.out.println("Id of Student is :  "+ this.id);
        
    }
}