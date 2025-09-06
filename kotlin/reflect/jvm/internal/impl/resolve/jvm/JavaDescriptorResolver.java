package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JavaDescriptorResolver {
    public final LazyJavaPackageFragmentProvider a;
    public final JavaResolverCache b;

    public JavaDescriptorResolver(@NotNull LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider0, @NotNull JavaResolverCache javaResolverCache0) {
        Intrinsics.checkNotNullParameter(lazyJavaPackageFragmentProvider0, "packageFragmentProvider");
        Intrinsics.checkNotNullParameter(javaResolverCache0, "javaResolverCache");
        super();
        this.a = lazyJavaPackageFragmentProvider0;
        this.b = javaResolverCache0;
    }

    @NotNull
    public final LazyJavaPackageFragmentProvider getPackageFragmentProvider() {
        return this.a;
    }

    @Nullable
    public final ClassDescriptor resolveClass(@NotNull JavaClass javaClass0) {
        Intrinsics.checkNotNullParameter(javaClass0, "javaClass");
        FqName fqName0 = javaClass0.getFqName();
        if(fqName0 != null && javaClass0.getLightClassOriginKind() == LightClassOriginKind.SOURCE) {
            return this.b.getClassResolvedFromSource(fqName0);
        }
        JavaClass javaClass1 = javaClass0.getOuterClass();
        if(javaClass1 != null) {
            ClassDescriptor classDescriptor0 = this.resolveClass(javaClass1);
            MemberScope memberScope0 = classDescriptor0 == null ? null : classDescriptor0.getUnsubstitutedInnerClassesScope();
            ClassifierDescriptor classifierDescriptor0 = memberScope0 == null ? null : memberScope0.getContributedClassifier(javaClass0.getName(), NoLookupLocation.FROM_JAVA_LOADER);
            return classifierDescriptor0 instanceof ClassDescriptor ? ((ClassDescriptor)classifierDescriptor0) : null;
        }
        if(fqName0 == null) {
            return null;
        }
        FqName fqName1 = fqName0.parent();
        Intrinsics.checkNotNullExpressionValue(fqName1, "fqName.parent()");
        LazyJavaPackageFragment lazyJavaPackageFragment0 = (LazyJavaPackageFragment)CollectionsKt___CollectionsKt.firstOrNull(this.a.getPackageFragments(fqName1));
        return lazyJavaPackageFragment0 == null ? null : lazyJavaPackageFragment0.findClassifierByJavaClass$descriptors_jvm(javaClass0);
    }
}

