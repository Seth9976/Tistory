package androidx.core.view;

import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

public final class DragAndDropPermissionsCompat {
    public final DragAndDropPermissions a;

    public DragAndDropPermissionsCompat(DragAndDropPermissions dragAndDropPermissions0) {
        this.a = dragAndDropPermissions0;
    }

    public void release() {
        m.a(this.a);
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static DragAndDropPermissionsCompat request(@NonNull Activity activity0, @NonNull DragEvent dragEvent0) {
        DragAndDropPermissions dragAndDropPermissions0 = m.b(activity0, dragEvent0);
        return dragAndDropPermissions0 == null ? null : new DragAndDropPermissionsCompat(dragAndDropPermissions0);
    }
}

