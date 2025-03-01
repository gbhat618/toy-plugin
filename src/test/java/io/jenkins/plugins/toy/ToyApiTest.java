package io.jenkins.plugins.toy;

import org.junit.Rule;
import org.junit.Test;
import org.jvnet.hudson.test.JenkinsRule;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ToyApiTest {

    @Rule
    public JenkinsRule j = new JenkinsRule();

    @Test
    public void testJson() throws Exception {
        j.jenkins.setSecurityRealm(j.createDummySecurityRealm());
        var client = j.createWebClient();
        client.login("admin", "admin");
        var response = client.goTo("./toy/sample/", "application/json").getWebResponse().getContentAsString();
        assertThat(response, containsString("Hello"));
    }
}
