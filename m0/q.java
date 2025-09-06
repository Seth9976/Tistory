package m0;

import android.graphics.RectF;
import android.view.inputmethod.CursorAnchorInfo.Builder;
import android.view.inputmethod.EditorBoundsInfo.Builder;
import android.view.inputmethod.EditorBoundsInfo;

public abstract class q {
    public static CursorAnchorInfo.Builder e(CursorAnchorInfo.Builder cursorAnchorInfo$Builder0, EditorBoundsInfo editorBoundsInfo0) {
        return cursorAnchorInfo$Builder0.setEditorBoundsInfo(editorBoundsInfo0);
    }

    public static EditorBoundsInfo.Builder f() {
        return new EditorBoundsInfo.Builder();
    }

    public static EditorBoundsInfo.Builder g(EditorBoundsInfo.Builder editorBoundsInfo$Builder0, RectF rectF0) {
        return editorBoundsInfo$Builder0.setEditorBounds(rectF0);
    }

    public static EditorBoundsInfo h(EditorBoundsInfo.Builder editorBoundsInfo$Builder0) {
        return editorBoundsInfo$Builder0.build();
    }

    public static EditorBoundsInfo.Builder k(EditorBoundsInfo.Builder editorBoundsInfo$Builder0, RectF rectF0) {
        return editorBoundsInfo$Builder0.setHandwritingBounds(rectF0);
    }
}

