# ACTOR MODEL & THREAD MODEL
## 1. Actor Model
El modelo de actores facilita el diseño de sistemas basados en concurrencia. Se fundamenta en pequeñas entidades 
denominadas actores que se envían mensajes _(datos primordiales que no tienen la posibilidad de modificarse 
luego de haber sido creados, son inmutables.)_ y se comportan de una forma definida frente a la recepción 
de cada uno. 

La construcción de actores sirve para encargar labores, lo que es eficaz para aliviar reponsabilidades y diseñar un óptimo modelo 
de actores, intentando que cada uno tenga el menor número de competencias viable, de tal forma que quede claro qué mensajes
debería procesar cada actor, cómo tienen que reaccionar a los mismos y cómo tienen que manejar errores. 

## Características
- Toda la computación es efectuada dentro del actor
- Los actores solo pueden comunicarse por mensajes
- En respuesta a un mensaje recibido un actor puede:
    - Cambiar su estado o comportamiento.
    - Crear un número infinito de actores hijos.     
    - Enviar mensajes a otros actores.
- Facilidades al momento de escalar un sistema.
- Es tolerante al fallo de entregas.
- Los mensajes no comparten estado.

Para implementar _**ACTOR MODEL**_ , tenemos la herramienta Akka.

## Akka y Modelo de Actores
- Akka es un conjunto de herramientas para construir sistemas concurrentes y distribuidos, en el cual los actores de Akka usan hilos de Java internamente. 
- Los actores de Akka en Java deben extender la clase _**Untyped**_ e implementar el 
  método _**onReceive**_, método donde los actores reciben los mensajes y los manejan según corresponda.
- Akka proporciona bibliotecas de código abierto para diseñar sistemas escalables y resistentes que sean capaces de enfocarse en las necesidades comerciales
  que requieren un comportamiento confiable, de tolerancia a fallas y de alto rendimiento.


 ## 2. Thread Model
Thread Model permite implementar el que un determinado trozo de código Java, pueda	ser ejecutado concurrentemente por diferentes contextos de programación.
El modelo de hilos no tienen su propio espacio de memoria sino que acceden todos al mismo espacio de memoria común, por lo que será 
importante su sincronización cuando tengamos varios hilos accediendo a los mismos objetos.
 
 ## Características
 - Los threads comparten con otros threads: código, datos y archivos abiertos.
 - La ventaja de usar thread model es que muchas operaciones son llevadas a cabo de forma paralela  y, de esta forma, los eventos  asociados 
    a cada actividad  pueden  ser  manejados  inmediatamente.
 - Cuando un thread altera un elemento de memoria de segmento de código, todos los demás threads lo ven.
 - Son más económicos de crear y cambiar de contexto.
 
    
 ## BIBLIOGRAFÍA
- https://medium.com/techwomenc/modelo-de-actores-con-akka-225c28a4dff4
- https://www.genbeta.com/desarrollo/manejar-la-concurrencia-con-actores
- https://www.bbva.com/es/evolucion-actor-akka-computacion-distribuida-mas-segura/
- https://justdigital.agency/blog/actor-model-para-construir-productos-simples-con-mejor-desempeno-y-escalabilidad/
- https://sites.google.com/a/espe.edu.ec/programacion-ii/hilos

## Integrantes
 - _Eric Alvarado_
 - _Rosa Palacios_
