package androidx.databinding;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.ref.ReferenceQueue;

@RestrictTo({Scope.LIBRARY_GROUP})
interface CreateWeakListener {
    w create(ViewDataBinding arg1, int arg2, ReferenceQueue arg3);
}

