package d4;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.EmojiCompat;

public final class d implements InputFilter {
    public final TextView a;
    public c b;

    public d(TextView textView0) {
        this.a = textView0;
    }

    @Override  // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence0, int v, int v1, Spanned spanned0, int v2, int v3) {
        TextView textView0 = this.a;
        if(textView0.isInEditMode()) {
            return charSequence0;
        }
        switch(EmojiCompat.get().getLoadState()) {
            case 1: {
                if((v3 != 0 || v2 != 0 || spanned0.length() != 0 || charSequence0 != textView0.getText()) && charSequence0 != null) {
                    if(v != 0 || v1 != charSequence0.length()) {
                        charSequence0 = charSequence0.subSequence(v, v1);
                    }
                    return EmojiCompat.get().process(charSequence0, 0, charSequence0.length());
                }
                return charSequence0;
            }
            case 0: 
            case 3: {
                EmojiCompat emojiCompat0 = EmojiCompat.get();
                if(this.b == null) {
                    this.b = new c(textView0, this);
                }
                emojiCompat0.registerInitCallback(this.b);
                return charSequence0;
            }
            default: {
                return charSequence0;
            }
        }
    }
}

