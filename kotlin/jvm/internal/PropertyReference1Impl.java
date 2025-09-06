package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

public class PropertyReference1Impl extends PropertyReference1 {
    @SinceKotlin(version = "1.4")
    public PropertyReference1Impl(Class class0, String s, String s1, int v) {
        super(CallableReference.NO_RECEIVER, class0, s, s1, v);
    }

    @SinceKotlin(version = "1.4")
    public PropertyReference1Impl(Object object0, Class class0, String s, String s1, int v) {
        super(object0, class0, s, s1, v);
    }

    public PropertyReference1Impl(KDeclarationContainer kDeclarationContainer0, String s, String s1) {
        Class class0 = ((ClassBasedDeclarationContainer)kDeclarationContainer0).getJClass();
        super(CallableReference.NO_RECEIVER, class0, s, s1, !(kDeclarationContainer0 instanceof KClass));
    }

    @Override  // kotlin.reflect.KProperty1
    public Object get(Object object0) {
        return this.getGetter().call(new Object[]{object0});
    }
}

