package androidx.databinding;

import android.view.View;
import android.view.ViewStub.OnInflateListener;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ViewStubProxy {
    public ViewStub a;
    public ViewDataBinding b;
    public View c;
    public ViewStub.OnInflateListener d;
    public ViewDataBinding e;

    public ViewStubProxy(@NonNull ViewStub viewStub0) {
        v v0 = new v(this);
        this.a = viewStub0;
        viewStub0.setOnInflateListener(v0);
    }

    @Nullable
    public ViewDataBinding getBinding() {
        return this.b;
    }

    public View getRoot() {
        return this.c;
    }

    @Nullable
    public ViewStub getViewStub() {
        return this.a;
    }

    public boolean isInflated() {
        return this.c != null;
    }

    public void setContainingBinding(@NonNull ViewDataBinding viewDataBinding0) {
        this.e = viewDataBinding0;
    }

    public void setOnInflateListener(@Nullable ViewStub.OnInflateListener viewStub$OnInflateListener0) {
        if(this.a != null) {
            this.d = viewStub$OnInflateListener0;
        }
    }
}

