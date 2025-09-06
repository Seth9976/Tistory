package f8;

import android.text.method.PasswordTransformationMethod;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.google.android.material.R.drawable;
import com.google.android.material.R.string;
import com.google.android.material.datepicker.t;
import com.google.android.material.textfield.b;

public final class q extends l {
    public final int e;
    public EditText f;
    public final t g;

    public q(b b0, int v) {
        super(b0);
        this.e = drawable.design_password_eye;
        this.g = new t(this, 10);
        if(v != 0) {
            this.e = v;
        }
    }

    @Override  // f8.l
    public final void b() {
        this.q();
    }

    @Override  // f8.l
    public final int c() {
        return string.password_toggle_content_description;
    }

    @Override  // f8.l
    public final int d() {
        return this.e;
    }

    @Override  // f8.l
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override  // f8.l
    public final boolean k() {
        return true;
    }

    @Override  // f8.l
    public final boolean l() {
        return this.f == null || !(this.f.getTransformationMethod() instanceof PasswordTransformationMethod) ? 1 : 0;
    }

    @Override  // f8.l
    public final void m(EditText editText0) {
        this.f = editText0;
        this.q();
    }

    @Override  // f8.l
    public final void r() {
        EditText editText0 = this.f;
        if(editText0 != null) {
            switch(editText0.getInputType()) {
                case 16: 
                case 0x80: 
                case 0x90: 
                case 0xE0: {
                    this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    break;
                }
            }
        }
    }

    @Override  // f8.l
    public final void s() {
        EditText editText0 = this.f;
        if(editText0 != null) {
            editText0.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}

