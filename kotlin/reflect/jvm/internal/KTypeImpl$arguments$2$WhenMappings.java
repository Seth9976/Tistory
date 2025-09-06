package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.types.Variance;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class KTypeImpl.arguments.2.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[Variance.values().length];
        try {
            arr_v[Variance.INVARIANT.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[Variance.IN_VARIANCE.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[Variance.OUT_VARIANCE.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        KTypeImpl.arguments.2.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}

