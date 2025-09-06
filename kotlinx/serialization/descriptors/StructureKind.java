package kotlinx.serialization.descriptors;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lkotlinx/serialization/descriptors/StructureKind;", "Lkotlinx/serialization/descriptors/SerialKind;", "CLASS", "LIST", "MAP", "OBJECT", "Lkotlinx/serialization/descriptors/StructureKind$CLASS;", "Lkotlinx/serialization/descriptors/StructureKind$LIST;", "Lkotlinx/serialization/descriptors/StructureKind$MAP;", "Lkotlinx/serialization/descriptors/StructureKind$OBJECT;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@ExperimentalSerializationApi
public abstract class StructureKind extends SerialKind {
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/StructureKind$CLASS;", "Lkotlinx/serialization/descriptors/StructureKind;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class CLASS extends StructureKind {
        @NotNull
        public static final CLASS INSTANCE;

        static {
            CLASS.INSTANCE = new CLASS(null);  // 初始化器: Lkotlinx/serialization/descriptors/StructureKind;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/StructureKind$LIST;", "Lkotlinx/serialization/descriptors/StructureKind;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class LIST extends StructureKind {
        @NotNull
        public static final LIST INSTANCE;

        static {
            LIST.INSTANCE = new LIST(null);  // 初始化器: Lkotlinx/serialization/descriptors/StructureKind;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/StructureKind$MAP;", "Lkotlinx/serialization/descriptors/StructureKind;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class MAP extends StructureKind {
        @NotNull
        public static final MAP INSTANCE;

        static {
            MAP.INSTANCE = new MAP(null);  // 初始化器: Lkotlinx/serialization/descriptors/StructureKind;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/StructureKind$OBJECT;", "Lkotlinx/serialization/descriptors/StructureKind;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class OBJECT extends StructureKind {
        @NotNull
        public static final OBJECT INSTANCE;

        static {
            OBJECT.INSTANCE = new OBJECT(null);  // 初始化器: Lkotlinx/serialization/descriptors/StructureKind;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    public StructureKind(DefaultConstructorMarker defaultConstructorMarker0) {
        super(null);
    }
}

