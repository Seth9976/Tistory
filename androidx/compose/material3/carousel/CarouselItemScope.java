package androidx.compose.material3.carousel;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterial3Api
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J\u0015\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\tH\'¢\u0006\u0002\u0010\nJ!\u0010\u000B\u001A\u00020\f*\u00020\f2\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\b\u001A\u00020\tH\'¢\u0006\u0002\u0010\u000FJ\u0019\u0010\u0010\u001A\u00020\f*\u00020\f2\u0006\u0010\b\u001A\u00020\tH\'¢\u0006\u0002\u0010\u0011R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/carousel/CarouselItemScope;", "", "carouselItemInfo", "Landroidx/compose/material3/carousel/CarouselItemInfo;", "getCarouselItemInfo", "()Landroidx/compose/material3/carousel/CarouselItemInfo;", "rememberMaskShape", "Landroidx/compose/foundation/shape/GenericShape;", "shape", "Landroidx/compose/ui/graphics/Shape;", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/shape/GenericShape;", "maskBorder", "Landroidx/compose/ui/Modifier;", "border", "Landroidx/compose/foundation/BorderStroke;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "maskClip", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "Landroidx/compose/material3/carousel/CarouselItemScopeImpl;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface CarouselItemScope {
    @NotNull
    CarouselItemInfo getCarouselItemInfo();

    @Composable
    @NotNull
    Modifier maskBorder(@NotNull Modifier arg1, @NotNull BorderStroke arg2, @NotNull Shape arg3, @Nullable Composer arg4, int arg5);

    @Composable
    @NotNull
    Modifier maskClip(@NotNull Modifier arg1, @NotNull Shape arg2, @Nullable Composer arg3, int arg4);

    @Composable
    @NotNull
    GenericShape rememberMaskShape(@NotNull Shape arg1, @Nullable Composer arg2, int arg3);
}

