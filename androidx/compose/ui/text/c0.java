package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c0 extends Lambda implements Function2 {
    public static final c0 w;

    static {
        c0.w = new c0(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return CollectionsKt__CollectionsKt.arrayListOf(new Object[]{SaversKt.save(TextAlign.box-impl(((ParagraphStyle)object1).getTextAlign-e0LSkKk())), SaversKt.save(TextDirection.box-impl(((ParagraphStyle)object1).getTextDirection-s_7X-co())), SaversKt.save(TextUnit.box-impl(((ParagraphStyle)object1).getLineHeight-XSAIIZE()), SaversKt.getSaver(TextUnit.Companion), ((SaverScope)object0)), SaversKt.save(((ParagraphStyle)object1).getTextIndent(), SaversKt.getSaver(TextIndent.Companion), ((SaverScope)object0))});
    }
}

