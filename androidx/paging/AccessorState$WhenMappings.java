package androidx.paging;

import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class AccessorState.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;
    public static final int[] $EnumSwitchMapping$1;

    static {
        int[] arr_v = new int[LoadType.values().length];
        try {
            arr_v[LoadType.REFRESH.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        AccessorState.WhenMappings.$EnumSwitchMapping$0 = arr_v;
        int[] arr_v1 = new int[AccessorState.BlockState.values().length];
        try {
            arr_v1[AccessorState.BlockState.COMPLETED.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v1[AccessorState.BlockState.REQUIRES_REFRESH.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v1[AccessorState.BlockState.UNBLOCKED.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        AccessorState.WhenMappings.$EnumSwitchMapping$1 = arr_v1;
    }
}

