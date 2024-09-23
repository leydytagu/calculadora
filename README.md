# Calculadora 3.0

## Descripción

Este proyecto es una **Calculadora** creada con Java utilizando Swing para la interfaz gráfica de usuario (GUI). 
Ofrece funcionalidades básicas de cálculo como **suma, resta, multiplicación y división**. Además, se conecta con una base de datos SQL para almacenar y gestionar las operaciones realizadas.

## Funcionalidades

- **Suma**: Permite sumar dos números.
- **Resta**: Permite restar dos números.
- **Multiplicación**: Permite multiplicar dos números.
- **División**: Permite dividir dos números.

## Tecnologías utilizadas

- **Lenguaje de programación**: Java
- **Interfaz gráfica**: Swing
- **Base de datos**: SQL

## Requisitos del sistema

- Java Development Kit (JDK) 8 o superior.
- Conexión a una base de datos SQL.
- Un IDE como Eclipse o IntelliJ IDEA para ejecutar el código.

## Instalación y ejecución

1. Clonar este repositorio:

   ```bash
   git clone https://github.com/leydytagu/calculadora.git
   ```

2. Importar el proyecto en tu IDE preferido (Netbeans, IntelliJ IDEA).

3. Configurar la base de datos:

   - Crear una base de datos en SQL para almacenar las operaciones realizadas.
   - Crear una tabla llamada `operaciones` con las siguientes columnas:
     ```sql
     CREATE TABLE operaciones (
       id INT PRIMARY KEY AUTO_INCREMENT,
       numero1 DECIMAL(10, 2),
       numero2 DECIMAL(10, 2),
       operacion VARCHAR(20),
       resultado DECIMAL(10, 2)
     );
     ```

4. Ejecutar el archivo `Main.java` en tu IDE para iniciar la aplicación.

## Uso

1. Ingresar los números en los campos correspondientes.
2. Seleccionar la operación deseada (suma, resta, multiplicación, división).
3. Hacer clic en el botón **Calcular** para obtener el resultado.
4. El resultado se mostrará en el campo correspondiente y la operación será guardada en la base de datos.

## Captura de Pantalla
<img width="774" alt="Captura de pantalla 2024-09-22 a la(s) 9 14 09 p  m" src="https://github.com/user-attachments/assets/04aa175c-685f-40ea-8008-3862d291b377">


## Contribuciones

Las contribuciones son bienvenidas. Si deseas mejorar o agregar nuevas funcionalidades, por favor sigue los siguientes pasos:

1. Haz un fork de este repositorio.
2. Crea una nueva rama con tu feature o mejora: `git checkout -b nueva-funcionalidad`.
3. Realiza tus cambios y haz commit: `git commit -m 'Agrega nueva funcionalidad'`.
4. Haz push a la rama: `git push origin nueva-funcionalidad`.
5. Abre un Pull Request.

## Licencia

Este proyecto está licenciado bajo los términos de la licencia MIT.
