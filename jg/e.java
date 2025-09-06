package jg;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

public class e extends b {
    public final int f;
    public Object g;

    public e(Json json0, Function1 function10, int v) {
        this.f = v;
        switch(v) {
            case 1: {
                Intrinsics.checkNotNullParameter(json0, "json");
                Intrinsics.checkNotNullParameter(function10, "nodeConsumer");
                super(json0, function10);
                this.g = new LinkedHashMap();
                return;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(json0, "json");
                Intrinsics.checkNotNullParameter(function10, "nodeConsumer");
                super(json0, function10);
                this.g = new ArrayList();
                return;
            }
            default: {
                Intrinsics.checkNotNullParameter(json0, "json");
                Intrinsics.checkNotNullParameter(function10, "nodeConsumer");
                super(json0, function10);
                this.pushTag("primitive");
            }
        }
    }

    @Override  // jg.b
    public JsonElement a() {
        switch(this.f) {
            case 0: {
                JsonElement jsonElement0 = (JsonElement)this.g;
                if(jsonElement0 == null) {
                    throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
                }
                return jsonElement0;
            }
            case 1: {
                return new JsonObject(((LinkedHashMap)this.g));
            }
            default: {
                return new JsonArray(((ArrayList)this.g));
            }
        }
    }

    @Override  // jg.b
    public void b(String s, JsonElement jsonElement0) {
        switch(this.f) {
            case 0: {
                Intrinsics.checkNotNullParameter(s, "key");
                Intrinsics.checkNotNullParameter(jsonElement0, "element");
                if(s != "primitive") {
                    throw new IllegalArgumentException("This output can only consume primitives with \'primitive\' tag");
                }
                if(((JsonElement)this.g) != null) {
                    throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
                }
                this.g = jsonElement0;
                this.c.invoke(jsonElement0);
                return;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(s, "key");
                Intrinsics.checkNotNullParameter(jsonElement0, "element");
                ((LinkedHashMap)this.g).put(s, jsonElement0);
                return;
            }
            default: {
                Intrinsics.checkNotNullParameter(s, "key");
                Intrinsics.checkNotNullParameter(jsonElement0, "element");
                int v = Integer.parseInt(s);
                ((ArrayList)this.g).add(v, jsonElement0);
            }
        }
    }

    @Override  // jg.b
    public String elementName(SerialDescriptor serialDescriptor0, int v) {
        if(this.f != 2) {
            return super.elementName(serialDescriptor0, v);
        }
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return String.valueOf(v);
    }

    @Override  // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public void encodeNullableSerializableElement(SerialDescriptor serialDescriptor0, int v, SerializationStrategy serializationStrategy0, Object object0) {
        if(this.f != 1) {
            super.encodeNullableSerializableElement(serialDescriptor0, v, serializationStrategy0, object0);
            return;
        }
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(serializationStrategy0, "serializer");
        if(object0 != null || this.d.getExplicitNulls()) {
            super.encodeNullableSerializableElement(serialDescriptor0, v, serializationStrategy0, object0);
        }
    }
}

