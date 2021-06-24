# Tarea sobre clases abstractas e interfaces
## Objetivos
Se le solicita desarrollar un programa en java sobre vehiculos con los requerimientos:
- Debe de implementar una clase abstracta
- Debe implementar interfaces
- Debe implementar herencia
## Vehiculos
Hay tres tipos de vehículos:
- De carga: estos tienen la capacidad de transportar material.
- De carrera: estos tienen turbo y pueden triplicar la aceleración establecida
- Camionetas: permiten transportar personas.

## Compilación con maven
Se utiliza el archivo pom.xml y se ejecutan los comandos:
```
mvn compile
mvn package
```
`mvn clean` para limpiar el directorio y eliminar la carpeta target que se genera al compilar

## Ejecutando JAR en consola
Dentro de la capeta raiz del repositorio se ejecuta:
```
java -jar ./target/tarea-abstract-1.0-SNAPSHOT.jar
```