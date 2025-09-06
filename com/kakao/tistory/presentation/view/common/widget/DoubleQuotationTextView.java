package com.kakao.tistory.presentation.view.common.widget;

import a5.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.text.DynamicLayout.Builder;
import android.text.DynamicLayout;
import android.text.Layout.Alignment;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.widget.TextView.BufferType;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.presentation.R.styleable;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import lc.a;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001D\b\u0016\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u0004\u0010\u000BJ#\u0010\u0011\u001A\u00020\u00102\b\u0010\r\u001A\u0004\u0018\u00010\f2\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001A\u00020\u00102\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R.\u0010\u001E\u001A\u0004\u0018\u00010\f2\b\u0010\u0017\u001A\u0004\u0018\u00010\f8\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B\"\u0004\b\u001C\u0010\u001D¨\u0006\u001F"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/widget/DoubleQuotationTextView;", "Landroid/widget/TextView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "text", "Landroid/widget/TextView$BufferType;", "bufferType", "", "setText", "(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V", "Landroid/text/TextUtils$TruncateAt;", "where", "setEllipsize", "(Landroid/text/TextUtils$TruncateAt;)V", "value", "a", "Ljava/lang/CharSequence;", "getQuotationText", "()Ljava/lang/CharSequence;", "setQuotationText", "(Ljava/lang/CharSequence;)V", "quotationText", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DoubleQuotationTextView extends TextView {
    public static final int $stable = 8;
    public CharSequence a;

    public DoubleQuotationTextView(@Nullable Context context0) {
        this(context0, null);
    }

    public DoubleQuotationTextView(@Nullable Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public DoubleQuotationTextView(@Nullable Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.DoubleQuotationTextView);
        Intrinsics.checkNotNullExpressionValue(typedArray0, "obtainStyledAttributes(...)");
        this.setQuotationText(typedArray0.getString(styleable.DoubleQuotationTextView_quotationText));
        typedArray0.recycle();
        this.a();
        this.a();
    }

    public static final void a(DoubleQuotationTextView doubleQuotationTextView0) {
        Intrinsics.checkNotNullParameter(doubleQuotationTextView0, "this$0");
        doubleQuotationTextView0.setText(doubleQuotationTextView0.a, TextView.BufferType.NORMAL);
    }

    public final CharSequence a(CharSequence charSequence0) {
        DynamicLayout dynamicLayout0;
        CharSequence charSequence1 = p.isBlank(charSequence0) ? charSequence0 : StringUtils.INSTANCE.getREGEX_NEW_LINE().replace(charSequence0, " ");
        int v = this.getWidth() - this.getPaddingStart() - this.getPaddingEnd();
        if(Build.VERSION.SDK_INT >= 28) {
            dynamicLayout0 = a.d(DynamicLayout.Builder.obtain(("\"" + charSequence1), this.getPaint(), v).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(this.getLineSpacingMultiplier(), this.getLineSpacingExtra()).setIncludePad(this.getIncludeFontPadding()));
            Intrinsics.checkNotNull(dynamicLayout0);
        }
        else {
            dynamicLayout0 = new DynamicLayout("\"" + charSequence1, this.getPaint(), v, Layout.Alignment.ALIGN_NORMAL, this.getLineSpacingMultiplier(), this.getLineSpacingExtra(), this.getIncludeFontPadding());
        }
        if(dynamicLayout0.getLineCount() > this.getMaxLines() && this.getWidth() != 0) {
            return b.f(1, "\"%s...\"", "format(...)", new Object[]{charSequence1.subSequence(0, dynamicLayout0.getLineVisibleEnd(this.getMaxLines() - 1) - 4).toString()});
        }
        return !p.isBlank(charSequence0) ? b.f(1, "\"%s\"", "format(...)", new Object[]{charSequence1}) : charSequence1;
    }

    public final void a() {
        this.getViewTreeObserver().addOnGlobalLayoutListener(new androidx.compose.ui.platform.b(this, 2));
    }

    @Nullable
    public final CharSequence getQuotationText() {
        return this.a;
    }

    @Override  // android.widget.TextView
    public void setEllipsize(@Nullable TextUtils.TruncateAt textUtils$TruncateAt0) {
        throw new UnsupportedOperationException("DoubleQuotationTextView unsupported setEllipsize()");
    }

    public final void setQuotationText(@Nullable CharSequence charSequence0) {
        this.a = charSequence0;
        this.setText(charSequence0, TextView.BufferType.NORMAL);
        this.setVisibility((charSequence0 == null || p.isBlank(charSequence0) ? 8 : 0));
    }

    @Override  // android.widget.TextView
    public void setText(@Nullable CharSequence charSequence0, @Nullable TextView.BufferType textView$BufferType0) {
        CharSequence charSequence1 = this.a;
        if(charSequence1 == null) {
            charSequence1 = "";
        }
        CharSequence charSequence2 = this.a(charSequence1);
        Logger.INSTANCE.log("setText displayableText : " + charSequence2 + " ");
        super.setText(charSequence2, textView$BufferType0);
    }
}

