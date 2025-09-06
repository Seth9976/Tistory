package hc;

import android.view.KeyEvent;
import android.widget.TextView.OnEditorActionListener;
import android.widget.TextView;
import com.kakao.tistory.presentation.view.bottomsheet.ReportDialogFragment;

public final class e implements TextView.OnEditorActionListener {
    @Override  // android.widget.TextView$OnEditorActionListener
    public final boolean onEditorAction(TextView textView0, int v, KeyEvent keyEvent0) {
        return ReportDialogFragment.a(textView0, v, keyEvent0);
    }
}

