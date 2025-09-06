package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude.TopLevelPackages;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SubpackagesScope extends MemberScopeImpl {
    public final ModuleDescriptor a;
    public final FqName b;

    public SubpackagesScope(@NotNull ModuleDescriptor moduleDescriptor0, @NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        super();
        this.a = moduleDescriptor0;
        this.b = fqName0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    @NotNull
    public Set getClassifierNames() {
        return f0.emptySet();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    @NotNull
    public Collection getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter0, "kindFilter");
        Intrinsics.checkNotNullParameter(function10, "nameFilter");
        if(!descriptorKindFilter0.acceptsKinds(DescriptorKindFilter.Companion.getPACKAGES_MASK())) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        FqName fqName0 = this.b;
        if(fqName0.isRoot() && descriptorKindFilter0.getExcludes().contains(TopLevelPackages.INSTANCE)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Collection collection0 = this.a.getSubPackagesOf(fqName0, function10);
        Collection collection1 = new ArrayList(collection0.size());
        for(Object object0: collection0) {
            Name name0 = ((FqName)object0).shortName();
            Intrinsics.checkNotNullExpressionValue(name0, "subFqName.shortName()");
            if(((Boolean)function10.invoke(name0)).booleanValue()) {
                CollectionsKt.addIfNotNull(collection1, this.getPackage(name0));
            }
        }
        return collection1;
    }

    @Nullable
    public final PackageViewDescriptor getPackage(@NotNull Name name0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        if(name0.isSpecial()) {
            return null;
        }
        FqName fqName0 = this.b.child(name0);
        Intrinsics.checkNotNullExpressionValue(fqName0, "fqName.child(name)");
        PackageViewDescriptor packageViewDescriptor0 = this.a.getPackage(fqName0);
        return packageViewDescriptor0.isEmpty() ? null : packageViewDescriptor0;
    }

    @Override
    @NotNull
    public String toString() {
        return "subpackages of " + this.b + " from " + this.a;
    }
}

