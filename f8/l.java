package f8;

import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.b;

public abstract class l {
    public final TextInputLayout a;
    public final b b;
    public final Context c;
    public final CheckableImageButton d;

    public l(b b0) {
        this.a = b0.a;
        this.b = b0;
        this.c = b0.getContext();
        this.d = b0.g;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public TouchExplorationStateChangeListener h() {
        return null;
    }

    public boolean i(int v) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof i;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText0) {
    }

    public void n(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
    }

    public void o(AccessibilityEvent accessibilityEvent0) {
    }

    public void p(boolean z) {
    }

    public final void q() {
        this.b.f(false);
    }

    public void r() {
    }

    public void s() {
    }
}

