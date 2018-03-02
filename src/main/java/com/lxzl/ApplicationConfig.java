package com.lxzl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.freemarker.FreeMarkerView;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

@Configuration
public class ApplicationConfig {

	/**
	 *  ########################################################
		###FREEMARKER (FreeMarkerAutoConfiguration)
		########################################################
		spring.freemarker.allow-request-override=false
		spring.freemarker.cache=true
		spring.freemarker.check-template-location=true
		spring.freemarker.charset=UTF-8
		spring.freemarker.content-type=text/html
		spring.freemarker.expose-request-attributes=false
		spring.freemarker.expose-session-attributes=false
		spring.freemarker.expose-spring-macro-helpers=false
		#spring.freemarker.prefix=/templates/
		#spring.freemarker.request-context-attribute=
		#spring.freemarker.settings.*=
		spring.freemarker.suffix=.html
		#spring.freemarker.template-loader-path=classpath:/templates/ #comma-separated list
		#spring.freemarker.view-names= # whitelist of view names that can be resolved
		
		##\u9ED8\u8BA4\u524D\u7F00
		spring.mvc.view.prefix=/
		## \u54CD\u5E94\u9875\u9762\u9ED8\u8BA4\u540E\u7F00
		#spring.mvc.view.suffix=.html
	 */
//	@Bean
//	public ViewResolver jspViewResolver() {
//		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//		viewResolver.setOrder(0);
//		viewResolver.setViewClass(JstlView.class);
//		viewResolver.setPrefix("/WEB-INF/jsp/");
//		viewResolver.setSuffix(".jsp");
//		viewResolver.setContentType("text/html;charset=UTF-8");
//
//		return viewResolver;
//	}
	
	@Bean
	public ViewResolver freeMarkerViewResolver() {

		FreeMarkerViewResolver viewResolver = new FreeMarkerViewResolver();
		viewResolver.setOrder(1);
		viewResolver.setViewClass(FreeMarkerView.class);
		viewResolver.setPrefix("/freemarker/");
		viewResolver.setSuffix(".html");
		viewResolver.setContentType("text/html;charset=UTF-8");

		return viewResolver;
	}
}
