package com;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration										//beans.xml
@ComponentScan(basePackages="com")					//<context:component-scan base-package="com"></context:component-scan>
public class MyConfiguration {

}
