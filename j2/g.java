package j2;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function2 {
    public static final g w;

    static {
        g.w = new g(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return CollectionsKt__CollectionsKt.arrayListOf(new Object[]{SaversKt.save(((TextFieldValue)object1).getAnnotatedString(), SaversKt.getAnnotatedStringSaver(), ((SaverScope)object0)), SaversKt.save(TextRange.box-impl(((TextFieldValue)object1).getSelection-d9O1mEE()), SaversKt.getSaver(TextRange.Companion), ((SaverScope)object0))});
    }
}

