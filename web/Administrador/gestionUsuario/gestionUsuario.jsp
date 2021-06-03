<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="Administrador/styles/nav.css">
        <title>After Pizza</title>
    </head>
    <body>

        <div class="navbar">
            <div class="text-nav">
                <div class="dropdown padd">
                    <button class="dropbtn">Usuarios
                    </button>
                    <div class="dropdown-content">
                        <a href="ControlGestionUsuario?accion=agregar">Agregar Usuario</a>
                        <a href="ControlGestionUsuario?accion=listar">Listar Usuarios</a>
                    </div>
                </div>
                <div class="dropdown padd">
                    <button class="dropbtn">Productos
                    </button>
                    <div class="dropdown-content">
                        <a href="ControlProducto?accion=agregar">Agregar Productos</a>
                        <a href="ControlProducto?accion=listar">Listar Productos</a>
                    </div>
                </div>
                <div class="dropdown padd">
                    <button class="dropbtn">Categoria
                    </button>
                    <div class="dropdown-content">
                        <a href="ControlCategoria?accion=Agrega Categoria">Agregar Categoria</a>
                        <a href="ControlCategoria?accion=listarCategorias">Listar Categoria</a>
                    </div>
                </div>
                <div class="dropdown padd">
                    <button class="dropbtn">Pedido
                    </button>
                    <div class="dropdown-content">
                        <a href="ControlPedido?accion=agregar">Agregar Pedido</a>
                        <a href="ControlPedido?accion=listar">Listar Pedido</a>
                    </div>
                    
                </div>
            </div>
        </div>


        <div class="container2">
            <a name="an-modificar"></a>
            <!--empleados-->
            <div class="tittle-E">Zona Usuarios » Listar</div>
            <!--Tabla para visualizar Empleados-->
            <div class="table-container">
                <table>
                    <tr>
                        <th>Id</th>
                        <th>Nombre</th>
                        <th>rol</th>
                        <th>email</th>
                        <th>Domicillio</th>
                        <th>Foto</th>
                        <th>Operaciones</th>
                    </tr>
                    <c:forEach var="lis" items="${lista}">
                        <tr>
                            <td>${lis.getId_user()}</td>
                            <td>${lis.getNombre()}</td>
                            <td>${lis.getNom_rol()}</td>
                            <td>${lis.getEmail()}</td>
                            <td>${lis.getDomicilio()}</td>
                            <td>
                                <img src="${lis.getFoto()}" width="70" height="70">
                            </td>
                            <td>
                                <a href="ControlGestionUsuario?accion=editar&id=${lis.getId_user()}"><button class="b-editar">Editar</button></a>
                                <a href="ControlGestionUsuario?accion=eliminar&id=${lis.getId_user()}"><button class="b-eliminar">Eliminar</button></a>
                            </td>
                        </tr>
                    </c:forEach>
                    <!--
                    
                    -->    


                </table>
                <div class="tittle-E">
                <div class="b-agregar">
                    <a class="b-editar" href="index.jsp">Regresar al menú principal</a>
                </div>
            </div>
            </div>
        </div>

    </body>
</html>
