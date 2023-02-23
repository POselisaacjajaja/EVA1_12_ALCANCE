/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_alcance;

/**
 *
 * @author isaaczapatto
 */
public class EVA1_12_ALCANCE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(x);//la x no existe, porque está declarada después de la instrucción.
        System.out.println(args);//args existe, porque está declarada antes de la instrucción.
        int x = 100;
        System.out.println(x);
    }
    
}
