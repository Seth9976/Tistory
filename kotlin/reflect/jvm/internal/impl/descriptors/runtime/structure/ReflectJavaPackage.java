package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ReflectJavaPackage extends ReflectJavaElement implements JavaPackage {
    public final FqName a;

    public ReflectJavaPackage(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        super();
        this.a = fqName0;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof ReflectJavaPackage && Intrinsics.areEqual(this.getFqName(), ((ReflectJavaPackage)object0).getFqName());
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @Nullable
    public JavaAnnotation findAnnotation(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public Collection getAnnotations() {
        return this.getAnnotations();
    }

    @NotNull
    public List getAnnotations() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage
    @NotNull
    public Collection getClasses(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "nameFilter");
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage
    @NotNull
    public FqName getFqName() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage
    @NotNull
    public Collection getSubPackages() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override
    public int hashCode() {
        return this.getFqName().hashCode();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    // 去混淆评级： 低(40)
    @Override
    @NotNull
    public String toString() {
        return "kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaPackage: " + this.getFqName();
    }
}

