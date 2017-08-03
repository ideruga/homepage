package com.ideruga.homepage.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@ComponentScan(basePackages = "com.ideruga")
@EnableWebMvc
public class ApplicationConfig extends WebMvcConfigurerAdapter {

	
	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.ignoreAcceptHeader(true).defaultContentType(MediaType.TEXT_HTML);
	}


//	@Bean  
//    public UrlBasedViewResolver htmlViewResolver() {  
//      UrlBasedViewResolver resolver = new UrlBasedViewResolver();  
//      resolver.setPrefix("/webapp/");  
//      resolver.setSuffix(".html");
//      resolver.setCache(false);
//      resolver.setOrder(1);
//      resolver.setViewClass(JstlView.class);  
//      return resolver;  
//    }	
    @Bean
    public InternalResourceViewResolver jspViewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setPrefix("/");
        bean.setSuffix(".jsp");
        return bean;
    }
}
