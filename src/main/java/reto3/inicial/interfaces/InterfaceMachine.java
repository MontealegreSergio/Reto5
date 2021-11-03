/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package reto3.inicial.interfaces;

import org.springframework.data.repository.CrudRepository;
import reto3.inicial.modelo.Machine;

/**
 *
 * @author Ideapad
 */
public interface InterfaceMachine extends CrudRepository<Machine, Integer>{
    
}
