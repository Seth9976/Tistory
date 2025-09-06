package b2;

import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.node.BackwardsCompatNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function0 {
    public final BackwardsCompatNode w;

    public c(BackwardsCompatNode backwardsCompatNode0) {
        this.w = backwardsCompatNode0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Element modifier$Element0 = this.w.getElement();
        Intrinsics.checkNotNull(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
        ((ModifierLocalConsumer)modifier$Element0).onModifierLocalsUpdated(this.w);
        return Unit.INSTANCE;
    }
}

