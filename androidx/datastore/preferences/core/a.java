package androidx.datastore.preferences.core;

import java.util.Map.Entry;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public static final a w;

    static {
        a.w = new a(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        String s;
        Intrinsics.checkNotNullParameter(((Map.Entry)object0), "entry");
        Object object1 = ((Map.Entry)object0).getValue();
        if(object1 instanceof byte[]) {
            s = ArraysKt___ArraysKt.joinToString$default(((byte[])object1), ", ", "[", "]", 0, null, null, 56, null);
            return "  " + ((Key)((Map.Entry)object0).getKey()).getName() + " = " + s;
        }
        s = String.valueOf(((Map.Entry)object0).getValue());
        return "  " + ((Key)((Map.Entry)object0).getKey()).getName() + " = " + s;
    }
}

