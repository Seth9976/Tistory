package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;

public final class b implements Function0 {
    public final int a;
    public final AbstractClassDescriptor b;

    public b(AbstractClassDescriptor abstractClassDescriptor0, int v) {
        this.a = v;
        this.b = abstractClassDescriptor0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.a) {
            case 0: {
                MemberScope memberScope0 = this.b.getUnsubstitutedMemberScope();
                a a0 = new a(this, 0);
                return TypeUtils.makeUnsubstitutedType(this.b, memberScope0, a0);
            }
            case 1: {
                return new InnerClassesScopeWrapper(this.b.getUnsubstitutedMemberScope());
            }
            default: {
                return new LazyClassReceiverParameterDescriptor(this.b);
            }
        }
    }
}

