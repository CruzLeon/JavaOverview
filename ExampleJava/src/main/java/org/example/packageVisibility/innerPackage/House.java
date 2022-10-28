package org.example.packageVisibility.innerPackage;

import org.example.packageVisibility.Cat;

public class House {

    public void doit(){
        Cat myCat = new Cat();
        //VisibilityPackage Error
        //myCat.name;
    }
}

class EgyptCat extends Cat{

    public void doit(){
        Cat myCat = new Cat();
        //VisibilityPackage Error
        //myCat.name;

        //Access via protected visibility
        this.id = "1";
    }
}
