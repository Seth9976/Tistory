package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.impl.model.WorkGenerationalId;

@RestrictTo({Scope.LIBRARY_GROUP})
public interface ExecutionListener {
    void onExecuted(@NonNull WorkGenerationalId arg1, boolean arg2);
}

