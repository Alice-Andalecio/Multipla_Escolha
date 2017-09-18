window.onload = function(){
	document.querySelector('#editar_perfil').addEventListener('click', function(){ AbrirPaginaAtualizacao() });
}

function AbrirPaginaAtualizacao(){
	window.open('atualizacaoDados.html');
}