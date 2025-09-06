package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;

public final class z1 implements WindowRecomposerFactory {
    @Override  // androidx.compose.ui.platform.WindowRecomposerFactory
    public final Recomposer createRecomposer(View view0) {
        return WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer$default(view0, null, null, 3, null);
    }
}

