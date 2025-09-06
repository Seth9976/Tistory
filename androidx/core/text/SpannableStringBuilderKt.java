package androidx.core.text;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.ColorInt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\u001A\"\u0010\u0000\u001A\u00020\u00012\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00A2\u0006\u0002\b\u0006H\u0086\b\u001A0\u0010\u0007\u001A\u00020\u0004*\u00020\u00042\b\b\u0001\u0010\b\u001A\u00020\t2\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00A2\u0006\u0002\b\u0006H\u0086\b\u001A&\u0010\n\u001A\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00A2\u0006\u0002\b\u0006H\u0086\b\u001A0\u0010\b\u001A\u00020\u0004*\u00020\u00042\b\b\u0001\u0010\b\u001A\u00020\t2\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00A2\u0006\u0002\b\u0006H\u0086\b\u001A.\u0010\u000B\u001A\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001A\u00020\r2\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00A2\u0006\u0002\b\u0006H\u0086\b\u001A?\u0010\u000B\u001A\u00020\u0004*\u00020\u00042\u0012\u0010\u000E\u001A\n\u0012\u0006\b\u0001\u0012\u00020\r0\u000F\"\u00020\r2\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00A2\u0006\u0002\b\u0006H\u0086\b\u00A2\u0006\u0002\u0010\u0010\u001A&\u0010\u0011\u001A\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00A2\u0006\u0002\b\u0006H\u0086\b\u001A.\u0010\u0012\u001A\u00020\u0004*\u00020\u00042\u0006\u0010\u0013\u001A\u00020\u00142\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00A2\u0006\u0002\b\u0006H\u0086\b\u001A&\u0010\u0015\u001A\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00A2\u0006\u0002\b\u0006H\u0086\b\u001A&\u0010\u0016\u001A\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00A2\u0006\u0002\b\u0006H\u0086\b\u001A&\u0010\u0017\u001A\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00A2\u0006\u0002\b\u0006H\u0086\b\u001A&\u0010\u0018\u001A\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00A2\u0006\u0002\b\u0006H\u0086\b\u00A8\u0006\u0019"}, d2 = {"buildSpannedString", "Landroid/text/SpannedString;", "builderAction", "Lkotlin/Function1;", "Landroid/text/SpannableStringBuilder;", "", "Lkotlin/ExtensionFunctionType;", "backgroundColor", "color", "", "bold", "inSpans", "span", "", "spans", "", "(Landroid/text/SpannableStringBuilder;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Landroid/text/SpannableStringBuilder;", "italic", "scale", "proportion", "", "strikeThrough", "subscript", "superscript", "underline", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSpannableStringBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n1#1,163:1\n74#1,4:164\n74#1,4:168\n74#1,4:172\n74#1,4:176\n74#1,4:180\n74#1,4:184\n74#1,4:188\n74#1,4:192\n74#1,4:196\n*S KotlinDebug\n*F\n+ 1 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n87#1:164,4\n96#1:168,4\n105#1:172,4\n115#1:176,4\n125#1:180,4\n134#1:184,4\n144#1:188,4\n153#1:192,4\n162#1:196,4\n*E\n"})
public final class SpannableStringBuilderKt {
    @NotNull
    public static final SpannableStringBuilder backgroundColor(@NotNull SpannableStringBuilder spannableStringBuilder0, @ColorInt int v, @NotNull Function1 function10) {
        BackgroundColorSpan backgroundColorSpan0 = new BackgroundColorSpan(v);
        int v1 = spannableStringBuilder0.length();
        function10.invoke(spannableStringBuilder0);
        spannableStringBuilder0.setSpan(backgroundColorSpan0, v1, spannableStringBuilder0.length(), 17);
        return spannableStringBuilder0;
    }

    @NotNull
    public static final SpannableStringBuilder bold(@NotNull SpannableStringBuilder spannableStringBuilder0, @NotNull Function1 function10) {
        StyleSpan styleSpan0 = new StyleSpan(1);
        int v = spannableStringBuilder0.length();
        function10.invoke(spannableStringBuilder0);
        spannableStringBuilder0.setSpan(styleSpan0, v, spannableStringBuilder0.length(), 17);
        return spannableStringBuilder0;
    }

    @NotNull
    public static final SpannedString buildSpannedString(@NotNull Function1 function10) {
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder();
        function10.invoke(spannableStringBuilder0);
        return new SpannedString(spannableStringBuilder0);
    }

    @NotNull
    public static final SpannableStringBuilder color(@NotNull SpannableStringBuilder spannableStringBuilder0, @ColorInt int v, @NotNull Function1 function10) {
        ForegroundColorSpan foregroundColorSpan0 = new ForegroundColorSpan(v);
        int v1 = spannableStringBuilder0.length();
        function10.invoke(spannableStringBuilder0);
        spannableStringBuilder0.setSpan(foregroundColorSpan0, v1, spannableStringBuilder0.length(), 17);
        return spannableStringBuilder0;
    }

    @NotNull
    public static final SpannableStringBuilder inSpans(@NotNull SpannableStringBuilder spannableStringBuilder0, @NotNull Object object0, @NotNull Function1 function10) {
        int v = spannableStringBuilder0.length();
        function10.invoke(spannableStringBuilder0);
        spannableStringBuilder0.setSpan(object0, v, spannableStringBuilder0.length(), 17);
        return spannableStringBuilder0;
    }

    @NotNull
    public static final SpannableStringBuilder inSpans(@NotNull SpannableStringBuilder spannableStringBuilder0, @NotNull Object[] arr_object, @NotNull Function1 function10) {
        int v = spannableStringBuilder0.length();
        function10.invoke(spannableStringBuilder0);
        for(int v1 = 0; v1 < arr_object.length; ++v1) {
            spannableStringBuilder0.setSpan(arr_object[v1], v, spannableStringBuilder0.length(), 17);
        }
        return spannableStringBuilder0;
    }

    @NotNull
    public static final SpannableStringBuilder italic(@NotNull SpannableStringBuilder spannableStringBuilder0, @NotNull Function1 function10) {
        StyleSpan styleSpan0 = new StyleSpan(2);
        int v = spannableStringBuilder0.length();
        function10.invoke(spannableStringBuilder0);
        spannableStringBuilder0.setSpan(styleSpan0, v, spannableStringBuilder0.length(), 17);
        return spannableStringBuilder0;
    }

    @NotNull
    public static final SpannableStringBuilder scale(@NotNull SpannableStringBuilder spannableStringBuilder0, float f, @NotNull Function1 function10) {
        RelativeSizeSpan relativeSizeSpan0 = new RelativeSizeSpan(f);
        int v = spannableStringBuilder0.length();
        function10.invoke(spannableStringBuilder0);
        spannableStringBuilder0.setSpan(relativeSizeSpan0, v, spannableStringBuilder0.length(), 17);
        return spannableStringBuilder0;
    }

    @NotNull
    public static final SpannableStringBuilder strikeThrough(@NotNull SpannableStringBuilder spannableStringBuilder0, @NotNull Function1 function10) {
        StrikethroughSpan strikethroughSpan0 = new StrikethroughSpan();
        int v = spannableStringBuilder0.length();
        function10.invoke(spannableStringBuilder0);
        spannableStringBuilder0.setSpan(strikethroughSpan0, v, spannableStringBuilder0.length(), 17);
        return spannableStringBuilder0;
    }

    @NotNull
    public static final SpannableStringBuilder subscript(@NotNull SpannableStringBuilder spannableStringBuilder0, @NotNull Function1 function10) {
        SubscriptSpan subscriptSpan0 = new SubscriptSpan();
        int v = spannableStringBuilder0.length();
        function10.invoke(spannableStringBuilder0);
        spannableStringBuilder0.setSpan(subscriptSpan0, v, spannableStringBuilder0.length(), 17);
        return spannableStringBuilder0;
    }

    @NotNull
    public static final SpannableStringBuilder superscript(@NotNull SpannableStringBuilder spannableStringBuilder0, @NotNull Function1 function10) {
        SuperscriptSpan superscriptSpan0 = new SuperscriptSpan();
        int v = spannableStringBuilder0.length();
        function10.invoke(spannableStringBuilder0);
        spannableStringBuilder0.setSpan(superscriptSpan0, v, spannableStringBuilder0.length(), 17);
        return spannableStringBuilder0;
    }

    @NotNull
    public static final SpannableStringBuilder underline(@NotNull SpannableStringBuilder spannableStringBuilder0, @NotNull Function1 function10) {
        UnderlineSpan underlineSpan0 = new UnderlineSpan();
        int v = spannableStringBuilder0.length();
        function10.invoke(spannableStringBuilder0);
        spannableStringBuilder0.setSpan(underlineSpan0, v, spannableStringBuilder0.length(), 17);
        return spannableStringBuilder0;
    }
}

