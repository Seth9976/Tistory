package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

public final class PlatformDependentDeclarationFilterKt {
    public static final FqName a;

    static {
        PlatformDependentDeclarationFilterKt.a = new FqName("kotlin.internal.PlatformDependent");
    }

    @NotNull
    public static final FqName getPLATFORM_DEPENDENT_ANNOTATION_FQ_NAME() {
        return PlatformDependentDeclarationFilterKt.a;
    }
}

