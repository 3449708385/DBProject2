package com.mgp.dbproject.usermanager.beans;

public class RoleRelationMenu {
    private Long id;

    private Long relationroleid;

    private Long relationmenuid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRelationroleid() {
        return relationroleid;
    }

    public void setRelationroleid(Long relationroleid) {
        this.relationroleid = relationroleid;
    }

    public Long getRelationmenuid() {
        return relationmenuid;
    }

    public void setRelationmenuid(Long relationmenuid) {
        this.relationmenuid = relationmenuid;
    }
}