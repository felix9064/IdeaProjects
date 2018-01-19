package com.felix.springinaction.soundsystem;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * Description: 测试Spring的对bean组件的自动装配
 * Author: Felix
 * Date: 2017/3/6.
 * RunWith注解是通过SpringJUnit4ClassRunner类创建Spring应用上下文
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    /**
     * SystemOutRule是获取应用调用System.out.println()产生的内容
     */
    @Rule
    public final SystemOutRule rule = new SystemOutRule().enableLog();

    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        // 断言CompactDisc组件不为null，即在Spring应用容器中会自动创建cd这个组件
        assertNotNull(cd);
    }

    @Test
    public void play() {

        player.play();

        // 断言player.play()产生的控制台输出跟下面的字符串相等
        assertEquals("Playing Sgt. Peppers's Lonely Hearts Club Band" +
                " by The Beatles\r\n", rule.getLog());
    }
}
