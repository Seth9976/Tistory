package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R.styleable;
import androidx.core.widget.PopupWindowCompat;

class AppCompatPopupWindow extends PopupWindow {
    public AppCompatPopupWindow(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v) {
        super(context0, attributeSet0, v);
        this.a(context0, attributeSet0, v, 0);
    }

    public final void a(Context context0, AttributeSet attributeSet0, int v, int v1) {
        TintTypedArray tintTypedArray0 = TintTypedArray.obtainStyledAttributes(context0, attributeSet0, styleable.PopupWindow, v, v1);
        if(tintTypedArray0.hasValue(styleable.PopupWindow_overlapAnchor)) {
            PopupWindowCompat.setOverlapAnchor(this, tintTypedArray0.getBoolean(styleable.PopupWindow_overlapAnchor, false));
        }
        this.setBackgroundDrawable(tintTypedArray0.getDrawable(styleable.PopupWindow_android_popupBackground));
        tintTypedArray0.recycle();
    }
}

