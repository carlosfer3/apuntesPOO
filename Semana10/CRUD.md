# Operaciones CRUD
Las siglas C.R.U.D. (Create, Read, Update y Delete) son las operaciones fundamentales que se realizan en todo sistema de gestión de datos. Esto permite poder interactuar con información almacenada.

---
## Operaciones CRUD en Java
Para realizar las operaciones CRUD en Java, se usan los siguientes tipos de variables.

- <i><b>PreparedStatement</b></i>: Es la que almacena el query.

- <i><b>ResultSet</b></i>: Es donde se guardan los datos obtenidos de la consulta.

- <i><b>executeQuery()</b></i>: Es un método del objeto PreparedStatement, es netamente para obtener datos, se ejecuta y se guarda en la variable de tipo ResultSet. <i>(Necesario para hacer <b>select</b>)</i>

- <i><b>executeUpdate()</b></i>: Es un método del objeto PreparedStatement, este método no retorna nada, solo se ejecuta. <i>(Necesario para hacer <b>insert</b>, <b>update</b> y <b>delete</b>)</i>

>
    //Primero declaras el query en un string
    String sql = "SELECT * FROM persona WHERE idPersona = ?";

    //Se usa el try catch para el manejo de errores
    try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
        stmt.setInt(1, id);

        //Se ejecuta el query y se obtienen los datos
        ResultSet rs = stmt.executeQuery();

        //Se recorren los datos obtenidos hasta llegar al ultimo
        if (rs.next()) {
            System.out.println(rs.getString("idPersona"));
            System.out.println(rs.getString("nombre"));
            ... //y asi con los demas datos de mi fila
        }

    } catch (SQLException e) {
        //Si hay error...
        e.printStackTrace();
    }

>