package kotlin.io.path;

import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class PathsKt__PathRecursiveFunctionsKt.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;
    public static final int[] $EnumSwitchMapping$1;

    static {
        int[] arr_v = new int[CopyActionResult.values().length];
        try {
            arr_v[CopyActionResult.CONTINUE.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[CopyActionResult.TERMINATE.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[CopyActionResult.SKIP_SUBTREE.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        PathsKt__PathRecursiveFunctionsKt.WhenMappings.$EnumSwitchMapping$0 = arr_v;
        int[] arr_v1 = new int[OnErrorResult.values().length];
        try {
            arr_v1[OnErrorResult.TERMINATE.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v1[OnErrorResult.SKIP_SUBTREE.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        PathsKt__PathRecursiveFunctionsKt.WhenMappings.$EnumSwitchMapping$1 = arr_v1;
    }
}

