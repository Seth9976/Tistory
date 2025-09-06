package l2;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function3 {
    public final Spannable w;
    public final Function4 x;

    public a(Spannable spannable0, Function4 function40) {
        this.w = spannable0;
        this.x = function40;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object2).intValue();
        FontFamily fontFamily0 = ((SpanStyle)object0).getFontFamily();
        FontWeight fontWeight0 = ((SpanStyle)object0).getFontWeight();
        if(fontWeight0 == null) {
            fontWeight0 = FontWeight.Companion.getNormal();
        }
        FontStyle fontStyle0 = ((SpanStyle)object0).getFontStyle-4Lr2A7w();
        FontStyle fontStyle1 = FontStyle.box-impl((fontStyle0 == null ? 0 : fontStyle0.unbox-impl()));
        FontSynthesis fontSynthesis0 = ((SpanStyle)object0).getFontSynthesis-ZQGJjVo();
        FontSynthesis fontSynthesis1 = FontSynthesis.box-impl((fontSynthesis0 == null ? 1 : fontSynthesis0.unbox-impl()));
        TypefaceSpan typefaceSpan0 = new TypefaceSpan(((Typeface)this.x.invoke(fontFamily0, fontWeight0, fontStyle1, fontSynthesis1)));
        this.w.setSpan(typefaceSpan0, v, v1, 33);
        return Unit.INSTANCE;
    }
}

