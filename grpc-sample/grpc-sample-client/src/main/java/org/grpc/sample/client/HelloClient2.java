package org.grpc.sample.client;

import org.grpc.client.RpcProxy;
import org.grpc.sample.api.HelloService;
import org.grpc.sample.api.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloClient2 {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        RpcProxy rpcProxy = context.getBean(RpcProxy.class);

        HelloService helloService = rpcProxy.create(HelloService.class);
        String result = helloService.hello(new Person("Yong", "Huang"));
        System.out.println(result);

        System.exit(0);
    }
}
