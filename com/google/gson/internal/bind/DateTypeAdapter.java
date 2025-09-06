package com.google.gson.internal.bind;

import a5.b;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

public final class DateTypeAdapter extends TypeAdapter {
    public static final TypeAdapterFactory FACTORY;
    public final ArrayList a;

    static {
        DateTypeAdapter.FACTORY = new TypeAdapterFactory() {
            @Override  // com.google.gson.TypeAdapterFactory
            public final TypeAdapter create(Gson gson0, TypeToken typeToken0) {
                return typeToken0.getRawType() == Date.class ? new DateTypeAdapter() : null;
            }
        };
    }

    public DateTypeAdapter() {
        ArrayList arrayList0 = new ArrayList();
        this.a = arrayList0;
        Locale locale0 = Locale.US;
        arrayList0.add(DateFormat.getDateTimeInstance(2, 2, locale0));
        if(!Locale.getDefault().equals(locale0)) {
            arrayList0.add(DateFormat.getDateTimeInstance(2, 2));
        }
    }

    @Override  // com.google.gson.TypeAdapter
    public Object read(JsonReader jsonReader0) throws IOException {
        return this.read(jsonReader0);
    }

    public Date read(JsonReader jsonReader0) throws IOException {
        if(jsonReader0.peek() == JsonToken.NULL) {
            jsonReader0.nextNull();
            return null;
        }
        String s = jsonReader0.nextString();
        synchronized(this.a) {
            Iterator iterator0 = this.a.iterator();
        label_8:
            if(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                DateFormat dateFormat0 = (DateFormat)object0;
                try {
                    return dateFormat0.parse(s);
                }
                catch(ParseException unused_ex) {
                    goto label_8;
                }
            }
        }
        try {
            return ISO8601Utils.parse(s, new ParsePosition(0));
        }
        catch(ParseException parseException0) {
            StringBuilder stringBuilder0 = b.v("Failed parsing \'", s, "\' as Date; at path ");
            stringBuilder0.append(jsonReader0.getPreviousPath());
            throw new JsonSyntaxException(stringBuilder0.toString(), parseException0);
        }
    }

    @Override  // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter0, Object object0) throws IOException {
        this.write(jsonWriter0, ((Date)object0));
    }

    public void write(JsonWriter jsonWriter0, Date date0) throws IOException {
        String s;
        if(date0 == null) {
            jsonWriter0.nullValue();
            return;
        }
        DateFormat dateFormat0 = (DateFormat)this.a.get(0);
        synchronized(this.a) {
            s = dateFormat0.format(date0);
        }
        jsonWriter0.value(s);
    }
}

