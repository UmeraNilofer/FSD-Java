//let num = [100,200,300,400,500]
// document.write("<br/> num "+num)
// document.write("<br/> num "+num.join("->"))
// document.write("<br/> Retrieve elements using For loop")
// for(i=0;i<num.length;i++) {
//     document.write("<br/> Value is "+num[i]);
// }
// document.write("<br/> Retreive element using for in loop")
// for(let i in num){
//     document.write("<br/> index "+i+" Value "+num[i]);
// }
// document.write("<br/> Retreive element using for of loop")
// for (let n of num) {
//     document.write("<br/> Value "+n);
// }

// document.write("<br/> retrieve using callback")
// num.forEach(display);
// function display(v,i){
//     document.write("<br/> Value is "+v+" index is "+i)
// }

// document.write("<br/> retrieve using callback function as expression")
// num.forEach(function display(v,i){
//     document.write("<br/> Value is "+v+" index is "+i)
// });

// document.write("<br/> retrieve using arrow function")
// num.forEach((v,i)=>document.write("<br/> Value is "+v+" index is "+i))

//let num = [100,111,200,222,300,333,400,444,500,555]

//num.map(e=>e+10).forEach(v=>document.write("<br/> Value is "+v));
//num.filter(v=>v%2==0).forEach(v=>document.write("<br/> Value is "+v));
//num.filter(v=>v%2!=0).forEach(v=>document.write("<br/> Value is "+v));

let num = [10,20,30,40,50,60];
            //num.reduce()
document.write("<br/> "+num+"<br/>");
let total=num.reduce((pv,cv)=>pv+cv)
document.write(total)

let total1= num.reduce(function(pv,cv) {
    document.write("<br/>previous value "+pv);
    document.write("<br/>current value "+cv);
    return pv+cv;
})
document.write("<br/>Total at last "+total1)