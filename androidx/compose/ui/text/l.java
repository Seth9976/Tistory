package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function2 {
    public static final l A;
    public static final l B;
    public static final l C;
    public static final l D;
    public static final l E;
    public static final l F;
    public static final l G;
    public static final l H;
    public final int w;
    public static final l x;
    public static final l y;
    public static final l z;

    static {
        l.x = new l(2, 0);
        l.y = new l(2, 1);
        l.z = new l(2, 2);
        l.A = new l(2, 3);
        l.B = new l(2, 4);
        l.C = new l(2, 5);
        l.D = new l(2, 6);
        l.E = new l(2, 7);
        l.F = new l(2, 8);
        l.G = new l(2, 9);
        l.H = new l(2, 10);
    }

    public l(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                return CollectionsKt__CollectionsKt.arrayListOf(new Object[]{SaversKt.save(((AnnotatedString)object1).getText()), SaversKt.save(((AnnotatedString)object1).getSpanStyles(), SaversKt.b, ((SaverScope)object0)), SaversKt.save(((AnnotatedString)object1).getParagraphStyles(), SaversKt.b, ((SaverScope)object0)), SaversKt.save(((AnnotatedString)object1).getAnnotations$ui_text_release(), SaversKt.b, ((SaverScope)object0))});
            }
            case 1: {
                SaverScope saverScope1 = (SaverScope)object0;
                return ((BaselineShift)object1).unbox-impl();
            }
            case 2: {
                SaverScope saverScope2 = (SaverScope)object0;
                long v = ((Color)object1).unbox-impl();
                return v == 16L ? false : ColorKt.toArgb-8_81llA(v);
            }
            case 3: {
                SaverScope saverScope3 = (SaverScope)object0;
                return ((FontWeight)object1).getWeight();
            }
            case 4: {
                SaverScope saverScope4 = (SaverScope)object0;
                return ((Locale)object1).toLanguageTag();
            }
            case 5: {
                SaverScope saverScope5 = (SaverScope)object0;
                return ((TextDecoration)object1).getMask();
            }
            case 6: {
                SaverScope saverScope6 = (SaverScope)object0;
                return CollectionsKt__CollectionsKt.arrayListOf(new Float[]{((TextGeometricTransform)object1).getScaleX(), ((TextGeometricTransform)object1).getSkewX()});
            }
            case 7: {
                return CollectionsKt__CollectionsKt.arrayListOf(new Object[]{SaversKt.save(((TextLinkStyles)object1).getStyle(), SaversKt.getSpanStyleSaver(), ((SaverScope)object0)), SaversKt.save(((TextLinkStyles)object1).getFocusedStyle(), SaversKt.getSpanStyleSaver(), ((SaverScope)object0)), SaversKt.save(((TextLinkStyles)object1).getHoveredStyle(), SaversKt.getSpanStyleSaver(), ((SaverScope)object0)), SaversKt.save(((TextLinkStyles)object1).getPressedStyle(), SaversKt.getSpanStyleSaver(), ((SaverScope)object0))});
            }
            case 8: {
                SaverScope saverScope7 = (SaverScope)object0;
                long v1 = ((TextRange)object1).unbox-impl();
                return CollectionsKt__CollectionsKt.arrayListOf(new Integer[]{TextRange.getStart-impl(v1), TextRange.getEnd-impl(v1)});
            }
            case 9: {
                SaverScope saverScope8 = (SaverScope)object0;
                return SaversKt.save(((UrlAnnotation)object1).getUrl());
            }
            default: {
                SaverScope saverScope0 = (SaverScope)object0;
                return SaversKt.save(((VerbatimTtsAnnotation)object1).getVerbatim());
            }
        }
    }
}

