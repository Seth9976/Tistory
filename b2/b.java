package b2;

import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.draw.DrawCacheModifier;
import androidx.compose.ui.node.BackwardsCompatNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function0 {
    public final Element w;
    public final BackwardsCompatNode x;

    public b(Element modifier$Element0, BackwardsCompatNode backwardsCompatNode0) {
        this.w = modifier$Element0;
        this.x = backwardsCompatNode0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((DrawCacheModifier)this.w).onBuildCache(this.x);
        return Unit.INSTANCE;
    }
}

