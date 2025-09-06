package io.github.aakira.napier;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final class DebugAntilog.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[Level.values().length];
        DebugAntilog.WhenMappings.$EnumSwitchMapping$0 = arr_v;
        arr_v[Level.VERBOSE.ordinal()] = 1;
        arr_v[Level.DEBUG.ordinal()] = 2;
        arr_v[Level.INFO.ordinal()] = 3;
        arr_v[Level.WARNING.ordinal()] = 4;
        arr_v[Level.ERROR.ordinal()] = 5;
        arr_v[Level.ASSERT.ordinal()] = 6;
    }
}

