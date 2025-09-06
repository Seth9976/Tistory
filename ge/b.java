package ge;

import java.util.Arrays;
import java.util.Map.Entry;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public static final b w;

    static {
        b.w = new b(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        String s1;
        Intrinsics.checkNotNullParameter(((Map.Entry)object0), "entry");
        String s = (String)((Map.Entry)object0).getKey();
        Object object1 = ((Map.Entry)object0).getValue();
        if(object1 instanceof boolean[]) {
            s1 = Arrays.toString(((boolean[])object1));
            Intrinsics.checkNotNullExpressionValue(s1, "toString(this)");
            return s + '=' + s1;
        }
        if(object1 instanceof char[]) {
            s1 = Arrays.toString(((char[])object1));
            Intrinsics.checkNotNullExpressionValue(s1, "toString(this)");
            return s + '=' + s1;
        }
        if(object1 instanceof byte[]) {
            s1 = Arrays.toString(((byte[])object1));
            Intrinsics.checkNotNullExpressionValue(s1, "toString(this)");
            return s + '=' + s1;
        }
        if(object1 instanceof short[]) {
            s1 = Arrays.toString(((short[])object1));
            Intrinsics.checkNotNullExpressionValue(s1, "toString(this)");
            return s + '=' + s1;
        }
        if(object1 instanceof int[]) {
            s1 = Arrays.toString(((int[])object1));
            Intrinsics.checkNotNullExpressionValue(s1, "toString(this)");
            return s + '=' + s1;
        }
        if(object1 instanceof float[]) {
            s1 = Arrays.toString(((float[])object1));
            Intrinsics.checkNotNullExpressionValue(s1, "toString(this)");
            return s + '=' + s1;
        }
        if(object1 instanceof long[]) {
            s1 = Arrays.toString(((long[])object1));
            Intrinsics.checkNotNullExpressionValue(s1, "toString(this)");
            return s + '=' + s1;
        }
        if(object1 instanceof double[]) {
            s1 = Arrays.toString(((double[])object1));
            Intrinsics.checkNotNullExpressionValue(s1, "toString(this)");
            return s + '=' + s1;
        }
        if(object1 instanceof Object[]) {
            s1 = Arrays.toString(((Object[])object1));
            Intrinsics.checkNotNullExpressionValue(s1, "toString(this)");
            return s + '=' + s1;
        }
        return s + '=' + object1.toString();
    }
}

