package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.material3.internal.MutableWindowInsets;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class ji extends Lambda implements Function1 {
    public final int w;
    public final MutableWindowInsets x;
    public final WindowInsets y;

    public ji(MutableWindowInsets mutableWindowInsets0, WindowInsets windowInsets0, int v) {
        this.w = v;
        this.x = mutableWindowInsets0;
        this.y = windowInsets0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            WindowInsets windowInsets0 = WindowInsetsKt.exclude(this.y, ((WindowInsets)object0));
            this.x.setInsets(windowInsets0);
            return Unit.INSTANCE;
        }
        WindowInsets windowInsets1 = WindowInsetsKt.exclude(this.y, ((WindowInsets)object0));
        this.x.setInsets(windowInsets1);
        return Unit.INSTANCE;
    }
}

