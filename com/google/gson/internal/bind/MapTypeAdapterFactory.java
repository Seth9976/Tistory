package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal..Gson.Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Map;

public final class MapTypeAdapterFactory implements TypeAdapterFactory {
    final class Adapter extends TypeAdapter {
        public final TypeAdapter a;
        public final TypeAdapter b;
        public final ObjectConstructor c;
        public final MapTypeAdapterFactory d;

        public Adapter(Gson gson0, Type type0, TypeAdapter typeAdapter0, Type type1, TypeAdapter typeAdapter1, ObjectConstructor objectConstructor0) {
            this.a = new TypeAdapterRuntimeTypeWrapper(gson0, typeAdapter0, type0);
            this.b = new TypeAdapterRuntimeTypeWrapper(gson0, typeAdapter1, type1);
            this.c = objectConstructor0;
        }

        @Override  // com.google.gson.TypeAdapter
        public final Object read(JsonReader jsonReader0) {
            JsonToken jsonToken0 = jsonReader0.peek();
            if(jsonToken0 == JsonToken.NULL) {
                jsonReader0.nextNull();
                return null;
            }
            Map map0 = (Map)this.c.construct();
            TypeAdapter typeAdapter0 = this.b;
            TypeAdapter typeAdapter1 = this.a;
            if(jsonToken0 == JsonToken.BEGIN_ARRAY) {
                jsonReader0.beginArray();
                while(jsonReader0.hasNext()) {
                    jsonReader0.beginArray();
                    Object object0 = ((TypeAdapterRuntimeTypeWrapper)typeAdapter1).b.read(jsonReader0);
                    if(map0.put(object0, ((TypeAdapterRuntimeTypeWrapper)typeAdapter0).b.read(jsonReader0)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + object0);
                    }
                    jsonReader0.endArray();
                }
                jsonReader0.endArray();
                return map0;
            }
            jsonReader0.beginObject();
            while(jsonReader0.hasNext()) {
                JsonReaderInternalAccess.INSTANCE.promoteNameToValue(jsonReader0);
                Object object1 = ((TypeAdapterRuntimeTypeWrapper)typeAdapter1).b.read(jsonReader0);
                if(map0.put(object1, ((TypeAdapterRuntimeTypeWrapper)typeAdapter0).b.read(jsonReader0)) != null) {
                    throw new JsonSyntaxException("duplicate key: " + object1);
                }
                if(false) {
                    break;
                }
            }
            jsonReader0.endObject();
            return map0;
        }

        @Override  // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter0, Object object0) {
            if(((Map)object0) == null) {
                jsonWriter0.nullValue();
                return;
            }
            TypeAdapter typeAdapter0 = this.b;
            if(!MapTypeAdapterFactory.this.b) {
                jsonWriter0.beginObject();
                for(Object object1: ((Map)object0).entrySet()) {
                    jsonWriter0.name(String.valueOf(((Map.Entry)object1).getKey()));
                    typeAdapter0.write(jsonWriter0, ((Map.Entry)object1).getValue());
                }
                jsonWriter0.endObject();
                return;
            }
            ArrayList arrayList0 = new ArrayList(((Map)object0).size());
            ArrayList arrayList1 = new ArrayList(((Map)object0).size());
            for(Object object2: ((Map)object0).entrySet()) {
                Object object3 = ((Map.Entry)object2).getKey();
                arrayList0.add(this.a.toJsonTree(object3));
                arrayList1.add(((Map.Entry)object2).getValue());
            }
            jsonWriter0.beginObject();
            if(0 < arrayList0.size()) {
                JsonElement jsonElement0 = (JsonElement)arrayList0.get(0);
                throw new AssertionError();
            }
            jsonWriter0.endObject();
        }
    }

    public final ConstructorConstructor a;
    public final boolean b;

    public MapTypeAdapterFactory(ConstructorConstructor constructorConstructor0, boolean z) {
        this.a = constructorConstructor0;
        this.b = z;
    }

    @Override  // com.google.gson.TypeAdapterFactory
    public TypeAdapter create(Gson gson0, TypeToken typeToken0) {
        Type type0 = typeToken0.getType();
        Class class0 = typeToken0.getRawType();
        if(!Map.class.isAssignableFrom(class0)) {
            return null;
        }
        Type[] arr_type = .Gson.Types.getMapKeyAndValueTypes(type0, class0);
        Type type1 = arr_type[0];
        TypeAdapter typeAdapter0 = type1 == Boolean.TYPE || type1 == Boolean.class ? TypeAdapters.BOOLEAN_AS_STRING : gson0.getAdapter(TypeToken.get(type1));
        TypeAdapter typeAdapter1 = gson0.getAdapter(TypeToken.get(arr_type[1]));
        ObjectConstructor objectConstructor0 = this.a.get(typeToken0);
        return new Adapter(this, gson0, arr_type[0], typeAdapter0, arr_type[1], typeAdapter1, objectConstructor0);
    }
}

