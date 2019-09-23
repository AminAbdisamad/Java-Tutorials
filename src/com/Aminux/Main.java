package com.Aminux;

public class Main {

    public static void main(String[] args) {
        Samsung note = new Samsung("Note-12","98329C092","555-4848332",2400,true);
        note.mobileInfo();
        note.noteTen();
        note.shoot();
        Nokia s310 = new Nokia("S-310","00930303","45454-453434",345,true);
        s310.mobileInfo();
	/*
 write your code here
        Human Amino;
        Amino = new Human();
        Amino.Name = "Amino";
        Amino.age = 27;
        Amino.height = 1.80;
        Amino.eyeColor="Blue";
        Amino.speak();
        Human Ali = new Human();
        Ali.Name = "Ali";
        Ali.age = 32;
        Ali.height = 1.89;
        Ali.eyeColor = "Green";
        Ali.speak();

*/
//	Human Ali;
/*Human is a reference variable or Complex datatype not a primitive datatype and it will be stored in heap memory
Primitive Datatype  stored in stuck memory
for example Amino = new Human(); Amino will be stored in the heap and if we define another hassino = new Human
 hasino object will be stored in heap and will contain Human address, which causes garbage collection
*/
//        Human John = new Human("John",26,1.97,"Green");
//        John.speak();
    }
}
