package androidx.compose.ui.text.platform;

import androidx.compose.runtime.MutableState;
import androidx.emoji2.text.EmojiCompat.InitCallback;
import k2.e;
import k2.f;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001A\u00020\u00022\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/text/platform/DefaultImpl$getFontLoadState$initCallback$1", "Landroidx/emoji2/text/EmojiCompat$InitCallback;", "", "onInitialized", "()V", "", "throwable", "onFailed", "(Ljava/lang/Throwable;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DefaultImpl.getFontLoadState.initCallback.1 extends InitCallback {
    public final MutableState a;
    public final e b;

    public DefaultImpl.getFontLoadState.initCallback.1(MutableState mutableState0, e e0) {
        this.a = mutableState0;
        this.b = e0;
        super();
    }

    @Override  // androidx.emoji2.text.EmojiCompat$InitCallback
    public void onFailed(@Nullable Throwable throwable0) {
        this.b.a = EmojiCompatStatus_androidKt.access$getFalsey$p();
    }

    @Override  // androidx.emoji2.text.EmojiCompat$InitCallback
    public void onInitialized() {
        this.a.setValue(Boolean.TRUE);
        this.b.a = new f(true);
    }
}

