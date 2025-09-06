package ra;

import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.kakao.kandinsky.selector.SelectorGridKt.SelectorGrid.1.invoke..inlined.items.default.1;
import com.kakao.kandinsky.selector.SelectorGridKt.SelectorGrid.1.invoke..inlined.items.default.4;
import com.kakao.kandinsky.selector.SelectorGridKt.SelectorGrid.1.invoke..inlined.items.default.5;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function1 {
    public final List w;
    public final Function4 x;

    public o(List list0, Function4 function40) {
        this.w = list0;
        this.x = function40;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyGridScope)object0), "$this$LazyVerticalGrid");
        SelectorGridKt.SelectorGrid.1.invoke..inlined.items.default.4 selectorGridKt$SelectorGrid$1$invoke$$inlined$items$default$40 = new SelectorGridKt.SelectorGrid.1.invoke..inlined.items.default.4(SelectorGridKt.SelectorGrid.1.invoke..inlined.items.default.1.INSTANCE, this.w);
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0x29B3C0FE, true, new SelectorGridKt.SelectorGrid.1.invoke..inlined.items.default.5(this.w, this.x));
        ((LazyGridScope)object0).items(this.w.size(), null, null, selectorGridKt$SelectorGrid$1$invoke$$inlined$items$default$40, composableLambda0);
        return Unit.INSTANCE;
    }
}

