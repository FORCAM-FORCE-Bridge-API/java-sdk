////////////////////////////////////////////////////////////////////////////////
//
// Created by MJesser on 12.12.2017.
//
// Copyright (c) 2006 - 2017 FORCAM GmbH. All rights reserved.
////////////////////////////////////////////////////////////////////////////////
package com.forcam.na.ffwebservices.client.api.operation.request;

import com.forcam.na.common.webserviceaccess.util.ToStringUtility;;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Contains an operation id.
 */
public class GetOperationScheduledDatesRequest {

    // ------------------------------------------------------------------------
    // members
    // ------------------------------------------------------------------------

    /** An operation id. */
    private String mOperationId;

    // ------------------------------------------------------------------------
    // constructors
    // ------------------------------------------------------------------------

    /**
     * Creates a new {@link GetOperationScheduledDatesRequest} object with an operation ID.
     *
     * @param operationId The operation ID.
     */
    public GetOperationScheduledDatesRequest(String operationId) {
        mOperationId = operationId;
    }

    // ------------------------------------------------------------------------
    // methods
    // ------------------------------------------------------------------------

    @Override
    public String toString() {
        return ToStringUtility.newToStringBuilder(this)
            .append("operationId", mOperationId)
            .toString();
    }

    // ------------------------------------------------------------------------
    // getters/setters
    // ------------------------------------------------------------------------

    public String getOperationId() {
        return mOperationId;
    }

    public void setOperationId(String operationId) {
        mOperationId = operationId;
    }
}