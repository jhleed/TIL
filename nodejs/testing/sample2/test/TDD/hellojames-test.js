let chai = require('chai');
let expect = chai.expect; // we are using the "expect" style of Chai
let HelloJames = require("../../src/hellojames");

suite('TDD Style', function () {
    suiteSetup(function () {
        // excuted before test suite
    });

    suiteTeardown(function () {
        // excuted after test suite
    });

    setup(function () {
        // excuted before every test
    });

    teardown(function () {
        // excuted before every test
    });

    suite('#example', function () {
        test("example", function () {
            // write test logic
            let helloJames = new HelloJames();
            expect("hello james!").to.equal(helloJames.say());
        });
    });
});