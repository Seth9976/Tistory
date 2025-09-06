package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import org.jetbrains.annotations.NotNull;
import se.l;

public final class LazyJavaPackageScope.KotlinClassLookupResult.Found extends l {
    public final ClassDescriptor a;

    public LazyJavaPackageScope.KotlinClassLookupResult.Found(@NotNull ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(classDescriptor0, "descriptor");
        super();
        this.a = classDescriptor0;
    }

    @NotNull
    public final ClassDescriptor getDescriptor() {
        return this.a;
    }
}

