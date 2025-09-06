package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001A\u0010\u000B\u001A\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lkotlinx/serialization/internal/PrimitiveArrayDescriptor;", "Lkotlinx/serialization/internal/ListLikeDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "primitive", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "b", "Ljava/lang/String;", "getSerialName", "()Ljava/lang/String;", "serialName", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PrimitiveArrayDescriptor extends ListLikeDescriptor {
    public final String b;

    public PrimitiveArrayDescriptor(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "primitive");
        super(serialDescriptor0, null);
        this.b = serialDescriptor0.getSerialName() + "Array";
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getSerialName() {
        return this.b;
    }
}

