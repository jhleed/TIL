let express = require("express");
let app = express();
let router = require("./router/main")(app);


app.set("views", __dirname + "/views");
app.set("view engine", "ejs");
app.engine("html", require("ejs").renderFile);

app.listen(3000, function () {
    console.log("express server has started");
});
