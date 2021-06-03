<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="styles/logIn.css">
        <title>FormularioLogin</title>
    </head>
    <body>

        <div class="logIn">
            <form action="ControlUsuario" method="post">
                <div class="imgcontainer">
                    <img src="https://www.pavilionweb.com/wp-content/uploads/2017/03/man-300x300.png" alt="Avatar"
                         class="avatar">
                </div>

                <div class="container">
                    <label for="email"><b>Correo</b></label>
                    <input type="text" placeholder="Ingresa tu correo" name="email" required>

                    <label for="psw"><b>Contraseña</b></label>
                    <input type="password" placeholder="Ingresa contraseña" name="psw" required>

                    <!--AQUÍ BOTON LOGIN-->
                    <button type="submit" name="accion" value="logueo">Login</button>
                    <label>
                        <input type="checkbox" checked="checked" name="remember"> Recordar Contraseña
                    </label>
                </div>
                <div class="container botones"> <a href="index.jsp"><button type="button"
                                                                            class="cancelbtn">Regresar</button></a>
                    <a href="registrate.jsp"><button type="button" id="registrate">Registrate</button></a>
                </div>
            </form>

        </div>

    </body>
</html>
