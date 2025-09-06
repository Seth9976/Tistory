package com.google.gson.internal.sql;

import a5.b;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

final class SqlTimeTypeAdapter extends TypeAdapter {
    public final SimpleDateFormat a;
    public static final TypeAdapterFactory b;

    static {
        SqlTimeTypeAdapter.b = new TypeAdapterFactory() {
            @Override  // com.google.gson.TypeAdapterFactory
            public final TypeAdapter create(Gson gson0, TypeToken typeToken0) {
                return typeToken0.getRawType() == Time.class ? new SqlTimeTypeAdapter(0) : null;
            }
        };
    }

    private SqlTimeTypeAdapter() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }

    public SqlTimeTypeAdapter(int v) {
    }

    @Override  // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader0) {
        if(jsonReader0.peek() == JsonToken.NULL) {
            jsonReader0.nextNull();
            return null;
        }
        String s = jsonReader0.nextString();
        try {
            return new Time(this.a.parse(s).getTime());
        }
        catch(Throwable throwable0) {
            try {
                throw throwable0;
            }
            catch(ParseException parseException0) {
                StringBuilder stringBuilder0 = b.v("Failed parsing \'", s, "\' as SQL Time; at path ");
                stringBuilder0.append(jsonReader0.getPreviousPath());
                throw new JsonSyntaxException(stringBuilder0.toString(), parseException0);
            }
        }
    }

    @Override  // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter0, Object object0) {
        String s;
        if(((Time)object0) == null) {
            jsonWriter0.nullValue();
            return;
        }
        synchronized(this) {
            s = this.a.format(((Time)object0));
        }
        jsonWriter0.value(s);
    }
}

