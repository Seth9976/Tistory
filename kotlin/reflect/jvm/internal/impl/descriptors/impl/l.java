package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;

public final class l extends Lambda implements Function0 {
    public final int w;
    public final LazyPackageViewDescriptorImpl x;

    public l(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl0, int v) {
        this.w = v;
        this.x = lazyPackageViewDescriptorImpl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w != 0 ? PackageFragmentProviderKt.packageFragments(this.x.getModule().getPackageFragmentProvider(), this.x.getFqName()) : Boolean.valueOf(PackageFragmentProviderKt.isEmpty(this.x.getModule().getPackageFragmentProvider(), this.x.getFqName()));
    }
}

