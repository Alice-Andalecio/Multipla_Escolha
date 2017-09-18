<%-- 
    Document   : login
    Created on : 10/07/2017, 23:43:02
    Author     : jaops
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<!--[if IE 8 ]><html class="no-js oldie ie8" lang="en"> <![endif]-->
<!--[if IE 9 ]><html class="no-js oldie ie9" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html class="no-js" lang="en"> <!--<![endif]-->
    <head>

        <!--- basic page needs
        ================================================== -->
        <meta charset="utf-8">
        <title>Login</title>
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
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="js/materialize.js"></script>
        <script src="js/init.js"></script>
        <script src="js/validacao.js"></script>


        <!-- favicons
        ================================================== -->
        <link rel="icon" type="image/png" href="favicon.png">

        <!-- Style
        ================================================== -->
        <style type="text/css">
            .intro-content a {
                color: #bdbdbd;
            }
            select {
                background: transparent;
                color: #bdbdbd;
            }
            select:after {
                background: transparent;
                color: #bdbdbd;
            }
        </style>
    </head>

    <body id="top">

        <!-- header 
   ================================================== -->
        <header>

            <div class="row">

                <div class="logo">
                    <a href="index.jsp"></a>
                </div>

                <nav id="main-nav-wrap">
                    <ul class="main-navigation">  
                        <li class="current"><a href="index.jsp" title="">Início</a></li>   			
                        <li class="highlight with-sep"><a href="cadastro.jsp" title="">Cadastre-se</a></li>					
                    </ul>
                </nav>

                <a class="menu-toggle" href="#"><span>Menu</span></a>

            </div>   	

        </header>

        <!-- intro section
        id anterior = intro.
   ================================================== -->
        <form id="intro" name="formLogin" method="post">

            <div class="shadow-overlay"></div>

            <div class="intro-content">
                <div class="row">
                    <div class="col-twelve">			
                        <h5><b>Login</b></h5>
                        <br>

                        <div class="row">
                            <div class="col s3"></div>
                            <div class="input-field col s6 center-block">
                                <input id="email" name="email" type="email" class="validate">
                                <label for="email"><b>Email</b></label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s3"></div>
                            <div class="input-field col s6 center-block">
                                <input id="password" type="password" class="validate">
                                <label for="password"><b>Senha</b></label>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col s3"></div>
                            <div class="col s6">
                                <select class="browser-default">
                                    <option value="" disabled selected>Perfil de usuário</option>
                                    <option value="1">Administrador de Conteúdo</option>
                                    <option value="2">Aluno</option>   
                                </select>
                            </div>
                        </div>

                        <br>
                        <h6><a href="esqueceuSenha.jsp">Esqueceu a senha? Clique aqui!</a></h6>
                        <br>

                        <a class="waves-effect waves-light btn" onclick="validaCampo()">Entrar</a>
                    </div>

                </div>   		 		

            </div>  	 	

        </form>


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

    </body>
</html>