package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal..Gson.Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.util.Collection;

public final class CollectionTypeAdapterFactory implements TypeAdapterFactory {
    static final class Adapter extends TypeAdapter {
        public final TypeAdapter a;
        public final ObjectConstructor b;

        public Adapter(Gson gson0, Type type0, TypeAdapter typeAdapter0, ObjectConstructor objectConstructor0) {
            this.a = new TypeAdapterRuntimeTypeWrapper(gson0, typeAdapter0, type0);
            this.b = objectConstructor0;
        }

        @Override  // com.google.gson.TypeAdapter
        public final Object read(JsonReader jsonReader0) {
            if(jsonReader0.peek() == JsonToken.NULL) {
                jsonReader0.nextNull();
                return null;
            }
            Collection collection0 = (Collection)this.b.construct();
            jsonReader0.beginArray();
            while(jsonReader0.hasNext()) {
                collection0.add(((TypeAdapterRuntimeTypeWrapper)this.a).b.read(jsonReader0));
            }
            jsonReader0.endArray();
            return collection0;
        }

        @Override  // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter0, Object object0) {
            if(((Collection)object0) == null) {
                jsonWriter0.nullValue();
                return;
            }
            jsonWriter0.beginArray();
            for(Object object1: ((Collection)object0)) {
                this.a.write(jsonWriter0, object1);
            }
            jsonWriter0.endArray();
        }
    }

    public final ConstructorConstructor a;

    public CollectionTypeAdapterFactory(ConstructorConstructor constructorConstructor0) {
        this.a = constructorConstructor0;
    }

    @Override  // com.google.gson.TypeAdapterFactory
    public TypeAdapter create(Gson gson0, TypeToken typeToken0) {
        Type type0 = typeToken0.getType();
        Class class0 = typeToken0.getRawType();
        if(!Collection.class.isAssignableFrom(class0)) {
            return null;
        }
        Type type1 = .Gson.Types.getCollectionElementType(type0, class0);
        return new Adapter(gson0, type1, gson0.getAdapter(TypeToken.get(type1)), this.a.get(typeToken0));
    }
}

