/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thejavatutorial;
import thejavatutorial.nutsandbolts.*;
import thejavatutorial.javaOO.*;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author orlan_000
 */
public class TheJavaTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Datatypes datatypes = new Datatypes();
        datatypes.printDatatypes();
        datatypes.printDefaultPrimVals();
        datatypes.printDecHexBinVals();
        datatypes.printEscapeChars();
        datatypes.printLongAndFloat();
        
        Arrays arrays = new Arrays();
        arrays.printArrays();
        arrays.printArraysCopy();
        arrays.printMultiDimArray();
        System.out.println("");
        
        VariablesQuestions varquest = new VariablesQuestions();
//        varquest.printVariablesQuestions();
        varquest.printVariablesAnswers();
        System.out.println("");
        
        Op2 oper2 = new Op2();
        oper2.printInstanceOfDemo();
        System.out.println("");
        
        Branch branch = new Branch();
        branch.printBreakWithLabelDemo();
        System.out.println("");
        
        Arguments arguments = new Arguments();
        arguments.printVarArgs("Hello", ",", " Jack\n");
        
        arguments.moveCircle(arguments.circle, 5, 10);
        arguments.moveCircle(arguments.circle, 5, 10);

        LambdaExpressions lam = new LambdaExpressions();

        lam.addPerson("Jim", 60, Person.Sex.MALE);
        lam.addPerson("Aly", 30, Person.Sex.FEMALE);
        lam.addPerson("Tim", 12, Person.Sex.MALE);
    }
    
}
