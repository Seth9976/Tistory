package androidx.databinding;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleOwner;

@RestrictTo({Scope.LIBRARY_GROUP})
interface ObservableReference {
    void addListener(Object arg1);

    w getListener();

    void removeListener(Object arg1);

    void setLifecycleOwner(LifecycleOwner arg1);
}

