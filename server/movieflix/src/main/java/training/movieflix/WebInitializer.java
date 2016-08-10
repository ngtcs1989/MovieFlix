package training.movieflix;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import training.movieflix.JPAConfig;
import training.movieflix.WebConfig;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class[] { WebConfig.class, JPAConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/api/*" };
	}
}

