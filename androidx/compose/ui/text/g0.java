package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g0 extends Lambda implements Function2 {
    public static final g0 w;

    static {
        g0.w = new g0(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return CollectionsKt__CollectionsKt.arrayListOf(new Object[]{SaversKt.save(Color.box-impl(((SpanStyle)object1).getColor-0d7_KjU()), SaversKt.getSaver(Color.Companion), ((SaverScope)object0)), SaversKt.save(TextUnit.box-impl(((SpanStyle)object1).getFontSize-XSAIIZE()), SaversKt.getSaver(TextUnit.Companion), ((SaverScope)object0)), SaversKt.save(((SpanStyle)object1).getFontWeight(), SaversKt.getSaver(FontWeight.Companion), ((SaverScope)object0)), SaversKt.save(((SpanStyle)object1).getFontStyle-4Lr2A7w()), SaversKt.save(((SpanStyle)object1).getFontSynthesis-ZQGJjVo()), -1, SaversKt.save(((SpanStyle)object1).getFontFeatureSettings()), SaversKt.save(TextUnit.box-impl(((SpanStyle)object1).getLetterSpacing-XSAIIZE()), SaversKt.getSaver(TextUnit.Companion), ((SaverScope)object0)), SaversKt.save(((SpanStyle)object1).getBaselineShift-5SSeXJ0(), SaversKt.getSaver(BaselineShift.Companion), ((SaverScope)object0)), SaversKt.save(((SpanStyle)object1).getTextGeometricTransform(), SaversKt.getSaver(TextGeometricTransform.Companion), ((SaverScope)object0)), SaversKt.save(((SpanStyle)object1).getLocaleList(), SaversKt.getSaver(LocaleList.Companion), ((SaverScope)object0)), SaversKt.save(Color.box-impl(((SpanStyle)object1).getBackground-0d7_KjU()), SaversKt.getSaver(Color.Companion), ((SaverScope)object0)), SaversKt.save(((SpanStyle)object1).getTextDecoration(), SaversKt.getSaver(TextDecoration.Companion), ((SaverScope)object0)), SaversKt.save(((SpanStyle)object1).getShadow(), SaversKt.getSaver(Shadow.Companion), ((SaverScope)object0))});
    }
}

