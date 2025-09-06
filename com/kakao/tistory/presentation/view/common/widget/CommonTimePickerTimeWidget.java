package com.kakao.tistory.presentation.view.common.widget;

import a5.b;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.font;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.databinding.WidgetTimeBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001D\b\u0016\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u0004\u0010\u000BJ\u0017\u0010\u000E\u001A\u00020\r2\b\b\u0001\u0010\f\u001A\u00020\t¢\u0006\u0004\b\u000E\u0010\u000FJ\u001D\u0010\u0012\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\t2\u0006\u0010\u0011\u001A\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001A\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0010\u001A\u00020\t8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u000FR\"\u0010\u0011\u001A\u00020\t8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001C\u0010\u0018\u001A\u0004\b\u001D\u0010\u001A\"\u0004\b\u001E\u0010\u000FR*\u0010#\u001A\u00020\u001F2\u0006\u0010 \u001A\u00020\u001F8\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006\'"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/widget/CommonTimePickerTimeWidget;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "stringId", "", "setState", "(I)V", "hourOfDay", "minute", "setTime", "(II)V", "", "getTimeString", "()Ljava/lang/String;", "b", "I", "getHourOfDay", "()I", "setHourOfDay", "c", "getMinute", "setMinute", "", "value", "d", "Z", "isActive", "()Z", "setActive", "(Z)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CommonTimePickerTimeWidget extends LinearLayout {
    public static final int $stable = 8;
    public final WidgetTimeBinding a;
    public int b;
    public int c;
    public boolean d;

    public CommonTimePickerTimeWidget(@Nullable Context context0) {
        super(context0);
        WidgetTimeBinding widgetTimeBinding0 = WidgetTimeBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(widgetTimeBinding0, "inflate(...)");
        this.a = widgetTimeBinding0;
        View.inflate(this.getContext(), layout.widget_time, this);
    }

    public CommonTimePickerTimeWidget(@Nullable Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        WidgetTimeBinding widgetTimeBinding0 = WidgetTimeBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(widgetTimeBinding0, "inflate(...)");
        this.a = widgetTimeBinding0;
        View.inflate(this.getContext(), layout.widget_time, this);
    }

    public CommonTimePickerTimeWidget(@Nullable Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        WidgetTimeBinding widgetTimeBinding0 = WidgetTimeBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(widgetTimeBinding0, "inflate(...)");
        this.a = widgetTimeBinding0;
        View.inflate(this.getContext(), layout.widget_time, this);
    }

    public final int getHourOfDay() {
        return this.b;
    }

    public final int getMinute() {
        return this.c;
    }

    @NotNull
    public final String getTimeString() {
        return b.f(2, "%02d%02d", "format(...)", new Object[]{this.b, this.c});
    }

    public final boolean isActive() {
        return this.d;
    }

    public final void setActive(boolean z) {
        if(z) {
            Typeface typeface0 = ResourcesCompat.getFont(this.getContext(), font.font_pretendard_regular);
            Typeface typeface1 = ResourcesCompat.getFont(this.getContext(), font.font_pretendard_medium);
            int v = ContextCompat.getColor(this.getContext(), color.gray1);
            this.a.timeStateText.setTypeface(typeface1);
            this.a.timeStateText.setTextColor(v);
            this.a.timeAmPmText.setTypeface(typeface0);
            this.a.timeAmPmText.setTextColor(v);
            this.a.timeText.setTextColor(v);
        }
        else {
            Typeface typeface2 = ResourcesCompat.getFont(this.getContext(), font.font_pretendard_light);
            int v1 = ContextCompat.getColor(this.getContext(), color.gray2);
            this.a.timeStateText.setTypeface(typeface2);
            this.a.timeStateText.setTextColor(v1);
            this.a.timeAmPmText.setTypeface(typeface2);
            this.a.timeAmPmText.setTextColor(v1);
            this.a.timeText.setTextColor(v1);
        }
        this.d = z;
    }

    public final void setHourOfDay(int v) {
        this.b = v;
    }

    public final void setMinute(int v) {
        this.c = v;
    }

    public final void setState(@StringRes int v) {
        String s = this.getContext().getString(v);
        this.a.timeStateText.setText(s);
    }

    public final void setTime(int v, int v1) {
        this.b = v;
        this.c = v1;
        String s = v >= 12 ? this.getResources().getString(string.label_time_picker_pm) : this.getResources().getString(string.label_time_picker_am);
        this.a.timeAmPmText.setText(s);
        String s1 = this.getResources().getString(string.label_time_format, new Object[]{((int)(v % 12)), v1});
        this.a.timeText.setText(s1);
    }
}

