# 📡 Comunicación entre Servicios en Spring

Este repositorio contiene ejemplos prácticos de comunicación entre microservicios utilizando diferentes clientes HTTP disponibles en el ecosistema de Spring.

El objetivo es mostrar las distintas alternativas, sus ventajas, desventajas y casos de uso recomendados.

---

## 🚀 Tecnologías utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring WebFlux
- Maven / Gradle

---

## 🧩 Estrategias de comunicación

En este proyecto se implementan tres enfoques principales:

### 1. 🧱 RestTemplate (Legacy)

`RestTemplate` es el cliente HTTP tradicional de Spring para comunicación síncrona.

#### Características:
- Bloqueante (blocking)
- Fácil de usar
- Actualmente en mantenimiento (no recomendado para nuevos desarrollos)

#### Ejemplo:

```java
@Autowired
private RestTemplate restTemplate;

public String getData() {
    return restTemplate.getForObject("http://localhost:8081/api/data", String.class);
}
```

#### 📌 Uso recomendado:
- Proyectos legacy
- Sistemas existentes que aún dependen de esta implementación

---

### 2. ⚡ RestClient (Moderno y simplificado)

`RestClient` es una alternativa moderna introducida en versiones recientes de Spring, con una API más fluida.

#### Características:
- Síncrono
- API más limpia y expresiva
- Reemplazo progresivo de RestTemplate

#### Ejemplo:

```java
RestClient restClient = RestClient.create();

String response = restClient.get()
    .uri("http://localhost:8081/api/data")
    .retrieve()
    .body(String.class);
```

#### 📌 Uso recomendado:
- Nuevos desarrollos síncronos
- Código más limpio y mantenible

---

### 3. 🌊 WebClient (Reactivo)

`WebClient` es el cliente HTTP no bloqueante basado en programación reactiva.

#### Características:
- No bloqueante (non-blocking)
- Basado en Reactor (Mono / Flux)
- Alta escalabilidad

#### Ejemplo:

```java
WebClient webClient = WebClient.create("http://localhost:8081");

Mono<String> response = webClient.get()
    .uri("/api/data")
    .retrieve()
    .bodyToMono(String.class);
```

#### 📌 Uso recomendado:
- Microservicios reactivos
- Alta concurrencia
- Integración con Spring WebFlux

---

## 🔄 Comparativa rápida

| Característica     | RestTemplate | RestClient | WebClient |
|------------------|-------------|-----------|----------|
| Tipo             | Síncrono     | Síncrono   | Reactivo |
| Bloqueante       | Sí           | Sí         | No       |
| Estado           | Legacy       | Actual     | Moderno  |
| Facilidad        | Alta         | Alta       | Media    |
| Escalabilidad    | Baja         | Media      | Alta     |

---

## 📁 Estructura del proyecto

```
src/
 ├── resttemplate/
 ├── restclient/
 └── webclient/
```

---

## ▶️ Cómo ejecutar

1. Clonar el repositorio:

```bash
git clone https://github.com/tu-repo/comunicacion-servicios.git
```

2. Ejecutar el proyecto:

```bash
./mvnw spring-boot:run
```

---

## 🧠 Conclusión

- Usa **RestTemplate** solo si mantienes sistemas antiguos.
- Prefiere **RestClient** para nuevas aplicaciones síncronas.
- Opta por **WebClient** si necesitas alto rendimiento y programación reactiva.
