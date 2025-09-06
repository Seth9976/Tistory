package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import r0.a;

public final class l3 extends Lambda implements Function1 {
    public final float A;
    public final int w;
    public final float x;
    public final float y;
    public final float z;

    public l3(float f, float f1, float f2, float f3, int v) {
        this.w = v;
        this.x = f;
        this.y = f1;
        this.z = f2;
        this.A = f3;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            ((InspectorInfo)object0).setName("padding");
            ValueElementSequence valueElementSequence0 = a.j(this.x, ((InspectorInfo)object0).getProperties(), "start", ((InspectorInfo)object0));
            ValueElementSequence valueElementSequence1 = a.j(this.y, valueElementSequence0, "top", ((InspectorInfo)object0));
            a.j(this.z, valueElementSequence1, "end", ((InspectorInfo)object0)).set("bottom", Dp.box-impl(this.A));
            return Unit.INSTANCE;
        }
        ((InspectorInfo)object0).setName("absolutePadding");
        ValueElementSequence valueElementSequence2 = a.j(this.x, ((InspectorInfo)object0).getProperties(), "left", ((InspectorInfo)object0));
        ValueElementSequence valueElementSequence3 = a.j(this.y, valueElementSequence2, "top", ((InspectorInfo)object0));
        a.j(this.z, valueElementSequence3, "right", ((InspectorInfo)object0)).set("bottom", Dp.box-impl(this.A));
        return Unit.INSTANCE;
    }
}

