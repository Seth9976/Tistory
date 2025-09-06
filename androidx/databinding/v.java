package androidx.databinding;

import android.view.View;
import android.view.ViewStub.OnInflateListener;
import android.view.ViewStub;

public final class v implements ViewStub.OnInflateListener {
    public final ViewStubProxy a;

    public v(ViewStubProxy viewStubProxy0) {
        this.a = viewStubProxy0;
    }

    @Override  // android.view.ViewStub$OnInflateListener
    public final void onInflate(ViewStub viewStub0, View view0) {
        ViewStubProxy viewStubProxy0 = this.a;
        viewStubProxy0.c = view0;
        DataBindingComponent dataBindingComponent0 = viewStubProxy0.e.mBindingComponent;
        int v = viewStub0.getLayoutResource();
        viewStubProxy0.b = DataBindingUtil.a.getDataBinder(dataBindingComponent0, view0, v);
        viewStubProxy0.a = null;
        ViewStub.OnInflateListener viewStub$OnInflateListener0 = viewStubProxy0.d;
        if(viewStub$OnInflateListener0 != null) {
            viewStub$OnInflateListener0.onInflate(viewStub0, view0);
            viewStubProxy0.d = null;
        }
        viewStubProxy0.e.invalidateAll();
        viewStubProxy0.e.forceExecuteBindings();
    }
}

