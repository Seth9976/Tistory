package androidx.room;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

public final class e extends Lambda implements Function3 {
    public final String[] w;
    public final ArrayList x;
    public final int y;

    public e(String[] arr_s, ArrayList arrayList0, int v) {
        this.w = arr_s;
        this.x = arrayList0;
        this.y = v;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object0).intValue();
        int v1 = ((Number)object1).intValue();
        Intrinsics.checkNotNullParameter(((List)object2), "resultColumnsSublist");
        String[] arr_s = this.w;
        ArrayList arrayList0 = new ArrayList(arr_s.length);
        int v2 = 0;
        while(true) {
            if(v2 >= arr_s.length) {
                ((List)this.x.get(this.y)).add(new b(arrayList0, new IntRange(v, v1 - 1)));
                break;
            }
            String s = arr_s[v2];
            for(Object object3: ((List)object2)) {
                if(!Intrinsics.areEqual(s, ((c)object3).a)) {
                    continue;
                }
                goto label_14;
            }
            object3 = null;
        label_14:
            if(((c)object3) == null) {
                break;
            }
            arrayList0.add(((c)object3).b);
            ++v2;
        }
        return Unit.INSTANCE;
    }
}

