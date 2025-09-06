package androidx.compose.foundation.layout;

import android.graphics.Matrix;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import r0.a;

public final class f3 extends Lambda implements Function1 {
    public final int w;
    public final float x;
    public final float y;

    public f3(float f, float f1, int v) {
        this.w = v;
        this.x = f;
        this.y = f1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                ((InspectorInfo)object0).setName("absoluteOffset");
                a.j(this.x, ((InspectorInfo)object0).getProperties(), "x", ((InspectorInfo)object0)).set("y", Dp.box-impl(this.y));
                return Unit.INSTANCE;
            }
            case 1: {
                ((InspectorInfo)object0).setName("offset");
                a.j(this.x, ((InspectorInfo)object0).getProperties(), "x", ((InspectorInfo)object0)).set("y", Dp.box-impl(this.y));
                return Unit.INSTANCE;
            }
            case 2: {
                ((InspectorInfo)object0).setName("padding");
                a.j(this.x, ((InspectorInfo)object0).getProperties(), "horizontal", ((InspectorInfo)object0)).set("vertical", Dp.box-impl(this.y));
                return Unit.INSTANCE;
            }
            default: {
                Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
                ((Matrix)object0).postTranslate(this.x, this.y);
                return Unit.INSTANCE;
            }
        }
    }
}

