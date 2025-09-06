package kotlin.reflect.jvm.internal.impl.builtins.functions;

public final class FunctionClassDescriptor.FunctionTypeConstructor.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[FunctionClassKind.values().length];
        try {
            arr_v[FunctionClassKind.Function.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[FunctionClassKind.KFunction.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[FunctionClassKind.SuspendFunction.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[FunctionClassKind.KSuspendFunction.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        FunctionClassDescriptor.FunctionTypeConstructor.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}

