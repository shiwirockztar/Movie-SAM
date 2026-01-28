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

### Por terminal linux
```bash
cd "/workspaces/Movie-SAM/Spring Boot/com.netflix.clone"
./mvnw clean spring-boot:run
```

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

## Configuración de application.properties

El archivo `application.properties` contiene la configuración de la aplicación. A continuación se detalla cada propiedad utilizada:

```
spring.application.name=com.netflix.clone
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/pulsescreen_video
spring.datasource.username=root
spring.datasource.password=123456
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.properties.hibernate.format_sql=true
spring.servlet.multipart.enabled=true
spring.servlet.multipart.max-file-size=2GB
spring.servlet.multipart.max-request-size=2GB
server.tomcat.max-swallow-size=-1
server.tomcat.max-http-form-post-size=-1
file.upload.video-dir=uploads/videos
file.upload.thumbnail-dir=uploads/thumbnails
file.upload.image-dir=uploads/images
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=shiwirockztar@gmail.com
spring.mail.password=bglvkdfxyfombzsz
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
spring.mail.properties.mail.smtp.starttls.required=true
spring.mail.properties.mail.smtp.connectiontimeout=5000
spring.mail.properties.mail.smtp.timeout=5000
spring.mail.properties.mail.smtp.writetimeout=5000
app.frontend.url=http://localhost:4200
```

### Explicación de las propiedades:

- **spring.application.name=com.netflix.clone**: Define el nombre de la aplicación Spring Boot.
- **spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver**: Especifica el driver JDBC para conectar con MySQL.
- **spring.datasource.url=jdbc:mysql://localhost:3306/pulsescreen_video**: URL de conexión a la base de datos MySQL.
- **spring.datasource.username=root**: Usuario para acceder a la base de datos.
- **spring.datasource.password=123456**: Contraseña para acceder a la base de datos.
- **spring.jpa.show-sql=true**: Habilita la impresión de consultas SQL en los logs.
- **spring.jpa.hibernate.ddl-auto=update**: Configura Hibernate para actualizar automáticamente el esquema de la base de datos.
- **spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect**: Especifica el dialecto de Hibernate para MySQL 8.
- **spring.jpa.properties.hibernate.format_sql=true**: Formatea las consultas SQL en los logs para mejor legibilidad.
- **spring.servlet.multipart.enabled=true**: Habilita el soporte para multipart (uploads de archivos).
- **spring.servlet.multipart.max-file-size=2GB**: Establece el tamaño máximo de archivo para uploads (2GB).
- **spring.servlet.multipart.max-request-size=2GB**: Establece el tamaño máximo de la solicitud HTTP (2GB).
- **server.tomcat.max-swallow-size=-1**: Configura Tomcat para no limitar el tamaño de datos "tragados" sin buffering.
- **server.tomcat.max-http-form-post-size=-1**: Elimina el límite de tamaño para formularios POST en Tomcat.
- **file.upload.video-dir=uploads/videos**: Directorio donde se almacenan los videos subidos.
- **file.upload.thumbnail-dir=uploads/thumbnails**: Directorio donde se almacenan las miniaturas de videos.
- **file.upload.image-dir=uploads/images**: Directorio donde se almacenan las imágenes subidas.
- **spring.mail.host=smtp.gmail.com**: Host del servidor SMTP para envío de correos (Gmail).
- **spring.mail.port=587**: Puerto del servidor SMTP.
- **spring.mail.username=shiwirockztar@gmail.com**: Usuario de la cuenta de correo.
- **spring.mail.password=bglvkdfxyfombzsz**: Contraseña de aplicación para la cuenta de Gmail.
- **spring.mail.properties.mail.smtp.auth=true**: Habilita la autenticación SMTP.
- **spring.mail.properties.mail.smtp.starttls.enable=true**: Habilita STARTTLS para conexiones seguras.
- **spring.mail.properties.mail.smtp.starttls.required=true**: Requiere STARTTLS para todas las conexiones.
- **spring.mail.properties.mail.smtp.connectiontimeout=5000**: Timeout de conexión en milisegundos (5 segundos).
- **spring.mail.properties.mail.smtp.timeout=5000**: Timeout de lectura en milisegundos (5 segundos).
- **spring.mail.properties.mail.smtp.writetimeout=5000**: Timeout de escritura en milisegundos (5 segundos).
- **app.frontend.url=http://localhost:4200**: URL del frontend de la aplicación (Angular corriendo en localhost:4200).

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
