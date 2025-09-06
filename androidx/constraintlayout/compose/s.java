package androidx.constraintlayout.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ParentDataModifier.DefaultImpls;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import wb.a;

public final class s extends InspectorValueInfo implements ParentDataModifier, ConstraintLayoutTagParentData {
    public final String c;
    public final String d;

    public s(String s, String s1, Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "constraintLayoutTag");
        Intrinsics.checkNotNullParameter(s1, "constraintLayoutId");
        Intrinsics.checkNotNullParameter(function10, "inspectorInfo");
        super(function10);
        this.c = s;
        this.d = s1;
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
        if(this == object0) {
            return true;
        }
        s s0 = object0 instanceof s ? ((s)object0) : null;
        return s0 == null ? false : Intrinsics.areEqual(this.c, s0.c);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public final Object foldIn(Object object0, Function2 function20) {
        return DefaultImpls.foldIn(this, object0, function20);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public final Object foldOut(Object object0, Function2 function20) {
        return DefaultImpls.foldOut(this, object0, function20);
    }

    @Override  // androidx.constraintlayout.compose.ConstraintLayoutTagParentData
    public final String getConstraintLayoutId() {
        return this.d;
    }

    @Override  // androidx.constraintlayout.compose.ConstraintLayoutTagParentData
    public final String getConstraintLayoutTag() {
        return this.c;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override  // androidx.compose.ui.layout.ParentDataModifier
    public final Object modifyParentData(Density density0, Object object0) {
        Intrinsics.checkNotNullParameter(density0, "<this>");
        return this;
    }

    @Override  // androidx.compose.ui.Modifier
    public final Modifier then(Modifier modifier0) {
        return DefaultImpls.then(this, modifier0);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ConstraintLayoutTag(id=");
        return a.b(')', this.c, stringBuilder0);
    }
}

