package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface AnnotationAndConstantLoader extends AnnotationLoader {
    @Nullable
    Object loadAnnotationDefaultValue(@NotNull ProtoContainer arg1, @NotNull Property arg2, @NotNull KotlinType arg3);

    @Nullable
    Object loadPropertyConstant(@NotNull ProtoContainer arg1, @NotNull Property arg2, @NotNull KotlinType arg3);
}

