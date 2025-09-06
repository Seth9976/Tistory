package ib;

import a5.b;
import com.kakao.kemoticon.Emoticon;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function1 {
    public final int w;
    public static final d x;
    public static final d y;

    static {
        d.x = new d(1, 0);
        d.y = new d(1, 1);
    }

    public d(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            ((Number)object0).intValue();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(((Emoticon)object0), "it");
        return b.m(((Emoticon)object0).getPackId(), ":", ((Emoticon)object0).getId());
    }
}

