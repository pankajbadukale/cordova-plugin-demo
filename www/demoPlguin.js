var exec = require('cordova/exec');
var platform = require('cordova/platform');

/**
 * Provides access to notifications on the device.
 */

module.exports = {
    test: function(message, completeCallback) {
        exec(completeCallback, null, "DemoPlugin", "test", [message]);
    },
    okfine: function(message, count, completeCallback) {
        exec(completeCallback, null, "DemoPlugin", "okfine", [count, message]);
    }
};
