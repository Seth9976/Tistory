package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.ToNumberPolicy;
import com.google.gson.ToNumberStrategy;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public final class NumberTypeAdapter extends TypeAdapter {
    public final ToNumberStrategy a;
    public static final TypeAdapterFactory b;

    static {
        NumberTypeAdapter.b = new NumberTypeAdapter.1(new NumberTypeAdapter(ToNumberPolicy.LAZILY_PARSED_NUMBER));
    }

    public NumberTypeAdapter(ToNumberStrategy toNumberStrategy0) {
        this.a = toNumberStrategy0;
    }

    public static TypeAdapterFactory getFactory(ToNumberStrategy toNumberStrategy0) {
        return toNumberStrategy0 == ToNumberPolicy.LAZILY_PARSED_NUMBER ? NumberTypeAdapter.b : new NumberTypeAdapter.1(new NumberTypeAdapter(toNumberStrategy0));
    }

    public Number read(JsonReader jsonReader0) throws IOException {
        JsonToken jsonToken0 = jsonReader0.peek();
        switch(e.a[jsonToken0.ordinal()]) {
            case 1: {
                jsonReader0.nextNull();
                return null;
            }
            case 2: 
            case 3: {
                return this.a.readNumber(jsonReader0);
            }
            default: {
                throw new JsonSyntaxException("Expecting number, got: " + jsonToken0 + "; at path " + jsonReader0.getPath());
            }
        }
    }

    @Override  // com.google.gson.TypeAdapter
    public Object read(JsonReader jsonReader0) throws IOException {
        return this.read(jsonReader0);
    }

    public void write(JsonWriter jsonWriter0, Number number0) throws IOException {
        jsonWriter0.value(number0);
    }

    @Override  // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter0, Object object0) throws IOException {
        this.write(jsonWriter0, ((Number)object0));
    }
}

