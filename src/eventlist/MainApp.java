/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventlist;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import eventlist.EventJDBCTemplate;

/**
 *
 * @author fauziachmadharuna
 */
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("eventlist/Beans.xml");
        EventJDBCTemplate eventJDBCTemplate = (EventJDBCTemplate) context.getBean("eventJDBCTemplate");
        System.out.println("------EVENT LIST AND ATTENDANCE--------");
        eventJDBCTemplate.create("Sekaten", 10000);
        eventJDBCTemplate.create("ARTJOG", 10000);
        eventJDBCTemplate.create("ORCHESTJOG", 500);
        System.out.println("------SAVING RECORDS--------");

        List<Event> events = eventJDBCTemplate.listEvents();
        for (Event record : events) {
            System.out.print("ID : " + record.getId());
            System.out.print(", Event : " + record.getEvent_name());
            System.out.println(", attendance : " + record.getAttendance());
        }
        System.out.println("----Updating Record with ID = 2 -----");
        eventJDBCTemplate.update(2, 100);
        System.out.println("----Listing Record with ID = 2 -----");
        Event event = eventJDBCTemplate.getEvent(2);
        System.out.print("ID : " + event.getId());
        System.out.print(", Event : " + event.getEvent_name());
        System.out.println(", Attendance: " + event.getAttendance());

    }
}
