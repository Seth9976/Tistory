package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k0 extends Lambda implements Function2 {
    public static final k0 w;

    static {
        k0.w = new k0(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        SaverScope saverScope0 = (SaverScope)object0;
        long v = ((TextUnit)object1).unbox-impl();
        return TextUnit.equals-impl0(v, 0x7FC00000L) ? false : CollectionsKt__CollectionsKt.arrayListOf(new Object[]{TextUnit.getValue-impl(v), SaversKt.save(TextUnitType.box-impl(TextUnit.getType-UIouoOA(v)))});
    }
}

