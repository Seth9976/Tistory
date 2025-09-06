package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.kakao.kandinsky.core.kdphoto.Filter;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class h8 extends Lambda implements Function1 {
    public final int w;
    public final List x;

    public h8(List list0, int v) {
        this.w = v;
        this.x = list0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                SemanticsPropertiesKt.setCustomActions(((SemanticsPropertyReceiver)object0), this.x);
                return Unit.INSTANCE;
            }
            case 1: {
                return ((Filter)this.x.get(((Number)object0).intValue())).getAlias();
            }
            case 2: {
                List list0 = this.x;
                int v1 = list0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    ((Function1)list0.get(v2)).invoke(object0);
                }
                return Unit.INSTANCE;
            }
            case 3: {
                return Boolean.valueOf(this.x.contains(object0));
            }
            default: {
                int v = ((Number)object0).intValue();
                return v < 0 || v >= this.x.size();
            }
        }
    }
}

