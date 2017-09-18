<%-- 
    Document   : editarQuestao
    Created on : 10/07/2017, 23:36:20
    Author     : jaops
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8 ]><html class="no-js oldie ie8" lang="en"> <![endif]-->
<!--[if IE 9 ]><html class="no-js oldie ie9" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html class="no-js" lang="en"> <!--<![endif]-->
<head>

   <!--- basic page needs
   ================================================== -->
   <meta charset="utf-8">
   <title>Editar Questões</title>
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
               <li><a href="perfil.jsp" title="">Perfil</a></li>
               <li class="highlight with-sep"><a href="index.jsp" title="">Sair</a></li>                             
            </ul>
         </nav>

         <a class="menu-toggle" href="#"><span>Menu</span></a>
         
      </div>      
      
   </header>

   <!-- formulário de cadastro
   ================================================== -->

   <section id="process">  

      <div class="row section-intro">
         <div class="col-twelve with-bottom-line">
            <br>
            <h1>Editar Questões</h1>
         </div>         
      </div>
      <br>
      <br>

      <div class="row">
         <form id="EditarQ" class="col-twelve">
          <div class="row">
            <div class="col s3"></div>
            <div class="col s6">
               <br>
               <select class="browser-default" id="disciplina">
                  <option value="" disabled selected>Disciplina da questão</option>
                  <option value="1" id="PSI">Projeto de Sistemas</option>
                  <option value="2" id="LPII">Linguagem de Programação II</option>
                  <option value="3" id="BD">Banco de Dados</option>
               </select>
               <br>
            </div>
         </div>

         <div class="row">
            <div class="col s3"></div>
            <div class="input-field col s6">
               <textarea id="dominio" class="materialize-textarea"></textarea>
               <label for="dominio"><b>Domínio da questão</b></label>
            </div>
            <br>
         </div>

         <div class="row">
            <div class="col s3"></div>
            <div class="col s6">
               <br>
               <p>Nível de dificuldade da questão</p>
               <p>
                  <input class="with-gap" name="nivel" type="radio" id="facil"/>
                  <label for="facil"><b>Fácil</b></label>
               </p>
               <p>
                  <input class="with-gap" name="nivel" type="radio" id="moderado"/>
                  <label for="moderado"><b>Moderado</b></label>
               </p>
               <p>
                  <input class="with-gap" name="nivel" type="radio" id="dificil"/>
                  <label for="dificil"><b>Difícil</b></label>
               </p>
               <p>
                  <input class="with-gap" name="nivel" type="radio" id="desafio"/>
                  <label for="desafio"><b>Desafio</b></label>
               </p>
               <br>
            </div>
         </div>

         <div class="row">
            <div class="col s3"></div>
            <div class="col s6">
               <p>  
                  <select class="browser-default" id="estilo-inserir" name="estilo-inserir">
                     <option value="" disabled selected>Estilo da questão</option>
                     <option value="0">Múltipla Escolha</option>
                     <option value="1">Verdadeiro ou Falso</option>
                     <option value="2">Dissertativa</option>
                  </select>
               </p>
               <br>
            </div>
         </div>

         <div class="row">
            <div class="col s3"></div>
            <div class="input-field col s6">
               <textarea id="enunciado" class="materialize-textarea"></textarea>
               <label for="enunciado"><b> Enunciado da questão</b></label>
            </div>
            <br>
         </div>

         <div class="row">
            <div class="col s3"></div>
            <div class="file-field input-field col s6">
               <div class="btn">
                  <span><i class="material-icons left">attach_file</i>Imagem</span>
                  <input type="file">
               </div>
               <div class="file-path-wrapper">
                  <input class="file-path validate" type="text">
               </div>  
            </div>
         </div>

         <div class="row">
            <div class="col s3"></div>
            <div class="input-field col s5">
               <textarea id="alt1" class="materialize-textarea"></textarea>
               <label for="alt1"><b>Alternativa 1</b></label>
            </div>
            <div class="col s2">
               <input class="with-gap" name="correto" type="radio" id="c1"/>
               <label for="c1"><b>Correta</b></label>
            </div>
            <br>
         </div>

         <div class="row">
            <div class="col s3"></div>
            <div class="input-field col s5">
               <textarea id="alt2" class="materialize-textarea"></textarea>
               <label for="alt2"><b>Alternativa 2</b></label>
            </div>
            <div class="col s2">
               <input class="with-gap" name="correto" type="radio" id="c2"/>
               <label for="c2"><b>Correta</b></label>
            </div>
            <br>
         </div>

         <div class="row">
            <div class="col s3"></div>
            <div class="input-field col s5">
               <textarea id="alt3" class="materialize-textarea"></textarea>
               <label for="alt3"><b>Alternativa 3</b></label>
            </div>
            <div class="col s2">
               <input class="with-gap" name="correto" type="radio" id="c3"/>
               <label for="c3"><b>Correta</b></label>
            </div>
            <br>
         </div>

         <div class="row">
            <div class="col s3"></div>
            <div class="input-field col s5">
               <textarea id="alt4" class="materialize-textarea"></textarea>
               <label for="alt4"><b>Alternativa 4</b></label>
            </div>
            <div class="col s2">
               <input class="with-gap" name="correto" type="radio" id="c4"/>
               <label for="c4"><b>Correta</b></label>
            </div>   
            <br>
         </div>

         <div class="row">
            <div class="col s3"></div>
            <div class="input-field col s5">
               <textarea id="alt5" class="materialize-textarea"></textarea>
               <label for="alt6"><b>Alternativa 5</b></label>
            </div>
            <div class="col s2">
               <input class="with-gap" name="correto" type="radio" id="c5"/>
               <label for="c5"><b>Correta</b></label>
            </div>
            <br>
         </div>

         <div class="row">
            <div class="col s8"></div>
            <div class="input-field col s3">
               <button class="btn waves-effect waves-light" type="submit" name="enviar">
                  <i class="material-icons left">autorenew</i>Atualizar
               </button>
            </div>
         </div>

      </form>
   </div>

</section>   


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
   <script src="js/questaoCad.js"></script>
</body>
</html>
