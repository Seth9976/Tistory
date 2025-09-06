package com.google.gson.internal.sql;

import com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType;
import java.util.Date;

public final class a extends DateType {
    @Override  // com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType
    public final Date deserialize(Date date0) {
        return new java.sql.Date(date0.getTime());
    }
}

