package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.internal.Intrinsics;

public final class z implements BoxScope, BoxWithConstraintsScope {
    public final SubcomposeMeasureScope a;
    public final long b;
    public final BoxScopeInstance c;

    public z(SubcomposeMeasureScope subcomposeMeasureScope0, long v) {
        this.a = subcomposeMeasureScope0;
        this.b = v;
        this.c = BoxScopeInstance.INSTANCE;
    }

    @Override  // androidx.compose.foundation.layout.BoxScope
    public final Modifier align(Modifier modifier0, Alignment alignment0) {
        return this.c.align(modifier0, alignment0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof z)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((z)object0).a) ? Constraints.equals-impl0(this.b, ((z)object0).b) : false;
    }

    @Override  // androidx.compose.foundation.layout.BoxWithConstraintsScope
    public final long getConstraints-msEJaDk() {
        return this.b;
    }

    // 去混淆评级： 低(40)
    @Override  // androidx.compose.foundation.layout.BoxWithConstraintsScope
    public final float getMaxHeight-D9Ej5fM() {
        return Constraints.getHasBoundedHeight-impl(this.b) ? this.a.toDp-u2uoSUM(Constraints.getMaxHeight-impl(this.b)) : Infinityf;
    }

    // 去混淆评级： 低(40)
    @Override  // androidx.compose.foundation.layout.BoxWithConstraintsScope
    public final float getMaxWidth-D9Ej5fM() {
        return Constraints.getHasBoundedWidth-impl(this.b) ? this.a.toDp-u2uoSUM(Constraints.getMaxWidth-impl(this.b)) : Infinityf;
    }

    @Override  // androidx.compose.foundation.layout.BoxWithConstraintsScope
    public final float getMinHeight-D9Ej5fM() {
        return this.a.toDp-u2uoSUM(Constraints.getMinHeight-impl(this.b));
    }

    @Override  // androidx.compose.foundation.layout.BoxWithConstraintsScope
    public final float getMinWidth-D9Ej5fM() {
        return this.a.toDp-u2uoSUM(Constraints.getMinWidth-impl(this.b));
    }

    @Override
    public final int hashCode() {
        return Constraints.hashCode-impl(this.b) + this.a.hashCode() * 0x1F;
    }

    @Override  // androidx.compose.foundation.layout.BoxScope
    public final Modifier matchParentSize(Modifier modifier0) {
        return this.c.matchParentSize(modifier0);
    }

    @Override
    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + Constraints.toString-impl(this.b) + ')';
    }
}

