package com.kakao.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"Lcom/kakao/common/widget/ScrollWrapperLinearLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ScrollWrapperLinearLayout extends LinearLayout {
    @JvmOverloads
    public ScrollWrapperLinearLayout(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @JvmOverloads
    public ScrollWrapperLinearLayout(@NotNull Context context0, @Nullable AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @JvmOverloads
    public ScrollWrapperLinearLayout(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0, v);
    }

    public ScrollWrapperLinearLayout(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent0) {
        if(motionEvent0 != null && motionEvent0.getAction() == 0 || motionEvent0 != null && motionEvent0.getAction() == 1) {
            this.onTouchEvent(motionEvent0);
        }
        return super.dispatchTouchEvent(motionEvent0);
    }
}

