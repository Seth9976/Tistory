package com.kakao.tistory.presentation.view.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.R.attr;
import com.google.android.material.R.id;
import com.google.android.material.textfield.TextInputLayout;
import com.kakao.tistory.presentation.R.styleable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001B\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u0004\u0010\u000BJ\u0017\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\fH\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0013\u001A\u00020\u000E2\u0006\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001A\u00020\u000E2\u0006\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001A\u00020\u000E2\u0006\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/widget/CommonTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "textView", "", "setCaptionPadding", "(Landroid/widget/TextView;)V", "", "enabled", "setErrorEnabled", "(Z)V", "setHelperTextEnabled", "setCounterEnabled", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCommonTextInputLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonTextInputLayout.kt\ncom/kakao/tistory/presentation/view/common/widget/CommonTextInputLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
public final class CommonTextInputLayout extends TextInputLayout {
    public static final int $stable = 8;
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public CommonTextInputLayout(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, null);
    }

    public CommonTextInputLayout(@NotNull Context context0, @Nullable AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, attributeSet0, attr.textInputStyle);
    }

    public CommonTextInputLayout(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0, v);
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.CommonTextInputLayout);
            this.a = typedArray0.getDimensionPixelSize(styleable.CommonTextInputLayout_captionTextPaddingStart, 0);
            this.b = typedArray0.getDimensionPixelSize(styleable.CommonTextInputLayout_captionTextPaddingEnd, 0);
            this.c = typedArray0.getDimensionPixelSize(styleable.CommonTextInputLayout_captionTextPaddingTop, 0);
            this.d = typedArray0.getDimensionPixelSize(styleable.CommonTextInputLayout_captionTextPaddingBottom, 0);
            typedArray0.recycle();
        }
    }

    private final void setCaptionPadding(TextView textView0) {
        textView0.setIncludeFontPadding(false);
        textView0.setPadding(this.a, this.c, this.b, this.d);
    }

    @Override  // com.google.android.material.textfield.TextInputLayout
    public void setCounterEnabled(boolean z) {
        super.setCounterEnabled(z);
        TextView textView0 = (TextView)this.findViewById(id.textinput_counter);
        if(textView0 != null) {
            this.setCaptionPadding(textView0);
        }
    }

    @Override  // com.google.android.material.textfield.TextInputLayout
    public void setErrorEnabled(boolean z) {
        super.setErrorEnabled(z);
        TextView textView0 = (TextView)this.findViewById(id.textinput_error);
        if(textView0 != null) {
            this.setCaptionPadding(textView0);
        }
    }

    @Override  // com.google.android.material.textfield.TextInputLayout
    public void setHelperTextEnabled(boolean z) {
        super.setHelperTextEnabled(z);
        TextView textView0 = (TextView)this.findViewById(id.textinput_helper_text);
        if(textView0 != null) {
            this.setCaptionPadding(textView0);
        }
    }
}

