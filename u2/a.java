package u2;

import android.view.View;
import androidx.compose.ui.platform.m;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final int w;
    public static final a x;
    public static final a y;
    public static final a z;

    static {
        a.x = new a(1, 0);
        a.y = new a(1, 1);
        a.z = new a(1, 2);
    }

    public a(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                ((AndroidViewHolder)object0).getHandler().post(new m(((AndroidViewHolder)object0).n, 3));
                return Unit.INSTANCE;
            }
            case 1: {
                SemanticsPropertyReceiver semanticsPropertyReceiver0 = (SemanticsPropertyReceiver)object0;
                return Unit.INSTANCE;
            }
            default: {
                View view0 = (View)object0;
                return Unit.INSTANCE;
            }
        }
    }
}

