/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventlist;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author fauziachmadharuna
 */
public class EventMapper implements RowMapper<Event> {

    public Event mapRow(ResultSet rs, int rowNum) throws SQLException {
       Event event = new Event();
        event.setId(rs.getInt("id"));
        event.setEvent_name(rs.getString("event_name"));
        event.setAttendance(rs.getInt("attendance"));
        return event;
    }

}
