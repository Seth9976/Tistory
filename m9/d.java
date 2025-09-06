package m9;

import com.kakao.editortracker.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function1 {
    public static final d w;

    static {
        d.w = new d(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        Intrinsics.checkNotNullExpressionValue("Tracker", "access$getTAG$p(...)");
        Logger.INSTANCE.error("Tracker", "Tracker response FAILURE : " + ((String)object0), new Object[0]);
        return Unit.INSTANCE;
    }
}

