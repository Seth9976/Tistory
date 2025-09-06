package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class TypeAdapterRuntimeTypeWrapper extends TypeAdapter {
    public final Gson a;
    public final TypeAdapter b;
    public final Type c;

    public TypeAdapterRuntimeTypeWrapper(Gson gson0, TypeAdapter typeAdapter0, Type type0) {
        this.a = gson0;
        this.b = typeAdapter0;
        this.c = type0;
    }

    @Override  // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader0) {
        return this.b.read(jsonReader0);
    }

    @Override  // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter0, Object object0) {
        Type type0 = this.c;
        Type type1 = object0 == null || !(type0 instanceof Class) && !(type0 instanceof TypeVariable) ? type0 : object0.getClass();
        TypeAdapter typeAdapter0 = this.b;
        if(type1 != type0) {
            TypeToken typeToken0 = TypeToken.get(type1);
            TypeAdapter typeAdapter1 = this.a.getAdapter(typeToken0);
            if(typeAdapter1 instanceof Adapter) {
                TypeAdapter typeAdapter2;
                for(typeAdapter2 = typeAdapter0; typeAdapter2 instanceof SerializationDelegatingTypeAdapter; typeAdapter2 = typeAdapter3) {
                    TypeAdapter typeAdapter3 = ((SerializationDelegatingTypeAdapter)typeAdapter2).getSerializationDelegate();
                    if(typeAdapter3 == typeAdapter2) {
                        break;
                    }
                }
                if(typeAdapter2 instanceof Adapter) {
                    typeAdapter0 = typeAdapter1;
                }
            }
            else {
                typeAdapter0 = typeAdapter1;
            }
        }
        typeAdapter0.write(jsonWriter0, object0);
    }
}

