package com.google.android.material.snackbar;

import android.os.Message;

public final class j implements SnackbarManager.Callback {
    public final BaseTransientBottomBar a;

    public j(BaseTransientBottomBar baseTransientBottomBar0) {
        this.a = baseTransientBottomBar0;
    }

    @Override  // com.google.android.material.snackbar.SnackbarManager$Callback
    public final void dismiss(int v) {
        Message message0 = BaseTransientBottomBar.C.obtainMessage(1, v, 0, this.a);
        BaseTransientBottomBar.C.sendMessage(message0);
    }

    @Override  // com.google.android.material.snackbar.SnackbarManager$Callback
    public final void show() {
        Message message0 = BaseTransientBottomBar.C.obtainMessage(0, this.a);
        BaseTransientBottomBar.C.sendMessage(message0);
    }
}

