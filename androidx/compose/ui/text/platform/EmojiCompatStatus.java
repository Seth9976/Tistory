package androidx.compose.ui.text.platform;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import k2.e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0006\u001A\u00020\u00032\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u001A\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/platform/EmojiCompatStatus;", "Landroidx/compose/ui/text/platform/EmojiCompatStatusDelegate;", "newDelegate", "", "setDelegateForTesting$ui_text_release", "(Landroidx/compose/ui/text/platform/EmojiCompatStatusDelegate;)V", "setDelegateForTesting", "Landroidx/compose/runtime/State;", "", "getFontLoaded", "()Landroidx/compose/runtime/State;", "fontLoaded", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class EmojiCompatStatus implements EmojiCompatStatusDelegate {
    public static final int $stable;
    @NotNull
    public static final EmojiCompatStatus INSTANCE;
    public static EmojiCompatStatusDelegate a;

    static {
        EmojiCompatStatus.INSTANCE = new EmojiCompatStatus();  // 初始化器: Ljava/lang/Object;-><init>()V
        EmojiCompatStatus.a = new e();
        EmojiCompatStatus.$stable = 8;
    }

    @Override  // androidx.compose.ui.text.platform.EmojiCompatStatusDelegate
    @NotNull
    public State getFontLoaded() {
        return EmojiCompatStatus.a.getFontLoaded();
    }

    @VisibleForTesting
    public final void setDelegateForTesting$ui_text_release(@Nullable EmojiCompatStatusDelegate emojiCompatStatusDelegate0) {
        if(emojiCompatStatusDelegate0 == null) {
            emojiCompatStatusDelegate0 = new e();
        }
        EmojiCompatStatus.a = emojiCompatStatusDelegate0;
    }
}

