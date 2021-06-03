<%-- 
    Document   : categ-agregar
    Created on : May 20, 2021, 3:40:56 PM
    Author     : David
--%>

<%@page import="modelo.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <style>
            <%@ include file="../styles/nav.css"%>
        </style>
        <title>After Pizza - Modificar Categoría</title>
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
            <div class="tittle-E">Zona Categorias » Modificar Categoría: ${cate.getId_categ()}</div>

            <div class="formulario">
                <form action="ControlCategoria" method="post">

                    <div class="row">
                        <div class="col-75">
                            <input type="hidden" readonly="readonly" id="name" name="idCateg" value="${cate.getId_categ()}">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="lname">Nombre de Categoria</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="Lname" name="nombre" value="${cate.getNom_categ()}">
                        </div>
                    </div>
                    <div class="row">
                        <br>
                        <input type="submit" name="accion" value="Modificar categoria">
                    </div>
                </form>
            </div>

            <div class="tittle-E">
                <div class="b-agregar">
                    <a class="b-editar" href="index.jsp">Regresar al menú principal</a>
                </div>
            </div>
        </div>

    </body>
</html>