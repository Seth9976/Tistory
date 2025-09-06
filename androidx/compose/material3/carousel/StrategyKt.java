package androidx.compose.material3.carousel;

import androidx.collection.FloatList;
import androidx.collection.FloatListKt;
import androidx.collection.MutableFloatList;
import androidx.compose.material3.y3;
import androidx.compose.ui.text.i;
import androidx.compose.ui.util.MathHelpersKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import v0.q;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strategy.kt\nandroidx/compose/material3/carousel/StrategyKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,626:1\n235#2,3:627\n33#2,4:630\n238#2,2:634\n38#2:636\n240#2:637\n277#2,3:638\n69#2,4:641\n280#2,2:645\n74#2:647\n282#2:648\n1549#3:649\n1620#3,3:650\n1855#3,2:653\n*S KotlinDebug\n*F\n+ 1 Strategy.kt\nandroidx/compose/material3/carousel/StrategyKt\n*L\n483#1:627,3\n483#1:630,4\n483#1:634,2\n483#1:636\n483#1:637\n501#1:638,3\n501#1:641,4\n501#1:645,2\n501#1:647\n501#1:648\n562#1:649\n562#1:650,3\n590#1:653,2\n*E\n"})
public final class StrategyKt {
    public static final KeylineList a(KeylineList keylineList0, float f, float f1, float f2, Keyline keyline0, int v) {
        ArrayList arrayList0 = new ArrayList(keylineList0.size());
        int v1 = keylineList0.size();
        for(int v3 = 0; v3 < v1; ++v3) {
            Object object0 = keylineList0.get(v3);
            if(!((Keyline)object0).isAnchor()) {
                arrayList0.add(object0);
            }
        }
        float f3 = f2 / ((float)arrayList0.size());
        KeylineList keylineList1 = KeylineListKt.keylineListOf(f, f1, v, keyline0.getOffset() - f3 / 2.0f + f2, new y3(keylineList0, f3, 6));
        ArrayList arrayList1 = new ArrayList(keylineList1.size());
        int v4 = keylineList1.size();
        for(int v2 = 0; v2 < v4; ++v2) {
            arrayList1.add(Keyline.copy$default(((Keyline)keylineList1.get(v2)), 0.0f, 0.0f, keylineList0.get(v2).getUnadjustedOffset(), false, false, false, 0.0f, 0x7B, null));
        }
        return new KeylineList(arrayList1);
    }

    public static final List access$getEndKeylineSteps(KeylineList keylineList0, float f, float f1, float f2) {
        if(keylineList0.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(keylineList0);
        if(!keylineList0.isLastFocalItemAtEndOfContainer(f)) {
            int v = keylineList0.getLastNonAnchorIndex();
            int v1 = v - keylineList0.getLastFocalIndex();
            if(v1 <= 0 && keylineList0.getLastFocal().getCutoff() > 0.0f) {
                arrayList0.add(StrategyKt.b(keylineList0, 0, 0, f, f1));
                return arrayList0;
            }
            for(int v2 = 0; v2 < v1; ++v2) {
                KeylineList keylineList1 = (KeylineList)CollectionsKt___CollectionsKt.last(arrayList0);
                int v3 = v - v2;
                arrayList0.add(StrategyKt.b(keylineList1, keylineList0.getLastNonAnchorIndex(), (v3 >= CollectionsKt__CollectionsKt.getLastIndex(keylineList0) ? 0 : keylineList1.lastIndexBeforeFocalRangeWithSize(keylineList0.get(v3 + 1).getSize()) + 1), f, f1));
            }
            if(f2 != 0.0f) {
                arrayList0.set(CollectionsKt__CollectionsKt.getLastIndex(arrayList0), StrategyKt.a(((KeylineList)CollectionsKt___CollectionsKt.last(arrayList0)), f, f1, -f2, ((KeylineList)CollectionsKt___CollectionsKt.last(arrayList0)).getLastFocal(), ((KeylineList)CollectionsKt___CollectionsKt.last(arrayList0)).getLastFocalIndex()));
                return arrayList0;
            }
        }
        else if(f2 != 0.0f) {
            arrayList0.add(StrategyKt.a(keylineList0, f, f1, -f2, keylineList0.getLastFocal(), keylineList0.getLastFocalIndex()));
            return arrayList0;
        }
        return arrayList0;
    }

    // 去混淆评级： 低(20)
    public static final float access$getEndShiftDistance(List list0, float f) {
        return list0.isEmpty() ? 0.0f : Math.max(((Keyline)CollectionsKt___CollectionsKt.last(((List)CollectionsKt___CollectionsKt.first(list0)))).getUnadjustedOffset() - ((Keyline)CollectionsKt___CollectionsKt.last(((List)CollectionsKt___CollectionsKt.last(list0)))).getUnadjustedOffset(), f);
    }

    public static final q access$getShiftPointRange(int v, FloatList floatList0, float f) {
        float f1 = floatList0.get(0);
        Iterator iterator0 = c.until(1, v).iterator();
        while(true) {
            float f2 = 0.0f;
            if(!iterator0.hasNext()) {
                break;
            }
            int v1 = ((IntIterator)iterator0).nextInt();
            float f3 = floatList0.get(v1);
            if(f <= f3) {
                if(f > f1) {
                    if(Float.compare(f, f3) >= 0) {
                        return new q(v1 - 1, v1, 1.0f);
                    }
                    f2 = MathHelpersKt.lerp(0.0f, 1.0f, (f - f1) / (f3 - f1));
                }
                return new q(v1 - 1, v1, f2);
            }
            f1 = f3;
        }
        return new q(0, 0, 0.0f);
    }

    public static final List access$getStartKeylineSteps(KeylineList keylineList0, float f, float f1, float f2) {
        if(keylineList0.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(keylineList0);
        if(!keylineList0.isFirstFocalItemAtStartOfContainer()) {
            int v = keylineList0.getFirstNonAnchorIndex();
            int v1 = keylineList0.getFirstFocalIndex() - v;
            if(v1 <= 0 && keylineList0.getFirstFocal().getCutoff() > 0.0f) {
                arrayList0.add(StrategyKt.b(keylineList0, 0, 0, f, f1));
                return arrayList0;
            }
            for(int v2 = 0; v2 < v1; ++v2) {
                KeylineList keylineList1 = (KeylineList)CollectionsKt___CollectionsKt.last(arrayList0);
                int v3 = v + v2;
                int v4 = CollectionsKt__CollectionsKt.getLastIndex(keylineList0);
                if(v3 > 0) {
                    v4 = keylineList1.firstIndexAfterFocalRangeWithSize(keylineList0.get(v3 - 1).getSize()) - 1;
                }
                arrayList0.add(StrategyKt.b(keylineList1, keylineList0.getFirstNonAnchorIndex(), v4, f, f1));
            }
            if(f2 != 0.0f) {
                arrayList0.set(CollectionsKt__CollectionsKt.getLastIndex(arrayList0), StrategyKt.a(((KeylineList)CollectionsKt___CollectionsKt.last(arrayList0)), f, f1, f2, ((KeylineList)CollectionsKt___CollectionsKt.last(arrayList0)).getFirstFocal(), ((KeylineList)CollectionsKt___CollectionsKt.last(arrayList0)).getFirstFocalIndex()));
                return arrayList0;
            }
        }
        else if(f2 != 0.0f) {
            arrayList0.add(StrategyKt.a(keylineList0, f, f1, f2, keylineList0.getFirstFocal(), keylineList0.getFirstFocalIndex()));
            return arrayList0;
        }
        return arrayList0;
    }

    // 去混淆评级： 低(20)
    public static final float access$getStartShiftDistance(List list0, float f) {
        return list0.isEmpty() ? 0.0f : Math.max(((Keyline)CollectionsKt___CollectionsKt.first(((List)CollectionsKt___CollectionsKt.last(list0)))).getUnadjustedOffset() - ((Keyline)CollectionsKt___CollectionsKt.first(((List)CollectionsKt___CollectionsKt.first(list0)))).getUnadjustedOffset(), f);
    }

    public static final FloatList access$getStepInterpolationPoints(float f, List list0, boolean z) {
        FloatList floatList0 = FloatListKt.mutableFloatListOf(0.0f);
        if(f != 0.0f && !list0.isEmpty()) {
            IntRange intRange0 = c.until(1, list0.size());
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(intRange0, 10));
            Iterator iterator0 = intRange0.iterator();
            while(iterator0.hasNext()) {
                int v = ((IntIterator)iterator0).nextInt();
                KeylineList keylineList0 = (KeylineList)list0.get(v - 1);
                KeylineList keylineList1 = (KeylineList)list0.get(v);
                float f1 = z ? ((Keyline)CollectionsKt___CollectionsKt.first(keylineList1)).getUnadjustedOffset() - ((Keyline)CollectionsKt___CollectionsKt.first(keylineList0)).getUnadjustedOffset() : ((Keyline)CollectionsKt___CollectionsKt.last(keylineList0)).getUnadjustedOffset() - ((Keyline)CollectionsKt___CollectionsKt.last(keylineList1)).getUnadjustedOffset();
                arrayList0.add(Boolean.valueOf(((MutableFloatList)floatList0).add((v == CollectionsKt__CollectionsKt.getLastIndex(list0) ? 1.0f : floatList0.get(v - 1) + f1 / f))));
            }
        }
        return floatList0;
    }

    public static final float access$lerp(float f, float f1, float f2, float f3, float f4) {
        if(f4 > f2) {
            return f4 >= f3 ? f1 : MathHelpersKt.lerp(f, f1, (f4 - f2) / (f3 - f2));
        }
        return f;
    }

    public static final List access$move(List list0, int v, int v1) {
        Keyline keyline0 = (Keyline)list0.get(v);
        list0.remove(v);
        list0.add(v1, keyline0);
        return list0;
    }

    public static final KeylineList b(KeylineList keylineList0, int v, int v1, float f, float f1) {
        int v2 = v <= v1 ? -1 : 1;
        float f2 = keylineList0.get(v).getSize();
        float f3 = keylineList0.get(v).getCutoff();
        return KeylineListKt.keylineListOf(f, f1, keylineList0.getPivotIndex() + v2, keylineList0.getPivot().getOffset() + (f2 - f3 + f1) * ((float)v2), new i(v, v1, 1, keylineList0));
    }
}

