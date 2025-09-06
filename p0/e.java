package p0;

import androidx.compose.foundation.layout.Arrangement.Vertical;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public final ArrayList A;
    public final ArrayList w;
    public final MeasureScope x;
    public final float y;
    public final int z;

    public e(ArrayList arrayList0, MeasureScope measureScope0, float f, int v, ArrayList arrayList1) {
        this.w = arrayList0;
        this.x = measureScope0;
        this.y = f;
        this.z = v;
        this.A = arrayList1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        MeasureScope measureScope0;
        ArrayList arrayList0 = this.w;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            List list0 = (List)arrayList0.get(v1);
            int v2 = list0.size();
            int[] arr_v = new int[v2];
            for(int v3 = 0; true; ++v3) {
                measureScope0 = this.x;
                if(v3 >= v2) {
                    break;
                }
                arr_v[v3] = ((Placeable)list0.get(v3)).getWidth() + (v3 >= CollectionsKt__CollectionsKt.getLastIndex(list0) ? 0 : measureScope0.roundToPx-0680j_4(this.y));
            }
            Vertical arrangement$Vertical0 = Arrangement.INSTANCE.getBottom();
            int[] arr_v1 = new int[v2];
            for(int v4 = 0; v4 < v2; ++v4) {
                arr_v1[v4] = 0;
            }
            arrangement$Vertical0.arrange(measureScope0, this.z, arr_v, arr_v1);
            int v5 = list0.size();
            for(int v6 = 0; v6 < v5; ++v6) {
                PlacementScope.place$default(((PlacementScope)object0), ((Placeable)list0.get(v6)), arr_v1[v6], ((Number)this.A.get(v1)).intValue(), 0.0f, 4, null);
            }
        }
        return Unit.INSTANCE;
    }
}

