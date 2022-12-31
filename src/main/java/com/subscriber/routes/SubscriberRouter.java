package com.subscriber.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SubscriberRouter extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("kafka:com.topic.publish")
		.log("message received from kafka is : " + "${body}");
	}

}
