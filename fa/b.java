package fa;

import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.core.kdphoto.Filter;
import com.kakao.kandinsky.filter.contract.EffectMenu;
import com.kakao.kandinsky.filter.contract.FeatureMenu;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public static final b A;
    public static final b B;
    public static final b C;
    public final int w;
    public static final b x;
    public static final b y;
    public static final b z;

    static {
        b.x = new b(1, 0);
        b.y = new b(1, 1);
        b.z = new b(1, 2);
        b.A = new b(1, 3);
        b.B = new b(1, 4);
        b.C = new b(1, 5);
    }

    public b(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((Rect)object0), "<anonymous parameter 0>");
                return Unit.INSTANCE;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((FeatureMenu)object0), "<anonymous parameter 0>");
                return Unit.INSTANCE;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((Filter)object0), "<anonymous parameter 0>");
                return Unit.INSTANCE;
            }
            case 3: {
                ((Number)object0).floatValue();
                return Unit.INSTANCE;
            }
            case 4: {
                Intrinsics.checkNotNullParameter(((EffectMenu)object0), "<anonymous parameter 0>");
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object0).floatValue();
                return Unit.INSTANCE;
            }
        }
    }
}

