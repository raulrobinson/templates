# RabbitMQ

🐰 RabbitMQ es un message broker de código abierto que se utiliza para enviar, recibir y almacenar mensajes entre aplicaciones o servicios de forma confiable y asincrónica.

### Uso común:

RabbitMQ actúa como intermediario entre aplicaciones que necesitan comunicarse entre sí pero que no necesitan hacerlo en el mismo instante.

Por ejemplo:
- 📬 Un microservicio envía una orden a otro sin esperar su respuesta inmediata.
- 🚚 Un sistema de pedidos envía datos para ser procesados en segundo plano.
- 📦 Una API recibe datos y los pone en cola para procesarlos luego.


### Funcionamiento:

- *Productores (Producers):* Envían mensajes a RabbitMQ.
- *Exchanges:* Reciben los mensajes del productor y los dirigen a una o más colas, según reglas definidas (routing keys, tipo de exchange, etc.).
- *Colas (Queues):* Almacenan los mensajes hasta que los consumidores los procesen.
- *Consumidores (Consumers):* Reciben y procesan los mensajes desde las colas.

⚙️ Tipos de exchanges en RabbitMQ:
- *direct:* Enruta según una clave exacta (routing key).
- *fanout:* Envía el mensaje a todas las colas conectadas.
- *topic:* Enruta por patrones (*.log, sensor.#, etc).
- *headers:* Enruta según cabeceras del mensaje.

🆚 *¿RabbitMQ vs Kafka?:*

| Característica             | RabbitMQ                          | Kafka                                        |
|----------------------------|-----------------------------------|----------------------------------------------|
| Modelo                     | Mensajería tradicional (cola)     | Streaming distribuido (log de eventos)       |
| Retención                  | Borra mensajes una vez consumidos | Mantiene mensajes por un tiempo definido     |
| Orden de mensajes          | Garantizado por cola              | Garantizado por partición                    |
| Casos de uso comunes       | Microservicios, sistemas legacy   | Big data, telemetría, eventos en tiempo real |
| Rendimiento (alto volumen) | Bueno                             | Excelente (mejor en eventos masivos)         |

- *RabbitMQ* es ideal para sistemas que requieren baja latencia y alta confiabilidad en la entrega de mensajes.
- *Kafka* es mejor para sistemas que manejan grandes volúmenes de datos y requieren procesamiento en tiempo real.
- Ambos pueden coexistir en una arquitectura, utilizando RabbitMQ para la mensajería y Kafka para el procesamiento de eventos masivos.

### Author

- **Raul Bolivar Navas** - [rasysbox](https://github.com/raulrobinson/cqrs-clean-architecture-mapstruct-jpa)

### License

This project is licensed under the MIT License - see the [LICENSE](https://www.apache.org/licenses/LICENSE-2.0) file for details.


