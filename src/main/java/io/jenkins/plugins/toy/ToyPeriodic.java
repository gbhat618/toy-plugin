package io.jenkins.plugins.toy;

import java.util.logging.Logger;

import hudson.Extension;
import hudson.model.PeriodicWork;

//@Extension
public class ToyPeriodic extends PeriodicWork {

    Logger LOGGER = Logger.getLogger(ToyPeriodic.class.getName());

    @Override
    public long getRecurrencePeriod() {
        return 1000L;
    }

    @Override
    protected void doRun() throws Exception {
        LOGGER.info("toy periodic is executing");
    }
}
