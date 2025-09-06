package z9;

import com.kakao.kandinsky.crop.contract.FlipType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function1 {
    public static final m w;

    static {
        m.w = new m(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((FlipType)object0), "it");
        return Unit.INSTANCE;
    }
}

