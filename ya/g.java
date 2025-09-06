package ya;

import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.kakao.kandinsky.sticker.ui.StickerListKt.StickerList.4.1.invoke..inlined.items.default.1;
import com.kakao.kandinsky.sticker.ui.StickerListKt.StickerList.4.1.invoke..inlined.items.default.4;
import com.kakao.kandinsky.sticker.ui.StickerListKt.StickerList.4.1.invoke..inlined.items.default.5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ImmutableList;

public final class g extends Lambda implements Function1 {
    public final ImmutableList w;
    public final float x;
    public final Function1 y;

    public g(ImmutableList immutableList0, float f, Function1 function10) {
        this.w = immutableList0;
        this.x = f;
        this.y = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyGridScope)object0), "$this$LazyVerticalGrid");
        StickerListKt.StickerList.4.1.invoke..inlined.items.default.4 stickerListKt$StickerList$4$1$invoke$$inlined$items$default$40 = new StickerListKt.StickerList.4.1.invoke..inlined.items.default.4(StickerListKt.StickerList.4.1.invoke..inlined.items.default.1.INSTANCE, this.w);
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0x29B3C0FE, true, new StickerListKt.StickerList.4.1.invoke..inlined.items.default.5(this.w, this.x, this.y));
        ((LazyGridScope)object0).items(this.w.size(), null, null, stickerListKt$StickerList$4$1$invoke$$inlined$items$default$40, composableLambda0);
        return Unit.INSTANCE;
    }
}

