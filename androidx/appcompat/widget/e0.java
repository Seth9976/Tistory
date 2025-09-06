package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.R.styleable;
import androidx.emoji2.viewsintegration.EmojiTextViewHelper;

public final class e0 {
    public final TextView a;
    public final EmojiTextViewHelper b;

    public e0(TextView textView0) {
        this.a = textView0;
        this.b = new EmojiTextViewHelper(textView0, false);
    }

    public final void a(AttributeSet attributeSet0, int v) {
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
        this.c(z);
    }

    public final void b(boolean z) {
        this.b.setAllCaps(z);
    }

    public final void c(boolean z) {
        this.b.setEnabled(z);
    }
}

