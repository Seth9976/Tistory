package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

public class MutablePropertyReference0Impl extends MutablePropertyReference0 {
    @SinceKotlin(version = "1.4")
    public MutablePropertyReference0Impl(Class class0, String s, String s1, int v) {
        super(CallableReference.NO_RECEIVER, class0, s, s1, v);
    }

    @SinceKotlin(version = "1.4")
    public MutablePropertyReference0Impl(Object object0, Class class0, String s, String s1, int v) {
        super(object0, class0, s, s1, v);
    }

    public MutablePropertyReference0Impl(KDeclarationContainer kDeclarationContainer0, String s, String s1) {
        Class class0 = ((ClassBasedDeclarationContainer)kDeclarationContainer0).getJClass();
        super(CallableReference.NO_RECEIVER, class0, s, s1, !(kDeclarationContainer0 instanceof KClass));
    }

    @Override  // kotlin.reflect.KProperty0
    public Object get() {
        return this.getGetter().call(new Object[0]);
    }

    @Override  // kotlin.reflect.KMutableProperty0
    public void set(Object object0) {
        this.getSetter().call(new Object[]{object0});
    }
}

