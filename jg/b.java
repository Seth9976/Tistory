package jg;

import fg.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind.ENUM;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind.CLASS;
import kotlinx.serialization.descriptors.StructureKind.LIST;
import kotlinx.serialization.descriptors.StructureKind.MAP;
import kotlinx.serialization.descriptors.StructureKind.OBJECT;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.NamedValueEncoder;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.internal.AbstractJsonTreeEncoder.inlineUnquotedLiteralEncoder.1;
import kotlinx.serialization.json.internal.AbstractJsonTreeEncoder.inlineUnsignedNumberEncoder.1;
import kotlinx.serialization.json.internal.JsonExceptionsKt;
import kotlinx.serialization.json.internal.JsonNamesMapKt;
import kotlinx.serialization.json.internal.PolymorphicKt.WhenMappings;
import kotlinx.serialization.json.internal.PolymorphicKt;
import kotlinx.serialization.json.internal.StreamingJsonEncoderKt;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;
import kotlinx.serialization.json.internal.WriteModeKt;
import kotlinx.serialization.modules.SerializersModule;

public abstract class b extends NamedValueEncoder implements JsonEncoder {
    public final Json b;
    public final Function1 c;
    public final JsonConfiguration d;
    public String e;

    public b(Json json0, Function1 function10) {
        this.b = json0;
        this.c = function10;
        this.d = json0.getConfiguration();
    }

    public abstract JsonElement a();

    public abstract void b(String arg1, JsonElement arg2);

    @Override  // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public final CompositeEncoder beginStructure(SerialDescriptor serialDescriptor0) {
        CompositeEncoder compositeEncoder0;
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        Function1 function10 = this.getCurrentTagOrNull() == null ? this.c : new c(this, 14);
        SerialKind serialKind0 = serialDescriptor0.getKind();
        boolean z = Intrinsics.areEqual(serialKind0, LIST.INSTANCE) ? true : serialKind0 instanceof PolymorphicKind;
        Json json0 = this.b;
        if(z) {
            compositeEncoder0 = new e(json0, function10, 2);
        }
        else if(Intrinsics.areEqual(serialKind0, MAP.INSTANCE)) {
            SerialDescriptor serialDescriptor1 = WriteModeKt.carrierDescriptor(serialDescriptor0.getElementDescriptor(0), json0.getSerializersModule());
            SerialKind serialKind1 = serialDescriptor1.getKind();
            if(serialKind1 instanceof PrimitiveKind || Intrinsics.areEqual(serialKind1, ENUM.INSTANCE)) {
                Intrinsics.checkNotNullParameter(json0, "json");
                Intrinsics.checkNotNullParameter(function10, "nodeConsumer");
                compositeEncoder0 = new h(json0, function10, 1);  // 初始化器: Ljg/e;-><init>(Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;I)V
                compositeEncoder0.i = true;
            }
            else {
                if(!json0.getConfiguration().getAllowStructuredMapKeys()) {
                    throw JsonExceptionsKt.InvalidKeyKindException(serialDescriptor1);
                }
                compositeEncoder0 = new e(json0, function10, 2);
            }
        }
        else {
            compositeEncoder0 = new e(json0, function10, 1);
        }
        String s = this.e;
        if(s != null) {
            Intrinsics.checkNotNull(s);
            ((b)compositeEncoder0).b(s, JsonElementKt.JsonPrimitive(serialDescriptor0.getSerialName()));
            this.e = null;
        }
        return compositeEncoder0;
    }

    @Override  // kotlinx.serialization.internal.NamedValueEncoder
    public final String composeName(String s, String s1) {
        Intrinsics.checkNotNullParameter(s, "parentName");
        Intrinsics.checkNotNullParameter(s1, "childName");
        return s1;
    }

    @Override  // kotlinx.serialization.internal.NamedValueEncoder
    public String elementName(SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return JsonNamesMapKt.getJsonElementName(serialDescriptor0, this.b, v);
    }

    @Override  // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public final Encoder encodeInline(SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this.getCurrentTagOrNull() == null ? new e(this.b, this.c, 0).encodeInline(serialDescriptor0) : super.encodeInline(serialDescriptor0);
    }

    @Override  // kotlinx.serialization.json.JsonEncoder
    public final void encodeJsonElement(JsonElement jsonElement0) {
        Intrinsics.checkNotNullParameter(jsonElement0, "element");
        this.encodeSerializableValue(JsonElementSerializer.INSTANCE, jsonElement0);
    }

    @Override  // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeNotNullMark() {
    }

    @Override  // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeNull() {
        String s = (String)this.getCurrentTagOrNull();
        if(s == null) {
            this.c.invoke(JsonNull.INSTANCE);
            return;
        }
        Intrinsics.checkNotNullParameter(s, "tag");
        this.b(s, JsonNull.INSTANCE);
    }

    @Override  // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeSerializableValue(SerializationStrategy serializationStrategy0, Object object0) {
        String s;
        Intrinsics.checkNotNullParameter(serializationStrategy0, "serializer");
        if(this.getCurrentTagOrNull() == null) {
            SerialDescriptor serialDescriptor0 = serializationStrategy0.getDescriptor();
            Json json0 = this.b;
            if(TreeJsonEncoderKt.access$getRequiresTopLevelTag(WriteModeKt.carrierDescriptor(serialDescriptor0, json0.getSerializersModule()))) {
                new e(json0, this.c, 0).encodeSerializableValue(serializationStrategy0, object0);
                return;
            }
        }
        if(this.getJson().getConfiguration().getUseArrayPolymorphism()) {
            serializationStrategy0.serialize(this, object0);
            return;
        }
        if(!(serializationStrategy0 instanceof AbstractPolymorphicSerializer)) {
            switch(WhenMappings.$EnumSwitchMapping$0[this.getJson().getConfiguration().getClassDiscriminatorMode().ordinal()]) {
                case 1: 
                case 2: {
                    s = null;
                    break;
                }
                case 3: {
                    SerialKind serialKind0 = serializationStrategy0.getDescriptor().getKind();
                    s = !Intrinsics.areEqual(serialKind0, CLASS.INSTANCE) && !Intrinsics.areEqual(serialKind0, OBJECT.INSTANCE) ? null : PolymorphicKt.classDiscriminator(serializationStrategy0.getDescriptor(), this.getJson());
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        else if(this.getJson().getConfiguration().getClassDiscriminatorMode() != ClassDiscriminatorMode.NONE) {
            s = PolymorphicKt.classDiscriminator(serializationStrategy0.getDescriptor(), this.getJson());
        }
        else {
            s = null;
        }
        if(serializationStrategy0 instanceof AbstractPolymorphicSerializer) {
            if(object0 == null) {
                throw new IllegalArgumentException(("Value for serializer " + serializationStrategy0.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            SerializationStrategy serializationStrategy1 = PolymorphicSerializerKt.findPolymorphicSerializer(((AbstractPolymorphicSerializer)serializationStrategy0), this, object0);
            if(s != null) {
                PolymorphicKt.access$validateIfSealed(serializationStrategy0, serializationStrategy1, s);
            }
            PolymorphicKt.checkKind(serializationStrategy1.getDescriptor().getKind());
            Intrinsics.checkNotNull(serializationStrategy1, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
            serializationStrategy0 = serializationStrategy1;
        }
        if(s != null) {
            this.e = s;
        }
        serializationStrategy0.serialize(this, object0);
    }

    @Override  // kotlinx.serialization.internal.TaggedEncoder
    public final void encodeTaggedBoolean(Object object0, boolean z) {
        Intrinsics.checkNotNullParameter(((String)object0), "tag");
        this.b(((String)object0), JsonElementKt.JsonPrimitive(Boolean.valueOf(z)));
    }

    @Override  // kotlinx.serialization.internal.TaggedEncoder
    public final void encodeTaggedByte(Object object0, byte b) {
        Intrinsics.checkNotNullParameter(((String)object0), "tag");
        this.b(((String)object0), JsonElementKt.JsonPrimitive(b));
    }

    @Override  // kotlinx.serialization.internal.TaggedEncoder
    public final void encodeTaggedChar(Object object0, char c) {
        Intrinsics.checkNotNullParameter(((String)object0), "tag");
        this.b(((String)object0), JsonElementKt.JsonPrimitive(String.valueOf(c)));
    }

    @Override  // kotlinx.serialization.internal.TaggedEncoder
    public final void encodeTaggedDouble(Object object0, double f) {
        Intrinsics.checkNotNullParameter(((String)object0), "tag");
        this.b(((String)object0), JsonElementKt.JsonPrimitive(f));
        if(!this.d.getAllowSpecialFloatingPointValues() && (Double.isInfinite(f) || Double.isNaN(f))) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(f, ((String)object0), this.a().toString());
        }
    }

    @Override  // kotlinx.serialization.internal.TaggedEncoder
    public final void encodeTaggedEnum(Object object0, SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(((String)object0), "tag");
        Intrinsics.checkNotNullParameter(serialDescriptor0, "enumDescriptor");
        this.b(((String)object0), JsonElementKt.JsonPrimitive(serialDescriptor0.getElementName(v)));
    }

    @Override  // kotlinx.serialization.internal.TaggedEncoder
    public final void encodeTaggedFloat(Object object0, float f) {
        Intrinsics.checkNotNullParameter(((String)object0), "tag");
        this.b(((String)object0), JsonElementKt.JsonPrimitive(f));
        if(!this.d.getAllowSpecialFloatingPointValues() && (Float.isInfinite(f) || Float.isNaN(f))) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(f, ((String)object0), this.a().toString());
        }
    }

    @Override  // kotlinx.serialization.internal.TaggedEncoder
    public final Encoder encodeTaggedInline(Object object0, SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(((String)object0), "tag");
        Intrinsics.checkNotNullParameter(serialDescriptor0, "inlineDescriptor");
        if(StreamingJsonEncoderKt.isUnsignedNumber(serialDescriptor0)) {
            return new AbstractJsonTreeEncoder.inlineUnsignedNumberEncoder.1(this, ((String)object0));
        }
        return StreamingJsonEncoderKt.isUnquotedLiteral(serialDescriptor0) ? new AbstractJsonTreeEncoder.inlineUnquotedLiteralEncoder.1(this, ((String)object0), serialDescriptor0) : super.encodeTaggedInline(((String)object0), serialDescriptor0);
    }

    @Override  // kotlinx.serialization.internal.TaggedEncoder
    public final void encodeTaggedInt(Object object0, int v) {
        Intrinsics.checkNotNullParameter(((String)object0), "tag");
        this.b(((String)object0), JsonElementKt.JsonPrimitive(v));
    }

    @Override  // kotlinx.serialization.internal.TaggedEncoder
    public final void encodeTaggedLong(Object object0, long v) {
        Intrinsics.checkNotNullParameter(((String)object0), "tag");
        this.b(((String)object0), JsonElementKt.JsonPrimitive(v));
    }

    @Override  // kotlinx.serialization.internal.TaggedEncoder
    public final void encodeTaggedNull(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "tag");
        this.b(((String)object0), JsonNull.INSTANCE);
    }

    @Override  // kotlinx.serialization.internal.TaggedEncoder
    public final void encodeTaggedShort(Object object0, short v) {
        Intrinsics.checkNotNullParameter(((String)object0), "tag");
        this.b(((String)object0), JsonElementKt.JsonPrimitive(v));
    }

    @Override  // kotlinx.serialization.internal.TaggedEncoder
    public final void encodeTaggedString(Object object0, String s) {
        Intrinsics.checkNotNullParameter(((String)object0), "tag");
        Intrinsics.checkNotNullParameter(s, "value");
        this.b(((String)object0), JsonElementKt.JsonPrimitive(s));
    }

    @Override  // kotlinx.serialization.internal.TaggedEncoder
    public final void encodeTaggedValue(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((String)object0), "tag");
        Intrinsics.checkNotNullParameter(object1, "value");
        this.b(((String)object0), JsonElementKt.JsonPrimitive(object1.toString()));
    }

    @Override  // kotlinx.serialization.internal.TaggedEncoder
    public final void endEncode(SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        JsonElement jsonElement0 = this.a();
        this.c.invoke(jsonElement0);
    }

    @Override  // kotlinx.serialization.json.JsonEncoder
    public final Json getJson() {
        return this.b;
    }

    @Override  // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
    public final SerializersModule getSerializersModule() {
        return this.b.getSerializersModule();
    }

    @Override  // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public final boolean shouldEncodeElementDefault(SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this.d.getEncodeDefaults();
    }
}

