package wd;

import java.io.File;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.io.FilePathComponents;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

public abstract class h {
    public static final int a(String s) {
        int v = File.separatorChar;
        int v1 = StringsKt__StringsKt.indexOf$default(s, ((char)v), 0, false, 4, null);
        if(v1 == 0) {
            if(s.length() > 1 && s.charAt(1) == v) {
                int v2 = StringsKt__StringsKt.indexOf$default(s, ((char)v), 2, false, 4, null);
                if(v2 >= 0) {
                    int v3 = StringsKt__StringsKt.indexOf$default(s, ((char)v), v2 + 1, false, 4, null);
                    return v3 < 0 ? s.length() : v3 + 1;
                }
            }
            return 1;
        }
        if(v1 > 0 && s.charAt(v1 - 1) == 58) {
            return v1 + 1;
        }
        return v1 != -1 || !StringsKt__StringsKt.endsWith$default(s, ':', false, 2, null) ? 0 : s.length();
    }

    @NotNull
    public static final File getRoot(@NotNull File file0) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        return new File(h.getRootName(file0));
    }

    @NotNull
    public static final String getRootName(@NotNull File file0) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        String s = file0.getPath();
        Intrinsics.checkNotNullExpressionValue(s, "getPath(...)");
        String s1 = file0.getPath();
        Intrinsics.checkNotNullExpressionValue(s1, "getPath(...)");
        String s2 = s.substring(0, h.a(s1));
        Intrinsics.checkNotNullExpressionValue(s2, "substring(...)");
        return s2;
    }

    public static final boolean isRooted(@NotNull File file0) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        String s = file0.getPath();
        Intrinsics.checkNotNullExpressionValue(s, "getPath(...)");
        return h.a(s) > 0;
    }

    @NotNull
    public static final File subPath(@NotNull File file0, int v, int v1) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        return h.toComponents(file0).subPath(v, v1);
    }

    @NotNull
    public static final FilePathComponents toComponents(@NotNull File file0) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        String s = file0.getPath();
        Intrinsics.checkNotNull(s);
        int v = h.a(s);
        String s1 = s.substring(0, v);
        Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
        String s2 = s.substring(v);
        Intrinsics.checkNotNullExpressionValue(s2, "substring(...)");
        if(s2.length() == 0) {
            return new FilePathComponents(new File(s1), CollectionsKt__CollectionsKt.emptyList());
        }
        Iterable iterable0 = StringsKt__StringsKt.split$default(s2, new char[]{File.separatorChar}, false, 0, 6, null);
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(new File(((String)object0)));
        }
        return new FilePathComponents(new File(s1), arrayList0);
    }
}

