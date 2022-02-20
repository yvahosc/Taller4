# Taller 4 - Ejercicio 2.
## Esta subcarpeta contiene el desarrollo del ejercicio 2:
Enunciado
> ¿Es posible ejecutar un programa en java que contenga varias clases con métodos main? En caso positivo, ¿cómo se determina el punto de entrada a un programa?

La respuesta a esta pregunta es que sí es posible ejecutar un programa con varios métodos Main en sus clases, el punto de entrada debe definirse en la construcción del programa; En Netbeans es posible hacerlo dando clic derecho sobre el proyecto y yendo a sus propiedades, luego en la categoria llamada Run aparece una opción llamada Main class, allí podemos elegir el método Main por medio del cual queremos que la aplicación de inicio y para finalizar damos ok; así cuando se ejecute el programa este iniciará por el método Main elegido y no por otro.

Para ver un poco mejor esto se desarrollo una aplicación ejemplo en la que se muestra los integrantes de la selección nacional:

### En estos archivos se tienen:

* Un paquete para las clases:
  1. Una abstracta con los atributos generales de los miembros de la selección nacional y sus métodos.
  2. Una clase para los jugadores de la selección nacional, la cual extiende de la clase abstracta, con los atributos de esta, y que sobre escribe sus métodos y ademas contiene un método para la creación de algunas de sus instancias; esta también contiene un método Main que permite visualizar los objetos pertenecientes a esta clase por medio de la consola.
  3. Una clase para los miembros del cuerpo técnico de la selección nacional, la cual extiende de la clase abstracta, con los atributos de esta, y que sobre escribe sus métodos y ademas contiene un método para la creación de algunas de sus instancias; esta también contiene un método Main que permite visualizar los objetos pertenecientes a esta clase por medio de la consola.

* Un paquete para la clase principal, en este caso se tienen dos clases principales más para ilustrar el tema:
  1. Una clase llamada Ejercicio 2, en la que hace una visualización de los integrantes de la selección nacional y sus atributos llamando directamente a los metodos que crean y listan dichos objetos.
  2. Una clase llamada AnotherMainClass, en la que hace una visualización de los integrantes de la selección nacional y sus atributos llamando a los métodos Main que se encuentran en cada una de sus clases, es decir, llamando al método Main en la clase jugadores para mostrar a sus integrantes y su información y llamando al método Main en la clase miembros del cuerpo técnico para mostrar a sus integrantes y su información.

## Es posible ejecutar el código de dos maneras:
1. A traves de un IDE descargando el proyecto, extrayéndolo del archivo .ZIP, abriéndolo en el IDE y ejecutándolo, inicialmente la aplicación está configurada para iniciarse con el método Main llamado Ejercicio 2, pero esto puede ser modificado desde el IDE (como ya se explicó) para observar el comportamiento del programa cuando se inicia por los otros métodos Main creados.
2. A través de CMD descargando el proyecto, extrayéndolo del archivo .ZIP, abriendo CMD, yendo a la carpeta dist del proyecto (utilizando el comando cd espacio la dirección de ubicación de la carpeta dist del proyecto) y ejecutando el comando java -jar (nombre del archivo .jar), en la carpeta existen cuatro archivos .jar, seleccione uno a uno para ver como se comporta el programa al inicilizarse por un método Main diferente.
