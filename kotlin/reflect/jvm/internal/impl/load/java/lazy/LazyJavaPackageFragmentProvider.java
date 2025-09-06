package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder..Util;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import md.d;
import org.jetbrains.annotations.NotNull;
import p9.a;

public final class LazyJavaPackageFragmentProvider implements PackageFragmentProviderOptimized {
    public final LazyJavaResolverContext a;
    public final CacheWithNotNullValues b;

    public LazyJavaPackageFragmentProvider(@NotNull JavaResolverComponents javaResolverComponents0) {
        Intrinsics.checkNotNullParameter(javaResolverComponents0, "components");
        super();
        Lazy lazy0 = d.lazyOf(null);
        LazyJavaResolverContext lazyJavaResolverContext0 = new LazyJavaResolverContext(javaResolverComponents0, EMPTY.INSTANCE, lazy0);
        this.a = lazyJavaResolverContext0;
        this.b = lazyJavaResolverContext0.getStorageManager().createCacheWithNotNullValues();
    }

    public final LazyJavaPackageFragment a(FqName fqName0) {
        JavaPackage javaPackage0 = JavaClassFinder..Util.findPackage$default(this.a.getComponents().getFinder(), fqName0, false, 2, null);
        if(javaPackage0 == null) {
            return null;
        }
        a a0 = new a(5, this, javaPackage0);
        return (LazyJavaPackageFragment)this.b.computeIfAbsent(fqName0, a0);
    }

    public static final LazyJavaResolverContext access$getC$p(LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider0) {
        return lazyJavaPackageFragmentProvider0.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(@NotNull FqName fqName0, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        Intrinsics.checkNotNullParameter(collection0, "packageFragments");
        CollectionsKt.addIfNotNull(collection0, this.a(fqName0));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @Deprecated(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    @NotNull
    public List getPackageFragments(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        return CollectionsKt__CollectionsKt.listOfNotNull(this.a(fqName0));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public Collection getSubPackagesOf(FqName fqName0, Function1 function10) {
        return this.getSubPackagesOf(fqName0, function10);
    }

    @NotNull
    public List getSubPackagesOf(@NotNull FqName fqName0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        Intrinsics.checkNotNullParameter(function10, "nameFilter");
        LazyJavaPackageFragment lazyJavaPackageFragment0 = this.a(fqName0);
        List list0 = lazyJavaPackageFragment0 == null ? null : lazyJavaPackageFragment0.getSubPackageFqNames$descriptors_jvm();
        return list0 == null ? CollectionsKt__CollectionsKt.emptyList() : list0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        return JavaClassFinder..Util.findPackage$default(this.a.getComponents().getFinder(), fqName0, false, 2, null) == null;
    }

    @Override
    @NotNull
    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.a.getComponents().getModule();
    }
}

