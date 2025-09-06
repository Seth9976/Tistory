package jg;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind.ENUM;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind.LIST;
import kotlinx.serialization.descriptors.StructureKind.MAP;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.NamedValueDecoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.JsonDecoderForUnsignedTypes;
import kotlinx.serialization.json.internal.JsonExceptionsKt;
import kotlinx.serialization.json.internal.JsonNamesMapKt;
import kotlinx.serialization.json.internal.PolymorphicKt;
import kotlinx.serialization.json.internal.StreamingJsonEncoderKt;
import kotlinx.serialization.json.internal.StringJsonLexer;
import kotlinx.serialization.json.internal.WriteModeKt;
import kotlinx.serialization.json.internal.c;
import kotlinx.serialization.modules.SerializersModule;

public abstract class a extends NamedValueDecoder implements JsonDecoder {
    public final Json c;
    public final JsonConfiguration d;

    public a(Json json0) {
        this.c = json0;
        this.d = json0.getConfiguration();
    }

    public abstract JsonElement a(String arg1);

    public final JsonElement b() {
        String s = (String)this.getCurrentTagOrNull();
        if(s != null) {
            JsonElement jsonElement0 = this.a(s);
            return jsonElement0 == null ? this.d() : jsonElement0;
        }
        return this.d();
    }

    @Override  // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public CompositeDecoder beginStructure(SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        JsonElement jsonElement0 = this.b();
        SerialKind serialKind0 = serialDescriptor0.getKind();
        boolean z = Intrinsics.areEqual(serialKind0, LIST.INSTANCE) ? true : serialKind0 instanceof PolymorphicKind;
        Json json0 = this.c;
        Class class0 = JsonArray.class;
        if(z) {
            if(!(jsonElement0 instanceof JsonArray)) {
                throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(class0) + " as the serialized body of " + serialDescriptor0.getSerialName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElement0.getClass()));
            }
            return new f(json0, ((JsonArray)jsonElement0));
        }
        boolean z1 = Intrinsics.areEqual(serialKind0, MAP.INSTANCE);
        Class class1 = JsonObject.class;
        if(z1) {
            SerialDescriptor serialDescriptor1 = WriteModeKt.carrierDescriptor(serialDescriptor0.getElementDescriptor(0), json0.getSerializersModule());
            SerialKind serialKind1 = serialDescriptor1.getKind();
            if(!(serialKind1 instanceof PrimitiveKind) && !Intrinsics.areEqual(serialKind1, ENUM.INSTANCE)) {
                if(!json0.getConfiguration().getAllowStructuredMapKeys()) {
                    throw JsonExceptionsKt.InvalidKeyKindException(serialDescriptor1);
                }
                if(!(jsonElement0 instanceof JsonArray)) {
                    throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(class0) + " as the serialized body of " + serialDescriptor0.getSerialName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElement0.getClass()));
                }
                return new f(json0, ((JsonArray)jsonElement0));
            }
            if(!(jsonElement0 instanceof JsonObject)) {
                throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(class1) + " as the serialized body of " + serialDescriptor0.getSerialName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElement0.getClass()));
            }
            return new g(json0, ((JsonObject)jsonElement0));
        }
        if(!(jsonElement0 instanceof JsonObject)) {
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(class1) + " as the serialized body of " + serialDescriptor0.getSerialName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElement0.getClass()));
        }
        return new c(json0, ((JsonObject)jsonElement0), null, null);
    }

    public final JsonPrimitive c(String s) {
        Intrinsics.checkNotNullParameter(s, "tag");
        JsonElement jsonElement0 = this.a(s);
        JsonPrimitive jsonPrimitive0 = jsonElement0 instanceof JsonPrimitive ? ((JsonPrimitive)jsonElement0) : null;
        if(jsonPrimitive0 == null) {
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected JsonPrimitive at " + s + ", found " + jsonElement0, this.b().toString());
        }
        return jsonPrimitive0;
    }

    @Override  // kotlinx.serialization.internal.NamedValueDecoder
    public final String composeName(String s, String s1) {
        Intrinsics.checkNotNullParameter(s, "parentName");
        Intrinsics.checkNotNullParameter(s1, "childName");
        return s1;
    }

    public abstract JsonElement d();

    @Override  // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public final Decoder decodeInline(SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        if(this.getCurrentTagOrNull() != null) {
            return super.decodeInline(serialDescriptor0);
        }
        JsonElement jsonElement0 = this.d();
        return new d(this.c, jsonElement0).decodeInline(serialDescriptor0);
    }

    @Override  // kotlinx.serialization.json.JsonDecoder
    public final JsonElement decodeJsonElement() {
        return this.b();
    }

    @Override  // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return !(this.b() instanceof JsonNull);
    }

    @Override  // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public final Object decodeSerializableValue(DeserializationStrategy deserializationStrategy0) {
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
        return PolymorphicKt.decodeSerializableValuePolymorphic(this, deserializationStrategy0);
    }

    @Override  // kotlinx.serialization.internal.TaggedDecoder
    public final boolean decodeTaggedBoolean(Object object0) {
        Boolean boolean0;
        Intrinsics.checkNotNullParameter(((String)object0), "tag");
        JsonPrimitive jsonPrimitive0 = this.c(((String)object0));
        try {
            boolean0 = JsonElementKt.getBooleanOrNull(jsonPrimitive0);
            if(boolean0 == null) {
                this.e("boolean");
                throw null;
            }
        }
        catch(IllegalArgumentException unused_ex) {
            this.e("boolean");
            throw null;
        }
        return boolean0.booleanValue();
    }

    @Override  // kotlinx.serialization.internal.TaggedDecoder
    public final byte decodeTaggedByte(Object object0) {
        Byte byte0;
        Intrinsics.checkNotNullParameter(((String)object0), "tag");
        JsonPrimitive jsonPrimitive0 = this.c(((String)object0));
        try {
            int v = JsonElementKt.getInt(jsonPrimitive0);
            byte0 = 0xFFFFFF80 > v || v > 0x7F ? null : ((byte)v);
            if(byte0 == null) {
                this.e("byte");
                throw null;
            }
        }
        catch(IllegalArgumentException unused_ex) {
            this.e("byte");
            throw null;
        }
        return byte0.byteValue();
    }

    @Override  // kotlinx.serialization.internal.TaggedDecoder
    public final char decodeTaggedChar(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "tag");
        JsonPrimitive jsonPrimitive0 = this.c(((String)object0));
        try {
            return StringsKt___StringsKt.single(jsonPrimitive0.getContent());
        }
        catch(IllegalArgumentException unused_ex) {
            this.e("char");
            throw null;
        }
    }

    @Override  // kotlinx.serialization.internal.TaggedDecoder
    public final double decodeTaggedDouble(Object object0) {
        double f;
        Intrinsics.checkNotNullParameter(((String)object0), "tag");
        JsonPrimitive jsonPrimitive0 = this.c(((String)object0));
        try {
            f = JsonElementKt.getDouble(jsonPrimitive0);
        }
        catch(IllegalArgumentException unused_ex) {
            this.e("double");
            throw null;
        }
        if(!this.c.getConfiguration().getAllowSpecialFloatingPointValues() && (Double.isInfinite(f) || Double.isNaN(f))) {
            throw JsonExceptionsKt.InvalidFloatingPointDecoded(f, ((String)object0), this.b().toString());
        }
        return f;
    }

    @Override  // kotlinx.serialization.internal.TaggedDecoder
    public final int decodeTaggedEnum(Object object0, SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(((String)object0), "tag");
        Intrinsics.checkNotNullParameter(serialDescriptor0, "enumDescriptor");
        String s = this.c(((String)object0)).getContent();
        return JsonNamesMapKt.getJsonNameIndexOrThrow$default(serialDescriptor0, this.c, s, null, 4, null);
    }

    @Override  // kotlinx.serialization.internal.TaggedDecoder
    public final float decodeTaggedFloat(Object object0) {
        float f;
        Intrinsics.checkNotNullParameter(((String)object0), "tag");
        JsonPrimitive jsonPrimitive0 = this.c(((String)object0));
        try {
            f = JsonElementKt.getFloat(jsonPrimitive0);
        }
        catch(IllegalArgumentException unused_ex) {
            this.e("float");
            throw null;
        }
        if(!this.c.getConfiguration().getAllowSpecialFloatingPointValues() && (Float.isInfinite(f) || Float.isNaN(f))) {
            throw JsonExceptionsKt.InvalidFloatingPointDecoded(f, ((String)object0), this.b().toString());
        }
        return f;
    }

    @Override  // kotlinx.serialization.internal.TaggedDecoder
    public final Decoder decodeTaggedInline(Object object0, SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(((String)object0), "tag");
        Intrinsics.checkNotNullParameter(serialDescriptor0, "inlineDescriptor");
        return StreamingJsonEncoderKt.isUnsignedNumber(serialDescriptor0) ? new JsonDecoderForUnsignedTypes(new StringJsonLexer(this.c(((String)object0)).getContent()), this.c) : super.decodeTaggedInline(((String)object0), serialDescriptor0);
    }

    @Override  // kotlinx.serialization.internal.TaggedDecoder
    public final int decodeTaggedInt(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "tag");
        JsonPrimitive jsonPrimitive0 = this.c(((String)object0));
        try {
            return JsonElementKt.getInt(jsonPrimitive0);
        }
        catch(IllegalArgumentException unused_ex) {
            this.e("int");
            throw null;
        }
    }

    @Override  // kotlinx.serialization.internal.TaggedDecoder
    public final long decodeTaggedLong(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "tag");
        JsonPrimitive jsonPrimitive0 = this.c(((String)object0));
        try {
            return JsonElementKt.getLong(jsonPrimitive0);
        }
        catch(IllegalArgumentException unused_ex) {
            this.e("long");
            throw null;
        }
    }

    @Override  // kotlinx.serialization.internal.TaggedDecoder
    public final boolean decodeTaggedNotNullMark(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "tag");
        return this.a(((String)object0)) != JsonNull.INSTANCE;
    }

    @Override  // kotlinx.serialization.internal.TaggedDecoder
    public final Void decodeTaggedNull(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "tag");
        return null;
    }

    @Override  // kotlinx.serialization.internal.TaggedDecoder
    public final short decodeTaggedShort(Object object0) {
        Short short0;
        Intrinsics.checkNotNullParameter(((String)object0), "tag");
        JsonPrimitive jsonPrimitive0 = this.c(((String)object0));
        try {
            int v = JsonElementKt.getInt(jsonPrimitive0);
            short0 = 0xFFFF8000 > v || v > 0x7FFF ? null : ((short)v);
            if(short0 == null) {
                this.e("short");
                throw null;
            }
        }
        catch(IllegalArgumentException unused_ex) {
            this.e("short");
            throw null;
        }
        return short0.shortValue();
    }

    @Override  // kotlinx.serialization.internal.TaggedDecoder
    public final String decodeTaggedString(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "tag");
        JsonPrimitive jsonPrimitive0 = this.c(((String)object0));
        if(!this.c.getConfiguration().isLenient()) {
            JsonLiteral jsonLiteral0 = jsonPrimitive0 instanceof JsonLiteral ? ((JsonLiteral)jsonPrimitive0) : null;
            if(jsonLiteral0 == null) {
                throw JsonExceptionsKt.JsonDecodingException(-1, "Unexpected \'null\' literal when non-nullable string was expected");
            }
            if(!jsonLiteral0.isString()) {
                throw JsonExceptionsKt.JsonDecodingException(-1, wb.a.d("String literal for key \'", ((String)object0), "\' should be quoted.\nUse \'isLenient = true\' in \'Json {}\' builder to accept non-compliant JSON."), this.b().toString());
            }
        }
        if(jsonPrimitive0 instanceof JsonNull) {
            throw JsonExceptionsKt.JsonDecodingException(-1, "Unexpected \'null\' value instead of string literal", this.b().toString());
        }
        return jsonPrimitive0.getContent();
    }

    public final void e(String s) {
        throw JsonExceptionsKt.JsonDecodingException(-1, "Failed to parse literal as \'" + s + "\' value", this.b().toString());
    }

    @Override  // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
    }

    @Override  // kotlinx.serialization.json.JsonDecoder
    public final Json getJson() {
        return this.c;
    }

    @Override  // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public final SerializersModule getSerializersModule() {
        return this.c.getSerializersModule();
    }
}

