package androidx.databinding;

public final class i extends NotifierCallback {
    @Override  // androidx.databinding.CallbackRegistry$NotifierCallback
    public final void onNotifyCallback(Object object0, Object object1, int v, Object object2) {
        Void void0 = (Void)object2;
        switch(v) {
            case 1: {
                if(!((OnRebindCallback)object0).onPreBind(((ViewDataBinding)object1))) {
                    ((ViewDataBinding)object1).mRebindHalted = true;
                }
                return;
            }
            case 2: {
                return;
            }
            case 3: {
            }
        }
    }
}

