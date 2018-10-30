var phy=100;
var che=80;
var mat=90;

var total=phy+che+mat;
var per=total*100/450;

console.log("Total:" +total) //outputs in console log
console.log("Percentage" +per)

if(per>=60) {
    console.log("pass")
}
else {
    console.log("fail")
}