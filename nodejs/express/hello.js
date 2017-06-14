/**
 * Created by james on 2017. 6. 14..
 */

let express = require("express");
let app = express();
let port = 3000;

app.get("/", (req, res) =>{
    res.end("Hello world");
});

app.listen(port, () => console.log("The server is running, port is %s", port));