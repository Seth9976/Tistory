package androidx.emoji2.viewsintegration;

import a7.b;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;
import d4.e;
import d4.i;

public final class EmojiEditTextHelper {
    public final b a;
    public int b;
    public int c;

    public EmojiEditTextHelper(@NonNull EditText editText0) {
        this(editText0, true);
    }

    public EmojiEditTextHelper(@NonNull EditText editText0, boolean z) {
        this.b = 0x7FFFFFFF;
        this.c = 0;
        Preconditions.checkNotNull(editText0, "editText cannot be null");
        this.a = new b(editText0, z);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public int getEmojiReplaceStrategy() {
        return this.c;
    }

    @Nullable
    public KeyListener getKeyListener(@Nullable KeyListener keyListener0) {
        this.a.getClass();
        if(!(keyListener0 instanceof e)) {
            if(keyListener0 == null) {
                return null;
            }
            if(!(keyListener0 instanceof NumberKeyListener)) {
                return new e(keyListener0);
            }
        }
        return keyListener0;
    }

    public int getMaxEmojiCount() {
        return this.b;
    }

    public boolean isEnabled() {
        return ((i)this.a.c).f;
    }

    @Nullable
    public InputConnection onCreateInputConnection(@Nullable InputConnection inputConnection0, @NonNull EditorInfo editorInfo0) {
        if(inputConnection0 == null) {
            return null;
        }
        b b0 = this.a;
        b0.getClass();
        return !(inputConnection0 instanceof d4.b) ? new d4.b(((EditText)b0.b), inputConnection0, editorInfo0) : inputConnection0;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setEmojiReplaceStrategy(int v) {
        this.c = v;
        ((i)this.a.c).e = v;
    }

    public void setEnabled(boolean z) {
        i i0 = (i)this.a.c;
        if(i0.f != z) {
            if(i0.c != null) {
                EmojiCompat.get().unregisterInitCallback(i0.c);
            }
            i0.f = z;
            if(z) {
                int v = EmojiCompat.get().getLoadState();
                i.a(i0.a, v);
            }
        }
    }

    public void setMaxEmojiCount(@IntRange(from = 0L) int v) {
        Preconditions.checkArgumentNonnegative(v, "maxEmojiCount should be greater than 0");
        this.b = v;
        ((i)this.a.c).d = v;
    }
}

