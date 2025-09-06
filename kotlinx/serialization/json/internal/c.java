package kotlinx.serialization.json.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import jg.a;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind.ENUM;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.internal.JsonInternalDependenciesKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNamingStrategy;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.JsonSchemaCacheKt;

public class c extends a {
    public final JsonObject e;
    public final String f;
    public final SerialDescriptor g;
    public int h;
    public boolean i;

    public c(Json json0, JsonObject jsonObject0, String s, SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(json0, "json");
        Intrinsics.checkNotNullParameter(jsonObject0, "value");
        super(json0);
        this.e = jsonObject0;
        this.f = s;
        this.g = serialDescriptor0;
    }

    @Override  // jg.a
    public JsonElement a(String s) {
        Intrinsics.checkNotNullParameter(s, "tag");
        return (JsonElement)x.getValue(this.f(), s);
    }

    @Override  // jg.a
    public final CompositeDecoder beginStructure(SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        SerialDescriptor serialDescriptor1 = this.g;
        if(serialDescriptor0 == serialDescriptor1) {
            JsonElement jsonElement0 = this.b();
            if(!(jsonElement0 instanceof JsonObject)) {
                throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class) + " as the serialized body of " + serialDescriptor1.getSerialName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElement0.getClass()));
            }
            return new c(this.c, ((JsonObject)jsonElement0), this.f, serialDescriptor1);
        }
        return super.beginStructure(serialDescriptor0);
    }

    @Override  // jg.a
    public JsonElement d() {
        return this.f();
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        while(this.h < serialDescriptor0.getElementsCount()) {
            int v = this.h;
            this.h = v + 1;
            String s = this.getTag(serialDescriptor0, v);
            boolean z = true;
            int v1 = this.h - 1;
            this.i = false;
            boolean z1 = this.f().containsKey(s);
            Json json0 = this.c;
            if(!z1) {
                if(json0.getConfiguration().getExplicitNulls() || serialDescriptor0.isElementOptional(v1) || !serialDescriptor0.getElementDescriptor(v1).isNullable()) {
                    z = false;
                }
                this.i = z;
                if(z) {
                    goto label_15;
                }
                continue;
            }
        label_15:
            if(this.d.getCoerceInputValues() && serialDescriptor0.isElementOptional(v1)) {
                SerialDescriptor serialDescriptor1 = serialDescriptor0.getElementDescriptor(v1);
                if(!serialDescriptor1.isNullable() && this.a(s) instanceof JsonNull) {
                    continue;
                }
                if(!Intrinsics.areEqual(serialDescriptor1.getKind(), ENUM.INSTANCE) || serialDescriptor1.isNullable() && this.a(s) instanceof JsonNull) {
                    return v1;
                }
                JsonElement jsonElement0 = this.a(s);
                String s1 = null;
                JsonPrimitive jsonPrimitive0 = jsonElement0 instanceof JsonPrimitive ? ((JsonPrimitive)jsonElement0) : null;
                if(jsonPrimitive0 != null) {
                    s1 = JsonElementKt.getContentOrNull(jsonPrimitive0);
                }
                if(s1 == null || JsonNamesMapKt.getJsonNameIndex(serialDescriptor1, json0, s1) != -3) {
                    return v1;
                }
                continue;
            }
            return v1;
        }
        return -1;
    }

    // 去混淆评级： 低(20)
    @Override  // jg.a
    public final boolean decodeNotNullMark() {
        return !this.i && super.decodeNotNullMark();
    }

    @Override  // kotlinx.serialization.internal.NamedValueDecoder
    public String elementName(SerialDescriptor serialDescriptor0, int v) {
        Object object0;
        String s1;
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        Json json0 = this.c;
        JsonNamingStrategy jsonNamingStrategy0 = JsonNamesMapKt.namingStrategy(serialDescriptor0, json0);
        String s = serialDescriptor0.getElementName(v);
        if(jsonNamingStrategy0 == null) {
            if(!this.d.getUseAlternativeNames()) {
                return s;
            }
            if(this.f().keySet().contains(s)) {
                return s;
            }
        }
        Map map0 = JsonNamesMapKt.deserializationNamesMap(json0, serialDescriptor0);
        Iterator iterator0 = this.f().keySet().iterator();
        do {
            s1 = null;
            if(!iterator0.hasNext()) {
                goto label_17;
            }
            object0 = iterator0.next();
            Integer integer0 = (Integer)map0.get(((String)object0));
        }
        while(integer0 == null || ((int)integer0) != v);
        goto label_18;
    label_17:
        object0 = null;
    label_18:
        if(((String)object0) != null) {
            return (String)object0;
        }
        if(jsonNamingStrategy0 != null) {
            s1 = jsonNamingStrategy0.serialNameForJson(serialDescriptor0, v, s);
        }
        return s1 == null ? s : s1;
    }

    @Override  // jg.a
    public void endStructure(SerialDescriptor serialDescriptor0) {
        Set set0;
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        JsonConfiguration jsonConfiguration0 = this.d;
        if(!jsonConfiguration0.getIgnoreUnknownKeys() && !(serialDescriptor0.getKind() instanceof PolymorphicKind)) {
            Json json0 = this.c;
            JsonNamingStrategy jsonNamingStrategy0 = JsonNamesMapKt.namingStrategy(serialDescriptor0, json0);
            if(jsonNamingStrategy0 == null && !jsonConfiguration0.getUseAlternativeNames()) {
                set0 = JsonInternalDependenciesKt.jsonCachedSerialNames(serialDescriptor0);
            }
            else if(jsonNamingStrategy0 == null) {
                Set set1 = JsonInternalDependenciesKt.jsonCachedSerialNames(serialDescriptor0);
                Map map0 = (Map)JsonSchemaCacheKt.getSchemaCache(json0).get(serialDescriptor0, JsonNamesMapKt.getJsonDeserializationNamesKey());
                Set set2 = map0 == null ? null : map0.keySet();
                if(set2 == null) {
                    set2 = f0.emptySet();
                }
                set0 = g0.plus(set1, set2);
            }
            else {
                set0 = JsonNamesMapKt.deserializationNamesMap(json0, serialDescriptor0).keySet();
            }
            for(Object object0: this.f().keySet()) {
                String s = (String)object0;
                if(!set0.contains(s) && !Intrinsics.areEqual(s, this.f)) {
                    throw JsonExceptionsKt.UnknownKeyException(s, this.f().toString());
                }
                if(false) {
                    break;
                }
            }
        }
    }

    public JsonObject f() {
        return this.e;
    }
}

