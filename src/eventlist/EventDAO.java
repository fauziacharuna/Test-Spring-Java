/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventlist;
import java.util.List;
import javax.sql.DataSource;


/**
 *
 * @author fauziachmadharuna
 */
public interface EventDAO {
    public void setDataSource(DataSource ds);
    public void create(String event_name,int attendance);
    public Event getEvent(Integer id);
    public List<Event>listEvent();
    public void delete(Integer id);
    
    
    
}
