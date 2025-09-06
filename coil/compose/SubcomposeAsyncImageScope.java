package coil.compose;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@LayoutScopeMarker
@Immutable
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0007X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0012\u0010\n\u001A\u00020\u000BX¦\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\rR\u0014\u0010\u000E\u001A\u0004\u0018\u00010\u000FX¦\u0004¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001A\u0004\u0018\u00010\u0013X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001A\u00020\u0017X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001A\u001A\u00020\u001BX¦\u0004¢\u0006\u0006\u001A\u0004\b\u001C\u0010\u001Dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001EÀ\u0006\u0001"}, d2 = {"Lcoil/compose/SubcomposeAsyncImageScope;", "Landroidx/compose/foundation/layout/BoxScope;", "alignment", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "alpha", "", "getAlpha", "()F", "clipToBounds", "", "getClipToBounds", "()Z", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "contentDescription", "", "getContentDescription", "()Ljava/lang/String;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "painter", "Lcoil/compose/AsyncImagePainter;", "getPainter", "()Lcoil/compose/AsyncImagePainter;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface SubcomposeAsyncImageScope extends BoxScope {
    @NotNull
    Alignment getAlignment();

    float getAlpha();

    boolean getClipToBounds();

    @Nullable
    ColorFilter getColorFilter();

    @Nullable
    String getContentDescription();

    @NotNull
    ContentScale getContentScale();

    @NotNull
    AsyncImagePainter getPainter();
}

