package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import ke.f;
import ke.g;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nPackageFragmentProviderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PackageFragmentProviderImpl.kt\norg/jetbrains/kotlin/descriptors/PackageFragmentProviderImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n857#2,2:43\n2624#2,3:45\n766#2:48\n857#2,2:49\n*S KotlinDebug\n*F\n+ 1 PackageFragmentProviderImpl.kt\norg/jetbrains/kotlin/descriptors/PackageFragmentProviderImpl\n*L\n26#1:43,2\n30#1:45,3\n34#1:48\n34#1:49,2\n*E\n"})
public final class PackageFragmentProviderImpl implements PackageFragmentProviderOptimized {
    public final Collection a;

    public PackageFragmentProviderImpl(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "packageFragments");
        super();
        this.a = collection0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(@NotNull FqName fqName0, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        Intrinsics.checkNotNullParameter(collection0, "packageFragments");
        for(Object object0: this.a) {
            if(Intrinsics.areEqual(((PackageFragmentDescriptor)object0).getFqName(), fqName0)) {
                collection0.add(object0);
            }
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @Deprecated(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    @NotNull
    public List getPackageFragments(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        List list0 = new ArrayList();
        for(Object object0: this.a) {
            if(Intrinsics.areEqual(((PackageFragmentDescriptor)object0).getFqName(), fqName0)) {
                list0.add(object0);
            }
        }
        return list0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    public Collection getSubPackagesOf(@NotNull FqName fqName0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        Intrinsics.checkNotNullParameter(function10, "nameFilter");
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.filter(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(this.a), f.w), new g(fqName0, 0)));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        Iterable iterable0 = this.a;
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object0: iterable0) {
                if(Intrinsics.areEqual(((PackageFragmentDescriptor)object0).getFqName(), fqName0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }
}

