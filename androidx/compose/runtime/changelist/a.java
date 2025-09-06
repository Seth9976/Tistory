package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function3 {
    public static final a w;

    static {
        a.w = new a(3);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Applier applier0 = (Applier)object0;
        SlotWriter slotWriter0 = (SlotWriter)object1;
        RememberManager rememberManager0 = (RememberManager)object2;
        return Unit.INSTANCE;
    }
}

