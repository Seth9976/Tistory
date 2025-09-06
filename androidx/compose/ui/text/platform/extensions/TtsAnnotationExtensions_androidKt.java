package androidx.compose.ui.text.platform.extensions;

import android.text.style.TtsSpan.VerbatimBuilder;
import android.text.style.TtsSpan;
import androidx.compose.ui.text.TtsAnnotation;
import androidx.compose.ui.text.VerbatimTtsAnnotation;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0002\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, d2 = {"toSpan", "Landroid/text/style/TtsSpan;", "Landroidx/compose/ui/text/TtsAnnotation;", "Landroidx/compose/ui/text/VerbatimTtsAnnotation;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TtsAnnotationExtensions_androidKt {
    @NotNull
    public static final TtsSpan toSpan(@NotNull TtsAnnotation ttsAnnotation0) {
        if(!(ttsAnnotation0 instanceof VerbatimTtsAnnotation)) {
            throw new NoWhenBranchMatchedException();
        }
        return TtsAnnotationExtensions_androidKt.toSpan(((VerbatimTtsAnnotation)ttsAnnotation0));
    }

    @NotNull
    public static final TtsSpan toSpan(@NotNull VerbatimTtsAnnotation verbatimTtsAnnotation0) {
        return new TtsSpan.VerbatimBuilder(verbatimTtsAnnotation0.getVerbatim()).build();
    }
}

