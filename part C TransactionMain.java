package com.example.transaction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TransactionMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringHibernateConfig.class);
        AccountService service = ctx.getBean(AccountService.class);
        service.transfer(1, 2, 500.0);
        System.out.println("Transaction completed successfully!");
        ctx.close();
    }
}
