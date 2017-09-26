let chai = require("chai");
let expect = chai.expect;
let HelloWorld = require("../../src/helloworld");

describe("BDD Style", function () {
    describe("example 1" ,function () {
        it("it's bdd example 1",function () {
            let helloWorld = new HelloWorld();
            expect(helloWorld.say()).to.equal("hello world");
        });

        it("it's bdd example 2",function () {
            let helloWorld = new HelloWorld();
            expect(helloWorld.say()).to.equal("hello world");
        });
   });

    describe("example 3" ,function () {
        it("it's bdd example 4",function () {
            let helloWorld = new HelloWorld();
            expect(helloWorld.say()).to.equal("hello world");
        });

        it("it's bdd example 5",function () {
            let helloWorld = new HelloWorld();
            expect(helloWorld.say()).to.equal("hello world");
        });
    });
});
