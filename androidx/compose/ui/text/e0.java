package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class e0 extends Lambda implements Function2 {
    public static final e0 w;

    static {
        e0.w = new e0(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return CollectionsKt__CollectionsKt.arrayListOf(new Object[]{SaversKt.save(Color.box-impl(((Shadow)object1).getColor-0d7_KjU()), SaversKt.getSaver(Color.Companion), ((SaverScope)object0)), SaversKt.save(Offset.box-impl(((Shadow)object1).getOffset-F1C5BW0()), SaversKt.getSaver(Offset.Companion), ((SaverScope)object0)), SaversKt.save(((Shadow)object1).getBlurRadius())});
    }
}

