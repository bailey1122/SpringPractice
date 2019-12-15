//package com.spr.scopes;
//
//import org.springframework.beans.factory.ObjectFactory;
//import org.springframework.beans.factory.config.Scope;
//import org.springframework.context.support.SimpleThreadScope;
//
//public class Custom implements Scope {
//    @Override
//    public Object get(String s, ObjectFactory<?> objectFactory) {
//        return null;
//    }
//
//    @Override
//    public Object remove(String s) {
//        return null;
//    }
//
//    @Override
//    public void registerDestructionCallback(String s, Runnable runnable) {
//
//    }
//
//    @Override
//    public Object resolveContextualObject(String s) {
//        return null;
//    }
//
//    @Override
//    public String getConversationId() {
//        return null;
//    }
//
////    Scope threadScope = new SimpleThreadScope();
////    beanFactory.registerScope("thread", threadScope);
//}
