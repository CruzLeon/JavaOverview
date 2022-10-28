package org.example.packageVisibility;

import lombok.Data;

@Data
public class Cat {

    protected String id;
    String name;
}

class PackageVisibility{

    public void doit(){
        Cat myCat = new Cat();
        //VisibilityPackage Success
        myCat.name = "asd";
    }
}