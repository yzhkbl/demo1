package com.backstage.Dao.Entity;

import lombok.Data;

@Data
public class Group{
    private Integer Id;
    private String groupName;
    private String parentUuid;
    private String leafFlag;
    private boolean isLeaf;

}
