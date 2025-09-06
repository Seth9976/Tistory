package va;

import com.kakao.kandinsky.core.kdphoto.Signature;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
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
                Intrinsics.checkNotNullParameter(((Signature)object0), "it");
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object0).intValue();
                return Unit.INSTANCE;
            }
            default: {
                ((Boolean)object0).booleanValue();
                return Unit.INSTANCE;
            }
        }
    }
}

