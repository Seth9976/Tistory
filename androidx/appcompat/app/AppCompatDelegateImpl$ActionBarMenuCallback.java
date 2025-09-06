package androidx.appcompat.app;

import android.view.View;
import androidx.annotation.Nullable;

interface AppCompatDelegateImpl.ActionBarMenuCallback {
    @Nullable
    View onCreatePanelView(int arg1);

    boolean onPreparePanel(int arg1);
}

