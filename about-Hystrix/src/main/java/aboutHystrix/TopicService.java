package aboutHystrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import Topic.topic;

@Service
public class TopicService {

private static List<topic> topics=new ArrayList<>(Arrays.asList(		 
				new topic("Spring","Spring Framework","Spring API"),
				new topic("java","core java","java description"),
				new topic("Spring core","Spring Framework","Spring API description")));
public static List<topic> getAllTopics(){
	return topics;
	
}
public static topic getTopic(String id) {
    return	topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
}
public static void addTopic(topic topic1) {
	topics.add(topic1);	
}
public static void updateTopic(String id, topic topic1) {
	for(int i=0;i<topics.size();i++) {
		topic t=topics.get(i);
		if (t.getId().equals(id)) {
			topics.set(i, topic1);
			return;
		}
	}
	
}
public void deleteTopic(String id) {
	topics.removeIf(t ->t.getId().equals(id));
}
}