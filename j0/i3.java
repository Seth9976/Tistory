package j0;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class i3 extends Lambda implements Function2 {
    public static final i3 w;

    static {
        i3.w = new i3(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        SaverScope saverScope0 = (SaverScope)object0;
        Float float0 = ((TextFieldScrollerPosition)object1).getOffset();
        return ((TextFieldScrollerPosition)object1).getOrientation() == Orientation.Vertical ? CollectionsKt__CollectionsKt.listOf(new Object[]{float0, Boolean.TRUE}) : CollectionsKt__CollectionsKt.listOf(new Object[]{float0, Boolean.FALSE});
    }
}

