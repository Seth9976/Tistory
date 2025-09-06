package androidx.paging;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY})
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u001C\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"shouldPrioritizeOver", "", "Landroidx/paging/GenerationalViewportHint;", "previous", "loadType", "Landroidx/paging/LoadType;", "paging-common_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PageFetcherSnapshotKt {
    public static final boolean shouldPrioritizeOver(@NotNull GenerationalViewportHint generationalViewportHint0, @NotNull GenerationalViewportHint generationalViewportHint1, @NotNull LoadType loadType0) {
        Intrinsics.checkNotNullParameter(generationalViewportHint0, "<this>");
        Intrinsics.checkNotNullParameter(generationalViewportHint1, "previous");
        Intrinsics.checkNotNullParameter(loadType0, "loadType");
        if(generationalViewportHint0.getGenerationId() > generationalViewportHint1.getGenerationId()) {
            return true;
        }
        return generationalViewportHint0.getGenerationId() >= generationalViewportHint1.getGenerationId() ? HintHandlerKt.shouldPrioritizeOver(generationalViewportHint0.getHint(), generationalViewportHint1.getHint(), loadType0) : false;
    }
}

