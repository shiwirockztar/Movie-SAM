#!/bin/bash
set -e

echo "Actualizando lista de paquetes..."
sudo apt-get update --allow-insecure-repositories 2>/dev/null || true

echo "Instalando MariaDB..."
sudo DEBIAN_FRONTEND=noninteractive apt-get install -y mariadb-server mariadb-client

echo "Iniciando MariaDB..."
sudo service mariadb start || sudo mysqld_safe &
sleep 3

echo "Creando base de datos..."
sudo mysql -u root -e "CREATE DATABASE IF NOT EXISTS pulsescreen_video;" || sudo mariadb -u root -e "CREATE DATABASE IF NOT EXISTS pulsescreen_video;"

echo "MariaDB instalado y listo"
