package kc;

import android.view.KeyEvent;
import android.widget.TextView.OnEditorActionListener;
import android.widget.TextView;
import com.kakao.tistory.presentation.view.common.dialog.EntryPasswordDialogFragment;

public final class d implements TextView.OnEditorActionListener {
    public final EntryPasswordDialogFragment a;

    public d(EntryPasswordDialogFragment entryPasswordDialogFragment0) {
        this.a = entryPasswordDialogFragment0;
    }

    @Override  // android.widget.TextView$OnEditorActionListener
    public final boolean onEditorAction(TextView textView0, int v, KeyEvent keyEvent0) {
        return EntryPasswordDialogFragment.a(this.a, textView0, v, keyEvent0);
    }
}

