# Iniciar Proyecto Spring Boot

Este documento explica cómo crear un nuevo proyecto Spring Boot utilizando **Spring Initializer**.

## Spring Initializer

Para crear un nuevo proyecto Spring Boot, accede a:
```
https://start.spring.io
```

## Configuración del Proyecto

### Parámetros Base
- **Build Tool**: Maven
- **Language**: Java
- **Spring Boot Version**: 3.5.9
- **Packaging**: JAR
- **Java Version**: 21
- **Configuration**: Properties

### Dependencias Requeridas

#### Spring Web
```
Spring Web
```
Descripción: Construye aplicaciones web, incluyendo RESTful, usando Spring MVC. Utiliza Apache Tomcat como contenedor embebido por defecto.

## Pasos para Crear el Proyecto

1. Accede a [start.spring.io](https://start.spring.io)
2. Completa la configuración del proyecto con los parámetros mencionados arriba
3. Selecciona la dependencia **Spring Web**
4. Haz clic en **GENERATE** para descargar el proyecto
5. Extrae el archivo ZIP descargado
6. Abre el proyecto en tu IDE preferido (IntelliJ, VS Code, Eclipse, etc.)

## Estructura del Proyecto

Una vez generado, el proyecto tendrá la siguiente estructura:

```
proyecto-spring-boot/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/demo/
│   │   │       └── Application.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/example/demo/
│               └── ApplicationTests.java
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

## Ejecutar el Proyecto

### Usando Maven
```bash
./mvnw spring-boot:run
```

O en Windows:
```bash
mvnw.cmd spring-boot:run
```

### Usando IDE
- Abre la clase `Application.java`
- Haz clic derecho y selecciona "Run" o presiona Shift + F10

## Puerto Predeterminado

La aplicación se ejecutará en:
```
http://localhost:8080
```

## Archivo .gitignore

Se ha configurado un archivo `.gitignore` para ignorar archivos y carpetas que no deben ser versionados en el control de versiones. El archivo `.gitignore` contiene lo siguiente:

```
# Maven
target/

# Logs
*.log

# IDEs
.idea/
*.iml
.vscode/

# OS
.DS_Store
```

Los elementos ignorados incluyen:

- **target/**: Carpeta generada por Maven que contiene archivos compilados y empaquetados. No se debe versionar ya que se genera automáticamente durante la compilación.
- ***.log**: Archivos de logs que pueden contener información sensible o cambiar frecuentemente, lo que podría causar conflictos en el repositorio.
- **.idea/** y ***.iml**: Archivos específicos del IDE IntelliJ IDEA, que son configuraciones locales y no deben compartirse.
- **.vscode/**: Archivos de configuración del IDE Visual Studio Code, específicos del entorno de desarrollo local.
- **.DS_Store**: Archivos generados por el sistema operativo macOS, que no son relevantes para el proyecto.

Esto asegura que solo el código fuente y archivos esenciales sean versionados, manteniendo el repositorio limpio y evitando conflictos.

## Referencias

- [Documentación Oficial de Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Initializer](https://start.spring.io)
- [Guía de Spring Web](https://spring.io/guides/gs/serving-web-content/)
