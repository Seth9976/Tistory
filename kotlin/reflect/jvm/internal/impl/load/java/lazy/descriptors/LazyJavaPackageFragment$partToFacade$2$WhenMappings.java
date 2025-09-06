package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind;

public final class LazyJavaPackageFragment.partToFacade.2.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[Kind.values().length];
        try {
            arr_v[Kind.MULTIFILE_CLASS_PART.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[Kind.FILE_FACADE.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        LazyJavaPackageFragment.partToFacade.2.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}

