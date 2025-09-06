package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.sql.Timestamp;
import java.util.Date;

class SqlTimestampTypeAdapter extends TypeAdapter {
    public final TypeAdapter a;
    public static final TypeAdapterFactory b;

    static {
        SqlTimestampTypeAdapter.b = new TypeAdapterFactory() {
            @Override  // com.google.gson.TypeAdapterFactory
            public final TypeAdapter create(Gson gson0, TypeToken typeToken0) {
                return typeToken0.getRawType() == Timestamp.class ? new SqlTimestampTypeAdapter(gson0.getAdapter(Date.class)) : null;
            }
        };
    }

    public SqlTimestampTypeAdapter(TypeAdapter typeAdapter0) {
        this.a = typeAdapter0;
    }

    @Override  // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader0) {
        Date date0 = (Date)this.a.read(jsonReader0);
        return date0 != null ? new Timestamp(date0.getTime()) : null;
    }

    @Override  // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter0, Object object0) {
        this.a.write(jsonWriter0, ((Timestamp)object0));
    }
}

