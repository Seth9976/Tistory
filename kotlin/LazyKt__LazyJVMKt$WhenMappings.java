package kotlin;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class LazyKt__LazyJVMKt.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[LazyThreadSafetyMode.values().length];
        try {
            arr_v[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[LazyThreadSafetyMode.NONE.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        LazyKt__LazyJVMKt.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}

