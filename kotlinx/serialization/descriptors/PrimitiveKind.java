package kotlinx.serialization.descriptors;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind;", "Lkotlinx/serialization/descriptors/SerialKind;", "BOOLEAN", "BYTE", "CHAR", "DOUBLE", "FLOAT", "INT", "LONG", "SHORT", "STRING", "Lkotlinx/serialization/descriptors/PrimitiveKind$BOOLEAN;", "Lkotlinx/serialization/descriptors/PrimitiveKind$BYTE;", "Lkotlinx/serialization/descriptors/PrimitiveKind$CHAR;", "Lkotlinx/serialization/descriptors/PrimitiveKind$DOUBLE;", "Lkotlinx/serialization/descriptors/PrimitiveKind$FLOAT;", "Lkotlinx/serialization/descriptors/PrimitiveKind$INT;", "Lkotlinx/serialization/descriptors/PrimitiveKind$LONG;", "Lkotlinx/serialization/descriptors/PrimitiveKind$SHORT;", "Lkotlinx/serialization/descriptors/PrimitiveKind$STRING;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class PrimitiveKind extends SerialKind {
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind$BOOLEAN;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class BOOLEAN extends PrimitiveKind {
        @NotNull
        public static final BOOLEAN INSTANCE;

        static {
            BOOLEAN.INSTANCE = new BOOLEAN(null);  // 初始化器: Lkotlinx/serialization/descriptors/PrimitiveKind;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind$BYTE;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class BYTE extends PrimitiveKind {
        @NotNull
        public static final BYTE INSTANCE;

        static {
            BYTE.INSTANCE = new BYTE(null);  // 初始化器: Lkotlinx/serialization/descriptors/PrimitiveKind;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind$CHAR;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class CHAR extends PrimitiveKind {
        @NotNull
        public static final CHAR INSTANCE;

        static {
            CHAR.INSTANCE = new CHAR(null);  // 初始化器: Lkotlinx/serialization/descriptors/PrimitiveKind;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind$DOUBLE;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class DOUBLE extends PrimitiveKind {
        @NotNull
        public static final DOUBLE INSTANCE;

        static {
            DOUBLE.INSTANCE = new DOUBLE(null);  // 初始化器: Lkotlinx/serialization/descriptors/PrimitiveKind;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind$FLOAT;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class FLOAT extends PrimitiveKind {
        @NotNull
        public static final FLOAT INSTANCE;

        static {
            FLOAT.INSTANCE = new FLOAT(null);  // 初始化器: Lkotlinx/serialization/descriptors/PrimitiveKind;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind$INT;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class INT extends PrimitiveKind {
        @NotNull
        public static final INT INSTANCE;

        static {
            INT.INSTANCE = new INT(null);  // 初始化器: Lkotlinx/serialization/descriptors/PrimitiveKind;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind$LONG;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class LONG extends PrimitiveKind {
        @NotNull
        public static final LONG INSTANCE;

        static {
            LONG.INSTANCE = new LONG(null);  // 初始化器: Lkotlinx/serialization/descriptors/PrimitiveKind;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind$SHORT;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class SHORT extends PrimitiveKind {
        @NotNull
        public static final SHORT INSTANCE;

        static {
            SHORT.INSTANCE = new SHORT(null);  // 初始化器: Lkotlinx/serialization/descriptors/PrimitiveKind;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/PrimitiveKind$STRING;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class STRING extends PrimitiveKind {
        @NotNull
        public static final STRING INSTANCE;

        static {
            STRING.INSTANCE = new STRING(null);  // 初始化器: Lkotlinx/serialization/descriptors/PrimitiveKind;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    public PrimitiveKind(DefaultConstructorMarker defaultConstructorMarker0) {
        super(null);
    }
}

