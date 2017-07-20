package com.codemonkeycrying.itsfine;

import android.util.Log;

/**
 * Created by aswin on 7/20/2017.
 */

public class myBlueprint {
    myClass myObject = new myClass();
    myClass myVariable = new myClass("otherMoose");

    void myMethod(){
        Log.e("my object is " , myObject.myVar);
        Log.e("my Var is " , myVariable.myVar);

    }

}
