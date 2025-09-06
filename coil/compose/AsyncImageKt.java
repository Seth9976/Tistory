package coil.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.size.SizeResolver;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p5.b;
import p5.c;

@Metadata(d1 = {"\u0000n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A\u00EC\u0001\u0010$\u001A\u00020\u000E2\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\u000F\u001A\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000E\u0018\u00010\f2\u0016\b\u0002\u0010\u0011\u001A\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000E\u0018\u00010\f2\u0016\b\u0002\u0010\u0013\u001A\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000E\u0018\u00010\f2\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u0019\u001A\u00020\u00182\n\b\u0002\u0010\u001B\u001A\u0004\u0018\u00010\u001A2\b\b\u0002\u0010\u001D\u001A\u00020\u001C2\b\b\u0002\u0010\u001F\u001A\u00020\u001E2\b\b\u0002\u0010!\u001A\u00020 H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\"\u0010#\u001A\u00D8\u0001\u0010$\u001A\u00020\u000E2\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\u000F\u001A\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000E\u0018\u00010\f2\u0016\b\u0002\u0010\u0011\u001A\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000E\u0018\u00010\f2\u0016\b\u0002\u0010\u0013\u001A\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000E\u0018\u00010\f2\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u0019\u001A\u00020\u00182\n\b\u0002\u0010\u001B\u001A\u0004\u0018\u00010\u001A2\b\b\u0002\u0010\u001D\u001A\u00020\u001CH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b%\u0010&\u001A\u00AE\u0001\u0010$\u001A\u00020\u000E2\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\u0014\b\u0002\u0010(\u001A\u000E\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\'0\f2\u0016\b\u0002\u0010)\u001A\u0010\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u000E\u0018\u00010\f2\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u0019\u001A\u00020\u00182\n\b\u0002\u0010\u001B\u001A\u0004\u0018\u00010\u001A2\b\b\u0002\u0010\u001D\u001A\u00020\u001C2\b\b\u0002\u0010\u001F\u001A\u00020\u001E2\b\b\u0002\u0010!\u001A\u00020 H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b*\u0010+\u001A\u009A\u0001\u0010$\u001A\u00020\u000E2\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\u0014\b\u0002\u0010(\u001A\u000E\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\'0\f2\u0016\b\u0002\u0010)\u001A\u0010\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u000E\u0018\u00010\f2\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u0019\u001A\u00020\u00182\n\b\u0002\u0010\u001B\u001A\u0004\u0018\u00010\u001A2\b\b\u0002\u0010\u001D\u001A\u00020\u001CH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006."}, d2 = {"", "model", "", "contentDescription", "Lcoil/ImageLoader;", "imageLoader", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/painter/Painter;", "placeholder", "error", "fallback", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State$Loading;", "", "onLoading", "Lcoil/compose/AsyncImagePainter$State$Success;", "onSuccess", "Lcoil/compose/AsyncImagePainter$State$Error;", "onError", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "", "clipToBounds", "Lcoil/compose/EqualityDelegate;", "modelEqualityDelegate", "AsyncImage-J-FEaFM", "(Ljava/lang/Object;Ljava/lang/String;Lcoil/ImageLoader;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZLcoil/compose/EqualityDelegate;Landroidx/compose/runtime/Composer;III)V", "AsyncImage", "AsyncImage-Q4Kwu38", "(Ljava/lang/Object;Ljava/lang/String;Lcoil/ImageLoader;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;III)V", "Lcoil/compose/AsyncImagePainter$State;", "transform", "onState", "AsyncImage-QgsmV_s", "(Ljava/lang/Object;Ljava/lang/String;Lcoil/ImageLoader;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZLcoil/compose/EqualityDelegate;Landroidx/compose/runtime/Composer;III)V", "AsyncImage-MvsnxeU", "(Ljava/lang/Object;Ljava/lang/String;Lcoil/ImageLoader;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;III)V", "coil-compose-base_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAsyncImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncImage.kt\ncoil/compose/AsyncImageKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,277:1\n1#2:278\n124#3,5:279\n130#3,5:292\n135#3:303\n137#3:306\n286#4,8:284\n294#4,2:304\n3737#5,6:297\n*S KotlinDebug\n*F\n+ 1 AsyncImage.kt\ncoil/compose/AsyncImageKt\n*L\n260#1:279,5\n260#1:292,5\n260#1:303\n260#1:306\n260#1:284,8\n260#1:304,2\n260#1:297,6\n*E\n"})
public final class AsyncImageKt {
    @Composable
    public static final void AsyncImage-J-FEaFM(@Nullable Object object0, @Nullable String s, @NotNull ImageLoader imageLoader0, @Nullable Modifier modifier0, @Nullable Painter painter0, @Nullable Painter painter1, @Nullable Painter painter2, @Nullable Function1 function10, @Nullable Function1 function11, @Nullable Function1 function12, @Nullable Alignment alignment0, @Nullable ContentScale contentScale0, float f, @Nullable ColorFilter colorFilter0, int v, boolean z, @Nullable EqualityDelegate equalityDelegate0, @Nullable Composer composer0, int v1, int v2, int v3) {
        int v5;
        composer0.startReplaceableGroup(0xA7B15BB8);
        Modifier modifier1 = (v3 & 8) == 0 ? modifier0 : Modifier.Companion;
        Painter painter3 = (v3 & 0x20) == 0 ? painter1 : null;
        Alignment alignment1 = (v3 & 0x400) == 0 ? alignment0 : Alignment.Companion.getCenter();
        ContentScale contentScale1 = (v3 & 0x800) == 0 ? contentScale0 : ContentScale.Companion.getFit();
        int v4 = (v3 & 0x4000) == 0 ? v : 1;
        EqualityDelegate equalityDelegate1 = (v3 & 0x10000) == 0 ? equalityDelegate0 : EqualityDelegateKt.getDefaultModelEqualityDelegate();
        if(ComposerKt.isTraceInProgress()) {
            v5 = v4;
            ComposerKt.traceEventStart(0xA7B15BB8, v1, v2, "coil.compose.AsyncImage (AsyncImage.kt:68)");
        }
        else {
            v5 = v4;
        }
        AsyncImageKt.a(new AsyncImageState(object0, equalityDelegate1, imageLoader0), s, modifier1, UtilsKt.transformOf(((v3 & 16) == 0 ? painter0 : null), painter3, ((v3 & 0x40) == 0 ? painter2 : painter3)), UtilsKt.onStateOf(((v3 & 0x80) == 0 ? function10 : null), ((v3 & 0x100) == 0 ? function11 : null), ((v3 & 0x200) == 0 ? function12 : null)), alignment1, contentScale1, ((v3 & 0x1000) == 0 ? f : 1.0f), ((v3 & 0x2000) == 0 ? colorFilter0 : null), v5, ((v3 & 0x8000) == 0 ? z : true), composer0, v1 >> 3 & 0x380 | v1 & 0x70 | 0x70000 & v2 << 15 | 0x380000 & v2 << 15 | 0x1C00000 & v2 << 15 | 0xE000000 & v2 << 15 | v2 << 15 & 0x70000000, v2 >> 15 & 14);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public static final void AsyncImage-MvsnxeU(Object object0, String s, ImageLoader imageLoader0, Modifier modifier0, Function1 function10, Function1 function11, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, int v, Composer composer0, int v1, int v2, int v3) {
        composer0.startReplaceableGroup(-2030202961);
        Modifier modifier1 = (v3 & 8) == 0 ? modifier0 : Modifier.Companion;
        Function1 function12 = (v3 & 16) == 0 ? function10 : AsyncImagePainter.Companion.getDefaultTransform();
        Alignment alignment1 = (v3 & 0x40) == 0 ? alignment0 : Alignment.Companion.getCenter();
        ContentScale contentScale1 = (v3 & 0x80) == 0 ? contentScale0 : ContentScale.Companion.getFit();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2030202961, v1, v2, "coil.compose.AsyncImage (AsyncImage.kt:186)");
        }
        AsyncImageKt.a(new AsyncImageState(object0, EqualityDelegateKt.getDefaultModelEqualityDelegate(), imageLoader0), s, modifier1, function12, ((v3 & 0x20) == 0 ? function11 : null), alignment1, contentScale1, ((v3 & 0x100) == 0 ? f : 1.0f), ((v3 & 0x200) == 0 ? colorFilter0 : null), ((v3 & 0x400) == 0 ? v : 1), true, composer0, v1 >> 3 & 0xE000000 | (v1 & 0x70 | v1 >> 3 & 0x380 | v1 >> 3 & 0x1C00 | 0xE000 & v1 >> 3 | 0x70000 & v1 >> 3 | 0x380000 & v1 >> 3 | 0x1C00000 & v1 >> 3) | v2 << 27 & 0x70000000, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public static final void AsyncImage-Q4Kwu38(Object object0, String s, ImageLoader imageLoader0, Modifier modifier0, Painter painter0, Painter painter1, Painter painter2, Function1 function10, Function1 function11, Function1 function12, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, int v, Composer composer0, int v1, int v2, int v3) {
        composer0.startReplaceableGroup(0xF156DFF9);
        Modifier modifier1 = (v3 & 8) == 0 ? modifier0 : Modifier.Companion;
        Painter painter3 = (v3 & 0x20) == 0 ? painter1 : null;
        Alignment alignment1 = (v3 & 0x400) == 0 ? alignment0 : Alignment.Companion.getCenter();
        ContentScale contentScale1 = (v3 & 0x800) == 0 ? contentScale0 : ContentScale.Companion.getFit();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF156DFF9, v1, v2, "coil.compose.AsyncImage (AsyncImage.kt:101)");
        }
        AsyncImageKt.a(new AsyncImageState(object0, EqualityDelegateKt.getDefaultModelEqualityDelegate(), imageLoader0), s, modifier1, UtilsKt.transformOf(((v3 & 16) == 0 ? painter0 : null), painter3, ((v3 & 0x40) == 0 ? painter2 : painter3)), UtilsKt.onStateOf(((v3 & 0x80) == 0 ? function10 : null), ((v3 & 0x100) == 0 ? function11 : null), ((v3 & 0x200) == 0 ? function12 : null)), alignment1, contentScale1, ((v3 & 0x1000) == 0 ? f : 1.0f), ((v3 & 0x2000) == 0 ? colorFilter0 : null), ((v3 & 0x4000) == 0 ? v : 1), true, composer0, v1 >> 3 & 0x380 | v1 & 0x70 | 0x70000 & v2 << 15 | 0x380000 & v2 << 15 | 0x1C00000 & v2 << 15 | 0xE000000 & v2 << 15 | v2 << 15 & 0x70000000, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
    }

    @Composable
    public static final void AsyncImage-QgsmV_s(@Nullable Object object0, @Nullable String s, @NotNull ImageLoader imageLoader0, @Nullable Modifier modifier0, @Nullable Function1 function10, @Nullable Function1 function11, @Nullable Alignment alignment0, @Nullable ContentScale contentScale0, float f, @Nullable ColorFilter colorFilter0, int v, boolean z, @Nullable EqualityDelegate equalityDelegate0, @Nullable Composer composer0, int v1, int v2, int v3) {
        composer0.startReplaceableGroup(2032051394);
        Modifier modifier1 = (v3 & 8) == 0 ? modifier0 : Modifier.Companion;
        Function1 function12 = (v3 & 16) == 0 ? function10 : AsyncImagePainter.Companion.getDefaultTransform();
        Alignment alignment1 = (v3 & 0x40) == 0 ? alignment0 : Alignment.Companion.getCenter();
        ContentScale contentScale1 = (v3 & 0x80) == 0 ? contentScale0 : ContentScale.Companion.getFit();
        EqualityDelegate equalityDelegate1 = (v3 & 0x1000) == 0 ? equalityDelegate0 : EqualityDelegateKt.getDefaultModelEqualityDelegate();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2032051394, v1, v2, "coil.compose.AsyncImage (AsyncImage.kt:157)");
        }
        AsyncImageKt.a(new AsyncImageState(object0, equalityDelegate1, imageLoader0), s, modifier1, function12, ((v3 & 0x20) == 0 ? function11 : null), alignment1, contentScale1, ((v3 & 0x100) == 0 ? f : 1.0f), ((v3 & 0x200) == 0 ? colorFilter0 : null), ((v3 & 0x400) == 0 ? v : 1), ((v3 & 0x800) == 0 ? z : true), composer0, v1 >> 3 & 0xE000000 | (v1 & 0x70 | v1 >> 3 & 0x380 | v1 >> 3 & 0x1C00 | 0xE000 & v1 >> 3 | 0x70000 & v1 >> 3 | 0x380000 & v1 >> 3 | 0x1C00000 & v1 >> 3) | v2 << 27 & 0x70000000, v2 >> 3 & 14);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
    }

    public static final void a(AsyncImageState asyncImageState0, String s, Modifier modifier0, Function1 function10, Function1 function11, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, int v, boolean z, Composer composer0, int v1, int v2) {
        int v5;
        Composer composer1 = composer0.startRestartGroup(0xE6DF013B);
        int v3 = 4;
        int v4 = (v1 & 14) == 0 ? (composer1.changed(asyncImageState0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v4 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 0x1C00) == 0) {
            v4 |= (composer1.changedInstance(function10) ? 0x800 : 0x400);
        }
        if((v1 & 0xE000) == 0) {
            v4 |= (composer1.changedInstance(function11) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x70000) == 0) {
            v4 |= (composer1.changed(alignment0) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x380000) == 0) {
            v4 |= (composer1.changed(contentScale0) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x1C00000) == 0) {
            v4 |= (composer1.changed(f) ? 0x800000 : 0x400000);
        }
        if((0xE000000 & v1) == 0) {
            v4 |= (composer1.changed(colorFilter0) ? 0x4000000 : 0x2000000);
        }
        if((v1 & 0x70000000) == 0) {
            v4 |= (composer1.changed(v) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 14) == 0) {
            if(!composer1.changed(z)) {
                v3 = 2;
            }
            v5 = v2 | v3;
        }
        else {
            v5 = v2;
        }
        if((v4 & 0x5B6DB6DB) != 306783378 || (v5 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE6DF013B, v4, v5, "coil.compose.AsyncImage (AsyncImage.kt:213)");
            }
            ImageRequest imageRequest0 = UtilsKt.requestOfWithSizeResolver(asyncImageState0.getModel(), contentScale0, composer1, v4 >> 15 & 0x70 | 8);
            int v6 = v4 >> 6 & 0xE000;
            AsyncImagePainter asyncImagePainter0 = AsyncImagePainterKt.rememberAsyncImagePainter-0YpotYA(imageRequest0, asyncImageState0.getImageLoader(), function10, function11, contentScale0, v, asyncImageState0.getModelEqualityDelegate(), composer1, v4 >> 3 & 0x380 | 72 | v4 >> 3 & 0x1C00 | v6 | v4 >> 12 & 0x70000, 0);
            SizeResolver sizeResolver0 = imageRequest0.getSizeResolver();
            AsyncImageKt.b((sizeResolver0 instanceof ConstraintsSizeResolver ? modifier0.then(((Modifier)sizeResolver0)) : modifier0), asyncImagePainter0, s, alignment0, contentScale0, f, colorFilter0, z, composer1, v4 << 3 & 0x380 | v4 >> 6 & 0x1C00 | v6 | v4 >> 6 & 0x70000 | v4 >> 6 & 0x380000 | v5 << 21 & 0x1C00000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a(asyncImageState0, s, modifier0, function10, function11, alignment0, contentScale0, f, colorFilter0, v, z, v1, v2));
        }
    }

    public static final void b(Modifier modifier0, AsyncImagePainter asyncImagePainter0, String s, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, boolean z, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x2E5BE4E8);
        int v1 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(asyncImagePainter0) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(s) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changed(alignment0) ? 0x800 : 0x400);
        }
        if((0xE000 & v) == 0) {
            v1 |= (composer1.changed(contentScale0) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v) == 0) {
            v1 |= (composer1.changed(f) ? 0x20000 : 0x10000);
        }
        if((0x380000 & v) == 0) {
            v1 |= (composer1.changed(colorFilter0) ? 0x100000 : 0x80000);
        }
        if((0x1C00000 & v) == 0) {
            v1 |= (composer1.changed(z) ? 0x800000 : 0x400000);
        }
        if((0x16DB6DB & v1) != 4793490 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2E5BE4E8, v1, -1, "coil.compose.Content (AsyncImage.kt:259)");
            }
            Modifier modifier1 = UtilsKt.contentDescription(modifier0, s);
            if(z) {
                modifier1 = ClipKt.clipToBounds(modifier1);
            }
            Modifier modifier2 = modifier1.then(new ContentPainterElement(asyncImagePainter0, alignment0, contentScale0, f, colorFilter0));
            b b0 = b.b;
            composer1.startReplaceableGroup(0x207BAF9A);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            composer1.startReplaceableGroup(1405779621);
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(new AsyncImageKt.Content..inlined.Layout.1(function00));
            }
            else {
                composer1.useNode();
            }
            Updater.set-impl(composer1, b0, composeUiNode$Companion0.getSetMeasurePolicy());
            Updater.set-impl(composer1, compositionLocalMap0, composeUiNode$Companion0.getSetResolvedCompositionLocals());
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            Function2 function20 = composeUiNode$Companion0.getSetCompositeKeyHash();
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                androidx.room.a.t(v2, composer1, v2, function20);
            }
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c(modifier0, asyncImagePainter0, s, alignment0, contentScale0, f, colorFilter0, z, v));
        }
    }
}

