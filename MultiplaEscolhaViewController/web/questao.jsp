<%-- 
    Document   : questao
    Created on : 10/07/2017, 23:47:50
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
  <title>Questões</title>
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
  <link href="css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">


  <!-- script
  ================================================== -->
  <script src="js/modernizr.js"></script>
  <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
  <script src="js/materialize.js"></script>
  <script src="js/init.js"></script>

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
       <li><a href="index.jsp" title="">Início</a></li>   
       <li class="highlight with-sep"><a href="login.jsp" title="">Login</a></li>               
       <li class="highlight with-sep"><a href="cadastro.jsp" title="">Cadastre-se</a></li>               
     </ul>
   </nav>

   <a class="menu-toggle" href="#"><span>Menu</span></a>

 </div>      

</header>


  <!-- Visualização das Questões inseridas no  Quiz.
  ================================================== -->
  <section id="process">  
    <div class="row section-intro">
     <div class="col-twelve with-bottom-line">
      <br>
      <h1>Questões</h1>
    </div>  
  </div>

  <div class="row">
   <div class="col s1"></div>
   <div class="col s10">
    <br>
    <input type="text" name="search" placeholder="Pesquisar"></input>
  </div>
</div>

<div class="row">
 <div class="col s1"></div>
 <div class="input-field col s10">
  <select>
    <option value disabled selected>Selecione a Disciplina</option>
    <option value="1"><b>Projeto de Sistemas</b></option>
    <option value="2"><b>Linguagem de Programação II</b></option>
    <option value="3"><b>Banco de Dados</b></option>
  </select>
</div>
</div>

<div class="row">
  <div class="col s1"></div>
  <div class="col s10">
   <p class="questao">
    <h3>O trecho da obra de Sófocles, que expressa o núcleo da tragédia grega, revela o(a):</h3>
  </p>

  <p>
    <input class="with-gap" name="group1" type="radio" id="test1" />
    <label for="test1"><b>A) Condenação eterna dos homens pela prática injustificada do incesto.</b></label>
  </p>
  <p>
    <input class="with-gap" name="group1" type="radio" id="test2" />
    <label for="test2"><b>B) Legalismo estatal ao punir com a prisão perpétua o crime de parricídio.</b></label>
  </p>
  <p>
    <input class="with-gap" name="group1" type="radio" id="test3"  />
    <label for="test3"><b>C) Busca pela explicação racional sobre os fatos até então desconhecidos.</b></label>
  </p>
  <p>
    <input class="with-gap" name="group1" type="radio" id="test4"  />
    <label for="test4"><b>D) Caráter antropomórfico dos deuses na medida em que imitavam os homens.</b></label>
  </p>

  <p>
    <input class="with-gap" name="group1" type="radio" id="test5"  />
    <label for="test5"><b>E) Impossibilidade de o homem fugir do destino predeterminado pelos deuses.</b> </label>
  </p>
</div>
</div>

<div class="row">
  <div class="col s1"></div>
  <div class="col s10">
   <div id="botaoResponder">
     <button class="btn waves-effect waves-light" type="submit" name="action">Enviar Resposta
      <i class="material-icons right">send</i>
    </button>

    <button class="btn waves-effect waves-light" type="submit" name="action" onclick="escondeForum('forum')">Fórum
      <i class="material-icons right">comment</i>
    </button>
  </div>
</div>
</div>

<div id="forum" style="display: none">
  <div class="row">
    <div class="col s1"></div>
    <div class="col s10">
      <div class="card-panel grey lighten-5 z-depth-1">
        <p>Publicado em 29/06/2017 por Alice Costa.
        </p>
        <div class="row valign-wrapper">
          <div class="col s1">
           <img src="images/avatars/avatar-1.jpg" class="circle responsive-img"> 
         </div>

         <div class="col s10">
          <p class="black-text" id="duvida">
            Não consegui compreender a resposta da questão, alguém poderia me explicar?
          </p>

          <button class="waves-effect waves-light btn" type="submit" name="action" onclick="escondeTexto('resp')">Responder</button>

          <div id="resp" style="display: none">
           <div class="input-field col s10">
            <textarea id="textarea1" class="materialize-textarea"></textarea>
            <label for="textarea1"><b>Responda!</b></label>
          </div>

          <div class="col s1"></div>
          <div class="col s2">
            <br>
            <button class="btn waves-effect waves-light" type="submit" name="action">Publicar
              <i class="material-icons right">send</i>
            </button>
          </div>
        </div>

      </div>
    </div>
  </div>
</div>
</div>

<div class="row">
  <div class="col s1"></div>
  <div class="col s10">
    <div class="card-panel grey lighten-5 z-depth-1">
      <p>Em resposta a Alice Costa por Luana Pinheiro.
      </p>
      <div class="row valign-wrapper">
        <div class="col s1">
         <img src="images/avatars/avatar-5.jpg" class="circle responsive-img"> 
       </div>

       <div class="col s10">
        <p class="black-text" id="duvida">
          A resposta correta é a letra E.
        </p>
      </div>
      
    </div>
  </div>
</div>
</div>

<div class="row">
  <div class="col s1"></div>
  <div class="col s10">
    <div class="input-field col s10">
      <textarea id="textarea1" class="materialize-textarea"></textarea>
      <label for="textarea1"><b>Escreva sua dúvida</b></label>
    </div>

    <div class="col s1"></div>
    <div class="col s2">
      <br>
      <button class="waves-effect waves-light btn" type="submit" name="action">Publicar
        <i class="material-icons right">send</i>
      </button>
    </div>
  </div>
</div>
</div>

</section>

  <!-- NavBar
  ================================================== -->
  <footer>
    <div class="footer-main">
     <div class="row">  
      <div class="col-four tab-full mob-full footer-info">            
       <div class="footer-logo"></div>
       <p>
        Centro Federal de Educação Tecnológica de Minas Gerais
        <br>
        Av. Amazonas, 7675 - Nova Gameleira, Belo Horizonte - MG<br>
        Telefone: +55 (31) 3319-6722
      </p>
    </div> <!-- /footer-info -->

    <div class="col-two tab-1-3 mob-1-2">
     <h4>Instituição</h4>
     <ul>
      <li><a href="http://www.cefetmg.br/">CEFET-MG</a></li>
      <li><a href="http://www.campus2.cefetmg.br/">CEFET-MG/CII</a></li">
       <li><a href="http://www.decom.cefetmg.br/">DECOM</a></li>
     </ul>
   </div> <!-- site-links --> 
   <div class="col-two tab-1-3 mob-1-2 social-links">
    <h4>Sigam-nos</h4>
    <ul>
     <li><a href="https://www.facebook.com/cefetminasgerais/">Facebook CEFET-MG</a></li>
     <li><a href="https://www.facebook.com/cefetmg.campus2/">Facebook CEFET CII</a></li>
     <li><a href="https://www.instagram.com/cefetmg/">Instagram CEFET</a></li>
   </ul>         
 </div> <!-- /sociais-->
 <div class="col-four tab-1-3 mob-full">
  <h4>Professores</h4>
  <p>Cristiano Amaral Maffort - Linguagem de Programação II.<br>
   Glívia Angélica Rodrigues Barbosa - Projetos de Sistemas.<br>
   Edson Marchetti da Silva - Banco de Dados.</p>              
 </div> <!-- /professores -->         
 <div id="preloader"> 
   <div id="loader"></div>
 </div> 
  <!-- Java Script
  ================================================== --> 
  <script src="js/jquery-1.11.3.min.js"></script>
  <script src="js/jquery-migrate-1.2.1.min.js"></script>
  <script src="js/plugins.js"></script>
  <script src="js/main.js"></script>
  <script src="js/questao.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.2/js/materialize.min.js"></script>
  <script type="text/javascript">
    $(document).ready(function() {
     $('select').material_select();
   });
 </script>
</body>
</html>