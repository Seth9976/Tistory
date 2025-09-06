package androidx.compose.material3;

import android.window.OnBackInvokedCallback;
import kotlin.jvm.functions.Function0;

public final class bd implements OnBackInvokedCallback {
    public final Function0 a;

    public bd(Function0 function00) {
        this.a = function00;
    }

    @Override  // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.a.invoke();
    }
}

