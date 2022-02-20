# Taller 4 - Ejercicio 1.
## Esta subcarpeta contiene el desarrollo del ejercicio 1:
Enunciado
> Desarrolle una clase en Java que realice la abstracción de un sistema planetario,debiendo tener en cuenta para cada cuerpo del sistema aspectos como: masa,densidad, diámetro, distancia al sol (suponga órbitas circulares), un número de identificador único y un nombre textual. Incluya métodos que calculen la atracción gravitatoria entre dos cuerpos cualesquiera del sistema.

### En estos archivos se tienen:

* Un paquete para las clases:
  1. Una abstracta con los atributos generales del sistema planetario y sus métodos.
  2. Una clase para los elementos del sistema planetario, la cual extiende de la clase abstracta, con los atributos de esta, y que sobre escribe sus métodos y ademas contiene un método para el calculo de la atracción gravitatoria entre dos de sus objetos.

* Un paquete para la clase principal:

> Esta clase hace que a partir de la interacción con el usuario este pueda elegir entre ver los elementos del sistema planetario, calcular la atracción gravitatoria entre dos de ellos y finalizar la aplicación; en el calculo de la atracción el usuario también debe elegir entre cuales elementos desea calcularla, la información va siendo mostrada al usuario por consola.

## Es posible ejecutar el código a traves de un IDE descargando el proyecto, extrayéndolo del archivo .ZIP, abriéndolo en el IDE y ejecutándolo o a través de CMD descargando el proyecto, extrayéndolo del archivo .ZIP, abriendo CMD, yendo a la carpeta dist del proyecto (utilizando el comando cd espacio la dirección de ubicación de la carpeta dist del proyecto) y ejecutando el comando java -jar (nombre del archivo .jar), que en este caso sería java -jar Ejercicio_1.jar
