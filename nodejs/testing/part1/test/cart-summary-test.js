let chai = require('chai');
let expect = chai.expect; // we are using the "expect" style of Chai
let CartSummary = require('../src/cart-summary');

describe('CartSummary', function() {
    it('getSubtotal() should return 0 if no items are passed in', function() {
        var cartSummary = new CartSummary([]);
        expect(cartSummary.getSubtotal()).to.equal(0);
    });
});