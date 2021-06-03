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
            <a name="an-modificar"></a>
            <!--empleados-->
            <div class="tittle-E">Zona Empleados » Modificar</div>
            <!--Tabla para visualizar Empleados-->
            <div class="table-container">
                <table>
                    <tr>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Edad</th>
                        <th>Cargo</th>
                        <th>Correo</th>
                        <th>Celular</th>
                        <th>Modificar</th>
                    </tr>
                    <tr>
                        <td>.</td>
                        <td>.</td>
                        <td>.</td>
                        <td>.</td>
                        <td>.</td>
                        <td>.</td>
                        <td><button class="b-editar">Editar</button>
                            <button class="b-eliminar">Eliminar</button>
                        </td>
                    </tr>
                    <tr>
                        <td>.</td>
                        <td>.</td>
                        <td>.</td>
                        <td>.</td>
                        <td>.</td>
                        <td>.</td>
                        <td><button class="b-editar">Editar</button>
                            <button class="b-eliminar">Eliminar</button>
                        </td>
                    </tr>
                    <tr>
                        <td>.</td>
                        <td>.</td>
                        <td>.</td>
                        <td>.</td>
                        <td>.</td>
                        <td>.</td>
                        <td><button class="b-editar">Editar</button>
                            <button class="b-eliminar">Eliminar</button>
                        </td>
                    </tr>
                    <tr>
                        <td>.</td>
                        <td>.</td>
                        <td>.</td>
                        <td>.</td>
                        <td>.</td>
                        <td>.</td>
                        <td><button class="b-editar">Editar</button>
                            <button class="b-eliminar">Eliminar</button>
                        </td>
                    </tr>
                </table>
                <div class="tittle-E">
                    <div class="b-agregar">
                        <a class="b-editar" href="../index.jsp">Regresar al menú principal</a>
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>
