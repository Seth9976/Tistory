package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.o;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r2.a;
import r2.b;
import r2.d;
import r2.e;
import r2.f;
import zd.c;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0006\u001AM\u0010\t\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012&\u0010\u0006\u001A\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\b\b\u0002\u0010\b\u001A\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001A%\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\u0005*\u00020\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\f\u0010\r\u001A\u0013\u0010\u000F\u001A\u00020\u000E*\u00020\u0001H\u0007¢\u0006\u0004\b\u000F\u0010\u0010\u001A\u001B\u0010\u0013\u001A\u00020\u0011*\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u001A\u0010\u0019\u001A\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018\" \u0010\u001F\u001A\u0004\u0018\u00010\u001A*\u00020\u000E8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001B\u0010\u001C¨\u0006 "}, d2 = {"T", "Landroidx/compose/runtime/tooling/CompositionData;", "Lkotlin/Function3;", "Landroidx/compose/runtime/tooling/CompositionGroup;", "Landroidx/compose/ui/tooling/data/SourceContext;", "", "factory", "Landroidx/compose/ui/tooling/data/ContextCache;", "cache", "mapTree", "(Landroidx/compose/runtime/tooling/CompositionData;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/tooling/data/ContextCache;)Ljava/lang/Object;", "Landroidx/compose/ui/tooling/data/ParameterInformation;", "findParameters", "(Landroidx/compose/runtime/tooling/CompositionGroup;Landroidx/compose/ui/tooling/data/ContextCache;)Ljava/util/List;", "Landroidx/compose/ui/tooling/data/Group;", "asTree", "(Landroidx/compose/runtime/tooling/CompositionData;)Landroidx/compose/ui/tooling/data/Group;", "Landroidx/compose/ui/unit/IntRect;", "other", "union", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;)Landroidx/compose/ui/unit/IntRect;", "a", "Landroidx/compose/ui/unit/IntRect;", "getEmptyBox", "()Landroidx/compose/ui/unit/IntRect;", "emptyBox", "", "getPosition", "(Landroidx/compose/ui/tooling/data/Group;)Ljava/lang/String;", "getPosition$annotations", "(Landroidx/compose/ui/tooling/data/Group;)V", "position", "ui-tooling-data_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "SlotTreeKt")
@SourceDebugExtension({"SMAP\nSlotTree.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTree.jvm.kt\nandroidx/compose/ui/tooling/data/SlotTreeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,878:1\n1#2:879\n1549#3:880\n1620#3,3:881\n2661#3,7:884\n288#3,2:898\n1045#3:903\n361#4,7:891\n3792#5:900\n4307#5,2:901\n1282#5,2:904\n*S KotlinDebug\n*F\n+ 1 SlotTree.jvm.kt\nandroidx/compose/ui/tooling/data/SlotTreeKt\n*L\n528#1:880\n528#1:881,3\n528#1:884,7\n797#1:898,2\n818#1:903\n749#1:891,7\n814#1:900\n814#1:901,2\n872#1:904,2\n*E\n"})
public final class SlotTreeKt {
    public static final IntRect a;
    public static final Regex b;
    public static final Regex c;

    static {
        SlotTreeKt.a = new IntRect(0, 0, 0, 0);
        SlotTreeKt.b = new Regex("(\\d+)|([,])|([*])|([:])|L|(P\\([^)]*\\))|(C(\\(([^)]*)\\))?)|@");
        SlotTreeKt.c = new Regex("(\\d+)|,|[!P()]|:([^,!)]+)");
    }

    public static final Field a(Class class0, String s) {
        Field field0;
        Field[] arr_field = class0.getDeclaredFields();
        for(int v = 0; true; ++v) {
            field0 = null;
            if(v >= arr_field.length) {
                break;
            }
            Field field1 = arr_field[v];
            if(Intrinsics.areEqual(field1.getName(), s)) {
                field0 = field1;
                break;
            }
        }
        if(field0 != null) {
            field0.setAccessible(true);
            return field0;
        }
        return null;
    }

    @UiToolingDataApi
    @NotNull
    public static final Group asTree(@NotNull CompositionData compositionData0) {
        CompositionGroup compositionGroup0 = (CompositionGroup)CollectionsKt___CollectionsKt.firstOrNull(compositionData0.getCompositionGroups());
        return compositionGroup0 != null ? SlotTreeKt.d(compositionGroup0, null) : b.i;
    }

    public static final IntRect b(LayoutInfo layoutInfo0) {
        LayoutCoordinates layoutCoordinates0 = layoutInfo0.getCoordinates();
        if(layoutInfo0.isAttached() && layoutCoordinates0.isAttached()) {
            long v = LayoutCoordinatesKt.positionInWindow(layoutCoordinates0);
            long v1 = layoutCoordinates0.getSize-YbymL2g();
            int v2 = c.roundToInt(Offset.getX-impl(v));
            int v3 = c.roundToInt(Offset.getY-impl(v));
            return new IntRect(v2, v3, IntSize.getWidth-impl(v1) + v2, IntSize.getHeight-impl(v1) + v3);
        }
        return new IntRect(0, 0, layoutInfo0.getWidth(), layoutInfo0.getHeight());
    }

    public static final List c(List list0, e e0) {
        List list3;
        int v1;
        int v;
        if(!list0.isEmpty()) {
            Object object0 = null;
            for(Object object1: list0) {
                if(object1 != null && p.endsWith$default(object1.getClass().getName(), ".RecomposeScopeImpl", false, 2, null)) {
                    object0 = object1;
                    break;
                }
            }
            if(object0 != null) {
                try {
                    Field field0 = SlotTreeKt.a(object0.getClass(), "block");
                    if(field0 != null) {
                        Object object2 = field0.get(object0);
                        if(object2 != null) {
                            Class class0 = object2.getClass();
                            Field field1 = SlotTreeKt.a(class0, "$$default");
                            Field field2 = SlotTreeKt.a(class0, "$$changed");
                            if(field1 == null) {
                                v = 0;
                            }
                            else {
                                Object object3 = field1.get(object2);
                                Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type kotlin.Int");
                                v = (int)(((Integer)object3));
                            }
                            if(field2 == null) {
                                v1 = 0;
                            }
                            else {
                                Object object4 = field2.get(object2);
                                Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type kotlin.Int");
                                v1 = (int)(((Integer)object4));
                            }
                            Field[] arr_field = class0.getDeclaredFields();
                            ArrayList arrayList0 = new ArrayList();
                            for(int v2 = 0; v2 < arr_field.length; ++v2) {
                                Field field3 = arr_field[v2];
                                if(p.startsWith$default(field3.getName(), "$", false, 2, null) && !p.startsWith$default(field3.getName(), "$$", false, 2, null) && !p.startsWith$default(field3.getName(), "$jacoco", false, 2, null)) {
                                    arrayList0.add(field3);
                                }
                            }
                            List list1 = CollectionsKt___CollectionsKt.sortedWith(arrayList0, new SlotTreeKt.extractParameterInfo..inlined.sortedBy.1());
                            List list2 = new ArrayList();
                            if(e0 == null) {
                                list3 = CollectionsKt__CollectionsKt.emptyList();
                            }
                            else {
                                list3 = e0.f;
                                if(list3 == null) {
                                    list3 = CollectionsKt__CollectionsKt.emptyList();
                                }
                            }
                            int v3 = list1.size();
                            for(int v4 = 0; v4 < v3; ++v4) {
                                r2.c c0 = v4 >= list3.size() ? new r2.c(v4, null) : ((r2.c)list3.get(v4));
                                if(c0.a < list1.size()) {
                                    Field field4 = (Field)list1.get(c0.a);
                                    field4.setAccessible(true);
                                    Object object5 = field4.get(object2);
                                    boolean z = (1 << v4 & v) != 0;
                                    int v5 = v4 * 3 + 1;
                                    int v6 = (7 << v5 & v1) >> v5;
                                    String s = field4.getName().substring(1);
                                    Intrinsics.checkNotNullExpressionValue(s, "this as java.lang.String).substring(startIndex)");
                                    ((ArrayList)list2).add(new ParameterInformation(s, object5, z, (v6 & 3) == 3, (v6 & 3) == 0 && !z, c0.b, (v6 & 4) == 0));
                                }
                            }
                            return list2;
                        }
                    }
                    return CollectionsKt__CollectionsKt.emptyList();
                }
                catch(Throwable unused_ex) {
                }
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static final Group d(CompositionGroup compositionGroup0, e e0) {
        SourceLocation sourceLocation0;
        IntRect intRect0;
        Object object0 = compositionGroup0.getKey();
        String s = compositionGroup0.getSourceInfo();
        e e1 = s == null ? null : SlotTreeKt.l(s, e0);
        Object object1 = compositionGroup0.getNode();
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        o.addAll(arrayList0, compositionGroup0.getData());
        for(Object object2: compositionGroup0.getCompositionGroups()) {
            arrayList1.add(SlotTreeKt.d(((CompositionGroup)object2), e1));
        }
        List list0 = object1 instanceof LayoutInfo ? ((LayoutInfo)object1).getModifierInfo() : CollectionsKt__CollectionsKt.emptyList();
        if(object1 instanceof LayoutInfo) {
            intRect0 = SlotTreeKt.b(((LayoutInfo)object1));
        }
        else {
            if(arrayList1.isEmpty()) {
                intRect0 = SlotTreeKt.a;
                goto label_33;
            }
            ArrayList arrayList2 = new ArrayList(l.collectionSizeOrDefault(arrayList1, 10));
            for(Object object3: arrayList1) {
                arrayList2.add(((Group)object3).getBox());
            }
            Iterator iterator2 = arrayList2.iterator();
            if(!iterator2.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can\'t be reduced.");
            }
            IntRect intRect1;
            for(intRect1 = iterator2.next(); iterator2.hasNext(); intRect1 = SlotTreeKt.union(((IntRect)object4), intRect1)) {
                Object object4 = iterator2.next();
            }
            intRect0 = intRect1;
        }
    label_33:
        boolean z = true;
        if(e1 == null || !e1.g || e0 == null) {
            sourceLocation0 = null;
        }
        else {
            ArrayList arrayList3 = e0.d;
            if(e0.i >= arrayList3.size()) {
                int v = e0.e;
                if(v >= 0) {
                    e0.i = v;
                }
            }
            if(e0.i < arrayList3.size()) {
                int v1 = e0.i;
                e0.i = v1 + 1;
                f f0 = (f)arrayList3.get(v1);
                sourceLocation0 = new SourceLocation(((int)f0.a), ((int)f0.b), ((int)f0.c), e0.b, e0.c);
            }
            else {
                sourceLocation0 = null;
            }
        }
        if(object1 != null) {
            return new NodeGroup(object0, object1, intRect0, arrayList0, list0, arrayList1);
        }
        String s1 = e1 == null ? null : e1.a;
        String s2 = e1 == null ? null : e1.a;
        Object object5 = s2 == null || s2.length() == 0 || intRect0.getBottom() - intRect0.getTop() <= 0 && intRect0.getRight() - intRect0.getLeft() <= 0 ? null : compositionGroup0.getIdentity();
        List list1 = SlotTreeKt.c(arrayList0, e1);
        if(e1 == null || !e1.h) {
            z = false;
        }
        return new CallGroup(object0, s1, intRect0, sourceLocation0, object5, list1, arrayList0, arrayList1, z);
    }

    public static final String e(Object object0) {
        if(object0 instanceof String) {
            return (String)object0;
        }
        if(object0 instanceof JoinedKey) {
            String s = SlotTreeKt.e(((JoinedKey)object0).getLeft());
            return s == null ? SlotTreeKt.e(((JoinedKey)object0).getRight()) : s;
        }
        return null;
    }

    public static final void f(IntRef ref$IntRef0, List list0, int v) {
        int v1 = v - ref$IntRef0.element;
        if(v1 > 0) {
            if(v1 < 4) {
                v1 = 4;
            }
            for(int v2 = 0; v2 < v1; ++v2) {
                list0.add(((int)(ref$IntRef0.element + v2 + 1)));
            }
            ref$IntRef0.element += v1;
        }
    }

    @UiToolingDataApi
    @NotNull
    public static final List findParameters(@NotNull CompositionGroup compositionGroup0, @Nullable ContextCache contextCache0) {
        e e0 = null;
        String s = compositionGroup0.getSourceInfo();
        if(s == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if(contextCache0 == null) {
            e0 = SlotTreeKt.l(s, null);
        }
        else {
            Map map0 = contextCache0.getContexts$ui_tooling_data_release();
            e e1 = map0.get(s);
            if(e1 == null) {
                e1 = SlotTreeKt.l(s, null);
                map0.put(s, e1);
            }
            if(e1 instanceof e) {
                e0 = e1;
            }
        }
        ArrayList arrayList0 = new ArrayList();
        o.addAll(arrayList0, compositionGroup0.getData());
        return SlotTreeKt.c(arrayList0, e0);
    }

    public static List findParameters$default(CompositionGroup compositionGroup0, ContextCache contextCache0, int v, Object object0) {
        if((v & 1) != 0) {
            contextCache0 = null;
        }
        return SlotTreeKt.findParameters(compositionGroup0, contextCache0);
    }

    public static final void g(String s, ObjectRef ref$ObjectRef0) {
        MatchResult matchResult0 = (MatchResult)ref$ObjectRef0.element;
        if(matchResult0 == null || !Intrinsics.areEqual(((String)matchResult0.getGroupValues().get(0)), s)) {
            throw new d();  // 初始化器: Ljava/lang/Exception;-><init>()V
        }
        SlotTreeKt.k(ref$ObjectRef0);
    }

    @NotNull
    public static final IntRect getEmptyBox() {
        return SlotTreeKt.a;
    }

    @UiToolingDataApi
    @Nullable
    public static final String getPosition(@NotNull Group group0) {
        return SlotTreeKt.e(group0.getKey());
    }

    @UiToolingDataApi
    public static void getPosition$annotations(Group group0) {
    }

    public static final String h(ObjectRef ref$ObjectRef0) {
        MatchResult matchResult0 = (MatchResult)ref$ObjectRef0.element;
        if(matchResult0 == null || matchResult0.getGroups().get(2) == null) {
            throw new d();  // 初始化器: Ljava/lang/Exception;-><init>()V
        }
        SlotTreeKt.k(ref$ObjectRef0);
        String s = ((String)matchResult0.getGroupValues().get(0)).substring(1);
        Intrinsics.checkNotNullExpressionValue(s, "this as java.lang.String).substring(startIndex)");
        if(p.startsWith$default(s, "c#", false, 2, null)) {
            String s1 = s.substring(2);
            Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String).substring(startIndex)");
            return "androidx.compose." + s1;
        }
        return s;
    }

    public static final int i(ObjectRef ref$ObjectRef0) {
        MatchResult matchResult0 = (MatchResult)ref$ObjectRef0.element;
        if(matchResult0 != null && matchResult0.getGroups().get(1) != null) {
            SlotTreeKt.k(ref$ObjectRef0);
            String s = (String)matchResult0.getGroupValues().get(0);
            try {
                return Integer.parseInt(s);
            }
            catch(NumberFormatException unused_ex) {
                throw new d();  // 初始化器: Ljava/lang/Exception;-><init>()V
            }
        }
        throw new d();  // 初始化器: Ljava/lang/Exception;-><init>()V
    }

    public static final boolean j(String s, ObjectRef ref$ObjectRef0) {
        MatchResult matchResult0 = (MatchResult)ref$ObjectRef0.element;
        return matchResult0 == null || Intrinsics.areEqual(((String)matchResult0.getGroupValues().get(0)), s);
    }

    public static final void k(ObjectRef ref$ObjectRef0) {
        MatchResult matchResult0 = (MatchResult)ref$ObjectRef0.element;
        if(matchResult0 != null) {
            ref$ObjectRef0.element = matchResult0.next();
        }
        MatchResult matchResult1 = (MatchResult)ref$ObjectRef0.element;
    }

    public static final e l(String s, e e0) {
        int v11;
        String s9;
        int v10;
        boolean z3;
        int v9;
        List list2;
        int v7;
        int v6;
        Number number0;
        int v5;
        f f0;
        int v3;
        Integer integer2;
        int v2;
        Integer integer1;
        Integer integer0;
        int v1;
        boolean z2;
        Object object0;
        ObjectRef ref$ObjectRef0 = new ObjectRef();
        ref$ObjectRef0.element = Regex.find$default(SlotTreeKt.b, s, 0, 2, null);
        ArrayList arrayList0 = new ArrayList();
        boolean z = false;
        boolean z1 = false;
        String s1 = null;
        List list0 = null;
        int v = -1;
        while(true) {
            object0 = ref$ObjectRef0.element;
            if(object0 == null) {
                goto label_165;
            }
            Intrinsics.checkNotNull(object0);
            if(((MatchResult)object0).getGroups().get(1) != null || Intrinsics.areEqual(((String)((MatchResult)object0).getGroupValues().get(0)), "@")) {
                try {
                    z2 = z;
                    MatchResult matchResult0 = (MatchResult)ref$ObjectRef0.element;
                    if(matchResult0 != null && matchResult0.getGroups().get(1) != null) {
                        String s2 = (String)matchResult0.getGroupValues().get(1);
                        try {
                            v1 = Integer.parseInt(s2);
                        }
                        catch(NumberFormatException unused_ex) {
                            throw new d();  // 初始化器: Ljava/lang/Exception;-><init>()V
                        }
                        integer0 = (int)(v1 + 1);
                        matchResult0 = SlotTreeKt.m(ref$ObjectRef0);
                    }
                    else {
                        integer0 = null;
                    }
                    if(matchResult0 == null || !Intrinsics.areEqual(((String)matchResult0.getGroupValues().get(0)), "@")) {
                        integer1 = null;
                        integer2 = null;
                        goto label_44;
                    }
                    else {
                        MatchResult matchResult1 = SlotTreeKt.m(ref$ObjectRef0);
                        if(matchResult1 != null && matchResult1.getGroups().get(1) != null) {
                            String s3 = (String)matchResult1.getGroupValues().get(1);
                            try {
                                v2 = Integer.parseInt(s3);
                            }
                            catch(NumberFormatException unused_ex) {
                                throw new d();  // 初始化器: Ljava/lang/Exception;-><init>()V
                            }
                            integer1 = v2;
                            MatchResult matchResult2 = SlotTreeKt.m(ref$ObjectRef0);
                            if(matchResult2 == null || !Intrinsics.areEqual(((String)matchResult2.getGroupValues().get(0)), "L")) {
                                integer2 = null;
                                goto label_44;
                            }
                            else {
                                MatchResult matchResult3 = SlotTreeKt.m(ref$ObjectRef0);
                                if(matchResult3 != null && matchResult3.getGroups().get(1) != null) {
                                    String s4 = (String)matchResult3.getGroupValues().get(1);
                                    try {
                                        v3 = Integer.parseInt(s4);
                                    }
                                    catch(NumberFormatException unused_ex) {
                                        throw new d();  // 初始化器: Ljava/lang/Exception;-><init>()V
                                    }
                                    integer2 = v3;
                                label_44:
                                    if(integer0 != null && integer1 != null && integer2 != null) {
                                        f0 = new f(integer0, integer1, integer2);
                                        goto label_48;
                                    }
                                }
                            }
                        }
                    }
                label_47:
                    f0 = null;
                }
                catch(d unused_ex) {
                    goto label_47;
                }
            label_48:
                if(f0 != null) {
                    arrayList0.add(f0);
                }
                goto label_142;
            }
            if(Intrinsics.areEqual(((String)((MatchResult)object0).getGroupValues().get(0)), "C")) {
                if(z) {
                    z1 = true;
                }
                SlotTreeKt.m(ref$ObjectRef0);
            }
            else if(((MatchResult)object0).getGroups().get(6) == null) {
                goto label_63;
            }
            else {
                if(z) {
                    z1 = true;
                }
                s1 = (String)((MatchResult)object0).getGroupValues().get(8);
                SlotTreeKt.m(ref$ObjectRef0);
            }
            z2 = true;
            goto label_142;
        label_63:
            if(((MatchResult)object0).getGroups().get(5) != null) {
                String s5 = (String)((MatchResult)object0).getGroupValues().get(0);
                ObjectRef ref$ObjectRef1 = new ObjectRef();
                ref$ObjectRef1.element = Regex.find$default(SlotTreeKt.c, s5, 0, 2, null);
                List list1 = CollectionsKt__CollectionsKt.mutableListOf(new Integer[]{0, 1, 2, 3});
                IntRef ref$IntRef0 = new IntRef();
                ref$IntRef0.element = list1.size() - 1;
                ArrayList arrayList1 = new ArrayList();
                try {
                    SlotTreeKt.g("P", ref$ObjectRef1);
                    SlotTreeKt.g("(", ref$ObjectRef1);
                alab1:
                    while(true) {
                    label_73:
                        if(SlotTreeKt.j(")", ref$ObjectRef1)) {
                            goto label_114;
                        }
                        if(SlotTreeKt.j("!", ref$ObjectRef1)) {
                            SlotTreeKt.k(ref$ObjectRef1);
                            int v4 = SlotTreeKt.i(ref$ObjectRef1);
                            SlotTreeKt.f(ref$IntRef0, list1, arrayList1.size() + v4);
                            v5 = 0;
                            while(true) {
                            label_79:
                                if(v5 >= v4) {
                                    continue alab1;
                                }
                                number0 = (Number)CollectionsKt___CollectionsKt.first(list1);
                                z2 = z;
                                v6 = v;
                                v7 = number0.intValue();
                                v6 = v;
                                goto label_95;
                            }
                        }
                        goto label_101;
                    }
                }
                catch(d unused_ex) {
                }
                catch(NumberFormatException unused_ex) {
                    v6 = v;
                    z2 = z;
                    list2 = CollectionsKt__CollectionsKt.emptyList();
                    list0 = list2;
                    goto label_127;
                }
                try {
                    try {
                        v6 = v;
                        z2 = z;
                        list2 = CollectionsKt__CollectionsKt.emptyList();
                        list0 = list2;
                        goto label_127;
                    }
                    catch(d unused_ex) {
                        list2 = CollectionsKt__CollectionsKt.emptyList();
                    }
                    list0 = list2;
                    goto label_127;
                    try {
                        v6 = v;
                        v7 = number0.intValue();
                        v6 = v;
                        goto label_95;
                    }
                    catch(d unused_ex) {
                        try {
                            v6 = v;
                            list2 = CollectionsKt__CollectionsKt.emptyList();
                            list0 = list2;
                            goto label_127;
                        label_95:
                            arrayList1.add(new r2.c(v7, null));
                            list1.remove(0);
                            ++v5;
                            v = v6;
                            z = z2;
                            goto label_79;
                        label_101:
                            v6 = v;
                            z2 = z;
                            if(SlotTreeKt.j(",", ref$ObjectRef1)) {
                                SlotTreeKt.k(ref$ObjectRef1);
                            }
                            else {
                                int v8 = SlotTreeKt.i(ref$ObjectRef1);
                                MatchResult matchResult4 = (MatchResult)ref$ObjectRef1.element;
                                arrayList1.add(new r2.c(v8, (matchResult4 == null || matchResult4.getGroups().get(2) == null ? null : SlotTreeKt.h(ref$ObjectRef1))));
                                SlotTreeKt.f(ref$IntRef0, list1, v8);
                                list1.remove(Integer.valueOf(v8));
                            }
                            v = v6;
                            z = z2;
                            goto label_73;
                        label_114:
                            v6 = v;
                            z2 = z;
                            SlotTreeKt.g(")", ref$ObjectRef1);
                        }
                        catch(d unused_ex) {
                            list2 = CollectionsKt__CollectionsKt.emptyList();
                            list0 = list2;
                            goto label_127;
                        }
                    }
                }
                catch(NumberFormatException unused_ex) {
                    list2 = CollectionsKt__CollectionsKt.emptyList();
                    list0 = list2;
                    goto label_127;
                }
                while(list1.size() > 0) {
                    try {
                        arrayList1.add(new r2.c(((Number)CollectionsKt___CollectionsKt.first(list1)).intValue(), null));
                        list1.remove(0);
                        continue;
                    }
                    catch(d unused_ex) {
                        list2 = CollectionsKt__CollectionsKt.emptyList();
                    }
                    catch(NumberFormatException unused_ex) {
                        list2 = CollectionsKt__CollectionsKt.emptyList();
                    }
                    list0 = list2;
                    goto label_127;
                }
                list0 = arrayList1;
            label_127:
                SlotTreeKt.m(ref$ObjectRef0);
                v = v6;
                goto label_142;
            }
            v9 = v;
            z2 = z;
            z3 = z1;
            if(Intrinsics.areEqual(((String)((MatchResult)object0).getGroupValues().get(0)), "*")) {
                v = arrayList0.size();
                SlotTreeKt.m(ref$ObjectRef0);
                z1 = z3;
                goto label_142;
            }
            else {
                if(Intrinsics.areEqual(((String)((MatchResult)object0).getGroupValues().get(0)), ",")) {
                    SlotTreeKt.m(ref$ObjectRef0);
                    z1 = z3;
                    v = v9;
                label_142:
                    if(Intrinsics.areEqual(((MatchResult)object0), ref$ObjectRef0.element)) {
                        return null;
                    }
                    z = z2;
                    continue;
                }
                break;
            }
            goto label_170;
        }
        if(((MatchResult)object0).getGroups().get(4) == null) {
            s9 = null;
            v11 = -1;
            goto label_170;
        label_165:
            v9 = v;
            z2 = z;
            z3 = z1;
            s9 = null;
            v11 = -1;
        }
        else {
            String s6 = s.substring(((MatchResult)object0).getRange().getLast() + 1);
            Intrinsics.checkNotNullExpressionValue(s6, "this as java.lang.String).substring(startIndex)");
            String s7 = StringsKt__StringsKt.substringAfterLast(s6, "#", "");
            if(s7.length() > 0) {
                String s8 = StringsKt__StringsKt.substring(s6, kotlin.ranges.c.until(0, s6.length() - s7.length() - 1));
                try {
                    v10 = Integer.parseInt(s7, kotlin.text.b.checkRadix(36));
                }
                catch(NumberFormatException unused_ex) {
                    try {
                        throw new d();  // 初始化器: Ljava/lang/Exception;-><init>()V
                    }
                    catch(NumberFormatException unused_ex) {
                        v10 = -1;
                    }
                }
                s9 = s8;
            }
            else {
                s9 = s6;
                v10 = -1;
            }
            v11 = v10;
        }
    label_170:
        if(s9 == null) {
            if(e0 != null) {
                return e0 == null ? new e(s1, e0.b, v11, arrayList0, v9, list0, z2, z3) : new e(s1, e0.b, e0.c, arrayList0, v9, list0, z2, z3);
            }
            return new e(s1, null, v11, arrayList0, v9, list0, z2, z3);
        }
        return s9 != null || e0 == null ? new e(s1, s9, v11, arrayList0, v9, list0, z2, z3) : new e(s1, s9, e0.c, arrayList0, v9, list0, z2, z3);
    }

    public static final MatchResult m(ObjectRef ref$ObjectRef0) {
        MatchResult matchResult0 = (MatchResult)ref$ObjectRef0.element;
        if(matchResult0 != null) {
            ref$ObjectRef0.element = matchResult0.next();
        }
        return (MatchResult)ref$ObjectRef0.element;
    }

    @UiToolingDataApi
    @Nullable
    public static final Object mapTree(@NotNull CompositionData compositionData0, @NotNull Function3 function30, @NotNull ContextCache contextCache0) {
        CompositionGroup compositionGroup0 = (CompositionGroup)CollectionsKt___CollectionsKt.firstOrNull(compositionData0.getCompositionGroups());
        if(compositionGroup0 == null) {
            return null;
        }
        a a0 = new a(function30, contextCache0.getContexts$ui_tooling_data_release());
        ArrayList arrayList0 = new ArrayList();
        a0.b(compositionGroup0, 0, arrayList0);
        return CollectionsKt___CollectionsKt.firstOrNull(arrayList0);
    }

    public static Object mapTree$default(CompositionData compositionData0, Function3 function30, ContextCache contextCache0, int v, Object object0) {
        if((v & 2) != 0) {
            contextCache0 = new ContextCache();
        }
        return SlotTreeKt.mapTree(compositionData0, function30, contextCache0);
    }

    @NotNull
    public static final IntRect union(@NotNull IntRect intRect0, @NotNull IntRect intRect1) {
        IntRect intRect2 = SlotTreeKt.a;
        if(Intrinsics.areEqual(intRect0, intRect2)) {
            return intRect1;
        }
        return Intrinsics.areEqual(intRect1, intRect2) ? intRect0 : new IntRect(Math.min(intRect0.getLeft(), intRect1.getLeft()), Math.min(intRect0.getTop(), intRect1.getTop()), Math.max(intRect0.getRight(), intRect1.getRight()), Math.max(intRect0.getBottom(), intRect1.getBottom()));
    }
}

