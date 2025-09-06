package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

class NumberTypeAdapter.1 implements TypeAdapterFactory {
    public final NumberTypeAdapter a;

    public NumberTypeAdapter.1(NumberTypeAdapter numberTypeAdapter0) {
        this.a = numberTypeAdapter0;
    }

    @Override  // com.google.gson.TypeAdapterFactory
    public final TypeAdapter create(Gson gson0, TypeToken typeToken0) {
        return typeToken0.getRawType() == Number.class ? this.a : null;
    }
}

