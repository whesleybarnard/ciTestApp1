package org.whes.ciTestApp1;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void getName() throws Exception {
        App app = new App();

        Assert.assertEquals("This is my test app", app.getName());
    }

}