package d4;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.EmojiCompat;

public final class i implements TextWatcher {
    public final EditText a;
    public final boolean b;
    public h c;
    public int d;
    public int e;
    public boolean f;

    public i(EditText editText0, boolean z) {
        this.d = 0x7FFFFFFF;
        this.e = 0;
        this.a = editText0;
        this.b = z;
        this.f = true;
    }

    public static void a(EditText editText0, int v) {
        if(v == 1 && editText0 != null && editText0.isAttachedToWindow()) {
            Editable editable0 = editText0.getEditableText();
            int v1 = Selection.getSelectionStart(editable0);
            int v2 = Selection.getSelectionEnd(editable0);
            EmojiCompat.get().process(editable0);
            if(v1 >= 0 && v2 >= 0) {
                Selection.setSelection(editable0, v1, v2);
                return;
            }
            if(v1 >= 0) {
                Selection.setSelection(editable0, v1);
                return;
            }
            if(v2 >= 0) {
                Selection.setSelection(editable0, v2);
            }
        }
    }

    @Override  // android.text.TextWatcher
    public final void afterTextChanged(Editable editable0) {
    }

    @Override  // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
    }

    @Override  // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        EditText editText0 = this.a;
        if(!editText0.isInEditMode() && this.f && this.b && v1 <= v2 && charSequence0 instanceof Spannable) {
            switch(EmojiCompat.get().getLoadState()) {
                case 1: {
                    EmojiCompat.get().process(((Spannable)charSequence0), v, v + v2, this.d, this.e);
                    return;
                }
                case 0: 
                case 3: {
                    EmojiCompat emojiCompat0 = EmojiCompat.get();
                    if(this.c == null) {
                        this.c = new h(editText0);
                    }
                    emojiCompat0.registerInitCallback(this.c);
                    break;
                }
            }
        }
    }
}

