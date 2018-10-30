var ref= require('http');
var url= require('url');

var server=ref.createServer(function(req,res){

var myUrl=url.parse(req.url,true);
var myData=myUrl.query;

console.log("Name" +myData.name);
console.log("Address" +myData.address);
console.log("Postcode" +myData.postcode);


}
);

server.listen(8020);