var http=require("http");
var mysql=require("mysql");

function connection() {
    var con =mysql.createConnection({
        host: "localhost",
        user: "root",
        password: "",
        database:"nodebf"
    });
    con.connect(function(err) {
        if (err) {
            //throw err
            console.log(err);
            console.log("Err in connection");

        }
        else{
            console.log("Connected!");
            con.query("Select * from personal", function(err,result){
            result.forEach(function(record) {
            console.log("Registration Number:  "+record.regno);
            console.log("Name:  "+ record.name);
            console.log("Address: "+ record.address);
            })

        });

     }
    });
    return con;
}

connection(); //need this or won't run
//in terminal:  npm install mysql
//then: node connect.js

