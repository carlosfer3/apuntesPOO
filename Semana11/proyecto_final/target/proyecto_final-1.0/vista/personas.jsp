<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
        <style>
            .container {
                border: 1px solid #000;
                border-radius: 10px;
                padding: 20px 30px;
            }
            .operacion {
                color: #fff;
                text-decoration: none;
            }
            .nuevo {
                font-size: 30px
            }
        </style>
        <title>Registro Personas</title>
    </head>
    <body>
        <div class="container">
            <a class="nuevo" href="${pageContext.request.contextPath}/PersonaControlador?accion=nuevo"><i class="fa fa-plus-circle"></i></a>
            <table class="table table-dark table-striped">
                <thead>
                    <tr>
                        <th>
                            ID
                        </th>
                        <th>
                            Nombre
                        </th>
                        <th>
                            Apellido
                        </th>
                        <th>
                            FechaNacimiento
                        </th>
                        <th>
                            Direccion
                        </th>
                        <th>
                            Distrito
                        </th>
                        <th>
                            Telefono
                        </th>
                        <th>
                            Acciones
                        </th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${personas}" var="persona">
                        <tr>
                            <td>
                                ${persona.id}
                            </td>
                            <td>
                                ${persona.nombre}
                            </td>
                            <td>
                                ${persona.apellido}
                            </td>
                            <td>
                                ${persona.fechaNacimiento}
                            </td>
                            <td>
                                ${persona.direccion}
                            </td>
                            <td>
                                ${persona.distrito}
                            </td>
                            <td>
                                ${persona.telefono}
                            </td>
                            <td>
                                <button class="btn btn-primary">
                                    <a class="operacion" href="${pageContext.request.contextPath}/PersonaControlador?accion=actualizar&id=${persona.id}">
                                        Actualizar
                                    </a>
                                </button>
                                <button class="btn btn-danger">
                                    <a onload="confirm('Esta seguro de que desea eliminar a este usuario?')" class="operacion" href="${pageContext.request.contextPath}/PersonaControlador?accion=eliminar&id=${persona.id}">
                                        Eliminar
                                    </a>
                                </button>
                            </td>
                        </tr>
                    </c:forEach>
                    <c:if test="${personas.size() == 0}">
                        <tr>
                            <td colspan="7">
                                No hay columnas
                            </td>
                        </tr>
                    </c:if>
                </tbody>
            </table> 
        </div>
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
    </body>
</html>
