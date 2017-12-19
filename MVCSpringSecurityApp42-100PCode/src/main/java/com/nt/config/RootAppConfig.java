package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value={PersistenceConfig.class,SecurityConfig.class})
public class RootAppConfig {

}
