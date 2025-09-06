package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind.CLASS;
import kotlinx.serialization.descriptors.StructureKind.OBJECT;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u00B0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0010\u0010\n\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t\u00A2\u0006\u0004\b\u000B\u0010\fB1\b\u0010\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u000E\u0010\n\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t\u00A2\u0006\u0004\b\u000B\u0010\u000FJ\u0017\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0011\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u001F\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0018\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b\u001A\u0010\u001BJ+\u0010 \u001A\u00020\u0012\"\u0004\b\u0000\u0010\u001C2\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00000\u001D2\u0006\u0010\u001F\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b \u0010!J\u0017\u0010#\u001A\u00020\"2\u0006\u0010\u0016\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\b#\u0010$J\u0017\u0010%\u001A\u00020\u00122\u0006\u0010\u0016\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\b%\u0010&J\u001F\u0010\'\u001A\u00020\u00192\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0018\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b\'\u0010\u001BJA\u0010)\u001A\u00020\u0012\"\b\b\u0000\u0010\u001C*\u00020(2\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0018\u001A\u00020\u00172\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00000\u001D2\b\u0010\u001F\u001A\u0004\u0018\u00018\u0000H\u0016\u00A2\u0006\u0004\b)\u0010*J\u0017\u0010,\u001A\u00020+2\u0006\u0010\u0016\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\b,\u0010-J\u000F\u0010.\u001A\u00020\u0012H\u0016\u00A2\u0006\u0004\b.\u0010/J\u0017\u00100\u001A\u00020\u00122\u0006\u0010\u001F\u001A\u00020\u0019H\u0016\u00A2\u0006\u0004\b0\u00101J\u0017\u00103\u001A\u00020\u00122\u0006\u0010\u001F\u001A\u000202H\u0016\u00A2\u0006\u0004\b3\u00104J\u0017\u00106\u001A\u00020\u00122\u0006\u0010\u001F\u001A\u000205H\u0016\u00A2\u0006\u0004\b6\u00107J\u0017\u00108\u001A\u00020\u00122\u0006\u0010\u001F\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b8\u00109J\u0017\u0010;\u001A\u00020\u00122\u0006\u0010\u001F\u001A\u00020:H\u0016\u00A2\u0006\u0004\b;\u0010<J\u0017\u0010>\u001A\u00020\u00122\u0006\u0010\u001F\u001A\u00020=H\u0016\u00A2\u0006\u0004\b>\u0010?J\u0017\u0010A\u001A\u00020\u00122\u0006\u0010\u001F\u001A\u00020@H\u0016\u00A2\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001A\u00020\u00122\u0006\u0010\u001F\u001A\u00020CH\u0016\u00A2\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001A\u00020\u00122\u0006\u0010\u001F\u001A\u00020FH\u0016\u00A2\u0006\u0004\bG\u0010HJ\u001F\u0010J\u001A\u00020\u00122\u0006\u0010I\u001A\u00020\u00152\u0006\u0010\u0018\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\bJ\u0010KR\u001A\u0010\u0006\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bL\u0010M\u001A\u0004\bN\u0010OR\u001A\u0010U\u001A\u00020P8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bQ\u0010R\u001A\u0004\bS\u0010T\u00A8\u0006V"}, d2 = {"Lkotlinx/serialization/json/internal/StreamingJsonEncoder;", "Lkotlinx/serialization/json/JsonEncoder;", "Lkotlinx/serialization/encoding/AbstractEncoder;", "Lkotlinx/serialization/json/internal/Composer;", "composer", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/internal/WriteMode;", "mode", "", "modeReuseCache", "<init>", "(Lkotlinx/serialization/json/internal/Composer;Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/WriteMode;[Lkotlinx/serialization/json/JsonEncoder;)V", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "output", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/WriteMode;[Lkotlinx/serialization/json/JsonEncoder;)V", "Lkotlinx/serialization/json/JsonElement;", "element", "", "encodeJsonElement", "(Lkotlinx/serialization/json/JsonElement;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "shouldEncodeElementDefault", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "T", "Lkotlinx/serialization/SerializationStrategy;", "serializer", "value", "encodeSerializableValue", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/CompositeEncoder;", "beginStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeEncoder;", "endStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "encodeElement", "", "encodeNullableSerializableElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Encoder;", "encodeInline", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "encodeNull", "()V", "encodeBoolean", "(Z)V", "", "encodeByte", "(B)V", "", "encodeShort", "(S)V", "encodeInt", "(I)V", "", "encodeLong", "(J)V", "", "encodeFloat", "(F)V", "", "encodeDouble", "(D)V", "", "encodeChar", "(C)V", "", "encodeString", "(Ljava/lang/String;)V", "enumDescriptor", "encodeEnum", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "b", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/modules/SerializersModule;", "e", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStreamingJsonEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonEncoder.kt\nkotlinx/serialization/json/internal/StreamingJsonEncoder\n+ 2 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,224:1\n170#1,2:251\n170#1,2:253\n21#2,12:225\n35#2,13:238\n1#3:237\n*S KotlinDebug\n*F\n+ 1 StreamingJsonEncoder.kt\nkotlinx/serialization/json/internal/StreamingJsonEncoder\n*L\n161#1:251,2\n162#1:253,2\n64#1:225,12\n64#1:238,13\n64#1:237\n*E\n"})
public final class StreamingJsonEncoder extends AbstractEncoder implements JsonEncoder {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[WriteMode.values().length];
            try {
                arr_v[WriteMode.LIST.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[WriteMode.MAP.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[WriteMode.POLY_OBJ.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public final Composer a;
    public final Json b;
    public final WriteMode c;
    public final JsonEncoder[] d;
    public final SerializersModule e;
    public final JsonConfiguration f;
    public boolean g;
    public String h;

    public StreamingJsonEncoder(@NotNull Composer composer0, @NotNull Json json0, @NotNull WriteMode writeMode0, @Nullable JsonEncoder[] arr_jsonEncoder) {
        Intrinsics.checkNotNullParameter(composer0, "composer");
        Intrinsics.checkNotNullParameter(json0, "json");
        Intrinsics.checkNotNullParameter(writeMode0, "mode");
        super();
        this.a = composer0;
        this.b = json0;
        this.c = writeMode0;
        this.d = arr_jsonEncoder;
        this.e = this.getJson().getSerializersModule();
        this.f = this.getJson().getConfiguration();
        int v = writeMode0.ordinal();
        if(arr_jsonEncoder != null && (arr_jsonEncoder[v] != null || null != this)) {
            arr_jsonEncoder[v] = this;
        }
    }

    public StreamingJsonEncoder(@NotNull InternalJsonWriter internalJsonWriter0, @NotNull Json json0, @NotNull WriteMode writeMode0, @NotNull JsonEncoder[] arr_jsonEncoder) {
        Intrinsics.checkNotNullParameter(internalJsonWriter0, "output");
        Intrinsics.checkNotNullParameter(json0, "json");
        Intrinsics.checkNotNullParameter(writeMode0, "mode");
        Intrinsics.checkNotNullParameter(arr_jsonEncoder, "modeReuseCache");
        this(ComposersKt.Composer(internalJsonWriter0, json0), json0, writeMode0, arr_jsonEncoder);
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    @NotNull
    public CompositeEncoder beginStructure(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        WriteMode writeMode0 = WriteModeKt.switchMode(this.getJson(), serialDescriptor0);
        int v = writeMode0.begin;
        Composer composer0 = this.a;
        if(v != 0) {
            composer0.print(((char)v));
            composer0.indent();
        }
        if(this.h != null) {
            composer0.nextItem();
            String s = this.h;
            Intrinsics.checkNotNull(s);
            this.encodeString(s);
            composer0.print(':');
            composer0.space();
            this.encodeString(serialDescriptor0.getSerialName());
            this.h = null;
        }
        if(this.c == writeMode0) {
            return this;
        }
        JsonEncoder[] arr_jsonEncoder = this.d;
        if(arr_jsonEncoder != null) {
            CompositeEncoder compositeEncoder0 = arr_jsonEncoder[writeMode0.ordinal()];
            if(compositeEncoder0 != null) {
                return compositeEncoder0;
            }
        }
        return new StreamingJsonEncoder(composer0, this.getJson(), writeMode0, arr_jsonEncoder);
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeBoolean(boolean z) {
        if(this.g) {
            this.encodeString(String.valueOf(z));
            return;
        }
        this.a.print(z);
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeByte(byte b) {
        if(this.g) {
            this.encodeString(String.valueOf(b));
            return;
        }
        this.a.print(b);
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeChar(char c) {
        this.encodeString(String.valueOf(c));
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeDouble(double f) {
        Composer composer0 = this.a;
        if(this.g) {
            this.encodeString(String.valueOf(f));
        }
        else {
            composer0.print(f);
        }
        if(!this.f.getAllowSpecialFloatingPointValues() && (Double.isInfinite(f) || Double.isNaN(f))) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(f, composer0.writer.toString());
        }
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder
    public boolean encodeElement(@NotNull SerialDescriptor serialDescriptor0, int v) {
        boolean z = false;
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        int v1 = WhenMappings.$EnumSwitchMapping$0[this.c.ordinal()];
        Composer composer0 = this.a;
        if(v1 == 1) {
            if(!composer0.getWritingFirst()) {
                composer0.print(',');
            }
            composer0.nextItem();
        }
        else {
            switch(v1) {
                case 2: {
                    if(!composer0.getWritingFirst()) {
                        if(v % 2 == 0) {
                            composer0.print(',');
                            composer0.nextItem();
                            z = true;
                        }
                        else {
                            composer0.print(':');
                            composer0.space();
                        }
                        this.g = z;
                        return true;
                    }
                    this.g = true;
                    composer0.nextItem();
                    return true;
                }
                case 3: {
                    if(v == 0) {
                        this.g = true;
                    }
                    break;
                }
                default: {
                    if(!composer0.getWritingFirst()) {
                        composer0.print(',');
                    }
                    composer0.nextItem();
                    this.encodeString(JsonNamesMapKt.getJsonElementName(serialDescriptor0, this.getJson(), v));
                    composer0.print(':');
                    composer0.space();
                    return true;
                }
            }
            if(v == 1) {
                composer0.print(',');
                composer0.space();
                this.g = false;
                return true;
            }
        }
        return true;
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeEnum(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "enumDescriptor");
        this.encodeString(serialDescriptor0.getElementName(v));
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeFloat(float f) {
        Composer composer0 = this.a;
        if(this.g) {
            this.encodeString(String.valueOf(f));
        }
        else {
            composer0.print(f);
        }
        if(!this.f.getAllowSpecialFloatingPointValues() && (Float.isInfinite(f) || Float.isNaN(f))) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(f, composer0.writer.toString());
        }
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    @NotNull
    public Encoder encodeInline(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        boolean z = StreamingJsonEncoderKt.isUnsignedNumber(serialDescriptor0);
        WriteMode writeMode0 = this.c;
        Composer composer0 = this.a;
        if(z) {
            if(!(composer0 instanceof ComposerForUnsignedNumbers)) {
                composer0 = new ComposerForUnsignedNumbers(composer0.writer, this.g);
            }
            return new StreamingJsonEncoder(composer0, this.getJson(), writeMode0, null);
        }
        if(StreamingJsonEncoderKt.isUnquotedLiteral(serialDescriptor0)) {
            if(!(composer0 instanceof ComposerForUnquotedLiterals)) {
                composer0 = new ComposerForUnquotedLiterals(composer0.writer, this.g);
            }
            return new StreamingJsonEncoder(composer0, this.getJson(), writeMode0, null);
        }
        return super.encodeInline(serialDescriptor0);
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeInt(int v) {
        if(this.g) {
            this.encodeString(String.valueOf(v));
            return;
        }
        this.a.print(v);
    }

    @Override  // kotlinx.serialization.json.JsonEncoder
    public void encodeJsonElement(@NotNull JsonElement jsonElement0) {
        Intrinsics.checkNotNullParameter(jsonElement0, "element");
        this.encodeSerializableValue(JsonElementSerializer.INSTANCE, jsonElement0);
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeLong(long v) {
        if(this.g) {
            this.encodeString(String.valueOf(v));
            return;
        }
        this.a.print(v);
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        this.a.print("null");
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public void encodeNullableSerializableElement(@NotNull SerialDescriptor serialDescriptor0, int v, @NotNull SerializationStrategy serializationStrategy0, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(serializationStrategy0, "serializer");
        if(object0 != null || this.f.getExplicitNulls()) {
            super.encodeNullableSerializableElement(serialDescriptor0, v, serializationStrategy0, object0);
        }
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeSerializableValue(@NotNull SerializationStrategy serializationStrategy0, Object object0) {
        String s;
        Intrinsics.checkNotNullParameter(serializationStrategy0, "serializer");
        if(this.getJson().getConfiguration().getUseArrayPolymorphism()) {
            serializationStrategy0.serialize(this, object0);
            return;
        }
        if(!(serializationStrategy0 instanceof AbstractPolymorphicSerializer)) {
            switch(kotlinx.serialization.json.internal.PolymorphicKt.WhenMappings.$EnumSwitchMapping$0[this.getJson().getConfiguration().getClassDiscriminatorMode().ordinal()]) {
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
            this.h = s;
        }
        serializationStrategy0.serialize(this, object0);
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeShort(short v) {
        if(this.g) {
            this.encodeString(String.valueOf(v));
            return;
        }
        this.a.print(v);
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeString(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        this.a.printQuoted(s);
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public void endStructure(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        WriteMode writeMode0 = this.c;
        if(writeMode0.end != 0) {
            this.a.unIndent();
            this.a.nextItemIfNotFirst();
            this.a.print(writeMode0.end);
        }
    }

    @Override  // kotlinx.serialization.json.JsonEncoder
    @NotNull
    public Json getJson() {
        return this.b;
    }

    @Override  // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
    @NotNull
    public SerializersModule getSerializersModule() {
        return this.e;
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public boolean shouldEncodeElementDefault(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this.f.getEncodeDefaults();
    }
}

