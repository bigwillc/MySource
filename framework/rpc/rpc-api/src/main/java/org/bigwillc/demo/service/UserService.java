package org.bigwillc.demo.service;

import org.bigwillc.demo.model.User;

/**
 * @author bigwillc
 **/
public interface UserService {

    /**
     * find by id.
     *
     * @param id
     * @return
     */
    User findById(Integer id);
}
