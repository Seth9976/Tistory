package com.google.gson.internal.bind;

import androidx.appcompat.view.menu.f;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal..Gson.Preconditions;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public final class TreeTypeAdapter extends SerializationDelegatingTypeAdapter {
    static final class SingleTypeFactory implements TypeAdapterFactory {
        public final TypeToken a;
        public final boolean b;
        public final Class c;
        public final JsonSerializer d;
        public final JsonDeserializer e;

        public SingleTypeFactory(Object object0, TypeToken typeToken0, boolean z, Class class0) {
            JsonDeserializer jsonDeserializer0 = null;
            JsonSerializer jsonSerializer0 = object0 instanceof JsonSerializer ? ((JsonSerializer)object0) : null;
            this.d = jsonSerializer0;
            if(object0 instanceof JsonDeserializer) {
                jsonDeserializer0 = (JsonDeserializer)object0;
            }
            this.e = jsonDeserializer0;
            .Gson.Preconditions.checkArgument(jsonSerializer0 != null || jsonDeserializer0 != null);
            this.a = typeToken0;
            this.b = z;
            this.c = class0;
        }

        @Override  // com.google.gson.TypeAdapterFactory
        public final TypeAdapter create(Gson gson0, TypeToken typeToken0) {
            boolean z;
            TypeToken typeToken1 = this.a;
            if(typeToken1 == null) {
                z = this.c.isAssignableFrom(typeToken0.getRawType());
            }
            else if(!typeToken1.equals(typeToken0) && (!this.b || typeToken1.getType() != typeToken0.getRawType())) {
                z = false;
            }
            else {
                z = true;
            }
            return z ? new TreeTypeAdapter(this.d, this.e, gson0, typeToken0, this) : null;
        }
    }

    public final JsonSerializer a;
    public final JsonDeserializer b;
    public final Gson c;
    public final TypeToken d;
    public final TypeAdapterFactory e;
    public final f f;
    public final boolean g;
    public volatile TypeAdapter h;

    public TreeTypeAdapter(JsonSerializer jsonSerializer0, JsonDeserializer jsonDeserializer0, Gson gson0, TypeToken typeToken0, TypeAdapterFactory typeAdapterFactory0) {
        this(jsonSerializer0, jsonDeserializer0, gson0, typeToken0, typeAdapterFactory0, true);
    }

    public TreeTypeAdapter(JsonSerializer jsonSerializer0, JsonDeserializer jsonDeserializer0, Gson gson0, TypeToken typeToken0, TypeAdapterFactory typeAdapterFactory0, boolean z) {
        this.f = new f(this, 19);
        this.a = jsonSerializer0;
        this.b = jsonDeserializer0;
        this.c = gson0;
        this.d = typeToken0;
        this.e = typeAdapterFactory0;
        this.g = z;
    }

    public final TypeAdapter a() {
        TypeAdapter typeAdapter0 = this.h;
        if(typeAdapter0 == null) {
            typeAdapter0 = this.c.getDelegateAdapter(this.e, this.d);
            this.h = typeAdapter0;
        }
        return typeAdapter0;
    }

    @Override  // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public TypeAdapter getSerializationDelegate() {
        return this.a != null ? this : this.a();
    }

    public static TypeAdapterFactory newFactory(TypeToken typeToken0, Object object0) {
        return new SingleTypeFactory(object0, typeToken0, false, null);
    }

    public static TypeAdapterFactory newFactoryWithMatchRawType(TypeToken typeToken0, Object object0) {
        return typeToken0.getType() == typeToken0.getRawType() ? new SingleTypeFactory(object0, typeToken0, true, null) : new SingleTypeFactory(object0, typeToken0, false, null);
    }

    public static TypeAdapterFactory newTypeHierarchyFactory(Class class0, Object object0) {
        return new SingleTypeFactory(object0, null, false, class0);
    }

    // 去混淆评级： 中等(50)
    @Override  // com.google.gson.TypeAdapter
    public Object read(JsonReader jsonReader0) throws IOException {
        return this.b == null ? this.a().read(jsonReader0) : this.b.deserialize(Streams.parse(jsonReader0), this.d.getType(), this.f);
    }

    @Override  // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter0, Object object0) throws IOException {
        JsonSerializer jsonSerializer0 = this.a;
        if(jsonSerializer0 == null) {
            this.a().write(jsonWriter0, object0);
            return;
        }
        if(this.g && object0 == null) {
            jsonWriter0.nullValue();
            return;
        }
        Streams.write(jsonSerializer0.serialize(object0, this.d.getType(), this.f), jsonWriter0);
    }
}

