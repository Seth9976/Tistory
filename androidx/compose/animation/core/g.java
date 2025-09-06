package androidx.compose.animation.core;

import kotlin.jvm.internal.Intrinsics;

public final class g implements Segment {
    public final Object a;
    public final Object b;

    public g(Object object0, Object object1) {
        this.a = object0;
        this.b = object1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof Segment) {
            Object object1 = ((Segment)object0).getInitialState();
            if(Intrinsics.areEqual(this.a, object1)) {
                Object object2 = ((Segment)object0).getTargetState();
                return Intrinsics.areEqual(this.b, object2);
            }
        }
        return false;
    }

    @Override  // androidx.compose.animation.core.Transition$Segment
    public final Object getInitialState() {
        return this.a;
    }

    @Override  // androidx.compose.animation.core.Transition$Segment
    public final Object getTargetState() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        Object object0 = this.b;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return v1 * 0x1F + v;
    }
}

