package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nCompositePackageFragmentProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositePackageFragmentProvider.kt\norg/jetbrains/kotlin/descriptors/impl/CompositePackageFragmentProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1726#2,3:64\n*S KotlinDebug\n*F\n+ 1 CompositePackageFragmentProvider.kt\norg/jetbrains/kotlin/descriptors/impl/CompositePackageFragmentProvider\n*L\n51#1:64,3\n*E\n"})
public final class CompositePackageFragmentProvider implements PackageFragmentProviderOptimized {
    public final List a;
    public final String b;

    public CompositePackageFragmentProvider(@NotNull List list0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(list0, "providers");
        Intrinsics.checkNotNullParameter(s, "debugName");
        super();
        this.a = list0;
        this.b = s;
        list0.size();
        CollectionsKt___CollectionsKt.toSet(list0).size();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(@NotNull FqName fqName0, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        Intrinsics.checkNotNullParameter(collection0, "packageFragments");
        for(Object object0: this.a) {
            PackageFragmentProviderKt.collectPackageFragmentsOptimizedIfPossible(((PackageFragmentProvider)object0), fqName0, collection0);
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @Deprecated(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    @NotNull
    public List getPackageFragments(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.a) {
            PackageFragmentProviderKt.collectPackageFragmentsOptimizedIfPossible(((PackageFragmentProvider)object0), fqName0, arrayList0);
        }
        return CollectionsKt___CollectionsKt.toList(arrayList0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    public Collection getSubPackagesOf(@NotNull FqName fqName0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        Intrinsics.checkNotNullParameter(function10, "nameFilter");
        Collection collection0 = new HashSet();
        for(Object object0: this.a) {
            ((AbstractCollection)collection0).addAll(((PackageFragmentProvider)object0).getSubPackagesOf(fqName0, function10));
        }
        return collection0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        Iterable iterable0 = this.a;
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object0: iterable0) {
                if(!PackageFragmentProviderKt.isEmpty(((PackageFragmentProvider)object0), fqName0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    @Override
    @NotNull
    public String toString() {
        return this.b;
    }
}

