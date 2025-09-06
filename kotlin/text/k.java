package kotlin.text;

import androidx.compose.material3.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;

public abstract class k extends i {
    @NotNull
    public static final String prependIndent(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "indent");
        return SequencesKt___SequencesKt.joinToString$default(SequencesKt___SequencesKt.map(StringsKt__StringsKt.lineSequence(s), new m(s1, 13)), "\n", null, null, 0, null, null, 62, null);
    }

    public static String prependIndent$default(String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s1 = "    ";
        }
        return k.prependIndent(s, s1);
    }

    @NotNull
    public static final String replaceIndent(@NotNull String s, @NotNull String s1) {
        int v;
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "newIndent");
        List list0 = StringsKt__StringsKt.lines(s);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            if(!p.isBlank(((String)object0))) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(arrayList0, 10));
        Iterator iterator1 = arrayList0.iterator();
        while(true) {
            v = 0;
            if(!iterator1.hasNext()) {
                break;
            }
            Object object1 = iterator1.next();
            String s2 = (String)object1;
            int v1 = s2.length();
            while(true) {
                if(v < v1) {
                    if(b.isWhitespace(s2.charAt(v))) {
                        ++v;
                        continue;
                    }
                    else {
                        break;
                    }
                }
                v = -1;
                break;
            }
            if(v == -1) {
                v = s2.length();
            }
            arrayList1.add(v);
        }
        Integer integer0 = (Integer)CollectionsKt___CollectionsKt.minOrNull(arrayList1);
        int v2 = integer0 == null ? 0 : ((int)integer0);
        int v3 = s.length();
        int v4 = s1.length();
        int v5 = list0.size();
        j j0 = s1.length() == 0 ? j.x : new m(s1, 12);
        int v6 = CollectionsKt__CollectionsKt.getLastIndex(list0);
        ArrayList arrayList2 = new ArrayList();
        for(Object object2: list0) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String s3 = (String)object2;
            if(v != 0 && v != v6 || !p.isBlank(s3)) {
                String s4 = StringsKt___StringsKt.drop(s3, v2);
                if(s4 != null) {
                    String s5 = (String)j0.invoke(s4);
                    if(s5 != null) {
                        s3 = s5;
                    }
                }
            }
            else {
                s3 = null;
            }
            if(s3 != null) {
                arrayList2.add(s3);
            }
            ++v;
        }
        String s6 = ((StringBuilder)CollectionsKt___CollectionsKt.joinTo$default(arrayList2, new StringBuilder(v5 * v4 + v3), "\n", null, null, 0, null, null, 0x7C, null)).toString();
        Intrinsics.checkNotNullExpressionValue(s6, "toString(...)");
        return s6;
    }

    public static String replaceIndent$default(String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s1 = "";
        }
        return k.replaceIndent(s, s1);
    }

    @NotNull
    public static final String replaceIndentByMargin(@NotNull String s, @NotNull String s1, @NotNull String s2) {
        int v7;
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "newIndent");
        Intrinsics.checkNotNullParameter(s2, "marginPrefix");
        if(p.isBlank(s2)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List list0 = StringsKt__StringsKt.lines(s);
        int v = s.length();
        int v1 = s1.length();
        int v2 = list0.size();
        j j0 = s1.length() == 0 ? j.x : new m(s1, 12);
        int v3 = CollectionsKt__CollectionsKt.getLastIndex(list0);
        ArrayList arrayList0 = new ArrayList();
        int v4 = 0;
        for(Object object0: list0) {
            if(v4 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String s3 = (String)object0;
            String s4 = null;
            if(v4 != 0 && v4 != v3 || !p.isBlank(s3)) {
                int v5 = s3.length();
                int v6 = 0;
                while(true) {
                    v7 = -1;
                    if(v6 < v5) {
                        if(b.isWhitespace(s3.charAt(v6))) {
                            ++v6;
                            continue;
                        }
                        else {
                            v7 = v6;
                        }
                    }
                    break;
                }
                if(v7 != -1 && p.startsWith$default(s3, s2, v7, false, 4, null)) {
                    Intrinsics.checkNotNull(s3, "null cannot be cast to non-null type java.lang.String");
                    s4 = s3.substring(s2.length() + v7);
                    Intrinsics.checkNotNullExpressionValue(s4, "substring(...)");
                }
                if(s4 != null) {
                    String s5 = (String)j0.invoke(s4);
                    if(s5 != null) {
                        s3 = s5;
                    }
                }
            }
            else {
                s3 = null;
            }
            if(s3 != null) {
                arrayList0.add(s3);
            }
            ++v4;
        }
        String s6 = ((StringBuilder)CollectionsKt___CollectionsKt.joinTo$default(arrayList0, new StringBuilder(v2 * v1 + v), "\n", null, null, 0, null, null, 0x7C, null)).toString();
        Intrinsics.checkNotNullExpressionValue(s6, "toString(...)");
        return s6;
    }

    public static String replaceIndentByMargin$default(String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s1 = "";
        }
        if((v & 2) != 0) {
            s2 = "|";
        }
        return k.replaceIndentByMargin(s, s1, s2);
    }

    @IntrinsicConstEvaluation
    @NotNull
    public static String trimIndent(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        return k.replaceIndent(s, "");
    }

    @IntrinsicConstEvaluation
    @NotNull
    public static final String trimMargin(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "marginPrefix");
        return k.replaceIndentByMargin(s, "", s1);
    }

    public static String trimMargin$default(String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s1 = "|";
        }
        return k.trimMargin(s, s1);
    }
}

