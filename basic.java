//class hello{
    int age=15;
    void data (){
       System.out.println( this);
    }
        public static void main(String[] args) {
          hello obj= new hello();
           obj.data();
           System.out.println(obj.age);
        }
}
 //class student{
   //  int age;
     //student( int age){
       //  this.age=age;
     //}
       //void print (){
         //   System.out.println(age);
       //}
 //} 
   // class main{
    //public static void main(String[] args) {
      // student obj=new student (16);
       //obj.print();
    //}
  //}
    class vehicle{
           void run(){
               System.out.println("hello");
           }
    }   
     class bike extends vehicle{
           void run(){
                System.out.println("hey");
                super.run();
           }
     }
        class main{
              public static void main(String[] args) {
                   vehicle.obj=new bike();
                     

              }
        }
