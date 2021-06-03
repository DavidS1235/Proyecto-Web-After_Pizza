<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="../styles/nav.css">
        <title>After Pizza</title>
    </head>
    <body>

        <div class="navbar">
            <div class="text-nav">
                <div class="dropdown padd">
                    <button class="dropbtn">Empleados
                    </button>
                    <div class="dropdown-content">
                        <a href="emple-agre.jsp">Agregar</a>
                        <a href="emple-mod.jsp">Modificar</a>
                    </div>
                </div>
                <div class="dropdown padd">
                    <button class="dropbtn">Productos
                    </button>
                    <div class="dropdown-content">
                        <a href="prod-agre.jsp">Agregar</a>
                        <a href="prod-mod.jsp">Modificar</a>
                    </div>
                </div>
                <div class="dropdown padd">
                    <button class="dropbtn">Categoria
                    </button>
                    <div class="dropdown-content">
                        <a href="categoria.jsp">Agregar / Modificar</a>
                        <!--<a href="#">Modificar</a>-->
                    </div>
                </div>
                <div class="dropdown padd">
                    <button class="dropbtn">Pedido
                    </button>
                    <div class="dropdown-content">
                        <a href="pedidos.jsp">Agregar / Modificar</a>
                        <!--<a href="#">Agregar</a>
                                  <a href="#">Modificar</a>-->
                    </div>
                </div>
                <!--
                          <div class="home  padd"><a href="#home">Home</a></div>
                -->
            </div>
        </div>


        <div class="container2">
            <div class="tittle-E">Zona Empleados » Agregar</div>
            <!--Form para agregar usuario-->
            <div class="formulario">
                <form action="/action_page.php">

                    <div class="row">
                        <div class="col-25">
                            <label for="lname">Nombre</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="name" name="Nombre" placeholder="Nombre">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="lname">Apellido</label>
                        </div>
                        <div class="col-75">
                            <input type="text" id="Lname" name="Apellido" placeholder="Apellido">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="edad">Edad</label>
                        </div>
                        <div class="col-75">
                            <input type="number" id="age" name="edad" placeholder="Edad">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="Cargo">Cargo</label>
                        </div>
                        <div class="col-75">
                            <select id="job-tittle" name="Cargo">
                                <option value=""></option>
                                <option value=""></option>
                                <option value=""></option>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="email">Correo</label>
                        </div>
                        <div class="col-75">
                            <input type="email" id="email" name="email" placeholder="Correo">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="telefono">Celular</label>
                        </div>
                        <div class="col-75">
                            <input type="tel" id="phone" name="phono" placeholder="Número de Celular">
                        </div>
                    </div>
                    <div class="row">
                        <br>
                        <input type="submit" value="Agregar Empleado">
                    </div>
                </form>
            </div>

            <div class="tittle-E">
                <div class="b-agregar">
                    <a class="b-editar" href="../index.jsp">Regresar al menú principal</a>
                </div>
            </div>
        </div>

    </body>
</html>
