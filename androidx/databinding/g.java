package androidx.databinding;

public final class g extends NotifierCallback {
    @Override  // androidx.databinding.CallbackRegistry$NotifierCallback
    public final void onNotifyCallback(Object object0, Object object1, int v, Object object2) {
        Void void0 = (Void)object2;
        ((OnPropertyChangedCallback)object0).onPropertyChanged(((Observable)object1), v);
    }
}

