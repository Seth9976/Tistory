package androidx.compose.ui.text.caches;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001A\u001C\u0010\u0006\u001A\u00020\u0007*\u00020\u00012\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u0007H\u0000\"\u0010\u0010\u0000\u001A\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u001A\u0010\u0002\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0000X\u0081\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\n"}, d2 = {"EMPTY_INTS", "", "EMPTY_OBJECTS", "", "", "[Ljava/lang/Object;", "binarySearchInternal", "", "size", "value", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ContainerHelpersKt {
    @JvmField
    @NotNull
    public static final int[] EMPTY_INTS;
    @JvmField
    @NotNull
    public static final Object[] EMPTY_OBJECTS;

    static {
        ContainerHelpersKt.EMPTY_INTS = new int[0];
        ContainerHelpersKt.EMPTY_OBJECTS = new Object[0];
    }

    public static final int binarySearchInternal(@NotNull int[] arr_v, int v, int v1) {
        int v2 = v - 1;
        int v3 = 0;
        while(v3 <= v2) {
            int v4 = v3 + v2 >>> 1;
            int v5 = arr_v[v4];
            if(v5 < v1) {
                v3 = v4 + 1;
                continue;
            }
            if(v5 > v1) {
                v2 = v4 - 1;
                continue;
            }
            return v4;
        }
        return ~v3;
    }
}

