package zuul.filter;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import ch.qos.logback.classic.Logger;

@Component
public class PreFilter extends ZuulFilter{
	private static Logger log=(Logger) LoggerFactory.getLogger(PreFilter.class);
	
	
	public String filterType() {
		return "pre";
	}
	public int filterOrder() {
		return 1;
	}
	public boolean shouldFilter() {
		return true;
	}
	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		
		log.info("PreFilter: "+String.format("%s request to %s", request.getMethod(),request.getRequestURL().toString()));
		return null;
		
	}
}
