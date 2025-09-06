package eb;

import com.kakao.kandinsky.textedit.ui.EditState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function1 {
    public final int w;
    public static final f x;
    public static final f y;
    public static final f z;

    static {
        f.x = new f(1, 0);
        f.y = new f(1, 1);
        f.z = new f(1, 2);
    }

    public f(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((EditState)object0), "it");
                return Unit.INSTANCE;
            }
            case 1: {
                ((Boolean)object0).booleanValue();
                return Unit.INSTANCE;
            }
            default: {
                return Unit.INSTANCE;
            }
        }
    }
}

