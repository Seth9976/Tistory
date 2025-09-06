package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001A \u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0006H\u0007\u001A \u0010\u0007\u001A\u00020\u00012\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u0005\u001A\u00020\u0006H\u0007¨\u0006\u000B"}, d2 = {"throwArrayMissingFieldException", "", "seenArray", "", "goldenMaskArray", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "throwMissingFieldException", "seen", "", "goldenMask", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class PluginExceptionsKt {
    @InternalSerializationApi
    public static final void throwArrayMissingFieldException(@NotNull int[] arr_v, @NotNull int[] arr_v1, @NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(arr_v, "seenArray");
        Intrinsics.checkNotNullParameter(arr_v1, "goldenMaskArray");
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_v1.length; ++v) {
            int v1 = arr_v1[v] & ~arr_v[v];
            if(v1 != 0) {
                for(int v2 = 0; v2 < 0x20; ++v2) {
                    if((v1 & 1) != 0) {
                        arrayList0.add(serialDescriptor0.getElementName(v * 0x20 + v2));
                    }
                    v1 >>>= 1;
                }
            }
        }
        throw new MissingFieldException(arrayList0, serialDescriptor0.getSerialName());
    }

    @InternalSerializationApi
    public static final void throwMissingFieldException(int v, int v1, @NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        ArrayList arrayList0 = new ArrayList();
        int v2 = ~v & v1;
        for(int v3 = 0; v3 < 0x20; ++v3) {
            if((v2 & 1) != 0) {
                arrayList0.add(serialDescriptor0.getElementName(v3));
            }
            v2 >>>= 1;
        }
        throw new MissingFieldException(arrayList0, serialDescriptor0.getSerialName());
    }
}

