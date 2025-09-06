package androidx.core.view;

import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import androidx.annotation.DoNotInline;

public abstract class m {
    @DoNotInline
    public static void a(DragAndDropPermissions dragAndDropPermissions0) {
        dragAndDropPermissions0.release();
    }

    @DoNotInline
    public static DragAndDropPermissions b(Activity activity0, DragEvent dragEvent0) {
        return activity0.requestDragAndDropPermissions(dragEvent0);
    }
}

