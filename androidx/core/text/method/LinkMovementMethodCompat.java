package androidx.core.text.method;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.Touch;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.core.os.BuildCompat.PrereleaseSdkCheck;
import androidx.core.os.BuildCompat;

public class LinkMovementMethodCompat extends LinkMovementMethod {
    public static LinkMovementMethodCompat a;

    @NonNull
    public static LinkMovementMethodCompat getInstance() {
        if(LinkMovementMethodCompat.a == null) {
            LinkMovementMethodCompat.a = new LinkMovementMethodCompat();  // 初始化器: Landroid/text/method/LinkMovementMethod;-><init>()V
        }
        return LinkMovementMethodCompat.a;
    }

    @Override  // android.text.method.LinkMovementMethod
    @OptIn(markerClass = {PrereleaseSdkCheck.class})
    public boolean onTouchEvent(@Nullable TextView textView0, @Nullable Spannable spannable0, @Nullable MotionEvent motionEvent0) {
        if(!BuildCompat.isAtLeastV()) {
            switch(motionEvent0.getAction()) {
                case 0: 
                case 1: {
                    int v = (int)motionEvent0.getX();
                    int v1 = (int)motionEvent0.getY();
                    int v2 = textView0.getTotalPaddingLeft();
                    int v3 = textView0.getTotalPaddingTop();
                    int v4 = textView0.getScrollX();
                    int v5 = textView0.getScrollY() + (v1 - v3);
                    Layout layout0 = textView0.getLayout();
                    if(v5 < 0 || v5 > layout0.getHeight()) {
                        Selection.removeSelection(spannable0);
                        return Touch.onTouchEvent(textView0, spannable0, motionEvent0);
                    }
                    int v6 = layout0.getLineForVertical(v5);
                    float f = (float)(v4 + (v - v2));
                    if(f < layout0.getLineLeft(v6) || f > layout0.getLineRight(v6)) {
                        Selection.removeSelection(spannable0);
                        return Touch.onTouchEvent(textView0, spannable0, motionEvent0);
                    }
                    break;
                }
                default: {
                    return super.onTouchEvent(textView0, spannable0, motionEvent0);
                }
            }
        }
        return super.onTouchEvent(textView0, spannable0, motionEvent0);
    }
}

