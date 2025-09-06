package v0;

import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function2 {
    public static final m w;

    static {
        m.w = new m(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        SaverScope saverScope0 = (SaverScope)object0;
        return CollectionsKt__CollectionsKt.listOf(new Object[]{((CarouselState)object1).getPagerState$material3_release().getCurrentPage(), ((CarouselState)object1).getPagerState$material3_release().getCurrentPageOffsetFraction(), ((CarouselState)object1).getPagerState$material3_release().getPageCount()});
    }
}

