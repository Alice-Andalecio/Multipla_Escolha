/* Validação dos dados inseridos ao realizar o cadastro de usuários */

function GravarUsuario(form) {
    form = document.formCad;
    var name = form.name.value;
    var username = form.username.value;
    var password = form.password.value;
    var passwordConfirm = form.password_confirm.value;
    var email = form.email.value;
    var tipoUsuario = form.tipoUsuario.value;

    if (name === "") {
        alert("É obrigatório definir um nome!");
        document.querySelector('#name').focus();
        return false;

    } else if (username === "") {
        alert("É obrigatório definir um apelido!");
        document.querySelector('#username').focus();
        return false;

    } else if (password === "") {
        alert("É obrigatório definir uma senha!");
        document.querySelector('#password').focus();
        return false;

    } else if (passwordConfirm === "") {
        alert("Digite a senha novamente para confirmar!");
        document.querySelector('#password_confirm').focus();
        return false;

    } else if (passwordConfirm !== password) {
        alert("As senhas digitadas são diferentes!");
        document.querySelector('#password_confirm').focus();
        return false;

    } else if (email === "") {
        alert("É obrigatório definir um email!");
        document.querySelector('#email').focus();
        return false;

    } else if (tipoUsuario === "") {
        alert("É obrigatório definir um tipo de usuário!");
        document.querySelector('#tipoUsuario').focus();
        return false;

    } else if (form.acao.value === "gravar") {
        alert("Teste");
        caminhourl = "/MultiplaEscolhaViewController/Servlet?acao=GravarUsuario";
        form.action = caminhourl;
        form.submit();
    }
}

/* Validação dos dados inseridos ao fazer login */

function ValidaLogin(form) {
    form = document.formLogin;
    var email = form.email.value;
    var password = form.password.value;

    if (email === "") {
        alert("É obrigatório informar o email cadastrado!");
        document.querySelector('#email').focus();
        return false;

    } else if (password === "") {
        alert("É obrigatório informar a senha!");
        document.querySelector('#password').focus();
        return false;
    } else {
        alert("Teste");
        caminhourl = "/MultiplaEscolhaViewController/Servlet?acao=Logar";
        form.action = caminhourl;
        form.submit();
    }
}
