/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validaCampo() {
    var frm = document.formLogin;
    var email = frm.email.value;
    var senha = frm.password.value;
    
    if(email == "") {
        alert("Campo Email Obrigatório !!");
        document.getElementById("nome").focus();
        return false;
    } else if (senha == "") {
        alert("Campo  Senha Obrigatório !!");
        document.getElementById("password").focus();
        return false;
    } else {
        caminhourl = "Servlet?acao=Logar";
        frm.action = caminhourl;
        frm.submit();
        return true;
    }  
}

function GravarUsuario (form) {
    form = document.formCad;
    var nome = form.name.value;
    var username = form.username.value;
    var senha = form.password.value;
    var confSenha = form.password_confirm.value;
    var email = form.email.value;
    var tipoUsuario = form.tipoUsuario.value;
    
    if (nome = "") {
        alert("Campo nome obrigatorio.");
        document.getElementById("name").focus();
       return false;

    } 
    else if (senha = "") {
        alert("Campo senha obrigatorio.");
        document.getElementById("password").focus();
        return false;

    } 
  /*  else if (senha != confSenha) {
        alert("A senha está diferente.");
        document.getElementById("password_confirm").focus();
        return false;

    } */
    else if (email = "") {
        alert("Campo email obrigatorio.");
        document.getElementById("email").focus();
       return false;

    } 
    else if (tipoUsuario = "") {
        alert("Campo tipo obrigatorio.");
        document.getElementById("tipoUsuario").focus();
        return false;

    } 
    else if (form.acao.value == "gravar") {
        alert("Teste");
        caminhourl = "/MultiplaEscolhaViewController/Servlet?acao=GravarUsuario";
        form.action = caminhourl;
        form.submit();
    }
}
