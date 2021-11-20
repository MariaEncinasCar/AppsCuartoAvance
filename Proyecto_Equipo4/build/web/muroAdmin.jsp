<%@page import="objetos.PostAnclado"%>
<%@page import="negocio.CtrlPostAnclado"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Date"%>
<%@page import="objetos.PostComun"%>
<%@page import="java.util.List"%>
<%@page import="negocio.CtrlPostComun"%>
<%@page import="negocio.FabricaNegocios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html>
<%
    FabricaNegocios f = new FabricaNegocios();
    CtrlPostComun ctrl = f.getCtrlPostComun();
    CtrlPostAnclado ctrl2 = f.getCtrlPostAnclado();
    List<PostComun> listaPosts = ctrl.consultarListaPostsComunes();
    List<PostAnclado> listaAnclado = ctrl2.consultarListaPostsAnclados();

    pageContext.setAttribute("listaPosts", listaPosts);
    pageContext.setAttribute("listaAnclado", listaAnclado);
%>

<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Muro</title>
        <link rel="stylesheet" type="text/css" href="css/cssMuroAdmin.css" />
        <style type="text/css">
            body {
                color: #3b3a3a;
                background-color: #3b3a3a;
            }
        </style>
    </head>

    <body>
        <section class="columnas-muro">
            <section class="columna-der">

                <article class="elemento">
                    <header>
                        <h3>Tabla de publicaciones</h3>
                        <table acction="postComun" method="get">
                            <tr>
                                <th>Fecha</th>
                                <th>Título</th>
                            </tr>
                            <c:forEach items="${listaPosts}" var = "posts">
                                <tr>
                                    <td>${posts.fechaHoraCreacion}</td>
                                    <td>${posts.titulo}</td>
                                </tr>
                            </c:forEach>
                        </table>
                    </header>
                </article>

                <c:forEach items="${listaAnclado}" var = "anclado">
                    <article class="elemento">
                        <header>
                            <h2>${anclado.titulo}</h2>
                            <h5>${anclado.fechaHoraCreacion}</h5>
                        </header>
                        <figure class="contenido">${anclado.contenido}</figure>
                    </article>
                </c:forEach>

                <c:forEach items="${listaPosts}" var = "posts">
                    <article class="elemento">
                        <header>
                            <h2>${posts.titulo}</h2>
                            <h5>${posts.fechaHoraCreacion}</h5>
                        </header>
                        <figure class="contenido">${posts.contenido}</figure>
                        <article class="comentario">
                            comentario
                            <article class="comentador">
                                <img src="imagenes/comentador.jpeg" />
                            </article>
                        </article>

                    </article>
                </c:forEach>

            </section>
            <section class="columna-izq">
                <article class="elemento">
                    <img class="perfil" src="imagenes/fotoPerfil.jpeg" />
                    <figcaption style="text-align: center">Paco O'sea</figcaption>
                    <input class="boton" type="button" value="Publicar"/>
                    <input class="boton" type="button" value="Salir" onclick="location = 'login.jsp'" />
                </article>
            </section>
        </section>
    </body>
</html>
