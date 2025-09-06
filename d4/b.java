package d4;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.viewsintegration.EmojiInputConnection.EmojiCompatDeleteHelper;

public final class b extends InputConnectionWrapper {
    public final EditText a;
    public final EmojiInputConnection.EmojiCompatDeleteHelper b;

    public b(EditText editText0, InputConnection inputConnection0, EditorInfo editorInfo0) {
        EmojiInputConnection.EmojiCompatDeleteHelper emojiInputConnection$EmojiCompatDeleteHelper0 = new EmojiInputConnection.EmojiCompatDeleteHelper();
        super(inputConnection0, false);
        this.a = editText0;
        this.b = emojiInputConnection$EmojiCompatDeleteHelper0;
        emojiInputConnection$EmojiCompatDeleteHelper0.updateEditorInfoAttrs(editorInfo0);
    }

    @Override  // android.view.inputmethod.InputConnectionWrapper
    public final boolean deleteSurroundingText(int v, int v1) {
        Editable editable0 = this.a.getEditableText();
        return this.b.handleDeleteSurroundingText(this, editable0, v, v1, false) || super.deleteSurroundingText(v, v1);
    }

    @Override  // android.view.inputmethod.InputConnectionWrapper
    public final boolean deleteSurroundingTextInCodePoints(int v, int v1) {
        Editable editable0 = this.a.getEditableText();
        return this.b.handleDeleteSurroundingText(this, editable0, v, v1, true) || super.deleteSurroundingTextInCodePoints(v, v1);
    }
}

