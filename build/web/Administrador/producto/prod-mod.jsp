<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="Administrador/styles/nav.css">
        <!--<link rel="stylesheet" href="pantallaCarga/estiloCarga.css">-->
        <title>After Pizza</title>
    </head>
    <body>
        <!--
        <div class="contenedorCargaPantalla">
            <div class="cargando">
                <div class="linea"></div>
                <div class="linea"></div>
                <div class="linea"></div>
                <div class="linea"></div>
                <div class="linea"></div>
                <div class="linea"></div>
                <div class="linea"></div>
                <div class="linea"></div>
            </div>
        </div>
        -->
        
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

            <!--Productos-->
            <div class="tittle-E">Zona Productos » Modificar</div>
            <!--Tabla para visualizar Empleados-->
            <div class="table-container">
                <table>
                    <tr>
                        <th>Nombre</th>
                        <th>Descripción</th>
                        <th>Imagen</th>
                        <th>Categoria</th>
                        <th>Precio</th>
                        <th>Operaciones</th>
                    </tr>
                    <!--
                        Creamos una variable llamada "productoDAO" de tipo "ProductoDAO"
                        que se encuentra en el paquete "modeloDAO"
                    -->
                    
                    <c:forEach var="listaP" items="${lista}">
                    <tr>
                        <td>${listaP.getNombre()}</td>
                        <td>
                            <textarea rows="6" cols="40" required="" readonly>${listaP.getDescripcion()}</textarea>
                        </td>
                        <td>
                            <img width="100px" height="100px" src="Administrador/producto/imagenes/${listaP.getImagen()}">
                        </td>
                        <td>${listaP.getNombreCategoria()}</td>
                        <td>${listaP.getPrecioU()}</td>
                        <td>
                                <a href="ControlProducto?accion=EditarProducto&codigoP=${listaP.getIdProducto()}"><button class="b-editar" value="Editar Producto">
                                    Editar Producto
                                </button></a>
                                <a href="ControlProducto?accion=Eliminar Producto&codigoP=${listaP.getIdProducto()}&nombreImg=${listaP.getImagen()}"><button class="b-eliminar" name="accion" value="Eliminar Producto">
                                    Eliminar
                                </button></a>
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
