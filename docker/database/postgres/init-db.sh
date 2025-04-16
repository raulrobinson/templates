#!/bin/bash
set -e

# Variables de entorno requeridas:
# POSTGRES_USER, POSTGRES_DB, POSTGRES_PASSWORD

# Ruta del SQL externo
SQL_FILE="/scripts/init.sql"

# Ejecuta el SQL dentro del contenedor
psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" -f "$SQL_FILE"
