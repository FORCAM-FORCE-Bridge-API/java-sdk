////////////////////////////////////////////////////////////////////////////////
//
// Created by DAlbrecht on 01.02.2018.
//
// Copyright (c) 2006 - 2018 FORCAM GmbH. All rights reserved.
////////////////////////////////////////////////////////////////////////////////
package com.forcam.na.ffwebservices.model.event;

/**
 * The event types.
 */
public enum EventType {

    // ------------------------------------------------------------------------
    // enums
    // ------------------------------------------------------------------------

    COMMAND,

    SHOP_FLOOR_TERMINAL,

    INTERNAL,
    EXTERNAL,
    OPERATION_CREATED,
    OPERATION_UPDATED,
    OPERATION_DELETED,
    PRODUCTION_ORDER_CREATED,
    PRODUCTION_ORDER_DELETED,
    PRODUCTION_ORDER_UPDATED,
    WORKPLACE_CREATED,
    WORKPLACE_DELETED,
    WORKPLACE_UPDATED,
    STAFF_MEMBER_CREATED,
    STAFF_MEMBER_DELETED,
    STAFF_MEMBER_UPDATED,
    WORKPLACE_SHIFTS_UPDATED,
    SCHEDULED_MAINTENANCE_CREATED,
    SCHEDULED_MAINTENANCE_DELETED,
    SCHEDULED_MAINTENANCE_UPDATED,
    OPERATION_FORECAST_RESULT_CREATED,
    OPERATION_FORECAST_RESULT_UPDATED,
    OPERATION_FORECAST_RESULT_DELETED,
    OPERATION_PLANNING_RESULT_CREATED,
    OPERATION_PLANNING_RESULT_DELETED,
    OPERATION_PLANNING_RESULT_UPDATED,
    STAFF_MEMBER_PLANNING_RESULT_CREATED,
    STAFF_MEMBER_PLANNING_RESULT_DELETED,
    STAFF_MEMBER_PLANNING_RESULT_UPDATED,
    PREDICTED_MALFUNCTION_SCENARIO_CREATED,
    OBSOLETE_OPERATION_FORECAST_RESULTS,
    OBSOLETE_PREDICTED_MALFUNCTION_SCENARIOS,
    OPERATION_PLANNING_SCENARIO_CREATED,
    STAFF_MEMBER_PLANNING_SCENARIO_CREATED,
    OPERATION_PHASE_CHANGED,
    STAFF_MEMBER_LOGIN_STATE_CHANGED,
    WORKPLACE_SHIFT_CHANGED,
    OBSOLETE_OPERATION_PLANNING_SCENARIOS,
    MANUFACTURING_VARIANT_RULE_CREATED,
    MANUFACTURING_VARIANT_RULE_UPDATED,
    SETUP_TRANSITION_RULE_CREATED,
    SETUP_TRANSITION_RULE_UPDATED,
    SETUP_TRANSITION_MATRIX_UPDATED,
    DOCUMENT_CREATED,
    DOCUMENT_UPDATED,
    DOCUMENT_DELETED,
    RESOURCES_UPDATED,
    CUSTOMIZED_ACTION_TRIGGERED,
    TOOL_CREATED,
    TOOL_DELETED,
    TOOL_UPDATED,
    TOOL_ASSEMBLY_ORDER_STATE_CHANGED,
    TICKET_CREATED,
    TICKET_DELETED,
    TICKET_UPDATED,
    TICKET_STATE_CHANGED,
    TICKET_ATTACHMENT_CREATED,
    TICKET_ATTACHMENT_DELETED,
    TICKET_ATTACHMENT_UPDATED,
    TICKET_ACTIVITY_CREATED,
    TICKET_ACTIVITY_DELETED,
    TICKET_ACTIVITY_UPDATED,
    TICKET_ACTIVITY_STATE_CHANGED,
    TICKET_ACTIVITY_ATTACHMENT_CREATED,
    TICKET_ACTIVITY_ATTACHMENT_DELETED,
    TICKET_ACTIVITY_ATTACHMENT_UPDATED,
    TICKET_ACTIVITY_REMARK_CREATED,
    TICKET_ACTIVITY_REMARK_DELETED,
    TICKET_ACTIVITY_REMARK_UPDATED,
    WORKPLACE_OPERATING_STATE_CHANGED,

    /** Process data rule violated. */
    PROCESS_DATA_RULE_VIOLATED,

    /** Feedback to warehouse. */
    FEEDBACK_TO_WAREHOUSE,

    /** Capability index violated. */
    CAPABILITY_INDEX_VIOLATED,

    /** Specification limit violated. */
    SPECIFICATION_LIMIT_VIOLATED,

    /** Statistical violated. */
    STATISTICAL_VIOLATED;

}