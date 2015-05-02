/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thejavatutorial.javaOO;

/**
 *
 * @author orlan_000
 */
public class Arguments {
    public void printVarArgs(String... strings) {
        String name = "orlando";
        int idnum = 1234;
        String address = "123 NE 1st";
        System.out.printf("%s: %d, %s%n", name, idnum, address);
        
        for (String s : strings) {
            System.out.print(s);
        }
    }
    
    public Circle circle = new Circle(1,1);
    
    public void moveCircle(Circle circle, int deltaX, int deltaY) {
        // code to move origin of circle to x+deltaX, y+deltaY
        circle.setX(circle.getX() + deltaX);
        circle.setY(circle.getY() + deltaY);
        this.printCircle(circle);
        // code to assign a new reference to circle
        circle = new Circle(0, 0);
        this.printCircle(circle);
    }

    public void printCircle(Circle circle) {
        System.out.println(circle.toString());
        System.out.println("X: " + circle.getX());
        System.out.println("Y: " + circle.getY());
    }
    
    private class Circle {
        private int x;
        private int y;
        
        public int getX() {
            return this.x;
        }
        public int getY() {
            return this.y;
        }
        
        public void setX(int x) {
            this.x = x;
        }
        public void setY(int y) {
            this.y = y;
        }
        
        public Circle(int x, int y) {
            this.setX(x);
            this.setY(y);
        }
        
    }

    
}
