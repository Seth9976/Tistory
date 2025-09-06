package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ContractDeserializer.Companion.DEFAULT.1 implements ContractDeserializer {
    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer
    @Nullable
    public Pair deserializeContractFromFunction(@NotNull Function protoBuf$Function0, @NotNull FunctionDescriptor functionDescriptor0, @NotNull TypeTable typeTable0, @NotNull TypeDeserializer typeDeserializer0) {
        Intrinsics.checkNotNullParameter(protoBuf$Function0, "proto");
        Intrinsics.checkNotNullParameter(functionDescriptor0, "ownerFunction");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        Intrinsics.checkNotNullParameter(typeDeserializer0, "typeDeserializer");
        return null;
    }
}

