package org.bigwillc.demo.service;

import org.bigwillc.demo.model.Order;

/**
 * @author bigwillc
 **/
public interface OrderService {

    /**
     * find by id.
     *
     * @param id
     * @return order
     */
    Order findById(Integer id);


    /**
     * test exception situation.
     *
     * @return exception
     */
    Order findError();
}
