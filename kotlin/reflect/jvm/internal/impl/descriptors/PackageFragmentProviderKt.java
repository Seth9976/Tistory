package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

public final class PackageFragmentProviderKt {
    public static final void collectPackageFragmentsOptimizedIfPossible(@NotNull PackageFragmentProvider packageFragmentProvider0, @NotNull FqName fqName0, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(packageFragmentProvider0, "<this>");
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        Intrinsics.checkNotNullParameter(collection0, "packageFragments");
        if(packageFragmentProvider0 instanceof PackageFragmentProviderOptimized) {
            ((PackageFragmentProviderOptimized)packageFragmentProvider0).collectPackageFragments(fqName0, collection0);
            return;
        }
        collection0.addAll(packageFragmentProvider0.getPackageFragments(fqName0));
    }

    public static final boolean isEmpty(@NotNull PackageFragmentProvider packageFragmentProvider0, @NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(packageFragmentProvider0, "<this>");
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        return packageFragmentProvider0 instanceof PackageFragmentProviderOptimized ? ((PackageFragmentProviderOptimized)packageFragmentProvider0).isEmpty(fqName0) : PackageFragmentProviderKt.packageFragments(packageFragmentProvider0, fqName0).isEmpty();
    }

    @NotNull
    public static final List packageFragments(@NotNull PackageFragmentProvider packageFragmentProvider0, @NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(packageFragmentProvider0, "<this>");
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        List list0 = new ArrayList();
        PackageFragmentProviderKt.collectPackageFragmentsOptimizedIfPossible(packageFragmentProvider0, fqName0, list0);
        return list0;
    }
}

