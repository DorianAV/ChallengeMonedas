# 🪙 Conversor de Monedas por Consola en Java

Este proyecto es una aplicación de consola en Java que permite convertir montos entre distintas monedas utilizando la API de [ExchangeRate API](https://www.exchangerate-api.com/). La aplicación sigue buenas prácticas de programación orientada a objetos (POO) y utiliza Maven para la gestión de dependencias.

## 🚀 Características

- Conversión en tiempo real con tasas de cambio actualizadas.
- Opciones disponibles:
    1. Dólar (USD) => Peso argentino (ARS)
    2. Peso argentino (ARS) => Dólar (USD)
    3. Dólar (USD) => Real brasileño (BRL)
    4. Real brasileño (BRL) => Dólar (USD)
    5. Dólar (USD) => Peso colombiano (COP)
    6. Peso colombiano (COP) => Dólar (USD)
    7. Dólar (USD) => Peso mexicano (MXN)
    8. Peso mexicano (MXN) => Dólar (USD)
    9. Salir

## 🧰 Tecnologías utilizadas

- Java 21
- Maven
- Gson (para parsear JSON)
- HttpClient (para realizar peticiones HTTP)

## ⚠️ Nota importante

> **Recuerda reemplazar la API key en `Main.java` por la tuya propia**:
>
> ```java
> ServicioMoneda servicio = new ServicioMoneda("AQUI_PONES_LA_KEY");
> ```