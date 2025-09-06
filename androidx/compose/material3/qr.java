package androidx.compose.material3;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.jvm.functions.Function1;

public final class qr extends InspectorValueInfo implements LayoutModifier {
    public final boolean c;

    public qr(boolean z, Function1 function10) {
        super(function10);
        this.c = z;
    }

    @Override
    public final boolean equals(Object object0) {
        qr qr0 = object0 instanceof qr ? ((qr)object0) : null;
        return qr0 == null ? false : this.c == qr0.c;
    }

    @Override
    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        Placeable placeable0 = measurable0.measure-BRTryo0(v);
        return this.c ? MeasureScope.layout$default(measureScope0, placeable0.getWidth(), placeable0.getHeight(), null, new pr(placeable0), 4, null) : MeasureScope.layout$default(measureScope0, 0, 0, null, or.w, 4, null);
    }
}

