package androidx.compose.ui.text;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.x;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0010\b\n\u0002\b\u0003\u001A3\u0010\u0004\u001A\u00020\u0000*\u00020\u00002\u001E\u0010\u0004\u001A\u001A\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "Lkotlin/Function3;", "", "", "transform", "(Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/text/AnnotatedString;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nJvmAnnotatedString.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,81:1\n151#2,3:82\n33#2,4:85\n154#2,2:89\n38#2:91\n156#2:92\n151#2,3:93\n33#2,4:96\n154#2,2:100\n38#2:102\n156#2:103\n151#2,3:104\n33#2,4:107\n154#2,2:111\n38#2:113\n156#2:114\n256#2,3:115\n33#2,4:118\n259#2,2:122\n38#2:124\n261#2:125\n*S KotlinDebug\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n*L\n45#1:82,3\n45#1:85,4\n45#1:89,2\n45#1:91\n45#1:92\n49#1:93,3\n49#1:96,4\n49#1:100,2\n49#1:102\n49#1:103\n52#1:104,3\n52#1:107,4\n52#1:111,2\n52#1:113\n52#1:114\n74#1:115,3\n74#1:118,4\n74#1:122,2\n74#1:124\n74#1:125\n*E\n"})
public final class JvmAnnotatedString_jvmKt {
    public static final void a(List list0, TreeSet treeSet0) {
        if(list0 != null) {
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                Range annotatedString$Range0 = (Range)list0.get(v1);
                treeSet0.add(annotatedString$Range0.getStart());
                treeSet0.add(annotatedString$Range0.getEnd());
            }
        }
    }

    @NotNull
    public static final AnnotatedString transform(@NotNull AnnotatedString annotatedString0, @NotNull Function3 function30) {
        ArrayList arrayList2;
        ArrayList arrayList1;
        TreeSet treeSet0 = e0.sortedSetOf(new Integer[]{0, annotatedString0.getText().length()});
        JvmAnnotatedString_jvmKt.a(annotatedString0.getSpanStylesOrNull$ui_text_release(), treeSet0);
        JvmAnnotatedString_jvmKt.a(annotatedString0.getParagraphStylesOrNull$ui_text_release(), treeSet0);
        JvmAnnotatedString_jvmKt.a(annotatedString0.getAnnotations$ui_text_release(), treeSet0);
        ObjectRef ref$ObjectRef0 = new ObjectRef();
        ref$ObjectRef0.element = "";
        Map map0 = x.mutableMapOf(new Pair[]{TuplesKt.to(0, 0)});
        CollectionsKt___CollectionsKt.windowed$default(treeSet0, 2, 0, false, new g(ref$ObjectRef0, function30, annotatedString0, map0), 6, null);
        List list0 = annotatedString0.getSpanStylesOrNull$ui_text_release();
        ArrayList arrayList0 = null;
        if(list0 == null) {
            arrayList1 = null;
        }
        else {
            arrayList1 = new ArrayList(list0.size());
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                Range annotatedString$Range0 = (Range)list0.get(v2);
                Object object0 = map0.get(annotatedString$Range0.getStart());
                Intrinsics.checkNotNull(object0);
                Object object1 = map0.get(annotatedString$Range0.getEnd());
                Intrinsics.checkNotNull(object1);
                arrayList1.add(new Range(annotatedString$Range0.getItem(), ((Number)object0).intValue(), ((Number)object1).intValue()));
            }
        }
        List list1 = annotatedString0.getParagraphStylesOrNull$ui_text_release();
        if(list1 == null) {
            arrayList2 = null;
        }
        else {
            arrayList2 = new ArrayList(list1.size());
            int v3 = list1.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                Range annotatedString$Range1 = (Range)list1.get(v4);
                Object object2 = map0.get(annotatedString$Range1.getStart());
                Intrinsics.checkNotNull(object2);
                Object object3 = map0.get(annotatedString$Range1.getEnd());
                Intrinsics.checkNotNull(object3);
                arrayList2.add(new Range(annotatedString$Range1.getItem(), ((Number)object2).intValue(), ((Number)object3).intValue()));
            }
        }
        List list2 = annotatedString0.getAnnotations$ui_text_release();
        if(list2 != null) {
            arrayList0 = new ArrayList(list2.size());
            int v5 = list2.size();
            for(int v = 0; v < v5; ++v) {
                Range annotatedString$Range2 = (Range)list2.get(v);
                Object object4 = map0.get(annotatedString$Range2.getStart());
                Intrinsics.checkNotNull(object4);
                Object object5 = map0.get(annotatedString$Range2.getEnd());
                Intrinsics.checkNotNull(object5);
                arrayList0.add(new Range(annotatedString$Range2.getItem(), ((Number)object4).intValue(), ((Number)object5).intValue()));
            }
        }
        return new AnnotatedString(((String)ref$ObjectRef0.element), arrayList1, arrayList2, arrayList0);
    }
}

