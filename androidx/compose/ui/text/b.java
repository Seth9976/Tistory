package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.LocaleList;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function3 {
    public final int w;
    public final LocaleList x;

    public b(int v, LocaleList localeList0) {
        this.w = v;
        this.x = localeList0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        switch(this.w) {
            case 0: {
                int v = ((Number)object1).intValue();
                int v1 = ((Number)object2).intValue();
                if(v == 0) {
                    String s1 = ((String)object0).substring(0, v1);
                    Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String…ing(startIndex, endIndex)");
                    return StringKt.capitalize(s1, this.x);
                }
                String s2 = ((String)object0).substring(v, v1);
                Intrinsics.checkNotNullExpressionValue(s2, "this as java.lang.String…ing(startIndex, endIndex)");
                return s2;
            }
            case 1: {
                int v2 = ((Number)object1).intValue();
                int v3 = ((Number)object2).intValue();
                if(v2 == 0) {
                    String s3 = ((String)object0).substring(0, v3);
                    Intrinsics.checkNotNullExpressionValue(s3, "this as java.lang.String…ing(startIndex, endIndex)");
                    return StringKt.decapitalize(s3, this.x);
                }
                String s4 = ((String)object0).substring(v2, v3);
                Intrinsics.checkNotNullExpressionValue(s4, "this as java.lang.String…ing(startIndex, endIndex)");
                return s4;
            }
            case 2: {
                String s5 = ((String)object0).substring(((Number)object1).intValue(), ((Number)object2).intValue());
                Intrinsics.checkNotNullExpressionValue(s5, "this as java.lang.String…ing(startIndex, endIndex)");
                return StringKt.toLowerCase(s5, this.x);
            }
            default: {
                String s = ((String)object0).substring(((Number)object1).intValue(), ((Number)object2).intValue());
                Intrinsics.checkNotNullExpressionValue(s, "this as java.lang.String…ing(startIndex, endIndex)");
                return StringKt.toUpperCase(s, this.x);
            }
        }
    }
}

