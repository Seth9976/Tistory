package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function0 {
    public final WithDestructuringDeclaration w;

    public p(WithDestructuringDeclaration valueParameterDescriptorImpl$WithDestructuringDeclaration0) {
        this.w = valueParameterDescriptorImpl$WithDestructuringDeclaration0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w.getDestructuringVariables();
    }
}

