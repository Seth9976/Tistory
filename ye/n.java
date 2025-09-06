package ye;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat;

public final class n extends RenderingFormat {
    @Override  // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
    public final String escape(String s) {
        Intrinsics.checkNotNullParameter(s, "string");
        return s;
    }
}

