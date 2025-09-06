package com.kakao.tistory.presentation.common.extension;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import androidx.core.content.ContextCompat;
import com.kakao.tistory.domain.entity.common.RegulationLink;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0012\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0004¨\u0006\u0005"}, d2 = {"getRegulationClickableSpanMessage", "", "Lcom/kakao/tistory/domain/entity/common/RegulationLink;", "context", "Landroid/content/Context;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\ncom/kakao/tistory/presentation/common/extension/ExtensionsKt\n+ 2 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n1#1,33:1\n41#2,3:34\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\ncom/kakao/tistory/presentation/common/extension/ExtensionsKt\n*L\n28#1:34,3\n*E\n"})
public final class ExtensionsKt {
    @NotNull
    public static final CharSequence getRegulationClickableSpanMessage(@NotNull RegulationLink regulationLink0, @NotNull Context context0) {
        Intrinsics.checkNotNullParameter(regulationLink0, "<this>");
        Intrinsics.checkNotNullParameter(context0, "context");
        String s = context0.getString(string.label_exception_regulation_history_message);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        String s1 = context0.getString(string.label_exception_regulation_history_linked);
        Intrinsics.checkNotNullExpressionValue(s1, "getString(...)");
        int v = ContextCompat.getColor(context0, color.gray5);
        g g0 = new g(context0, regulationLink0);
        SpannableString spannableString0 = StringUtils.getStringWithClickableSpan$default(StringUtils.INSTANCE, s, s1, v, false, false, g0, 24, null);
        String s2 = context0.getString(string.label_exception_regulation_cs);
        Intrinsics.checkNotNullExpressionValue(s2, "getString(...)");
        String s3 = context0.getString(string.label_exception_regulation_cs_linked);
        Intrinsics.checkNotNullExpressionValue(s3, "getString(...)");
        int v1 = ContextCompat.getColor(context0, color.gray5);
        f f0 = new f(context0, regulationLink0);
        SpannableString spannableString1 = StringUtils.getStringWithClickableSpan$default(StringUtils.INSTANCE, s2, s3, v1, false, false, f0, 24, null);
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder();
        spannableStringBuilder0.append(context0.getString(string.label_exception_regulation_message));
        spannableStringBuilder0.append(spannableString0);
        spannableStringBuilder0.append(spannableString1);
        return new SpannedString(spannableStringBuilder0);
    }
}

