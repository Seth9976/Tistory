package a5;

import android.graphics.Canvas;
import android.net.Uri;
import androidx.compose.runtime.Composer;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

public abstract class b {
    public static float a(float f, float f1, float f2, float f3) [...] // Inlined contents

    public static int b(int v, int v1, int v2, int v3) {
        return CodedOutputStream.computeUInt32SizeNoTag(v) + v1 + v2 + v3;
    }

    public static int c(List list0, int v, int v1) {
        return (list0.hashCode() + v) * v1;
    }

    public static Object d(Retrofit retrofit0, String s, Class class0, String s1) {
        Intrinsics.checkNotNullParameter(retrofit0, s);
        Object object0 = retrofit0.create(class0);
        Intrinsics.checkNotNullExpressionValue(object0, s1);
        return object0;
    }

    public static String e(int v, String s) [...] // Inlined contents

    public static String f(int v, String s, String s1, Object[] arr_object) {
        String s2 = String.format(s, Arrays.copyOf(arr_object, v));
        Intrinsics.checkNotNullExpressionValue(s2, s1);
        return s2;
    }

    public static String g(long v, String s, StringBuilder stringBuilder0) {
        stringBuilder0.append(v);
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }

    public static String h(RecyclerView recyclerView0, StringBuilder stringBuilder0) {
        stringBuilder0.append(recyclerView0.exceptionLabel());
        return stringBuilder0.toString();
    }

    public static String i(Object object0, String s) [...] // Inlined contents

    public static String j(String s, char c, String s1) [...] // Inlined contents

    public static String k(String s, Uri uri0) [...] // Inlined contents

    public static String l(String s, Fragment fragment0, String s1) [...] // Inlined contents

    public static String m(String s, String s1, String s2) [...] // Inlined contents

    public static String n(String s, String s1, String s2, String s3) [...] // Inlined contents

    public static String o(String s, String s1, String s2, String s3, String s4) [...] // Inlined contents

    public static String p(StringBuilder stringBuilder0, int v, char c) {
        stringBuilder0.append(v);
        stringBuilder0.append(c);
        return stringBuilder0.toString();
    }

    public static String q(StringBuilder stringBuilder0, String s, String s1, String s2) [...] // 潜在的解密器

    public static String r(StringBuilder stringBuilder0, String s, String s1, String s2, String s3) {
        stringBuilder0.append(s);
        stringBuilder0.append(s1);
        stringBuilder0.append(s2);
        stringBuilder0.append(s3);
        return stringBuilder0.toString();
    }

    public static StringBuilder s(int v, String s, String s1) {
        StringBuilder stringBuilder0 = new StringBuilder(s);
        stringBuilder0.append(v);
        stringBuilder0.append(s1);
        return stringBuilder0;
    }

    public static StringBuilder t(String s) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(s);
        return stringBuilder0;
    }

    public static StringBuilder u(String s, String s1) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(s);
        stringBuilder0.append(s1);
        return stringBuilder0;
    }

    public static StringBuilder v(String s, String s1, String s2) {
        StringBuilder stringBuilder0 = new StringBuilder(s);
        stringBuilder0.append(s1);
        stringBuilder0.append(s2);
        return stringBuilder0;
    }

    public static StringBuilder w(String s, String s1, String s2, String s3, String s4) {
        StringBuilder stringBuilder0 = new StringBuilder(s);
        stringBuilder0.append(s1);
        stringBuilder0.append(s2);
        stringBuilder0.append(s3);
        stringBuilder0.append(s4);
        return stringBuilder0;
    }

    public static void x(int v, Canvas canvas0, int v1, int v2) {
        canvas0.restoreToCount(v1);
    }

    public static void y(Composer composer0, int v, Function2 function20) {
        function20.invoke(composer0, v);
        composer0.endNode();
    }

    public static void z(Object object0) {
        if(object0 != null) {
            throw new ClassCastException();
        }
    }
}

