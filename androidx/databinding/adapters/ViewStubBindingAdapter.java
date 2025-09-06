package androidx.databinding.adapters;

import android.view.ViewStub.OnInflateListener;
import android.view.ViewStub;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;
import androidx.databinding.Untaggable;
import androidx.databinding.ViewStubProxy;

@RestrictTo({Scope.LIBRARY})
@BindingMethods({@BindingMethod(attribute = "android:layout", method = "setLayoutResource", type = ViewStub.class)})
@Untaggable({"android.view.ViewStub"})
public class ViewStubBindingAdapter {
    @BindingAdapter({"android:onInflate"})
    public static void setOnInflateListener(ViewStubProxy viewStubProxy0, ViewStub.OnInflateListener viewStub$OnInflateListener0) {
        viewStubProxy0.setOnInflateListener(viewStub$OnInflateListener0);
    }
}

