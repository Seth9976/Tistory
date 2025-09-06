package u;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.node.DelegatableNode;

public final class l1 implements IndicationNodeFactory {
    public static final l1 a;

    static {
        l1.a = new l1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.compose.foundation.IndicationNodeFactory
    public final DelegatableNode create(InteractionSource interactionSource0) {
        return new k1(interactionSource0);
    }

    @Override  // androidx.compose.foundation.IndicationNodeFactory
    public final boolean equals(Object object0) {
        return object0 == this;
    }

    @Override  // androidx.compose.foundation.IndicationNodeFactory
    public final int hashCode() {
        return -1;
    }
}

