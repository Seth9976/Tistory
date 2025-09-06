package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;

public class FunctionReference extends CallableReference implements FunctionBase, KFunction {
    private final int arity;
    @SinceKotlin(version = "1.4")
    private final int flags;

    public FunctionReference(int v) {
        this(v, CallableReference.NO_RECEIVER, null, null, null, 0);
    }

    @SinceKotlin(version = "1.1")
    public FunctionReference(int v, Object object0) {
        this(v, object0, null, null, null, 0);
    }

    @SinceKotlin(version = "1.4")
    public FunctionReference(int v, Object object0, Class class0, String s, String s1, int v1) {
        super(object0, class0, s, s1, (v1 & 1) == 1);
        this.arity = v;
        this.flags = v1 >> 1;
    }

    @Override  // kotlin.jvm.internal.CallableReference
    @SinceKotlin(version = "1.1")
    public KCallable computeReflected() {
        return Reflection.function(this);
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof FunctionReference) {
            return this.getName().equals(((FunctionReference)object0).getName()) && this.getSignature().equals(((FunctionReference)object0).getSignature()) && this.flags == ((FunctionReference)object0).flags && this.arity == ((FunctionReference)object0).arity && Intrinsics.areEqual(this.getBoundReceiver(), ((FunctionReference)object0).getBoundReceiver()) && Intrinsics.areEqual(this.getOwner(), ((FunctionReference)object0).getOwner());
        }
        return object0 instanceof KFunction ? object0.equals(this.compute()) : false;
    }

    @Override  // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    @Override  // kotlin.jvm.internal.CallableReference
    @SinceKotlin(version = "1.1")
    public KCallable getReflected() {
        return this.getReflected();
    }

    @SinceKotlin(version = "1.1")
    public KFunction getReflected() {
        return (KFunction)super.getReflected();
    }

    @Override
    public int hashCode() {
        int v = this.getOwner() == null ? 0 : this.getOwner().hashCode() * 0x1F;
        int v1 = this.getName().hashCode();
        return this.getSignature().hashCode() + (v1 + v) * 0x1F;
    }

    @Override  // kotlin.reflect.KFunction
    @SinceKotlin(version = "1.1")
    public boolean isExternal() {
        return this.getReflected().isExternal();
    }

    @Override  // kotlin.reflect.KFunction
    @SinceKotlin(version = "1.1")
    public boolean isInfix() {
        return this.getReflected().isInfix();
    }

    @Override  // kotlin.reflect.KFunction
    @SinceKotlin(version = "1.1")
    public boolean isInline() {
        return this.getReflected().isInline();
    }

    @Override  // kotlin.reflect.KFunction
    @SinceKotlin(version = "1.1")
    public boolean isOperator() {
        return this.getReflected().isOperator();
    }

    @Override  // kotlin.jvm.internal.CallableReference, kotlin.reflect.KFunction
    @SinceKotlin(version = "1.1")
    public boolean isSuspend() {
        return this.getReflected().isSuspend();
    }

    @Override
    public String toString() {
        KCallable kCallable0 = this.compute();
        if(kCallable0 != this) {
            return kCallable0.toString();
        }
        return "<init>".equals(this.getName()) ? "constructor (Kotlin reflection is not available)" : "function " + this.getName() + " (Kotlin reflection is not available)";
    }
}

