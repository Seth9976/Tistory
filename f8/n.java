package f8;

import android.view.View.AccessibilityDelegate;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

public final class n extends View.AccessibilityDelegate {
    public final o a;

    public n(o o0) {
        this.a = o0;
        super();
    }

    @Override  // android.view.View$AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfo0);
        EditText editText0 = this.a.h.getEditText();
        if(editText0 != null) {
            accessibilityNodeInfo0.setLabeledBy(editText0);
        }
    }
}

