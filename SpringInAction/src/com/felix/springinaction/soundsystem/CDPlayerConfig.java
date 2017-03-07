package com.felix.springinaction.soundsystem;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Felix on 2017/3/6.
 */
@Configuration
@ComponentScan(basePackageClasses = CompactDisc.class)
public class CDPlayerConfig {

}
