package com.google.gson.internal.bind;

import a5.b;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;

public final class DefaultDateTypeAdapter extends TypeAdapter {
    public static abstract class DateType {
        public static final DateType DATE;
        public final Class a;

        static {
            DateType.DATE = new a(Date.class);  // 初始化器: Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;-><init>(Ljava/lang/Class;)V
        }

        public DateType(Class class0) {
            this.a = class0;
        }

        public final TypeAdapterFactory createAdapterFactory(int v) {
            DefaultDateTypeAdapter defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(this, v);
            return TypeAdapters.newFactory(this.a, defaultDateTypeAdapter0);
        }

        public final TypeAdapterFactory createAdapterFactory(int v, int v1) {
            DefaultDateTypeAdapter defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(this, v, v1);
            return TypeAdapters.newFactory(this.a, defaultDateTypeAdapter0);
        }

        public final TypeAdapterFactory createAdapterFactory(String s) {
            DefaultDateTypeAdapter defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(this, s);
            return TypeAdapters.newFactory(this.a, defaultDateTypeAdapter0);
        }

        public final TypeAdapterFactory createDefaultsAdapterFactory() {
            DefaultDateTypeAdapter defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(this, 2, 2);
            return TypeAdapters.newFactory(this.a, defaultDateTypeAdapter0);
        }

        public abstract Date deserialize(Date arg1);
    }

    public final DateType a;
    public final ArrayList b;

    public DefaultDateTypeAdapter(DateType defaultDateTypeAdapter$DateType0, int v) {
        ArrayList arrayList0 = new ArrayList();
        this.b = arrayList0;
        Objects.requireNonNull(defaultDateTypeAdapter$DateType0);
        this.a = defaultDateTypeAdapter$DateType0;
        Locale locale0 = Locale.US;
        arrayList0.add(DateFormat.getDateInstance(v, locale0));
        if(!Locale.getDefault().equals(locale0)) {
            arrayList0.add(DateFormat.getDateInstance(v));
        }
    }

    public DefaultDateTypeAdapter(DateType defaultDateTypeAdapter$DateType0, int v, int v1) {
        ArrayList arrayList0 = new ArrayList();
        this.b = arrayList0;
        Objects.requireNonNull(defaultDateTypeAdapter$DateType0);
        this.a = defaultDateTypeAdapter$DateType0;
        Locale locale0 = Locale.US;
        arrayList0.add(DateFormat.getDateTimeInstance(v, v1, locale0));
        if(!Locale.getDefault().equals(locale0)) {
            arrayList0.add(DateFormat.getDateTimeInstance(v, v1));
        }
    }

    public DefaultDateTypeAdapter(DateType defaultDateTypeAdapter$DateType0, String s) {
        ArrayList arrayList0 = new ArrayList();
        this.b = arrayList0;
        Objects.requireNonNull(defaultDateTypeAdapter$DateType0);
        this.a = defaultDateTypeAdapter$DateType0;
        Locale locale0 = Locale.US;
        arrayList0.add(new SimpleDateFormat(s, locale0));
        if(!Locale.getDefault().equals(locale0)) {
            arrayList0.add(new SimpleDateFormat(s));
        }
    }

    @Override  // com.google.gson.TypeAdapter
    public Object read(JsonReader jsonReader0) throws IOException {
        return this.read(jsonReader0);
    }

    public Date read(JsonReader jsonReader0) throws IOException {
        Date date0;
        if(jsonReader0.peek() == JsonToken.NULL) {
            jsonReader0.nextNull();
            return null;
        }
        String s = jsonReader0.nextString();
        synchronized(this.b) {
            Iterator iterator0 = this.b.iterator();
        label_8:
            if(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                DateFormat dateFormat0 = (DateFormat)object0;
                try {
                    date0 = dateFormat0.parse(s);
                }
                catch(ParseException unused_ex) {
                    goto label_8;
                }
                return this.a.deserialize(date0);
            }
        }
        try {
            date0 = ISO8601Utils.parse(s, new ParsePosition(0));
            return this.a.deserialize(date0);
        }
        catch(ParseException parseException0) {
            StringBuilder stringBuilder0 = b.v("Failed parsing \'", s, "\' as Date; at path ");
            stringBuilder0.append(jsonReader0.getPreviousPath());
            throw new JsonSyntaxException(stringBuilder0.toString(), parseException0);
        }
    }

    @Override
    public String toString() {
        DateFormat dateFormat0 = (DateFormat)this.b.get(0);
        return dateFormat0 instanceof SimpleDateFormat ? "DefaultDateTypeAdapter(" + ((SimpleDateFormat)dateFormat0).toPattern() + ')' : "DefaultDateTypeAdapter(" + dateFormat0.getClass().getSimpleName() + ')';
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
        DateFormat dateFormat0 = (DateFormat)this.b.get(0);
        synchronized(this.b) {
            s = dateFormat0.format(date0);
        }
        jsonWriter0.value(s);
    }
}

