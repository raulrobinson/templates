-- Crear schema
CREATE SCHEMA IF NOT EXISTS telemetry;

-- Crear tabla ejemplo
CREATE TABLE IF NOT EXISTS telemetry.telemetry_data (
    id SERIAL PRIMARY KEY,
    vehicle_id VARCHAR(50) NOT NULL,
    latitude DOUBLE PRECISION NOT NULL,
    longitude DOUBLE PRECISION NOT NULL,
    speed DOUBLE PRECISION NOT NULL,
    timestamp TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);
