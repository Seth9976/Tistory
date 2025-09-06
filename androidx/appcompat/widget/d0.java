package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.appcompat.R.styleable;
import androidx.emoji2.viewsintegration.EmojiEditTextHelper;

public final class d0 {
    public final EditText a;
    public final EmojiEditTextHelper b;

    public d0(EditText editText0) {
        this.a = editText0;
        this.b = new EmojiEditTextHelper(editText0, false);
    }

    public final KeyListener a(KeyListener keyListener0) {
        return keyListener0 instanceof NumberKeyListener ? keyListener0 : this.b.getKeyListener(keyListener0);
    }

    public final void b(AttributeSet attributeSet0, int v) {
        boolean z = true;
        TypedArray typedArray0 = this.a.getContext().obtainStyledAttributes(attributeSet0, styleable.AppCompatTextView, v, 0);
        try {
            if(typedArray0.hasValue(styleable.AppCompatTextView_emojiCompatEnabled)) {
                z = typedArray0.getBoolean(styleable.AppCompatTextView_emojiCompatEnabled, true);
            }
        }
        finally {
            typedArray0.recycle();
        }
        this.b.setEnabled(z);
    }
}

