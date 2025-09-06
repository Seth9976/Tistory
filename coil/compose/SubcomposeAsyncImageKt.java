package coil.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.size.SizeResolver;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.y1;
import p5.b;
import p5.h;
import p5.i;
import p5.k;

@Metadata(d1 = {"\u0000~\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\u00D6\u0002\u0010)\u001A\u00020\u000E2\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\u0014\b\u0002\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2&\b\u0002\u0010\u0011\u001A \u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000E\u0018\u00010\u000B\u00A2\u0006\u0002\b\u000F\u00A2\u0006\u0002\b\u00102&\b\u0002\u0010\u0013\u001A \u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000E\u0018\u00010\u000B\u00A2\u0006\u0002\b\u000F\u00A2\u0006\u0002\b\u00102&\b\u0002\u0010\u0015\u001A \u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000E\u0018\u00010\u000B\u00A2\u0006\u0002\b\u000F\u00A2\u0006\u0002\b\u00102\u0016\b\u0002\u0010\u0016\u001A\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000E\u0018\u00010\b2\u0016\b\u0002\u0010\u0017\u001A\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000E\u0018\u00010\b2\u0016\b\u0002\u0010\u0018\u001A\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000E\u0018\u00010\b2\b\b\u0002\u0010\u001A\u001A\u00020\u00192\b\b\u0002\u0010\u001C\u001A\u00020\u001B2\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\n\b\u0002\u0010 \u001A\u0004\u0018\u00010\u001F2\b\b\u0002\u0010\"\u001A\u00020!2\b\b\u0002\u0010$\u001A\u00020#2\b\b\u0002\u0010&\u001A\u00020%H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\'\u0010(\u001A\u00AC\u0002\u0010)\u001A\u00020\u000E2\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062&\b\u0002\u0010\u0011\u001A \u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000E\u0018\u00010\u000B\u00A2\u0006\u0002\b\u000F\u00A2\u0006\u0002\b\u00102&\b\u0002\u0010\u0013\u001A \u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000E\u0018\u00010\u000B\u00A2\u0006\u0002\b\u000F\u00A2\u0006\u0002\b\u00102&\b\u0002\u0010\u0015\u001A \u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000E\u0018\u00010\u000B\u00A2\u0006\u0002\b\u000F\u00A2\u0006\u0002\b\u00102\u0016\b\u0002\u0010\u0016\u001A\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000E\u0018\u00010\b2\u0016\b\u0002\u0010\u0017\u001A\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000E\u0018\u00010\b2\u0016\b\u0002\u0010\u0018\u001A\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000E\u0018\u00010\b2\b\b\u0002\u0010\u001A\u001A\u00020\u00192\b\b\u0002\u0010\u001C\u001A\u00020\u001B2\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\n\b\u0002\u0010 \u001A\u0004\u0018\u00010\u001F2\b\b\u0002\u0010\"\u001A\u00020!H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b*\u0010+\u001A\u00CC\u0001\u0010)\u001A\u00020\u000E2\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\u0014\b\u0002\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0016\b\u0002\u0010,\u001A\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000E\u0018\u00010\b2\b\b\u0002\u0010\u001A\u001A\u00020\u00192\b\b\u0002\u0010\u001C\u001A\u00020\u001B2\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\n\b\u0002\u0010 \u001A\u0004\u0018\u00010\u001F2\b\b\u0002\u0010\"\u001A\u00020!2\b\b\u0002\u0010$\u001A\u00020#2\b\b\u0002\u0010&\u001A\u00020%2\u001C\u0010-\u001A\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000E0\b\u00A2\u0006\u0002\b\u000F\u00A2\u0006\u0002\b\u0010H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b.\u0010/\u001A\u00B8\u0001\u0010)\u001A\u00020\u000E2\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\u0014\b\u0002\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0016\b\u0002\u0010,\u001A\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000E\u0018\u00010\b2\b\b\u0002\u0010\u001A\u001A\u00020\u00192\b\b\u0002\u0010\u001C\u001A\u00020\u001B2\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\n\b\u0002\u0010 \u001A\u0004\u0018\u00010\u001F2\b\b\u0002\u0010\"\u001A\u00020!2\u001C\u0010-\u001A\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000E0\b\u00A2\u0006\u0002\b\u000F\u00A2\u0006\u0002\b\u0010H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b0\u00101\u001Ag\u00104\u001A\u00020\u000E*\u00020\f2\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u00103\u001A\u0002022\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001A\u001A\u00020\u00192\b\b\u0002\u0010\u001C\u001A\u00020\u001B2\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\n\b\u0002\u0010 \u001A\u0004\u0018\u00010\u001F2\b\b\u0002\u0010$\u001A\u00020#H\u0007\u00A2\u0006\u0004\b4\u00105\u001A]\u00104\u001A\u00020\u000E*\u00020\f2\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u00103\u001A\u0002022\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001A\u001A\u00020\u00192\b\b\u0002\u0010\u001C\u001A\u00020\u001B2\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\n\b\u0002\u0010 \u001A\u0004\u0018\u00010\u001FH\u0007\u00A2\u0006\u0004\b4\u00106\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00067"}, d2 = {"", "model", "", "contentDescription", "Lcoil/ImageLoader;", "imageLoader", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "transform", "Lkotlin/Function2;", "Lcoil/compose/SubcomposeAsyncImageScope;", "Lcoil/compose/AsyncImagePainter$State$Loading;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "loading", "Lcoil/compose/AsyncImagePainter$State$Success;", "success", "Lcoil/compose/AsyncImagePainter$State$Error;", "error", "onLoading", "onSuccess", "onError", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "", "clipToBounds", "Lcoil/compose/EqualityDelegate;", "modelEqualityDelegate", "SubcomposeAsyncImage-TCQMD7g", "(Ljava/lang/Object;Ljava/lang/String;Lcoil/ImageLoader;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZLcoil/compose/EqualityDelegate;Landroidx/compose/runtime/Composer;III)V", "SubcomposeAsyncImage", "SubcomposeAsyncImage-Q4Kwu38", "(Ljava/lang/Object;Ljava/lang/String;Lcoil/ImageLoader;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;III)V", "onState", "content", "SubcomposeAsyncImage-FSyRiR8", "(Ljava/lang/Object;Ljava/lang/String;Lcoil/ImageLoader;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZLcoil/compose/EqualityDelegate;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SubcomposeAsyncImage-sKDTAoQ", "(Ljava/lang/Object;Ljava/lang/String;Lcoil/ImageLoader;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "SubcomposeAsyncImageContent", "(Lcoil/compose/SubcomposeAsyncImageScope;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ZLandroidx/compose/runtime/Composer;II)V", "(Lcoil/compose/SubcomposeAsyncImageScope;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "coil-compose-base_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSubcomposeAsyncImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeAsyncImage.kt\ncoil/compose/SubcomposeAsyncImageKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,406:1\n72#2,2:407\n74#2:437\n78#2:442\n79#3,11:409\n92#3:441\n124#3,5:444\n130#3,5:457\n135#3:468\n137#3:471\n456#4,8:420\n464#4,3:434\n467#4,3:438\n286#4,8:449\n294#4,2:469\n3737#5,6:428\n3737#5,6:462\n1#6:443\n*S KotlinDebug\n*F\n+ 1 SubcomposeAsyncImage.kt\ncoil/compose/SubcomposeAsyncImageKt\n*L\n248#1:407,2\n248#1:437\n248#1:442\n248#1:409,11\n248#1:441\n336#1:444,5\n336#1:457,5\n336#1:468\n336#1:471\n248#1:420,8\n248#1:434,3\n248#1:438,3\n336#1:449,8\n336#1:469,2\n248#1:428,6\n336#1:462,6\n*E\n"})
public final class SubcomposeAsyncImageKt {
    @Composable
    public static final void SubcomposeAsyncImage-FSyRiR8(@Nullable Object object0, @Nullable String s, @NotNull ImageLoader imageLoader0, @Nullable Modifier modifier0, @Nullable Function1 function10, @Nullable Function1 function11, @Nullable Alignment alignment0, @Nullable ContentScale contentScale0, float f, @Nullable ColorFilter colorFilter0, int v, boolean z, @Nullable EqualityDelegate equalityDelegate0, @NotNull Function3 function30, @Nullable Composer composer0, int v1, int v2, int v3) {
        composer0.startReplaceableGroup(0x81567CB1);
        Modifier modifier1 = (v3 & 8) == 0 ? modifier0 : Modifier.Companion;
        Function1 function12 = (v3 & 16) == 0 ? function10 : AsyncImagePainter.Companion.getDefaultTransform();
        Alignment alignment1 = (v3 & 0x40) == 0 ? alignment0 : Alignment.Companion.getCenter();
        ContentScale contentScale1 = (v3 & 0x80) == 0 ? contentScale0 : ContentScale.Companion.getFit();
        EqualityDelegate equalityDelegate1 = (v3 & 0x1000) == 0 ? equalityDelegate0 : EqualityDelegateKt.getDefaultModelEqualityDelegate();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x81567CB1, v1, v2, "coil.compose.SubcomposeAsyncImage (SubcomposeAsyncImage.kt:168)");
        }
        SubcomposeAsyncImageKt.a(new AsyncImageState(object0, equalityDelegate1, imageLoader0), s, modifier1, function12, ((v3 & 0x20) == 0 ? function11 : null), alignment1, contentScale1, ((v3 & 0x100) == 0 ? f : 1.0f), ((v3 & 0x200) == 0 ? colorFilter0 : null), ((v3 & 0x400) == 0 ? v : 1), ((v3 & 0x800) == 0 ? z : true), function30, composer0, v1 >> 3 & 0xE000000 | (v1 & 0x70 | v1 >> 3 & 0x380 | v1 >> 3 & 0x1C00 | 0xE000 & v1 >> 3 | 0x70000 & v1 >> 3 | 0x380000 & v1 >> 3 | 0x1C00000 & v1 >> 3) | v2 << 27 & 0x70000000, v2 >> 3 & 14 | v2 >> 6 & 0x70, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public static final void SubcomposeAsyncImage-Q4Kwu38(Object object0, String s, ImageLoader imageLoader0, Modifier modifier0, Function4 function40, Function4 function41, Function4 function42, Function1 function10, Function1 function11, Function1 function12, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, int v, Composer composer0, int v1, int v2, int v3) {
        composer0.startReplaceableGroup(0x37B82CA6);
        Modifier modifier1 = (v3 & 8) == 0 ? modifier0 : Modifier.Companion;
        Function4 function43 = (v3 & 16) == 0 ? function40 : null;
        Function4 function44 = (v3 & 0x20) == 0 ? function41 : null;
        Function4 function45 = (v3 & 0x40) == 0 ? function42 : null;
        Alignment alignment1 = (v3 & 0x400) == 0 ? alignment0 : Alignment.Companion.getCenter();
        ContentScale contentScale1 = (v3 & 0x800) == 0 ? contentScale0 : ContentScale.Companion.getFit();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x37B82CA6, v1, v2, "coil.compose.SubcomposeAsyncImage (SubcomposeAsyncImage.kt:109)");
        }
        AsyncImageState asyncImageState0 = new AsyncImageState(object0, EqualityDelegateKt.getDefaultModelEqualityDelegate(), imageLoader0);
        Function1 function13 = AsyncImagePainter.Companion.getDefaultTransform();
        Function1 function14 = UtilsKt.onStateOf(((v3 & 0x80) == 0 ? function10 : null), ((v3 & 0x100) == 0 ? function11 : null), ((v3 & 0x200) == 0 ? function12 : null));
        Function3 function30 = function43 != null || function44 != null || function45 != null ? ComposableLambdaKt.composableLambdaInstance(-1302781228, true, new g(function43, function44, function45)) : ComposableSingletons.SubcomposeAsyncImageKt.INSTANCE.getLambda-1$coil_compose_base_release();
        SubcomposeAsyncImageKt.a(asyncImageState0, s, modifier1, function13, function14, alignment1, contentScale1, ((v3 & 0x1000) == 0 ? f : 1.0f), ((v3 & 0x2000) == 0 ? colorFilter0 : null), ((v3 & 0x4000) == 0 ? v : 1), true, function30, composer0, v1 >> 3 & 0x380 | (v1 & 0x70 | 0xC00) | 0x70000 & v2 << 15 | 0x380000 & v2 << 15 | 0x1C00000 & v2 << 15 | 0xE000000 & v2 << 15 | v2 << 15 & 0x70000000, 6, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
    }

    @Composable
    public static final void SubcomposeAsyncImage-TCQMD7g(@Nullable Object object0, @Nullable String s, @NotNull ImageLoader imageLoader0, @Nullable Modifier modifier0, @Nullable Function1 function10, @Nullable Function4 function40, @Nullable Function4 function41, @Nullable Function4 function42, @Nullable Function1 function11, @Nullable Function1 function12, @Nullable Function1 function13, @Nullable Alignment alignment0, @Nullable ContentScale contentScale0, float f, @Nullable ColorFilter colorFilter0, int v, boolean z, @Nullable EqualityDelegate equalityDelegate0, @Nullable Composer composer0, int v1, int v2, int v3) {
        ColorFilter colorFilter2;
        composer0.startReplaceableGroup(0x198B8CDA);
        Modifier modifier1 = (v3 & 8) == 0 ? modifier0 : Modifier.Companion;
        Function1 function14 = (v3 & 16) == 0 ? function10 : AsyncImagePainter.Companion.getDefaultTransform();
        Function4 function43 = (v3 & 0x20) == 0 ? function40 : null;
        Function4 function44 = (v3 & 0x40) == 0 ? function41 : null;
        Function4 function45 = (v3 & 0x80) == 0 ? function42 : null;
        Alignment alignment1 = (v3 & 0x800) == 0 ? alignment0 : Alignment.Companion.getCenter();
        ContentScale contentScale1 = (v3 & 0x1000) == 0 ? contentScale0 : ContentScale.Companion.getFit();
        ColorFilter colorFilter1 = (v3 & 0x4000) == 0 ? colorFilter0 : null;
        EqualityDelegate equalityDelegate1 = (v3 & 0x20000) == 0 ? equalityDelegate0 : EqualityDelegateKt.getDefaultModelEqualityDelegate();
        if(ComposerKt.isTraceInProgress()) {
            colorFilter2 = colorFilter1;
            ComposerKt.traceEventStart(0x198B8CDA, v1, v2, "coil.compose.SubcomposeAsyncImage (SubcomposeAsyncImage.kt:75)");
        }
        else {
            colorFilter2 = colorFilter1;
        }
        AsyncImageState asyncImageState0 = new AsyncImageState(object0, equalityDelegate1, imageLoader0);
        Function1 function15 = UtilsKt.onStateOf(((v3 & 0x100) == 0 ? function11 : null), ((v3 & 0x200) == 0 ? function12 : null), ((v3 & 0x400) == 0 ? function13 : null));
        Function3 function30 = function43 != null || function44 != null || function45 != null ? ComposableLambdaKt.composableLambdaInstance(-1302781228, true, new g(function43, function44, function45)) : ComposableSingletons.SubcomposeAsyncImageKt.INSTANCE.getLambda-1$coil_compose_base_release();
        SubcomposeAsyncImageKt.a(asyncImageState0, s, modifier1, function14, function15, alignment1, contentScale1, ((v3 & 0x2000) == 0 ? f : 1.0f), colorFilter2, ((v3 & 0x8000) == 0 ? v : 1), ((v3 & 0x10000) == 0 ? z : true), function30, composer0, v1 >> 3 & 0x1C00 | (v1 & 0x70 | v1 >> 3 & 0x380) | 0x70000 & v2 << 12 | 0x380000 & v2 << 12 | 0x1C00000 & v2 << 12 | 0xE000000 & v2 << 12 | v2 << 12 & 0x70000000, v2 >> 18 & 14, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public static final void SubcomposeAsyncImage-sKDTAoQ(Object object0, String s, ImageLoader imageLoader0, Modifier modifier0, Function1 function10, Function1 function11, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, int v, Function3 function30, Composer composer0, int v1, int v2, int v3) {
        composer0.startReplaceableGroup(10937794);
        Modifier modifier1 = (v3 & 8) == 0 ? modifier0 : Modifier.Companion;
        Function1 function12 = (v3 & 16) == 0 ? function10 : AsyncImagePainter.Companion.getDefaultTransform();
        Alignment alignment1 = (v3 & 0x40) == 0 ? alignment0 : Alignment.Companion.getCenter();
        ContentScale contentScale1 = (v3 & 0x80) == 0 ? contentScale0 : ContentScale.Companion.getFit();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(10937794, v1, v2, "coil.compose.SubcomposeAsyncImage (SubcomposeAsyncImage.kt:199)");
        }
        SubcomposeAsyncImageKt.a(new AsyncImageState(object0, EqualityDelegateKt.getDefaultModelEqualityDelegate(), imageLoader0), s, modifier1, function12, ((v3 & 0x20) == 0 ? function11 : null), alignment1, contentScale1, ((v3 & 0x100) == 0 ? f : 1.0f), ((v3 & 0x200) == 0 ? colorFilter0 : null), ((v3 & 0x400) == 0 ? v : 1), true, function30, composer0, v1 >> 3 & 0xE000000 | (v1 & 0x70 | v1 >> 3 & 0x380 | v1 >> 3 & 0x1C00 | 0xE000 & v1 >> 3 | 0x70000 & v1 >> 3 | 0x380000 & v1 >> 3 | 0x1C00000 & v1 >> 3) | v2 << 27 & 0x70000000, v2 & 0x70 | 6, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public static final void SubcomposeAsyncImageContent(SubcomposeAsyncImageScope subcomposeAsyncImageScope0, Modifier modifier0, Painter painter0, String s, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, Composer composer0, int v, int v1) {
        float f1;
        ColorFilter colorFilter1;
        ContentScale contentScale1;
        Alignment alignment1;
        String s1;
        Painter painter1;
        float f2;
        int v3;
        Alignment alignment2;
        String s2;
        float f3;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xF043F317);
        if((v1 & 0x80000000) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(subcomposeAsyncImageScope0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 1) != 0) {
            v2 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v & 0x70) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x80;
        }
        if((v & 0x1C00) == 0) {
            v2 |= ((v1 & 4) != 0 || !composer1.changed(s) ? 0x400 : 0x800);
        }
        if((v & 0xE000) == 0) {
            v2 |= ((v1 & 8) != 0 || !composer1.changed(alignment0) ? 0x2000 : 0x4000);
        }
        if((v & 0x70000) == 0) {
            v2 |= ((v1 & 16) != 0 || !composer1.changed(contentScale0) ? 0x10000 : 0x20000);
        }
        if((v & 0x380000) == 0) {
            v2 |= ((v1 & 0x20) != 0 || !composer1.changed(f) ? 0x80000 : 0x100000);
        }
        if((v & 0x1C00000) == 0) {
            v2 |= ((v1 & 0x40) != 0 || !composer1.changed(colorFilter0) ? 0x400000 : 0x800000);
        }
        if((v1 & 2) != 2 || (0x16DB6DB & v2) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 1) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v1 & 2) == 0) {
                    painter1 = painter0;
                }
                else {
                    painter1 = subcomposeAsyncImageScope0.getPainter();
                    v2 &= -897;
                }
                if((v1 & 4) == 0) {
                    s2 = s;
                }
                else {
                    s2 = subcomposeAsyncImageScope0.getContentDescription();
                    v2 &= 0xFFFFE3FF;
                }
                if((v1 & 8) == 0) {
                    alignment2 = alignment0;
                }
                else {
                    alignment2 = subcomposeAsyncImageScope0.getAlignment();
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 16) == 0) {
                    contentScale1 = contentScale0;
                }
                else {
                    contentScale1 = subcomposeAsyncImageScope0.getContentScale();
                    v2 &= 0xFFF8FFFF;
                }
                if((v1 & 0x20) == 0) {
                    f3 = f;
                }
                else {
                    f3 = subcomposeAsyncImageScope0.getAlpha();
                    v2 &= 0xFFC7FFFF;
                }
                if((v1 & 0x40) == 0) {
                    colorFilter1 = colorFilter0;
                }
                else {
                    v2 &= 0xFE3FFFFF;
                    colorFilter1 = subcomposeAsyncImageScope0.getColorFilter();
                }
                v3 = v2;
                f2 = f3;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 2) != 0) {
                    v2 &= -897;
                }
                if((v1 & 4) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFE3FFFFF;
                }
                painter1 = painter0;
                s2 = s;
                alignment2 = alignment0;
                contentScale1 = contentScale0;
                colorFilter1 = colorFilter0;
                v3 = v2;
                f2 = f;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF043F317, v3, -1, "coil.compose.SubcomposeAsyncImageContent (SubcomposeAsyncImage.kt:363)");
            }
            SubcomposeAsyncImageKt.SubcomposeAsyncImageContent(subcomposeAsyncImageScope0, modifier1, painter1, s2, alignment2, contentScale1, f2, colorFilter1, false, composer1, v3 & 14 | 0x200 | v3 & 0x70 | v3 & 0x1C00 | 0xE000 & v3 | 0x70000 & v3 | 0x380000 & v3 | v3 & 0x1C00000, 0x80);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f1 = f2;
            s1 = s2;
            alignment1 = alignment2;
        }
        else {
            composer1.skipToGroupEnd();
            painter1 = painter0;
            s1 = s;
            alignment1 = alignment0;
            contentScale1 = contentScale0;
            colorFilter1 = colorFilter0;
            f1 = f;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y1(subcomposeAsyncImageScope0, modifier1, painter1, s1, alignment1, contentScale1, f1, colorFilter1, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void SubcomposeAsyncImageContent(@NotNull SubcomposeAsyncImageScope subcomposeAsyncImageScope0, @Nullable Modifier modifier0, @Nullable Painter painter0, @Nullable String s, @Nullable Alignment alignment0, @Nullable ContentScale contentScale0, float f, @Nullable ColorFilter colorFilter0, boolean z, @Nullable Composer composer0, int v, int v1) {
        ColorFilter colorFilter1;
        float f1;
        ContentScale contentScale1;
        Alignment alignment1;
        String s1;
        Modifier modifier2;
        Painter painter1;
        ColorFilter colorFilter2;
        float f2;
        ContentScale contentScale2;
        Alignment alignment2;
        String s2;
        Painter painter2;
        int v3;
        boolean z1;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(880638523);
        if((0x80000000 & v1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(subcomposeAsyncImageScope0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 1) != 0) {
            v2 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v & 0x70) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x80;
        }
        if((v & 0x1C00) == 0) {
            v2 |= ((v1 & 4) != 0 || !composer1.changed(s) ? 0x400 : 0x800);
        }
        if((0xE000 & v) == 0) {
            v2 |= ((v1 & 8) != 0 || !composer1.changed(alignment0) ? 0x2000 : 0x4000);
        }
        if((0x70000 & v) == 0) {
            v2 |= ((v1 & 16) != 0 || !composer1.changed(contentScale0) ? 0x10000 : 0x20000);
        }
        if((0x380000 & v) == 0) {
            v2 |= ((v1 & 0x20) != 0 || !composer1.changed(f) ? 0x80000 : 0x100000);
        }
        if((0x1C00000 & v) == 0) {
            v2 |= ((v1 & 0x40) != 0 || !composer1.changed(colorFilter0) ? 0x400000 : 0x800000);
        }
        if((0xE000000 & v) == 0) {
            if((v1 & 0x80) == 0) {
                z1 = z;
                v3 = composer1.changed(z1) ? 0x4000000 : 0x2000000;
            }
            else {
                z1 = z;
                v3 = 0x2000000;
            }
            v2 |= v3;
        }
        else {
            z1 = z;
        }
        if((v1 & 2) != 2 || (0xB6DB6DB & v2) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 1) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v1 & 2) == 0) {
                    painter2 = painter0;
                }
                else {
                    painter2 = subcomposeAsyncImageScope0.getPainter();
                    v2 &= -897;
                }
                if((v1 & 4) == 0) {
                    s2 = s;
                }
                else {
                    s2 = subcomposeAsyncImageScope0.getContentDescription();
                    v2 &= 0xFFFFE3FF;
                }
                if((v1 & 8) == 0) {
                    alignment2 = alignment0;
                }
                else {
                    alignment2 = subcomposeAsyncImageScope0.getAlignment();
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 16) == 0) {
                    contentScale2 = contentScale0;
                }
                else {
                    contentScale2 = subcomposeAsyncImageScope0.getContentScale();
                    v2 &= 0xFFF8FFFF;
                }
                if((v1 & 0x20) == 0) {
                    f2 = f;
                }
                else {
                    f2 = subcomposeAsyncImageScope0.getAlpha();
                    v2 &= 0xFFC7FFFF;
                }
                if((v1 & 0x40) == 0) {
                    colorFilter2 = colorFilter0;
                }
                else {
                    colorFilter2 = subcomposeAsyncImageScope0.getColorFilter();
                    v2 &= 0xFE3FFFFF;
                }
                if((v1 & 0x80) != 0) {
                    v2 &= 0xF1FFFFFF;
                    z1 = subcomposeAsyncImageScope0.getClipToBounds();
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 2) != 0) {
                    v2 &= -897;
                }
                if((v1 & 4) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFE3FFFFF;
                }
                if((v1 & 0x80) != 0) {
                    v2 &= 0xF1FFFFFF;
                }
                painter2 = painter0;
                s2 = s;
                alignment2 = alignment0;
                contentScale2 = contentScale0;
                f2 = f;
                colorFilter2 = colorFilter0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(880638523, v2, -1, "coil.compose.SubcomposeAsyncImageContent (SubcomposeAsyncImage.kt:335)");
            }
            Modifier modifier3 = UtilsKt.contentDescription(modifier1, s2);
            if(z1) {
                modifier3 = ClipKt.clipToBounds(modifier3);
            }
            Modifier modifier4 = modifier3.then(new ContentPainterElement(painter2, alignment2, contentScale2, f2, colorFilter2));
            b b0 = b.c;
            composer1.startReplaceableGroup(0x207BAF9A);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            composer1.startReplaceableGroup(1405779621);
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(new Function0(function00) {
                    public final Function0 w;

                    {
                        this.w = function00;
                        super(0);
                    }

                    @Override  // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Object invoke() {
                        return this.w.invoke();
                    }
                });
            }
            else {
                composer1.useNode();
            }
            Updater.set-impl(composer1, b0, composeUiNode$Companion0.getSetMeasurePolicy());
            Updater.set-impl(composer1, compositionLocalMap0, composeUiNode$Companion0.getSetResolvedCompositionLocals());
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            Function2 function20 = composeUiNode$Companion0.getSetCompositeKeyHash();
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                a.t(v4, composer1, v4, function20);
            }
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            painter1 = painter2;
            s1 = s2;
            modifier2 = modifier1;
            alignment1 = alignment2;
            contentScale1 = contentScale2;
            f1 = f2;
            colorFilter1 = colorFilter2;
        }
        else {
            composer1.skipToGroupEnd();
            painter1 = painter0;
            modifier2 = modifier1;
            s1 = s;
            alignment1 = alignment0;
            contentScale1 = contentScale0;
            f1 = f;
            colorFilter1 = colorFilter0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k(subcomposeAsyncImageScope0, modifier2, painter1, s1, alignment1, contentScale1, f1, colorFilter1, z1, v, v1));
        }
    }

    public static final void a(AsyncImageState asyncImageState0, String s, Modifier modifier0, Function1 function10, Function1 function11, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, int v, boolean z, Function3 function30, Composer composer0, int v1, int v2, int v3) {
        Modifier modifier1;
        int v5;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0xCAC8874E);
        if((v3 & 1) == 0) {
            v4 = (v1 & 14) == 0 ? (composer1.changed(asyncImageState0) ? 4 : 2) | v1 : v1;
        }
        else {
            v4 = v1 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v4 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v4 |= (composer1.changedInstance(function10) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v1 & 0xE000) == 0) {
            v4 |= (composer1.changedInstance(function11) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v1 & 0x70000) == 0) {
            v4 |= (composer1.changed(alignment0) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v1 & 0x380000) == 0) {
            v4 |= (composer1.changed(contentScale0) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((0x1C00000 & v1) == 0) {
            v4 |= (composer1.changed(f) ? 0x800000 : 0x400000);
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
        }
        else if((0xE000000 & v1) == 0) {
            v4 |= (composer1.changed(colorFilter0) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 0x200) != 0) {
            v4 |= 0x30000000;
        }
        else if((0x70000000 & v1) == 0) {
            v4 |= (composer1.changed(v) ? 0x20000000 : 0x10000000);
        }
        if((v3 & 0x400) == 0) {
            v5 = (v2 & 14) == 0 ? v2 | (composer1.changed(z) ? 4 : 2) : v2;
        }
        else {
            v5 = v2 | 6;
        }
        if((v3 & 0x800) != 0) {
            v5 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v5 |= (composer1.changedInstance(function30) ? 0x20 : 16);
        }
        if((v4 & 0x5B6DB6DB) != 306783378 || (v5 & 91) != 18 || !composer1.getSkipping()) {
            Modifier modifier2 = (v3 & 4) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCAC8874E, v4, v5, "coil.compose.SubcomposeAsyncImage (SubcomposeAsyncImage.kt:228)");
            }
            ImageRequest imageRequest0 = UtilsKt.requestOfWithSizeResolver(asyncImageState0.getModel(), contentScale0, composer1, v4 >> 15 & 0x70 | 8);
            AsyncImagePainter asyncImagePainter0 = AsyncImagePainterKt.rememberAsyncImagePainter-0YpotYA(imageRequest0, asyncImageState0.getImageLoader(), function10, function11, contentScale0, v, null, composer1, v4 >> 3 & 0x1C00 | (v4 >> 3 & 0x380 | 72) | v4 >> 6 & 0xE000 | v4 >> 12 & 0x70000, 0x40);
            SizeResolver sizeResolver0 = imageRequest0.getSizeResolver();
            if(sizeResolver0 instanceof ConstraintsSizeResolver) {
                composer1.startReplaceableGroup(0xF138387D);
                BoxWithConstraintsKt.BoxWithConstraints(modifier2, alignment0, true, ComposableLambdaKt.composableLambda(composer1, 0x2C9CE014, true, new i(((ConstraintsSizeResolver)sizeResolver0), function30, asyncImagePainter0, s, alignment0, contentScale0, f, colorFilter0, z)), composer1, v4 >> 6 & 14 | 0xD80 | v4 >> 12 & 0x70, 0);
            }
            else {
                composer1.startReplaceableGroup(0xF13835C2);
                composer1.startReplaceableGroup(0x2BB5B5D7);
                MeasurePolicy measurePolicy0 = BoxKt.rememberBoxMeasurePolicy(alignment0, true, composer1, (v4 >> 6 & 14 | 0x180 | v4 >> 12 & 0x70) >> 3 & 14 | 0x30);
                composer1.startReplaceableGroup(-1323940314);
                int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
                Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
                Function0 function00 = composeUiNode$Companion0.getConstructor();
                Function3 function31 = LayoutKt.modifierMaterializerOf(modifier2);
                if(composer1.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer1.startReusableNode();
                if(composer1.getInserting()) {
                    composer1.createNode(function00);
                }
                else {
                    composer1.useNode();
                }
                Function2 function20 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
                    a.t(v6, composer1, v6, function20);
                }
                r0.a.w(0, function31, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
                function30.invoke(new h(BoxScopeInstance.INSTANCE, asyncImagePainter0, s, alignment0, contentScale0, f, colorFilter0, z), composer1, ((int)(v5 & 0x70)));
                composer1.endReplaceableGroup();
                composer1.endNode();
                composer1.endReplaceableGroup();
                composer1.endReplaceableGroup();
            }
            composer1.endReplaceableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f(asyncImageState0, s, modifier1, function10, function11, alignment0, contentScale0, f, colorFilter0, v, z, function30, v1, v2, v3));
        }
    }
}

