package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.LocaleList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\n\u001A\'\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0000\u00A2\u0006\u0004\b\u0005\u0010\u0006\u001Ah\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0007*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012>\b\u0004\u0010\r\u001A8\u0012\u0013\u0012\u00110\u0000\u00A2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000B\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00010\u0004\u00A2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00028\u00000\bH\u0080\b\u00A2\u0006\u0004\b\u000E\u0010\u000F\u001A\u001B\u0010\u0012\u001A\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0011\u001A\u00020\u0010\u00A2\u0006\u0004\b\u0012\u0010\u0013\u001A\u001B\u0010\u0014\u001A\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0011\u001A\u00020\u0010\u00A2\u0006\u0004\b\u0014\u0010\u0013\u001A\u001B\u0010\u0015\u001A\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0011\u001A\u00020\u0010\u00A2\u0006\u0004\b\u0015\u0010\u0013\u001A\u001B\u0010\u0016\u001A\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0011\u001A\u00020\u0010\u00A2\u0006\u0004\b\u0016\u0010\u0013\u001A?\u0010\u001E\u001A\u00028\u0000\"\b\b\u0000\u0010\u0018*\u00020\u0017*\u00020\u00192\u0006\u0010\u001B\u001A\u00020\u001A2\u0017\u0010\r\u001A\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00028\u00000\u001C\u00A2\u0006\u0002\b\u001DH\u0086\b\u00A2\u0006\u0004\b\u001E\u0010\u001F\u001AA\u0010\u001E\u001A\u00028\u0000\"\b\b\u0000\u0010\u0018*\u00020\u0017*\u00020\u00192\u0006\u0010\u001B\u001A\u00020\u00012\u0019\b\u0004\u0010\r\u001A\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00028\u00000\u001C\u00A2\u0006\u0002\b\u001DH\u0086\b\u00A2\u0006\u0004\b\u001E\u0010 \u001AI\u0010$\u001A\u00028\u0000\"\b\b\u0000\u0010\u0018*\u00020\u0017*\u00020\u00192\u0006\u0010\"\u001A\u00020!2\u0006\u0010#\u001A\u00020!2\u0019\b\u0004\u0010\r\u001A\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00028\u00000\u001C\u00A2\u0006\u0002\b\u001DH\u0087\b\u00A2\u0006\u0004\b$\u0010%\u001AA\u0010$\u001A\u00028\u0000\"\b\b\u0000\u0010\u0018*\u00020\u0017*\u00020\u00192\u0006\u0010\'\u001A\u00020&2\u0019\b\u0004\u0010\r\u001A\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00028\u00000\u001C\u00A2\u0006\u0002\b\u001DH\u0087\b\u00A2\u0006\u0004\b$\u0010(\u001AA\u0010$\u001A\u00028\u0000\"\b\b\u0000\u0010\u0018*\u00020\u0017*\u00020\u00192\u0006\u0010*\u001A\u00020)2\u0019\b\u0004\u0010\r\u001A\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00028\u00000\u001C\u00A2\u0006\u0002\b\u001DH\u0087\b\u00A2\u0006\u0004\b$\u0010+\u001A?\u0010.\u001A\u00028\u0000\"\b\b\u0000\u0010\u0018*\u00020\u0017*\u00020\u00192\u0006\u0010-\u001A\u00020,2\u0017\u0010\r\u001A\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00028\u00000\u001C\u00A2\u0006\u0002\b\u001DH\u0086\b\u00A2\u0006\u0004\b.\u0010/\u001A)\u00102\u001A\u00020\u00002\u0006\u00100\u001A\u00020!2\u0006\u00101\u001A\u00020\u001A2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u0001\u00A2\u0006\u0004\b2\u00103\u001A\u001D\u00102\u001A\u00020\u00002\u0006\u00100\u001A\u00020!2\u0006\u0010\f\u001A\u00020\u0001\u00A2\u0006\u0004\b2\u00104\u001A)\u00107\u001A\u00020\u00002\u0017\u00106\u001A\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u0002050\u001C\u00A2\u0006\u0002\b\u001DH\u0086\b\u00A2\u0006\u0004\b7\u00108\u001A/\u0010?\u001A\u00020>2\u0006\u0010:\u001A\u0002092\u0006\u0010;\u001A\u0002092\u0006\u0010<\u001A\u0002092\u0006\u0010=\u001A\u000209H\u0000\u00A2\u0006\u0004\b?\u0010@\u001A/\u0010E\u001A\u00020>2\u0006\u0010A\u001A\u0002092\u0006\u0010B\u001A\u0002092\u0006\u0010C\u001A\u0002092\u0006\u0010D\u001A\u000209H\u0000\u00A2\u0006\u0004\bE\u0010@\u001A\u000F\u0010F\u001A\u00020\u0000H\u0000\u00A2\u0006\u0004\bF\u0010G\u00A8\u0006H"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/ParagraphStyle;", "defaultParagraphStyle", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "normalizedParagraphStyles", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/ParagraphStyle;)Ljava/util/List;", "T", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "annotatedString", "paragraphStyle", "block", "mapEachParagraphStyle", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/ParagraphStyle;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "toUpperCase", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/intl/LocaleList;)Landroidx/compose/ui/text/AnnotatedString;", "toLowerCase", "capitalize", "decapitalize", "", "R", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "Landroidx/compose/ui/text/SpanStyle;", "style", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "withStyle", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/SpanStyle;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/ParagraphStyle;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "tag", "annotation", "withAnnotation", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Landroidx/compose/ui/text/TtsAnnotation;", "ttsAnnotation", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/TtsAnnotation;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Landroidx/compose/ui/text/UrlAnnotation;", "urlAnnotation", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/UrlAnnotation;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Landroidx/compose/ui/text/LinkAnnotation;", "link", "withLink", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/LinkAnnotation;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "text", "spanStyle", "AnnotatedString", "(Ljava/lang/String;Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/ParagraphStyle;)Landroidx/compose/ui/text/AnnotatedString;", "(Ljava/lang/String;Landroidx/compose/ui/text/ParagraphStyle;)Landroidx/compose/ui/text/AnnotatedString;", "", "builder", "buildAnnotatedString", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/AnnotatedString;", "", "baseStart", "baseEnd", "targetStart", "targetEnd", "", "contains", "(IIII)Z", "lStart", "lEnd", "rStart", "rEnd", "intersect", "emptyAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1269:1\n33#2,6:1270\n235#2,3:1276\n33#2,4:1279\n238#2,2:1283\n38#2:1285\n240#2:1286\n151#2,3:1287\n33#2,4:1290\n154#2,2:1294\n38#2:1296\n156#2:1297\n235#2,3:1298\n33#2,4:1301\n238#2,2:1305\n38#2:1307\n240#2:1308\n151#2,3:1309\n33#2,4:1312\n154#2,2:1316\n38#2:1318\n156#2:1319\n235#2,3:1320\n33#2,4:1323\n238#2,2:1327\n38#2:1329\n240#2:1330\n151#2,3:1331\n33#2,4:1334\n154#2,2:1338\n38#2:1340\n156#2:1341\n151#2,3:1342\n33#2,4:1345\n154#2,2:1349\n38#2:1351\n156#2:1352\n235#2,3:1354\n33#2,4:1357\n238#2,2:1361\n38#2:1363\n240#2:1364\n151#2,3:1365\n33#2,4:1368\n154#2,2:1372\n38#2:1374\n156#2:1375\n1#3:1353\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n788#1:1270,6\n824#1:1276,3\n824#1:1279,4\n824#1:1283,2\n824#1:1285\n824#1:1286\n825#1:1287,3\n825#1:1290,4\n825#1:1294,2\n825#1:1296\n825#1:1297\n851#1:1298,3\n851#1:1301,4\n851#1:1305,2\n851#1:1307\n851#1:1308\n852#1:1309,3\n852#1:1312,4\n852#1:1316,2\n852#1:1318\n852#1:1319\n878#1:1320,3\n878#1:1323,4\n878#1:1327,2\n878#1:1329\n878#1:1330\n879#1:1331,3\n879#1:1334,4\n879#1:1338,2\n879#1:1340\n879#1:1341\n915#1:1342,3\n915#1:1345,4\n915#1:1349,2\n915#1:1351\n915#1:1352\n1191#1:1354,3\n1191#1:1357,4\n1191#1:1361,2\n1191#1:1363\n1191#1:1364\n1191#1:1365,3\n1191#1:1368,4\n1191#1:1372,2\n1191#1:1374\n1191#1:1375\n*E\n"})
public final class AnnotatedStringKt {
    public static final AnnotatedString a;

    static {
        AnnotatedStringKt.a = new AnnotatedString("", null, null, 6, null);
    }

    @NotNull
    public static final AnnotatedString AnnotatedString(@NotNull String s, @NotNull ParagraphStyle paragraphStyle0) {
        return new AnnotatedString(s, CollectionsKt__CollectionsKt.emptyList(), k.listOf(new Range(paragraphStyle0, 0, s.length())));
    }

    @NotNull
    public static final AnnotatedString AnnotatedString(@NotNull String s, @NotNull SpanStyle spanStyle0, @Nullable ParagraphStyle paragraphStyle0) {
        List list0 = k.listOf(new Range(spanStyle0, 0, s.length()));
        return paragraphStyle0 == null ? new AnnotatedString(s, list0, CollectionsKt__CollectionsKt.emptyList()) : new AnnotatedString(s, list0, k.listOf(new Range(paragraphStyle0, 0, s.length())));
    }

    public static AnnotatedString AnnotatedString$default(String s, SpanStyle spanStyle0, ParagraphStyle paragraphStyle0, int v, Object object0) {
        if((v & 4) != 0) {
            paragraphStyle0 = null;
        }
        return AnnotatedStringKt.AnnotatedString(s, spanStyle0, paragraphStyle0);
    }

    public static final List a(AnnotatedString annotatedString0, int v, int v1) {
        if(v == v1) {
            return null;
        }
        List list0 = annotatedString0.getSpanStylesOrNull$ui_text_release();
        if(list0 == null) {
            return null;
        }
        if(v == 0 && v1 >= annotatedString0.getText().length()) {
            return list0;
        }
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v2 = list0.size();
        for(int v4 = 0; v4 < v2; ++v4) {
            Object object0 = list0.get(v4);
            if(AnnotatedStringKt.intersect(v, v1, ((Range)object0).getStart(), ((Range)object0).getEnd())) {
                arrayList0.add(object0);
            }
        }
        List list1 = new ArrayList(arrayList0.size());
        int v5 = arrayList0.size();
        for(int v3 = 0; v3 < v5; ++v3) {
            Range annotatedString$Range0 = (Range)arrayList0.get(v3);
            list1.add(new Range(annotatedString$Range0.getItem(), c.coerceIn(annotatedString$Range0.getStart(), v, v1) - v, c.coerceIn(annotatedString$Range0.getEnd(), v, v1) - v));
        }
        return list1;
    }

    public static final List access$filterRanges(List list0, int v, int v1) {
        if(v > v1) {
            throw new IllegalArgumentException(("start (" + v + ") should be less than or equal to end (" + v1 + ')').toString());
        }
        if(list0 != null) {
            ArrayList arrayList0 = new ArrayList(list0.size());
            int v2 = list0.size();
            for(int v4 = 0; v4 < v2; ++v4) {
                Object object0 = list0.get(v4);
                if(AnnotatedStringKt.intersect(v, v1, ((Range)object0).getStart(), ((Range)object0).getEnd())) {
                    arrayList0.add(object0);
                }
            }
            ArrayList arrayList1 = new ArrayList(arrayList0.size());
            int v5 = arrayList0.size();
            for(int v3 = 0; v3 < v5; ++v3) {
                Range annotatedString$Range0 = (Range)arrayList0.get(v3);
                arrayList1.add(new Range(annotatedString$Range0.getItem(), Math.max(v, annotatedString$Range0.getStart()) - v, Math.min(v1, annotatedString$Range0.getEnd()) - v, annotatedString$Range0.getTag()));
            }
            if(!arrayList1.isEmpty()) {
                return arrayList1;
            }
        }
        return null;
    }

    public static final List access$getLocalAnnotations(AnnotatedString annotatedString0, int v, int v1) {
        List list0 = null;
        if(v != v1) {
            List list1 = annotatedString0.getAnnotations$ui_text_release();
            if(list1 != null) {
                if(v == 0 && v1 >= annotatedString0.getText().length()) {
                    return list1;
                }
                ArrayList arrayList0 = new ArrayList(list1.size());
                int v2 = list1.size();
                for(int v4 = 0; v4 < v2; ++v4) {
                    Object object0 = list1.get(v4);
                    if(AnnotatedStringKt.intersect(v, v1, ((Range)object0).getStart(), ((Range)object0).getEnd())) {
                        arrayList0.add(object0);
                    }
                }
                list0 = new ArrayList(arrayList0.size());
                int v5 = arrayList0.size();
                for(int v3 = 0; v3 < v5; ++v3) {
                    Range annotatedString$Range0 = (Range)arrayList0.get(v3);
                    ((ArrayList)list0).add(new Range(annotatedString$Range0.getItem(), c.coerceIn(annotatedString$Range0.getStart(), v, v1) - v, c.coerceIn(annotatedString$Range0.getEnd(), v, v1) - v, annotatedString$Range0.getTag()));
                }
            }
        }
        return list0;
    }

    public static final List access$getLocalParagraphStyles(AnnotatedString annotatedString0, int v, int v1) {
        List list0 = null;
        if(v != v1) {
            List list1 = annotatedString0.getParagraphStylesOrNull$ui_text_release();
            if(list1 != null) {
                if(v == 0 && v1 >= annotatedString0.getText().length()) {
                    return list1;
                }
                ArrayList arrayList0 = new ArrayList(list1.size());
                int v2 = list1.size();
                for(int v4 = 0; v4 < v2; ++v4) {
                    Object object0 = list1.get(v4);
                    if(AnnotatedStringKt.intersect(v, v1, ((Range)object0).getStart(), ((Range)object0).getEnd())) {
                        arrayList0.add(object0);
                    }
                }
                list0 = new ArrayList(arrayList0.size());
                int v5 = arrayList0.size();
                for(int v3 = 0; v3 < v5; ++v3) {
                    Range annotatedString$Range0 = (Range)arrayList0.get(v3);
                    ((ArrayList)list0).add(new Range(annotatedString$Range0.getItem(), c.coerceIn(annotatedString$Range0.getStart(), v, v1) - v, c.coerceIn(annotatedString$Range0.getEnd(), v, v1) - v));
                }
            }
        }
        return list0;
    }

    public static final AnnotatedString access$substringWithoutParagraphStyles(AnnotatedString annotatedString0, int v, int v1) {
        if(v != v1) {
            String s = annotatedString0.getText().substring(v, v1);
            Intrinsics.checkNotNullExpressionValue(s, "this as java.lang.String…ing(startIndex, endIndex)");
            return new AnnotatedString(s, AnnotatedStringKt.a(annotatedString0, v, v1), null, null, 12, null);
        }
        return new AnnotatedString("", AnnotatedStringKt.a(annotatedString0, v, v1), null, null, 12, null);
    }

    @NotNull
    public static final AnnotatedString buildAnnotatedString(@NotNull Function1 function10) {
        Builder annotatedString$Builder0 = new Builder(0, 1, null);
        function10.invoke(annotatedString$Builder0);
        return annotatedString$Builder0.toAnnotatedString();
    }

    @NotNull
    public static final AnnotatedString capitalize(@NotNull AnnotatedString annotatedString0, @NotNull LocaleList localeList0) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString0, new b(0, localeList0));
    }

    public static AnnotatedString capitalize$default(AnnotatedString annotatedString0, LocaleList localeList0, int v, Object object0) {
        if((v & 1) != 0) {
            localeList0 = LocaleList.Companion.getCurrent();
        }
        return AnnotatedStringKt.capitalize(annotatedString0, localeList0);
    }

    public static final boolean contains(int v, int v1, int v2, int v3) {
        if(v <= v2 && v3 <= v1) {
            return v1 == v3 ? (v2 == v3 ? 1 : 0) == (v == v1 ? 1 : 0) : true;
        }
        return false;
    }

    @NotNull
    public static final AnnotatedString decapitalize(@NotNull AnnotatedString annotatedString0, @NotNull LocaleList localeList0) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString0, new b(1, localeList0));
    }

    public static AnnotatedString decapitalize$default(AnnotatedString annotatedString0, LocaleList localeList0, int v, Object object0) {
        if((v & 1) != 0) {
            localeList0 = LocaleList.Companion.getCurrent();
        }
        return AnnotatedStringKt.decapitalize(annotatedString0, localeList0);
    }

    @NotNull
    public static final AnnotatedString emptyAnnotatedString() {
        return AnnotatedStringKt.a;
    }

    // 去混淆评级： 低(20)
    public static final boolean intersect(int v, int v1, int v2, int v3) {
        return Math.max(v, v2) < Math.min(v1, v3) || AnnotatedStringKt.contains(v, v1, v2, v3) || AnnotatedStringKt.contains(v2, v3, v, v1);
    }

    @NotNull
    public static final List mapEachParagraphStyle(@NotNull AnnotatedString annotatedString0, @NotNull ParagraphStyle paragraphStyle0, @NotNull Function2 function20) {
        List list0 = AnnotatedStringKt.normalizedParagraphStyles(annotatedString0, paragraphStyle0);
        List list1 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Range annotatedString$Range0 = (Range)list0.get(v1);
            list1.add(function20.invoke(AnnotatedStringKt.access$substringWithoutParagraphStyles(annotatedString0, annotatedString$Range0.getStart(), annotatedString$Range0.getEnd()), annotatedString$Range0));
        }
        return list1;
    }

    @NotNull
    public static final List normalizedParagraphStyles(@NotNull AnnotatedString annotatedString0, @NotNull ParagraphStyle paragraphStyle0) {
        int v = annotatedString0.getText().length();
        List list0 = annotatedString0.getParagraphStylesOrNull$ui_text_release() == null ? CollectionsKt__CollectionsKt.emptyList() : annotatedString0.getParagraphStylesOrNull$ui_text_release();
        List list1 = new ArrayList();
        int v1 = list0.size();
        int v2 = 0;
        int v3;
        for(v3 = 0; v2 < v1; v3 = v5) {
            Range annotatedString$Range0 = (Range)list0.get(v2);
            ParagraphStyle paragraphStyle1 = (ParagraphStyle)annotatedString$Range0.component1();
            int v4 = annotatedString$Range0.component2();
            int v5 = annotatedString$Range0.component3();
            if(v4 != v3) {
                list1.add(new Range(paragraphStyle0, v3, v4));
            }
            list1.add(new Range(paragraphStyle0.merge(paragraphStyle1), v4, v5));
            ++v2;
        }
        if(v3 != v) {
            list1.add(new Range(paragraphStyle0, v3, v));
        }
        if(list1.isEmpty()) {
            list1.add(new Range(paragraphStyle0, 0, 0));
        }
        return list1;
    }

    @NotNull
    public static final AnnotatedString toLowerCase(@NotNull AnnotatedString annotatedString0, @NotNull LocaleList localeList0) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString0, new b(2, localeList0));
    }

    public static AnnotatedString toLowerCase$default(AnnotatedString annotatedString0, LocaleList localeList0, int v, Object object0) {
        if((v & 1) != 0) {
            localeList0 = LocaleList.Companion.getCurrent();
        }
        return AnnotatedStringKt.toLowerCase(annotatedString0, localeList0);
    }

    @NotNull
    public static final AnnotatedString toUpperCase(@NotNull AnnotatedString annotatedString0, @NotNull LocaleList localeList0) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString0, new b(3, localeList0));
    }

    public static AnnotatedString toUpperCase$default(AnnotatedString annotatedString0, LocaleList localeList0, int v, Object object0) {
        if((v & 1) != 0) {
            localeList0 = LocaleList.Companion.getCurrent();
        }
        return AnnotatedStringKt.toUpperCase(annotatedString0, localeList0);
    }

    @ExperimentalTextApi
    @NotNull
    public static final Object withAnnotation(@NotNull Builder annotatedString$Builder0, @NotNull TtsAnnotation ttsAnnotation0, @NotNull Function1 function10) {
        int v = annotatedString$Builder0.pushTtsAnnotation(ttsAnnotation0);
        try {
            return function10.invoke(annotatedString$Builder0);
        }
        finally {
            annotatedString$Builder0.pop(v);
        }
    }

    @ExperimentalTextApi
    @Deprecated(message = "Use LinkAnnotation API for links instead", replaceWith = @ReplaceWith(expression = "withLink(, block)", imports = {}))
    @NotNull
    public static final Object withAnnotation(@NotNull Builder annotatedString$Builder0, @NotNull UrlAnnotation urlAnnotation0, @NotNull Function1 function10) {
        int v = annotatedString$Builder0.pushUrlAnnotation(urlAnnotation0);
        try {
            return function10.invoke(annotatedString$Builder0);
        }
        finally {
            annotatedString$Builder0.pop(v);
        }
    }

    @ExperimentalTextApi
    @NotNull
    public static final Object withAnnotation(@NotNull Builder annotatedString$Builder0, @NotNull String s, @NotNull String s1, @NotNull Function1 function10) {
        int v = annotatedString$Builder0.pushStringAnnotation(s, s1);
        try {
            return function10.invoke(annotatedString$Builder0);
        }
        finally {
            annotatedString$Builder0.pop(v);
        }
    }

    @NotNull
    public static final Object withLink(@NotNull Builder annotatedString$Builder0, @NotNull LinkAnnotation linkAnnotation0, @NotNull Function1 function10) {
        int v = annotatedString$Builder0.pushLink(linkAnnotation0);
        try {
            return function10.invoke(annotatedString$Builder0);
        }
        finally {
            annotatedString$Builder0.pop(v);
        }
    }

    @NotNull
    public static final Object withStyle(@NotNull Builder annotatedString$Builder0, @NotNull ParagraphStyle paragraphStyle0, @NotNull Function1 function10) {
        int v = annotatedString$Builder0.pushStyle(paragraphStyle0);
        try {
            return function10.invoke(annotatedString$Builder0);
        }
        finally {
            annotatedString$Builder0.pop(v);
        }
    }

    @NotNull
    public static final Object withStyle(@NotNull Builder annotatedString$Builder0, @NotNull SpanStyle spanStyle0, @NotNull Function1 function10) {
        int v = annotatedString$Builder0.pushStyle(spanStyle0);
        try {
            return function10.invoke(annotatedString$Builder0);
        }
        finally {
            annotatedString$Builder0.pop(v);
        }
    }
}

