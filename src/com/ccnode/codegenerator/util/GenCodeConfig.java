package com.ccnode.codegenerator.util;

import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * What always stop you is what you always believe.
 * <p/>
 * Created by zhengjun.du on 2016/04/16 23:28
 */
public class GenCodeConfig {
    String projectPath = "";
    String serviceDir = "";
    String mapperDir = "";
    String sqlDir = "";
    String daoDir = "";
    String pojoName;
    String tableName = "";
    Map<String, String> configMap = Maps.newHashMap();

    public GenCodeConfig() {
    }

    public String getTableName() {
        return this.tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Map<String, String> getConfigMap() {
        return this.configMap;
    }

    public void setConfigMap(Map<String, String> configMap) {
        this.configMap = configMap;
    }

    public String getPojoName() {
        return this.pojoName;
    }

    public void setPojoName(String pojoName) {
        this.pojoName = pojoName;
    }

    public String getProjectPath() {
        return this.projectPath;
    }

    public void setProjectPath(String projectPath) {
        this.projectPath = projectPath;
    }

    public String getServiceDir() {
        return this.serviceDir;
    }

    public void setServiceDir(String serviceDir) {
        this.serviceDir = serviceDir;
    }

    public String getMapperDir() {
        return this.mapperDir;
    }

    public void setMapperDir(String mapperDir) {
        this.mapperDir = mapperDir;
    }

    public String getSqlDir() {
        return this.sqlDir;
    }

    public void setSqlDir(String sqlDir) {
        this.sqlDir = sqlDir;
    }

    public String getDaoDir() {
        return this.daoDir;
    }

    public void setDaoDir(String daoDir) {
        this.daoDir = daoDir;
    }
}
