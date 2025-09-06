package r0;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import okio.Path;

public abstract class a {
    public static void A(StringBuilder stringBuilder0, int v, String s, int v1, String s1) {
        stringBuilder0.append(v);
        stringBuilder0.append(s);
        stringBuilder0.append(v1);
        stringBuilder0.append(s1);
    }

    public static boolean B(Function2 function20, Composer composer0, Integer integer0) {
        function20.invoke(composer0, integer0);
        composer0.endNode();
        return ComposerKt.isTraceInProgress();
    }

    public static int C(float f, int v, int v1) {
        return (Dp.hashCode-impl(f) + v) * v1;
    }

    public static float a(float f, float f1, float f2, float f3) [...] // Inlined contents

    public static int b(float f, int v, int v1) {
        return (Float.hashCode(f) + v) * v1;
    }

    public static int c(int v, int v1, int v2) {
        return (v + v1) * v2;
    }

    public static int d(int v, int v1, Function1 function10) {
        return (function10.hashCode() + v) * v1;
    }

    public static int e(int v, int v1, boolean z) {
        return (Boolean.hashCode(z) + v) * v1;
    }

    public static int f(Measurable measurable0, long v, ArrayList arrayList0, int v1, int v2) {
        arrayList0.add(measurable0.measure-BRTryo0(v));
        return v1 + v2;
    }

    public static int g(Function0 function00, int v, int v1) {
        return (function00.hashCode() + v) * v1;
    }

    public static PathBuilder h(float f, float f1) {
        PathBuilder pathBuilder0 = new PathBuilder();
        pathBuilder0.moveTo(f, f1);
        return pathBuilder0;
    }

    public static MeasurePolicy i(Companion alignment$Companion0, boolean z, Composer composer0, int v, int v1) {
        MeasurePolicy measurePolicy0 = BoxKt.rememberBoxMeasurePolicy(alignment$Companion0.getTopStart(), z, composer0, v);
        composer0.startReplaceableGroup(v1);
        return measurePolicy0;
    }

    public static ValueElementSequence j(float f, ValueElementSequence valueElementSequence0, String s, InspectorInfo inspectorInfo0) {
        valueElementSequence0.set(s, Dp.box-impl(f));
        return inspectorInfo0.getProperties();
    }

    public static ValueElementSequence k(boolean z, ValueElementSequence valueElementSequence0, String s, InspectorInfo inspectorInfo0) {
        valueElementSequence0.set(s, Boolean.valueOf(z));
        return inspectorInfo0.getProperties();
    }

    public static Integer l(androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0, Composer composer0, Modifier modifier0, int v) {
        Updater.set-impl(composer0, modifier0, composeUiNode$Companion0.getSetModifier());
        return v;
    }

    public static String m(String s, int v, char c) [...] // Inlined contents

    public static String n(StringBuilder stringBuilder0, float f, char c) {
        stringBuilder0.append(f);
        stringBuilder0.append(c);
        return stringBuilder0.toString();
    }

    public static String o(StringBuilder stringBuilder0, String s, String s1) [...] // 潜在的解密器

    public static String p(StringBuilder stringBuilder0, boolean z, char c) {
        stringBuilder0.append(z);
        stringBuilder0.append(c);
        return stringBuilder0.toString();
    }

    public static String q(Path path0, String s) [...] // Inlined contents

    public static Iterator r(ArrayList arrayList0, int v) {
        return c.until(v, arrayList0.size()).iterator();
    }

    public static List s(PathBuilder pathBuilder0, float f, float f1, float f2, float f3) {
        pathBuilder0.reflectiveCurveToRelative(f, f1, f2, f3);
        pathBuilder0.close();
        return pathBuilder0.getNodes();
    }

    public static IntIterator t(int v, int v1) {
        return new IntRange(v, v1).iterator();
    }

    public static void u(float f, String s, StringBuilder stringBuilder0) {
        stringBuilder0.append(Dp.toString-impl(f));
        stringBuilder0.append(s);
    }

    public static void v(int v, DrawContext drawContext0, long v1, int v2) {
        drawContext0.getCanvas().restore();
        drawContext0.setSize-uvyYCjk(v1);
    }

    public static void w(int v, Function3 function30, SkippableUpdater skippableUpdater0, Composer composer0, int v1) {
        function30.invoke(skippableUpdater0, composer0, v);
        composer0.startReplaceableGroup(v1);
    }

    public static void x(long v, String s, StringBuilder stringBuilder0) {
        stringBuilder0.append(Color.toString-impl(v));
        stringBuilder0.append(s);
    }

    public static void y(DrawContext drawContext0, long v) {
        drawContext0.getCanvas().restore();
        drawContext0.setSize-uvyYCjk(v);
    }

    public static void z(androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0, Composer composer0, Modifier modifier0, Composer composer1, int v) {
        Updater.set-impl(composer0, modifier0, composeUiNode$Companion0.getSetModifier());
        composer1.startReplaceGroup(v);
    }
}

