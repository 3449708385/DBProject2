package com.mgp.dbproject.usermanager.beans;

public class UserRelationRole {
    private Long id;

    private Long relationuserid;

    private Long relationroleid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRelationuserid() {
        return relationuserid;
    }

    public void setRelationuserid(Long relationuserid) {
        this.relationuserid = relationuserid;
    }

    public Long getRelationroleid() {
        return relationroleid;
    }

    public void setRelationroleid(Long relationroleid) {
        this.relationroleid = relationroleid;
    }
}