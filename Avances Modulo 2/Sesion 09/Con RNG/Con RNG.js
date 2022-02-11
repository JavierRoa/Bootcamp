var totalCerros = 0;
var cont = 0;



let lista = new Array(1000)



for (let i = 0; i < lista.length; i++) {
    var x = Math.floor(Math.random()*3);

    if (x==0) {
        lista[i]=-1;

    }else if(x==1){
        lista[i]=0;

    }else{
        lista[i]=1;
    } 
}

var contCerro=0;

console.log ("lista", lista);

for (let i = 1; i < lista.length-1; i++) {
    if (lista[i]==1 && lista[i+1]!=1 && lista[i-1]==1) {
        cont=1;
    }

    if (lista[i]==-1 && lista[i+1]==-1 && lista[i-1]!=-1 && cont==1) {
        totalCerros++;
        cont=0;
    }
}

document.getElementById('info').innerHTML=lista
document.getElementById('hill').innerHTML=totalCerros
console.log("Número de cerros", totalCerros)