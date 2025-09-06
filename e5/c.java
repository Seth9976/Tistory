package e5;

import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import java.util.Locale;

public final class c extends SingleLineTransformationMethod {
    public Locale a;

    @Override  // android.text.method.ReplacementTransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence0, View view0) {
        CharSequence charSequence1 = super.getTransformation(charSequence0, view0);
        return charSequence1 != null ? charSequence1.toString().toUpperCase(this.a) : null;
    }
}

