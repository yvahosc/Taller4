# Taller 4 - Ejercicio 5.
## Esta subcarpeta contiene el desarrollo del ejercicio 5:
Enunciado
> A partir de la clase anterior, y mediante herencia cree nuevas clases que permitan diferenciar si el objeto es un coche, una moto, un camión, una bicicleta, una lancha.Incluya en cada clase algún atributo específico que la diferencie de las demás. Por ejemplo, para el coche un booleano que determine si es de tres o cinco puertas, para el camión la altura (indiferente en los otros vehículos), etc. Realice un programa como el del ejercicio anterior capaz de trabajar con los distintos tipos de vehículos.

Se utilizó como base los archivos creados para el ejercicio 4 con algunas modificaciones.

### En estos archivos se tienen:
* Un paquete para las interfaces:
  > Una interface con los métodos para agregar objetos de tipo vehículo a una lista y para mostrar por consola dicha lista.
  > 
  > Una interface con los métodos para la verificación e ingreso de los datos por parte del usuario en su interacción con la aplicación, dependiendo de que tipo de dato se requiera en cada caso.

* Un paquete para las clases:
  1. Una clase abstracta con los atributos comunes de todos los vehículos y sus métodos.
  2. Una clase por cada uno de los tipos de vehículo (bicicleta, lancha, carro, motocicleta y camión) que extienden de la clase abstracta con sus atributos y métodos, ademas de un atributo específico para diferenciar cada una de estas, ademas de la sobre escritura de los métodos de la clase de la que extienden.

* Un paquete para la clase principal:
> Esta clase hace que a partir de la interacción con el usuario este pueda realizar el registro de hasta 10 vehículos en un ferry, eligiendo el tipo de vehículo que desea registrar y sus atributos, ver los vehículos registrados y finalizar el proceso de registro.
> 
## Es posible ejecutar el código a traves de un IDE descargando el proyecto, extrayéndolo del archivo .ZIP, abriéndolo en el IDE y ejecutándolo o a través de CMD descargando el proyecto, extrayéndolo del archivo .ZIP, abriendo CMD, yendo a la carpeta dist del proyecto (utilizando el comando cd espacio la dirección de ubicación de la carpeta dist del proyecto) y ejecutando el comando java -jar (nombre del archivo .jar), que en este caso sería java -jar Ejercicio_5.jar
