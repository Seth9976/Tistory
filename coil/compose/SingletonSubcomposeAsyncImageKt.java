package coil.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001A\u00B0\u0001\u0010\u0000\u001A\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\u0014\b\u0002\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0016\b\u0002\u0010\u000B\u001A\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u00112\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001A\u00020\u00152\u001C\u0010\u0016\u001A\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\t\u00A2\u0006\u0002\b\u0018\u00A2\u0006\u0002\b\u0019H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001A\u0010\u001B\u001A\u00C4\u0001\u0010\u0000\u001A\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\u0014\b\u0002\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0016\b\u0002\u0010\u000B\u001A\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u00112\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001A\u00020\u00152\b\b\u0002\u0010\u001C\u001A\u00020\u001D2\b\b\u0002\u0010\u001E\u001A\u00020\u001F2\u001C\u0010\u0016\u001A\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\t\u00A2\u0006\u0002\b\u0018\u00A2\u0006\u0002\b\u0019H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010!\u001A\u00CE\u0002\u0010\u0000\u001A\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\u0014\b\u0002\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2&\b\u0002\u0010\"\u001A \u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0001\u0018\u00010#\u00A2\u0006\u0002\b\u0018\u00A2\u0006\u0002\b\u00192&\b\u0002\u0010%\u001A \u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0001\u0018\u00010#\u00A2\u0006\u0002\b\u0018\u00A2\u0006\u0002\b\u00192&\b\u0002\u0010\'\u001A \u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0001\u0018\u00010#\u00A2\u0006\u0002\b\u0018\u00A2\u0006\u0002\b\u00192\u0016\b\u0002\u0010)\u001A\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u0010*\u001A\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u0010+\u001A\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u00112\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001A\u00020\u00152\b\b\u0002\u0010\u001C\u001A\u00020\u001D2\b\b\u0002\u0010\u001E\u001A\u00020\u001FH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b,\u0010-\u001A\u00A4\u0002\u0010\u0000\u001A\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072&\b\u0002\u0010\"\u001A \u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0001\u0018\u00010#\u00A2\u0006\u0002\b\u0018\u00A2\u0006\u0002\b\u00192&\b\u0002\u0010%\u001A \u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0001\u0018\u00010#\u00A2\u0006\u0002\b\u0018\u00A2\u0006\u0002\b\u00192&\b\u0002\u0010\'\u001A \u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0001\u0018\u00010#\u00A2\u0006\u0002\b\u0018\u00A2\u0006\u0002\b\u00192\u0016\b\u0002\u0010)\u001A\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u0010*\u001A\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u0010+\u001A\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u00112\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001A\u00020\u0015H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b.\u0010/\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00060"}, d2 = {"SubcomposeAsyncImage", "", "model", "", "contentDescription", "", "modifier", "Landroidx/compose/ui/Modifier;", "transform", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "onState", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "content", "Lcoil/compose/SubcomposeAsyncImageScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "SubcomposeAsyncImage-10Xjiaw", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "clipToBounds", "", "modelEqualityDelegate", "Lcoil/compose/EqualityDelegate;", "SubcomposeAsyncImage-OsCPg7o", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZLcoil/compose/EqualityDelegate;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "loading", "Lkotlin/Function2;", "Lcoil/compose/AsyncImagePainter$State$Loading;", "success", "Lcoil/compose/AsyncImagePainter$State$Success;", "error", "Lcoil/compose/AsyncImagePainter$State$Error;", "onLoading", "onSuccess", "onError", "SubcomposeAsyncImage-J-FEaFM", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZLcoil/compose/EqualityDelegate;Landroidx/compose/runtime/Composer;III)V", "SubcomposeAsyncImage-ylYTKUw", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;III)V", "coil-compose-singleton_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class SingletonSubcomposeAsyncImageKt {
    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public static final void SubcomposeAsyncImage-10Xjiaw(Object object0, String s, Modifier modifier0, Function1 function10, Function1 function11, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, int v, Function3 function30, Composer composer0, int v1, int v2, int v3) {
        composer0.startReplaceableGroup(0x5DADABBD);
        Modifier modifier1 = (v3 & 4) == 0 ? modifier0 : Modifier.Companion;
        Function1 function12 = (v3 & 8) == 0 ? function10 : AsyncImagePainter.Companion.getDefaultTransform();
        Alignment alignment1 = (v3 & 0x20) == 0 ? alignment0 : Alignment.Companion.getCenter();
        ContentScale contentScale1 = (v3 & 0x40) == 0 ? contentScale0 : ContentScale.Companion.getFit();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5DADABBD, v1, v2, "coil.compose.SubcomposeAsyncImage (SingletonSubcomposeAsyncImage.kt:198)");
        }
        SubcomposeAsyncImageKt.SubcomposeAsyncImage-FSyRiR8(object0, s, ImageLoaderProvidableCompositionLocal.getCurrent(LocalImageLoaderKt.getLocalImageLoader(), composer0, 6), modifier1, function12, ((v3 & 16) == 0 ? function11 : null), alignment1, contentScale1, ((v3 & 0x80) == 0 ? f : 1.0f), ((v3 & 0x100) == 0 ? colorFilter0 : null), ((v3 & 0x200) == 0 ? v : 1), false, null, function30, composer0, v1 & 0x70 | 520 | v1 << 3 & 0x1C00 | 0xE000 & v1 << 3 | 0x70000 & v1 << 3 | 0x380000 & v1 << 3 | 0x1C00000 & v1 << 3 | 0xE000000 & v1 << 3 | v1 << 3 & 0x70000000, v1 >> 27 & 14 | v2 << 9 & 0x1C00, 0x1800);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
    }

    @Composable
    public static final void SubcomposeAsyncImage-J-FEaFM(@Nullable Object object0, @Nullable String s, @Nullable Modifier modifier0, @Nullable Function1 function10, @Nullable Function4 function40, @Nullable Function4 function41, @Nullable Function4 function42, @Nullable Function1 function11, @Nullable Function1 function12, @Nullable Function1 function13, @Nullable Alignment alignment0, @Nullable ContentScale contentScale0, float f, @Nullable ColorFilter colorFilter0, int v, boolean z, @Nullable EqualityDelegate equalityDelegate0, @Nullable Composer composer0, int v1, int v2, int v3) {
        composer0.startReplaceableGroup(0x72C9B769);
        Modifier modifier1 = (v3 & 4) == 0 ? modifier0 : Modifier.Companion;
        Function1 function14 = (v3 & 8) == 0 ? function10 : AsyncImagePainter.Companion.getDefaultTransform();
        Alignment alignment1 = (v3 & 0x400) == 0 ? alignment0 : Alignment.Companion.getCenter();
        ContentScale contentScale1 = (v3 & 0x800) == 0 ? contentScale0 : ContentScale.Companion.getFit();
        EqualityDelegate equalityDelegate1 = (v3 & 0x10000) == 0 ? equalityDelegate0 : EqualityDelegateKt.getDefaultModelEqualityDelegate();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x72C9B769, v1, v2, "coil.compose.SubcomposeAsyncImage (SingletonSubcomposeAsyncImage.kt:66)");
        }
        SubcomposeAsyncImageKt.SubcomposeAsyncImage-TCQMD7g(object0, s, ImageLoaderProvidableCompositionLocal.getCurrent(LocalImageLoaderKt.getLocalImageLoader(), composer0, 6), modifier1, function14, ((v3 & 16) == 0 ? function40 : null), ((v3 & 0x20) == 0 ? function41 : null), ((v3 & 0x40) == 0 ? function42 : null), ((v3 & 0x80) == 0 ? function11 : null), ((v3 & 0x100) == 0 ? function12 : null), ((v3 & 0x200) == 0 ? function13 : null), alignment1, contentScale1, ((v3 & 0x1000) == 0 ? f : 1.0f), ((v3 & 0x2000) == 0 ? colorFilter0 : null), ((v3 & 0x4000) == 0 ? v : 1), ((0x8000 & v3) == 0 ? z : true), equalityDelegate1, composer0, v1 & 0x70 | 520 | v1 << 3 & 0x1C00 | v1 << 3 & 0xE000 | v1 << 3 & 0x70000 | v1 << 3 & 0x380000 | v1 << 3 & 0x1C00000 | v1 << 3 & 0xE000000 | v1 << 3 & 0x70000000, v1 >> 27 & 14 | v2 << 3 & 0x70 | v2 << 3 & 0x380 | v2 << 3 & 0x1C00 | v2 << 3 & 0xE000 | v2 << 3 & 0x70000 | v2 << 3 & 0x380000 | v2 << 3 & 0x1C00000, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
    }

    @Composable
    public static final void SubcomposeAsyncImage-OsCPg7o(@Nullable Object object0, @Nullable String s, @Nullable Modifier modifier0, @Nullable Function1 function10, @Nullable Function1 function11, @Nullable Alignment alignment0, @Nullable ContentScale contentScale0, float f, @Nullable ColorFilter colorFilter0, int v, boolean z, @Nullable EqualityDelegate equalityDelegate0, @NotNull Function3 function30, @Nullable Composer composer0, int v1, int v2, int v3) {
        composer0.startReplaceableGroup(0xE6A1372);
        Modifier modifier1 = (v3 & 4) == 0 ? modifier0 : Modifier.Companion;
        Function1 function12 = (v3 & 8) == 0 ? function10 : AsyncImagePainter.Companion.getDefaultTransform();
        Alignment alignment1 = (v3 & 0x20) == 0 ? alignment0 : Alignment.Companion.getCenter();
        ContentScale contentScale1 = (v3 & 0x40) == 0 ? contentScale0 : ContentScale.Companion.getFit();
        EqualityDelegate equalityDelegate1 = (v3 & 0x800) == 0 ? equalityDelegate0 : EqualityDelegateKt.getDefaultModelEqualityDelegate();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE6A1372, v1, v2, "coil.compose.SubcomposeAsyncImage (SingletonSubcomposeAsyncImage.kt:166)");
        }
        SubcomposeAsyncImageKt.SubcomposeAsyncImage-FSyRiR8(object0, s, ImageLoaderProvidableCompositionLocal.getCurrent(LocalImageLoaderKt.getLocalImageLoader(), composer0, 6), modifier1, function12, ((v3 & 16) == 0 ? function11 : null), alignment1, contentScale1, ((v3 & 0x80) == 0 ? f : 1.0f), ((v3 & 0x100) == 0 ? colorFilter0 : null), ((v3 & 0x200) == 0 ? v : 1), ((v3 & 0x400) == 0 ? z : true), equalityDelegate1, function30, composer0, v1 & 0x70 | 520 | v1 << 3 & 0x1C00 | 0xE000 & v1 << 3 | 0x70000 & v1 << 3 | 0x380000 & v1 << 3 | 0x1C00000 & v1 << 3 | 0xE000000 & v1 << 3 | v1 << 3 & 0x70000000, v1 >> 27 & 14 | v2 << 3 & 0x70 | v2 << 3 & 0x380 | v2 << 3 & 0x1C00, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public static final void SubcomposeAsyncImage-ylYTKUw(Object object0, String s, Modifier modifier0, Function4 function40, Function4 function41, Function4 function42, Function1 function10, Function1 function11, Function1 function12, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, int v, Composer composer0, int v1, int v2, int v3) {
        composer0.startReplaceableGroup(1047090393);
        Modifier modifier1 = (v3 & 4) == 0 ? modifier0 : Modifier.Companion;
        Alignment alignment1 = (v3 & 0x200) == 0 ? alignment0 : Alignment.Companion.getCenter();
        ContentScale contentScale1 = (v3 & 0x400) == 0 ? contentScale0 : ContentScale.Companion.getFit();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1047090393, v1, v2, "coil.compose.SubcomposeAsyncImage (SingletonSubcomposeAsyncImage.kt:105)");
        }
        SubcomposeAsyncImageKt.SubcomposeAsyncImage-TCQMD7g(object0, s, ImageLoaderProvidableCompositionLocal.getCurrent(LocalImageLoaderKt.getLocalImageLoader(), composer0, 6), modifier1, AsyncImagePainter.Companion.getDefaultTransform(), ((v3 & 8) == 0 ? function40 : null), ((v3 & 16) == 0 ? function41 : null), ((v3 & 0x20) == 0 ? function42 : null), ((v3 & 0x40) == 0 ? function10 : null), ((v3 & 0x80) == 0 ? function11 : null), ((v3 & 0x100) == 0 ? function12 : null), alignment1, contentScale1, ((v3 & 0x800) == 0 ? f : 1.0f), ((v3 & 0x1000) == 0 ? colorFilter0 : null), ((v3 & 0x2000) == 0 ? v : 1), false, null, composer0, v1 << 3 & 0x1C00 | (v1 & 0x70 | 520) | v1 << 6 & 0x70000 | v1 << 6 & 0x380000 | v1 << 6 & 0x1C00000 | v1 << 6 & 0xE000000 | v1 << 6 & 0x70000000, v1 >> 24 & 0x7E | v2 << 6 & 0x380 | v2 << 6 & 0x1C00 | 0xE000 & v2 << 6 | v2 << 6 & 0x70000, 0x30000);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
    }
}

