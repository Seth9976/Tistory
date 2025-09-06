package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import org.jetbrains.annotations.NotNull;

public interface AnnotationLoader {
    @NotNull
    List loadCallableAnnotations(@NotNull ProtoContainer arg1, @NotNull MessageLite arg2, @NotNull AnnotatedCallableKind arg3);

    @NotNull
    List loadClassAnnotations(@NotNull Class arg1);

    @NotNull
    List loadEnumEntryAnnotations(@NotNull ProtoContainer arg1, @NotNull EnumEntry arg2);

    @NotNull
    List loadExtensionReceiverParameterAnnotations(@NotNull ProtoContainer arg1, @NotNull MessageLite arg2, @NotNull AnnotatedCallableKind arg3);

    @NotNull
    List loadPropertyBackingFieldAnnotations(@NotNull ProtoContainer arg1, @NotNull Property arg2);

    @NotNull
    List loadPropertyDelegateFieldAnnotations(@NotNull ProtoContainer arg1, @NotNull Property arg2);

    @NotNull
    List loadTypeAnnotations(@NotNull Type arg1, @NotNull NameResolver arg2);

    @NotNull
    List loadTypeParameterAnnotations(@NotNull TypeParameter arg1, @NotNull NameResolver arg2);

    @NotNull
    List loadValueParameterAnnotations(@NotNull ProtoContainer arg1, @NotNull MessageLite arg2, @NotNull AnnotatedCallableKind arg3, int arg4, @NotNull ValueParameter arg5);
}

