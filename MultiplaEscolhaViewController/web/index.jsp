<%-- 
    Document   : index
    Created on : 10/07/2017, 23:22:09
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
   <title>Múltipla Escolha</title>
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
   <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
   

   <!-- script
   ================================================== -->
   <script src="js/modernizr.js"></script>

   <!-- favicons
   ================================================== -->
   <link rel="icon" type="image/png" href="favicon.png">

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
               <li class="current"><a class="smoothscroll"  href="#intro" title="">Início</a></li>
               <li><a class="smoothscroll"  href="#process" title="">Funcionamento</a></li>
               <li><a class="smoothscroll"  href="#features" title="">Vantagens</a></li>
               <li><a class="smoothscroll"  href="#testimonials" title="">Quem Somos</a></li>     
               <li class="highlight with-sep"><a href="login.jsp" title="">Login</a></li>               
               <li class="highlight with-sep"><a href="cadastro.jsp" title="">Cadastre-se</a></li>               
            </ul>
         </nav>

         <a class="menu-toggle" href="#"><span>Menu</span></a>
         
      </div>      
      
   </header>

   <!-- inicio
   ================================================== -->
   <section id="intro">

      <div class="shadow-overlay"></div>

      <div class="intro-content">
         <div class="row">

            <div class="col-twelve">

               <h5>A revolução de seus estudos começa aqui!</h5>
               <h1>Múltipla Escolha</h1>

               <a class="button stroke" href="questao.jsp" title="">Experimente</a>
            </div>  

         </div>               

      </div>        

   </section> <!-- /intro -->


   <!-- funcionamento
   ================================================== -->
   <section id="process">  

      <div class="row section-intro">
         <div class="col-twelve with-bottom-line">

            <h1>Funcionamento</h1>

            <p class="lead">O "Múltipla Escolha" é um sistema de Quiz que possibilita a você o estudo à distância das disciplinas presentes em concursos. Leia as instruções listadas abaixo para que sua experiência seja a melhor possível!</p>

         </div>         
      </div>

      <div class="row process-content">

         <div class="left-side">

            <div class="item" data-item="1">

               <h5>Cadastro</h5>

               <p>Para usufruir dos recursos do Múltipla Escolha é necessário que você se cadastre no sistema (é gratuito :D).</p>
               
            </div>

            <div class="item" data-item="2">

               <h5>Questões</h5>

               <p>Se você possuir um perfil de "Administrador de Conteúdo" poderá contribuir com questões que enriquecerão nosso site. Por outro lado, se você for um "Estudante" respoderá quantas questões desejar.</p>
               
            </div>
            
         </div> <!-- /left-side -->
         
         <div class="right-side">
            
            <div class="item" data-item="3">

               <h5>Fórum e Desempenho</h5>

               <p>Cada questão possui um fórum de discussão, contribuindo para que suas dúvidas sejam esclarecidas. Você ainda pode acompanhar seu desempenho analisando a relação entre questões certas e erradas! </p>
               
            </div>

            <div class="item" data-item="4">

               <h5>Não possui cadastro? :(</h5>

               <p>Você pode responder até 10 questões (como um test drive) e também visualizar o fórum de discussões e as demais questões do sistema.</p>
               
            </div>

         </div> <!-- /right-side -->  

         <div class="image-part"></div>         

      </div> <!-- /process-content --> 

   </section> <!-- /process-->    


   <!-- vantagens
   ================================================== -->
   <section id="features">

      <div class="row section-intro">
         <div class="col-twelve with-bottom-line">

            <h1>Vantagens</h1>

            <p class="lead">O "Múltipla Escolha" possui diversas funcionalidades que ajudarão você em sua carreira acadêmica e profissional. A seguir são listadas algumas vantagens que irão convencer você a utilizar essa ferramenta. :)</p>

         </div>         
      </div>

      <div class="row features-content">

         <div class="features-list block-1-3 block-s-1-2 block-tab-full group">

            <div class="bgrid feature">   

               <span class="icon"><i class="material-icons">laptop</i></span>            

               <div class="service-content"> 

                 <h3 class="h05">Aprendizagem à distância</h3>

                 <p>O "Múltipla Escolha" proporciona que seus estudos a distância se tornem mais práticos e ágeis, pois oferece recursos online sem a necessidade de aulas presenciais.
                 </p>
                 
              </div>                

           </div> <!-- /bgrid -->


           <div class="bgrid feature">   

            <span class="icon"><i class="material-icons">wb_incandescent</i></span>                          

            <div class="service-content"> 
               <h3 class="h05">Fácil aprendizado</h3>  

               <p>Oferecemos diversas ferramentas para que você consiga realizar com êxito seus estudos, dessa forma, aprendendo de maneira ágil e eficiente.</p>
               
            </div>                             

         </div> <!-- /bgrid -->


         <div class="bgrid feature">   

            <span class="icon"><i class="material-icons">tag_faces</i></span>                          

            <div class="service-content"> 
               <h3 class="h05">Fácil de Usar</h3>  

               <p>Para que sua experiência seja a melhor possível, a equipe desenvolvedora realizou um trabalho otimizado pensando em você! Utilizar nossa ferramenta é uma tarefa super fácil e sem complicações. 
               </p>

               
            </div>                             

         </div> <!-- /bgrid -->

      </div> <!-- features-list -->
      
   </div> <!-- features-content -->
   
</section> <!-- /features -->


   <!-- quem somos
   ================================================== -->
   <section id="testimonials">

      <div class="row">
         <div class="col-twelve">
            <h2 class="h01">Quem Somos?</h2>
         </div>         
      </div>      

      <div class="row flex-container">
        
         <div id="testimonial-slider" class="flexslider">

            <ul class="slides">

               <li>
                  <div class="testimonial-author">
                     <img src="images/avatars/avatar-1.jpg" alt="Author image">
                     <div class="author-info">
                        Alice de Oliveira Andalécio Costa
                     </div>
                  </div>
                  <p>Curso técnico de Informática - CEFET-MG</p>       
               </li> <!-- Alice -->

               <li>
                  <div class="testimonial-author">
                     <img src="images/avatars/avatar-2.jpg" alt="Author image">
                     <div class="author-info">
                        Carlos Eduardo de Moura Pereira
                     </div>
                  </div>
                  <p>Curso técnico de Informática - CEFET-MG</p>    
               </li> <!-- Carlos Eduardo -->

               <li>
                  <div class="testimonial-author">
                     <img src="images/avatars/avatar-3.jpg" alt="Author image">
                     <div class="author-info">
                        Gabriel Victor Guimarães Xavier
                     </div>
                  </div>
                  <p>Curso técnico de Informática - CEFET-MG</p>       
               </li> <!-- Gabriel -->

               <li>
                  <div class="testimonial-author">
                     <img src="images/avatars/avatar-4.jpg" alt="Author image">
                     <div class="author-info">
                        João Pedro dos Santos Soares
                     </div>
                  </div>
                  <p>Curso técnico de Informática - CEFET-MG</p>        
               </li> <!-- João-->

               <li>
                  <div class="testimonial-author">
                     <img src="images/avatars/avatar-5.jpg" alt="Author image">
                     <div class="author-info">
                        Luana Pinheiro
                     </div>
                  </div>
                  <p>Curso técnico de Informática - CEFET-MG</p>  
               </li> <!-- Luana -->

            </ul> <!-- /slides -->
         </div> <!-- /testimonial-slider -->          
      </div> <!-- /flex-container -->
   </section> <!-- /testimonials -->

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
</body>
</html>
