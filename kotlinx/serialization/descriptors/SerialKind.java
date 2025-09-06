package kotlinx.serialization.descriptors;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tJ\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000F\u0010\u0006\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\n\u000B\f\r\u000E¨\u0006\u000F"}, d2 = {"Lkotlinx/serialization/descriptors/SerialKind;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "CONTEXTUAL", "ENUM", "Lkotlinx/serialization/descriptors/PolymorphicKind;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "Lkotlinx/serialization/descriptors/SerialKind$CONTEXTUAL;", "Lkotlinx/serialization/descriptors/SerialKind$ENUM;", "Lkotlinx/serialization/descriptors/StructureKind;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@ExperimentalSerializationApi
public abstract class SerialKind {
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/SerialKind$CONTEXTUAL;", "Lkotlinx/serialization/descriptors/SerialKind;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @ExperimentalSerializationApi
    public static final class CONTEXTUAL extends SerialKind {
        @NotNull
        public static final CONTEXTUAL INSTANCE;

        static {
            CONTEXTUAL.INSTANCE = new CONTEXTUAL(null);  // 初始化器: Lkotlinx/serialization/descriptors/SerialKind;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/SerialKind$ENUM;", "Lkotlinx/serialization/descriptors/SerialKind;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @ExperimentalSerializationApi
    public static final class ENUM extends SerialKind {
        @NotNull
        public static final ENUM INSTANCE;

        static {
            ENUM.INSTANCE = new ENUM(null);  // 初始化器: Lkotlinx/serialization/descriptors/SerialKind;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    public SerialKind(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        String s = Reflection.getOrCreateKotlinClass(this.getClass()).getSimpleName();
        Intrinsics.checkNotNull(s);
        return s;
    }
}

