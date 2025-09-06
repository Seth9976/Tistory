package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.SinceKotlin;
import kotlin.reflect.KDeclarationContainer;
import kotlin.text.q;

@SinceKotlin(version = "1.4")
public class AdaptedFunctionReference implements Serializable, FunctionBase {
    public final Class b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;
    public final int g;
    protected final Object receiver;

    public AdaptedFunctionReference(int v, Class class0, String s, String s1, int v1) {
        this(v, CallableReference.NO_RECEIVER, class0, s, s1, v1);
    }

    public AdaptedFunctionReference(int v, Object object0, Class class0, String s, String s1, int v1) {
        this.receiver = object0;
        this.b = class0;
        this.c = s;
        this.d = s1;
        this.e = (v1 & 1) == 1;
        this.f = v;
        this.g = v1 >> 1;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof AdaptedFunctionReference ? this.e == ((AdaptedFunctionReference)object0).e && this.f == ((AdaptedFunctionReference)object0).f && this.g == ((AdaptedFunctionReference)object0).g && Intrinsics.areEqual(this.receiver, ((AdaptedFunctionReference)object0).receiver) && Intrinsics.areEqual(this.b, ((AdaptedFunctionReference)object0).b) && this.c.equals(((AdaptedFunctionReference)object0).c) && this.d.equals(((AdaptedFunctionReference)object0).d) : false;
    }

    @Override  // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.f;
    }

    public KDeclarationContainer getOwner() {
        Class class0 = this.b;
        if(class0 == null) {
            return null;
        }
        return this.e ? Reflection.getOrCreateKotlinPackage(class0) : Reflection.getOrCreateKotlinClass(class0);
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.receiver == null ? 0 : this.receiver.hashCode();
        Class class0 = this.b;
        if(class0 != null) {
            v = class0.hashCode();
        }
        int v2 = q.c(q.c((v1 * 0x1F + v) * 0x1F, 0x1F, this.c), 0x1F, this.d);
        return this.e ? ((v2 + 0x4CF) * 0x1F + this.f) * 0x1F + this.g : ((v2 + 0x4D5) * 0x1F + this.f) * 0x1F + this.g;
    }

    @Override
    public String toString() {
        return Reflection.renderLambdaToString(this);
    }
}

