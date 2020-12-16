/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dagangan;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Arif Budiman Ar
 */
@Stateless
public class DaganganFacade extends AbstractFacade<Dagangan> {

    @PersistenceContext(unitName = "WarungPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DaganganFacade() {
        super(Dagangan.class);
    }
    
}
