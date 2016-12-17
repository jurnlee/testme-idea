package com.example.services.impl;

import com.example.foes.Fire;
import com.example.services.FooType;
import com.example.services.Result;
import com.example.warriers.FooFighter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/** created by TestMe integration test on MMXVI */
public class FooTest {
    @Mock
    FooFighter fooFighter;
    //Field result of type Result - was not mocked since Mockito doesn't mock enums
    @InjectMocks
    Foo foo;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testFight() throws Exception {
        Result result = foo.fight(new Fire(), new FooType());
        Assert.assertEquals(Result.WinWin, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: https://github.com/yaronyam/testme-intellij/issues