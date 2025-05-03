# Patrones de Diseño
Los patrones de diseño (design patterns) son soluciones
habituales a problemas comunes en el diseño de
software. Cada patrón es como un plano que se
puede personalizar para resolver un problema de
diseño particular de tu código.

## TIPOS DE PATRONES DE DISEÑO
### 1. Patrones Creacionales
- Factory Method
- Abstract Factory
- Singleton
- Builder
- Prototype

### 2. Patrones Estructurales
- Adapter
- Bridge
- Composite
- Decorator
- Facade
- Flyweight
- Proxy

### 3. Patrones de Comportamiento
- Chain of Responsability
- Command
- Iterator
- Mediator
- Memento
- Observer
- State
- Strategy
- Template Method
- Visitor

---

## Patrones Creacionales
Un patrón creacional es una solución predefinida para el problema de cómo crear objetos de una forma flexible y reutilizable.

- <b>Factory Method</b>: 
Proporciona una interfaz para crear objetos pero permite a las subclases alterar el tipo de objetos que se crearán
- <b>Abstract Factory</b>:
Permite crear una fábrica de fábricas, donde cada fábrica concreta crea un conjunto específico de productos relacionados. 
- <b>Singleton</b>:
Nos permite asegurarnos de que una clase tenga una única instancia, a la vez que proporciona un punto de acceso global a dicha instancia.
- <b>Builder</b>:
Se usa para permitir la creación de una variedad de objetos complejos desde un objeto fuente.
- <b>Prototype</b>:
Permite la clonación de objetos, incluso los complejos, sin acoplarse a sus clases específicas.