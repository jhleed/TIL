let chai = require("chai");
let expect = chai.expect;
let HelloWorld = require("../src/helloworld");

describe("helloworld test", function () {
   it("it's test message 1",function () {
       let helloWorld = new HelloWorld();
       expect(helloWorld.say()).to.equal("hello world");
   })
});
