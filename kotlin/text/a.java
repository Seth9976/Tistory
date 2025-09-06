package kotlin.text;

import java.util.LinkedHashMap;
import kotlin.collections.l;
import kotlin.collections.w;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.c;

public final class a extends Lambda implements Function0 {
    public static final a w;

    static {
        a.w = new a(0);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        EnumEntries enumEntries0 = CharDirectionality.getEntries();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(l.collectionSizeOrDefault(enumEntries0, 10)), 16));
        for(Object object0: enumEntries0) {
            linkedHashMap0.put(((CharDirectionality)object0).getValue(), object0);
        }
        return linkedHashMap0;
    }
}

