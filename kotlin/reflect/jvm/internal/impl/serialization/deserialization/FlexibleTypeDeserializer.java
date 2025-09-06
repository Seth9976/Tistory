package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

public interface FlexibleTypeDeserializer {
    public static final class ThrowException implements FlexibleTypeDeserializer {
        @NotNull
        public static final ThrowException INSTANCE;

        static {
            ThrowException.INSTANCE = new ThrowException();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer
        @NotNull
        public KotlinType create(@NotNull Type protoBuf$Type0, @NotNull String s, @NotNull SimpleType simpleType0, @NotNull SimpleType simpleType1) {
            Intrinsics.checkNotNullParameter(protoBuf$Type0, "proto");
            Intrinsics.checkNotNullParameter(s, "flexibleId");
            Intrinsics.checkNotNullParameter(simpleType0, "lowerBound");
            Intrinsics.checkNotNullParameter(simpleType1, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    @NotNull
    KotlinType create(@NotNull Type arg1, @NotNull String arg2, @NotNull SimpleType arg3, @NotNull SimpleType arg4);
}

