package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.coroutines.Continuation;

public final class h implements TypefaceLoader {
    public static final h a;

    static {
        h.a = new h();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.compose.ui.text.font.AndroidFont$TypefaceLoader
    public final Object awaitLoad(Context context0, AndroidFont androidFont0, Continuation continuation0) {
        throw new UnsupportedOperationException("All preloaded fonts are optional local.");
    }

    @Override  // androidx.compose.ui.text.font.AndroidFont$TypefaceLoader
    public final Typeface loadBlocking(Context context0, AndroidFont androidFont0) {
        b b0 = androidFont0 instanceof b ? ((b)androidFont0) : null;
        return b0 == null ? null : PlatformTypefaces_androidKt.PlatformTypefaces().optionalOnDeviceFontFamilyByName-78DK7lM(b0.d, b0.e, b0.f, b0.getVariationSettings(), context0);
    }
}

