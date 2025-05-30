package io.jenkins.plugins.toy;

import java.io.IOException;
import java.util.logging.Logger;

import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.QueryParameter;
import org.kohsuke.stapler.StaplerRequest2;
import org.kohsuke.stapler.StaplerResponse2;
import org.kohsuke.stapler.interceptor.RequirePOST;

import jakarta.servlet.ServletException;
import net.sf.json.JSONObject;

import hudson.Extension;
import hudson.model.Describable;
import hudson.model.Descriptor;
import hudson.model.ManagementLink;
import hudson.util.FormValidation;
import jenkins.model.Jenkins;


@Extension
public class ToyManagement extends ManagementLink implements Describable<ToyManagement> {

    private static final Logger LOGGER = Logger.getLogger(ToyManagement.class.getName());

    @Override
    public String getIconFileName() {
        return "";
    }

    @Override
    public String getDisplayName() {
        return "Toy Management";
    }

    @Override
    public String getUrlName() {
        return "toyManagement";
    }

    @Override
    public Category getCategory() {
        return Category.CONFIGURATION;
    }

    private String field1;
    private String field2;

    public ToyManagement() {
    }

    @DataBoundConstructor
    public ToyManagement(String field2) {
        this.field2 = field2;
    }

    public String getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    @RequirePOST
    public void doConfigSubmit(StaplerRequest2 req, StaplerResponse2 rsp) throws IOException, ServletException {
        JSONObject form = req.getSubmittedForm();
        LOGGER.info("configuration data received: " + form);
        rsp.sendRedirect(".");
    }

    @Override
    public Descriptor<ToyManagement> getDescriptor() {
        return Jenkins.get().getDescriptorOrDie(ToyManagement.class);
    }

    @Extension
    public static final class ToyDescriptor extends Descriptor<ToyManagement> {
        @Override
        public String getDisplayName() {
            return "Toy Descriptor";
        }
    }
}
