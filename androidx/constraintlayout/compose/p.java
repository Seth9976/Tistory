package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.LayoutIdParentData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class p implements LayoutIdParentData {
    public final ConstrainedLayoutReference a;
    public final Function1 b;
    public final Object c;

    public p(ConstrainedLayoutReference constrainedLayoutReference0, Function1 function10) {
        Intrinsics.checkNotNullParameter(constrainedLayoutReference0, "ref");
        Intrinsics.checkNotNullParameter(function10, "constrain");
        super();
        this.a = constrainedLayoutReference0;
        this.b = function10;
        this.c = constrainedLayoutReference0.getId();
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof p && Intrinsics.areEqual(this.a.getId(), ((p)object0).a.getId()) && Intrinsics.areEqual(this.b, ((p)object0).b);
    }

    @Override  // androidx.compose.ui.layout.LayoutIdParentData
    public final Object getLayoutId() {
        return this.c;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.getId().hashCode() * 0x1F;
    }
}

