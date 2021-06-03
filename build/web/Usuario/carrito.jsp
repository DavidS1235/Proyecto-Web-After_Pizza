<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>After Pizza</title>
        <link rel="stylesheet" href="styles/has-tu-pedido.css">
        <link rel="stylesheet" href="styles/carrito.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    </head>

    <body>
        <div class="container">
            <div class="nav-var">
                <div class="log-area">
                    <a href="../index.jsp"><img src="imagenes/logo-pizza.png" class="img-logo" alt=""></a>
                </div>
                <div class="nav-text">
                    <div class="nav-text1"><a id="link">After pizza</a></div>
                    <div class="nav-text2"><a href="../index.jsp" id="link">Haz tu pedido</a></div>
                    <div class="nav-text3"><a href="../zona-de-cobertura.jsp" id="link">Zona de cobertura</a></div>
                    <div class="nav-text3"><a href="carrito.jsp" id="link">Carrito</a></div>
                </div>
                <div class="nav-log-in"><a href="../logIn.jsp"><button type="button" class="btn btn-primary">Log
                            in</button></a></div>
            </div>
            <div class="area-work">
                <div class="table-area">
                    <table>
                        <tr>
                            <th>Item</th>
                            <th>Aticulo</th>
                            <th>Descripcion</th>
                            <th>Precio</th>
                            <th>Cantidad</th>
                            <th>Total</th>
                            <th>Acciones</th>
                        </tr>
                        <tr>
                            <td>.</td>
                            <td>.</td>
                            <td>.</td>
                            <td>.</td>
                            <td>.</td>
                            <td>.</td>
                            <td>
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
                            <td>
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
                            <td>
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
                            <td>
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
                            <td>
                                <button class="b-eliminar">Eliminar</button>
                            </td>
                        </tr>
                    </table>
                </div>
                <div class="form-area">
                    <form action="/action_page.php">
                        <label for="country"><b>Subtotal:</b></label>
                        <input type="text" id="country" name="country" value="" readonly><br><br>
                        <label for="country"><b>Precio de envio:</b></label>
                        <input type="text" id="country" name="country" value="" readonly><br><br>
                        <label for="country"><b>Descuento:</b></label>
                        <input type="text" id="country" name="country" value="" readonly><br><br>
                        <label for="country"><b>Total a pagar:</b></label>
                        <input type="text" id="country" name="country" value="" readonly><br><br>
                        <label for="country"><b>Ingrese núm de tarjeta:</b></label>
                        <input type="text" id="country" name="country" value="" required><br><br>
                        <input type="submit" value="Realizar pago">
                        <input type="submit" value="Pagar">
                    </form>
                </div>
            </div>

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
            
        </div>
    </body>

</html>
