package androidx.compose.ui.platform;

import android.graphics.RectF;
import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.view.ViewConfiguration;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.SelectRangeGesture;
import android.widget.EditText;

public abstract class m0 {
    public static RectF c(SelectRangeGesture selectRangeGesture0) {
        return selectRangeGesture0.getSelectionStartArea();
    }

    public static GraphemeClusterSegmentFinder d(CharSequence charSequence0, TextPaint textPaint0) {
        return new GraphemeClusterSegmentFinder(charSequence0, textPaint0);
    }

    public static SegmentFinder e(Object object0) {
        return (SegmentFinder)object0;
    }

    public static DeleteGesture f(Object object0) [...] // Inlined contents

    public static void i() {
    }

    public static void q(EditText editText0) {
        editText0.setIsHandwritingDelegate(true);
    }

    public static boolean t(Object object0) {
        return object0 instanceof DeleteGesture;
    }

    public static int v(ViewConfiguration viewConfiguration0) {
        return viewConfiguration0.getScaledHandwritingGestureLineMargin();
    }

    public static boolean y(Object object0) {
        return object0 instanceof SelectRangeGesture;
    }
}

