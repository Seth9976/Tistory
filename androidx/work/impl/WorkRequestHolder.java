package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.WorkRequest;
import androidx.work.impl.model.WorkSpec;
import java.util.Set;
import java.util.UUID;

@RestrictTo({Scope.LIBRARY_GROUP})
public class WorkRequestHolder extends WorkRequest {
    public WorkRequestHolder(@NonNull UUID uUID0, @NonNull WorkSpec workSpec0, @NonNull Set set0) {
        super(uUID0, workSpec0, set0);
    }
}

