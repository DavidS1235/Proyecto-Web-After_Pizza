<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8;">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <style>
            <%@ include file="../styles/nav.css"%>
        </style>
        <title>After Pizza - Categorias</title>
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
            <div class="tittle-E">Categorias 
            </div>
            <!--Tabla para visualizar Categorias-->
            <div class="table-container">
                <table>
                    <tr>
                        <th>ID Categoría</th>
                        <th>Nombre</th>
                        <th>Operaciones</th>
                    </tr>
                    <c:forEach var="lis" items="${listacat}">
                        <tr>
                            <td>${lis.getId_categ()}</td>
                            <td>${lis.getNom_categ()}</td>
                            <td>
                                <a href="ControlCategoria?accion=modificaCategoria&Id=${lis.getId_categ()}">
                                    <button class="b-editar" >Editar</button>
                                </a>
                                <a href="ControlCategoria?accion=eliminarCategoria&Id=${lis.getId_categ()}">
                                    <button class="b-eliminar" >Eliminar</button> 
                                </a>

                            </td>
                        </tr>
                    </c:forEach>


                </table>
                <div class="tittle-E">
                    <div class="b-agregar" >
                        <a class="b-editar" href="index.jsp">Regresar al menú principal</a>
                    </div>
                </div>
            </div>
        </div>



    </body>
</html>
