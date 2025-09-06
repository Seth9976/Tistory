package kotlinx.serialization.descriptors;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/descriptors/PolymorphicKind;", "Lkotlinx/serialization/descriptors/SerialKind;", "OPEN", "SEALED", "Lkotlinx/serialization/descriptors/PolymorphicKind$OPEN;", "Lkotlinx/serialization/descriptors/PolymorphicKind$SEALED;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@ExperimentalSerializationApi
public abstract class PolymorphicKind extends SerialKind {
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/PolymorphicKind$OPEN;", "Lkotlinx/serialization/descriptors/PolymorphicKind;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class OPEN extends PolymorphicKind {
        @NotNull
        public static final OPEN INSTANCE;

        static {
            OPEN.INSTANCE = new OPEN(null);  // 初始化器: Lkotlinx/serialization/descriptors/PolymorphicKind;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/PolymorphicKind$SEALED;", "Lkotlinx/serialization/descriptors/PolymorphicKind;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class SEALED extends PolymorphicKind {
        @NotNull
        public static final SEALED INSTANCE;

        static {
            SEALED.INSTANCE = new SEALED(null);  // 初始化器: Lkotlinx/serialization/descriptors/PolymorphicKind;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    public PolymorphicKind(DefaultConstructorMarker defaultConstructorMarker0) {
        super(null);
    }
}

