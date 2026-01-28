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
sudo mariadb -u root -e "SHOW DATABASES;"
```

### Conectarse a la base de datos

```bash
# Conectar como usuario root (sin contraseña)
sudo mariadb -u root

# O directamente a la base de datos del proyecto
sudo mariadb -u root pulsescreen_video
```

### Si necesitas reiniciar MariaDB

```bash
sudo service mariadb restart
```

### Configuración del devcontainer

La configuración se encuentra en [.devcontainer/devcontainer.json](.devcontainer/devcontainer.json) y [.devcontainer/init-mysql.sh](.devcontainer/init-mysql.sh).

Si realizas cambios en estos archivos, reconstruye el devcontainer:
- En VS Code: **Ctrl+Shift+P** → `Dev Containers: Rebuild Container`
- En Codespaces: Usa el menú desplegable de Codespaces 
