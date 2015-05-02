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
public class Datatypes {
    public void displaySizeMinAndMax(Class<?> type, int size, Number min, Number max) {
        System.out.printf("type:%-7s size:%-2s min:%-20s max:%s\n", type, size, min, max);
    }
    
    public void displayBooleanType(Class<?> type, Boolean t, Boolean f) {
        System.out.printf("type:%-7s t:%-5s f:%-5s\n", type, t, f);
    }
    
    public void printDatatypes() {
        this.displayBooleanType(Boolean.TYPE, Boolean.TRUE, Boolean.FALSE); // Boolean does not have Boolean.SIZE, Boolean.MIN_VALUE, or Boolean.MAX_VALUE
        this.displaySizeMinAndMax(Byte.TYPE, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        this.displaySizeMinAndMax(Short.TYPE, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
        this.displaySizeMinAndMax(Character.TYPE, Character.SIZE, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
        this.displaySizeMinAndMax(Integer.TYPE, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        this.displaySizeMinAndMax(Long.TYPE, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
        this.displaySizeMinAndMax(Float.TYPE, Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
        this.displaySizeMinAndMax(Double.TYPE, Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
    }

    boolean bo;
    byte by;
    short sh;
    char ch;
    int in;
    long lo;
    float fl;
    double du;
    
    public void printDefaultPrimVals() {
        System.out.println("\nDefault values of primitive data types");
        System.out.printf("boolean:%-7s\n", bo);
        System.out.printf("byte:   %-7s\n", by);
        System.out.printf("short:  %-7s\n", sh);
        System.out.printf("char:   %-7s\n", (int)ch);
        System.out.printf("int:    %-7s\n", in);
        System.out.printf("long:   %-7s\n", lo);
        System.out.printf("float:  %-7s\n", fl);
        System.out.printf("double: %-7s\n", du);
    }
    
    public void printDecHexBinVals() {
        // The number 26, in decimal
        int decVal = 26;
        //  The number 26, in hexadecimal
        int hexVal = 0x1a;
        // The number 26, in binary
        int binVal = 0b11010;
        System.out.println("\nComparison of Decmial, Hex, Binary Values");
        System.out.println("decVal: " + decVal);
        System.out.println("hexVal: " + hexVal + " \\0x1a");
        System.out.println("binVal: " + binVal + " \\0b11010");
    }
    
    public void printEscapeChars() {
        System.out.println("\nEscape characters");
        System.out.println("\\b : backspace");
        System.out.println("\\t : tab");
        System.out.println("\\n : line feed");
        System.out.println("\\f : form feed");
        System.out.println("\\r : carriage return");
        System.out.println("\\\" : double quote");
        System.out.println("\\\' : single quote");
        System.out.println("\\\\ : backslash");
    }
    
    public void printLongAndFloat() {
        long lo = 23L;
        float fl = 3.14F;
        
        System.out.println("\nLong and Float literals");
        System.out.println("long lo = 23L //evaluates to: " + lo );
        System.out.println("float fl = 3.14F //evaluates to: " + fl);
        
    }
}
