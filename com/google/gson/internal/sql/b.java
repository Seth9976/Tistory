package com.google.gson.internal.sql;

import com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType;
import java.sql.Timestamp;
import java.util.Date;

public final class b extends DateType {
    @Override  // com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType
    public final Date deserialize(Date date0) {
        return new Timestamp(date0.getTime());
    }
}

