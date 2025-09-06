package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function1 {
    public static final s A;
    public static final s B;
    public static final s C;
    public static final s D;
    public static final s E;
    public static final s F;
    public final int w;
    public static final s x;
    public static final s y;
    public static final s z;

    static {
        s.x = new s(1, 0);
        s.y = new s(1, 1);
        s.z = new s(1, 2);
        s.A = new s(1, 3);
        s.B = new s(1, 4);
        s.C = new s(1, 5);
        s.D = new s(1, 6);
        s.E = new s(1, 7);
        s.F = new s(1, 8);
    }

    public s(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        SpanStyle spanStyle3;
        SpanStyle spanStyle2;
        SpanStyle spanStyle1;
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Float");
                return BaselineShift.box-impl(BaselineShift.constructor-impl(((float)(((Float)object0)))));
            }
            case 1: {
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Int");
                return new FontWeight(((int)(((Integer)object0))));
            }
            case 2: {
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.String");
                return new Locale(((String)object0));
            }
            case 3: {
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Int");
                return new TextDecoration(((int)(((Integer)object0))));
            }
            case 4: {
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                return new TextGeometricTransform(((Number)((List)object0).get(0)).floatValue(), ((Number)((List)object0).get(1)).floatValue());
            }
            case 5: {
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object object1 = ((List)object0).get(0);
                Saver saver0 = SaversKt.getSpanStyleSaver();
                SpanStyle spanStyle0 = null;
                if(Intrinsics.areEqual(object1, Boolean.FALSE) && !(saver0 instanceof NonNullValueClassSaver)) {
                    spanStyle1 = null;
                }
                else if(object1 != null) {
                    spanStyle1 = (SpanStyle)saver0.restore(object1);
                }
                else {
                    spanStyle1 = null;
                }
                Object object2 = ((List)object0).get(1);
                Saver saver1 = SaversKt.getSpanStyleSaver();
                if(Intrinsics.areEqual(object2, Boolean.FALSE) && !(saver1 instanceof NonNullValueClassSaver)) {
                    spanStyle2 = null;
                }
                else if(object2 != null) {
                    spanStyle2 = (SpanStyle)saver1.restore(object2);
                }
                else {
                    spanStyle2 = null;
                }
                Object object3 = ((List)object0).get(2);
                Saver saver2 = SaversKt.getSpanStyleSaver();
                if(Intrinsics.areEqual(object3, Boolean.FALSE) && !(saver2 instanceof NonNullValueClassSaver)) {
                    spanStyle3 = null;
                }
                else if(object3 != null) {
                    spanStyle3 = (SpanStyle)saver2.restore(object3);
                }
                else {
                    spanStyle3 = null;
                }
                Object object4 = ((List)object0).get(3);
                Saver saver3 = SaversKt.getSpanStyleSaver();
                if((!Intrinsics.areEqual(object4, Boolean.FALSE) || saver3 instanceof NonNullValueClassSaver) && object4 != null) {
                    spanStyle0 = (SpanStyle)saver3.restore(object4);
                }
                return new TextLinkStyles(spanStyle1, spanStyle2, spanStyle3, spanStyle0);
            }
            case 6: {
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                Object object5 = ((List)object0).get(0);
                Integer integer0 = null;
                Integer integer1 = object5 == null ? null : ((Integer)object5);
                Intrinsics.checkNotNull(integer1);
                int v = integer1.intValue();
                Object object6 = ((List)object0).get(1);
                if(object6 != null) {
                    integer0 = (Integer)object6;
                }
                Intrinsics.checkNotNull(integer0);
                return TextRange.box-impl(TextRangeKt.TextRange(v, integer0.intValue()));
            }
            case 7: {
                String s1 = object0 == null ? null : ((String)object0);
                Intrinsics.checkNotNull(s1);
                return new UrlAnnotation(s1);
            }
            default: {
                String s = object0 == null ? null : ((String)object0);
                Intrinsics.checkNotNull(s);
                return new VerbatimTtsAnnotation(s);
            }
        }
    }
}

