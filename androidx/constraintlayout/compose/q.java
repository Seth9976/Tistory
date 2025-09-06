package androidx.constraintlayout.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ParentDataModifier.DefaultImpls;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class q extends InspectorValueInfo implements ParentDataModifier {
    public final ConstrainedLayoutReference c;
    public final Function1 d;

    public q(ConstrainedLayoutReference constrainedLayoutReference0, Function1 function10) {
        Intrinsics.checkNotNullParameter(constrainedLayoutReference0, "ref");
        Intrinsics.checkNotNullParameter(function10, "constrainBlock");
        super(InspectableValueKt.getNoInspectorInfo());
        this.c = constrainedLayoutReference0;
        this.d = function10;
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public final boolean all(Function1 function10) {
        return DefaultImpls.all(this, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public final boolean any(Function1 function10) {
        return DefaultImpls.any(this, function10);
    }

    @Override
    public final boolean equals(Object object0) {
        Function1 function10 = null;
        q q0 = object0 instanceof q ? ((q)object0) : null;
        if(q0 != null) {
            function10 = q0.d;
        }
        return Intrinsics.areEqual(this.d, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public final Object foldIn(Object object0, Function2 function20) {
        return DefaultImpls.foldIn(this, object0, function20);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public final Object foldOut(Object object0, Function2 function20) {
        return DefaultImpls.foldOut(this, object0, function20);
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override  // androidx.compose.ui.layout.ParentDataModifier
    public final Object modifyParentData(Density density0, Object object0) {
        Intrinsics.checkNotNullParameter(density0, "<this>");
        return new p(this.c, this.d);
    }

    @Override  // androidx.compose.ui.Modifier
    public final Modifier then(Modifier modifier0) {
        return DefaultImpls.then(this, modifier0);
    }
}

