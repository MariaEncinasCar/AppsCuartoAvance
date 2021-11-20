<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <title>Login</title>
    <link rel="stylesheet" href="css/cssInicio.css">
</head>
<body>
    <header>
        <h3>Blog</h3>
    </header>
    <form class="formularioLogin" action="LoginServlet" method="post">
        <h1>Iniciar Sesión</h1>
        <p><i>${mensaje}</i></p>
        <section class="contenedor">

            <article class="input-contenedor">
                <input id="txtCorreo" type="text" name="correo" value="${correo}" placeholder="Correo electrónico">
            </article>

            <article class="input-contenedor">
                <input id="txtContrasena" type="password" name="contrasena" value="${contrasena}" placeholder="Contraseña">
            </article>

            <input type="submit" value="Iniciar Sesión" class="button"/>
            <p>¿No tienes cuenta? <a class="link" href="registro.jsp">Registrate</a></p>

        </section>
    </form>
    <footer>
        <section class= "textobajo">
           <p>Aplicaciones webs 2021</p>
        </section>
    </footer>
</body>
</html>
