package com.kakao.tistory.presentation.common.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.android.base.BaseKt;
import com.kakao.tistory.presentation.R.dimen;
import com.kakao.tistory.presentation.R.id;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.common.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J)\u0010\b\u001A\u00020\u00072\b\b\u0001\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\'\u0010\b\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/common/utils/ToolTip;", "", "", "messageStringId", "Landroid/view/View;", "rootView", "paddingBottom", "", "show", "(ILandroid/view/View;I)V", "", "message", "(Ljava/lang/String;Landroid/view/View;I)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ToolTip {
    public static final int $stable;
    @NotNull
    public static final ToolTip INSTANCE;
    public static final int a;
    public static final int b;

    static {
        ToolTip.INSTANCE = new ToolTip();
        ToolTip.a = ScaleUtils.dp2px$default(ScaleUtils.INSTANCE, 30.0f, null, 2, null);
        ToolTip.b = BaseKt.getAppContext().getResources().getDimensionPixelSize(dimen.tooltip_height);
    }

    public static int a(View view0) {
        float f = view0.getY();
        int v = view0.getHeight();
        Logger.INSTANCE.log("rootview Y:" + f + " height:" + v + ", tooltipHeight " + ToolTip.b);
        return Math.max(0, ((int)(view0.getY() + ((float)view0.getHeight()) - ((float)ToolTip.b))));
    }

    public final void show(@StringRes int v, @NotNull View view0, int v1) {
        Intrinsics.checkNotNullParameter(view0, "rootView");
        String s = BaseKt.getAppContext().getString(v);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        this.show(s, view0, v1);
    }

    public final void show(@NotNull String s, @NotNull View view0, int v) {
        View view1;
        Intrinsics.checkNotNullParameter(s, "message");
        Intrinsics.checkNotNullParameter(view0, "rootView");
        Unit unit0 = null;
        if(view0 == null) {
            view1 = null;
        }
        else {
            view1 = LayoutInflater.from(view0.getContext()).inflate(layout.item_toast, null);
            ((TextView)view1.findViewById(id.toast_title_text)).setText(s);
        }
        if(view1 != null) {
            Toast toast0 = Toast.makeText(BaseKt.getAppContext(), "", 0);
            toast0.setView(view1);
            Logger.INSTANCE.log("show paddingBottom: " + v);
            ToolTip.INSTANCE.getClass();
            toast0.setGravity(49, 0, ToolTip.a(view0) - v);
            toast0.show();
            unit0 = Unit.INSTANCE;
        }
        if(unit0 == null) {
            ToastUtils.show$default(ToastUtils.INSTANCE, null, s, 0, 0, 13, null);
        }
    }

    public static void show$default(ToolTip toolTip0, int v, View view0, int v1, int v2, Object object0) {
        if((v2 & 4) != 0) {
            v1 = 0;
        }
        toolTip0.show(v, view0, v1);
    }

    public static void show$default(ToolTip toolTip0, String s, View view0, int v, int v1, Object object0) {
        if((v1 & 4) != 0) {
            v = ToolTip.a;
        }
        toolTip0.show(s, view0, v);
    }
}

