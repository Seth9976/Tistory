package androidx.compose.ui.tooling.preview.datasource;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import s2.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007R\u001A\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/tooling/preview/datasource/LoremIpsum;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "", "", "words", "<init>", "(I)V", "()V", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "values", "ui-tooling-preview_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class LoremIpsum implements PreviewParameterProvider {
    public static final int $stable;
    public final int a;

    public LoremIpsum() {
        this(500);
    }

    public LoremIpsum(int v) {
        this.a = v;
    }

    @Override  // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    @NotNull
    public Sequence getValues() {
        return SequencesKt__SequencesKt.sequenceOf(new String[]{SequencesKt___SequencesKt.joinToString$default(SequencesKt___SequencesKt.take(SequencesKt__SequencesKt.generateSequence(new a(new IntRef(), LoremIpsum_androidKt.access$getLOREM_IPSUM_SOURCE$p().size())), this.a), " ", null, null, 0, null, null, 62, null)});
    }
}

