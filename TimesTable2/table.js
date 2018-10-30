var ref= require('http');
var url= require('url');

var server=ref.createServer(function(req,res){

var myUrl=url.parse(req.url,true);
var myData=myUrl.query;
var myPath=myUrl.pathname;
res.writeHead(200, {'content-type':'text/html'}); // sends repsonse header to the request (i.e. html/xml/Json language with text, plain
        // 200 means successfull, 404 is unsuccessful,
    //last arguments are the response headers
    if(myPath=="/"){
        res.write("<h1>"+"Select times table"+"</h1>");
        for(var i=1;i<=10;i++){
            
            res.write("<br>");
            res.write("<a href='http://localhost:8020/range?table="+i+"'>"+i+"</a>");
        }
    }
    if(myPath== '/range') {
        var T=myData.table;
        res.write("<h2> Table Selected is "+T +"</h2>");
    
        res.write("<h2> >Select range</h2>");
        for(var i=1;i<=200;i++){
            res.write("<a href='http://localhost:8020/showtimestable?R=" + i + "&T="+T+"'>"+i+"</a>");
            res.write("<br>");
        }
    }
    if(myPath=="/showtimestable"){
        var T1=myData.T;
        var R1=myData.R;
        for(var i=1;i<=R1;i++){
            res.write(T1 + " x " + i + " = " + (T1*i));
            res.write("<h3>");

        }

    }
    
    res.end();


}
);

server.listen(8020);

