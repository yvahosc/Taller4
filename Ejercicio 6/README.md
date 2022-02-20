# Taller 4 - Ejercicio 6.
## Esta subcarpeta contiene el desarrollo del ejercicio 6:
Enunciado
> Una interesante clase predefinida en el lenguaje java es la clase Vector, que implemente la abstracción "array dinámico". Revise la clase y úsela (en ficheros diferentes) para realizar un programa que lea números del teclado hasta que se introduce dos veces seguidas el mismo número. Entonces el programa muestra todos los números introducidos y termina.

### En estos archivos se tienen:
* Un paquete para las interfaces:
  > Una interface con los métodos para agregar objetos de tipo numero a un vector y para mostrar por consola los elementos que están en el vector.
  > 
  > Una interface con los métodos para la verificación e ingreso de los datos por parte del usuario en su interacción con la aplicación, dependiendo de que tipo de dato se requiera en cada caso.

* Un paquete para las clases:
  1. Una clase para la creación de objetos de tipo numero y sus métodos get y set.
 
* Un paquete para la clase principal:
> Esta clase hace que a partir de la interacción con el usuario este pueda realizar el proceso de registro de objetos de tipo numero y la creación de un vector con estos objetos a partir  de la interacción con el usuario y posteriormente imprimirlos cuando  los dos ultimos objetos de tipo numero del vector sean iguales.
> 
## Es posible ejecutar el código a traves de un IDE descargando el proyecto, extrayéndolo del archivo .ZIP, abriéndolo en el IDE y ejecutándolo o a través de CMD descargando el proyecto, extrayéndolo del archivo .ZIP, abriendo CMD, yendo a la carpeta dist del proyecto (utilizando el comando cd espacio la dirección de ubicación de la carpeta dist del proyecto) y ejecutando el comando java -jar (nombre del archivo .jar), que en este caso sería java -jar Ejercicio_6.jar
