package io.jenkins.plugins.toy;

import org.kohsuke.stapler.WebMethod;
import org.kohsuke.stapler.json.JsonHttpResponse;
import org.kohsuke.stapler.verb.GET;

import net.sf.json.JSONObject;

import hudson.Extension;
import hudson.model.UnprotectedRootAction;

//@Extension
public class ToyApi implements UnprotectedRootAction {

    @Override
    public String getIconFileName() {
        return "";
    }

    @Override
    public String getDisplayName() {
        return "";
    }

    @Override
    public String getUrlName() {
        return "toy";
    }

    @GET
    @WebMethod(name = "sample")
    public JsonHttpResponse sample() {
        var resp = JSONObject.fromObject(new ToyBean("Hello, world!"));
        return new JsonHttpResponse(resp, 200);
    }

    public static final class ToyBean {
        private String message;

        public ToyBean(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
