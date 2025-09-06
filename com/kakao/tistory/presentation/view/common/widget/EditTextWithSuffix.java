package com.kakao.tistory.presentation.view.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.text.Editable;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.google.android.material.textfield.TextInputEditText;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.styleable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u0004\u0010\u000BJ\u0017\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\fH\u0014¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/widget/EditTextWithSuffix;", "Lcom/google/android/material/textfield/TextInputEditText;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "(Landroid/graphics/Canvas;)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EditTextWithSuffix extends TextInputEditText {
    public static final int $stable = 8;
    public final TextPaint a;
    public final String b;

    public EditTextWithSuffix(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0);
        TextPaint textPaint0 = new TextPaint();
        textPaint0.setColor(ContextCompat.getColor(this.getContext(), color.gray9));
        textPaint0.setTextSize(this.getPaint().getTextSize());
        textPaint0.setTextAlign(Paint.Align.LEFT);
        this.a = textPaint0;
    }

    public EditTextWithSuffix(@NotNull Context context0, @NotNull AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(attributeSet0, "attrs");
        super(context0, attributeSet0);
        TextPaint textPaint0 = new TextPaint();
        textPaint0.setColor(ContextCompat.getColor(this.getContext(), color.gray9));
        textPaint0.setTextSize(this.getPaint().getTextSize());
        textPaint0.setTextAlign(Paint.Align.LEFT);
        this.a = textPaint0;
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.EditTextWithSuffix);
        this.b = typedArray0.getString(styleable.EditTextWithSuffix_suffix);
        typedArray0.recycle();
    }

    public EditTextWithSuffix(@NotNull Context context0, @NotNull AttributeSet attributeSet0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(attributeSet0, "attrs");
        super(context0, attributeSet0, v);
        TextPaint textPaint0 = new TextPaint();
        textPaint0.setColor(ContextCompat.getColor(this.getContext(), color.gray9));
        textPaint0.setTextSize(this.getPaint().getTextSize());
        textPaint0.setTextAlign(Paint.Align.LEFT);
        this.a = textPaint0;
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.EditTextWithSuffix);
        this.b = typedArray0.getString(styleable.EditTextWithSuffix_suffix);
        typedArray0.recycle();
    }

    @Override  // android.widget.TextView
    public void onDraw(@NotNull Canvas canvas0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        super.onDraw(canvas0);
        if(this.hasFocus()) {
        label_5:
            String s = this.b;
            if(s != null) {
                canvas0.drawText(s, this.getPaint().measureText(String.valueOf(this.getText())), ((float)this.getBaseline()), this.a);
            }
        }
        else {
            Editable editable0 = this.getText();
            if((editable0 == null ? 0 : editable0.length()) > 0) {
                goto label_5;
            }
        }
    }
}

