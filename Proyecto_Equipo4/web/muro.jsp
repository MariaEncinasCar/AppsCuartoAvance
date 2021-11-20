<%-- 
    Document   : muro
    Created on : 18 nov. 2021, 14:18:31
    Author     : Equipo 4
--%>

<%@page import="objetos.Comentario"%>
<%@page import="negocio.CtrlComentario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="negocio.CtrlPostAnclado"%>
<%@page import="negocio.CtrlPostComun"%>
<%@page import="objetos.PostAnclado"%>
<%@page import="objetos.PostComun"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Muro</title>
    <link rel="stylesheet" type="text/css" href="css/cssMuro.css" />
    <style type="text/css">
      body {
        color: #3b3a3a;
        background-color: #cfcfcf;
      }
    </style>
  </head>
  <body>
    <section class="columnas-muro">
      <section class="columna-der">
          <%
            CtrlPostAnclado controlPostAnclado = new CtrlPostAnclado();
            CtrlPostComun controlPostComun = new CtrlPostComun();
            CtrlComentario controlComentario = new CtrlComentario();

            List<PostAnclado> listaAnclados = new ArrayList<>();
            List<PostComun> listaComunes = new ArrayList<>();
            List<Comentario> listaComentarios = new ArrayList<>();

            listaAnclados = controlPostAnclado.consultarListaPostsAnclados();
            listaComunes = controlPostComun.consultarListaPostsComunes();

            for (PostAnclado anclado : listaAnclados) {
          %>
        <article class="elemento">
          <header>
            <h2><%=anclado.getTitulo()%></h2>
            <h5><%=anclado.getFechaHoraCreacion()%></h5>
          </header>
          <figure class="contenido"><%=anclado.getContenido()%></figure>

          <%
            }

            for (PostComun comun : listaComunes) {
          %>

          <article class="elemento">
          <header>
            <h2><%=comun.getTitulo()%></h2>
            <h5><%=comun.getFechaHoraCreacion()%></h5>
          </header>
          <figure class="contenido"><%=comun.getContenido()%></figure>

          <%
              listaComentarios = controlComentario.consultarListaComentariosDelPost(comun);
              for (Comentario comentario : listaComentarios) {
                  if (comentario.getPostComun().equals(comun)) {
          %>
          <article class="comentario">
            <p class="comentador"><%=comentario.getUsuarioComun()%>Comentador</p>
            <<p><%=comentario.getFechaHora()%>Fecha Hora</p>
            <p>
              <%=comentario.getContenido()%>Contenido
            </p>
            <article class="comentador">
              <!-- <img src="/imagenes/comentador.jpeg" /> -->
            </article>
          </article>
          <%
                  }
              }
          %>
          
          <!-- comentarios-->
          <section class="seccion-comentar">
            <details>
              <summary style="font-size: x-large">Comentar</summary>

              <section class="caja-comentario">
                <textarea
                  name="area-comentario"
                  id="area-comentario"
                  cols="50"
                  rows="10"
                ></textarea>
              </section>
              <input
                type="button"
                value="Enviar comentario"
                class="btn-enviar-comentario"
              />
            </details>
          </section>

          <!-- fin comentarios  -->
        </article>
          
          <%
              }
          %>
      </section>
      <section class="columna-izq">
        <article class="elemento">
            <img class="perfil" src="imagenes/fotoPerfil.jpeg" />
          <figcaption style="text-align: center">Paco O'sea</figcaption>
          <input type="button" value="Publicar" class="botonPublicar" />
        </article>
      </section>
    </section>
  </body>
</html>