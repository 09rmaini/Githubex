var http=require("http");
var mysql=require("mysql");
var url= require('url');
        
function connection() {
    var con =mysql.createConnection({
        host: "localhost",
        user: "root",
        password: "",
        database:"tellus"
    });
    con.connect(function(err) {
        if (err) {
            console.log(err);
            console.log("Err in connection");
           }
        else{
                var server=http.createServer(function(req,res){
                        var myUrl=url.parse(req.url,true);
                        var myData=myUrl.query;
                        var myPath=myUrl.pathname;
                        res.writeHead(200, {'content-type':'text/html'}); // sends repsonse header to the request (i.e. html/xml/Json language with text, plain
                        // 200 means successfull, 404 is unsuccessful,
                        //last arguments are the response headers
                       // if(myPath=="/"){
                                res.write("<h1>"+"Consultants"+"</h1>");
                                 res.write("<a href='http://localhost:8220'>home</a>");
                                 res.write("<br>");
                               
                            
                                              //  console.log("Name:  "+ record.name);
                                                if (myPath=="/"){
                                                    con.query("Select * from personal", function(err,result){
                                                       
                                                    result.forEach(function(record) {
                                                        res.write("<h3>"+"S.no   "+"</h3>");
                                                        var Sno=record.regno/10
                                                        res.write("<h3>"+Sno+"</h3>");
                                                        res.write("<h3>"+"Reg No. "+"</h3>");
                                                        res.write("<a href='http://localhost:8220/regnum?sno="+Sno+"'>"+record.regno+"</a>");
                                                        res.write("Name");
                                                        res.write("<a href='http://localhost:8220/nameid?regno="+record.regno+"'>"+record.name+"</a>");
                                                        res.write("Delete  ");
                                                        res.write("<a href='http://localhost:8220/delete?regno="+record.regno+"'>regno"+record.name+"</a>");
                                                        res.write("<br>");
                                                        });
                                                    });
                                                }

                                                if (myPath== "/regnum") {
  
                                                   con.query("Select * from salaries", function(err,result){
                                                       if(result) {
                                                           result.forEach(function(record) {
                                                               res.write("<h3>"+"S.no   "+"</h3>");
                                                               var Sno=record.regno/10         
                                                               res.write("<h3>"+Sno+"</h3>");
                                                               res.write("<h3>"+"Salary   "+"</h3>");
                                                               res.write("<h3>"+record.salary+"</h3>"); 
                                                               res.write("<h3>"+"Date   "+"</h3>");
                                                               res.write("<h3>"+record.date+"</h3>"); 
                                                           })
                                                       }

                                                   })



                                                }

                                                if (myPath== "/nameid") {
                                                   var Low=myData.regno
                                                  // console.log(Low);
                                                   con.query("Select * from results Where regno=" + Low, function(err,result){
                                                        if(result) {
                                                                var Sno=1;
                                                                var total=0;
                                                                result.forEach(function(record) {
                                                                    res.write(Sno + "..." + record.subject +" ..."+record.marks +"...");
                                                                    res.write("<br>");

                                                                    Sno=Sno+1;
                                                                    total+=record.marks;
                                                                })
                                                                 var percentage=total*100/450
                                                                 var result="pass"
                                                                 if (percentage<60) {
                                                                     result="fail"
                                                                 }


                                                                 res.write("Total: "+ total + "..." + "percentage:"+ "..." + percentage + "%");
                                                                 res.write("<br>");
                                                                  res.write("Result: "+ result);

                                                            }

                                                        })
                                                }



                                                 if(myPath=='/delete') {
                                                    var Low=myData.regno
                                                    console.log(Low);
                                                    con.query("Delete From personal Where regno='"+myData.regno +"'" , function(err,result){
                                                       
                                                            console.log("about to be deleted");
                                                            result.forEach(function(record) {
                                                            res.write(+ Low + " Account deleted")
                                                            });
                                                        
                                                    });

                                                 }

                                                 if(myPath=='/delete') {
                                                    var Low=myData.regno
                                                    console.log(Low);
                                                    con.query("Delete From results Where regno='"+myData.regno +"'" , function(err,result){
                                                       
                                                            console.log("about to be deleted");
                                                            result.forEach(function(record) {
                                                            res.write(+ Low + " Account deleted")
                                                            });
                                                        
                                                    });

                                                      

                                                 }


                                                 if(myPath=='/delete') {
                                                    var Low=myData.regno
                                                    console.log(Low);

                                                     con.query("Delete From salaries Where regno='"+myData.regno +"'" , function(err,result){
                                                       
                                                            console.log("about to be deleted");
                                                            result.forEach(function(record) {
                                                            res.write(+ Low + " Account deleted")
                                                            });
                                                        
                                                    });
                                                 

                                                 }


                                                 

                                                 

                                                    







                                                
                                        }).listen(8220);
                                        
                                    
                                            
                                    

                        }
                        
            
    })
}

connection();

