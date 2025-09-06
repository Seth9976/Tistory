package androidx.browser.browseractions;

import android.text.TextUtils.TruncateAt;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;

public final class e implements View.OnClickListener {
    public final TextView a;

    public e(TextView textView0) {
        this.a = textView0;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        TextView textView0 = this.a;
        if(TextViewCompat.getMaxLines(textView0) == 0x7FFFFFFF) {
            textView0.setMaxLines(1);
            textView0.setEllipsize(TextUtils.TruncateAt.END);
            return;
        }
        textView0.setMaxLines(0x7FFFFFFF);
        textView0.setEllipsize(null);
    }
}

