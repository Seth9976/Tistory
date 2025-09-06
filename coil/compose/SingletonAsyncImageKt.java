package coil.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\u0092\u0001\u0010\u0000\u001A\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\u0014\b\u0002\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0016\b\u0002\u0010\u000B\u001A\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u00112\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001A\u00020\u0015H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0017\u001A\u00A6\u0001\u0010\u0000\u001A\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\u0014\b\u0002\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0016\b\u0002\u0010\u000B\u001A\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u00112\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001A\u00020\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u00192\b\b\u0002\u0010\u001A\u001A\u00020\u001BH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001C\u0010\u001D\u001A\u00D0\u0001\u0010\u0000\u001A\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001F2\n\b\u0002\u0010 \u001A\u0004\u0018\u00010\u001F2\n\b\u0002\u0010!\u001A\u0004\u0018\u00010\u001F2\u0016\b\u0002\u0010\"\u001A\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u0010$\u001A\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u0010&\u001A\u0010\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u00112\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001A\u00020\u0015H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b(\u0010)\u001A\u00E4\u0001\u0010\u0000\u001A\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001F2\n\b\u0002\u0010 \u001A\u0004\u0018\u00010\u001F2\n\b\u0002\u0010!\u001A\u0004\u0018\u00010\u001F2\u0016\b\u0002\u0010\"\u001A\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u0010$\u001A\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u0010&\u001A\u0010\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u00112\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001A\u00020\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u00192\b\b\u0002\u0010\u001A\u001A\u00020\u001BH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b*\u0010+\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006,"}, d2 = {"AsyncImage", "", "model", "", "contentDescription", "", "modifier", "Landroidx/compose/ui/Modifier;", "transform", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "onState", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "AsyncImage-3HmZ8SU", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;II)V", "clipToBounds", "", "modelEqualityDelegate", "Lcoil/compose/EqualityDelegate;", "AsyncImage-gl8XCv8", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZLcoil/compose/EqualityDelegate;Landroidx/compose/runtime/Composer;III)V", "placeholder", "Landroidx/compose/ui/graphics/painter/Painter;", "error", "fallback", "onLoading", "Lcoil/compose/AsyncImagePainter$State$Loading;", "onSuccess", "Lcoil/compose/AsyncImagePainter$State$Success;", "onError", "Lcoil/compose/AsyncImagePainter$State$Error;", "AsyncImage-ylYTKUw", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;III)V", "AsyncImage-Vb_qNX0", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZLcoil/compose/EqualityDelegate;Landroidx/compose/runtime/Composer;III)V", "coil-compose-singleton_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class SingletonAsyncImageKt {
    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public static final void AsyncImage-3HmZ8SU(Object object0, String s, Modifier modifier0, Function1 function10, Function1 function11, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, int v, Composer composer0, int v1, int v2) {
        composer0.startReplaceableGroup(0xC7E194D4);
        Modifier modifier1 = (v2 & 4) == 0 ? modifier0 : Modifier.Companion;
        Function1 function12 = (v2 & 8) == 0 ? function10 : AsyncImagePainter.Companion.getDefaultTransform();
        Alignment alignment1 = (v2 & 0x20) == 0 ? alignment0 : Alignment.Companion.getCenter();
        ContentScale contentScale1 = (v2 & 0x40) == 0 ? contentScale0 : ContentScale.Companion.getFit();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xC7E194D4, v1, -1, "coil.compose.AsyncImage (SingletonAsyncImage.kt:191)");
        }
        AsyncImageKt.AsyncImage-QgsmV_s(object0, s, ImageLoaderProvidableCompositionLocal.getCurrent(LocalImageLoaderKt.getLocalImageLoader(), composer0, 6), modifier1, function12, ((v2 & 16) == 0 ? function11 : null), alignment1, contentScale1, ((v2 & 0x80) == 0 ? f : 1.0f), ((v2 & 0x100) == 0 ? colorFilter0 : null), ((v2 & 0x200) == 0 ? v : 1), false, null, composer0, v1 & 0x70 | 520 | v1 << 3 & 0x1C00 | 0xE000 & v1 << 3 | 0x70000 & v1 << 3 | 0x380000 & v1 << 3 | 0x1C00000 & v1 << 3 | 0xE000000 & v1 << 3 | v1 << 3 & 0x70000000, v1 >> 27 & 14, 0x1800);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
    }

    @Composable
    public static final void AsyncImage-Vb_qNX0(@Nullable Object object0, @Nullable String s, @Nullable Modifier modifier0, @Nullable Painter painter0, @Nullable Painter painter1, @Nullable Painter painter2, @Nullable Function1 function10, @Nullable Function1 function11, @Nullable Function1 function12, @Nullable Alignment alignment0, @Nullable ContentScale contentScale0, float f, @Nullable ColorFilter colorFilter0, int v, boolean z, @Nullable EqualityDelegate equalityDelegate0, @Nullable Composer composer0, int v1, int v2, int v3) {
        composer0.startReplaceableGroup(0x64F5E82F);
        Modifier modifier1 = (v3 & 4) == 0 ? modifier0 : Modifier.Companion;
        Painter painter3 = (v3 & 16) == 0 ? painter1 : null;
        Alignment alignment1 = (v3 & 0x200) == 0 ? alignment0 : Alignment.Companion.getCenter();
        ContentScale contentScale1 = (v3 & 0x400) == 0 ? contentScale0 : ContentScale.Companion.getFit();
        EqualityDelegate equalityDelegate1 = (v3 & 0x8000) == 0 ? equalityDelegate0 : EqualityDelegateKt.getDefaultModelEqualityDelegate();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x64F5E82F, v1, v2, "coil.compose.AsyncImage (SingletonAsyncImage.kt:65)");
        }
        AsyncImageKt.AsyncImage-J-FEaFM(object0, s, ImageLoaderProvidableCompositionLocal.getCurrent(LocalImageLoaderKt.getLocalImageLoader(), composer0, 6), modifier1, ((v3 & 8) == 0 ? painter0 : null), painter3, ((v3 & 0x20) == 0 ? painter2 : painter3), ((v3 & 0x40) == 0 ? function10 : null), ((v3 & 0x80) == 0 ? function11 : null), ((v3 & 0x100) == 0 ? function12 : null), alignment1, contentScale1, ((v3 & 0x800) == 0 ? f : 1.0f), ((v3 & 0x1000) == 0 ? colorFilter0 : null), ((v3 & 0x2000) == 0 ? v : 1), ((v3 & 0x4000) == 0 ? z : true), equalityDelegate1, composer0, v1 & 0x70 | 0x248208 | v1 << 3 & 0x1C00 | 0x1C00000 & v1 << 3 | 0xE000000 & v1 << 3 | v1 << 3 & 0x70000000, v1 >> 27 & 14 | v2 << 3 & 0x70 | v2 << 3 & 0x380 | v2 << 3 & 0x1C00 | 0xE000 & v2 << 3 | 0x70000 & v2 << 3 | v2 << 3 & 0x380000, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
    }

    @Composable
    public static final void AsyncImage-gl8XCv8(@Nullable Object object0, @Nullable String s, @Nullable Modifier modifier0, @Nullable Function1 function10, @Nullable Function1 function11, @Nullable Alignment alignment0, @Nullable ContentScale contentScale0, float f, @Nullable ColorFilter colorFilter0, int v, boolean z, @Nullable EqualityDelegate equalityDelegate0, @Nullable Composer composer0, int v1, int v2, int v3) {
        composer0.startReplaceableGroup(1451072229);
        Modifier modifier1 = (v3 & 4) == 0 ? modifier0 : Modifier.Companion;
        Function1 function12 = (v3 & 8) == 0 ? function10 : AsyncImagePainter.Companion.getDefaultTransform();
        Alignment alignment1 = (v3 & 0x20) == 0 ? alignment0 : Alignment.Companion.getCenter();
        ContentScale contentScale1 = (v3 & 0x40) == 0 ? contentScale0 : ContentScale.Companion.getFit();
        EqualityDelegate equalityDelegate1 = (v3 & 0x800) == 0 ? equalityDelegate0 : EqualityDelegateKt.getDefaultModelEqualityDelegate();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1451072229, v1, v2, "coil.compose.AsyncImage (SingletonAsyncImage.kt:161)");
        }
        AsyncImageKt.AsyncImage-QgsmV_s(object0, s, ImageLoaderProvidableCompositionLocal.getCurrent(LocalImageLoaderKt.getLocalImageLoader(), composer0, 6), modifier1, function12, ((v3 & 16) == 0 ? function11 : null), alignment1, contentScale1, ((v3 & 0x80) == 0 ? f : 1.0f), ((v3 & 0x100) == 0 ? colorFilter0 : null), ((v3 & 0x200) == 0 ? v : 1), ((v3 & 0x400) == 0 ? z : true), equalityDelegate1, composer0, v1 & 0x70 | 520 | v1 << 3 & 0x1C00 | 0xE000 & v1 << 3 | 0x70000 & v1 << 3 | 0x380000 & v1 << 3 | 0x1C00000 & v1 << 3 | 0xE000000 & v1 << 3 | v1 << 3 & 0x70000000, v1 >> 27 & 14 | v2 << 3 & 0x70 | v2 << 3 & 0x380, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public static final void AsyncImage-ylYTKUw(Object object0, String s, Modifier modifier0, Painter painter0, Painter painter1, Painter painter2, Function1 function10, Function1 function11, Function1 function12, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, int v, Composer composer0, int v1, int v2, int v3) {
        composer0.startReplaceableGroup(2027616330);
        Modifier modifier1 = (v3 & 4) == 0 ? modifier0 : Modifier.Companion;
        Painter painter3 = (v3 & 16) == 0 ? painter1 : null;
        Alignment alignment1 = (v3 & 0x200) == 0 ? alignment0 : Alignment.Companion.getCenter();
        ContentScale contentScale1 = (v3 & 0x400) == 0 ? contentScale0 : ContentScale.Companion.getFit();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2027616330, v1, v2, "coil.compose.AsyncImage (SingletonAsyncImage.kt:103)");
        }
        AsyncImageKt.AsyncImage-J-FEaFM(object0, s, ImageLoaderProvidableCompositionLocal.getCurrent(LocalImageLoaderKt.getLocalImageLoader(), composer0, 6), modifier1, ((v3 & 8) == 0 ? painter0 : null), painter3, ((v3 & 0x20) == 0 ? painter2 : painter3), ((v3 & 0x40) == 0 ? function10 : null), ((v3 & 0x80) == 0 ? function11 : null), ((v3 & 0x100) == 0 ? function12 : null), alignment1, contentScale1, ((v3 & 0x800) == 0 ? f : 1.0f), ((v3 & 0x1000) == 0 ? colorFilter0 : null), ((v3 & 0x2000) == 0 ? v : 1), false, null, composer0, v1 & 0x70 | 0x248208 | v1 << 3 & 0x1C00 | 0x1C00000 & v1 << 3 | 0xE000000 & v1 << 3 | v1 << 3 & 0x70000000, v1 >> 27 & 14 | v2 << 3 & 0x70 | v2 << 3 & 0x380 | v2 << 3 & 0x1C00 | v2 << 3 & 0xE000, 0x18000);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
    }
}

