package samples.ignite.cachestore;

import org.h2.jdbcx.*;

import javax.cache.configuration.*;
import javax.sql.*;

public class H2DataSourceFactory implements Factory<DataSource> {
    private String url;

    private String user;

    private String password;

    @Override public DataSource create() {
        JdbcDataSource dataSrc = new JdbcDataSource();

        dataSrc.setUrl(getUrl());
        dataSrc.setUser(getUser());
        dataSrc.setPassword(getPassword());

        return dataSrc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
