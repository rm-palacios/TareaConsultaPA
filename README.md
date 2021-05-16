# ACTOR MODEL vs THREAD MODEL
## Actor Model
El modelo de actores tiene como fin facilitar el diseño de sistemas basados en concurrencia. Se fundamenta en pequeñas entidades 
denominadas actores que se envían mensajes y se comportan de una forma definida frente a la recepción de cada uno. 

Los _“mensajes”_ son construcciones de datos primordiales que no tienen la posibilidad de modificarse luego de haber sido creadas, 
o en un solo vocablo, son inmutables.

La construcción de actores sirve para encargar labores, lo que es eficaz para aliviar reponsabilidades y diseñar un óptimo modelo 
de actores: se debe intentar que cada uno tenga el menor número de competencias viable, de tal forma que quede claro qué mensajes
debería procesar cada actor, cómo tienen que reaccionar a los mismos y cómo tienen que manejar errores. 

## Actores frente a mensajes
Responde de 4 formas principales:
- **ENVIAR MENSAJES:** Un actor solo puede comunicarse con otro actor enviándole mensajes. Los actores no permiten ningún acceso al
  estado interno.
- **CREAR ACTORES:** Un actor puede crear otros actores. Esto crea automáticamente una jerarquía de actores con padres e hijos.
- **CAMBIAR ESTADO:** Un actor puede cambiar la forma en que maneja los mensajes entrantes modificando su comportamiento.
- **SUPERVISAR ACTORES:** Un actor necesita supervisar a los actores que crea.

Para que el modelo de actores pueda realizar todas las tareas para lo cuál fueron creados y puedan interactuar entre ellos Akka 
implementó un “sistema de actores” el cuál da vida a este modelo.

## Akka
Akka es un conjunto de herramientas para construir sistemas concurrentes y distribuidos para Scala y Java bajo el paradigma del
modelo de actor.




 ## Thread Model
 
 ## BIBLIOGRAFÍA
- [1] https://medium.com/techwomenc/modelo-de-actores-con-akka-225c28a4dff4
- [2] https://www.genbeta.com/desarrollo/manejar-la-concurrencia-con-actores
- [3] https://www.bbva.com/es/evolucion-actor-akka-computacion-distribuida-mas-segura/
