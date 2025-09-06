package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.Modality;

public abstract class a {
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;

    static {
        int[] arr_v = new int[Modality.values().length];
        a.c = arr_v;
        try {
            arr_v[Modality.FINAL.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.c[Modality.SEALED.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.c[Modality.OPEN.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.c[Modality.ABSTRACT.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        int[] arr_v1 = new int[Result.values().length];
        a.b = arr_v1;
        try {
            arr_v1[Result.OVERRIDABLE.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.b[Result.CONFLICT.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.b[Result.INCOMPATIBLE.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        int[] arr_v2 = new int[kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.values().length];
        a.a = arr_v2;
        try {
            arr_v2[kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.OVERRIDABLE.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.CONFLICT.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.INCOMPATIBLE.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

