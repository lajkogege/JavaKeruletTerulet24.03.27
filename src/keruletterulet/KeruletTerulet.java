/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keruletterulet;


public class KeruletTerulet {

  
    public static void main(String[] args) {
        szamitasok();
    }

    private static void szamitasok() {
        kerulet();
        terulet();
    }
    
     private static void kerulet() {
         KeruletTeglalap(34,56);
         KeruletNegyzett(44);
         HaromSzog(12,45,55);
    }
    
    private static void terulet() {
    
    }

    private static void KeruletTeglalap(int a,int b) {
       int kerulet=0;
       kerulet=a+b+a+b;
       String kimenet= "Téglalap kerulete:"+kerulet+"\n";
       kiir(kimenet);
    }

  

    private static void KeruletNegyzett(int a) {
       int kerulet=0;
       kerulet=2*(a+a);
       String kimenet= "Négyzet kerulete:"+kerulet +"\n";
       kiir(kimenet);
    }

    private static void HaromSzog(int a, int b,int c) {
       int kerulet=0;
       kerulet=a+b+c;
       String kimenet= "Háromszög kerulete:"+kerulet +"\n";
       kiir(kimenet);
        
  }

    private static void kiir(String szoveg) {
        System.out.print(szoveg);
    }
   
    
}
