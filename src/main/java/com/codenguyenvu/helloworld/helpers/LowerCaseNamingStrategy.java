package com.codenguyenvu.helloworld.helpers;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

public class LowerCaseNamingStrategy extends PhysicalNamingStrategyStandardImpl {

    @Override
    public Identifier toPhysicalColumnName(Identifier name, JdbcEnvironment context) {
        String newName = convertToLowerCase(name.getText());
        return Identifier.toIdentifier(newName);
    }

    private String convertToLowerCase(String name) {
        // Chuyển đổi tất cả thành chữ thường và xóa dấu gạch dưới nếu có
        return name.replaceAll("([a-z])([A-Z]+)", "$1$2").toLowerCase();
    }
}
