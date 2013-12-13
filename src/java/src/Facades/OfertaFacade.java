/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.Facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import src.Entities.Oferta;

/**
 *
 * @author diegoojedagarcia
 */
@Stateless
public class OfertaFacade extends AbstractFacade<Oferta> {
    @PersistenceContext(unitName = "ChequeTeatinosPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OfertaFacade() {
        super(Oferta.class);
    }
    
}
