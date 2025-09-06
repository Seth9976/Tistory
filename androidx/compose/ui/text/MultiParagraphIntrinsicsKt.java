package androidx.compose.ui.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsicsKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,154:1\n235#2,3:155\n33#2,4:158\n238#2,2:162\n38#2:164\n240#2:165\n151#2,3:166\n33#2,4:169\n154#2,2:173\n38#2:175\n156#2:176\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsicsKt\n*L\n142#1:155,3\n142#1:158,4\n142#1:162,2\n142#1:164\n142#1:165\n142#1:166,3\n142#1:169,4\n142#1:173,2\n142#1:175\n142#1:176\n*E\n"})
public final class MultiParagraphIntrinsicsKt {
    public static final List access$getLocalPlaceholders(List list0, int v, int v1) {
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
            if(v > annotatedString$Range0.getStart() || annotatedString$Range0.getEnd() > v1) {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
            }
            ((ArrayList)list1).add(new Range(annotatedString$Range0.getItem(), annotatedString$Range0.getStart() - v, annotatedString$Range0.getEnd() - v));
        }
        return list1;
    }
}

