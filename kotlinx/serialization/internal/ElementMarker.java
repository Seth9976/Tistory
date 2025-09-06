package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0018\u0010\u0007\u001A\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000E\u001A\u00020\u0005¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Lkotlinx/serialization/internal/ElementMarker;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlin/Function2;", "", "", "readIfAbsent", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function2;)V", "index", "", "mark", "(I)V", "nextUnmarkedIndex", "()I", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@CoreFriendModuleApi
public final class ElementMarker {
    public final SerialDescriptor a;
    public final Function2 b;
    public long c;
    public final long[] d;
    public static final long[] e;

    static {
        ElementMarker.e = new long[0];
    }

    public ElementMarker(@NotNull SerialDescriptor serialDescriptor0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(function20, "readIfAbsent");
        super();
        this.a = serialDescriptor0;
        this.b = function20;
        int v = serialDescriptor0.getElementsCount();
        long v1 = 0L;
        if(v <= 0x40) {
            if(v != 0x40) {
                v1 = -1L << v;
            }
            this.c = v1;
            this.d = ElementMarker.e;
            return;
        }
        this.c = 0L;
        long[] arr_v = new long[v - 1 >>> 6];
        if((v & 0x3F) != 0) {
            arr_v[ArraysKt___ArraysKt.getLastIndex(arr_v)] = -1L << v;
        }
        this.d = arr_v;
    }

    public final void mark(int v) {
        if(v < 0x40) {
            this.c |= 1L << v;
            return;
        }
        int v1 = (v >>> 6) - 1;
        this.d[v1] |= 1L << (v & 0x3F);
    }

    public final int nextUnmarkedIndex() {
        SerialDescriptor serialDescriptor0 = this.a;
        int v = serialDescriptor0.getElementsCount();
        while(true) {
            long v1 = this.c;
            Function2 function20 = this.b;
            if(Long.compare(v1, -1L) == 0) {
                break;
            }
            int v2 = Long.numberOfTrailingZeros(~v1);
            this.c |= 1L << v2;
            if(((Boolean)function20.invoke(serialDescriptor0, v2)).booleanValue()) {
                return v2;
            }
        }
        if(v > 0x40) {
            long[] arr_v = this.d;
            for(int v3 = 0; v3 < arr_v.length; ++v3) {
                int v4 = (v3 + 1) * 0x40;
                long v5 = arr_v[v3];
                while(v5 != -1L) {
                    int v6 = Long.numberOfTrailingZeros(~v5);
                    v5 |= 1L << v6;
                    int v7 = v6 + v4;
                    if(((Boolean)function20.invoke(serialDescriptor0, v7)).booleanValue()) {
                        arr_v[v3] = v5;
                        return v7;
                    }
                    if(false) {
                        break;
                    }
                }
                arr_v[v3] = -1L;
            }
        }
        return -1;
    }
}

