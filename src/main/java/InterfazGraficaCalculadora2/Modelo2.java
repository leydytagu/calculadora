/** //CONSTRUIDO EN JAVA CON JDK 1.8 (DEFAULT)
 * //COMPILADO EN APACHE NETBEANS IDE 18
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazGraficaCalculadora2;

/**
 *
 * @Mario Alejandro Rueda Arcos- Leydy Tatiana Tarazona
 */
public class Modelo2 {
     public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("División por cero");
        }
        return num1 / num2;
    }

}
