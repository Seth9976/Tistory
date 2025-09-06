package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.EnumMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JavaTypeQualifiersByElementType {
    public final EnumMap a;

    public JavaTypeQualifiersByElementType(@NotNull EnumMap enumMap0) {
        Intrinsics.checkNotNullParameter(enumMap0, "defaultQualifiers");
        super();
        this.a = enumMap0;
    }

    @Nullable
    public final JavaDefaultQualifiers get(@Nullable AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType0) {
        return (JavaDefaultQualifiers)this.a.get(annotationQualifierApplicabilityType0);
    }

    @NotNull
    public final EnumMap getDefaultQualifiers() {
        return this.a;
    }
}

