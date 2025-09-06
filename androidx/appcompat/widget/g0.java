package androidx.appcompat.widget;

import android.app.Activity;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.core.view.ContentInfoCompat.Builder;
import androidx.core.view.ViewCompat;

public abstract class g0 {
    @DoNotInline
    public static boolean a(@NonNull DragEvent dragEvent0, @NonNull TextView textView0, @NonNull Activity activity0) {
        activity0.requestDragAndDropPermissions(dragEvent0);
        int v = textView0.getOffsetForPosition(dragEvent0.getX(), dragEvent0.getY());
        textView0.beginBatchEdit();
        try {
            Selection.setSelection(((Spannable)textView0.getText()), v);
            ViewCompat.performReceiveContent(textView0, new Builder(dragEvent0.getClipData(), 3).build());
            return true;
        }
        finally {
            textView0.endBatchEdit();
        }
    }

    @DoNotInline
    public static boolean b(@NonNull DragEvent dragEvent0, @NonNull View view0, @NonNull Activity activity0) {
        activity0.requestDragAndDropPermissions(dragEvent0);
        ViewCompat.performReceiveContent(view0, new Builder(dragEvent0.getClipData(), 3).build());
        return true;
    }
}

