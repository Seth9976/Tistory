package ig;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonNullSerializer;

public final class f extends Lambda implements Function0 {
    public static final f w;

    static {
        f.w = new f(0);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return JsonNullSerializer.INSTANCE;
    }
}

