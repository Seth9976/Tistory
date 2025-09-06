package ye;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat;
import kotlin.text.p;

public final class m extends RenderingFormat {
    @Override  // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
    public final String escape(String s) {
        Intrinsics.checkNotNullParameter(s, "string");
        return p.replace$default(p.replace$default(s, "<", "&lt;", false, 4, null), ">", "&gt;", false, 4, null);
    }
}

