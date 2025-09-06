package se;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;

public final class q extends Lambda implements Function0 {
    public final int w;
    public final LazyJavaScope x;
    public final JavaField y;
    public final JavaPropertyDescriptor z;

    public q(LazyJavaScope lazyJavaScope0, JavaField javaField0, JavaPropertyDescriptor javaPropertyDescriptor0, int v) {
        this.w = v;
        this.x = lazyJavaScope0;
        this.y = javaField0;
        this.z = javaPropertyDescriptor0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w != 0 ? this.x.getC().getStorageManager().createNullableLazyValue(new q(this.x, this.y, this.z, 0)) : this.x.getC().getComponents().getJavaPropertyInitializerEvaluator().getInitializerConstant(this.y, this.z);
    }
}

