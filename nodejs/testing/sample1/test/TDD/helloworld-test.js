let chai = require("chai");
let expect = chai.expect;
let HelloWorld = require("../../src/helloworld");

suite('TDD Style', function() {
    suiteSetup(function() {
        // excuted before test suite
    });

    suiteTeardown(function() {
        // excuted after test suite
    });

    setup(function() {
        // excuted before every test
    });

    teardown(function() {
        // excuted before every test
    });

    suite('#example', function() {
        test('this is a test', function() {
            // write test logic
            let helloWorld = new HelloWorld();
            expect(helloWorld.say()).to.equal("hello world");
        });
    });
});
