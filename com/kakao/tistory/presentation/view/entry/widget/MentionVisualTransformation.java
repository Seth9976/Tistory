package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\r\u0010\u000ER\u0017\u0010\u0014\u001A\u00020\u000F8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/view/entry/widget/MentionVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "", "mention", "<init>", "(Ljava/lang/String;)V", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/input/TransformedText;", "filter", "(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;", "", "offset", "originalToTransformed", "(I)I", "Lkotlin/ranges/IntRange;", "a", "Lkotlin/ranges/IntRange;", "getMentionIndices", "()Lkotlin/ranges/IntRange;", "mentionIndices", "com/kakao/tistory/presentation/view/entry/widget/n1", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMentionVisualTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MentionVisualTransformation.kt\ncom/kakao/tistory/presentation/view/entry/widget/MentionVisualTransformation\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,84:1\n1240#2:85\n*S KotlinDebug\n*F\n+ 1 MentionVisualTransformation.kt\ncom/kakao/tistory/presentation/view/entry/widget/MentionVisualTransformation\n*L\n24#1:85\n*E\n"})
public final class MentionVisualTransformation implements VisualTransformation {
    public static final int $stable;
    public final IntRange a;
    public final String b;
    public final n1 c;

    public MentionVisualTransformation(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "mention");
        super();
        this.a = StringsKt__StringsKt.getIndices(s);
        this.b = s + " ";
        this.c = new n1((s + " ").length());
    }

    @Override  // androidx.compose.ui.text.input.VisualTransformation
    @NotNull
    public TransformedText filter(@NotNull AnnotatedString annotatedString0) {
        Intrinsics.checkNotNullParameter(annotatedString0, "text");
        if(p.isBlank(this.b)) {
            return VisualTransformation.Companion.getNone().filter(annotatedString0);
        }
        Builder annotatedString$Builder0 = new Builder(0, 1, null);
        annotatedString$Builder0.append(this.b);
        annotatedString$Builder0.append(annotatedString0);
        return new TransformedText(annotatedString$Builder0.toAnnotatedString(), this.c);
    }

    @NotNull
    public final IntRange getMentionIndices() {
        return this.a;
    }

    public final int originalToTransformed(int v) {
        return v + this.c.a;
    }
}

