package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ContractDeserializer {
    public static final class Companion {
        public static final Companion a;
        public static final ContractDeserializer.Companion.DEFAULT.1 b;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.b = new ContractDeserializer.Companion.DEFAULT.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @NotNull
        public final ContractDeserializer getDEFAULT() {
            return Companion.b;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        ContractDeserializer.Companion = Companion.a;
    }

    @Nullable
    Pair deserializeContractFromFunction(@NotNull Function arg1, @NotNull FunctionDescriptor arg2, @NotNull TypeTable arg3, @NotNull TypeDeserializer arg4);
}

