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
            <div class="tittle-E">Zona Pedido » Editar</div>
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
                                    <c:if test="${lisP.getNombre().equalsIgnoreCase(DetalleCompra.getNom_producto())}">
                                        <option value="${lisP.getIdProducto()}" selected="">${lisP.getNombre()}</option>
                                    </c:if>
                                    <c:if test="${!(lisP.getNombre().equalsIgnoreCase(DetalleCompra.getNom_producto()))}">
                                        <option value="${lisP.getIdProducto()}">${lisP.getNombre()}</option>
                                    </c:if>

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
                                    <c:if test="${lisB.getIdBoleta().equalsIgnoreCase(DetalleCompra.getId_boleta())}">
                                        <option value="${lisB.getIdBoleta()}" selected="">${lisB.getIdBoleta()}</option>
                                    </c:if>
                                        
                                    <c:if test="${!(lisB.getIdBoleta().equalsIgnoreCase(DetalleCompra.getId_boleta()))}">
                                        <option value="${lisB.getIdBoleta()}">${lisB.getIdBoleta()}</option>
                                    </c:if>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="Cantidad">Cantidad</label>
                        </div>
                        <div class="col-75">
                            <input type="number" id="email" name="Cantidad" placeholder="Cantidad" min="1" value="${DetalleCompra.getCant()}">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="Estado">Estado</label>
                        </div>
                        <div class="col-75">
                            <select id="job-tittle" name="Estado">
                                <c:if test="${DetalleCompra.getEstado().equalsIgnoreCase('PENDIENTE')}"> 
                                   <option value="PENDIENTE" selected="">PENDIENTE</option>
                                   <option value="COMPRADO" >COMPRADO</option> 
                                   <option value="CANCELADO" >CANCELADO</option>
                                
                                </c:if>
                                
                                   
                                <c:if test="${DetalleCompra.getEstado().equalsIgnoreCase('COMPRADO')}" >
                                    <option value="PENDIENTE">PENDIENTE</option>
                                    <option value="COMPRADO" selected="">COMPRADO</option> 
                                    <option value="CANCELADO">CANCELADO</option>
                                </c:if >
                                
                                   
                                 <c:if test="${DetalleCompra.getEstado().equalsIgnoreCase('CANCELADO')}">
                                    <option value="PENDIENTE">PENDIENTE</option>
                                    <option value="COMPRADO">COMPRADO</option>
                                    <option value="CANCELADO" selected="">CANCELADO</option> 
                                </c:if>
                                
                                     
                            </select>
                        </div>
                    </div>
                                <input type="text" hidden="" name="id" value="${DetalleCompra.getId_Detalle()}">


                    <div class="row">
                        <br>
                        <input type="submit" name="accion" value="Editar Boleta">
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
