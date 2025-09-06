package ta;

import com.kakao.kandinsky.core.kdphoto.TextData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public static final h w;

    static {
        h.w = new h(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        TextData textData0 = (TextData)object0;
        return Unit.INSTANCE;
    }
}

