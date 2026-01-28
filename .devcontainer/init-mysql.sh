#!/bin/bash
set -e

echo "Actualizando lista de paquetes..."
sudo apt-get update --allow-insecure-repositories 2>/dev/null || true

echo "Instalando MariaDB..."
sudo DEBIAN_FRONTEND=noninteractive apt-get install -y mariadb-server mariadb-client

echo "Iniciando MariaDB..."
sudo service mariadb start || sudo mysqld_safe &
sleep 3

echo "Configurando contraseña de root..."
sudo mariadb -u root -e "ALTER USER 'root'@'localhost' IDENTIFIED BY '123456';" || true

echo "Creando base de datos..."
sudo mariadb -u root -p123456 -e "CREATE DATABASE IF NOT EXISTS pulsescreen_video;" || sudo mariadb -u root -e "CREATE DATABASE IF NOT EXISTS pulsescreen_video;"

echo "MariaDB instalado y listo"
