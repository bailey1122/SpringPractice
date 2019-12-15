//package com.spr.dependencies;
//
//import org.springframework.beans.BeansException;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//
//import java.util.Map;
//
//// method injection
//public class CommandManager implements ApplicationContextAware {
//
//    private ApplicationContext applicationContext;
//
////    public Object process(Map commandState) {
////        // grab a new instance of the appropriate Command
////        Command command = createCommand();
////        // set the state on the Command instance
////        command.setState(commandState);
////        return command.execute();
////    }
////
////    protected Command createCommand() {
////        return this.applicationContext.getBean("command", Command.class);
////    }
//
//    public void setApplicationContext(
//            ApplicationContext applicationContext) throws BeansException {
//        this.applicationContext = applicationContext;
//    }
//}
