let express = require("express");
let app = express();
app.listen(3000, function () {
    console.log("express server has started");
});

app.get("/", function (req, res) {
    res.send("Hello James");
});