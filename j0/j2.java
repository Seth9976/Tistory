package j0;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.material3.yk;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class j2 extends Lambda implements Function1 {
    public final List w;
    public final yk x;

    public j2(List list0, yk yk0) {
        this.w = list0;
        this.x = yk0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        List list0 = BasicTextKt.access$measureWithTextRangeMeasureConstraints(this.w, ((Function0)this.x.b));
        if(list0 != null) {
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                Pair pair0 = (Pair)list0.get(v1);
                Function0 function00 = (Function0)pair0.component2();
                PlacementScope.place-70tqf50$default(((PlacementScope)object0), ((Placeable)pair0.component1()), (function00 == null ? 0L : ((IntOffset)function00.invoke()).unbox-impl()), 0.0f, 2, null);
            }
        }
        return Unit.INSTANCE;
    }
}

