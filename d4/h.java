package d4;

import android.widget.EditText;
import androidx.emoji2.text.EmojiCompat.InitCallback;
import java.lang.ref.WeakReference;

public final class h extends InitCallback {
    public final WeakReference a;

    public h(EditText editText0) {
        this.a = new WeakReference(editText0);
    }

    @Override  // androidx.emoji2.text.EmojiCompat$InitCallback
    public final void onInitialized() {
        super.onInitialized();
        i.a(((EditText)this.a.get()), 1);
    }
}

