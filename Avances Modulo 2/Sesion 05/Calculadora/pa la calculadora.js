 window.onload=function(){
    var más = document.getElementById('más');
    var menos = document.getElementById('menos');
    var por = document.getElementById('por');
    var dividido = document.getElementById('dividido');
    var borrar = document.getElementById('borrar');
 
    function clickButtonmás(){
        let numero1=document.getElementById('valor1').value;
        let numero2=document.getElementById('valor2').value;
        let resultado=parseFloat(numero1) + parseFloat(numero2);
        document.getElementById('resultado').value=resultado;
    }

    function clickButtonmenos(){
        let numero1=document.getElementById('valor1').value;
        let numero2=document.getElementById('valor2').value;
        let resultado=parseFloat(numero1) - parseFloat(numero2);
        document.getElementById('resultado').value=resultado;
    }

    function clickButtonpor(){
        let numero1=document.getElementById('valor1').value;
        let numero2=document.getElementById('valor2').value;
        let resultado=parseFloat(numero1) * parseFloat(numero2);
        document.getElementById('resultado').value=resultado;
    }

    function clickButtondividido(){
        let numero1=document.getElementById('valor1').value;
        let numero2=document.getElementById('valor2').value;
        let resultado=parseFloat(numero1) / parseFloat(numero2);
        document.getElementById('resultado').value=resultado;
    }

    function clickButtonborrar(){
        document.getElementById('valor1').value=null;
        document.getElementById('valor2').value=null;
        document.getElementById('resultado').value=null;
    }

    más.addEventListener("click", clickButtonmás);
    menos.addEventListener("click", clickButtonmenos);
    por.addEventListener("click", clickButtonpor);
    dividido.addEventListener("click", clickButtondividido);
    borrar.addEventListener("click", clickButtonborrar);
}