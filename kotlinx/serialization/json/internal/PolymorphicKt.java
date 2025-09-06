package kotlinx.serialization.json.internal;

import a5.b;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind.ENUM;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind.CLASS;
import kotlinx.serialization.descriptors.StructureKind.OBJECT;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.JsonInternalDependenciesKt;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonClassDiscriminator;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001AG\u0010\t\u001A\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001A\u00028\u00002\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001A\u0017\u0010\r\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\u000BH\u0000¢\u0006\u0004\b\r\u0010\u000E\u001A\'\u0010\u0012\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u000F2\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001A\u001B\u0010\u0017\u001A\u00020\u0006*\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"T", "Lkotlinx/serialization/json/JsonEncoder;", "Lkotlinx/serialization/SerializationStrategy;", "serializer", "value", "Lkotlin/Function1;", "", "", "ifPolymorphic", "encodePolymorphically", "(Lkotlinx/serialization/json/JsonEncoder;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/serialization/descriptors/SerialKind;", "kind", "checkKind", "(Lkotlinx/serialization/descriptors/SerialKind;)V", "Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "decodeSerializableValuePolymorphic", "(Lkotlinx/serialization/json/JsonDecoder;Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/json/Json;", "json", "classDiscriminator", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;)Ljava/lang/String;", "kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPolymorphic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n*L\n1#1,103:1\n1#2:104\n252#3,7:105\n*S KotlinDebug\n*F\n+ 1 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n*L\n81#1:105,7\n*E\n"})
public final class PolymorphicKt {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0xB0)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[ClassDiscriminatorMode.values().length];
            try {
                arr_v[ClassDiscriminatorMode.NONE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ClassDiscriminatorMode.POLYMORPHIC.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ClassDiscriminatorMode.ALL_JSON_OBJECTS.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final void access$validateIfSealed(SerializationStrategy serializationStrategy0, SerializationStrategy serializationStrategy1, String s) {
        if(!(serializationStrategy0 instanceof SealedClassSerializer) || !JsonInternalDependenciesKt.jsonCachedSerialNames(serializationStrategy1.getDescriptor()).contains(s)) {
            return;
        }
        String s1 = serializationStrategy0.getDescriptor().getSerialName();
        StringBuilder stringBuilder0 = b.w("Sealed class \'", serializationStrategy1.getDescriptor().getSerialName(), "\' cannot be serialized as base class \'", s1, "\' because it has property name that conflicts with JSON class discriminator \'");
        stringBuilder0.append(s);
        stringBuilder0.append("\'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
        throw new IllegalStateException(stringBuilder0.toString().toString());
    }

    public static final void checkKind(@NotNull SerialKind serialKind0) {
        Intrinsics.checkNotNullParameter(serialKind0, "kind");
        if(serialKind0 instanceof ENUM) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with \'type\' parameter. You can use \'JsonBuilder.useArrayPolymorphism\' instead");
        }
        if(serialKind0 instanceof PrimitiveKind) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with \'type\' parameter. You can use \'JsonBuilder.useArrayPolymorphism\' instead");
        }
        if(serialKind0 instanceof PolymorphicKind) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    @NotNull
    public static final String classDiscriminator(@NotNull SerialDescriptor serialDescriptor0, @NotNull Json json0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "<this>");
        Intrinsics.checkNotNullParameter(json0, "json");
        for(Object object0: serialDescriptor0.getAnnotations()) {
            Annotation annotation0 = (Annotation)object0;
            if(annotation0 instanceof JsonClassDiscriminator) {
                return ((JsonClassDiscriminator)annotation0).discriminator();
            }
            if(false) {
                break;
            }
        }
        return json0.getConfiguration().getClassDiscriminator();
    }

    public static final Object decodeSerializableValuePolymorphic(@NotNull JsonDecoder jsonDecoder0, @NotNull DeserializationStrategy deserializationStrategy0) {
        DeserializationStrategy deserializationStrategy1;
        String s1;
        Intrinsics.checkNotNullParameter(jsonDecoder0, "<this>");
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
        if(deserializationStrategy0 instanceof AbstractPolymorphicSerializer && !jsonDecoder0.getJson().getConfiguration().getUseArrayPolymorphism()) {
            String s = PolymorphicKt.classDiscriminator(deserializationStrategy0.getDescriptor(), jsonDecoder0.getJson());
            JsonElement jsonElement0 = jsonDecoder0.decodeJsonElement();
            SerialDescriptor serialDescriptor0 = deserializationStrategy0.getDescriptor();
            if(!(jsonElement0 instanceof JsonObject)) {
                throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class) + " as the serialized body of " + serialDescriptor0.getSerialName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElement0.getClass()));
            }
            JsonElement jsonElement1 = (JsonElement)((JsonObject)jsonElement0).get(s);
            if(jsonElement1 == null) {
                s1 = null;
            }
            else {
                JsonPrimitive jsonPrimitive0 = JsonElementKt.getJsonPrimitive(jsonElement1);
                s1 = jsonPrimitive0 == null ? null : JsonElementKt.getContentOrNull(jsonPrimitive0);
            }
            try {
                deserializationStrategy1 = PolymorphicSerializerKt.findPolymorphicSerializer(((AbstractPolymorphicSerializer)deserializationStrategy0), jsonDecoder0, s1);
            }
            catch(SerializationException serializationException0) {
                String s2 = serializationException0.getMessage();
                Intrinsics.checkNotNull(s2);
                throw JsonExceptionsKt.JsonDecodingException(-1, s2, ((JsonObject)jsonElement0).toString());
            }
            Intrinsics.checkNotNull(deserializationStrategy1, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
            return TreeJsonDecoderKt.readPolymorphicJson(jsonDecoder0.getJson(), s, ((JsonObject)jsonElement0), deserializationStrategy1);
        }
        return deserializationStrategy0.deserialize(jsonDecoder0);
    }

    public static final void encodePolymorphically(@NotNull JsonEncoder jsonEncoder0, @NotNull SerializationStrategy serializationStrategy0, Object object0, @NotNull Function1 function10) {
        String s;
        Intrinsics.checkNotNullParameter(jsonEncoder0, "<this>");
        Intrinsics.checkNotNullParameter(serializationStrategy0, "serializer");
        Intrinsics.checkNotNullParameter(function10, "ifPolymorphic");
        if(jsonEncoder0.getJson().getConfiguration().getUseArrayPolymorphism()) {
            serializationStrategy0.serialize(jsonEncoder0, object0);
            return;
        }
        if(!(serializationStrategy0 instanceof AbstractPolymorphicSerializer)) {
            switch(WhenMappings.$EnumSwitchMapping$0[jsonEncoder0.getJson().getConfiguration().getClassDiscriminatorMode().ordinal()]) {
                case 1: 
                case 2: {
                    s = null;
                    break;
                }
                case 3: {
                    SerialKind serialKind0 = serializationStrategy0.getDescriptor().getKind();
                    s = !Intrinsics.areEqual(serialKind0, CLASS.INSTANCE) && !Intrinsics.areEqual(serialKind0, OBJECT.INSTANCE) ? null : PolymorphicKt.classDiscriminator(serializationStrategy0.getDescriptor(), jsonEncoder0.getJson());
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        else if(jsonEncoder0.getJson().getConfiguration().getClassDiscriminatorMode() != ClassDiscriminatorMode.NONE) {
            s = PolymorphicKt.classDiscriminator(serializationStrategy0.getDescriptor(), jsonEncoder0.getJson());
        }
        else {
            s = null;
        }
        if(serializationStrategy0 instanceof AbstractPolymorphicSerializer) {
            if(object0 == null) {
                throw new IllegalArgumentException(("Value for serializer " + serializationStrategy0.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            SerializationStrategy serializationStrategy1 = PolymorphicSerializerKt.findPolymorphicSerializer(((AbstractPolymorphicSerializer)serializationStrategy0), jsonEncoder0, object0);
            if(s != null) {
                PolymorphicKt.access$validateIfSealed(serializationStrategy0, serializationStrategy1, s);
            }
            PolymorphicKt.checkKind(serializationStrategy1.getDescriptor().getKind());
            Intrinsics.checkNotNull(serializationStrategy1, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
            serializationStrategy0 = serializationStrategy1;
        }
        if(s != null) {
            function10.invoke(s);
        }
        serializationStrategy0.serialize(jsonEncoder0, object0);
    }
}

