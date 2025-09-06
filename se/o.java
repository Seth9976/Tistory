package se;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;

public final class o extends Lambda implements Function0 {
    public final int w;
    public final LazyJavaScope x;

    public o(LazyJavaScope lazyJavaScope0, int v) {
        this.w = v;
        this.x = lazyJavaScope0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return this.x.computeClassNames(DescriptorKindFilter.CLASSIFIERS, null);
            }
            case 1: {
                return this.x.computeMemberIndex();
            }
            case 2: {
                return this.x.computeFunctionNames(DescriptorKindFilter.FUNCTIONS, null);
            }
            default: {
                return this.x.computePropertyNames(DescriptorKindFilter.VARIABLES, null);
            }
        }
    }
}

