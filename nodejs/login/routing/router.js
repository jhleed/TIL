let request = require("request");
exports.on = function (app) {
    app.get("/login", function (req, res) {
        res.sendFile("login.html", {root: "./client"});
    });

    app.post("/login", function (req, res) {
        let email = req.body.email;
        let password = req.body.password;

        request.post(
            "http://localhost:8080/auth/login",
            {json: {email: email, password: password}},
            function (error, response, body) {
                if (body.error) {
                    res.send({success: false, result: body});
                } else {
                    //TODO session에 사용자 정보와 jwt 저장
                    res.send({success: true, result: body});
                }
                res.end();
            }
        );
    });

    app.get("/hello", function (req, res) {
        console.log("실행1");
        res.write("hello world\n");
        res.end("it's end!");
    });

    //TODO 현재 주소창에 정적인 파일을 요청하면 그냥 돌려주는 문제 있음 (/bar.html)

    app.get("/static/foo", function (req, res) {
        res.sendFile("foo.html", {root: "./client"});
    });

    app.get("/static/bar", function (req, res) {
        res.sendFile("bar.html", {root: "./client"});
    });

    /*app.get("*",function (req, res) {
        console.log("실행2");
        res.end();
    });*/
};