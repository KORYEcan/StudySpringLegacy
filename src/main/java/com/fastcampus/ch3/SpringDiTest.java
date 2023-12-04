//package com.fastcampus.ch3;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.GenericXmlApplicationContext;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.Resource;
//import java.util.Arrays;
////@Component
//class Engine {}   // <bean id="engine"
//@Component
//class SuperEngine extends Engine {}
//@Component
//class TurboEngine extends Engine {}
//
//@Component
//class Door {}
//@Component
//class Car {
//
//    @Value("red")
//    String color;
//
//    @Value("100")
//    int oil;
//
//
//
//    //    @Autowired
//    //   @Qualifier("superEngine")
//    @Resource(name="superEngine")
//    Engine engine;//byType -> 타입으로 먼저 검색 , 여러개면 이름으로 검색  , egngine, superEngine, turboEngine
//
//    @Autowired
//    Door[] doors;
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public void setOil(int oil) {
//        this.oil = oil;
//    }
//
//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }
//
//    public void setDoors(Door[] doors) {
//        this.doors = doors;
//    }
//    @Override
//    public String toString() {
//        return "Car{" +
//                "color='" + color + '\'' +
//                ", oil=" + oil +
//                ", engine=" + engine +
//                ", doors=" + Arrays.toString(doors) +
//                '}';
//    }
//}
//
//public class SpringDiTest {
//    public static void main(String[] args) {
//
//        ApplicationContext ac = new GenericXmlApplicationContext("config.xml");   //application을 사용할 설정 파일을 설정하기
////        Car car = ac.getBean("car",Car.class);  //byName 형변환 안해줘됨
//          Car car = (Car) ac.getBean("car");  //byName
//
////          Car car2 = ac.getBean("car",Car.class);  //byName 형변환 안해줘됨
////         Engine engine =  ac.getBean( "superEngine",Engine.class);  //byType
////         Door door = (Door) ac.getBean("door");
////         Door door2 = (Door) ac.getBean("door");
//
//
////         car.setColor("red");
////         car.setOil(100);
////         car.setEngine(engine);
////         car.setDoors(new Door[] { ac.getBean("door", Door.class),ac.getBean("door", Door.class)});
//
//        System.out.println("car = " + car);
//
//
//    }
//}
