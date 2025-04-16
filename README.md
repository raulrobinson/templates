# Template Collection

This is a collection of templates for various purposes.

### Communication between clients and servers

- HTTP (REST): Hypertext Transfer Protocol
- WebSocket: Full-duplex communication channels over a single TCP connection
- gRPC: Remote Procedure Call framework
- GraphQL: Query language for APIs
- MQTT: Lightweight messaging protocol for small sensors and mobile devices
- AMQP: Advanced Message Queuing Protocol
- STOMP: Simple Text Oriented Messaging Protocol

#### HTTP (REST)

Classic request/response-based protocol. REST is the most common approach to HTTP.

***Advantages:***
- Simple, widely supported.
- Uses JSON.
- Easy to debug and cache.
- Good for CRUD operations.

***Use cases:***
- Public APIs.
- Typical CRUD systems.
- Microservices that don't require real-time support.

### WebSocket

Bidirectional protocol over TCP. Allows for maintaining an open connection between client and server.

***Advantages:***
- Real-time (low latency).
- Full-duplex communication.
- Ideal for live updates.

***Use cases:***
- Chats.
- Multiplayer games.
- Real-time tracking (e.g., your vehicle map).

### gRPC

Google's RPC framework based on HTTP/2 and Protobuf.

***Advantages:***
- High efficiency and performance.
- Supports data streaming.
- Defined contracts (IDL with .proto).
- Better compression and speed than REST.

***Use cases:***
- Internal microservices.
- Communication between backend services.
- APIs where performance is critical.

### GraphQL

Query language for APIs. The client specifies exactly what data it wants.

***Advantages:***
- Eliminates over- and under-fetching.
- Strong typing.
- Automatic documentation.
- Very flexible for UIs.

***Use cases:***
- Complex front-end applications.
- Aggregation of multiple data sources.
- APIs with many resource types.

### MQTT

Lightweight messaging protocol for small sensors and mobile devices.

***Advantages:***
- Low bandwidth.
- Efficient for low-power devices.
- Supports QoS levels.
- Ideal for IoT.
- Supports publish/subscribe.
- Lightweight.
- Low latency.
- Reliable message delivery.

***Use cases:***
- IoT devices.
- Sensor networks.
- Mobile applications.
- Real-time data streaming.
- Telemetry.
- Remote monitoring.
- Control systems.

### AMQP

Advanced Message Queuing Protocol. A standard for message-oriented middleware.

***Advantages:***
- Reliable message delivery.
- Supports multiple messaging patterns.
- Flexible routing.
- Supports transactions.
- Interoperability between different systems.
- Supports multiple programming languages.
- Supports multiple transport protocols.

***Use cases:***
- Enterprise messaging.
- Asynchronous processing.
- Event-driven architectures.
- Microservices communication.
- Distributed systems.
- Integration between different systems.
- Message-oriented middleware.

### STOMP

Simple Text Oriented Messaging Protocol. A simple and widely supported protocol for message-oriented middleware.

***Advantages:***
- Simple and easy to use.
- Text-based protocol.
- Supports multiple messaging patterns.
- Interoperability between different systems.
- Supports multiple programming languages.
- Supports multiple transport protocols.
- Supports WebSocket.
- Supports publish/subscribe.
- Supports point-to-point messaging.

***Use cases:***
- Real-time applications.
- WebSocket communication.
- Event-driven architectures.
- Microservices communication.
- Distributed systems.
- Integration between different systems.
- Message-oriented middleware.
- Chat applications.
- Collaborative applications.

### General use cases examples

It depends on each case:
- Real-time telemetry: → *WebSocket or gRPC (streaming).*
- Traditional CRUD API: → *REST.*
- Frontend app that needs specific data: → *GraphQL.*
- Efficient communication between microservices: → *gRPC.*



### Author

- **Raul Bolivar Navas** - [rasysbox](https://github.com/raulrobinson/cqrs-clean-architecture-mapstruct-jpa)

### License

This project is licensed under the MIT License - see the [LICENSE](https://www.apache.org/licenses/LICENSE-2.0) file for details.