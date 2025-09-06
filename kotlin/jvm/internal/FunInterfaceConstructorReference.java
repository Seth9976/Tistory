package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;

@SinceKotlin(version = "1.7")
public class FunInterfaceConstructorReference extends FunctionReference implements Serializable {
    public final Class a;

    public FunInterfaceConstructorReference(Class class0) {
        super(1);
        this.a = class0;
    }

    @Override  // kotlin.jvm.internal.FunctionReference
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof FunInterfaceConstructorReference ? this.a.equals(((FunInterfaceConstructorReference)object0).a) : false;
    }

    @Override  // kotlin.jvm.internal.FunctionReference
    public KCallable getReflected() {
        return this.getReflected();
    }

    @Override  // kotlin.jvm.internal.FunctionReference
    public KFunction getReflected() {
        throw new UnsupportedOperationException("Functional interface constructor does not support reflection");
    }

    @Override  // kotlin.jvm.internal.FunctionReference
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override  // kotlin.jvm.internal.FunctionReference
    public String toString() {
        return "fun interface " + this.a.getName();
    }
}

