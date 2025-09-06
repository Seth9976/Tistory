package androidx.databinding;

public final class a extends OnPropertyChangedCallback {
    public final b a;

    public a(b b0) {
        this.a = b0;
        super();
    }

    @Override  // androidx.databinding.Observable$OnPropertyChangedCallback
    public final void onPropertyChanged(Observable observable0, int v) {
        this.a.notifyChange();
    }
}

