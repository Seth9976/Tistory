package f8;

import android.util.SparseArray;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.R.styleable;
import com.google.android.material.textfield.b;

public final class k {
    public final SparseArray a;
    public final b b;
    public final int c;
    public final int d;

    public k(b b0, TintTypedArray tintTypedArray0) {
        this.a = new SparseArray();
        this.b = b0;
        this.c = tintTypedArray0.getResourceId(styleable.TextInputLayout_endIconDrawable, 0);
        this.d = tintTypedArray0.getResourceId(styleable.TextInputLayout_passwordToggleDrawable, 0);
    }
}

