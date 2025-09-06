package androidx.constraintlayout.compose;

import aa.d;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.text.selection.g1;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.Motion;
import androidx.constraintlayout.core.state.Dimension;
import androidx.constraintlayout.core.state.Transition;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0005\u0010\u0006Jc\u0010\u001B\u001A\u00020\u00182\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u000B2\b\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0015\u001A\u00020\u00042\u0006\u0010\u0017\u001A\u00020\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0019\u0010 \u001A\u00020\u001F2\n\u0010\u001E\u001A\u00060\u001Cj\u0002`\u001D\u00A2\u0006\u0004\b \u0010!J\u000F\u0010\"\u001A\u00020\u001FH\u0016\u00A2\u0006\u0004\b\"\u0010\u0003J\u0013\u0010$\u001A\u00020\u001F*\u00020#H\u0007\u00A2\u0006\u0004\b$\u0010%J&\u0010,\u001A\u00020)2\u0006\u0010\'\u001A\u00020&2\u0006\u0010(\u001A\u00020&\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b*\u0010+J\u001D\u0010-\u001A\u00020\u00042\u0006\u0010\'\u001A\u00020&2\u0006\u0010(\u001A\u00020&\u00A2\u0006\u0004\b-\u0010.J\r\u0010/\u001A\u00020\u001F\u00A2\u0006\u0004\b/\u0010\u0003J/\u00102\u001A\u00020\u001F2\u0006\u00100\u001A\u00020\u000B2\u0006\u00101\u001A\u00020\u000B2\b\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\u0015\u001A\u00020\u0004\u00A2\u0006\u0004\b2\u00103R\u0017\u0010\u000F\u001A\u0002048\u0006\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u00108\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u00069"}, d2 = {"Landroidx/constraintlayout/compose/MotionMeasurer;", "Landroidx/constraintlayout/compose/Measurer;", "<init>", "()V", "", "getProgress", "()F", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/constraintlayout/compose/ConstraintSet;", "constraintSetStart", "constraintSetEnd", "Landroidx/constraintlayout/compose/Transition;", "transition", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "", "optimizationLevel", "progress", "Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "Landroidx/compose/ui/unit/IntSize;", "performInterpolationMeasure-OQbXsTc", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;Ljava/util/List;IFLandroidx/compose/ui/layout/MeasureScope;)J", "performInterpolationMeasure", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "json", "", "encodeRoot", "(Ljava/lang/StringBuilder;)V", "computeLayoutResult", "Landroidx/compose/foundation/layout/BoxScope;", "drawDebug", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "", "id", "name", "Landroidx/compose/ui/graphics/Color;", "getCustomColor-WaAFU9c", "(Ljava/lang/String;Ljava/lang/String;)J", "getCustomColor", "getCustomFloat", "(Ljava/lang/String;Ljava/lang/String;)F", "clearConstraintSets", "start", "end", "initWith", "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;F)V", "Landroidx/constraintlayout/core/state/Transition;", "o", "Landroidx/constraintlayout/core/state/Transition;", "getTransition", "()Landroidx/constraintlayout/core/state/Transition;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@PublishedApi
public final class MotionMeasurer extends Measurer {
    public float n;
    public final Transition o;

    public MotionMeasurer() {
        this.o = new Transition();
    }

    public static final void access$drawFrameDebug-PE3pjmc(MotionMeasurer motionMeasurer0, DrawScope drawScope0, float f, float f1, WidgetFrame widgetFrame0, WidgetFrame widgetFrame1, PathEffect pathEffect0, long v) {
        int v5;
        motionMeasurer0.getClass();
        MotionMeasurer.d(drawScope0, widgetFrame0, pathEffect0, v);
        MotionMeasurer.d(drawScope0, widgetFrame1, pathEffect0, v);
        Transition transition0 = motionMeasurer0.o;
        int v1 = transition0.getNumberKeyPositions(widgetFrame0);
        f0 f00 = new f0();  // 初始化器: Ljava/lang/Object;-><init>()V
        f00.l = new Rect();
        Paint paint0 = new Paint();
        f00.e = paint0;
        paint0.setAntiAlias(true);
        paint0.setColor(0xFFFFAA33);
        paint0.setStrokeWidth(2.0f);
        Paint.Style paint$Style0 = Paint.Style.STROKE;
        paint0.setStyle(paint$Style0);
        Paint paint1 = new Paint();
        f00.f = paint1;
        paint1.setAntiAlias(true);
        paint1.setColor(-2067046);
        paint1.setStrokeWidth(2.0f);
        paint1.setStyle(paint$Style0);
        Paint paint2 = new Paint();
        f00.g = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(0xFF33AA00);
        paint2.setStrokeWidth(2.0f);
        paint2.setStyle(paint$Style0);
        Paint paint3 = new Paint();
        f00.h = paint3;
        paint3.setAntiAlias(true);
        paint3.setColor(0xFF33AA00);
        paint3.setTextSize(23.0f);
        f00.j = new float[8];
        Paint paint4 = new Paint();
        f00.i = paint4;
        paint4.setAntiAlias(true);
        paint2.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
        float[] arr_f = new float[100];
        f00.c = arr_f;
        int[] arr_v = new int[50];
        f00.b = arr_v;
        Canvas canvas0 = AndroidCanvas_androidKt.getNativeCanvas(drawScope0.getDrawContext().getCanvas());
        Motion motion0 = transition0.getMotion(widgetFrame0.widget.stringId);
        int v2 = motion0.getDrawPath();
        int v3 = v2 == 0 ? 1 : v2;
        f00.k = motion0.buildKeyFrames(arr_f, arr_v, null);
        if(v3 >= 1) {
            if(f00.a == null || f00.a.length != 0x7C) {
                f00.a = new float[0x7C];
                f00.d = new Path();
            }
            canvas0.translate(1.0f, 1.0f);
            paint0.setColor(0x77000000);
            paint4.setColor(0x77000000);
            paint1.setColor(0x77000000);
            paint2.setColor(0x77000000);
            motion0.buildPath(f00.a, 62);
            f00.a(canvas0, v3, f00.k, motion0, ((int)f), ((int)f1));
            paint0.setColor(0xFFFFAA33);
            paint1.setColor(-2067046);
            paint4.setColor(-2067046);
            paint2.setColor(0xFF33AA00);
            canvas0.translate(-1.0f, -1.0f);
            f00.a(canvas0, v3, f00.k, motion0, ((int)f), ((int)f1));
            if(v3 == 5) {
                f00.d.reset();
                for(int v4 = 0; v4 <= 50; ++v4) {
                    float[] arr_f1 = f00.j;
                    motion0.buildRect(((float)v4) / 50.0f, arr_f1, 0);
                    f00.d.moveTo(arr_f1[0], arr_f1[1]);
                    f00.d.lineTo(arr_f1[2], arr_f1[3]);
                    f00.d.lineTo(arr_f1[4], arr_f1[5]);
                    f00.d.lineTo(arr_f1[6], arr_f1[7]);
                    f00.d.close();
                }
                v5 = 0;
                paint0.setColor(0x44000000);
                canvas0.translate(2.0f, 2.0f);
                canvas0.drawPath(f00.d, paint0);
                canvas0.translate(-2.0f, -2.0f);
                paint0.setColor(0xFFFF0000);
                canvas0.drawPath(f00.d, paint0);
            }
            else {
                v5 = 0;
            }
        }
        else {
            v5 = 0;
        }
        if(v1 != 0) {
            float[] arr_f2 = new float[v1];
            float[] arr_f3 = new float[v1];
            float[] arr_f4 = new float[v1];
            transition0.fillKeyPositions(widgetFrame0, arr_f2, arr_f3, arr_f4);
            if(v1 - 1 >= 0) {
                while(true) {
                    float f2 = arr_f4[v5] / 100.0f;
                    float f3 = (((float)widgetFrame1.width()) * f2 + ((float)widgetFrame0.width()) * (1.0f - f2)) / 2.0f + arr_f2[v5] * f;
                    float f4 = (f2 * ((float)widgetFrame1.height()) + (1.0f - f2) * ((float)widgetFrame0.height())) / 2.0f + arr_f3[v5] * f1;
                    androidx.compose.ui.graphics.Path path0 = AndroidPath_androidKt.Path();
                    path0.moveTo(f3 - 20.0f, f4);
                    path0.lineTo(f3, f4 + 20.0f);
                    path0.lineTo(f3 + 20.0f, f4);
                    path0.lineTo(f3, f4 - 20.0f);
                    path0.close();
                    DrawScope.drawPath-LG529CI$default(drawScope0, path0, v, 1.0f, new Stroke(3.0f, 0.0f, 0, 0, null, 30, null), null, 0, 0x30, null);
                    if(v5 == v1 - 1) {
                        break;
                    }
                    ++v5;
                }
            }
        }
    }

    public final void clearConstraintSets() {
        this.o.clear();
        this.getFrameCache().clear();
    }

    @Override  // androidx.constraintlayout.compose.Measurer
    public void computeLayoutResult() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("{ ");
        this.encodeRoot(stringBuilder0);
        int[] arr_v = new int[50];
        int[] arr_v1 = new int[50];
        float[] arr_f = new float[100];
        for(Object object0: this.getRoot().getChildren()) {
            WidgetFrame widgetFrame0 = this.o.getStart(((ConstraintWidget)object0).stringId);
            WidgetFrame widgetFrame1 = this.o.getEnd(((ConstraintWidget)object0).stringId);
            WidgetFrame widgetFrame2 = this.o.getInterpolated(((ConstraintWidget)object0).stringId);
            float[] arr_f1 = this.o.getPath(((ConstraintWidget)object0).stringId);
            int v = this.o.getKeyFrames(((ConstraintWidget)object0).stringId, arr_f, arr_v, arr_v1);
            stringBuilder0.append(" " + ((ConstraintWidget)object0).stringId + ": {");
            stringBuilder0.append(" interpolated : ");
            widgetFrame2.serialize(stringBuilder0, true);
            stringBuilder0.append(", start : ");
            widgetFrame0.serialize(stringBuilder0);
            stringBuilder0.append(", end : ");
            widgetFrame1.serialize(stringBuilder0);
            int v1 = 0;
            if(v != 0) {
                stringBuilder0.append("keyTypes : [");
                if(v > 0) {
                    for(int v2 = 0; true; ++v2) {
                        stringBuilder0.append(" " + arr_v[v2] + ',');
                        if(v2 + 1 >= v) {
                            break;
                        }
                    }
                }
                stringBuilder0.append("],\n");
                stringBuilder0.append("keyPos : [");
                int v3 = v * 2;
                if(v3 > 0) {
                    for(int v4 = 0; true; ++v4) {
                        stringBuilder0.append(" " + arr_f[v4] + ',');
                        if(v4 + 1 >= v3) {
                            break;
                        }
                    }
                }
                stringBuilder0.append("],\n ");
                stringBuilder0.append("keyFrames : [");
                if(v > 0) {
                    for(int v5 = 0; true; ++v5) {
                        stringBuilder0.append(" " + arr_v1[v5] + ',');
                        if(v5 + 1 >= v) {
                            break;
                        }
                    }
                }
                stringBuilder0.append("],\n ");
            }
            stringBuilder0.append(" path : [");
            Intrinsics.checkNotNullExpressionValue(arr_f1, "path");
            int v6 = arr_f1.length;
            while(v1 < v6) {
                float f = arr_f1[v1];
                ++v1;
                stringBuilder0.append(" " + f + " ,");
            }
            stringBuilder0.append(" ] ");
            stringBuilder0.append("}, ");
        }
        stringBuilder0.append(" }");
        LayoutInformationReceiver layoutInformationReceiver0 = this.getLayoutInformationReceiver();
        if(layoutInformationReceiver0 != null) {
            String s = stringBuilder0.toString();
            Intrinsics.checkNotNullExpressionValue(s, "json.toString()");
            layoutInformationReceiver0.setLayoutInformation(s);
        }
    }

    public static void d(DrawScope drawScope0, WidgetFrame widgetFrame0, PathEffect pathEffect0, long v) {
        if(widgetFrame0.isDefaultTransform()) {
            Stroke stroke0 = new Stroke(3.0f, 0.0f, 0, 0, pathEffect0, 14, null);
            DrawScope.drawRect-n-J9OG0$default(drawScope0, v, OffsetKt.Offset(widgetFrame0.left, widgetFrame0.top), SizeKt.Size(widgetFrame0.width(), widgetFrame0.height()), 0.0f, stroke0, null, 0, 104, null);
            return;
        }
        Matrix matrix0 = new Matrix();
        if(!Float.isNaN(widgetFrame0.rotationZ)) {
            matrix0.preRotate(widgetFrame0.rotationZ, widgetFrame0.centerX(), widgetFrame0.centerY());
        }
        float f = 1.0f;
        float f1 = Float.isNaN(widgetFrame0.scaleX) ? 1.0f : widgetFrame0.scaleX;
        if(!Float.isNaN(widgetFrame0.scaleY)) {
            f = widgetFrame0.scaleY;
        }
        matrix0.preScale(f1, f, widgetFrame0.centerX(), widgetFrame0.centerY());
        float[] arr_f = {((float)widgetFrame0.left), ((float)widgetFrame0.top), ((float)widgetFrame0.right), ((float)widgetFrame0.top), ((float)widgetFrame0.right), ((float)widgetFrame0.bottom), ((float)widgetFrame0.left), ((float)widgetFrame0.bottom)};
        matrix0.mapPoints(arr_f);
        DrawScope.drawLine-NGM6Ib0$default(drawScope0, v, OffsetKt.Offset(arr_f[0], arr_f[1]), OffsetKt.Offset(arr_f[2], arr_f[3]), 3.0f, 0, pathEffect0, 0.0f, null, 0, 0x1D0, null);
        DrawScope.drawLine-NGM6Ib0$default(drawScope0, v, OffsetKt.Offset(arr_f[2], arr_f[3]), OffsetKt.Offset(arr_f[4], arr_f[5]), 3.0f, 0, pathEffect0, 0.0f, null, 0, 0x1D0, null);
        DrawScope.drawLine-NGM6Ib0$default(drawScope0, v, OffsetKt.Offset(arr_f[4], arr_f[5]), OffsetKt.Offset(arr_f[6], arr_f[7]), 3.0f, 0, pathEffect0, 0.0f, null, 0, 0x1D0, null);
        DrawScope.drawLine-NGM6Ib0$default(drawScope0, v, OffsetKt.Offset(arr_f[6], arr_f[7]), OffsetKt.Offset(arr_f[0], arr_f[1]), 3.0f, 0, pathEffect0, 0.0f, null, 0, 0x1D0, null);
    }

    @Composable
    public final void drawDebug(@NotNull BoxScope boxScope0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(boxScope0, "<this>");
        Composer composer1 = composer0.startRestartGroup(0x1A0B37FF);
        CanvasKt.Canvas(boxScope0.matchParentSize(Modifier.Companion), new g1(this, 12), composer1, 0);
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(this, boxScope0, v, 6));
        }
    }

    public final void e(int v, ConstraintSet constraintSet0, List list0, long v1) {
        this.getState().reset();
        constraintSet0.applyTo(this.getState(), list0);
        this.getState().apply(this.getRoot());
        ArrayList arrayList0 = this.getRoot().getChildren();
        Intrinsics.checkNotNullExpressionValue(arrayList0, "root.children");
        int v2 = arrayList0.size();
        if(v2 - 1 >= 0) {
            for(int v3 = 0; true; ++v3) {
                ((ConstraintWidget)arrayList0.get(v3)).setAnimated(true);
                if(v3 + 1 > v2 - 1) {
                    break;
                }
            }
        }
        this.applyRootSize-BRTryo0(v1);
        this.getRoot().updateHierarchy();
        ArrayList arrayList1 = this.getRoot().getChildren();
        Intrinsics.checkNotNullExpressionValue(arrayList1, "root.children");
        for(Object object0: arrayList1) {
            Object object1 = ((ConstraintWidget)object0).getCompanionWidget();
            Measurable measurable0 = object1 instanceof Measurable ? ((Measurable)object1) : null;
            Object object2 = measurable0 == null ? null : LayoutIdKt.getLayoutId(measurable0);
            if(object2 == null) {
                object2 = measurable0 == null ? null : ConstraintLayoutTagKt.getConstraintLayoutId(measurable0);
            }
            ((ConstraintWidget)object0).stringId = object2 == null ? null : object2.toString();
        }
        this.getRoot().setOptimizationLevel(v);
        this.getRoot().measure(0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    public final void encodeRoot(@NotNull StringBuilder stringBuilder0) {
        Intrinsics.checkNotNullParameter(stringBuilder0, "json");
        stringBuilder0.append("  root: {");
        stringBuilder0.append("interpolated: { left:  0,");
        stringBuilder0.append("  top:  0,");
        stringBuilder0.append("  right:   " + this.getRoot().getWidth() + " ,");
        stringBuilder0.append("  bottom:  " + this.getRoot().getHeight() + " ,");
        stringBuilder0.append(" } }");
    }

    public final long getCustomColor-WaAFU9c(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "id");
        Intrinsics.checkNotNullParameter(s1, "name");
        Transition transition0 = this.o;
        if(!transition0.contains(s)) {
            return Color.Companion.getBlack-0d7_KjU();
        }
        transition0.interpolate(this.getRoot().getWidth(), this.getRoot().getHeight(), this.n);
        return ColorKt.Color(transition0.getInterpolated(s).getCustomColor(s1));
    }

    public final float getCustomFloat(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "id");
        Intrinsics.checkNotNullParameter(s1, "name");
        Transition transition0 = this.o;
        if(!transition0.contains(s)) {
            return 0.0f;
        }
        WidgetFrame widgetFrame0 = transition0.getStart(s);
        WidgetFrame widgetFrame1 = transition0.getEnd(s);
        float f = widgetFrame0.getCustomFloat(s1);
        float f1 = widgetFrame1.getCustomFloat(s1);
        return this.n * f1 + (1.0f - this.n) * f;
    }

    public final float getProgress() {
        return this.n;
    }

    @NotNull
    public final Transition getTransition() {
        return this.o;
    }

    public final void initWith(@NotNull ConstraintSet constraintSet0, @NotNull ConstraintSet constraintSet1, @Nullable androidx.constraintlayout.compose.Transition transition0, float f) {
        Intrinsics.checkNotNullParameter(constraintSet0, "start");
        Intrinsics.checkNotNullParameter(constraintSet1, "end");
        this.clearConstraintSets();
        Transition transition1 = this.o;
        constraintSet0.applyTo(transition1, 0);
        constraintSet1.applyTo(transition1, 1);
        transition1.interpolate(0, 0, f);
        if(transition0 != null) {
            transition0.applyTo(transition1, 0);
        }
    }

    public final long performInterpolationMeasure-OQbXsTc(long v, @NotNull LayoutDirection layoutDirection0, @NotNull ConstraintSet constraintSet0, @NotNull ConstraintSet constraintSet1, @Nullable androidx.constraintlayout.compose.Transition transition0, @NotNull List list0, int v1, float f, @NotNull MeasureScope measureScope0) {
        int v4;
        boolean z;
        Intrinsics.checkNotNullParameter(layoutDirection0, "layoutDirection");
        Intrinsics.checkNotNullParameter(constraintSet0, "constraintSetStart");
        Intrinsics.checkNotNullParameter(constraintSet1, "constraintSetEnd");
        Intrinsics.checkNotNullParameter(list0, "measurables");
        Intrinsics.checkNotNullParameter(measureScope0, "measureScope");
        this.setDensity(measureScope0);
        this.setMeasureScope(measureScope0);
        Transition transition1 = this.o;
        if(!transition1.isEmpty() && !this.getFrameCache().isEmpty() && (!Constraints.getHasFixedHeight-impl(v) || this.getState().sameFixedHeight(Constraints.getMaxHeight-impl(v))) && (!Constraints.getHasFixedWidth-impl(v) || this.getState().sameFixedWidth(Constraints.getMaxWidth-impl(v)))) {
            ArrayList arrayList0 = this.getRoot().getChildren();
            Intrinsics.checkNotNullExpressionValue(arrayList0, "root.children");
            int v2 = arrayList0.size();
            if(v2 - 1 >= 0) {
                int v3 = 0;
                while(true) {
                    ConstraintWidget constraintWidget0 = (ConstraintWidget)arrayList0.get(v3);
                    Object object0 = constraintWidget0.getCompanionWidget();
                    Measurable measurable0 = object0 instanceof Measurable ? ((Measurable)object0) : null;
                    if(measurable0 != null) {
                        WidgetFrame widgetFrame0 = this.getTransition().getInterpolated(constraintWidget0);
                        if(widgetFrame0 != null) {
                            Placeable placeable0 = (Placeable)this.getPlaceables().get(measurable0);
                            if(placeable0 != null && (placeable0.getWidth() != widgetFrame0.width() || placeable0.getHeight() != widgetFrame0.height())) {
                                z = true;
                                goto label_30;
                            }
                        }
                    }
                    if(v3 + 1 > v2 - 1) {
                        break;
                    }
                    ++v3;
                }
            }
            z = false;
        }
        else {
            z = true;
        }
    label_30:
        if(this.n == f) {
            LayoutInformationReceiver layoutInformationReceiver0 = this.getLayoutInformationReceiver();
            Integer integer0 = layoutInformationReceiver0 == null ? null : layoutInformationReceiver0.getForcedWidth();
            if(integer0 != null && ((int)integer0) == 0x80000000) {
            label_37:
                if(z) {
                    goto label_38;
                }
            }
            else {
                LayoutInformationReceiver layoutInformationReceiver1 = this.getLayoutInformationReceiver();
                Integer integer1 = layoutInformationReceiver1 == null ? null : layoutInformationReceiver1.getForcedHeight();
                if(integer1 == null || ((int)integer1) != 0x80000000) {
                    goto label_38;
                }
                else {
                    goto label_37;
                }
            }
        }
        else {
        label_38:
            this.n = f;
            if(z) {
                transition1.clear();
                this.resetMeasureState$compose_release();
                this.getState().reset();
                this.getState().width((Constraints.getHasFixedWidth-impl(v) ? Dimension.Fixed(Constraints.getMaxWidth-impl(v)) : Dimension.Wrap().min(Constraints.getMinWidth-impl(v))));
                this.getState().height((Constraints.getHasFixedHeight-impl(v) ? Dimension.Fixed(Constraints.getMaxHeight-impl(v)) : Dimension.Wrap().min(Constraints.getMinHeight-impl(v))));
                this.getState().setRootIncomingConstraints-BRTryo0(v);
                this.getState().setLayoutDirection(layoutDirection0);
                this.e(v1, constraintSet0, list0, v);
                v4 = 0;
                transition1.updateFrom(this.getRoot(), 0);
                this.e(v1, constraintSet1, list0, v);
                transition1.updateFrom(this.getRoot(), 1);
                if(transition0 != null) {
                    transition0.applyTo(transition1, 0);
                }
            }
            else {
                v4 = 0;
            }
            transition1.interpolate(this.getRoot().getWidth(), this.getRoot().getHeight(), f);
            ArrayList arrayList1 = this.getRoot().getChildren();
            Intrinsics.checkNotNullExpressionValue(arrayList1, "root.children");
            int v5 = arrayList1.size();
            if(v5 - 1 >= 0) {
                while(true) {
                    ConstraintWidget constraintWidget1 = (ConstraintWidget)arrayList1.get(v4);
                    Object object1 = constraintWidget1.getCompanionWidget();
                    Measurable measurable1 = object1 instanceof Measurable ? ((Measurable)object1) : null;
                    if(measurable1 != null) {
                        WidgetFrame widgetFrame1 = this.getTransition().getInterpolated(constraintWidget1);
                        if(widgetFrame1 != null) {
                            Placeable placeable1 = (Placeable)this.getPlaceables().get(measurable1);
                            Integer integer2 = placeable1 == null ? null : placeable1.getWidth();
                            Integer integer3 = placeable1 == null ? null : placeable1.getHeight();
                            if(placeable1 == null || (integer2 == null || ((int)integer2) != widgetFrame1.width()) || (integer3 == null || ((int)integer3) != widgetFrame1.height())) {
                                this.getPlaceables().put(measurable1, measurable1.measure-BRTryo0(Constraints.Companion.fixed-JhjzzOo(widgetFrame1.width(), widgetFrame1.height())));
                            }
                            this.getFrameCache().put(measurable1, widgetFrame1);
                        }
                    }
                    if(v4 + 1 > v5 - 1) {
                        break;
                    }
                    ++v4;
                }
            }
            LayoutInformationReceiver layoutInformationReceiver2 = this.getLayoutInformationReceiver();
            if((layoutInformationReceiver2 == null ? null : layoutInformationReceiver2.getLayoutInformationMode()) == LayoutInfoFlags.BOUNDS) {
                this.computeLayoutResult();
            }
        }
        return IntSizeKt.IntSize(this.getRoot().getWidth(), this.getRoot().getHeight());
    }
}

