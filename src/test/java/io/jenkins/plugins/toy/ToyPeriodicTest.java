package io.jenkins.plugins.toy;

import java.util.logging.Level;

import org.junit.Rule;
import org.junit.Test;
import org.jvnet.hudson.test.JenkinsRule;
import org.jvnet.hudson.test.LoggerRule;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ToyPeriodicTest {

    @Rule
    public JenkinsRule j = new JenkinsRule();

    @Rule
    public LoggerRule lr = new LoggerRule().record(ToyPeriodic.class.getName(), Level.INFO).capture(100);

    @Test
    public void testPeriodicWork() throws InterruptedException {
        Thread.sleep(3);

        for (String message : lr.getMessages()) {
            assertThat(message, containsString("toy periodic is executing"));
        }
    }
}
