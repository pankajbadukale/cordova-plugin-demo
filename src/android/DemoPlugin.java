package org.apache.cordova.demo;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.LOG;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class DemoPlugin extends CordovaPlugin {

    /**
     * Executes the request and returns PluginResult.
     *
     * @param action            The action to execute.
     * @param args              JSONArray of arguments for the plugin.
     * @param callbackContext   The callback context used when calling back into JavaScript.
     * @return                  True when the action was valid, false otherwise.
     */
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    	/*
    	 * Don't run any of these if the current activity is finishing
    	 * in order to avoid android.view.WindowManager$BadTokenException
    	 * crashing the app. Just return true here since false should only
    	 * be returned in the event of an invalid action.
    	 */
    	if(this.cordova.getActivity().isFinishing()) return true;
    	
        if (action.equals("test")) {
            this.test(args.getString(0));
            callbackContext.success('pankaj');
            return true;
        }
        else if (action.equals("okfine")) {
            this.okfine(args.getString(0), args.getString(1), callbackContext);
            return true;
        }
        else {
            return false;
        }
    }

    //--------------------------------------------------------------------------
    // LOCAL METHODS
    //--------------------------------------------------------------------------

    public void test(final long count) {
        return true;
    }
    public void okfine(String a, String b, CallbackContext callbackContext) {
        callbackContext.success(b);//return some text in success
        return true;
    }
}
