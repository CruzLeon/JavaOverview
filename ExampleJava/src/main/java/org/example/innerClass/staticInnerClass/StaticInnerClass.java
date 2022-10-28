package org.example.innerClass.staticInnerClass;

/**
 *
 * PUEDEN SER FINALES
 * las clases internas estaticas pueden instanciarse sin tener una instancia de root clase,
 * No pueden acceder a las variables miembro de root sin una instancia de estas
 *
 * Pueden refererirse a las variables estaticas de root
 *
 */

class RootClass{}
public class StaticInnerClass {

    private static int variable = 9;
    int y = 9;

    private static class InnerClass{

        public void myMehotd(){
            new StaticInnerClass().y = 9;
            variable = 3;
        }
    }

    final protected static class InnerTwo extends RootClass{
        //Some
    }
}
