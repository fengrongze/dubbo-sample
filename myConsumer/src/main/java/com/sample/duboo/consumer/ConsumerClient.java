package com.sample.duboo.consumer;

import com.service.FacadeService;
import com.service.HelloService;
import com.service.entity.WalletEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fengrongze on 2017/8/15.
 */
public class ConsumerClient {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");

        for (int i = 0; i <100 ; i++) {
            HelloService helloService = (HelloService) context.getBean("helloService");
            String result = helloService.speakHello("yyf");
            System.out.println(result);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        FacadeService facadeService= (FacadeService) context.getBean("facadeService");
        WalletEntity walletEntity = facadeService.queryWallet(1);

        System.out.println(walletEntity.toString());


    }
}
