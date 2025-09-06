package j0;

import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.internal.PropertyReference1Impl;

public final class h2 extends PropertyReference1Impl {
    public static final h2 b;

    static {
        h2.b = new h2(KeyEvent_androidKt.class, "isCtrlPressed", "isCtrlPressed-ZmokQxo(Landroid/view/KeyEvent;)Z", 1);  // 初始化器: Lkotlin/jvm/internal/PropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    }

    @Override  // kotlin.jvm.internal.PropertyReference1Impl
    public final Object get(Object object0) {
        return Boolean.valueOf(KeyEvent_androidKt.isCtrlPressed-ZmokQxo(((KeyEvent)object0).unbox-impl()));
    }
}

