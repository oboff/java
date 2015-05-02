/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thejavatutorial.nutsandbolts;

/**
 *
 * @author orlan_000
 */
public class VariablesQuestions {
    String[] varquestions = {
        "1. The term \"instance variable\" is another name for ___.",
        "2. The term \"class variable\" is another name for ___.",
        "3. A local variable stores temporary state; it is declared inside a ___.",
        "4. A variable declared within the opening and closing parenthesis of a method signature is called a ____.",
        "5. What are the eight primitive data types supported by the Java programming language?",
        "6. Character strings are represented by the class ___.",
        "7. An ___ is a container object that holds a fixed number of values of a single type."
    };
    public void printVariablesQuestions() {
        for (String varQuest : varquestions) {
            System.out.println(varQuest);
        }
    }
    public void printVariablesAnswers() {
        String[] varAnswers = {
            "Non-static fields",
            "Static fields",
            "Method",
            "Parameter",
            "boolean, short, byte, char, integer, float, long, double",
            "java.lang.String",
            "Array"
        };
        
        for (int i = 0, n = varquestions.length; i < n; i++) {
            System.out.println(varquestions[i] + " Answer: " + varAnswers[i]);
        }
    }
}
