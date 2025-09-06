package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

public final class JvmTypeFactoryImpl.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[PrimitiveType.values().length];
        try {
            arr_v[PrimitiveType.BOOLEAN.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[PrimitiveType.CHAR.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[PrimitiveType.BYTE.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[PrimitiveType.SHORT.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[PrimitiveType.INT.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[PrimitiveType.FLOAT.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[PrimitiveType.LONG.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[PrimitiveType.DOUBLE.ordinal()] = 8;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        JvmTypeFactoryImpl.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}

