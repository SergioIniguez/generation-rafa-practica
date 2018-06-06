package com.generation.db;

import org.hibernate.dialect.MySQLDialect;

public class CustomSQLDialect extends MySQLDialect {

    @Override
    public boolean dropConstraints() {
        return false;
    }
}
