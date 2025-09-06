package com.kakao.keditor.toolbar.toolbaroverlay.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.kakao.common.util.ResourcesUtilKt;
import com.kakao.common.util.UnitConversionKt;
import com.kakao.keditor.R.color;
import com.kakao.keditor.R.drawable;
import com.kakao.keditor.plugin.attrs.text.ColorType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000F\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001F\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\f\u001A\u00020\tH\u0002J\u0010\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u0010H\u0014J\u000E\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\u000B\u001A\u00020\tR\u000E\u0010\u000B\u001A\u00020\tX\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/kakao/keditor/toolbar/toolbaroverlay/text/TextBackgroundColorMenuBtnView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "getTRes", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setColor", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TextBackgroundColorMenuBtnView extends View {
    private int color;

    public TextBackgroundColorMenuBtnView(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0);
    }

    public TextBackgroundColorMenuBtnView(@NotNull Context context0, @NotNull AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(attributeSet0, "attrs");
        super(context0, attributeSet0);
    }

    public TextBackgroundColorMenuBtnView(@NotNull Context context0, @NotNull AttributeSet attributeSet0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(attributeSet0, "attrs");
        super(context0, attributeSet0, v);
    }

    private final int getTRes() {
        Context context0 = this.getContext();
        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
        boolean z = ResourcesUtilKt.isUsingNightModeResources(context0);
        Context context1 = this.getContext();
        Intrinsics.checkNotNullExpressionValue(context1, "getContext(...)");
        ColorType colorType0 = ColorType.Companion.getTypeByDisplayColor(context1, this.color);
        if(colorType0 == null) {
            colorType0 = ColorType.CLEAR;
        }
        int v = colorType0.getSelectImage();
        return this.color == 0 || v == drawable.ke_ic_selected_check_b || z && v == drawable.ke_ic_selected_check_w_invertable || !z && v == drawable.ke_ic_selected_check_b_invertable ? drawable.ke_toolbar_ic_text_bg_t_b : drawable.ke_toolbar_ic_text_bg_t_w;
    }

    @Override  // android.view.View
    public void onDraw(@NotNull Canvas canvas0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        super.onDraw(canvas0);
        Paint paint0 = new Paint();
        paint0.setAntiAlias(true);
        paint0.setColor(this.color);
        RectF rectF0 = new RectF(UnitConversionKt.dp2px(3.0f), UnitConversionKt.dp2px(3.0f), UnitConversionKt.dp2px(25.0f), UnitConversionKt.dp2px(25.0f));
        float f = UnitConversionKt.dp2px(2.5f);
        canvas0.drawRoundRect(rectF0, f, f, paint0);
        int v = this.getTRes();
        Drawable drawable0 = this.getResources().getDrawable(v);
        drawable0.setBounds(UnitConversionKt.dp2pxRoundDown(3.0f), UnitConversionKt.dp2pxRoundDown(3.0f), UnitConversionKt.dp2pxRoundDown(25.0f), UnitConversionKt.dp2pxRoundDown(25.0f));
        drawable0.draw(canvas0);
    }

    public final void setColor(int v) {
        this.color = v == 0 ? this.getResources().getColor(color.ke_toolbar_default_selected_font_background_color) : v;
        this.invalidate();
    }
}

