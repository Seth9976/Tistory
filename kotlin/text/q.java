package kotlin.text;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.text.TextStyle;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public abstract class q {
    public static int A(Placeable placeable0, int v, int v1) {
        return (v - placeable0.getHeight()) / v1;
    }

    public static PathBuilder B(float f, float f1, float f2, float f3) {
        PathBuilder pathBuilder0 = new PathBuilder();
        pathBuilder0.moveTo(f, f1);
        pathBuilder0.lineTo(f2, f3);
        return pathBuilder0;
    }

    public static List C(PathBuilder pathBuilder0, float f, float f1, float f2, float f3) {
        pathBuilder0.lineTo(f, f1);
        pathBuilder0.lineTo(f2, f3);
        pathBuilder0.close();
        return pathBuilder0.getNodes();
    }

    public static float a(float f, float f1, float f2, float f3) [...] // Inlined contents

    public static int b(int v, int v1, TextStyle textStyle0) {
        return (textStyle0.hashCode() + v) * v1;
    }

    public static int c(int v, int v1, String s) {
        return (s.hashCode() + v) * v1;
    }

    public static int d(Placeable placeable0, int v, int v1) {
        return (v - placeable0.getWidth()) / v1;
    }

    public static int e(LayoutNode layoutNode0) {
        return layoutNode0.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release();
    }

    public static long f(long v, long v1) {
        return v * v1;
    }

    public static PathBuilder g(float f, float f1, float f2, float f3) {
        PathBuilder pathBuilder0 = new PathBuilder();
        pathBuilder0.moveTo(f, f1);
        pathBuilder0.lineToRelative(f2, f3);
        return pathBuilder0;
    }

    public static Object h(int v, Composer composer0, int v1) {
        composer0.startReplaceableGroup(v);
        composer0.startReplaceableGroup(v1);
        return composer0.rememberedValue();
    }

    public static Object i(Bundle bundle0, String s, String s1, String s2, String s3) {
        Intrinsics.checkNotNullParameter(bundle0, s);
        Intrinsics.checkNotNullParameter(s1, s2);
        return bundle0.get(s3);
    }

    public static Object j(MutableVector mutableVector0, int v) {
        return mutableVector0.removeAt(mutableVector0.getSize() - v);
    }

    public static Object k(CharSequence charSequence0, int v, Function1 function10) {
        return function10.invoke(Character.valueOf(charSequence0.charAt(v)));
    }

    public static String l(char c, String s, StringBuilder stringBuilder0) {
        stringBuilder0.append(c);
        String s1 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s1, s);
        return s1;
    }

    public static String m(int v, String s, String s1) [...] // Inlined contents

    public static String n(long v, String s) {
        return s + v;
    }

    public static String o(String s, int v, String s1, int v1, String s2) [...] // Inlined contents

    public static String p(String s, List list0, String s1) [...] // Inlined contents

    public static String q(StringBuilder stringBuilder0, Function0 function00, String s) {
        stringBuilder0.append(function00);
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }

    public static StringBuilder r(CharSequence charSequence0, String s, CharSequence charSequence1, String s1, CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence0, s);
        Intrinsics.checkNotNullParameter(charSequence1, s1);
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(charSequence2);
        return stringBuilder0;
    }

    public static StringBuilder s(CharSequence charSequence0, String s, Function1 function10, String s1, CharSequence charSequence1) {
        Intrinsics.checkNotNullParameter(charSequence0, s);
        Intrinsics.checkNotNullParameter(function10, s1);
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(charSequence1);
        return stringBuilder0;
    }

    public static StringBuilder t(CharSequence charSequence0, String s, Function2 function20, String s1, CharSequence charSequence1) {
        Intrinsics.checkNotNullParameter(charSequence0, s);
        Intrinsics.checkNotNullParameter(function20, s1);
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(charSequence1);
        return stringBuilder0;
    }

    public static StringBuilder u(String s, int v, String s1, int v1, String s2) {
        StringBuilder stringBuilder0 = new StringBuilder(s);
        stringBuilder0.append(v);
        stringBuilder0.append(s1);
        stringBuilder0.append(v1);
        stringBuilder0.append(s2);
        return stringBuilder0;
    }

    public static List v(PathBuilder pathBuilder0, float f, float f1, float f2, float f3) {
        pathBuilder0.lineToRelative(f, f1);
        pathBuilder0.lineToRelative(f2, f3);
        pathBuilder0.close();
        return pathBuilder0.getNodes();
    }

    public static void w(int v, int v1, Function1 function10) {
        function10.invoke(((int)(v + v1)));
    }

    public static void x(PathBuilder pathBuilder0, float f, float f1, float f2) {
        pathBuilder0.lineTo(f, f1);
        pathBuilder0.verticalLineToRelative(f2);
        pathBuilder0.close();
    }

    public static void y(PathBuilder pathBuilder0, float f, float f1, float f2, float f3) {
        pathBuilder0.moveTo(f, f1);
        pathBuilder0.horizontalLineToRelative(f2);
        pathBuilder0.verticalLineToRelative(f3);
    }

    public static float z(float f, float f1, float f2, float f3) [...] // Inlined contents
}

