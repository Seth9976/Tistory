package k2;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.platform.DefaultImpl.getFontLoadState.initCallback.1;
import androidx.compose.ui.text.platform.EmojiCompatStatusDelegate;
import androidx.compose.ui.text.platform.EmojiCompatStatus_androidKt;
import androidx.emoji2.text.EmojiCompat;
import kotlin.jvm.internal.Intrinsics;

public final class e implements EmojiCompatStatusDelegate {
    public State a;

    public e() {
        this.a = null;
    }

    public final State a() {
        EmojiCompat emojiCompat0 = EmojiCompat.get();
        if(emojiCompat0.getLoadState() == 1) {
            return new f(true);
        }
        MutableState mutableState0 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        emojiCompat0.registerInitCallback(new DefaultImpl.getFontLoadState.initCallback.1(mutableState0, this));
        return mutableState0;
    }

    @Override  // androidx.compose.ui.text.platform.EmojiCompatStatusDelegate
    public final State getFontLoaded() {
        State state0 = this.a;
        if(state0 != null) {
            Intrinsics.checkNotNull(state0);
            return state0;
        }
        return EmojiCompatStatus_androidKt.a;
    }
}

