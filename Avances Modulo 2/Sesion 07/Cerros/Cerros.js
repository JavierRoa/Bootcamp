var totalCerros = 0;


let lista = [1,-1,-1,1,1,1,
    0,0,0,1,-1,0,-1,-1,0,0,0,-1,0, -1,
    1,1,0,0,0,
    1,1,0,0,0,0,1,0,-1,0,1,-1,-1,1,0,0,0,0,0,-1,0,1,0,0,1,
   
];

console.log ("lista", lista);

document.getElementById('info').innerHTML=lista
document.getElementById('hill').innerHTML=totalCerros
console.log("Número de cerros", totalCerros)