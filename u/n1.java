package u;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.foundation.EdgeEffectCompat;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import s1.c;

public final class n1 extends InspectorValueInfo implements DrawModifier {
    public final AndroidEdgeEffectOverscrollEffect c;
    public final o1 d;
    public RenderNode e;

    public n1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect0, o1 o10, Function1 function10) {
        super(function10);
        this.c = androidEdgeEffectOverscrollEffect0;
        this.d = o10;
    }

    public static boolean b(float f, EdgeEffect edgeEffect0, Canvas canvas0) {
        if(f == 0.0f) {
            return edgeEffect0.draw(canvas0);
        }
        int v = canvas0.save();
        canvas0.rotate(f);
        boolean z = edgeEffect0.draw(canvas0);
        canvas0.restoreToCount(v);
        return z;
    }

    public final RenderNode c() {
        RenderNode renderNode0 = this.e;
        if(renderNode0 == null) {
            renderNode0 = c.e();
            this.e = renderNode0;
        }
        return renderNode0;
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
        androidEdgeEffectOverscrollEffect0.getRedrawSignal$foundation_release().getValue();
        float f = contentDrawScope0.toPx-0680j_4(30.0f);
        Canvas canvas0 = AndroidCanvas_androidKt.getNativeCanvas(contentDrawScope0.getDrawContext().getCanvas());
        o1 o10 = this.d;
        boolean z = o1.f(o10.d) || o1.g(o10.h) || o1.f(o10.e) || o1.g(o10.i);
        boolean z1 = o1.f(o10.f) || o1.g(o10.j) || o1.f(o10.g) || o1.g(o10.k);
        if(z && z1) {
            c.m(this.c(), canvas0.getWidth(), canvas0.getHeight());
            goto label_25;
        }
        boolean z4 = false;
        if(z) {
            z4 = true;
            RenderNode renderNode0 = this.c();
            int v1 = canvas0.getWidth();
            c.m(renderNode0, zd.c.roundToInt(f) * 2 + v1, canvas0.getHeight());
        }
        else if(z1) {
            z4 = true;
            RenderNode renderNode1 = this.c();
            int v2 = canvas0.getWidth();
            int v3 = canvas0.getHeight();
            c.m(renderNode1, v2, zd.c.roundToInt(f) * 2 + v3);
        }
        if(z4) {
        label_25:
            RecordingCanvas recordingCanvas0 = this.c().beginRecording();
            if(o1.g(o10.j)) {
                EdgeEffect edgeEffect0 = o10.j;
                if(edgeEffect0 == null) {
                    edgeEffect0 = o10.a();
                    o10.j = edgeEffect0;
                }
                n1.b(90.0f, edgeEffect0, recordingCanvas0);
                edgeEffect0.finish();
            }
            if(o1.f(o10.f)) {
                EdgeEffect edgeEffect1 = o10.c();
                z2 = n1.b(270.0f, edgeEffect1, recordingCanvas0);
                if(o1.g(o10.f)) {
                    float f1 = Offset.getY-impl(androidEdgeEffectOverscrollEffect0.displacement-F1C5BW0$foundation_release());
                    EdgeEffectCompat edgeEffectCompat0 = EdgeEffectCompat.INSTANCE;
                    EdgeEffect edgeEffect2 = o10.j;
                    if(edgeEffect2 == null) {
                        edgeEffect2 = o10.a();
                        o10.j = edgeEffect2;
                    }
                    edgeEffectCompat0.onPullDistanceCompat(edgeEffect2, edgeEffectCompat0.getDistanceCompat(edgeEffect1), 1.0f - f1);
                }
            }
            else {
                z2 = false;
            }
            if(o1.g(o10.h)) {
                EdgeEffect edgeEffect3 = o10.h;
                if(edgeEffect3 == null) {
                    edgeEffect3 = o10.a();
                    o10.h = edgeEffect3;
                }
                n1.b(180.0f, edgeEffect3, recordingCanvas0);
                edgeEffect3.finish();
            }
            if(o1.f(o10.d)) {
                EdgeEffect edgeEffect4 = o10.e();
                z2 = n1.b(0.0f, edgeEffect4, recordingCanvas0) || z2;
                if(o1.g(o10.d)) {
                    float f2 = Offset.getX-impl(androidEdgeEffectOverscrollEffect0.displacement-F1C5BW0$foundation_release());
                    EdgeEffectCompat edgeEffectCompat1 = EdgeEffectCompat.INSTANCE;
                    EdgeEffect edgeEffect5 = o10.h;
                    if(edgeEffect5 == null) {
                        edgeEffect5 = o10.a();
                        o10.h = edgeEffect5;
                    }
                    edgeEffectCompat1.onPullDistanceCompat(edgeEffect5, edgeEffectCompat1.getDistanceCompat(edgeEffect4), f2);
                }
            }
            if(o1.g(o10.k)) {
                EdgeEffect edgeEffect6 = o10.k;
                if(edgeEffect6 == null) {
                    edgeEffect6 = o10.a();
                    o10.k = edgeEffect6;
                }
                n1.b(270.0f, edgeEffect6, recordingCanvas0);
                edgeEffect6.finish();
            }
            if(o1.f(o10.g)) {
                EdgeEffect edgeEffect7 = o10.d();
                z2 = n1.b(90.0f, edgeEffect7, recordingCanvas0) || z2;
                if(o1.g(o10.g)) {
                    float f3 = Offset.getY-impl(androidEdgeEffectOverscrollEffect0.displacement-F1C5BW0$foundation_release());
                    EdgeEffectCompat edgeEffectCompat2 = EdgeEffectCompat.INSTANCE;
                    EdgeEffect edgeEffect8 = o10.k;
                    if(edgeEffect8 == null) {
                        edgeEffect8 = o10.a();
                        o10.k = edgeEffect8;
                    }
                    edgeEffectCompat2.onPullDistanceCompat(edgeEffect8, edgeEffectCompat2.getDistanceCompat(edgeEffect7), f3);
                }
            }
            if(o1.g(o10.i)) {
                EdgeEffect edgeEffect9 = o10.i;
                if(edgeEffect9 == null) {
                    edgeEffect9 = o10.a();
                    o10.i = edgeEffect9;
                }
                n1.b(0.0f, edgeEffect9, recordingCanvas0);
                edgeEffect9.finish();
            }
            if(o1.f(o10.e)) {
                EdgeEffect edgeEffect10 = o10.b();
                boolean z3 = n1.b(180.0f, edgeEffect10, recordingCanvas0) || z2;
                if(o1.g(o10.e)) {
                    float f4 = Offset.getX-impl(androidEdgeEffectOverscrollEffect0.displacement-F1C5BW0$foundation_release());
                    EdgeEffectCompat edgeEffectCompat3 = EdgeEffectCompat.INSTANCE;
                    EdgeEffect edgeEffect11 = o10.i;
                    if(edgeEffect11 == null) {
                        edgeEffect11 = o10.a();
                        o10.i = edgeEffect11;
                    }
                    edgeEffectCompat3.onPullDistanceCompat(edgeEffect11, edgeEffectCompat3.getDistanceCompat(edgeEffect10), 1.0f - f4);
                }
                z2 = z3;
            }
            if(z2) {
                androidEdgeEffectOverscrollEffect0.invalidateOverscroll$foundation_release();
            }
            float f5 = z1 ? 0.0f : f;
            if(z) {
                f = 0.0f;
            }
            LayoutDirection layoutDirection0 = contentDrawScope0.getLayoutDirection();
            androidx.compose.ui.graphics.Canvas canvas1 = AndroidCanvas_androidKt.Canvas(recordingCanvas0);
            long v4 = contentDrawScope0.getSize-NH-jbRc();
            Density density0 = contentDrawScope0.getDrawContext().getDensity();
            LayoutDirection layoutDirection1 = contentDrawScope0.getDrawContext().getLayoutDirection();
            androidx.compose.ui.graphics.Canvas canvas2 = contentDrawScope0.getDrawContext().getCanvas();
            long v5 = contentDrawScope0.getDrawContext().getSize-NH-jbRc();
            GraphicsLayer graphicsLayer0 = contentDrawScope0.getDrawContext().getGraphicsLayer();
            DrawContext drawContext0 = contentDrawScope0.getDrawContext();
            drawContext0.setDensity(contentDrawScope0);
            drawContext0.setLayoutDirection(layoutDirection0);
            drawContext0.setCanvas(canvas1);
            drawContext0.setSize-uvyYCjk(v4);
            drawContext0.setGraphicsLayer(null);
            canvas1.save();
            try {
                contentDrawScope0.getDrawContext().getTransform().translate(f5, f);
                try {
                    contentDrawScope0.drawContent();
                }
                catch(Throwable throwable0) {
                    contentDrawScope0.getDrawContext().getTransform().translate(-f5, -f);
                    throw throwable0;
                }
                contentDrawScope0.getDrawContext().getTransform().translate(-f5, -f);
            }
            finally {
                canvas1.restore();
                DrawContext drawContext1 = contentDrawScope0.getDrawContext();
                drawContext1.setDensity(density0);
                drawContext1.setLayoutDirection(layoutDirection1);
                drawContext1.setCanvas(canvas2);
                drawContext1.setSize-uvyYCjk(v5);
                drawContext1.setGraphicsLayer(graphicsLayer0);
            }
            this.c().endRecording();
            int v7 = canvas0.save();
            canvas0.translate(-f5, -f);
            canvas0.drawRenderNode(this.c());
            canvas0.restoreToCount(v7);
            return;
        }
        contentDrawScope0.drawContent();
    }
}

