package cb;

import com.kakao.kandinsky.textedit.TextEditorKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function0 {
    public final int w;
    public final String x;

    public f(String s, int v) {
        this.w = v;
        this.x = s;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            TextEditorKt.a(this.x, "fontcolor-degree", null);
            return Unit.INSTANCE;
        }
        TextEditorKt.a(this.x, "backgroundcolor-degree", null);
        return Unit.INSTANCE;
    }
}

