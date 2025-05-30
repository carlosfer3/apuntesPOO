<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
        <title>Actualizar Persona</title>
    </head>
    <body>
        <div class="card">
            <div class="card-header">
                Actualizar Persona
            </div>
            <div class="card-body">
                <form method="POST" action="${pageContext.request.contextPath}/PersonaControlador?accion=actualizarPersona&id=${persona.id}">
                    <div class="agrupacion">
                        <label class="form-label">Ingrese su nombre</label>
                        <input type="text" name="nombre" class="form-control" value="${persona.nombre}" required>
                    </div>
                    <div class="agrupacion">
                        <label class="form-label">Ingrese su apellido</label>
                        <input type="text" name="apellido" class="form-control" value="${persona.apellido}" required>
                    </div>
                    <div class="agrupacion">
                        <label class="form-label">Ingrese su fecha de nacimiento</label>
                        <input type="date" name="fecha" class="form-control" value="${persona.fechaNacimiento}" required>
                    </div>
                    <div class="agrupacion">
                        <label class="form-label">Ingrese su direccion</label>
                        <input type="text" name="direccion" class="form-control" value="${persona.direccion}" required>
                    </div>
                    <div class="agrupacion">
                        <label class="form-label">Ingrese su distrito</label>
                        <select id="distrito" name="distrito" required>
                            <option value="">-- Selecciona un distrito --</option>

                            <c:forEach var="d" items="${distritos}">
                                <option value="${d}">${d}</option>
                             </c:forEach>

                         </select>
                    </div>
                    <div class="agrupacion">
                        <label class="form-label">Ingrese su telefono (9 digitos)</label>
                        <input type="number" name="telefono" class="form-control"
                            value="${persona.telefono != 0 ? persona.telefono : ''}"
                            required pattern="9\\d{8}" title="Debe comenzar con 9 y tener 9 dígitos">
                    </div>
                    <div class="agrupacion">
                        <input class="btn btn-primary" type="submit" value="Actualizar">
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
