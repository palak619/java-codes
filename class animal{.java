
//inheritance
class animal{
    void eat(){
        System.out.println("eating....");
    }
   // void sleep(){
      //  System.out.println("zzzzzzzzzzz");
    //}
}
class dog extends animal{
    void  sleep(){
        System.out.println("zzzzzz....");
    }
}
public class t2{
    public static void main(String[]args){
        //creating object of class animal
        animal a = new animal();
        //calling methods of class animal using object a
        a.eat();
        dog obj = new dog();
        obj.sleep();
        

    }
}