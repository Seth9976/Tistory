package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.coroutines.Continuation;

public final class a implements TypefaceLoader {
    public static final a a;

    static {
        a.a = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.compose.ui.text.font.AndroidFont$TypefaceLoader
    public final Object awaitLoad(Context context0, AndroidFont androidFont0, Continuation continuation0) {
        throw new UnsupportedOperationException("All preloaded fonts are blocking.");
    }

    @Override  // androidx.compose.ui.text.font.AndroidFont$TypefaceLoader
    public final Typeface loadBlocking(Context context0, AndroidFont androidFont0) {
        AndroidPreloadedFont androidPreloadedFont0 = androidFont0 instanceof AndroidPreloadedFont ? ((AndroidPreloadedFont)androidFont0) : null;
        return androidPreloadedFont0 == null ? null : androidPreloadedFont0.loadCached$ui_text_release(context0);
    }
}

