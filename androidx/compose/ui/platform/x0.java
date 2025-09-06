package androidx.compose.ui.platform;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class x0 extends Lambda implements Function0 {
    public static final x0 w;

    static {
        x0.w = new x0(0);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CompositionLocalsKt.access$noLocalProvidedFor("LocalFontFamilyResolver");
        throw new KotlinNothingValueException();
    }
}

