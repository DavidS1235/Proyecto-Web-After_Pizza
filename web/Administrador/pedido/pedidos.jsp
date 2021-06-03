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
            <!--Tabla para visualizar Empleados-->
            
            <div class="table-container">
                <table>
                    <tr>
                        <th>Id DetalleBoleta</th>
                        <th>ID Boleta</th>
                        <th>Nombre Producto</th>
                        <th>Cantidad</th>
                        <th>PercioSubtotal</th>
                        <th>Estado</th>
                        <th>Operaciones</th>
                    </tr>
                    <c:forEach var="lis" items="${lista}">
                        
                    
                    <tr>
                        <td>${lis.getId_Detalle()}</td>
                        <td>${lis.getId_boleta()}</td>
                        <td>${lis.getNom_producto()}</td>
                        <td>${lis.getCant()}</td>
                        <td>${lis.getPrecioSubTotal()}</td>
                        <td>${lis.getEstado()}</td>
                        <td>
                            <a href="ControlPedido?accion=editar&id=${lis.getId_Detalle()}"><button class="b-editar">Editar</button></a>
                            <a href="ControlPedido?accion=eliminar&id=${lis.getId_Detalle()}"><button class="b-eliminar">Eliminar</button></a>
                        </td>
                    </tr>
                    </c:forEach>
                    
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
