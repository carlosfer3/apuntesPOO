>[!NOTA]<br>
>- La PC2 son dos partes independientes.
>- Usar patrones de diseño cracionales, hilos, y los principios solid como mejor le parezca.
>- Hacer el diagrama de clases para cada parte.
>- Para la presentación de la pc, se debe de grabar presentando el diagrama de clases, el funcionamiento del programa, y explicar donde y como utilizaste los patrones creacionales, los hilos y principios solid.


---
### PARTE 1
Elaborar un sistema de marcaciones para los trabajadores de una empresa, el horario de trabajo es desde las 07:00 hasta las 18:00, se debe de registrar tanto la fecha, la hora de entrada y la hora de salida. Luego generar un reporte del tiempo de compensación del trabajador, este es: Tiempo a favor - Tiempo en contra = Tiempo de compensación.

<div align='center'><img src='../img/marcacion.png' width='400'></div>

Se debe de crear un JFrame que contenga dos formularios para las marcaciones (aqui se simula que dos trabajadores o más marquen al mismo tiempo, se usan hilos y métodos sincronizados para evitar colapsos), una tabla donde se guarden las marcaciones de los empleados y se muestren, y por ultimo un botón que genere el reporte.

Los formularios deben de solicitar:
- código del trabajador
- fecha (se genera automaticamente del sistema)
- hora (se puede generar automaticamente del sistema o puedes colocar la hora a gusto)

La tabla debe de mostrar:
- código del trabajador
- fecha
- HIAI: hora que ingreso antes de la hora de ingreso (07:00)
- HIDI: hora que ingreso después de la hora de ingreso (07:00)
- HSAS: hora que salió antes de la hora de salida (18:00)
- HSDS: hora que salió después de la hora de salida (18:00)

El reporte debe de mostrar:
- código del trabajador
- fecha
- TF: tiempo a favor (HIAI + HSDS)
- TC: tiempo en contra (HIDI + HSAS)
- tiempo de compensación (TF - TC)

---
### PARTE 2
Elaborar un sistema de inventario, donde se puedan guardar productos, editar productos, y enviar productos a otro inventario.

<div align='center'><img src='../img/inventario.png' width='400'></div>

Se debe de crear un JFrame que contenga un formulario donde se ingresan los productos y su cantidad, y botones que realicen las operaciones de:
- Agregar a inventario X o Y
- Editar producto en el inventario X o Y
- Transferir producto del inventario X al inventario Y o viceversa
- Generar un reporte del historial de operaciones

Aplicar el uso de hilos para que varios trabajadores puedan guardar productos ya sea en un inventario o en otro, y a su vez para las diferentes acciones como editar el producto o transferir.

