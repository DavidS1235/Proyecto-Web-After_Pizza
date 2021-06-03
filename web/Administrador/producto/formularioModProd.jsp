<%@page import="modeloDAO.ProductoDAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="modelo.Producto"%>
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
            <div class="tittle-E">Zona Productos » Modificar Producto</div>
            <div class="formulario">
                <form action="ControlProducto" method="POST" enctype="multipart/form-data">

                    <input type="hidden" name="codigoP" value="${P.getIdProducto()}">

                    <div class="row">
                        <div class="col-25">
                            <label for="lname">Nombre</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="name" name="nombre" placeholder="Nombre" required="" value="${P.getNombre()}">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="Description">Descripción</label>
                        </div>
                        <div class="col-75">
                            <textarea rows="6" cols="40" name="descripcion" placeholder="Descripción" 
                                      required="" id="Lname">${P.getDescripcion()}</textarea>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            
                        </div>
                        <div class="col-75">
                            <center>
                                <img border="3px solid" width="180px" height="180px" name="img" src="Administrador/producto/imagenes/${P.getImagen()}">
                                <input type="hidden" name="img" value="${P.getImagen()}">
                            </center>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="img">Imagen</label>
                        </div>
                        <div class="col-75">
                            <input type="file" id="img" name="image" placeholder="img" onchange="validarImagen()">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="lname">Precio</label>
                        </div>
                        <div class="col-75">
                            <!--pattern: Expresión Regular-->
                            <input type="text" id="name" name="precio" placeholder="Precio" 
                                   value="${P.getPrecioU()}" required="" pattern="[0-9]{2,3}(?.[0-9]{1,2})">
                        </div>
                    </div>
                    <div class="row">
                        <br>
                        <input type="submit" name="accion" value="Modificar Producto">
                    </div>
                </form>
                <div class="tittle-E">
                    <div class="b-agregar">
                        <a class="b-editar" href="index.jsp">Regresar al menú principal</a>
                    </div>
                </div>
            </div>

        </div>
        <script type="text/javascript" src="AlertaImg.js"></script>            
    </body>

</html>
