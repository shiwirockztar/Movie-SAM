# Movie-SAM
Netflix Clone — Spring Boot (Java) + Angular + MySQL

## 📦 Configuración del Devcontainer

Este proyecto incluye un **devcontainer** preconfigurado que instala y configura automáticamente **MariaDB (MySQL 10.5)** cuando inicias o reconstruyes el Codespaces.

### ¿Qué se instala automáticamente?

Cuando inicia el devcontainer, se ejecuta el script [.devcontainer/init-mysql.sh](.devcontainer/init-mysql.sh) que:

✅ Instala MariaDB Server y MariaDB Client  
✅ Inicia el servicio de base de datos automáticamente  
✅ Crea la base de datos `pulsescreen_video` (lista para usar)

### ¿Cómo verificar que MariaDB está corriendo?

Una vez iniciado el Codespaces, ejecuta en la terminal:

```bash
# Ver la versión de MariaDB instalada
mariadb --version

# Verificar que el servicio está activo
sudo service mariadb status

# Listar todas las bases de datos
sudo mariadb -u root -p123456 -e "SHOW DATABASES;"
```

### Conectarse a la base de datos

```bash
# Conectar como usuario root (la contraseña es: 123456)
sudo mariadb -u root -p123456

# O directamente a la base de datos del proyecto
sudo mariadb -u root -p123456 pulsescreen_video
```

**Nota:** La contraseña se configura automáticamente durante la inicialización del devcontainer.

### Mostrar las tablas por consola

```bash
# MariaDB [pulsescreen_video]>  SHOW TABLES;
SHOW TABLES;

select * from users;

desc users;
```

### Si necesitas reiniciar MariaDB

```bash
sudo service mariadb restart
```

## 🚀 Ejecución del Proyecto

### Requisitos previos


Antes de ejecutar el proyecto Spring Boot, asegúrate de que **MariaDB esté iniciado**:

```bash
# 1. Iniciar el servicio de MariaDB (si no está activo)
sudo service mariadb start

# 2. Verificar que todo está correcto
sudo mariadb -u root -p123456 -e "USE pulsescreen_video; SELECT 'Conexión exitosa' as status;"
```

### Ejecutar la aplicación Spring Boot

Una vez configurada la base de datos, ejecuta:

```bash
cd "Spring Boot/com.netflix.clone"
./mvnw clean spring-boot:run
```

La aplicación estará disponible en: **http://localhost:8080**

### Pasos completos cada vez que entres al Codespaces

```bash
# 1. Iniciar MariaDB
sudo service mariadb start

# 2. Navegar al directorio del proyecto
cd "Spring Boot/com.netflix.clone"

# 3. Ejecutar la aplicación
./mvnw clean spring-boot:run
```

**Nota:** La contraseña de root es `123456` (configurada automáticamente durante la inicialización).

### Configuración del devcontainer

La configuración se encuentra en [.devcontainer/devcontainer.json](.devcontainer/devcontainer.json) y [.devcontainer/init-mysql.sh](.devcontainer/init-mysql.sh).

Si realizas cambios en estos archivos, reconstruye el devcontainer:
- En VS Code: **Ctrl+Shift+P** → `Dev Containers: Rebuild Container`
- En Codespaces: Usa el menú desplegable de Codespaces 
