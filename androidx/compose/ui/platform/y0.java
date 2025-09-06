package androidx.compose.ui.platform;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class y0 extends Lambda implements Function0 {
    public static final y0 w;

    static {
        y0.w = new y0(0);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CompositionLocalsKt.access$noLocalProvidedFor("LocalFontLoader");
        throw new KotlinNothingValueException();
    }
}

