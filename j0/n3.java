package j0;

import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.AnnotatedString.Range;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class n3 extends Lambda implements Function1 {
    public final State A;
    public final TextLinkScope w;
    public final Range x;
    public final State y;
    public final State z;

    public n3(TextLinkScope textLinkScope0, Range annotatedString$Range0, State state0, State state1, State state2) {
        this.w = textLinkScope0;
        this.x = annotatedString$Range0;
        this.y = state0;
        this.z = state1;
        this.A = state2;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        SpanStyle spanStyle4;
        SpanStyle spanStyle2;
        Range annotatedString$Range0 = this.x;
        TextLinkStyles textLinkStyles0 = ((LinkAnnotation)annotatedString$Range0.getItem()).getStyles();
        SpanStyle spanStyle0 = null;
        SpanStyle spanStyle1 = textLinkStyles0 == null ? null : textLinkStyles0.getStyle();
        if(TextLinkScope.access$LinksComposables$lambda$13$lambda$10(this.y)) {
            TextLinkStyles textLinkStyles1 = ((LinkAnnotation)annotatedString$Range0.getItem()).getStyles();
            spanStyle2 = textLinkStyles1 == null ? null : textLinkStyles1.getFocusedStyle();
        }
        else {
            spanStyle2 = null;
        }
        TextLinkScope textLinkScope0 = this.w;
        SpanStyle spanStyle3 = TextLinkScope.access$mergeOrUse(textLinkScope0, spanStyle1, spanStyle2);
        if(TextLinkScope.access$LinksComposables$lambda$13$lambda$9(this.z)) {
            TextLinkStyles textLinkStyles2 = ((LinkAnnotation)annotatedString$Range0.getItem()).getStyles();
            spanStyle4 = textLinkStyles2 == null ? null : textLinkStyles2.getHoveredStyle();
        }
        else {
            spanStyle4 = null;
        }
        SpanStyle spanStyle5 = TextLinkScope.access$mergeOrUse(textLinkScope0, spanStyle3, spanStyle4);
        if(TextLinkScope.access$LinksComposables$lambda$13$lambda$11(this.A)) {
            TextLinkStyles textLinkStyles3 = ((LinkAnnotation)annotatedString$Range0.getItem()).getStyles();
            if(textLinkStyles3 != null) {
                spanStyle0 = textLinkStyles3.getPressedStyle();
            }
        }
        SpanStyle spanStyle6 = TextLinkScope.access$mergeOrUse(textLinkScope0, spanStyle5, spanStyle0);
        if(spanStyle6 != null) {
            ((t2)object0).a.addStyle(spanStyle6, annotatedString$Range0.getStart(), annotatedString$Range0.getEnd());
        }
        return Unit.INSTANCE;
    }
}

