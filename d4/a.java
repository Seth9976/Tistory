package d4;

import android.text.Editable.Factory;
import android.text.Editable;
import androidx.emoji2.text.SpannableBuilder;

public final class a extends Editable.Factory {
    public static final Object a;
    public static volatile a b;
    public static Class c;

    static {
        a.a = new Object();
    }

    @Override  // android.text.Editable$Factory
    public final Editable newEditable(CharSequence charSequence0) {
        Class class0 = a.c;
        return class0 != null ? SpannableBuilder.create(class0, charSequence0) : super.newEditable(charSequence0);
    }
}

