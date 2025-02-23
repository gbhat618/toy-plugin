package io.jenkins.plugins.toy;

import hudson.model.PeriodicWork;
import java.util.logging.Logger;

// @Extension
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
