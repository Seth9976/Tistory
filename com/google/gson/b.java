package com.google.gson;

import java.lang.reflect.Field;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class b extends FieldNamingPolicy {
    public b() {
        super("UPPER_CAMEL_CASE", 1);
    }

    @Override  // com.google.gson.FieldNamingStrategy
    public final String translateName(Field field0) {
        return FieldNamingPolicy.b(field0.getName());
    }
}

