package androidx.compose.material3;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextRangeLayoutModifier;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupLayout;
import j0.p3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import s0.c;
import s0.g;
import v2.j;

public final class gf implements MeasurePolicy {
    public final int a;
    public final Object b;
    public final Object c;

    public gf(int v, Object object0, Object object1) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        super();
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        ArrayList arrayList2;
        switch(this.a) {
            case 0: {
                Placeable placeable0 = ((Measurable)list0.get(0)).measure-BRTryo0(v);
                Placeable placeable1 = ((Measurable)list0.get(1)).measure-BRTryo0(v);
                return MeasureScope.layout$default(measureScope0, placeable1.getWidth(), placeable1.getHeight(), null, new ff(((DrawerState)this.b), placeable0, placeable1, ((MutableState)this.c)), 4, null);
            }
            case 1: {
                ArrayList arrayList0 = new ArrayList(list0.size());
                int v1 = list0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    Object object0 = list0.get(v2);
                    if(!(((Measurable)object0).getParentData() instanceof TextRangeLayoutModifier)) {
                        arrayList0.add(object0);
                    }
                }
                List list1 = (List)((Function0)this.c).invoke();
                if(list1 == null) {
                    arrayList2 = null;
                }
                else {
                    ArrayList arrayList1 = new ArrayList(list1.size());
                    int v3 = list1.size();
                    for(int v4 = 0; v4 < v3; ++v4) {
                        Rect rect0 = (Rect)list1.get(v4);
                        Pair pair0 = rect0 == null ? null : new Pair(((Measurable)arrayList0.get(v4)).measure-BRTryo0(ConstraintsKt.Constraints$default(0, ((int)(((float)Math.floor(rect0.getWidth())))), 0, ((int)(((float)Math.floor(rect0.getHeight())))), 5, null)), IntOffset.box-impl(IntOffsetKt.IntOffset(Math.round(rect0.getLeft()), Math.round(rect0.getTop()))));
                        if(pair0 != null) {
                            arrayList1.add(pair0);
                        }
                    }
                    arrayList2 = arrayList1;
                }
                ArrayList arrayList3 = new ArrayList(list0.size());
                int v5 = list0.size();
                for(int v6 = 0; v6 < v5; ++v6) {
                    Object object1 = list0.get(v6);
                    if(((Measurable)object1).getParentData() instanceof TextRangeLayoutModifier) {
                        arrayList3.add(object1);
                    }
                }
                return MeasureScope.layout$default(measureScope0, Constraints.getMaxWidth-impl(v), Constraints.getMaxHeight-impl(v), null, new p3(arrayList2, BasicTextKt.access$measureWithTextRangeMeasureConstraints(arrayList3, ((Function0)this.b))), 4, null);
            }
            case 2: {
                ((g)this.b).J = (LayoutDirection)this.c;
                return MeasureScope.layout$default(measureScope0, 0, 0, null, c.w, 4, null);
            }
            default: {
                ((PopupLayout)this.b).setParentLayoutDirection(((LayoutDirection)this.c));
                return MeasureScope.layout$default(measureScope0, 0, 0, null, j.w, 4, null);
            }
        }
    }
}

