package aboutHystrix;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import Topic.topic;

@RestController
public class topicController {
	@SuppressWarnings("unused")
	@Autowired
	private TopicService topicservice;
	
	@RequestMapping("/topics")
	@HystrixCommand(fallbackMethod="getFallback")
	public List<topic> getAllTopics() {
		return TopicService.getAllTopics();
		}


public List<topic> getFallback() {
	return Arrays.asList(new topic("no topic","null","null"));
}
}