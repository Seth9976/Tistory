package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;

public final class m extends Lambda implements Function0 {
    public final LazyPackageViewDescriptorImpl w;

    public m(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl0) {
        this.w = lazyPackageViewDescriptorImpl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl0 = this.w;
        if(lazyPackageViewDescriptorImpl0.isEmpty()) {
            return Empty.INSTANCE;
        }
        Iterable iterable0 = lazyPackageViewDescriptorImpl0.getFragments();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(((PackageFragmentDescriptor)object0).getMemberScope());
        }
        List list0 = CollectionsKt___CollectionsKt.plus(arrayList0, new SubpackagesScope(lazyPackageViewDescriptorImpl0.getModule(), lazyPackageViewDescriptorImpl0.getFqName()));
        return ChainedMemberScope.Companion.create("package view scope for " + lazyPackageViewDescriptorImpl0.getFqName() + " in " + lazyPackageViewDescriptorImpl0.getModule().getName(), list0);
    }
}

