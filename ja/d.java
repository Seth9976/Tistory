package ja;

import com.kakao.kandinsky.launcher.KandinskyMenu;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.internal.EnumsKt;

public final class d extends Lambda implements Function0 {
    public static final d w;

    static {
        d.w = new d(0);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return EnumsKt.createSimpleEnumSerializer("com.kakao.kandinsky.launcher.KandinskyMenu", KandinskyMenu.values());
    }
}

