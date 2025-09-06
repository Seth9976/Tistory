package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind.ENUM;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.encoding.ChunkedDecoder;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u00BC\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001ZB1\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\b\u0010\r\u001A\u0004\u0018\u00010\f\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00132\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u000B\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0017\u0010\u001C\u001A\u00020\u001B2\u0006\u0010\u000B\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u000F\u0010\u001F\u001A\u00020\u001EH\u0016\u00A2\u0006\u0004\b\u001F\u0010 J\u0011\u0010\"\u001A\u0004\u0018\u00010!H\u0016\u00A2\u0006\u0004\b\"\u0010#J=\u0010\'\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010%\u001A\u00020$2\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u00142\b\u0010&\u001A\u0004\u0018\u00018\u0000H\u0016\u00A2\u0006\u0004\b\'\u0010(J\u0017\u0010)\u001A\u00020$2\u0006\u0010\u000B\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b)\u0010*J\u000F\u0010+\u001A\u00020\u001EH\u0016\u00A2\u0006\u0004\b+\u0010 J\u000F\u0010-\u001A\u00020,H\u0016\u00A2\u0006\u0004\b-\u0010.J\u000F\u00100\u001A\u00020/H\u0016\u00A2\u0006\u0004\b0\u00101J\u000F\u00102\u001A\u00020$H\u0016\u00A2\u0006\u0004\b2\u00103J\u000F\u00105\u001A\u000204H\u0016\u00A2\u0006\u0004\b5\u00106J\u000F\u00108\u001A\u000207H\u0016\u00A2\u0006\u0004\b8\u00109J\u000F\u0010;\u001A\u00020:H\u0016\u00A2\u0006\u0004\b;\u0010<J\u000F\u0010>\u001A\u00020=H\u0016\u00A2\u0006\u0004\b>\u0010?J\u000F\u0010A\u001A\u00020@H\u0016\u00A2\u0006\u0004\bA\u0010BJ2\u0010H\u001A\u00020\u001B2!\u0010G\u001A\u001D\u0012\u0013\u0012\u00110@\u00A2\u0006\f\bD\u0012\b\bE\u0012\u0004\b\b(F\u0012\u0004\u0012\u00020\u001B0CH\u0016\u00A2\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001A\u00020J2\u0006\u0010\u000B\u001A\u00020\nH\u0016\u00A2\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001A\u00020$2\u0006\u0010M\u001A\u00020\nH\u0016\u00A2\u0006\u0004\bN\u0010*R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bO\u0010P\u001A\u0004\bQ\u0010RR\u0014\u0010\t\u001A\u00020\b8\u0000X\u0081\u0004\u00A2\u0006\u0006\n\u0004\b\t\u0010SR\u001A\u0010Y\u001A\u00020T8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bU\u0010V\u001A\u0004\bW\u0010X\u00A8\u0006["}, d2 = {"Lkotlinx/serialization/json/internal/StreamingJsonDecoder;", "Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/encoding/ChunkedDecoder;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/internal/WriteMode;", "mode", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "lexer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/json/internal/StreamingJsonDecoder$DiscriminatorHolder;", "discriminatorHolder", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/WriteMode;Lkotlinx/serialization/json/internal/AbstractJsonLexer;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/StreamingJsonDecoder$DiscriminatorHolder;)V", "Lkotlinx/serialization/json/JsonElement;", "decodeJsonElement", "()Lkotlinx/serialization/json/JsonElement;", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "decodeSerializableValue", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "beginStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder;", "", "endStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "decodeNotNullMark", "()Z", "", "decodeNull", "()Ljava/lang/Void;", "", "index", "previousValue", "decodeSerializableElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "decodeElementIndex", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "decodeBoolean", "", "decodeByte", "()B", "", "decodeShort", "()S", "decodeInt", "()I", "", "decodeLong", "()J", "", "decodeFloat", "()F", "", "decodeDouble", "()D", "", "decodeChar", "()C", "", "decodeString", "()Ljava/lang/String;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "chunk", "consumeChunk", "decodeStringChunked", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/serialization/encoding/Decoder;", "decodeInline", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "enumDescriptor", "decodeEnum", "a", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "Lkotlinx/serialization/modules/SerializersModule;", "c", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "DiscriminatorHolder", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStreamingJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoder\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 3 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n+ 4 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoderKt\n*L\n1#1,391:1\n531#2,3:392\n531#2,3:395\n119#3,17:398\n384#4,5:415\n384#4,5:420\n*S KotlinDebug\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoder\n*L\n202#1:392,3\n203#1:395,3\n215#1:398,17\n308#1:415,5\n315#1:420,5\n*E\n"})
public class StreamingJsonDecoder extends AbstractDecoder implements ChunkedDecoder, JsonDecoder {
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001A\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000E¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/json/internal/StreamingJsonDecoder$DiscriminatorHolder;", "", "discriminatorToSkip", "", "(Ljava/lang/String;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class DiscriminatorHolder {
        @JvmField
        @Nullable
        public String discriminatorToSkip;

        public DiscriminatorHolder(@Nullable String s) {
            this.discriminatorToSkip = s;
        }
    }

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
            try {
                arr_v[WriteMode.OBJ.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public final Json a;
    public final WriteMode b;
    public final SerializersModule c;
    public int d;
    public DiscriminatorHolder e;
    public final JsonConfiguration f;
    public final JsonElementMarker g;
    @JvmField
    @NotNull
    public final AbstractJsonLexer lexer;

    public StreamingJsonDecoder(@NotNull Json json0, @NotNull WriteMode writeMode0, @NotNull AbstractJsonLexer abstractJsonLexer0, @NotNull SerialDescriptor serialDescriptor0, @Nullable DiscriminatorHolder streamingJsonDecoder$DiscriminatorHolder0) {
        Intrinsics.checkNotNullParameter(json0, "json");
        Intrinsics.checkNotNullParameter(writeMode0, "mode");
        Intrinsics.checkNotNullParameter(abstractJsonLexer0, "lexer");
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        super();
        this.a = json0;
        this.b = writeMode0;
        this.lexer = abstractJsonLexer0;
        this.c = json0.getSerializersModule();
        this.d = -1;
        this.e = streamingJsonDecoder$DiscriminatorHolder0;
        JsonConfiguration jsonConfiguration0 = json0.getConfiguration();
        this.f = jsonConfiguration0;
        this.g = jsonConfiguration0.getExplicitNulls() ? null : new JsonElementMarker(serialDescriptor0);
    }

    @Override  // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    @NotNull
    public CompositeDecoder beginStructure(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        Json json0 = this.a;
        WriteMode writeMode0 = WriteModeKt.switchMode(json0, serialDescriptor0);
        this.lexer.path.pushDescriptor(serialDescriptor0);
        this.lexer.consumeNextToken(writeMode0.begin);
        if(this.lexer.peekNextToken() != 4) {
            switch(WhenMappings.$EnumSwitchMapping$0[writeMode0.ordinal()]) {
                case 1: 
                case 2: 
                case 3: {
                    return new StreamingJsonDecoder(this.a, writeMode0, this.lexer, serialDescriptor0, this.e);
                }
                default: {
                    return this.b != writeMode0 || !json0.getConfiguration().getExplicitNulls() ? new StreamingJsonDecoder(this.a, writeMode0, this.lexer, serialDescriptor0, this.e) : this;
                }
            }
        }
        AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override  // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeBoolean() {
        return this.lexer.consumeBooleanLenient();
    }

    @Override  // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public byte decodeByte() {
        long v = this.lexer.consumeNumericLiteral();
        if(v == ((long)(((byte)(((int)v)))))) {
            return (byte)(((int)v));
        }
        AbstractJsonLexer.fail$default(this.lexer, "Failed to parse byte for input \'" + v + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override  // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public char decodeChar() {
        String s = this.lexer.consumeStringLenient();
        if(s.length() == 1) {
            return s.charAt(0);
        }
        AbstractJsonLexer.fail$default(this.lexer, "Expected single char, but got \'" + s + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override  // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public double decodeDouble() {
        double f;
        AbstractJsonLexer abstractJsonLexer0 = this.lexer;
        String s = abstractJsonLexer0.consumeStringLenient();
        try {
            f = Double.parseDouble(s);
        }
        catch(IllegalArgumentException unused_ex) {
            AbstractJsonLexer.fail$default(abstractJsonLexer0, "Failed to parse type \'double\' for input \'" + s + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if(!this.a.getConfiguration().getAllowSpecialFloatingPointValues() && (Double.isInfinite(f) || Double.isNaN(f))) {
            JsonExceptionsKt.throwInvalidFloatingPointDecoded(this.lexer, f);
            throw new KotlinNothingValueException();
        }
        return f;
    }

    // This method was un-flattened
    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(@NotNull SerialDescriptor serialDescriptor0) {
        int v5;
        String s;
        JsonConfiguration jsonConfiguration0;
        JsonElementMarker jsonElementMarker0;
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        WriteMode writeMode0 = this.b;
        boolean z = false;
        Json json0 = this.a;
        int v = -1;
        switch(WhenMappings.$EnumSwitchMapping$0[writeMode0.ordinal()]) {
            case 2: {
                int v2 = this.d;
                boolean z2 = v2 % 2 != 0;
                if(!z2) {
                    this.lexer.consumeNextToken(':');
                }
                else if(v2 != -1) {
                    z = this.lexer.tryConsumeComma();
                }
                if(this.lexer.canConsumeValue()) {
                    if(z2) {
                        if(this.d == -1) {
                            AbstractJsonLexer abstractJsonLexer0 = this.lexer;
                            int v3 = abstractJsonLexer0.currentPosition;
                            if(z) {
                                AbstractJsonLexer.fail$default(abstractJsonLexer0, "Unexpected leading comma", v3, null, 4, null);
                                throw new KotlinNothingValueException();
                            }
                        }
                        else {
                            AbstractJsonLexer abstractJsonLexer1 = this.lexer;
                            int v4 = abstractJsonLexer1.currentPosition;
                            if(!z) {
                                AbstractJsonLexer.fail$default(abstractJsonLexer1, "Expected comma after the key-value pair", v4, null, 4, null);
                                throw new KotlinNothingValueException();
                            }
                        }
                    }
                    v = this.d + 1;
                    this.d = v;
                    goto label_81;
                }
                else {
                    if(!z || json0.getConfiguration().getAllowTrailingComma()) {
                        goto label_81;
                    }
                    JsonExceptionsKt.invalidTrailingComma$default(this.lexer, null, 1, null);
                    throw new KotlinNothingValueException();
                }
                break;
            }
            case 4: {
                while(true) {
                    boolean z3 = this.lexer.tryConsumeComma();
                    while(true) {
                        boolean z4 = this.lexer.canConsumeValue();
                        jsonElementMarker0 = this.g;
                        if(!z4) {
                            goto label_75;
                        }
                        jsonConfiguration0 = this.f;
                        s = jsonConfiguration0.isLenient() ? this.lexer.consumeStringLenientNotNull() : this.lexer.consumeKeyString();
                        this.lexer.consumeNextToken(':');
                        v5 = JsonNamesMapKt.getJsonNameIndex(serialDescriptor0, json0, s);
                        if(v5 == -3) {
                            goto label_66;
                        }
                        if(!jsonConfiguration0.getCoerceInputValues() || !serialDescriptor0.isElementOptional(v5)) {
                            break;
                        }
                        SerialDescriptor serialDescriptor1 = serialDescriptor0.getElementDescriptor(v5);
                        if(serialDescriptor1.isNullable() || !this.lexer.tryConsumeNull(true)) {
                            if(!Intrinsics.areEqual(serialDescriptor1.getKind(), ENUM.INSTANCE) || serialDescriptor1.isNullable() && this.lexer.tryConsumeNull(false)) {
                                break;
                            }
                            String s1 = this.lexer.peekString(jsonConfiguration0.isLenient());
                            if(s1 == null || JsonNamesMapKt.getJsonNameIndex(serialDescriptor1, json0, s1) != -3) {
                                break;
                            }
                            this.lexer.consumeString();
                        }
                        z3 = this.lexer.tryConsumeComma();
                    }
                    if(jsonElementMarker0 != null) {
                        jsonElementMarker0.mark$kotlinx_serialization_json(v5);
                    }
                    v = v5;
                    break;
                label_66:
                    if(!jsonConfiguration0.getIgnoreUnknownKeys()) {
                        DiscriminatorHolder streamingJsonDecoder$DiscriminatorHolder0 = this.e;
                        if(streamingJsonDecoder$DiscriminatorHolder0 == null || !Intrinsics.areEqual(streamingJsonDecoder$DiscriminatorHolder0.discriminatorToSkip, s)) {
                            this.lexer.failOnUnknownKey(s);
                            continue;
                        }
                        else {
                            streamingJsonDecoder$DiscriminatorHolder0.discriminatorToSkip = null;
                        }
                    }
                    this.lexer.skipElement(jsonConfiguration0.isLenient());
                    continue;
                label_75:
                    if(z3 && !json0.getConfiguration().getAllowTrailingComma()) {
                        JsonExceptionsKt.invalidTrailingComma$default(this.lexer, null, 1, null);
                        throw new KotlinNothingValueException();
                    }
                    if(jsonElementMarker0 != null) {
                        v = jsonElementMarker0.nextUnmarkedIndex$kotlinx_serialization_json();
                    }
                    break;
                }
            label_81:
                if(writeMode0 != WriteMode.MAP) {
                    this.lexer.path.updateDescriptorIndex(v);
                }
                break;
            }
            default: {
                boolean z1 = this.lexer.tryConsumeComma();
                if(this.lexer.canConsumeValue()) {
                    int v1 = this.d;
                    if(v1 != -1 && !z1) {
                        AbstractJsonLexer.fail$default(this.lexer, "Expected end of the array or comma", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    v = v1 + 1;
                    this.d = v;
                    goto label_81;
                }
                else {
                    if(!z1 || json0.getConfiguration().getAllowTrailingComma()) {
                        goto label_81;
                    }
                    JsonExceptionsKt.invalidTrailingComma(this.lexer, "array");
                    throw new KotlinNothingValueException();
                }
            }
        }
        return v;
    }

    @Override  // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeEnum(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "enumDescriptor");
        String s = this.decodeString();
        return JsonNamesMapKt.getJsonNameIndexOrThrow(serialDescriptor0, this.a, s, " at path $");
    }

    @Override  // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public float decodeFloat() {
        float f;
        AbstractJsonLexer abstractJsonLexer0 = this.lexer;
        String s = abstractJsonLexer0.consumeStringLenient();
        try {
            f = Float.parseFloat(s);
        }
        catch(IllegalArgumentException unused_ex) {
            AbstractJsonLexer.fail$default(abstractJsonLexer0, "Failed to parse type \'float\' for input \'" + s + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if(!this.a.getConfiguration().getAllowSpecialFloatingPointValues() && (Float.isInfinite(f) || Float.isNaN(f))) {
            JsonExceptionsKt.throwInvalidFloatingPointDecoded(this.lexer, f);
            throw new KotlinNothingValueException();
        }
        return f;
    }

    @Override  // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    @NotNull
    public Decoder decodeInline(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return StreamingJsonEncoderKt.isUnsignedNumber(serialDescriptor0) ? new JsonDecoderForUnsignedTypes(this.lexer, this.a) : super.decodeInline(serialDescriptor0);
    }

    @Override  // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeInt() {
        long v = this.lexer.consumeNumericLiteral();
        if(v == ((long)(((int)v)))) {
            return (int)v;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Failed to parse int for input \'" + v + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override  // kotlinx.serialization.json.JsonDecoder
    @NotNull
    public JsonElement decodeJsonElement() {
        return new JsonTreeReader(this.a.getConfiguration(), this.lexer).read();
    }

    @Override  // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public long decodeLong() {
        return this.lexer.consumeNumericLiteral();
    }

    // 去混淆评级： 低(20)
    @Override  // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return !(this.g == null ? false : this.g.isUnmarkedNull$kotlinx_serialization_json()) && !AbstractJsonLexer.tryConsumeNull$default(this.lexer, false, 1, null);
    }

    @Override  // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    @Nullable
    public Void decodeNull() {
        return null;
    }

    @Override  // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public Object decodeSerializableElement(@NotNull SerialDescriptor serialDescriptor0, int v, @NotNull DeserializationStrategy deserializationStrategy0, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
        boolean z = this.b == WriteMode.MAP && (v & 1) == 0;
        if(z) {
            this.lexer.path.resetCurrentMapKey();
        }
        Object object1 = super.decodeSerializableElement(serialDescriptor0, v, deserializationStrategy0, object0);
        if(z) {
            this.lexer.path.updateCurrentMapKey(object1);
        }
        return object1;
    }

    @Override  // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public Object decodeSerializableValue(@NotNull DeserializationStrategy deserializationStrategy0) {
        DeserializationStrategy deserializationStrategy1;
        Json json0 = this.a;
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
        try {
            if(!(deserializationStrategy0 instanceof AbstractPolymorphicSerializer) || json0.getConfiguration().getUseArrayPolymorphism()) {
                return deserializationStrategy0.deserialize(this);
            }
            String s = PolymorphicKt.classDiscriminator(deserializationStrategy0.getDescriptor(), json0);
            String s1 = this.lexer.peekLeadingMatchingValue(s, this.f.isLenient());
            if(s1 == null) {
                return PolymorphicKt.decodeSerializableValuePolymorphic(this, deserializationStrategy0);
            }
            try {
                deserializationStrategy1 = PolymorphicSerializerKt.findPolymorphicSerializer(((AbstractPolymorphicSerializer)deserializationStrategy0), this, s1);
            }
            catch(SerializationException serializationException0) {
                String s2 = serializationException0.getMessage();
                Intrinsics.checkNotNull(s2);
                String s3 = StringsKt__StringsKt.removeSuffix(StringsKt__StringsKt.substringBefore$default(s2, '\n', null, 2, null), ".");
                String s4 = serializationException0.getMessage();
                Intrinsics.checkNotNull(s4);
                String s5 = StringsKt__StringsKt.substringAfter(s4, '\n', "");
                AbstractJsonLexer.fail$default(this.lexer, s3, 0, s5, 2, null);
                throw new KotlinNothingValueException();
            }
            Intrinsics.checkNotNull(deserializationStrategy1, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>");
            this.e = new DiscriminatorHolder(s);
            return deserializationStrategy1.deserialize(this);
        }
        catch(MissingFieldException missingFieldException0) {
            String s6 = missingFieldException0.getMessage();
            Intrinsics.checkNotNull(s6);
            throw StringsKt__StringsKt.contains$default(s6, "at path", false, 2, null) ? missingFieldException0 : new MissingFieldException(missingFieldException0.getMissingFields(), missingFieldException0.getMessage() + " at path: " + "$", missingFieldException0);
        }
    }

    @Override  // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public short decodeShort() {
        long v = this.lexer.consumeNumericLiteral();
        if(v == ((long)(((short)(((int)v)))))) {
            return (short)(((int)v));
        }
        AbstractJsonLexer.fail$default(this.lexer, "Failed to parse short for input \'" + v + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    // 去混淆评级： 低(20)
    @Override  // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    @NotNull
    public String decodeString() {
        return this.f.isLenient() ? this.lexer.consumeStringLenientNotNull() : this.lexer.consumeString();
    }

    @Override  // kotlinx.serialization.encoding.ChunkedDecoder
    public void decodeStringChunked(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "consumeChunk");
        this.lexer.consumeStringChunked(this.f.isLenient(), function10);
    }

    @Override  // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        Json json0 = this.a;
        if(json0.getConfiguration().getIgnoreUnknownKeys() && serialDescriptor0.getElementsCount() == 0) {
            while(this.decodeElementIndex(serialDescriptor0) != -1) {
            }
        }
        if(this.lexer.tryConsumeComma() && !json0.getConfiguration().getAllowTrailingComma()) {
            JsonExceptionsKt.invalidTrailingComma(this.lexer, "");
            throw new KotlinNothingValueException();
        }
        this.lexer.consumeNextToken(this.b.end);
        this.lexer.path.popDescriptor();
    }

    @Override  // kotlinx.serialization.json.JsonDecoder
    @NotNull
    public final Json getJson() {
        return this.a;
    }

    @Override  // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    @NotNull
    public SerializersModule getSerializersModule() {
        return this.c;
    }
}

