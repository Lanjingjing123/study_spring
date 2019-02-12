package com.ljj.spring.beans.collection;

import java.util.Properties;

public class DataSource {
    private Properties dataSource;

    public Properties getDataSource() {
        return dataSource;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "dataSource=" + dataSource +
                '}';
    }

    public void setDataSource(Properties dataSource) {
        this.dataSource = dataSource;
    }
}
