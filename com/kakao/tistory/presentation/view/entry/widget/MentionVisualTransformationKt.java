package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A8\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\b\u0010\u0006\u001A\u0004\u0018\u00010\u00072\u0006\u0010\b\u001A\u00020\tø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000B\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\f"}, d2 = {"drawMention", "Landroidx/compose/ui/Modifier;", "offset", "", "visualTransformation", "Lcom/kakao/tistory/presentation/view/entry/widget/MentionVisualTransformation;", "layoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "color", "Landroidx/compose/ui/graphics/Color;", "drawMention-xwkQ0AY", "(Landroidx/compose/ui/Modifier;FLcom/kakao/tistory/presentation/view/entry/widget/MentionVisualTransformation;Landroidx/compose/ui/text/TextLayoutResult;J)Landroidx/compose/ui/Modifier;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class MentionVisualTransformationKt {
    @NotNull
    public static final Modifier drawMention-xwkQ0AY(@NotNull Modifier modifier0, float f, @NotNull MentionVisualTransformation mentionVisualTransformation0, @Nullable TextLayoutResult textLayoutResult0, long v) {
        Intrinsics.checkNotNullParameter(modifier0, "$this$drawMention");
        Intrinsics.checkNotNullParameter(mentionVisualTransformation0, "visualTransformation");
        return mentionVisualTransformation0.getMentionIndices() == null ? modifier0 : DrawModifierKt.drawBehind(modifier0, new o1(mentionVisualTransformation0, textLayoutResult0, f, v));
    }

    public static Modifier drawMention-xwkQ0AY$default(Modifier modifier0, float f, MentionVisualTransformation mentionVisualTransformation0, TextLayoutResult textLayoutResult0, long v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = 0.0f;
        }
        return MentionVisualTransformationKt.drawMention-xwkQ0AY(modifier0, f, mentionVisualTransformation0, textLayoutResult0, v);
    }
}

