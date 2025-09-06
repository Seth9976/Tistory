package wb;

import android.os.Parcel;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.ui.graphics.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;

public abstract class a {
    public static int a(long v, int v1, int v2) {
        return (Color.hashCode-impl(v) + v1) * v2;
    }

    public static String b(char c, String s, StringBuilder stringBuilder0) {
        stringBuilder0.append(s);
        stringBuilder0.append(c);
        return stringBuilder0.toString();
    }

    public static String c(int v, String s, StringBuilder stringBuilder0) {
        stringBuilder0.append(v);
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }

    public static String d(String s, String s1, String s2) [...] // Inlined contents

    public static String e(StringBuilder stringBuilder0, List list0, String s) {
        stringBuilder0.append(list0);
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }

    public static StringBuilder f(String s, String s1) {
        Intrinsics.checkNotNullExpressionValue(s, s1);
        return new StringBuilder();
    }

    public static ArrayList g(Map map0, Object object0) {
        ArrayList arrayList0 = new ArrayList();
        map0.put(object0, arrayList0);
        return arrayList0;
    }

    public static KotlinNothingValueException h() {
        FlowKt.noImpl();
        return new KotlinNothingValueException();
    }

    public static void i(Parcel parcel0, int v, Boolean boolean0) {
        parcel0.writeInt(v);
        parcel0.writeInt(((int)boolean0.booleanValue()));
    }

    public static void j(StringBuilder stringBuilder0, int v, String s, String s1, String s2) {
        stringBuilder0.append(v);
        stringBuilder0.append(s);
        stringBuilder0.append(s1);
        stringBuilder0.append(s2);
    }

    public static int k(long v, int v1, int v2) {
        return (Long.hashCode(v) + v1) * v2;
    }

    public static void l(StringBuilder stringBuilder0, int v, String s, String s1, String s2) {
        stringBuilder0.append(v);
        stringBuilder0.append(s);
        stringBuilder0.append(s1);
        stringBuilder0.append(s2);
        PreconditionsKt.throwIllegalStateException(stringBuilder0.toString());
    }
}

