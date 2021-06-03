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
            <div class="tittle-E">Zona Empleados » Editar</div>
            <!--Form para agregar usuario-->
            <div class="formulario">
                <form action="ControlGestionUsuario" method="POST" enctype="multipart/form-data">
                    
                    <div class="row">
                        <div class="col-25">
                            <label for="lname">Nombre</label>
                        </div>
                        
                        <div class="col-75">
                            
                            <input type="text" id="lname" name="Nombre" value="${user.getNombre()}" placeholder="Nombre" >
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="Cargo">Rol</label>
                        </div>
                        
                        <div class="col-75">
                            <select id="job-tittle" name="Rol">
                                <c:forEach var="lisR" items="${listaRol}">
                                    <c:if test="${lisR.getId().equalsIgnoreCase(user.getId_rol())}">
                                        <option value="${lisR.getId()}" selected="">${lisR.getName()}</option>
                                    </c:if>
                                    <c:if test="${!(lisR.getId().equalsIgnoreCase(user.getId_rol()))}">
                                        <option value="${lisR.getId()}" >${lisR.getName()}</option>
                                    </c:if>
                                   
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="email">Correo</label>
                        </div>
                        <div class="col-75">
                            <input type="email" id="email" name="email" placeholder="Correo" value="${user.getEmail()}">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="pass">Contraseña</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="pass" name="pass" placeholder="Contraseña" value="${user.getPassword()}">
                        </div>
                    </div>
                    
                    <div class="row">
                        <div class="col-25">
                            <label for="Domi">Domicilio</label>
                        </div>
                        <div class="col-75">
                            <input type="text" name="domicilio" placeholder="Domicilio" value="${user.getDomicilio()}">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="telefono">Foto</label>
                        </div>
                        <div class="col-75">
                            <img hidden="" src="${user.getFoto()}" width="70" height="70">
                            <input type="File" id="phone" name="foto" >
                        </div>
                    </div>
                    <input type="text"  hidden=""  name="id" value="${user.getId_user()}">
                    <input type="text"   hidden=""  name="fotopath" value="${user.getFoto()}">
                    
                    <div class="row">
                        <br>
                        <input type="submit"  name="accion" value="Editar Usuario">
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
