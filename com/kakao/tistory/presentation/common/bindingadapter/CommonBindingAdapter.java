package com.kakao.tistory.presentation.common.bindingadapter;

import a5.b;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.BindingAdapter;
import com.kakao.android.base.BaseKt;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.font;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001J#\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\n\b\u0001\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\n\b\u0001\u0010\t\u001A\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ#\u0010\f\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\n\b\u0001\u0010\u000B\u001A\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\f\u0010\bJ#\u0010\r\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\n\b\u0001\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\r\u0010\bJ!\u0010\r\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EH\u0007¢\u0006\u0004\b\r\u0010\u0010J5\u0010\r\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\b\u0010\u000F\u001A\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001A\u00020\u00122\b\b\u0002\u0010\u0014\u001A\u00020\u0012H\u0007¢\u0006\u0004\b\r\u0010\u0015J#\u0010\u0018\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00162\n\b\u0001\u0010\u0017\u001A\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001B\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\b\u0010\u001A\u001A\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u001B\u0010\u001CJ\'\u0010 \u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u001D2\u0006\u0010\u001E\u001A\u00020\u00112\u0006\u0010\u001F\u001A\u00020\u0012H\u0007¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/kakao/tistory/presentation/common/bindingadapter/CommonBindingAdapter;", "", "Landroid/widget/TextView;", "view", "", "stringResourceId", "", "bindStringResourceId", "(Landroid/widget/TextView;Ljava/lang/Integer;)V", "backgroundId", "bindBackgroundResourceId", "textColorId", "bindTextColorResourceId", "bindText", "", "text", "(Landroid/widget/TextView;Ljava/lang/CharSequence;)V", "", "", "isHtml", "withDot", "(Landroid/widget/TextView;Ljava/lang/String;ZZ)V", "Landroid/widget/ImageButton;", "srcResourceId", "bindSrcResourceId", "(Landroid/widget/ImageButton;Ljava/lang/Integer;)V", "fontName", "bindFontName", "(Landroid/widget/TextView;Ljava/lang/String;)V", "Landroid/view/View;", "contentDescription", "isSelected", "bindContentDescription", "(Landroid/view/View;Ljava/lang/String;Z)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CommonBindingAdapter {
    public static final int $stable;
    @NotNull
    public static final CommonBindingAdapter INSTANCE;

    static {
        CommonBindingAdapter.INSTANCE = new CommonBindingAdapter();
    }

    @BindingAdapter({"backgroundId"})
    @JvmStatic
    public static final void bindBackgroundResourceId(@NotNull TextView textView0, @DrawableRes @Nullable Integer integer0) {
        Intrinsics.checkNotNullParameter(textView0, "view");
        if(integer0 != null) {
            textView0.setBackgroundResource(integer0.intValue());
        }
    }

    @BindingAdapter({"android:contentDescription", "isSelected"})
    @JvmStatic
    public static final void bindContentDescription(@NotNull View view0, @NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(s, "contentDescription");
        if(z) {
            String s1 = view0.getContext().getString(string.content_desc_select_already);
            Intrinsics.checkNotNullExpressionValue(s1, "getString(...)");
            s = b.f(1, s1, "format(...)", new Object[]{s});
        }
        view0.setContentDescription(s);
    }

    @BindingAdapter({"fontName"})
    @JvmStatic
    public static final void bindFontName(@NotNull TextView textView0, @Nullable String s) {
        Intrinsics.checkNotNullParameter(textView0, "view");
        if(s != null) {
            if(Intrinsics.areEqual(s, textView0.getContext().getString(string.font_pretended_semi_bold))) {
                textView0.setTypeface(ResourcesCompat.getFont(textView0.getContext(), font.font_pretendard_medium));
                textView0.setIncludeFontPadding(false);
                return;
            }
            if(Intrinsics.areEqual(s, textView0.getContext().getString(string.font_pretended_light))) {
                textView0.setTypeface(ResourcesCompat.getFont(textView0.getContext(), font.font_pretendard_light));
                textView0.setIncludeFontPadding(false);
                return;
            }
            if(Intrinsics.areEqual(s, textView0.getContext().getString(string.font_pretended_regular))) {
                textView0.setTypeface(ResourcesCompat.getFont(textView0.getContext(), font.font_pretendard_regular));
                textView0.setIncludeFontPadding(false);
            }
        }
    }

    @BindingAdapter({"srcResourceId"})
    @JvmStatic
    public static final void bindSrcResourceId(@NotNull ImageButton imageButton0, @DrawableRes @Nullable Integer integer0) {
        Intrinsics.checkNotNullParameter(imageButton0, "view");
        if(integer0 != null) {
            imageButton0.setImageResource(integer0.intValue());
        }
    }

    @BindingAdapter({"stringResourceId"})
    @JvmStatic
    public static final void bindStringResourceId(@NotNull TextView textView0, @StringRes @Nullable Integer integer0) {
        int v;
        Intrinsics.checkNotNullParameter(textView0, "view");
        if(integer0 == null) {
            v = 8;
        }
        else {
            textView0.setText(textView0.getContext().getString(integer0.intValue()));
            v = 0;
        }
        textView0.setVisibility(v);
    }

    @BindingAdapter({"text"})
    @JvmStatic
    public static final void bindText(@NotNull TextView textView0, @Nullable CharSequence charSequence0) {
        int v;
        Intrinsics.checkNotNullParameter(textView0, "view");
        if(charSequence0 == null) {
            v = 8;
        }
        else {
            textView0.setText(charSequence0);
            v = 0;
        }
        textView0.setVisibility(v);
    }

    @BindingAdapter({"android:text"})
    @JvmStatic
    public static final void bindText(@NotNull TextView textView0, @StringRes @Nullable Integer integer0) {
        int v;
        Intrinsics.checkNotNullParameter(textView0, "view");
        if(integer0 == null) {
            v = 8;
        }
        else {
            textView0.setText(textView0.getContext().getString(integer0.intValue()));
            v = 0;
        }
        textView0.setVisibility(v);
    }

    @BindingAdapter(requireAll = false, value = {"text", "isHtml", "withDot"})
    @JvmStatic
    public static final void bindText(@NotNull TextView textView0, @Nullable String s, boolean z, boolean z1) {
        int v1;
        Intrinsics.checkNotNullParameter(textView0, "view");
        if(s == null) {
            v1 = 8;
        }
        else {
            if(z) {
                s = StringUtils.INSTANCE.getHtmlText(s);
            }
            else if(z1) {
                CommonBindingAdapter.INSTANCE.getClass();
                String s1 = BaseKt.getAppContext().getString(string.label_text_with_dot);
                Intrinsics.checkNotNullExpressionValue(s1, "getString(...)");
                String s2 = b.f(1, s1, "format(...)", new Object[]{s});
                int v = s2.length();
                SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(s2);
                spannableStringBuilder0.setSpan(new AbsoluteSizeSpan(4, true), v - 3, v - 2, 33);
                spannableStringBuilder0.setSpan(new AbsoluteSizeSpan(4, true), v - 1, v, 33);
                spannableStringBuilder0.setSpan(new ForegroundColorSpan(ContextCompat.getColor(BaseKt.getAppContext(), color.gray3)), v - 2, v, 33);
                s = spannableStringBuilder0;
            }
            textView0.setText(s);
            v1 = 0;
        }
        textView0.setVisibility(v1);
    }

    public static void bindText$default(TextView textView0, String s, boolean z, boolean z1, int v, Object object0) {
        if((v & 4) != 0) {
            z = false;
        }
        if((v & 8) != 0) {
            z1 = false;
        }
        CommonBindingAdapter.bindText(textView0, s, z, z1);
    }

    @BindingAdapter({"textColorResourceId"})
    @JvmStatic
    public static final void bindTextColorResourceId(@NotNull TextView textView0, @DrawableRes @Nullable Integer integer0) {
        Intrinsics.checkNotNullParameter(textView0, "view");
        if(integer0 != null) {
            textView0.setTextColor(ContextCompat.getColor(textView0.getContext(), integer0.intValue()));
        }
    }
}

