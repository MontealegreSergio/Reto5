/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package reto3.inicial.interfaces;

import org.springframework.data.repository.CrudRepository;
import reto3.inicial.modelo.Reservacion;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Ideapad
 */
public interface InterfaceReservacion extends CrudRepository<Reservacion, Integer> {

    public List<Reservacion> findAllByStatus(String status);

    public List<Reservacion> findAllByStartDateAfterAndStartDateBefore(Date dateOne, Date dateTwo);

// SELECT clientid, COUNT(*) AS total FROM reservacion group by clientid order by desc;
    @Query("SELECT c.client, COUNT(c.client) from Reservacion AS c group by c.client order by COUNT(c.client)DESC")
    public List<Object[]> countTotalReservationByClient();

}
