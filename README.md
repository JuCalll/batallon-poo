# TallerPOO - Sistema de Gestión de Batallón

**Autor:** Juan Camilo Orozco Londoño

## Descripción

Proyecto de Taller de Programación Orientada a Objetos que implementa un sistema de gestión militar para administrar la estructura jerárquica de un batallón, incluyendo pelotones, escuadras y soldados.

## Estructura del Proyecto

```
TallerPOO/
├── src/
│   ├── main/
│   │   └── Main.java          # Clase principal con menú interactivo
│   ├── model/
│   │   ├── Batallon.java      # Clase Batallón
│   │   ├── Peloton.java       # Clase Pelotón
│   │   ├── Escuadra.java      # Clase Escuadra
│   │   └── Soldado.java       # Clase Soldado
│   └── enums/
│       ├── TipoBatallon.java
│       ├── TipoPeloton.java
│       ├── TipoEscuadra.java
│       └── RangoSoldado.java
└── tests/
    ├── EscuadraTest.java
    └── SoldadoTest.java
```

## Tecnologías Utilizadas

- **Java 17**
- **Maven** (Gestión de dependencias)
- **JUnit 4.13.2** (Pruebas unitarias)

## Requisitos

- JDK 17 o superior
- Maven 3.6 o superior

## Funcionalidades

- Gestión de soldados dentro de escuadras
- Visualización de reportes del batallón
- Cambio de código OTAN (método estático)
- Validación de capacidad de escuadras
- Control de estado de salud de soldados

