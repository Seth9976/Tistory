package com.google.gson.internal.sql;

import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType;
import java.sql.Date;
import java.sql.Timestamp;

public final class SqlTypesSupport {
    public static final DateType DATE_DATE_TYPE;
    public static final TypeAdapterFactory DATE_FACTORY;
    public static final boolean SUPPORTS_SQL_TYPES;
    public static final DateType TIMESTAMP_DATE_TYPE;
    public static final TypeAdapterFactory TIMESTAMP_FACTORY;
    public static final TypeAdapterFactory TIME_FACTORY;

    static {
        SqlTypesSupport.SUPPORTS_SQL_TYPES = true;
        SqlTypesSupport.DATE_DATE_TYPE = new a(Date.class);  // 初始化器: Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;-><init>(Ljava/lang/Class;)V
        SqlTypesSupport.TIMESTAMP_DATE_TYPE = new b(Timestamp.class);  // 初始化器: Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;-><init>(Ljava/lang/Class;)V
        SqlTypesSupport.DATE_FACTORY = SqlDateTypeAdapter.b;
        SqlTypesSupport.TIME_FACTORY = SqlTimeTypeAdapter.b;
        SqlTypesSupport.TIMESTAMP_FACTORY = SqlTimestampTypeAdapter.b;
    }
}

