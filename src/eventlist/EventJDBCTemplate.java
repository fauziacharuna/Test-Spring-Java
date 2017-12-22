/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventlist;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author fauziachmadharuna
 */
public class EventJDBCTemplate {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public void create(String event_name, Integer attendance) {
        String SQL = "insert into Event (event_name,attendance) values (?, ?)";
        jdbcTemplateObject.update(SQL, event_name,attendance);
        System.out.println("Created Record event = " + event_name + ", Attendance = " + attendance);
        return;
    }

    public Event getEvent(Integer id) {
        String SQL = "select * from Event where id = ?";
        Event event = jdbcTemplateObject.queryForObject(SQL, new Object[]{id}, new EventMapper());
        return event;
    }

    public List<Event> listEvents() {
        String SQL = "select * from Event";
        List<Event> event = jdbcTemplateObject.query(SQL,
                new EventMapper());
        return event;
    }

    public void delete(Integer id) {
        String SQL = "delete from Event where id = ?";
        jdbcTemplateObject.update(SQL, id);
        System.out.println("Deleted Record with ID = " + id);
        return;
    }

    public void update(Integer id, Integer attendance) {
        String SQL = "update Event set attendance = ? where id = ?";
        jdbcTemplateObject.update(SQL, attendance,id);
        System.out.println("Updated Record with ID = " + id);
        return;
    }

}
