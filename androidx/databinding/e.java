package androidx.databinding;

public final class e extends NotifierCallback {
    @Override  // androidx.databinding.CallbackRegistry$NotifierCallback
    public final void onNotifyCallback(Object object0, Object object1, int v, Object object2) {
        ((OnMapChangedCallback)object0).onMapChanged(((ObservableMap)object1), object2);
    }
}

