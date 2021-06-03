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
                    <button class="dropbtn">Categoria
                    </button>
                    <div class="dropdown-content">
                        <a href="ControlPedido?accion=agregar">Agregar Pedido</a>
                        <a href="ControlPedido?accion=listar">Listar Pedido</a>
                    </div>
                    
                </div>
            </div>
        </div>

        <div class="container2">
            <div class="tittle-E">Zona Pedido » Agregar</div>
            <!--Form para agregar usuario-->
            <div class="formulario">
                <form action="ControlPedido" method="POST">

                    <div class="row">
                        <div class="col-25">
                            <label for="Producto">Producto</label>
                        </div>
                        
                      <div class="col-75">
                            <select id="job-tittle" name="Producto">
                                
                                <c:forEach var="lisP" items="${listaProducto}">
                                <option value="${lisP.getIdProducto()}">${lisP.getNombre()}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="Boleta">Boleta</label>
                        </div>
                        
                      <div class="col-75">
                            <select id="job-tittle" name="Boleta">
                                <c:forEach var="lisB" items="${listaBoleta}">
                                <option value="${lisB.getIdBoleta()}">${lisB.getIdBoleta()}</option>
                                
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="Cantidad">Cantidad</label>
                        </div>
                        <div class="col-75">
                            <input type="number" id="email" name="Cantidad" placeholder="Cantidad" min="1">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="Estado">Estado</label>
                        </div>
                        <div class="col-75">
                            <select id="job-tittle" name="Estado">
                                <option value="PENDIENTE">PENDIENTE</option>
                                <option value="COMPRADO">COMPRADO</option>
                                <option value="CANCELADO">CANCELADO</option>
                            </select>
                        </div>
                    </div>
                    
                    
                    <div class="row">
                        <br>
                        <input type="submit" name="accion" value="Agregar Producto a Boleta">
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
