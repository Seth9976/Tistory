package kotlinx.collections.immutable.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001AH\u0010\u0000\u001A\u00020\u0001*\u00020\u000226\u0010\u0003\u001A2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0080\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"forEachOneBit", "", "", "body", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "mask", "index", "kotlinx-collections-immutable"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class ForEachOneBitKt {
    public static final void forEachOneBit(int v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "body");
        int v1 = 0;
        while(v != 0) {
            int v2 = Integer.lowestOneBit(v);
            function20.invoke(v2, v1);
            ++v1;
            v ^= v2;
        }
    }
}

