package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LazyJavaResolverContext {
    public final JavaResolverComponents a;
    public final TypeParameterResolver b;
    public final Lazy c;
    public final Lazy d;
    public final JavaTypeResolver e;

    public LazyJavaResolverContext(@NotNull JavaResolverComponents javaResolverComponents0, @NotNull TypeParameterResolver typeParameterResolver0, @NotNull Lazy lazy0) {
        Intrinsics.checkNotNullParameter(javaResolverComponents0, "components");
        Intrinsics.checkNotNullParameter(typeParameterResolver0, "typeParameterResolver");
        Intrinsics.checkNotNullParameter(lazy0, "delegateForDefaultTypeQualifiers");
        super();
        this.a = javaResolverComponents0;
        this.b = typeParameterResolver0;
        this.c = lazy0;
        this.d = lazy0;
        this.e = new JavaTypeResolver(this, typeParameterResolver0);
    }

    @NotNull
    public final JavaResolverComponents getComponents() {
        return this.a;
    }

    @Nullable
    public final JavaTypeQualifiersByElementType getDefaultTypeQualifiers() {
        return (JavaTypeQualifiersByElementType)this.d.getValue();
    }

    @NotNull
    public final Lazy getDelegateForDefaultTypeQualifiers$descriptors_jvm() {
        return this.c;
    }

    @NotNull
    public final ModuleDescriptor getModule() {
        return this.a.getModule();
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.a.getStorageManager();
    }

    @NotNull
    public final TypeParameterResolver getTypeParameterResolver() {
        return this.b;
    }

    @NotNull
    public final JavaTypeResolver getTypeResolver() {
        return this.e;
    }
}

