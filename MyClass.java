// 3 - find out number of object is created from class 

class MyClass {
    
    public static int objectCount ;

   
    public MyClass() {
        objectCount++;
    }
        
    
    public static void main(String[] args) {
        
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();

        
        System.out.println(objectCount);
    }
}
