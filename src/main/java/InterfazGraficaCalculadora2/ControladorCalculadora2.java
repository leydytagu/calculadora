/** //CONSTRUIDO EN JAVA CON JDK 1.8 (DEFAULT)
 * //COMPILADO EN APACHE NETBEANS IDE 18
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazGraficaCalculadora2;

/**
 *
 * @Mario Alejandro Rueda Arocs - Leydy Tatiana Tarazona
 */
public class ControladorCalculadora2 {
    private InterfazGraficaCalculadora2 vista; //HEREDA CARACTERISTICAS DE LA INTERFAZ GRAFICA
    private Modelo2 modelo; //HEREDA CARACTERISTICAS DE LA CLASE MODELO

    public ControladorCalculadora2(InterfazGraficaCalculadora2 vista) {
        this.vista = vista;
        this.modelo = new Modelo2(); // Instanciar el modelo
    }

    public void realizarOperacion() {
        try {
            double num1 = Double.parseDouble(vista.getNumero1());// CONVIERTE EL DATO STRING DEL USUARIO EN TIPO DOUBLE PARA HACER LAS OPERACIONES ARITMETICAS
            double num2 = Double.parseDouble(vista.getNumero2());// CONVIERTE EL DATO STRING DEL USUARIO EN TIPO DOUBLE PARA HACER LAS OPERACIONES ARITMETICAS
            String operacion = vista.getOperacion();
            double resultado = 0;

            switch (operacion) {
                case "suma":
                    resultado = modelo.sumar(num1, num2); // Usar el modelo para sumar
                    break;
                case "resta":
                    resultado = modelo.restar(num1, num2); // Usar el modelo para restar
                    break;
                case "multiplicacion":
                    resultado = modelo.multiplicar(num1, num2); // Usar el modelo para multiplicar
                    break;
                case "division":
                    try {
                        resultado = modelo.dividir(num1, num2); // Usar el modelo para dividir
                    } catch (ArithmeticException e) {
                        vista.setResultado("Error: División por cero");
                        return;
                    }
                    break;
                default:
                    vista.setResultado("Seleccione una operación");
                    return;
            }

            vista.setResultado(String.valueOf(resultado));
        } catch (NumberFormatException e) {
            vista.setResultado("Error: Número no válido");
        }
    }
}