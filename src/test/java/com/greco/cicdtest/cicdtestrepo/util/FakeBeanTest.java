package com.greco.cicdtest.cicdtestrepo.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FakeBeanTest {

    @Autowired
    FakeBean fakeBean;

    @Test
    public void thisShouldReturnFive() {
        assertThat(5).isEqualTo(fakeBean.thisShouldReturnFive(""));
    }

}