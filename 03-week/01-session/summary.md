# Programación Orientada a Objetos (POO) y UML

---

## **1. Introducción a UML**

**UML (Lenguaje Unificado de Modelado)** es un lenguaje visual utilizado para modelar, diseñar y documentar sistemas orientados a objetos antes de su implementación en código.

Su objetivo principal es permitir:

- Visualizar la estructura del sistema.
- Representar relaciones entre clases.
- Detectar errores de diseño antes de programar.
- Facilitar la comunicación entre desarrolladores.

UML no es un lenguaje de programación, sino un lenguaje de modelado.

---

## **2. Programación Orientada a Objetos (POO)**

La **POO** es un paradigma de programación basado en la **abstracción del mundo real**.

Consiste en:

- Identificar entidades del mundo real.
- Representarlas como clases.
- Definir sus características (atributos).
- Definir sus comportamientos (métodos).

### Principios fundamentales de la POO

1. **Abstracción**
   - Representar solo las características esenciales de un objeto.
   - Ignorar detalles innecesarios.

2. **Encapsulamiento**
   - Proteger los datos.
   - Controlar el acceso mediante niveles de visibilidad.

3. **Herencia**
   - Permite que una clase herede características y comportamientos de otra.

4. **Polimorfismo**
   - Permite que un mismo método tenga diferentes comportamientos.

---

## **3. Diagrama de Clases**

El **diagrama de clases** es una representación gráfica de las clases del sistema y sus relaciones.

Una clase en UML se divide en tres partes:

1. Nombre
2. Atributos
3. Métodos

---

## **4. Componentes de una Clase**

### **4.1 Nombre de la Clase**

Representa la entidad del mundo real.

Ejemplo:

- `Persona`

La clase Persona representa un conjunto de datos relacionados con una persona.

---

### **4.2 Atributos**

Son las características o propiedades de una clase.

Ejemplo: Clase `Persona`

- `Peso`
- `Estatura`
- `Edad`
- `Nombre`
- `Genero`

### Buenas prácticas con atributos

- Deben representar propiedades propias de la clase.
- No deben agregarse atributos que pertenezcan a otra entidad.
- Evitar mezclar responsabilidades.

Ejemplo:
- `email` puede no ser propio de Persona dependiendo del diseño.
- Podría pertenecer a otra clase como `Cuenta` o `Usuario`.

---

### **4.3 Métodos**

Son las acciones que puede realizar la clase.

Ejemplo: Clase `Persona`

- `Caminar()`
- `Dormir()`
- `Comer()`
- `Escuchar()`

### Buenas prácticas con métodos

- Deben representar comportamientos propios de la clase.
- No deben incluir acciones que correspondan a otra entidad más específica.

Ejemplo:
- `Conducir()` podría pertenecer a una subclase como `Conductor`.
- `Cantar()` podría pertenecer a una subclase como `Cantante`.

---

## **5. Visibilidad en UML**

La visibilidad determina quién puede acceder a los atributos o métodos.

Símbolos utilizados:

- `-` → Privado (private)
- `+` → Público (public)
- `#` → Protegido (protected)

### Descripción

- **Privado (-)**  
  Solo accesible dentro de la misma clase.

- **Público (+)**  
  Accesible desde cualquier clase.

- **Protegido (#)**  
  Accesible dentro de la clase y sus subclases.

Esto es parte del principio de encapsulamiento.

---

## **6. Convenciones de Escritura (Naming Conventions)**

Existen diferentes estilos para nombrar variables, métodos y clases.

### **6.1 Snake Case (underscore)**

- `nombre_materia`
- `numero_registro`

### **6.2 camelCase**

- `nombreMateria`
- `numeroRegistro`

Se usa comúnmente para:
- Variables
- Métodos

### **6.3 PascalCase**

- `NombreMateria`
- `NumeroRegistro`

Se usa comúnmente para:
- Clases

---

## **7. Objeto e Instancia**

Un **objeto** es la instancia de una clase.

La clase define:
- Qué atributos tiene.
- Qué métodos puede ejecutar.

El objeto representa:
- Una implementación concreta con datos reales.

---

### Ejemplo en código

```java
Persona persona = new Persona();