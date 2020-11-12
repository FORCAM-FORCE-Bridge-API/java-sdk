////////////////////////////////////////////////////////////////////////////////
//
// Created by DAlbrecht on 09.12.2019.
//
// Copyright (c) 2006 - 2019 FORCAM GmbH. All rights reserved.
////////////////////////////////////////////////////////////////////////////////

package com.forcam.na.ffwebservices.model.reporting;

import io.swagger.annotations.ApiModel;

/**
 * Entry of the quality details material report.
 */
@ApiModel("qualityDetailsMaterial")
public class QualityDetailsMaterialEntry {

    // ------------------------------------------------------------------------
    // members
    // ------------------------------------------------------------------------

    private String mMaterialId;

    private Double mQuantity;

    private String mQualityTypeId;

    private String mQualityDetailId;

    // ------------------------------------------------------------------------
    // getters/setters
    // ------------------------------------------------------------------------

    public String getMaterialId() {
        return mMaterialId;
    }

    public void setMaterialId(String materialId) {
        mMaterialId = materialId;
    }

    public Double getQuantity() {
        return mQuantity;
    }

    public void setQuantity(Double quantity) {
        mQuantity = quantity;
    }

    public String getQualityTypeId() {
        return mQualityTypeId;
    }

    public void setQualityTypeId(String qualityTypeId) {
        mQualityTypeId = qualityTypeId;
    }

    public String getQualityDetailId() {
        return mQualityDetailId;
    }

    public void setQualityDetailId(String qualityDetailId) {
        mQualityDetailId = qualityDetailId;
    }
}
