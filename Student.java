import java.lang.*;
import java.util.*;
class Student{
public int id;
public String name;

Student(int a, String s){
id=a;
name=s;
}
public static void main(String[] args){
Student stu = new Student(120,"parimal");
System.out.printf("%d is id of %s student",stu.id, stu.name);
}
}