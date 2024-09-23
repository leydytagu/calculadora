/** //CONSTRUIDO EN JAVA CON JDK 1.8 (DEFAULT)
 * //COMPILADO EN APACHE NETBEANS IDE 18
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazGraficaCalculadora2;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @Mario Alejandro Rueda Arcos, Leydy Tatiana Tarazona
 
 */
public class InterfazGraficaCalculadora2 extends javax.swing.JFrame {

    private ControladorCalculadora2 controlador;// INVOCAMOS LA CLASE CONTROLADOR PARA LLEVAR LA INFORMACIÓN DE LA INTERFAZ AL MODELO OPERADOR

    public InterfazGraficaCalculadora2() {
        initComponents();
        controlador = new ControladorCalculadora2(this); // Se instancia el controlador
        addInputValidation(); // Con esta linea de código activamos el método de validación
    }
    
    
    
    private void addInputValidation() { //ESTABLECEMOS RESTRICCIONES EN LOS CAMPOS QUE VA A DIGITAR EL USUARIO
    KeyAdapter keyAdapter = new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            JTextField source = (JTextField) e.getSource();
            String text = source.getText();

            if (c == ',') {
                e.consume();
                JOptionPane.showMessageDialog(null, "Los números decimales deben ser separados por un punto (.) y no por una coma (,). Caracter ingresado: " + c);
            } else if (!Character.isDigit(c) && c != '.' && c != '-' && c != '\b') {
                e.consume();
                JOptionPane.showMessageDialog(null, "Solo se permiten números, el punto decimal y el signo negativo. Caracter ingresado: " + c);
            } else if (c == '.' && text.contains(".")) {
                e.consume();
                JOptionPane.showMessageDialog(null, "Solo se permite un punto decimal en este campo. Caracter ingresado: " + c);
            } else if (c == '-' && text.length() > 0) {
                e.consume();
                JOptionPane.showMessageDialog(null, "El signo negativo solo se permite al principio del número. Caracter ingresado: " + c);
            }
        }
    };

    número1.addKeyListener(keyAdapter);
    número2.addKeyListener(keyAdapter);
}

    public String getNumero1() {
        return número1.getText();
    }

    public String getNumero2() {
        return número2.getText();
    }

    public String getOperacion() {
        if (suma.isSelected()) {
            return "suma";
        } else if (resta.isSelected()) {
            return "resta";
        } else if (multiplicación.isSelected()) {
            return "multiplicacion";
        } else if (división.isSelected()) {
            return "division";
        } else {
            return "";
        }
    }

    public void setResultado(String resultado) {
        this.resultado.setText(resultado);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        número2 = new javax.swing.JTextField();
        número1 = new javax.swing.JTextField();
        suma = new javax.swing.JRadioButton();
        resta = new javax.swing.JRadioButton();
        multiplicación = new javax.swing.JRadioButton();
        división = new javax.swing.JRadioButton();
        volverOperar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        resultado = new javax.swing.JTextField();
        calcular1 = new javax.swing.JButton();

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Apple Braille", 1, 18)); // NOI18N
        jLabel4.setText("Ingresa otro número:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 204));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CALCULADORA 3.0");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Apple Braille", 1, 18)); // NOI18N
        jLabel2.setText("Ingresa un número:");

        jLabel3.setFont(new java.awt.Font("Apple Braille", 1, 18)); // NOI18N
        jLabel3.setText("Ingresa otro número:");

        número2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 15)); // NOI18N
        número2.setText("5");
        número2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                número2ActionPerformed(evt);
            }
        });

        número1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 15)); // NOI18N
        número1.setText("5");
        número1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                número1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(suma);
        suma.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        suma.setText("Suma");
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });

        buttonGroup1.add(resta);
        resta.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        resta.setText("Resta");
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });

        buttonGroup1.add(multiplicación);
        multiplicación.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        multiplicación.setText("Multiplicación");
        multiplicación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicaciónActionPerformed(evt);
            }
        });

        buttonGroup1.add(división);
        división.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        división.setText("División");
        división.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisiónActionPerformed(evt);
            }
        });

        volverOperar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 15)); // NOI18N
        volverOperar.setText("VOLVER A OPERAR");
        volverOperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverOperarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Apple Braille", 1, 18)); // NOI18N
        jLabel5.setText("Resultado:");

        resultado.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });

        calcular1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 15)); // NOI18N
        calcular1.setText("CALCULAR");
        calcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcular1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(número1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(número2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(suma)
                                .addGap(32, 32, 32)
                                .addComponent(resta)
                                .addGap(41, 41, 41)
                                .addComponent(multiplicación)
                                .addGap(40, 40, 40)
                                .addComponent(división))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(volverOperar)))))
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(308, 308, 308)
                    .addComponent(calcular1)
                    .addContainerGap(308, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(número1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(número2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suma)
                    .addComponent(resta)
                    .addComponent(multiplicación)
                    .addComponent(división))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volverOperar))
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(305, 305, 305)
                    .addComponent(calcular1)
                    .addContainerGap(305, Short.MAX_VALUE)))
        );

        pack();
    }

    private void número2ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void número1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void multiplicaciónActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void divisiónActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void calcular1ActionPerformed(java.awt.event.ActionEvent evt) {
        controlador.realizarOperacion(); // Se llama al método del controlador
    }

    private void volverOperarActionPerformed(java.awt.event.ActionEvent evt) {
        número1.setText("");
        número2.setText("");
        resultado.setText("");
        buttonGroup1.clearSelection();
    }

    public static void main(String args[]) {// SE ESTABLECE COMO LA CLASE PRINCIPAL DE LA APLICACION 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGraficaCalculadora2().setVisible(true);
            }
        });
    }

    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JButton calcular1;
    private javax.swing.JRadioButton división;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton multiplicación;
    private javax.swing.JTextField número1;
    private javax.swing.JTextField número2;
    private javax.swing.JRadioButton resta;
    private javax.swing.JTextField resultado;
    private javax.swing.JRadioButton suma;
    private javax.swing.JButton volverOperar;
}
