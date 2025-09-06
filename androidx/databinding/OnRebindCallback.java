package androidx.databinding;

public abstract class OnRebindCallback {
    public void onBound(ViewDataBinding viewDataBinding0) {
    }

    public void onCanceled(ViewDataBinding viewDataBinding0) {
    }

    public boolean onPreBind(ViewDataBinding viewDataBinding0) {
        return true;
    }
}

