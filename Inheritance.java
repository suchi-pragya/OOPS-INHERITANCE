class Animal {  
           void eat() {  
                System.out.println("Animal is eating");  
           }  
           void sleep() {  
                System.out.println("Animal is sleeping");  
           }  
      }  
      class Bird extends Animal {  
           @Override  
           void eat() {  
                System.out.println("Bird is eating");  
          }  
          @Override  
           void sleep() {  
                System.out.println("Bird is sleeping");  
           }  
           void fly() {  
                System.out.println("Bird is flying");  
           }  
      }  
      public class Inheritance {  
           public static void main(String[] args) {  
                 
                Animal animal = new Animal();  
                animal.eat();  
                animal.sleep();  
                Bird bird = new Bird();  
                bird.eat();  
               bird.sleep();  
                bird.fly();  
       }  
      }  