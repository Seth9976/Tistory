package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.ToNumberStrategy;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

class ObjectTypeAdapter.1 implements TypeAdapterFactory {
    public final ToNumberStrategy a;

    public ObjectTypeAdapter.1(ToNumberStrategy toNumberStrategy0) {
        this.a = toNumberStrategy0;
    }

    @Override  // com.google.gson.TypeAdapterFactory
    public final TypeAdapter create(Gson gson0, TypeToken typeToken0) {
        return typeToken0.getRawType() == Object.class ? new ObjectTypeAdapter(gson0, this.a) : null;
    }
}

