package a;

import androidx.compose.ui.geometry.Rect;
import b.m;
import com.kakao.kandinsky.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class y1 extends Lambda implements Function1 {
    public final b a;

    public y1(b b0) {
        this.a = b0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Rect)object0), "it");
        m m0 = new m(((Rect)object0));
        this.a.sendIntent(m0);
        return Unit.INSTANCE;
    }
}

