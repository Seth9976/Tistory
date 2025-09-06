package f8;

import android.widget.AutoCompleteTextView.OnDismissListener;

public final class h implements AutoCompleteTextView.OnDismissListener {
    public final i a;

    public h(i i0) {
        this.a = i0;
    }

    @Override  // android.widget.AutoCompleteTextView$OnDismissListener
    public final void onDismiss() {
        this.a.m = true;
        this.a.o = System.currentTimeMillis();
        this.a.t(false);
    }
}

