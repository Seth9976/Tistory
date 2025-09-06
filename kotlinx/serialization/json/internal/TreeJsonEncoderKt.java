package kotlinx.serialization.json.internal;

import jg.e;
import jg.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind.ENUM;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\u001A3\u0010\u0007\u001A\u00020\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00028\u00002\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001A,\u0010\u000B\u001A\u00028\u0000\"\n\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\tH\u0080\b¢\u0006\u0004\b\u000B\u0010\f\"\u0014\u0010\u000E\u001A\u00020\r8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"T", "Lkotlinx/serialization/json/Json;", "json", "value", "Lkotlinx/serialization/SerializationStrategy;", "serializer", "Lkotlinx/serialization/json/JsonElement;", "writeJson", "(Lkotlinx/serialization/json/Json;Ljava/lang/Object;Lkotlinx/serialization/SerializationStrategy;)Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cast", "(Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/json/JsonElement;", "", "PRIMITIVE_TAG", "Ljava/lang/String;", "kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class TreeJsonEncoderKt {
    @NotNull
    public static final String PRIMITIVE_TAG = "primitive";

    public static final boolean access$getRequiresTopLevelTag(SerialDescriptor serialDescriptor0) {
        return serialDescriptor0.getKind() instanceof PrimitiveKind || serialDescriptor0.getKind() == ENUM.INSTANCE;
    }

    public static final JsonElement cast(JsonElement jsonElement0, SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(jsonElement0, "value");
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        Intrinsics.reifiedOperationMarker(3, "T");
        if(jsonElement0 != null) {
            return jsonElement0;
        }
        Intrinsics.reifiedOperationMarker(4, "T");
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonElement.class) + " as the serialized body of " + serialDescriptor0.getSerialName() + ", but had " + Reflection.getOrCreateKotlinClass(null.getClass()));
    }

    @JsonFriendModuleApi
    @NotNull
    public static final JsonElement writeJson(@NotNull Json json0, Object object0, @NotNull SerializationStrategy serializationStrategy0) {
        Intrinsics.checkNotNullParameter(json0, "json");
        Intrinsics.checkNotNullParameter(serializationStrategy0, "serializer");
        ObjectRef ref$ObjectRef0 = new ObjectRef();
        new e(json0, new k(ref$ObjectRef0), 1).encodeSerializableValue(serializationStrategy0, object0);
        Object object1 = ref$ObjectRef0.element;
        if(object1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("result");
            return null;
        }
        return (JsonElement)object1;
    }
}

