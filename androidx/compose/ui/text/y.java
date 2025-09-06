package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function2 {
    public static final y w;

    static {
        y.w = new y(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        List list0 = ((LocaleList)object1).getLocaleList();
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            arrayList0.add(SaversKt.save(((Locale)list0.get(v1)), SaversKt.getSaver(Locale.Companion), ((SaverScope)object0)));
        }
        return arrayList0;
    }
}

