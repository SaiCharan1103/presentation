package zuul.filter;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import ch.qos.logback.classic.Logger;

@Component
public class PostFilter extends ZuulFilter {
	private static Logger log=(Logger) LoggerFactory.getLogger(PostFilter.class);
	
	public String filterType() {
		return "post";
	}
	public int filterOrder() {
		return 1;
	}
	public boolean shouldFilter() {
		return true;
	}
	public Object run() {
		HttpServletResponse response = RequestContext.getCurrentContext().getResponse();
		
		log.info("PostFilter: " +String.format("response's content type is %s", response.getStatus()));
		return null;
	}

}
