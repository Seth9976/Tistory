package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d1 extends InspectorValueInfo implements LayoutModifier, ModifierLocalConsumer {
    public final WindowInsets c;
    public final Lambda d;
    public final MutableState e;

    public d1(WindowInsets windowInsets0, Function1 function10, Function3 function30) {
        super(function10);
        this.c = windowInsets0;
        this.d = (Lambda)function30;
        this.e = SnapshotStateKt.mutableStateOf$default(windowInsets0, null, 2, null);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof d1 ? Intrinsics.areEqual(this.c, ((d1)object0).c) && this.d == ((d1)object0).d : false;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() + this.c.hashCode() * 0x1F;
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        WindowInsets windowInsets0 = (WindowInsets)this.e.getValue();
        LayoutDirection layoutDirection0 = measureScope0.getLayoutDirection();
        int v1 = ((Number)((Function3)this.d).invoke(windowInsets0, layoutDirection0, measureScope0)).intValue();
        if(v1 == 0) {
            return MeasureScope.layout$default(measureScope0, 0, 0, null, b1.w, 4, null);
        }
        Placeable placeable0 = measurable0.measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v, v1, v1, 0, 0, 12, null));
        return MeasureScope.layout$default(measureScope0, v1, placeable0.getHeight(), null, new c1(placeable0), 4, null);
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope0) {
        WindowInsets windowInsets0 = (WindowInsets)modifierLocalReadScope0.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets());
        WindowInsets windowInsets1 = WindowInsetsKt.exclude(this.c, windowInsets0);
        this.e.setValue(windowInsets1);
    }
}

