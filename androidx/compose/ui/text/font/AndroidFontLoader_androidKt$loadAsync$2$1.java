package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat.FontCallback;
import kotlin.Metadata;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"androidx/compose/ui/text/font/AndroidFontLoader_androidKt$loadAsync$2$1", "Landroidx/core/content/res/ResourcesCompat$FontCallback;", "Landroid/graphics/Typeface;", "typeface", "", "onFontRetrieved", "(Landroid/graphics/Typeface;)V", "", "reason", "onFontRetrievalFailed", "(I)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidFontLoader_androidKt.loadAsync.2.1 extends FontCallback {
    public final CancellableContinuationImpl a;
    public final ResourceFont b;

    public AndroidFontLoader_androidKt.loadAsync.2.1(CancellableContinuationImpl cancellableContinuationImpl0, ResourceFont resourceFont0) {
        this.a = cancellableContinuationImpl0;
        this.b = resourceFont0;
        super();
    }

    @Override  // androidx.core.content.res.ResourcesCompat$FontCallback
    public void onFontRetrievalFailed(int v) {
        IllegalStateException illegalStateException0 = new IllegalStateException("Unable to load font " + this.b + " (reason=" + v + ')');
        this.a.cancel(illegalStateException0);
    }

    @Override  // androidx.core.content.res.ResourcesCompat$FontCallback
    public void onFontRetrieved(@NotNull Typeface typeface0) {
        this.a.resumeWith(typeface0);
    }
}

