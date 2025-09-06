package d4;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.viewsintegration.EmojiKeyListener.EmojiCompatHandleKeyDownHelper;

public final class e implements KeyListener {
    public final KeyListener a;
    public final EmojiKeyListener.EmojiCompatHandleKeyDownHelper b;

    public e(KeyListener keyListener0) {
        EmojiKeyListener.EmojiCompatHandleKeyDownHelper emojiKeyListener$EmojiCompatHandleKeyDownHelper0 = new EmojiKeyListener.EmojiCompatHandleKeyDownHelper();
        super();
        this.a = keyListener0;
        this.b = emojiKeyListener$EmojiCompatHandleKeyDownHelper0;
    }

    @Override  // android.text.method.KeyListener
    public final void clearMetaKeyState(View view0, Editable editable0, int v) {
        this.a.clearMetaKeyState(view0, editable0, v);
    }

    @Override  // android.text.method.KeyListener
    public final int getInputType() {
        return this.a.getInputType();
    }

    // 去混淆评级： 低(20)
    @Override  // android.text.method.KeyListener
    public final boolean onKeyDown(View view0, Editable editable0, int v, KeyEvent keyEvent0) {
        return this.b.handleKeyDown(editable0, v, keyEvent0) || this.a.onKeyDown(view0, editable0, v, keyEvent0);
    }

    @Override  // android.text.method.KeyListener
    public final boolean onKeyOther(View view0, Editable editable0, KeyEvent keyEvent0) {
        return this.a.onKeyOther(view0, editable0, keyEvent0);
    }

    @Override  // android.text.method.KeyListener
    public final boolean onKeyUp(View view0, Editable editable0, int v, KeyEvent keyEvent0) {
        return this.a.onKeyUp(view0, editable0, v, keyEvent0);
    }
}

