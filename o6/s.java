package o6;

import androidx.compose.runtime.saveable.SaverScope;
import com.google.accompanist.pager.PagerState;
import kotlin.collections.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function2 {
    public static final s w;

    static {
        s.w = new s(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((SaverScope)object0), "$this$listSaver");
        Intrinsics.checkNotNullParameter(((PagerState)object1), "it");
        return k.listOf(((PagerState)object1).getCurrentPage());
    }
}

