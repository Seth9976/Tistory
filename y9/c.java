package y9;

import com.kakao.kandinsky.crop.contract.TouchDragPoint;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function2 {
    public static final c w;

    static {
        c.w = new c(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((TouchDragPoint)object1), "<anonymous parameter 1>");
        return Unit.INSTANCE;
    }
}

