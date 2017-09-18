function escondeForum(forum) { //Ao clicar no botão "Fórum", respectivamente aparecerá o fórum da questão.
        var display = document.getElementById(forum).style.display;

        if(display == "none")
            document.getElementById(forum).style.display = 'block';
        else
            document.getElementById(forum).style.display = 'none';
    }

function escondeTexto(resp) { //Para o botão "Responder" presente no Fórum.
        var display = document.getElementById(resp).style.display;

        if(display == "none")
            document.getElementById(resp).style.display = 'block';
        else
            document.getElementById(resp).style.display = 'none';
    }