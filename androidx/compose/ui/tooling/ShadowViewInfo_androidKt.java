package androidx.compose.ui.tooling;

import androidx.compose.ui.layout.LayoutInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.l;
import kotlin.collections.o;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt___SequencesKt;
import m0.b0;
import o2.i;
import o2.j;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u001C\u0010\u0000\u001A\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"stitchTrees", "", "Landroidx/compose/ui/tooling/ViewInfo;", "allViewInfoRoots", "ui-tooling_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nShadowViewInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShadowViewInfo.android.kt\nandroidx/compose/ui/tooling/ShadowViewInfo_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,121:1\n1549#2:122\n1620#2,3:123\n1373#2:126\n1461#2,5:127\n1549#2:132\n1620#2,3:133\n766#2:136\n857#2,2:137\n1477#2:139\n1502#2,3:140\n1505#2,3:150\n1855#2,2:153\n1549#2:155\n1620#2,3:156\n361#3,7:143\n*S KotlinDebug\n*F\n+ 1 ShadowViewInfo.android.kt\nandroidx/compose/ui/tooling/ShadowViewInfo_androidKt\n*L\n80#1:122\n80#1:123,3\n85#1:126\n85#1:127,5\n86#1:132\n86#1:133,3\n87#1:136\n87#1:137,2\n88#1:139\n88#1:140,3\n88#1:150,3\n94#1:153,2\n115#1:155\n115#1:156,3\n88#1:143,7\n*E\n"})
public final class ShadowViewInfo_androidKt {
    @NotNull
    public static final List stitchTrees(@NotNull List list0) {
        if(list0.size() < 2) {
            return list0;
        }
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            arrayList0.add(new i(null, ((ViewInfo)object0)));
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: arrayList0) {
            o.addAll(arrayList1, ((i)object1).d);
        }
        ArrayList arrayList2 = new ArrayList(l.collectionSizeOrDefault(arrayList1, 10));
        for(Object object2: arrayList1) {
            Object object3 = ((i)object2).b.getLayoutInfo();
            arrayList2.add(TuplesKt.to((object3 instanceof LayoutInfo ? ((LayoutInfo)object3) : null), ((i)object2)));
        }
        ArrayList arrayList3 = new ArrayList();
        for(Object object4: arrayList2) {
            if(((Pair)object4).getFirst() != null) {
                arrayList3.add(object4);
            }
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object5: arrayList3) {
            LayoutInfo layoutInfo0 = (LayoutInfo)((Pair)object5).getFirst();
            ArrayList arrayList4 = linkedHashMap0.get(layoutInfo0);
            if(arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap0.put(layoutInfo0, arrayList4);
            }
            arrayList4.add(object5);
        }
        LinkedHashSet linkedHashSet0 = new LinkedHashSet(arrayList0);
        for(Object object6: arrayList0) {
            i i0 = (i)object6;
            b0 b00 = new b0(linkedHashMap0, 12);
            i i1 = (i)SequencesKt___SequencesKt.firstOrNull(SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.filter(SequencesKt___SequencesKt.flatMapIterable(i0.d, b00), new b0(i0, 13)), j.x));
            if(i1 != null) {
                i i2 = i0.a;
                if(i2 != null) {
                    List list1 = i2.c;
                    if(list1 != null) {
                        list1.remove(i0);
                    }
                }
                i1.c.add(i0);
                i0.a = i1;
                linkedHashSet0.remove(i0);
            }
        }
        List list2 = new ArrayList(l.collectionSizeOrDefault(linkedHashSet0, 10));
        for(Object object7: linkedHashSet0) {
            ((ArrayList)list2).add(((i)object7).b());
        }
        return list2;
    }
}

