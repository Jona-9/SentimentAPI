🎯 SentimentAPI Backend - Spring Boot
<div align="center">
Mostrar imagen
Mostrar imagen
Mostrar imagen
API REST Gateway para Sistema de Análisis de Sentimientos
Proyecto desarrollado para Hackathon ONE - No Country
</div>

📖 Descripción
API REST desarrollada en Spring Boot 4.0.1 que actúa como gateway backend para el sistema de análisis de sentimientos de reseñas Amazon en español. Consume el modelo ML expuesto por la API Python (FastAPI) y proporciona validación, manejo de errores y transformación de datos.
Características principales:

✅ Validación robusta de entrada (5-500 caracteres)
🔄 Integración con modelo ML mediante RestTemplate
⭐ Transformación de estrellas numéricas a Unicode (★)
🛡️ Manejo global de excepciones
📊 Patrón DTO para desacoplamiento


📁 Estructura del Proyecto
sentimentapi/
│
├── src/main/java/com/project/sentimentapi/
│   ├── SentimentapiApplication.java              # Clase principal
│   ├── controller/
│   │   └── SentimentApiController.java           # Endpoints REST
│   ├── service/
│   │   ├── SentimentService.java                 # Interfaz
│   │   └── SentimentServiceImplement.java        # Lógica de integración
│   ├── dto/
│   │   └── ResponseDto.java                      # Transfer Object
│   └── globalexceptionhandler/
│       └── ExceptionHandler.java                 # Manejo de errores
│
├── src/main/resources/
│   └── application.properties                     # Configuración
│
├── pom.xml                                        # Dependencias Maven
└── mvnw / mvnw.cmd                               # Maven Wrapper

🚀 Cómo Usar
Prerrequisitos

☕ Java 17+
🐍 Python API corriendo en http://127.0.0.1:8000

Instalación
Linux/Mac:
bash./mvnw clean install
./mvnw spring-boot:run
Windows:
cmdmvnw.cmd clean install
mvnw.cmd spring-boot:run
Endpoints
Base URL: http://localhost:8080/project/api/v1
POST /sentiment/analyze
bashcurl -X POST http://localhost:8080/project/api/v1/sentiment/analyze \
  -H "Content-Type: text/plain" \
  -d "Producto increíble, superó mis expectativas"
Respuesta:
json{
  "prevision": "Positivo",
  "probabilidad": 0.9234,
  "calificación": "★ ★ ★ ★ ★"
}

✨ Características Destacadas
1. Validación Declarativa
java@NotBlank(message = "Se ha ingresado un mensaje vacio")
@Size(min = 5, max = 500)
```

### 2. **Transformación Visual de Estrellas**
| Input | Output |
|-------|--------|
| 5 | ★ ★ ★ ★ ★ |
| 3 | ★ ★ ★ |
| 1 | ★ |

### 3. **Manejo Resiliente de Errores**
- ✅ Validación automática (400 Bad Request)
- ✅ Error de conexión con Python API (502 Bad Gateway)
- ✅ Respuestas estructuradas y consistentes

### 4. **Arquitectura en Capas**
```
Controller → Service → RestTemplate → Python API (ML Model)

<div align="center">
Desarrollado con ❤️ para Hackathon ONE
🔗 Integrado con SentimentAPI Python/ML
</div>Claude es IA y puede cometer errores. Por favor, verifica nuevamente las respuestas.
