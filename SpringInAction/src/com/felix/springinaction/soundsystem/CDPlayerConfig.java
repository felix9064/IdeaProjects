package com.felix.springinaction.soundsystem;


import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * Description: Spring的配置类，定义了Spring的装配规则，在自动装配和显式Java装配时需要用到此类
 * Author: Felix
 * Date: 2017/3/6.
 * Configuration注解表明这个类是一个配置类，是Spring创建JavaConfig的关键
 * ComponentScan注解表示启用组件扫描，
 *              会在Spring上下文创建时自动为使用了@Autowired注解的bean装配满足条件的使用了@Component注解的组件
 */
@Configuration
//@ComponentScan(basePackageClasses = CompactDisc.class)
public class CDPlayerConfig {

    @Bean(name = "lonelyHeartClub2")
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    @Bean(name = "mmp")
    public CDPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers());
    }

    /**
     * 该bean依赖于CompactDisc组件，这种是装配依赖bean的最佳方式
     * @param compactDisc
     * @return
     */
    @Bean(name = "another")
    public CDPlayer anotherCDPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}
