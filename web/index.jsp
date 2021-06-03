<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>After Pizza</title>
        <link rel="stylesheet" href="styles/index.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    </head>

    <style>
        .contenedorProducto{
            width: 100%;

            display: flex;
            flex-wrap: wrap;
            flex-basis: auto;
            justify-content: space-around;
            align-content: space-between;

        }

        .contenidoP{
            width: 20%;
            display: flex;

            margin: 15px;

        }

        .contenidoP img{
            height: 30%;
        }

        @media only screen and (max-width: 600px) {
            .contenidoP{
                width: 100%;
                display: flex;
                margin-bottom: 15px;
            }
        }
    </style>

    <body>



        <div class="container">
            <div class="nav-var">
                <div class="log-area">
                    <a href="index.jsp"><img src="imagenes/logo-pizza.png" class="img-logo" alt=""></a>
                </div>
                <div class="nav-text">
                    <div class="nav-text1"><a href="index.jsp" id="link">After pizza</a></div>
                    <div class="nav-text2"><a href="" id="link">Haz tu pedido</a></div>
                    <div class="nav-text3"><a href="zona-de-cobertura.jsp" id="link">Zona de cobertura</a></div>
                    <c:choose>
                        <c:when test="${usr.getId_rol().equals('R002')}">
                            <div class="nav-text3"><a href="Usuario/carrito.jsp" id="link">Carrito</a></div>
                        </c:when>

                        <c:when test="${usr.getId_rol().equals('R001')}">
                            <div class="nav-text3"><a href="ControlGestionUsuario?accion=listar" id="link">Configuración de la Página</a></div>
                        </c:when>
                    </c:choose>
                </div>

                <!--AQUÍ BOTON LOGIN-->

                <c:choose>
                    <c:when test="${usr.getId_rol()==null}">
                        <div class="nav-log-in"><a href="logIn.jsp"><button type="button" class="btn btn-primary">Login</button></a>
                        </div>
                    </c:when>
                    <c:when test="${usr.getId_rol().equals('R001')}">
                        <div class="nav-log-in"><a href="Administrador/gestionUsuario/emple-mod.jsp"><button type="button" class="btn btn-primary">${usr.getNombre()}</button></a>
                        </div>
                    </c:when>
                    <c:when test="${usr.getId_rol().equals('R002')}">
                        <div class="nav-log-in"><a href="Administrador/pedidos.jsp"><button type="button" class="btn btn-primary">${usr.getNombre()}</button></a>
                        </div>
                    </c:when>

                </c:choose>

            </div>


            <!---->
            <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="1" class="active"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="2" class="active"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="imagenes/pizzaPortada" class="d-block w-100" alt="..." height="500">
                    </div>
                    <div class="carousel-item">
                        <img src="imagenes/pizzaPortada3.jpg" class="d-block w-100" alt="..." height="500">
                    </div>

                </div>
                <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
            <br>
            <!--  *****-->
            <p>
                <button class="btn btn-primary" type="button" data-toggle="collapse" data-target=".multi-collapse"
                        aria-expanded="false" aria-controls="multiCollapseExample1 multiCollapseExample2">¿Dónde quieres pedir
                    hoy?</button>
            </p>
            <!--
            <div class="row">
                <div class="col">
                    <div class="collapse multi-collapse" id="multiCollapseExample1">
                        <div class="card card-body">
                            ENTREGA SIN CONTACTO <br>
                            Para garantizar la seguridad de nuestros clientes y conductores, todas las entregas se harán sin
                            contacto. <br>
                            <form class="form-inline my-2 my-lg-0">
                                <input class="form-control mr-sm-2 " type="search" placeholder="Ingresa tu dirección"
                                       aria-label="Search">
                                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="col">
                    <div class="collapse multi-collapse" id="multiCollapseExample2">
                        <div class="card card-body">
                            RECOGIDA SIN CONTACTO <br>
                            Para garantizar la seguridad de nuestros clientes y empleados, todas las órdenes de recogido
                            (“pickup”)
                            se harán sin contacto. <br>
                            <form class="form-inline my-2 my-lg-0">
                                <input class="form-control mr-sm-2 " type="search" placeholder="Regoger en"
                                       aria-label="Search">
                                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            
            -->

            <jsp:useBean class="modeloDAO.ProductoDAO" id="productoDAO"></jsp:useBean>
            <jsp:useBean class="modeloDAO.CategoriaDao" id="categoriaDAO"></jsp:useBean>


            <c:forEach var="cat" items="${categoriaDAO.listarCategorias()}">
                <div class="cad-tittle">
                    ${cat.getNom_categ()}
                </div>
                <br>

                <div class="contenedorProducto">
                    <c:forEach var="listaP" items="${productoDAO.listarProductoxCategoria(cat.getId_categ())}">
                        <c:if test="${listaP.getCategoria().equals(cat.getId_categ())}">
                            <div class="contenidoP">
                                <div class="card-deck">

                                    <div class="card">

                                        <img class="card-img-top"
                                             src="Administrador/producto/imagenes/${listaP.getImagen()}"
                                             alt="Card image cap">


                                        <div class="card-body">

                                            <h5 class="card-title">${listaP.getNombre()}</h5>
                                            <p class="card-text">
                                                ${listaP.getDescripcion()}
                                            </p>
                                            <!--
                                            <label for="adrees"><b>Seleccione el tamaño de la pizza</b></label>
                                            <select name="type-Suprema" id="">
                                                <option value="casa">Familiar</option>
                                                <option value="casa">Grande</option>
                                                <option value="casa">Mediana</option>
                                                <option value="casa">Personal</option>
                                            </select>
                                            -->
                                            <p class="card-text"><small class="text-muted"> <b>Desde S/${listaP.getPrecioU()}</b></small>
                                            </p>

                                            <a href=""><button type="button" class="btn btn-outline-primary">Seleccione</button></a>

                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:if>
                    </c:forEach>
                </div>

            </c:forEach>


            <!-- **********************-->

            <!--*******************-->
            <footer class="footer">
                <div class="footer_1">
                    <img src="imagenes/logo-pizza.png" alt="">
                </div>
                <div class="footer_2">
                    <div class="footer_2t"> Conocenos</div>
                    <div>Zona de Cobertura</div>
                    <div>Términos y Condiciones de Uso</div>
                    <div>Aviso de Privacidad</div>
                </div>
                <div class="footer_3">
                    <div class="footer_3t">Redes sociales</div>
                    <div>Instagram</div>
                    <div>Facebook</div>
                </div>
                <div class="footer_4">
                    <div class="footer_4t">Mi cuenta</div>
                    <div>Pedir</div>
                    <div>Mis pedidos</div>
                </div>
            </footer>

            <div class="btn-whatsapp">
                <a href="https://api.whatsapp.com/send?phone=5199999999" target="_blank">
                    <img src="http://s2.accesoperu.com/logos/btn_whatsapp.png" alt="">
                </a>
            </div>

            <script src=" https://code.jquery.com/jquery-3.2.1.slim.min.js"
                    integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous">
            </script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
                    integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
            crossorigin="anonymous"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
                    integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
    </body>

</html>
