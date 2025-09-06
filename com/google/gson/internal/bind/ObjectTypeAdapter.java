package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.ToNumberPolicy;
import com.google.gson.ToNumberStrategy;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class ObjectTypeAdapter extends TypeAdapter {
    public final Gson a;
    public final ToNumberStrategy b;
    public static final TypeAdapterFactory c;

    static {
        ObjectTypeAdapter.c = new ObjectTypeAdapter.1(ToNumberPolicy.DOUBLE);
    }

    public ObjectTypeAdapter(Gson gson0, ToNumberStrategy toNumberStrategy0) {
        this.a = gson0;
        this.b = toNumberStrategy0;
    }

    public final Serializable a(JsonReader jsonReader0, JsonToken jsonToken0) {
        switch(f.a[jsonToken0.ordinal()]) {
            case 3: {
                return jsonReader0.nextString();
            }
            case 4: {
                return this.b.readNumber(jsonReader0);
            }
            case 5: {
                return Boolean.valueOf(jsonReader0.nextBoolean());
            }
            case 6: {
                jsonReader0.nextNull();
                return null;
            }
            default: {
                throw new IllegalStateException("Unexpected token: " + jsonToken0);
            }
        }
    }

    public static Serializable b(JsonReader jsonReader0, JsonToken jsonToken0) {
        switch(f.a[jsonToken0.ordinal()]) {
            case 1: {
                jsonReader0.beginArray();
                return new ArrayList();
            }
            case 2: {
                jsonReader0.beginObject();
                return new LinkedTreeMap();
            }
            default: {
                return null;
            }
        }
    }

    public static TypeAdapterFactory getFactory(ToNumberStrategy toNumberStrategy0) {
        return toNumberStrategy0 == ToNumberPolicy.DOUBLE ? ObjectTypeAdapter.c : new ObjectTypeAdapter.1(toNumberStrategy0);
    }

    @Override  // com.google.gson.TypeAdapter
    public Object read(JsonReader jsonReader0) throws IOException {
        JsonToken jsonToken0 = jsonReader0.peek();
        Serializable serializable0 = ObjectTypeAdapter.b(jsonReader0, jsonToken0);
        if(serializable0 == null) {
            return this.a(jsonReader0, jsonToken0);
        }
        ArrayDeque arrayDeque0 = new ArrayDeque();
        while(true) {
            if(jsonReader0.hasNext()) {
                String s = serializable0 instanceof Map ? jsonReader0.nextName() : null;
                JsonToken jsonToken1 = jsonReader0.peek();
                Serializable serializable1 = ObjectTypeAdapter.b(jsonReader0, jsonToken1);
                boolean z = serializable1 != null;
                if(serializable1 == null) {
                    serializable1 = this.a(jsonReader0, jsonToken1);
                }
                if(serializable0 instanceof List) {
                    ((List)serializable0).add(serializable1);
                }
                else {
                    ((Map)serializable0).put(s, serializable1);
                }
                if(!z) {
                    continue;
                }
                arrayDeque0.addLast(serializable0);
                serializable0 = serializable1;
            }
            else {
                if(serializable0 instanceof List) {
                    jsonReader0.endArray();
                }
                else {
                    jsonReader0.endObject();
                }
                if(arrayDeque0.isEmpty()) {
                    break;
                }
                serializable0 = arrayDeque0.removeLast();
            }
        }
        return serializable0;
    }

    @Override  // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter0, Object object0) throws IOException {
        if(object0 == null) {
            jsonWriter0.nullValue();
            return;
        }
        Class class0 = object0.getClass();
        TypeAdapter typeAdapter0 = this.a.getAdapter(class0);
        if(typeAdapter0 instanceof ObjectTypeAdapter) {
            jsonWriter0.beginObject();
            jsonWriter0.endObject();
            return;
        }
        typeAdapter0.write(jsonWriter0, object0);
    }
}

