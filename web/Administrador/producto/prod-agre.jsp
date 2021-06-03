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
            <div class="tittle-E">Zona Productos » Agregar</div>
            <div class="formulario">
                <form action="ControlProducto" method="POST" enctype="multipart/form-data">

                    <div class="row">
                        <div class="col-25">
                            <label for="lname">Nombre</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="name" name="nombre" placeholder="Nombre" required="">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="Description">Descripción</label>
                        </div>
                        <div class="col-75">
                            <textarea rows="6" cols="40" name="descripcion" placeholder="Descripción" 
                                      required="" id="Lname"></textarea>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="img">Imagen</label>
                        </div>
                        <div class="col-75">
                            <input type="file" id="img" name="imagen" placeholder="img" onchange="validarImagen()" 
                                   required="">
                        </div>
                    </div>
                    
                        <div class="row">
                            <div class="col-25">
                                <label for="Cargo">Categoría</label>
                            </div>
                            <div class="col-75">
                                <select id="job-tittle" name="categoria">
                                <c:forEach var="catP" items="${listC}">
                                    <option value="${catP.getId_categ()}">${catP.getNom_categ()}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="lname">Precio</label>
                        </div>
                        <div class="col-75">
                            <!--pattern: Expresión Regular-->
                            <input type="text" id="name" name="precio" placeholder="Precio" 
                                   required pattern="[0-9]+([\.][0-9]+)?">
                        </div>
                    </div>
                    <div class="row">
                        <br>
                        <input type="submit" name="accion" value="Agregar Producto">
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
