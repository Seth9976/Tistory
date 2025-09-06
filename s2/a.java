package s2;

import androidx.compose.ui.tooling.preview.datasource.LoremIpsum_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.IntRef;

public final class a extends Lambda implements Function0 {
    public final IntRef w;
    public final int x;

    public a(IntRef ref$IntRef0, int v) {
        this.w = ref$IntRef0;
        this.x = v;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int v = this.w.element;
        this.w.element = v + 1;
        return (String)LoremIpsum_androidKt.a.get(v % this.x);
    }
}

