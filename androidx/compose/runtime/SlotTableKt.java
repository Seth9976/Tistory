package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.c;
import kotlin.text.p;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4151:1\n82#2,3:4152\n33#2,4:4155\n85#2,2:4159\n38#2:4161\n87#2:4162\n1#3:4163\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n3941#1:4152,3\n3941#1:4155,4\n3941#1:4159,2\n3941#1:4161\n3941#1:4162\n*E\n"})
public final class SlotTableKt {
    public static final int a(int v) {
        switch(v) {
            case 0: {
                return 0;
            }
            case 1: 
            case 2: 
            case 4: {
                return 1;
            }
            case 3: 
            case 5: 
            case 6: {
                return 2;
            }
            default: {
                return 3;
            }
        }
    }

    public static final void access$add(MutableIntObjectMap mutableIntObjectMap0, int v, int v1) {
        MutableIntSet mutableIntSet0 = (MutableIntSet)mutableIntObjectMap0.get(v);
        if(mutableIntSet0 == null) {
            mutableIntSet0 = new MutableIntSet(0, 1, null);
            mutableIntObjectMap0.set(v, mutableIntSet0);
        }
        mutableIntSet0.add(v1);
    }

    public static final void access$addAux(int[] arr_v, int v) {
        int v1 = v * 5 + 1;
        arr_v[v1] |= 0x10000000;
    }

    public static final int access$auxIndex(int[] arr_v, int v) {
        return v * 5 < arr_v.length ? SlotTableKt.a(arr_v[v * 5 + 1] >> 29) + arr_v[v * 5 + 4] : arr_v.length;
    }

    public static final boolean access$containsAnyMark(int[] arr_v, int v) {
        return (arr_v[v * 5 + 1] & 0xC000000) != 0;
    }

    public static final boolean access$containsMark(int[] arr_v, int v) {
        return (arr_v[v * 5 + 1] & 0x4000000) != 0;
    }

    public static final int access$dataAnchor(int[] arr_v, int v) {
        return arr_v[v * 5 + 4];
    }

    public static final List access$dataAnchors(int[] arr_v, int v) {
        return SlotTableKt.c(arr_v, c.step(c.until(4, v), 5));
    }

    public static final Anchor access$find(ArrayList arrayList0, int v, int v1) {
        int v2 = SlotTableKt.b(arrayList0, v, v1);
        return v2 < 0 ? null : ((Anchor)arrayList0.get(v2));
    }

    public static final int access$groupInfo(int[] arr_v, int v) {
        return arr_v[v * 5 + 1];
    }

    public static final int access$groupSize(int[] arr_v, int v) {
        return arr_v[v * 5 + 3];
    }

    public static final List access$groupSizes(int[] arr_v, int v) {
        return SlotTableKt.c(arr_v, c.step(c.until(3, v), 5));
    }

    public static final boolean access$hasAux(int[] arr_v, int v) {
        return (arr_v[v * 5 + 1] & 0x10000000) != 0;
    }

    public static final boolean access$hasMark(int[] arr_v, int v) {
        return (arr_v[v * 5 + 1] & 0x8000000) != 0;
    }

    public static final boolean access$hasObjectKey(int[] arr_v, int v) {
        return (arr_v[v * 5 + 1] & 0x20000000) != 0;
    }

    public static final void access$initGroup(int[] arr_v, int v, int v1, boolean z, boolean z1, boolean z2, int v2, int v3) {
        arr_v[v * 5] = v1;
        arr_v[v * 5 + 1] = (z ? 0x40000000 : 0) | (z1 ? 0x20000000 : 0) | (z2 ? 0x10000000 : 0);
        arr_v[v * 5 + 2] = v2;
        arr_v[v * 5 + 3] = 0;
        arr_v[v * 5 + 4] = v3;
    }

    public static final boolean access$isNode(int[] arr_v, int v) {
        return (arr_v[v * 5 + 1] & 0x40000000) != 0;
    }

    public static final int access$key(int[] arr_v, int v) {
        return arr_v[v * 5];
    }

    public static final List access$keys(int[] arr_v, int v) {
        return SlotTableKt.c(arr_v, c.step(c.until(0, v), 5));
    }

    public static final int access$locationOf(ArrayList arrayList0, int v, int v1) {
        int v2 = SlotTableKt.b(arrayList0, v, v1);
        return v2 >= 0 ? v2 : -(v2 + 1);
    }

    public static final int access$nodeCount(int[] arr_v, int v) {
        return arr_v[v * 5 + 1] & 0x3FFFFFF;
    }

    public static final List access$nodeCounts(int[] arr_v, int v) {
        ArrayList arrayList0 = SlotTableKt.c(arr_v, c.step(c.until(1, v), 5));
        List list0 = new ArrayList(arrayList0.size());
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            ((ArrayList)list0).add(((int)(((Number)arrayList0.get(v2)).intValue() & 0x3FFFFFF)));
        }
        return list0;
    }

    public static final int access$nodeIndex(int[] arr_v, int v) {
        return arr_v[v * 5 + 4];
    }

    public static final int access$objectKeyIndex(int[] arr_v, int v) {
        return SlotTableKt.a(arr_v[v * 5 + 1] >> 30) + arr_v[v * 5 + 4];
    }

    public static final int access$parentAnchor(int[] arr_v, int v) {
        return arr_v[v * 5 + 2];
    }

    public static final List access$parentAnchors(int[] arr_v, int v) {
        return SlotTableKt.c(arr_v, c.step(c.until(2, v), 5));
    }

    public static final int access$slotAnchor(int[] arr_v, int v) {
        return SlotTableKt.a(arr_v[v * 5 + 1] >> 28) + arr_v[v * 5 + 4];
    }

    public static final String access$summarize(String s, int v) {
        String s1 = p.replace$default(p.replace$default(p.replace$default(p.replace$default(p.replace$default(p.replace$default(p.replace$default(p.replace$default(p.replace$default(p.replace$default(s, "androidx.", "a.", false, 4, null), "compose.", "c.", false, 4, null), "runtime.", "r.", false, 4, null), "internal.", "ι.", false, 4, null), "ui.", "u.", false, 4, null), "Modifier", "μ", false, 4, null), "material.", "m.", false, 4, null), "Function", "λ", false, 4, null), "OpaqueKey", "κ", false, 4, null), "MutableState", "σ", false, 4, null);
        String s2 = s1.substring(0, Math.min(v, s1.length()));
        Intrinsics.checkNotNullExpressionValue(s2, "this as java.lang.String…ing(startIndex, endIndex)");
        return s2;
    }

    public static final void access$updateContainsMark(int[] arr_v, int v, boolean z) {
        int v1 = v * 5 + 1;
        if(z) {
            arr_v[v1] |= 0x4000000;
            return;
        }
        arr_v[v1] &= 0xFBFFFFFF;
    }

    public static final void access$updateDataAnchor(int[] arr_v, int v, int v1) {
        arr_v[v * 5 + 4] = v1;
    }

    public static final void access$updateGroupKey(int[] arr_v, int v, int v1) {
        arr_v[v * 5] = v1;
    }

    public static final void access$updateGroupSize(int[] arr_v, int v, int v1) {
        ComposerKt.runtimeCheck(v1 >= 0);
        arr_v[v * 5 + 3] = v1;
    }

    public static final void access$updateMark(int[] arr_v, int v, boolean z) {
        int v1 = v * 5 + 1;
        if(z) {
            arr_v[v1] |= 0x8000000;
            return;
        }
        arr_v[v1] &= 0xF7FFFFFF;
    }

    public static final void access$updateNodeCount(int[] arr_v, int v, int v1) {
        ComposerKt.runtimeCheck(v1 >= 0 && v1 < 0x3FFFFFF);
        int v2 = v * 5 + 1;
        arr_v[v2] = v1 | arr_v[v2] & 0xFC000000;
    }

    public static final void access$updateParentAnchor(int[] arr_v, int v, int v1) {
        arr_v[v * 5 + 2] = v1;
    }

    public static final int b(ArrayList arrayList0, int v, int v1) {
        int v2 = arrayList0.size() - 1;
        int v3 = 0;
        while(v3 <= v2) {
            int v4 = v3 + v2 >>> 1;
            int v5 = ((Anchor)arrayList0.get(v4)).getLocation$runtime_release();
            if(v5 < 0) {
                v5 += v1;
            }
            int v6 = Intrinsics.compare(v5, v);
            if(v6 < 0) {
                v3 = v4 + 1;
                continue;
            }
            if(v6 > 0) {
                v2 = v4 - 1;
                continue;
            }
            return v4;
        }
        return -(v3 + 1);
    }

    public static final ArrayList c(int[] arr_v, IntProgression intProgression0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: intProgression0) {
            arrayList0.add(((int)arr_v[((Number)object0).intValue()]));
        }
        return arrayList0;
    }
}

