package com.gsccs.eb.api.domain.goods;

import com.gsccs.eb.api.domain.base.Domain;

public class PropsVal extends Domain{

	private Long id;

    private Long prodId;

    private String vals;

    private Long ordernum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public String getVals() {
        return vals;
    }

    public void setVals(String vals) {
        this.vals = vals == null ? null : vals.trim();
    }

    public Long getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Long ordernum) {
        this.ordernum = ordernum;
    }
}