# Dev Container para Spring Boot

Configuración mínima para desarrollar aplicaciones Spring Boot dentro del contenedor.

Extensiones recomendadas (se instalan automáticamente cuando abres el contenedor):

- Java Extension Pack (`vscjava.vscode-java-pack`)
- Maven for Java (`vscjava.vscode-maven`)
- Spring Boot Tools (`vscjava.vscode-spring-boot`)
- Spring Initializr (`pivotal.vscode-spring-initializr`)

Cómo usar:

1. Abre esta carpeta en VS Code.
2. Usa la paleta de comandos -> "Dev Containers: Reopen in Container".
3. Después de construir el contenedor, comprueba que Maven y Java estén disponibles con `mvn -v`.

Notas:

- Si alguna extensión no se instala por ID, abre la vista de extensiones y busca por su nombre.
- Puedes ajustar la imagen base en `devcontainer.json` si necesitas otra versión de Java o Maven.
