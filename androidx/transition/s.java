package androidx.transition;

import androidx.core.os.CancellationSignal.OnCancelListener;

public final class s implements OnCancelListener {
    public final Transition a;

    public s(Transition transition0) {
        this.a = transition0;
    }

    @Override  // androidx.core.os.CancellationSignal$OnCancelListener
    public final void onCancel() {
        this.a.cancel();
    }
}

