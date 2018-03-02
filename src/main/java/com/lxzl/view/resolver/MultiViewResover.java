package com.lxzl.view.resolver;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class MultiViewResover extends InternalResourceViewResolver {

    private static List<ViewResolver> resolvers = new ArrayList<ViewResolver>();

    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {

    	View view = null;
        for (ViewResolver resolver : resolvers) {

        	view = resolver.resolveViewName(viewName, locale);
        	if(view != null) {
        		break;
        	}
		}

        return view;
    }

    public List<ViewResolver> getResolvers() {
        return resolvers;
    }
    
    public void addResolver(ViewResolver viewResolver) {
    	resolvers.add(viewResolver);
    }
}
