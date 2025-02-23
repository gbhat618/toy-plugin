package io.jenkins.plugins.toy;

import hudson.Extension;
import hudson.model.AdministrativeMonitor;

@Extension
public class ToyAdminMonitor extends AdministrativeMonitor {

    @Override
    public boolean isActivated() {
        return true;
    }

    public String getBlurb() {
        return "Toy monitor is visible";
    }

    public String getDescription() {
        return "Just for demo";
    }
}
