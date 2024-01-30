# Afinidades
Trabajo Entornos de desarrollo.

# Enunciado del ejercicio:
*Elabora un programa que busque la afinidad entre personas atendiendo a sus aficiones. Almacenarás, para 10 personas, sus aficiones (jardinería, bricolaje, deportes, música…), siendo las aficiones 7 hobbies fijos. Se considera que dos personas son afines si comparten al menos tres aficiones. 
Deberá obtenerse, para una persona dada, cuáles son afines a ella.*

# Nuestra interpretación:
*Programa para que 10 personas inserten su nombre (para identificarlos), edad (para saber si son mayores o menores de edad) y sus aficiones (de manera manual y mediante un solo verbo) y les diga quienes son o no afines a ello/as comparando las aficiones y teniendo al menos tres en común.*

# CLASE: PERSONA
  ATRIBUTOS: NOMBRE(STRING), EDAD(INT), AFICIONES(ARRAYLIST DE STRINGS), PERSONASCOMPATIBLES (ARRAYLIST DE STRINGS)
  MÉTODO: AGREGARPERSONASCOMPATIBLES()

# CLASE: PROGRAMA
- limpiaTexto();
Se le pasa la afición que ha puesto cada persona quitándole cualquier tilde, punto, etc.
- agregaPersonas();
Se crean 10 objetos de la clase persona, con sus respectivos atributos.
- edadPersona();
Se valida si la edad es correcta o no.
- sonCompatibles();
Se recorren las aficiones de dos personas para ver la afinidad y si existen más de 3 aficiones iguales se añaden al ArrayList de cada uno personasCompatibles.
- comparaAficiones();
Se recorren todas las personas comparando sus aficiones para ver su afinidad mediante el método sonCompatibles.
- mostrarResultados();
Se itera  todo el ArrayList de Personas mostrando el getter de personasCompatibles que hay en cada uno de ellos si han acumulado personas afines, y sino aparecerá un mensaje diciendo que no hay afinidad con nadie del programa.
- MAIN:
  * Creamos un ArrayList de Personas mediante el método añadePersonas, y después buscamos la afinidad mediante el método comparaAficiones. Mostramos las afinidades de cada uno mediante mostrarResultados.
