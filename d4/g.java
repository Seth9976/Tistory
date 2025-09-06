package d4;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import g.b;

public final class g extends b {
    public final f b;

    public g(TextView textView0) {
        this.b = new f(textView0);
    }

    // 去混淆评级： 低(30)
    @Override  // g.b
    public final void C(boolean z) {
    }

    @Override  // g.b
    public final void D(boolean z) {
        this.b.d = z;
    }

    // 去混淆评级： 低(30)
    @Override  // g.b
    public final void K() {
    }

    // 去混淆评级： 低(30)
    @Override  // g.b
    public final TransformationMethod L(TransformationMethod transformationMethod0) {
        return transformationMethod0;
    }

    // 去混淆评级： 低(30)
    @Override  // g.b
    public final InputFilter[] o(InputFilter[] arr_inputFilter) {
        return arr_inputFilter;
    }

    @Override  // g.b
    public final boolean r() {
        return this.b.d;
    }
}

