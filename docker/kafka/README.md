# Kafka

Apache Kafka es una plataforma distribuida de streaming de datos en tiempo real, diseñada para procesar grandes volúmenes de información de forma rápida, escalable y tolerante a fallos.

Kafka se usa para:

- 📡 Recibir datos en tiempo real (telemetría, logs, eventos…).
- 💾 Almacenarlos de forma ordenada y duradera.
- 🚚 Enviarlos a uno o varios consumidores (procesos, microservicios, sistemas externos).

Funciona como un sistema de mensajería, donde los productores envían mensajes a temas (topics) y los consumidores leen esos mensajes.

- *Productores (Producers):* Envían datos a Kafka (por ejemplo, tus vehículos simuladores de telemetría).
- *Tópicos (Topics):* Es donde Kafka agrupa los mensajes (por ejemplo, telemetria-vehiculo).
  Los topics se dividen en particiones (permite paralelismo y escalabilidad).
- *Consumidores (Consumers):* Reciben los mensajes del topic.
  Pueden estar organizados en grupos de consumidores, lo que permite balancear la carga.
- *Brokers:* Son los nodos del clúster Kafka que almacenan y reparten los mensajes.


Kafka se caracteriza por:

- ✅ Alta disponibilidad y tolerancia a fallos.
- ✅ Escalabilidad horizontal (agregando más brokers).
- ✅ Persistencia de mensajes (almacenados en disco).
- ✅ Rendimiento alto (millones de mensajes por segundo).
- ✅ Soporte para múltiples lenguajes (Java, Python, Go, etc.).
- ✅ Integración con otras herramientas (Spark, Flink, etc.).
- ✅ API de Streams para procesamiento en tiempo real.
- ✅ API de Connect para integración con sistemas externos (bases de datos, sistemas de archivos, etc.).
- ✅ API de Admin para gestión y monitoreo del clúster.
- ✅ Soporte para transacciones (exactly-once semantics).
- ✅ Soporte para compresión de mensajes (gzip, snappy, lz4).


Kafka es especial por:

- *Persistencia:* guarda los datos por el tiempo que tú decidas (por defecto 7 días, o indefinidamente).
- *Alta performance:* maneja millones de eventos por segundo.
- *Escalable:* puedes agregar brokers y particiones.
- *Tolerancia a fallos:* replica datos entre nodos.

Kafka se usa en muchos casos de uso:

- 🏭 Telemetría de dispositivos IoT.
- 📊 Análisis de logs y eventos.
- 📈 Procesamiento de datos en tiempo real.
- 📦 Integración de sistemas (ETL).
- 📬 Mensajería entre microservicios.
- 📊 Análisis de datos en tiempo real.
- 📈 Monitoreo y alertas.
- 💬 Procesamiento de logs.
- 🛒 Seguimiento de actividad de usuarios en e-commerce.
- 🚗 Telemetría de vehículos


# ZooKeeper

ZooKeeper es un servicio centralizado de coordinación para aplicaciones distribuidas desarrolladas en Java por Apache.

ZooKeeper se encarga de:

- ✅ Mantener información de configuración compartida.
- ✅ Llevar un registro de estado común (como quién es líder).
- ✅ Gestionar la sincronización entre nodos.
- ✅ Manejar la tolerancia a fallos.

🧱 Ejemplo de uso clásico: Apache Kafka
En versiones anteriores de Kafka (hasta 2.x):

ZooKeeper se usaba para:
- Elegir qué broker era el líder.
- Llevar control de particiones.
- Detectar nuevos brokers.
- Coordinar consumidores.

***NOTA:*** A partir de Kafka 3.x se puede utilizar sin ZooKeeper (KRaft mode), pero muchos sistemas aún dependen de ZooKeeper.

### Author

- **Raul Bolivar Navas** - [rasysbox](https://github.com/raulrobinson/cqrs-clean-architecture-mapstruct-jpa)

### License

This project is licensed under the MIT License - see the [LICENSE](https://www.apache.org/licenses/LICENSE-2.0) file for details.
