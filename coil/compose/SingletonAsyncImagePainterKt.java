package coil.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A^\u0010\u0000\u001A\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u0010\u0007\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\b\b\u0002\u0010\t\u001A\u00020\n2\b\b\u0002\u0010\u000B\u001A\u00020\fH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\r\u0010\u000E\u001Ah\u0010\u0000\u001A\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u0010\u0007\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\b\b\u0002\u0010\t\u001A\u00020\n2\b\b\u0002\u0010\u000B\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u0010H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012\u001A\u009C\u0001\u0010\u0000\u001A\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00142\u0016\b\u0002\u0010\u0017\u001A\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0016\b\u0002\u0010\u0019\u001A\u0010\u0012\u0004\u0012\u00020\u001A\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0016\b\u0002\u0010\u001B\u001A\u0010\u0012\u0004\u0012\u00020\u001C\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\b\b\u0002\u0010\t\u001A\u00020\n2\b\b\u0002\u0010\u000B\u001A\u00020\fH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001E\u001A\u00A6\u0001\u0010\u0000\u001A\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00142\u0016\b\u0002\u0010\u0017\u001A\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0016\b\u0002\u0010\u0019\u001A\u0010\u0012\u0004\u0012\u00020\u001A\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0016\b\u0002\u0010\u001B\u001A\u0010\u0012\u0004\u0012\u00020\u001C\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\b\b\u0002\u0010\t\u001A\u00020\n2\b\b\u0002\u0010\u000B\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u0010H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010 \u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006!"}, d2 = {"rememberAsyncImagePainter", "Lcoil/compose/AsyncImagePainter;", "model", "", "transform", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "onState", "", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "rememberAsyncImagePainter-19ie5dc", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;ILandroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;", "modelEqualityDelegate", "Lcoil/compose/EqualityDelegate;", "rememberAsyncImagePainter-EHKIwbg", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;ILcoil/compose/EqualityDelegate;Landroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;", "placeholder", "Landroidx/compose/ui/graphics/painter/Painter;", "error", "fallback", "onLoading", "Lcoil/compose/AsyncImagePainter$State$Loading;", "onSuccess", "Lcoil/compose/AsyncImagePainter$State$Success;", "onError", "Lcoil/compose/AsyncImagePainter$State$Error;", "rememberAsyncImagePainter-MqR-F_0", "(Ljava/lang/Object;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;ILandroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;", "rememberAsyncImagePainter-HtA5bXE", "(Ljava/lang/Object;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;ILcoil/compose/EqualityDelegate;Landroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;", "coil-compose-singleton_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class SingletonAsyncImagePainterKt {
    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public static final AsyncImagePainter rememberAsyncImagePainter-19ie5dc(Object object0, Function1 function10, Function1 function11, ContentScale contentScale0, int v, Composer composer0, int v1, int v2) {
        composer0.startReplaceableGroup(0xA6EFCC1D);
        Function1 function12 = (v2 & 2) == 0 ? function10 : AsyncImagePainter.Companion.getDefaultTransform();
        ContentScale contentScale1 = (v2 & 8) == 0 ? contentScale0 : ContentScale.Companion.getFit();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA6EFCC1D, v1, -1, "coil.compose.rememberAsyncImagePainter (SingletonAsyncImagePainter.kt:152)");
        }
        AsyncImagePainter asyncImagePainter0 = AsyncImagePainterKt.rememberAsyncImagePainter-0YpotYA(object0, ImageLoaderProvidableCompositionLocal.getCurrent(LocalImageLoaderKt.getLocalImageLoader(), composer0, 6), function12, ((v2 & 4) == 0 ? function11 : null), contentScale1, ((v2 & 16) == 0 ? v : 1), null, composer0, v1 << 3 & 0x380 | 72 | v1 << 3 & 0x1C00 | 0xE000 & v1 << 3 | v1 << 3 & 0x70000, 0x40);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return asyncImagePainter0;
    }

    @Composable
    @NotNull
    public static final AsyncImagePainter rememberAsyncImagePainter-EHKIwbg(@Nullable Object object0, @Nullable Function1 function10, @Nullable Function1 function11, @Nullable ContentScale contentScale0, int v, @Nullable EqualityDelegate equalityDelegate0, @Nullable Composer composer0, int v1, int v2) {
        composer0.startReplaceableGroup(0xE138316);
        Function1 function12 = (v2 & 2) == 0 ? function10 : AsyncImagePainter.Companion.getDefaultTransform();
        ContentScale contentScale1 = (v2 & 8) == 0 ? contentScale0 : ContentScale.Companion.getFit();
        EqualityDelegate equalityDelegate1 = (v2 & 0x20) == 0 ? equalityDelegate0 : EqualityDelegateKt.getDefaultModelEqualityDelegate();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE138316, v1, -1, "coil.compose.rememberAsyncImagePainter (SingletonAsyncImagePainter.kt:133)");
        }
        AsyncImagePainter asyncImagePainter0 = AsyncImagePainterKt.rememberAsyncImagePainter-0YpotYA(object0, ImageLoaderProvidableCompositionLocal.getCurrent(LocalImageLoaderKt.getLocalImageLoader(), composer0, 6), function12, ((v2 & 4) == 0 ? function11 : null), contentScale1, ((v2 & 16) == 0 ? v : 1), equalityDelegate1, composer0, v1 << 3 & 0x380 | 72 | v1 << 3 & 0x1C00 | 0xE000 & v1 << 3 | 0x70000 & v1 << 3 | v1 << 3 & 0x380000, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return asyncImagePainter0;
    }

    @Composable
    @NotNull
    public static final AsyncImagePainter rememberAsyncImagePainter-HtA5bXE(@Nullable Object object0, @Nullable Painter painter0, @Nullable Painter painter1, @Nullable Painter painter2, @Nullable Function1 function10, @Nullable Function1 function11, @Nullable Function1 function12, @Nullable ContentScale contentScale0, int v, @Nullable EqualityDelegate equalityDelegate0, @Nullable Composer composer0, int v1, int v2) {
        composer0.startReplaceableGroup(0x56259CE0);
        Painter painter3 = (v2 & 4) == 0 ? painter1 : null;
        ContentScale contentScale1 = (v2 & 0x80) == 0 ? contentScale0 : ContentScale.Companion.getFit();
        EqualityDelegate equalityDelegate1 = (v2 & 0x200) == 0 ? equalityDelegate0 : EqualityDelegateKt.getDefaultModelEqualityDelegate();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x56259CE0, v1, -1, "coil.compose.rememberAsyncImagePainter (SingletonAsyncImagePainter.kt:59)");
        }
        AsyncImagePainter asyncImagePainter0 = AsyncImagePainterKt.rememberAsyncImagePainter-10Xjiaw(object0, ImageLoaderProvidableCompositionLocal.getCurrent(LocalImageLoaderKt.getLocalImageLoader(), composer0, 6), ((v2 & 2) == 0 ? painter0 : null), painter3, ((v2 & 8) == 0 ? painter2 : painter3), ((v2 & 16) == 0 ? function10 : null), ((v2 & 0x20) == 0 ? function11 : null), ((v2 & 0x40) == 0 ? function12 : null), contentScale1, ((v2 & 0x100) == 0 ? v : 1), equalityDelegate1, composer0, 0x70000 & v1 << 3 | 0x9248 | 0x380000 & v1 << 3 | 0x1C00000 & v1 << 3 | 0xE000000 & v1 << 3 | v1 << 3 & 0x70000000, v1 >> 27 & 14, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return asyncImagePainter0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public static final AsyncImagePainter rememberAsyncImagePainter-MqR-F_0(Object object0, Painter painter0, Painter painter1, Painter painter2, Function1 function10, Function1 function11, Function1 function12, ContentScale contentScale0, int v, Composer composer0, int v1, int v2) {
        composer0.startReplaceableGroup(0x1FD2FD13);
        Painter painter3 = (v2 & 4) == 0 ? painter1 : null;
        ContentScale contentScale1 = (v2 & 0x80) == 0 ? contentScale0 : ContentScale.Companion.getFit();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1FD2FD13, v1, -1, "coil.compose.rememberAsyncImagePainter (SingletonAsyncImagePainter.kt:86)");
        }
        AsyncImagePainter asyncImagePainter0 = AsyncImagePainterKt.rememberAsyncImagePainter-10Xjiaw(object0, ImageLoaderProvidableCompositionLocal.getCurrent(LocalImageLoaderKt.getLocalImageLoader(), composer0, 6), ((v2 & 2) == 0 ? painter0 : null), painter3, ((v2 & 8) == 0 ? painter2 : painter3), ((v2 & 16) == 0 ? function10 : null), ((v2 & 0x20) == 0 ? function11 : null), ((v2 & 0x40) == 0 ? function12 : null), contentScale1, ((v2 & 0x100) == 0 ? v : 1), null, composer0, 0x70000 & v1 << 3 | 0x9248 | 0x380000 & v1 << 3 | 0x1C00000 & v1 << 3 | 0xE000000 & v1 << 3 | v1 << 3 & 0x70000000, 0, 0x400);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return asyncImagePainter0;
    }
}

