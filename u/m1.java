package u;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.foundation.OverscrollConfiguration;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.jvm.functions.Function1;
import zd.c;

public final class m1 extends InspectorValueInfo implements DrawModifier {
    public final AndroidEdgeEffectOverscrollEffect c;
    public final o1 d;
    public final OverscrollConfiguration e;

    public m1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect0, o1 o10, OverscrollConfiguration overscrollConfiguration0, Function1 function10) {
        super(function10);
        this.c = androidEdgeEffectOverscrollEffect0;
        this.d = o10;
        this.e = overscrollConfiguration0;
    }

    public static boolean b(float f, long v, EdgeEffect edgeEffect0, Canvas canvas0) {
        int v1 = canvas0.save();
        canvas0.rotate(f);
        canvas0.translate(Offset.getX-impl(v), Offset.getY-impl(v));
        boolean z = edgeEffect0.draw(canvas0);
        canvas0.restoreToCount(v1);
        return z;
    }

    @Override  // androidx.compose.ui.draw.DrawModifier
    public final void draw(ContentDrawScope contentDrawScope0) {
        boolean z2;
        long v = contentDrawScope0.getSize-NH-jbRc();
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect0 = this.c;
        androidEdgeEffectOverscrollEffect0.updateSize-uvyYCjk$foundation_release(v);
        if(Size.isEmpty-impl(contentDrawScope0.getSize-NH-jbRc())) {
            contentDrawScope0.drawContent();
            return;
        }
        contentDrawScope0.drawContent();
        androidEdgeEffectOverscrollEffect0.getRedrawSignal$foundation_release().getValue();
        Canvas canvas0 = AndroidCanvas_androidKt.getNativeCanvas(contentDrawScope0.getDrawContext().getCanvas());
        o1 o10 = this.d;
        boolean z = o1.f(o10.f);
        OverscrollConfiguration overscrollConfiguration0 = this.e;
        boolean z1 = false;
        if(z) {
            EdgeEffect edgeEffect0 = o10.c();
            z2 = m1.b(270.0f, OffsetKt.Offset(-Size.getHeight-impl(contentDrawScope0.getSize-NH-jbRc()), contentDrawScope0.toPx-0680j_4(overscrollConfiguration0.getDrawPadding().calculateLeftPadding-u2uoSUM(contentDrawScope0.getLayoutDirection()))), edgeEffect0, canvas0);
        }
        else {
            z2 = false;
        }
        if(o1.f(o10.d)) {
            EdgeEffect edgeEffect1 = o10.e();
            z2 = m1.b(0.0f, OffsetKt.Offset(0.0f, contentDrawScope0.toPx-0680j_4(overscrollConfiguration0.getDrawPadding().calculateTopPadding-D9Ej5fM())), edgeEffect1, canvas0) || z2;
        }
        if(o1.f(o10.g)) {
            EdgeEffect edgeEffect2 = o10.d();
            int v1 = c.roundToInt(Size.getWidth-impl(contentDrawScope0.getSize-NH-jbRc()));
            z2 = m1.b(90.0f, OffsetKt.Offset(0.0f, contentDrawScope0.toPx-0680j_4(overscrollConfiguration0.getDrawPadding().calculateRightPadding-u2uoSUM(contentDrawScope0.getLayoutDirection())) + -((float)v1)), edgeEffect2, canvas0) || z2;
        }
        if(o1.f(o10.e)) {
            EdgeEffect edgeEffect3 = o10.b();
            float f = contentDrawScope0.toPx-0680j_4(overscrollConfiguration0.getDrawPadding().calculateBottomPadding-D9Ej5fM());
            if(m1.b(180.0f, OffsetKt.Offset(-Size.getWidth-impl(contentDrawScope0.getSize-NH-jbRc()), f - Size.getHeight-impl(contentDrawScope0.getSize-NH-jbRc())), edgeEffect3, canvas0) || z2) {
                z1 = true;
            }
            z2 = z1;
        }
        if(z2) {
            androidEdgeEffectOverscrollEffect0.invalidateOverscroll$foundation_release();
        }
    }
}

