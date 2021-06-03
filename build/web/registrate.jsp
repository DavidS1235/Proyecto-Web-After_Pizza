<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="styles/registrate.css">
        <link rel="stylesheet" href="styles/index.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <title>Registrar Usuario</title>
    </head>
    <body>

        <div class="logIn">
            <div class="tittle-create-account container">
                Crea tu cuenta de After Pizza
            </div>

            <form action="Control" method="post">
                <div class="imgcontainer">
                    <img src="imagenes/logo-pizza.png" alt="Avatar" class="avatar">
                </div>

                <div class="container">
                    <label for="uname"><b>Nombre completo</b></label>
                    <input type="text" placeholder="Ingresa Usuario" name="uname" required>

                    <label for="e-mail"><b>Correo electrónico</b></label>
                    <input type="email" placeholder="Ingresa Correo electrónico" name="correo" required>

                    <label for="psw"><b>Contraseña</b></label>
                    <input type="password" placeholder="Ingresa contraseña" name="psw" required>

                    <label for="adrees"><b>Dirección</b></label>
                    <input type="text" placeholder="Ingresa Dirección" name="direc" required>
                    <!--<label for="adrees"><b>Tipo de Domicilio</b></label>
                    <select name="type-adrees" id="">
                        <option value="casa">Casa</option>
                        <option value="casa">Condominio</option>
                        <option value="casa">Quinta</option>
                    </select> -->

                    <!--AQUÍ BOTON REGISTRAR-->
                    <%if (request.getAttribute("Error") != null) {
                    %>
                    <input type="text" hidden="" id="txtAlert" value="<%=request.getAttribute("Error").toString()%>">
                    <script>
                        var mensaje = document.getElementById("txtAlert").value;
                        alert(mensaje);
                    </script>
                    <%}%>
                    <button type="submit" name="accion" value="registrar_Cliente">Crear cuenta</button>
                </div>
                <div class="container botones"> 
                    <a href="index.jsp"><button type="button" class="cancelbtn">Regresar</button></a>
                    <a href="logIn.jsp"><button  id="Log-In" value="registrar_Cliente" >Log In</button></a>
                </div>
            </form>

        </div>

    </body>
</html>
