package androidx.window.layout;

import androidx.core.util.Consumer;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;

public final class j implements Consumer {
    public final Channel a;

    public j(Channel channel0) {
        this.a = channel0;
    }

    @Override  // androidx.core.util.Consumer
    public final void accept(Object object0) {
        Intrinsics.checkNotNullExpressionValue(((WindowLayoutInfo)object0), "info");
        this.a.trySend-JP2dKIU(((WindowLayoutInfo)object0));
    }
}

