let express = require("express");
let path = require("path");
let app = express();
let bodyParser = require("body-parser");

app.use(bodyParser.urlencoded({extended: true}));
app.use(bodyParser.json());
app.use(express.static(path.join(__dirname, "client")));

const server = require("http").createServer(app);

server.listen(3000, function () {
    console.log("listening on %d", server.address().port);
});

let router = require("./routing/router");
router.on(app);
