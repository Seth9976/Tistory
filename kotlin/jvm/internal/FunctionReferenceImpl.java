package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

public class FunctionReferenceImpl extends FunctionReference {
    @SinceKotlin(version = "1.4")
    public FunctionReferenceImpl(int v, Class class0, String s, String s1, int v1) {
        super(v, CallableReference.NO_RECEIVER, class0, s, s1, v1);
    }

    @SinceKotlin(version = "1.4")
    public FunctionReferenceImpl(int v, Object object0, Class class0, String s, String s1, int v1) {
        super(v, object0, class0, s, s1, v1);
    }

    public FunctionReferenceImpl(int v, KDeclarationContainer kDeclarationContainer0, String s, String s1) {
        Class class0 = ((ClassBasedDeclarationContainer)kDeclarationContainer0).getJClass();
        super(v, CallableReference.NO_RECEIVER, class0, s, s1, !(kDeclarationContainer0 instanceof KClass));
    }
}

