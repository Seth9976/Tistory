package androidx.paging;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({Scope.LIBRARY})
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u001E\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001A\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"shouldPrioritizeOver", "", "Landroidx/paging/ViewportHint;", "previous", "loadType", "Landroidx/paging/LoadType;", "paging-common_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class HintHandlerKt {
    public static final boolean shouldPrioritizeOver(@NotNull ViewportHint viewportHint0, @Nullable ViewportHint viewportHint1, @NotNull LoadType loadType0) {
        Intrinsics.checkNotNullParameter(viewportHint0, "<this>");
        Intrinsics.checkNotNullParameter(loadType0, "loadType");
        if(viewportHint1 != null && (!(viewportHint1 instanceof Initial) || !(viewportHint0 instanceof Access))) {
            return !(viewportHint0 instanceof Initial) || !(viewportHint1 instanceof Access) ? viewportHint0.getOriginalPageOffsetFirst() != viewportHint1.getOriginalPageOffsetFirst() || viewportHint0.getOriginalPageOffsetLast() != viewportHint1.getOriginalPageOffsetLast() || viewportHint1.presentedItemsBeyondAnchor$paging_common_release(loadType0) > viewportHint0.presentedItemsBeyondAnchor$paging_common_release(loadType0) : false;
        }
        return true;
    }
}

