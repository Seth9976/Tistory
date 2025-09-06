package w9;

import com.kakao.kandinsky.core.filter.gl.GLBufferTexture;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public static final a w;

    static {
        a.w = new a(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return new GLBufferTexture(((Number)object0).intValue(), ((Number)object1).intValue(), null, 0, 0, false, 60, null);
    }
}

