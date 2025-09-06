package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

public final class k implements Function0 {
    public final TypeSubstitutor a;
    public final FunctionDescriptorImpl b;

    public k(FunctionDescriptorImpl functionDescriptorImpl0, TypeSubstitutor typeSubstitutor0) {
        this.b = functionDescriptorImpl0;
        this.a = typeSubstitutor0;
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SmartList smartList0 = new SmartList();
        for(Object object0: this.b.getOverriddenDescriptors()) {
            smartList0.add(((FunctionDescriptor)object0).substitute(this.a));
        }
        return smartList0;
    }
}

