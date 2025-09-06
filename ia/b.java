package ia;

import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.home.contract.HomeMenu;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final int w;
    public static final b x;
    public static final b y;
    public static final b z;

    static {
        b.x = new b(1, 0);
        b.y = new b(1, 1);
        b.z = new b(1, 2);
    }

    public b(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((HomeMenu)object0), "it");
                return Unit.INSTANCE;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((Rect)object0), "it");
                return Unit.INSTANCE;
            }
            default: {
                Intrinsics.checkNotNullParameter(((Rect)object0), "<anonymous parameter 0>");
                return Unit.INSTANCE;
            }
        }
    }
}

