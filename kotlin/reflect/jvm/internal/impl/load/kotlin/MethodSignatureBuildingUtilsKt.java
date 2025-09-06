package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import org.jetbrains.annotations.NotNull;

public final class MethodSignatureBuildingUtilsKt {
    @NotNull
    public static final String signature(@NotNull SignatureBuildingComponents signatureBuildingComponents0, @NotNull ClassDescriptor classDescriptor0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(signatureBuildingComponents0, "<this>");
        Intrinsics.checkNotNullParameter(classDescriptor0, "classDescriptor");
        Intrinsics.checkNotNullParameter(s, "jvmDescriptor");
        return signatureBuildingComponents0.signature(MethodSignatureMappingKt.getInternalName(classDescriptor0), s);
    }
}

