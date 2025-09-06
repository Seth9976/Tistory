package com.kakao.keditor.toolbar.toolbaroverlay.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.kakao.common.util.UnitConversionKt;
import com.kakao.keditor.R.color;
import com.kakao.keditor.R.drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000F\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001F\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000FH\u0014J\u000E\u0010\u0010\u001A\u00020\r2\u0006\u0010\u0011\u001A\u00020\tR\u000E\u0010\u000B\u001A\u00020\tX\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/kakao/keditor/toolbar/toolbaroverlay/text/TextColorMenuBtnView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setColor", "colorRGB", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TextColorMenuBtnView extends View {
    private int color;

    public TextColorMenuBtnView(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0);
        this.color = this.getResources().getColor(color.ke_toolbar_default_selected_font_color);
    }

    public TextColorMenuBtnView(@NotNull Context context0, @NotNull AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(attributeSet0, "attrs");
        super(context0, attributeSet0);
        this.color = this.getResources().getColor(color.ke_toolbar_default_selected_font_color);
    }

    public TextColorMenuBtnView(@NotNull Context context0, @NotNull AttributeSet attributeSet0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(attributeSet0, "attrs");
        super(context0, attributeSet0, v);
        this.color = this.getResources().getColor(color.ke_toolbar_default_selected_font_color);
    }

    @Override  // android.view.View
    public void onDraw(@NotNull Canvas canvas0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        super.onDraw(canvas0);
        Drawable drawable0 = this.getResources().getDrawable((this.isSelected() ? drawable.ke_toolbar_ic_text_color_t_selected : drawable.ke_toolbar_ic_text_color_t));
        drawable0.setBounds(UnitConversionKt.dp2pxRoundDown(3.0f), UnitConversionKt.dp2pxRoundDown(3.0f), UnitConversionKt.dp2pxRoundDown(25.0f), UnitConversionKt.dp2pxRoundDown(25.0f));
        drawable0.draw(canvas0);
        Paint paint0 = new Paint();
        paint0.setAntiAlias(true);
        paint0.setColor(this.color);
        float f = (float)UnitConversionKt.dp2pxRoundDown(7.0f);
        canvas0.drawRoundRect(new RectF(UnitConversionKt.dp2px(16.0f), UnitConversionKt.dp2px(15.0f), UnitConversionKt.dp2px(23.0f), UnitConversionKt.dp2px(22.0f)), f, f, paint0);
        paint0.setStyle(Paint.Style.STROKE);
        float f1 = (float)UnitConversionKt.dp2pxRoundDown(1.0f);
        RectF rectF0 = new RectF(UnitConversionKt.dp2px(16.5f), UnitConversionKt.dp2px(15.5f), UnitConversionKt.dp2px(22.5f), UnitConversionKt.dp2px(21.5f));
        paint0.setStrokeWidth(f1);
        paint0.setAntiAlias(false);
        paint0.setColor(this.getResources().getColor((this.isSelected() ? color.ke_toolbar_text_color_icon_border_selected : color.ke_toolbar_text_color_icon_border)));
        canvas0.drawRoundRect(rectF0, f, f, paint0);
    }

    public final void setColor(int v) {
        this.color = v == 0 ? this.getResources().getColor(color.ke_toolbar_default_selected_font_color) : v;
        this.invalidate();
    }
}

