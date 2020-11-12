////////////////////////////////////////////////////////////////////////////////
//
// Created by MJesser on 12.09.2018.
//
// Copyright (c) 2006 - 2018 FORCAM GmbH. All rights reserved.
////////////////////////////////////////////////////////////////////////////////
package com.forcam.na.ffwebservices.client.api.callback.listener;

import com.forcam.na.ffwebservices.model.event.Event;

/**
 * The abstract production order deleted internal listener.
 */
public abstract class AbstractProductionOrderDeletedInternalListener extends AbstractCallbackListener<Void> {

    // ------------------------------------------------------------------------
    // constructors
    // ------------------------------------------------------------------------

    /**
     * Instantiates a production order deleted internal listener.
     */
    public AbstractProductionOrderDeletedInternalListener() {
        super(Void.class, Event.INTERNAL__PRODUCTION_ORDER_DELETED);
    }
}