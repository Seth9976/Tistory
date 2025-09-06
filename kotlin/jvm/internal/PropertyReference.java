package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;

public abstract class PropertyReference extends CallableReference implements KProperty {
    public final boolean a;

    public PropertyReference() {
        this.a = false;
    }

    @SinceKotlin(version = "1.1")
    public PropertyReference(Object object0) {
        super(object0);
        this.a = false;
    }

    @SinceKotlin(version = "1.4")
    public PropertyReference(Object object0, Class class0, String s, String s1, int v) {
        boolean z = false;
        super(object0, class0, s, s1, (v & 1) == 1);
        if((v & 2) == 2) {
            z = true;
        }
        this.a = z;
    }

    @Override  // kotlin.jvm.internal.CallableReference
    public KCallable compute() {
        return this.a ? this : super.compute();
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof PropertyReference) {
            return this.getOwner().equals(((PropertyReference)object0).getOwner()) && this.getName().equals(((PropertyReference)object0).getName()) && this.getSignature().equals(((PropertyReference)object0).getSignature()) && Intrinsics.areEqual(this.getBoundReceiver(), ((PropertyReference)object0).getBoundReceiver());
        }
        return object0 instanceof KProperty ? object0.equals(this.compute()) : false;
    }

    @Override  // kotlin.jvm.internal.CallableReference
    @SinceKotlin(version = "1.1")
    public KCallable getReflected() {
        return this.getReflected();
    }

    @SinceKotlin(version = "1.1")
    public KProperty getReflected() {
        if(this.a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        return (KProperty)super.getReflected();
    }

    @Override
    public int hashCode() {
        int v = this.getOwner().hashCode();
        int v1 = this.getName().hashCode();
        return this.getSignature().hashCode() + (v1 + v * 0x1F) * 0x1F;
    }

    @Override  // kotlin.reflect.KProperty
    @SinceKotlin(version = "1.1")
    public boolean isConst() {
        return this.getReflected().isConst();
    }

    @Override  // kotlin.reflect.KProperty
    @SinceKotlin(version = "1.1")
    public boolean isLateinit() {
        return this.getReflected().isLateinit();
    }

    @Override
    public String toString() {
        KCallable kCallable0 = this.compute();
        return kCallable0 == this ? "property " + this.getName() + " (Kotlin reflection is not available)" : kCallable0.toString();
    }
}

