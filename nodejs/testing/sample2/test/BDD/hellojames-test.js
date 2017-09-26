let chai = require("chai");
let expect = chai.expect;
let HelloJames = require("../../src/hellojames");

describe("BDD Style", function () {
    describe("example 1", function () {
        it("it's bdd example 1", function () {
            let helloJames = new HelloJames();
            expect("hello james!").to.equal(helloJames.say());
        });
    });
});
