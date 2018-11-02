var http=require("http");
var mysql=require("mysql");
var url= require('url');
var fs = require('fs');

function connection() {
    var con=mysql.createConnection({
        host: "localhost",
        user: "root",
        password: "",
        database: "rmail"
    });
    con.connect(function(err) 
    {
            if (err) 
            {
                console.log(err);
                console.log("Error in connection");
            }
            else 
            {
                var server=http.createServer(function(req,res){
                    var myUrl=url.parse(req.url,true);
                    var myData=myUrl.query;
                    var myPath=myUrl.pathname;

                    fs.readFile('createaccount.html', function(err, data3) 
                         {


                        fs.readFile('reademails.html', function(err, data2) 
                            {

                   
                            fs.readFile('loginpage.html', function(err, data1) 
                                 { 

                    res.writeHead(200, {'content-type':'text/html'});

                    res.write("<h1>"+"Rmail"+"</h1>");
                    res.write("<br>");
                    res.write("<a href='http://localhost:8225'>home</a>");
                    res.write("<br>");

                    if((myPath=="/create")) 
                    {
                        

                        res.write("<h2>Create Account</h2>");
                        res.write("<br>");
                        res.write(data3);
                        
                  
                    }

                    else if(myPath=="/login") 
                    {

                       // con.query("Select * from users", function(err,result){

                           // result.forEach(function(record) {


                                res.write("<h2>Login</h2>");
                                res.write("<br>");
                                res.write(data1); //bring in the html file

                               // res.write(data1.username)

                            
                                // console.log(username);
                                // console.log(password);
                                
                               

                           // });


                       // });

                       

                    

                    }

                    else if(myPath=="/emails")
                    {
                        res.write("<h2>Welcome your emails</h2>");
                        
                        res.write("<br>");
                        res.write(data2);
                       




                    }



                    
                    else 
                    {
                        res.write("<a href='http://localhost:8225/login?'>login</a>");
                        res.write("<br>");
                        res.write("<a href='http://localhost:8225/create?'>create account</a>");
                        res.write("<br>");
                        res.write("<a href='http://localhost:8225/emails?'>emails</a>");
                        res.end();
                    }


                         });    


                    });


                });

            });
                server.listen(8225);
                
            }
    });
   
}

connection();