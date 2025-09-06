package androidx.window.core;

import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 6, 0}, xi = 0x30)
public final class FailedSpecification.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[VerificationMode.values().length];
        arr_v[VerificationMode.STRICT.ordinal()] = 1;
        arr_v[VerificationMode.LOG.ordinal()] = 2;
        arr_v[VerificationMode.QUIET.ordinal()] = 3;
        FailedSpecification.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}

