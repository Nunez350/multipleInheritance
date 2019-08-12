//an example of mutiple inherintance interface


/*
a class cant extend mltiple base classes. this is because, derived clas may 
inherit different implementation for the same method from multple base classes
*/
interface Mom{
    void gene1();
    default void testr(){
        System.out.println("test1");
    }
}

interface Dad {   
    void gene2();
    default void testr(){
        System.out.println("test1");
        
    }
}


/*In the following class, because we are implementing the two interfaces Mom and Dad,
 we must define the functions inside this class. Now if we do not implement one of the methods like say the gene2,
  the program will not compile.
  there is a risk of multiple implmentations 

However you can extend multiple interfaces

You have to be carefule with ambiguity in the 
default methods with the same signature
absract methods with the same name
static methods with the same names
/constants
*/


class Child implements Mom,Dad{
    //System.out.println(Mom.gene1);
    public void gene1() {
        System.out.print("mom_gene ");
    }

    public void gene2(){
        System.out.print("dad_gene ");
    }
    @Override
    public void testr(){
        System.out.println("test13");
    }
    public static void main(String args[]) {
    Child s = new Child();
    s.gene1();
    s.gene2();
    s.testr();    
   
    System.out.println("\nWe have a child!");
}

}
