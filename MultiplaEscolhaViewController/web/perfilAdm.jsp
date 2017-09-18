<%-- 
    Document   : perfilAdmin
    Created on : 10/07/2017, 23:47:10
    Author     : jaops
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.cefetmg.dominio.Sessao"%>
<%@page import="br.cefetmg.dominio.Aluno"%>
<%@page import="br.cefetmg.dominio.Questao"%>
<!DOCTYPE html>
<!--[if IE 8 ]><html class="no-js oldie ie8" lang="en"> <![endif]-->
<!--[if IE 9 ]><html class="no-js oldie ie9" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html class="no-js" lang="en"> <!--<![endif]-->
    <head>

        <!--- basic page needs
        ================================================== -->
        <meta charset="utf-8">
        <title>Perfil</title>
        <meta name="description" content="">  
        <meta name="author" content="">

        <!-- mobile specific metas
        ================================================== -->
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

        <!-- CSS
        ================================================== -->
        <link rel="stylesheet" href="css/base.css">  
        <link rel="stylesheet" href="css/main.css">
        <link rel="stylesheet" href="css/vendor.css">    
        <link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">


        <!-- script
        ================================================== -->
        <script src="js/modernizr.js"></script>

        <!-- favicons
        ================================================== -->
        <link rel="icon" type="image/png" href="favicon.png">

        <!-- Style do header
        ================================================== -->
        <style type="text/css">
            header {
                width: 100%;
                position: absolute;
                left: 0;
                top: 0px;
                z-index: 600;
                background: #14171c;
            }
        </style>

    </head>

    <body id="top">
        <% Aluno aluno = new Aluno(); %>
        <% Sessao sessaoAluno = new Sessao(aluno);%>

        <!-- header 
        ================================================== -->
        <header>

            <div class="row">

                <div class="logo">
                    <a href="index.jsp"></a>
                </div>

                <nav id="main-nav-wrap">
                    <ul class="main-navigation">
                        <li><a href="questao.jsp" title="">Início</a></li> 
                        <li><a href="questao.jsp" title="">Questões</a></li>
                        <li><a href="editarQuestao.jsp" title="">Editar Questões</a></li>   
                        <li><a href="perfil.jsp" title="">Perfil</a></li>
                        <li class="highlight with-sep"><a title="">Sair</a></li>

                    </ul>
                </nav>

                <a class="menu-toggle" href="#"><span>Menu</span></a>

            </div>      

        </header>


        <!-- formulário de cadastro
        ================================================== -->
        <section id="process">  

            <br>
            <div class="row">
                <div class="col s3">
                    <img src="images/avatars/avatar-6.png" class="circle responsive-img">
                    <a id="nomeUsuario"> <%= request.getAttribute("name")%> </a>
                    <h6><%= request.getAttribute("apelido")%></h6>
                </div>
                <div class="col s2"></div>
                <div class="col s7">
                    <img src="images/grafico.PNG">
                </div>
            </div>

            <div class="row">
                <div class="col s3">
                    <p><%= request.getAttribute("email")%></p>
                    <h6><%= request.getAttribute("tipoUsuario")%></h6>
                </div>

                <div class="col s2"></div>

                <div class="col s3 borda">
                    <h3>Questões Respondidas:</h3>
                    <h3><% sessaoAluno.getTotalRespostas();%></h3>
                </div> 

                <div class="col s1"></div>

                <div class="col s3 borda">
                    <h3>Número de Acertos:</h3>
                    <h3><% sessaoAluno.getAcerto();%></h3>
                </div>

            </div>

            <div class="row">
                <div class="col s3">
                    <a class="waves-effect waves-light btn" id="editar_perfil"><i class="material-icons right">mode_edit</i>Editar Perfil</a>
                </div>
            </div>


        </section> <!-- /process-->    


        <!-- footer
        ================================================== -->
        <footer>

            <div class="footer-main">

                <div class="row">  

                    <div class="col-four tab-full mob-full footer-info">            

                        <div class="footer-logo"></div>

                        <p>
                            Centro Federal de Educação Tecnológica de Minas Gerais
                            <br>
                            Av. Amazonas, 7675 - Nova Gameleira, Belo Horizonte - MG
                            <br>
                            Telefone: +55 (31) 3319-6722
                        </p>

                    </div> <!-- /footer-info -->

                    <div class="col-two tab-1-3 mob-1-2">

                        <h4>Instituição</h4>

                        <ul>
                            <li><a href="http://www.cefetmg.br/">CEFET-MG</a></li>
                            <li><a href="http://www.campus2.cefetmg.br/">CEFET-MG/CII</a></li>
                            <li><a href="http://www.decom.cefetmg.br/">DECOM</a></li>
                        </ul>
                    </div> <!-- /site-links -->  

                    <div class="col-two tab-1-3 mob-1-2 social-links">
                        <h4>Sigam-nos</h4>
                        <ul>
                            <li><a href="https://www.facebook.com/cefetminasgerais/">Facebook CEFET</a></li>
                            <li><a href="https://www.facebook.com/cefetmg.campus2/">Facebook CEFET/CII</a></li>
                            <li><a href="https://www.instagram.com/cefetmg/">Instagram CEFET</a></li>
                        </ul>               
                    </div> <!-- /sociais--> 

                    <div class="col-four tab-1-3 mob-full">
                        <h4>Professores</h4>
                        <p>Cristiano Amaral Maffort - Linguagem de Programação II.
                            <br>
                            Glívia Angélica Rodrigues Barbosa - Projetos de Sistemas.
                            <br>
                            Edson Marchetti da Silva - Banco de Dados.</p>                        
                    </div> <!-- /professores --> 

                </div> <!-- /row -->

            </div> <!-- /footer-main --> 

            <div class="footer-bottom">
                <div class="row">
                    <div class="col-twelve">
                        <div class="copyright"></div>

                        <div id="go-top" style="display: block;">
                            <a class="smoothscroll" title="Back to Top" href="#top"><i class="icon ion-android-arrow-up"></i></a>
                        </div>         
                    </div>
                </div>       
            </div> <!-- /footer-bottom -->
        </footer> -->       

        <div id="preloader"> 
            <div id="loader"></div>
        </div> 

        <!-- Java Script
        ================================================== --> 
        <script src="js/jquery-1.11.3.min.js"></script>
        <script src="js/jquery-migrate-1.2.1.min.js"></script>
        <script src="js/plugins.js"></script>
        <script src="js/main.js"></script>
        <script src="js/materialize.js"></script>
        <script src="js/perfilDados.js"></script>
    </body>
</html>
