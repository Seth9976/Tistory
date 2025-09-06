package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class i0 extends Lambda implements Function2 {
    public static final i0 w;

    static {
        i0.w = new i0(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return CollectionsKt__CollectionsKt.arrayListOf(new Object[]{SaversKt.save(TextUnit.box-impl(((TextIndent)object1).getFirstLine-XSAIIZE()), SaversKt.getSaver(TextUnit.Companion), ((SaverScope)object0)), SaversKt.save(TextUnit.box-impl(((TextIndent)object1).getRestLine-XSAIIZE()), SaversKt.getSaver(TextUnit.Companion), ((SaverScope)object0))});
    }
}

