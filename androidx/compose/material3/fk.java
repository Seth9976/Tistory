package androidx.compose.material3;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class fk extends Lambda implements Function1 {
    public static final fk w;

    static {
        fk.w = new fk(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        SheetValue sheetValue0 = (SheetValue)object0;
        return true;
    }
}

