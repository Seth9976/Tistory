package androidx.compose.ui.tooling.preview.datasource;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001A\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\u00078VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\t¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/tooling/preview/datasource/CollectionPreviewParameterProvider;", "T", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "", "collection", "<init>", "(Ljava/util/Collection;)V", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "values", "ui-tooling-preview_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class CollectionPreviewParameterProvider implements PreviewParameterProvider {
    public static final int $stable = 8;
    public final Collection a;

    public CollectionPreviewParameterProvider(@NotNull Collection collection0) {
        this.a = collection0;
    }

    @Override  // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    @NotNull
    public Sequence getValues() {
        return CollectionsKt___CollectionsKt.asSequence(this.a);
    }
}

