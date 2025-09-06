package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.reflect.TypeToken;

public final class JsonAdapterAnnotationTypeAdapterFactory implements TypeAdapterFactory {
    public final ConstructorConstructor a;

    public JsonAdapterAnnotationTypeAdapterFactory(ConstructorConstructor constructorConstructor0) {
        this.a = constructorConstructor0;
    }

    public static TypeAdapter a(ConstructorConstructor constructorConstructor0, Gson gson0, TypeToken typeToken0, JsonAdapter jsonAdapter0) {
        TypeAdapter typeAdapter0;
        Object object0 = constructorConstructor0.get(TypeToken.get(jsonAdapter0.value())).construct();
        boolean z = jsonAdapter0.nullSafe();
        if(object0 instanceof TypeAdapter) {
            typeAdapter0 = (TypeAdapter)object0;
            return typeAdapter0 == null || !z ? typeAdapter0 : typeAdapter0.nullSafe();
        }
        if(object0 instanceof TypeAdapterFactory) {
            typeAdapter0 = ((TypeAdapterFactory)object0).create(gson0, typeToken0);
            return typeAdapter0 == null || !z ? typeAdapter0 : typeAdapter0.nullSafe();
        }
        if(!(object0 instanceof JsonSerializer) && !(object0 instanceof JsonDeserializer)) {
            throw new IllegalArgumentException("Invalid attempt to bind an instance of " + object0.getClass().getName() + " as a @JsonAdapter for " + typeToken0.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
        }
        return new TreeTypeAdapter((object0 instanceof JsonSerializer ? ((JsonSerializer)object0) : null), (object0 instanceof JsonDeserializer ? ((JsonDeserializer)object0) : null), gson0, typeToken0, null, z);
    }

    @Override  // com.google.gson.TypeAdapterFactory
    public TypeAdapter create(Gson gson0, TypeToken typeToken0) {
        JsonAdapter jsonAdapter0 = (JsonAdapter)typeToken0.getRawType().getAnnotation(JsonAdapter.class);
        return jsonAdapter0 == null ? null : JsonAdapterAnnotationTypeAdapterFactory.a(this.a, gson0, typeToken0, jsonAdapter0);
    }
}

