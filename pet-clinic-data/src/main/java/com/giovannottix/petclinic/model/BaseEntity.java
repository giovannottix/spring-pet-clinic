package com.giovannottix.petclinic.model;

import java.io.Serializable;

/**
 *
 *
 * @author: Giovanni Esposito.
 * @Date  : 05/03/20, Sun
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
