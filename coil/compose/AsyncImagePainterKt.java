package coil.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.InspectionModeKt;
import coil.ImageLoader;
import coil.request.ImageRequest.Builder;
import coil.request.ImageRequest;
import coil.size.-Dimensions;
import coil.size.Dimension.Undefined;
import coil.size.Size;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zd.c;

@Metadata(d1 = {"\u0000P\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A\u00AE\u0001\u0010\u0019\u001A\u00020\u00162\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u000B\u001A\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0016\b\u0002\u0010\r\u001A\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0016\b\u0002\u0010\u000F\u001A\u0010\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0013\u001A\u00020\u00122\b\b\u0002\u0010\u0015\u001A\u00020\u0014H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0018\u001A\u00A4\u0001\u0010\u0019\u001A\u00020\u00162\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u000B\u001A\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0016\b\u0002\u0010\r\u001A\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0016\b\u0002\u0010\u000F\u001A\u0010\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0013\u001A\u00020\u0012H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001A\u0010\u001B\u001Ap\u0010\u0019\u001A\u00020\u00162\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0014\b\u0002\u0010\u001D\u001A\u000E\u0012\u0004\u0012\u00020\u001C\u0012\u0004\u0012\u00020\u001C0\b2\u0016\b\u0002\u0010\u001E\u001A\u0010\u0012\u0004\u0012\u00020\u001C\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0013\u001A\u00020\u00122\b\b\u0002\u0010\u0015\u001A\u00020\u0014H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010 \u001Af\u0010\u0019\u001A\u00020\u00162\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0014\b\u0002\u0010\u001D\u001A\u000E\u0012\u0004\u0012\u00020\u001C\u0012\u0004\u0012\u00020\u001C0\b2\u0016\b\u0002\u0010\u001E\u001A\u0010\u0012\u0004\u0012\u00020\u001C\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0013\u001A\u00020\u0012H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006#"}, d2 = {"", "model", "Lcoil/ImageLoader;", "imageLoader", "Landroidx/compose/ui/graphics/painter/Painter;", "placeholder", "error", "fallback", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State$Loading;", "", "onLoading", "Lcoil/compose/AsyncImagePainter$State$Success;", "onSuccess", "Lcoil/compose/AsyncImagePainter$State$Error;", "onError", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "Lcoil/compose/EqualityDelegate;", "modelEqualityDelegate", "Lcoil/compose/AsyncImagePainter;", "rememberAsyncImagePainter-10Xjiaw", "(Ljava/lang/Object;Lcoil/ImageLoader;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;ILcoil/compose/EqualityDelegate;Landroidx/compose/runtime/Composer;III)Lcoil/compose/AsyncImagePainter;", "rememberAsyncImagePainter", "rememberAsyncImagePainter-3HmZ8SU", "(Ljava/lang/Object;Lcoil/ImageLoader;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;ILandroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;", "Lcoil/compose/AsyncImagePainter$State;", "transform", "onState", "rememberAsyncImagePainter-0YpotYA", "(Ljava/lang/Object;Lcoil/ImageLoader;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;ILcoil/compose/EqualityDelegate;Landroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;", "rememberAsyncImagePainter-5jETZwI", "(Ljava/lang/Object;Lcoil/ImageLoader;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;ILandroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;", "coil-compose-base_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAsyncImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainterKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,474:1\n1116#2,6:475\n74#3:481\n1#4:482\n159#5:483\n*S KotlinDebug\n*F\n+ 1 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainterKt\n*L\n204#1:475,6\n209#1:481\n462#1:483\n*E\n"})
public final class AsyncImagePainterKt {
    public static final AsyncImagePainterKt.fakeTransitionTarget.1 a;

    static {
        AsyncImagePainterKt.a = new AsyncImagePainterKt.fakeTransitionTarget.1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static final AsyncImagePainter a(AsyncImageState asyncImageState0, Function1 function10, Function1 function11, ContentScale contentScale0, int v, Composer composer0, int v1) {
        composer0.startReplaceableGroup(952940650);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(952940650, v1, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:199)");
        }
        ImageRequest imageRequest0 = UtilsKt.requestOf(asyncImageState0.getModel(), composer0, 8);
        Object object0 = imageRequest0.getData();
        if(object0 instanceof Builder) {
            throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
        }
        if(!(object0 instanceof ImageBitmap)) {
            if(!(object0 instanceof ImageVector)) {
                if(!(object0 instanceof Painter)) {
                    if(imageRequest0.getTarget() != null) {
                        throw new IllegalArgumentException("request.target must be null.");
                    }
                    composer0.startReplaceableGroup(294038899);
                    AsyncImagePainter asyncImagePainter0 = composer0.rememberedValue();
                    if(asyncImagePainter0 == Composer.Companion.getEmpty()) {
                        asyncImagePainter0 = new AsyncImagePainter(imageRequest0, asyncImageState0.getImageLoader());
                        composer0.updateRememberedValue(asyncImagePainter0);
                    }
                    composer0.endReplaceableGroup();
                    asyncImagePainter0.setTransform$coil_compose_base_release(function10);
                    asyncImagePainter0.setOnState$coil_compose_base_release(function11);
                    asyncImagePainter0.setContentScale$coil_compose_base_release(contentScale0);
                    asyncImagePainter0.setFilterQuality-vDHp3xo$coil_compose_base_release(v);
                    asyncImagePainter0.setPreview$coil_compose_base_release(((Boolean)composer0.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue());
                    asyncImagePainter0.setImageLoader$coil_compose_base_release(asyncImageState0.getImageLoader());
                    asyncImagePainter0.setRequest$coil_compose_base_release(imageRequest0);
                    asyncImagePainter0.onRemembered();
                    if(ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer0.endReplaceableGroup();
                    return asyncImagePainter0;
                }
                AsyncImagePainterKt.b("Painter");
                throw null;
            }
            AsyncImagePainterKt.b("ImageVector");
            throw null;
        }
        AsyncImagePainterKt.b("ImageBitmap");
        throw null;
    }

    public static final Size access$toSizeOrNull-uvyYCjk(long v) {
        if(v == 0x7FC000007FC00000L) {
            return Size.ORIGINAL;
        }
        if(UtilsKt.isPositive-uvyYCjk(v)) {
            float f = androidx.compose.ui.geometry.Size.getWidth-impl(v);
            Undefined dimension$Undefined0 = Float.isInfinite(f) || Float.isNaN(f) ? Undefined.INSTANCE : -Dimensions.Dimension(c.roundToInt(androidx.compose.ui.geometry.Size.getWidth-impl(v)));
            float f1 = androidx.compose.ui.geometry.Size.getHeight-impl(v);
            return Float.isInfinite(f1) || Float.isNaN(f1) ? new Size(dimension$Undefined0, Undefined.INSTANCE) : new Size(dimension$Undefined0, -Dimensions.Dimension(c.roundToInt(androidx.compose.ui.geometry.Size.getHeight-impl(v))));
        }
        return null;
    }

    public static void b(String s) {
        throw new IllegalArgumentException("Unsupported type: " + s + ". " + ("If you wish to display this " + s + ", use androidx.compose.foundation.Image."));
    }

    @Composable
    @NotNull
    public static final AsyncImagePainter rememberAsyncImagePainter-0YpotYA(@Nullable Object object0, @NotNull ImageLoader imageLoader0, @Nullable Function1 function10, @Nullable Function1 function11, @Nullable ContentScale contentScale0, int v, @Nullable EqualityDelegate equalityDelegate0, @Nullable Composer composer0, int v1, int v2) {
        composer0.startReplaceableGroup(0x62169369);
        Function1 function12 = (v2 & 4) == 0 ? function10 : AsyncImagePainter.Companion.getDefaultTransform();
        ContentScale contentScale1 = (v2 & 16) == 0 ? contentScale0 : ContentScale.Companion.getFit();
        EqualityDelegate equalityDelegate1 = (v2 & 0x40) == 0 ? equalityDelegate0 : EqualityDelegateKt.getDefaultModelEqualityDelegate();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x62169369, v1, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:166)");
        }
        AsyncImagePainter asyncImagePainter0 = AsyncImagePainterKt.a(new AsyncImageState(object0, equalityDelegate1, imageLoader0), function12, ((v2 & 8) == 0 ? function11 : null), contentScale1, ((v2 & 0x20) == 0 ? v : 1), composer0, v1 >> 3 & 0xFFF0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return asyncImagePainter0;
    }

    @Composable
    @NotNull
    public static final AsyncImagePainter rememberAsyncImagePainter-10Xjiaw(@Nullable Object object0, @NotNull ImageLoader imageLoader0, @Nullable Painter painter0, @Nullable Painter painter1, @Nullable Painter painter2, @Nullable Function1 function10, @Nullable Function1 function11, @Nullable Function1 function12, @Nullable ContentScale contentScale0, int v, @Nullable EqualityDelegate equalityDelegate0, @Nullable Composer composer0, int v1, int v2, int v3) {
        composer0.startReplaceableGroup(0xFB3B9EDF);
        Function1 function13 = null;
        Painter painter3 = (v3 & 8) == 0 ? painter1 : null;
        if((v3 & 0x80) == 0) {
            function13 = function12;
        }
        ContentScale contentScale1 = (v3 & 0x100) == 0 ? contentScale0 : ContentScale.Companion.getFit();
        EqualityDelegate equalityDelegate1 = (v3 & 0x400) == 0 ? equalityDelegate0 : EqualityDelegateKt.getDefaultModelEqualityDelegate();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFB3B9EDF, v1, v2, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:100)");
        }
        AsyncImagePainter asyncImagePainter0 = AsyncImagePainterKt.a(new AsyncImageState(object0, equalityDelegate1, imageLoader0), UtilsKt.transformOf(((v3 & 4) == 0 ? painter0 : null), painter3, ((v3 & 16) == 0 ? painter2 : painter3)), UtilsKt.onStateOf(((v3 & 0x20) == 0 ? function10 : null), ((v3 & 0x40) == 0 ? function11 : null), function13), contentScale1, ((v3 & 0x200) == 0 ? v : 1), composer0, v1 >> 15 & 0xFC00);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return asyncImagePainter0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public static final AsyncImagePainter rememberAsyncImagePainter-3HmZ8SU(Object object0, ImageLoader imageLoader0, Painter painter0, Painter painter1, Painter painter2, Function1 function10, Function1 function11, Function1 function12, ContentScale contentScale0, int v, Composer composer0, int v1, int v2) {
        composer0.startReplaceableGroup(0x7F996210);
        Function1 function13 = null;
        Painter painter3 = (v2 & 8) == 0 ? painter1 : null;
        if((v2 & 0x80) == 0) {
            function13 = function12;
        }
        ContentScale contentScale1 = (v2 & 0x100) == 0 ? contentScale0 : ContentScale.Companion.getFit();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x7F996210, v1, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:122)");
        }
        AsyncImagePainter asyncImagePainter0 = AsyncImagePainterKt.a(new AsyncImageState(object0, EqualityDelegateKt.getDefaultModelEqualityDelegate(), imageLoader0), UtilsKt.transformOf(((v2 & 4) == 0 ? painter0 : null), painter3, ((v2 & 16) == 0 ? painter2 : painter3)), UtilsKt.onStateOf(((v2 & 0x20) == 0 ? function10 : null), ((v2 & 0x40) == 0 ? function11 : null), function13), contentScale1, ((v2 & 0x200) == 0 ? v : 1), composer0, v1 >> 15 & 0xFC00);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return asyncImagePainter0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public static final AsyncImagePainter rememberAsyncImagePainter-5jETZwI(Object object0, ImageLoader imageLoader0, Function1 function10, Function1 function11, ContentScale contentScale0, int v, Composer composer0, int v1, int v2) {
        composer0.startReplaceableGroup(-2020614074);
        Function1 function12 = (v2 & 4) == 0 ? function10 : AsyncImagePainter.Companion.getDefaultTransform();
        ContentScale contentScale1 = (v2 & 16) == 0 ? contentScale0 : ContentScale.Companion.getFit();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2020614074, v1, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:184)");
        }
        AsyncImagePainter asyncImagePainter0 = AsyncImagePainterKt.a(new AsyncImageState(object0, EqualityDelegateKt.getDefaultModelEqualityDelegate(), imageLoader0), function12, ((v2 & 8) == 0 ? function11 : null), contentScale1, ((v2 & 0x20) == 0 ? v : 1), composer0, v1 >> 3 & 0xFFF0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return asyncImagePainter0;
    }
}

