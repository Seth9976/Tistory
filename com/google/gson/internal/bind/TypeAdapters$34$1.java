package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

class TypeAdapters.34.1 extends TypeAdapter {
    public final Class a;
    public final com.google.gson.internal.bind.TypeAdapters.34 b;

    public TypeAdapters.34.1(com.google.gson.internal.bind.TypeAdapters.34 typeAdapters$340, Class class0) {
        this.b = typeAdapters$340;
        this.a = class0;
        super();
    }

    @Override  // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader0) {
        Object object0 = this.b.b.read(jsonReader0);
        if(object0 != null) {
            Class class0 = this.a;
            if(!class0.isInstance(object0)) {
                throw new JsonSyntaxException("Expected a " + class0.getName() + " but was " + object0.getClass().getName() + "; at path " + jsonReader0.getPreviousPath());
            }
        }
        return object0;
    }

    @Override  // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter0, Object object0) {
        this.b.b.write(jsonWriter0, object0);
    }
}

