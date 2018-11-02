var http = require("http");
var url = require("url");
var mysql=require("mysql");

var localhost = 8250;
var pass = "";
var dbase = "rmail";

function centerWord(res, word){
    res.write("<center>");
    res.write(word);
    res.write("</center>");
}

function writeOn(res, word){
    for (var i = 0; i < word.length; i++){
        res.write(word[i]);
    }
}

function connection(){
    
    var con = mysql.createConnection({ //connecting to sql
        host: "localhost",
        user: "root",
        password: "",
        database: "rmail", //selecting database
    });

    con.connect(function(err){
        if (err){
            //throw err;
            console.log(err);
            console.log("Error in connection");
        }
        else{
            console.log("connected!");

            var server = http.createServer(function(req, res){ //creating a server
                var myUrl = url.parse(req.url, true);
                var myData = myUrl.query;
            
                res.writeHead(200, {'content-type': 'text/html'}) //idk waht this does but need it 
                res.write("<br>");
                res.write("<a href='http://localhost:8225'>bo back home</a>");
                res.write("<br>");

                if (myUrl.pathname == ("/delete")){
                    centerWord(res, "Delete Emails");
                    writeOn(res, [])
                    res.end();
                }
                else if (myUrl.pathname == ("/inbox")){
                    centerWord(res, "Inbox");
                    writeOn(res, [])
                    res.end();
                }
                else if (myUrl.pathname == ("/send")){
                    centerWord(res, "Send Emails");
                    writeOn(res, [])
                    res.end();
                }
                else {
                    centerWord(res, "Welcome to rmail");
                    writeOn(res, ["<table border = 1>",
                    "<tr>", 
                    "<td>",
                    "<a href='http://localhost:" + localhost + "/inbox' >Inbox </a>", 
                    "<td>",
                    "<a href='http://localhost:" + localhost + "/send' >Send Email </a>",
                    "<td>", 
                    "<a href='http://localhost:" + localhost + "/delete' >Delete Emails </a>",
                    "</td>",
                    "</tr>",
                    "</table>"])
                    res.end();
                }
            });
            server.listen(localhost);
        
        }
    });
    return con;
}

var con = connection();