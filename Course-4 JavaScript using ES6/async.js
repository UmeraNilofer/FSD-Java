// document.write("<br/>Synchronous communication")
// document.write("<br/>1st statement")
// document.write("<br/>2nd statement")
// document.write("<br/>3rd statement")

// document.write("<br/>Asynchronous communication")
// document.write("<br/>1st statement")
// setTimeout(()=>{   
//     document.write("<br/>2 nd statement")
// },3000)
// setInterval(()=>{
//     document.write("<br/>3rd statement")
// },1000)

function fun(){
    setInterval(doTask,1000);   //1st parameter callback and 2nd parameter time 
}
var i=0
function doTask(){
    document.getElementById("abc").innerHTML=i
    if(i%2==0){
        document.getElementsByTagName("body")[0].style.background="Orange"
        document.getElementsByTagName("h2")[0].style.color="Green";
        document.getElementsByTagName("h2")[0].style.fontSize="20pt";
    } else{
        document.getElementsByTagName("body")[0].style.background="Aqua"
        document.getElementsByTagName("h2")[0].style.color="Pink";
        document.getElementsByTagName("h2")[0].style.fontSize="50pt";
    }
    i++
}