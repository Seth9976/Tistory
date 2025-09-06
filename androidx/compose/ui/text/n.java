package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function2 {
    public static final n w;

    static {
        n.w = new n(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ArrayList arrayList0 = new ArrayList(((List)object1).size());
        int v = ((List)object1).size();
        for(int v1 = 0; v1 < v; ++v1) {
            arrayList0.add(SaversKt.save(((Range)((List)object1).get(v1)), SaversKt.c, ((SaverScope)object0)));
        }
        return arrayList0;
    }
}

