package coil.compose;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSizeKt;
import coil.request.ImageRequest.Builder;
import coil.request.ImageRequest;
import coil.size.-Dimensions;
import coil.size.Dimension.Pixels;
import coil.size.Dimension.Undefined;
import coil.size.Scale;
import coil.size.Size;
import coil.size.SizeResolver;
import coil.size.SizeResolvers;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p5.l;

@Metadata(d1 = {"\u0000\u008E\u0001\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0004\u001A\u0019\u0010\u0003\u001A\u00020\u00022\b\u0010\u0001\u001A\u0004\u0018\u00010\u0000H\u0001\u00A2\u0006\u0004\b\u0003\u0010\u0004\u001A!\u0010\u0007\u001A\u00020\u00022\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002\u0006\u0010\u0006\u001A\u00020\u0005H\u0001\u00A2\u0006\u0004\b\u0007\u0010\b\u001A9\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u000E0\r2\b\u0010\n\u001A\u0004\u0018\u00010\t2\b\u0010\u000B\u001A\u0004\u0018\u00010\t2\b\u0010\f\u001A\u0004\u0018\u00010\tH\u0001\u00A2\u0006\u0004\b\u000F\u0010\u0010\u001A_\u0010\u0018\u001A\u0010\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r2\u0014\u0010\u0013\u001A\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r2\u0014\u0010\u0015\u001A\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r2\u0014\u0010\u0017\u001A\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\rH\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0019\u001A\u001D\u0010\u001C\u001A\u00020\u001A*\u00020\u001A2\b\u0010\u001C\u001A\u0004\u0018\u00010\u001BH\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001D\u001A\u0013\u0010\u001F\u001A\u00020\u001E*\u00020\u0005H\u0001\u00A2\u0006\u0004\b\u001F\u0010 \u001A\u0018\u0010%\u001A\u0004\u0018\u00010\"*\u00020!H\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b#\u0010$\u001A\u001E\u0010*\u001A\u00020&*\u00020!2\u0006\u0010\'\u001A\u00020&H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b(\u0010)\u001A\u001E\u0010-\u001A\u00020&*\u00020!2\u0006\u0010+\u001A\u00020&H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b,\u0010)\u001A\"\u00100\u001A\u00020&*\u00020&2\f\u0010/\u001A\b\u0012\u0004\u0012\u00020&0.H\u0080\b\u00A2\u0006\u0004\b0\u00101\u001A\u0016\u00106\u001A\u000203*\u000202H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b4\u00105\"\u001A\u0010;\u001A\u00020!8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010:\"\u001A\u0010A\u001A\u00020<8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b=\u0010>\u001A\u0004\b?\u0010@\"\u0018\u0010E\u001A\u00020B*\u0002028@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bC\u0010D\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006F"}, d2 = {"", "model", "Lcoil/request/ImageRequest;", "requestOf", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Lcoil/request/ImageRequest;", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "requestOfWithSizeResolver", "(Ljava/lang/Object;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/runtime/Composer;I)Lcoil/request/ImageRequest;", "Landroidx/compose/ui/graphics/painter/Painter;", "placeholder", "error", "fallback", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "transformOf", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;)Lkotlin/jvm/functions/Function1;", "Lcoil/compose/AsyncImagePainter$State$Loading;", "", "onLoading", "Lcoil/compose/AsyncImagePainter$State$Success;", "onSuccess", "Lcoil/compose/AsyncImagePainter$State$Error;", "onError", "onStateOf", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/Modifier;", "", "contentDescription", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;", "Lcoil/size/Scale;", "toScale", "(Landroidx/compose/ui/layout/ContentScale;)Lcoil/size/Scale;", "Landroidx/compose/ui/unit/Constraints;", "Lcoil/size/Size;", "toSizeOrNull-BRTryo0", "(J)Lcoil/size/Size;", "toSizeOrNull", "", "width", "constrainWidth-K40F9xA", "(JF)F", "constrainWidth", "height", "constrainHeight-K40F9xA", "constrainHeight", "Lkotlin/Function0;", "block", "takeOrElse", "(FLkotlin/jvm/functions/Function0;)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/IntSize;", "toIntSize-uvyYCjk", "(J)J", "toIntSize", "a", "J", "getZeroConstraints", "()J", "ZeroConstraints", "Lcoil/size/SizeResolver;", "b", "Lcoil/size/SizeResolver;", "getOriginalSizeResolver", "()Lcoil/size/SizeResolver;", "OriginalSizeResolver", "", "isPositive-uvyYCjk", "(J)Z", "isPositive", "coil-compose-base_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\ncoil/compose/UtilsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,190:1\n74#2:191\n74#2:210\n1116#3,6:192\n1116#3,6:198\n1116#3,6:204\n1116#3,6:211\n*S KotlinDebug\n*F\n+ 1 utils.kt\ncoil/compose/UtilsKt\n*L\n36#1:191\n69#1:210\n37#1:192,6\n59#1:198,6\n63#1:204,6\n70#1:211,6\n*E\n"})
public final class UtilsKt {
    public static final long a;
    public static final SizeResolver b;

    static {
        UtilsKt.a = Constraints.Companion.fixed-JhjzzOo(0, 0);
        UtilsKt.b = SizeResolvers.create(Size.ORIGINAL);
    }

    public static final float constrainHeight-K40F9xA(long v, float f) {
        return c.coerceIn(f, Constraints.getMinHeight-impl(v), Constraints.getMaxHeight-impl(v));
    }

    public static final float constrainWidth-K40F9xA(long v, float f) {
        return c.coerceIn(f, Constraints.getMinWidth-impl(v), Constraints.getMaxWidth-impl(v));
    }

    @Stable
    @NotNull
    public static final Modifier contentDescription(@NotNull Modifier modifier0, @Nullable String s) {
        return s == null ? modifier0 : SemanticsModifierKt.semantics$default(modifier0, false, new l(s), 1, null);
    }

    @NotNull
    public static final SizeResolver getOriginalSizeResolver() {
        return UtilsKt.b;
    }

    public static final long getZeroConstraints() [...] // 潜在的解密器

    public static final boolean isPositive-uvyYCjk(long v) {
        return ((double)androidx.compose.ui.geometry.Size.getWidth-impl(v)) >= 0.5 && ((double)androidx.compose.ui.geometry.Size.getHeight-impl(v)) >= 0.5;
    }

    @Stable
    @Nullable
    public static final Function1 onStateOf(@Nullable Function1 function10, @Nullable Function1 function11, @Nullable Function1 function12) {
        return function10 == null && function11 == null && function12 == null ? null : new h(function10, function11, function12);
    }

    @Composable
    @NotNull
    public static final ImageRequest requestOf(@Nullable Object object0, @Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(1087186730);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1087186730, v, -1, "coil.compose.requestOf (utils.kt:31)");
        }
        if(object0 instanceof ImageRequest) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer0.endReplaceableGroup();
            return (ImageRequest)object0;
        }
        Context context0 = (Context)composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer0.startReplaceableGroup(0x166148BC);
        boolean z = composer0.changed(context0);
        boolean z1 = composer0.changed(object0);
        ImageRequest imageRequest0 = composer0.rememberedValue();
        if(z || z1 || imageRequest0 == Composer.Companion.getEmpty()) {
            imageRequest0 = new Builder(context0).data(object0).build();
            composer0.updateRememberedValue(imageRequest0);
        }
        composer0.endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return imageRequest0;
    }

    @Composable
    @NotNull
    public static final ImageRequest requestOfWithSizeResolver(@Nullable Object object0, @NotNull ContentScale contentScale0, @Nullable Composer composer0, int v) {
        SizeResolver sizeResolver0;
        composer0.startReplaceableGroup(0x63FF5E82);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x63FF5E82, v, -1, "coil.compose.requestOfWithSizeResolver (utils.kt:50)");
        }
        if(object0 instanceof ImageRequest && ((ImageRequest)object0).getDefined().getSizeResolver() != null) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer0.endReplaceableGroup();
            return (ImageRequest)object0;
        }
        composer0.startReplaceableGroup(0xD77EA719);
        if(Intrinsics.areEqual(contentScale0, ContentScale.Companion.getNone())) {
            sizeResolver0 = UtilsKt.b;
        }
        else {
            composer0.startReplaceableGroup(0xD77EA774);
            ConstraintsSizeResolver constraintsSizeResolver0 = composer0.rememberedValue();
            if(constraintsSizeResolver0 == Composer.Companion.getEmpty()) {
                constraintsSizeResolver0 = new ConstraintsSizeResolver();
                composer0.updateRememberedValue(constraintsSizeResolver0);
            }
            sizeResolver0 = constraintsSizeResolver0;
            composer0.endReplaceableGroup();
        }
        composer0.endReplaceableGroup();
        if(object0 instanceof ImageRequest) {
            composer0.startReplaceableGroup(0xD77EA7CB);
            composer0.startReplaceableGroup(0xD77EA7D2);
            boolean z = composer0.changed(object0);
            boolean z1 = composer0.changed(sizeResolver0);
            ImageRequest imageRequest0 = composer0.rememberedValue();
            if(z || z1 || imageRequest0 == Composer.Companion.getEmpty()) {
                imageRequest0 = ImageRequest.newBuilder$default(((ImageRequest)object0), null, 1, null).size(sizeResolver0).build();
                composer0.updateRememberedValue(imageRequest0);
            }
            composer0.endReplaceableGroup();
            composer0.endReplaceableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer0.endReplaceableGroup();
            return imageRequest0;
        }
        composer0.startReplaceableGroup(0xD77EA871);
        Context context0 = (Context)composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer0.startReplaceableGroup(0xD77EA89F);
        boolean z2 = composer0.changed(context0);
        boolean z3 = composer0.changed(object0);
        boolean z4 = composer0.changed(sizeResolver0);
        ImageRequest imageRequest1 = composer0.rememberedValue();
        if((z2 | z3 | z4) != 0 || imageRequest1 == Composer.Companion.getEmpty()) {
            imageRequest1 = new Builder(context0).data(object0).size(sizeResolver0).build();
            composer0.updateRememberedValue(imageRequest1);
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return imageRequest1;
    }

    // 去混淆评级： 低(20)
    public static final float takeOrElse(float f, @NotNull Function0 function00) {
        return !Float.isInfinite(f) && !Float.isNaN(f) ? f : ((Number)function00.invoke()).floatValue();
    }

    public static final long toIntSize-uvyYCjk(long v) {
        return IntSizeKt.IntSize(zd.c.roundToInt(androidx.compose.ui.geometry.Size.getWidth-impl(v)), zd.c.roundToInt(androidx.compose.ui.geometry.Size.getHeight-impl(v)));
    }

    // 去混淆评级： 低(40)
    @Stable
    @NotNull
    public static final Scale toScale(@NotNull ContentScale contentScale0) {
        return (Intrinsics.areEqual(contentScale0, ContentScale.Companion.getFit()) ? true : Intrinsics.areEqual(contentScale0, ContentScale.Companion.getInside())) ? Scale.FIT : Scale.FILL;
    }

    @Stable
    @Nullable
    public static final Size toSizeOrNull-BRTryo0(long v) {
        if(Constraints.isZero-impl(v)) {
            return null;
        }
        if(Constraints.getHasBoundedWidth-impl(v)) {
            Pixels dimension$Pixels0 = -Dimensions.Dimension(Constraints.getMaxWidth-impl(v));
            return Constraints.getHasBoundedHeight-impl(v) ? new Size(dimension$Pixels0, -Dimensions.Dimension(Constraints.getMaxHeight-impl(v))) : new Size(dimension$Pixels0, Undefined.INSTANCE);
        }
        return Constraints.getHasBoundedHeight-impl(v) ? new Size(Undefined.INSTANCE, -Dimensions.Dimension(Constraints.getMaxHeight-impl(v))) : new Size(Undefined.INSTANCE, Undefined.INSTANCE);
    }

    @Stable
    @NotNull
    public static final Function1 transformOf(@Nullable Painter painter0, @Nullable Painter painter1, @Nullable Painter painter2) {
        return painter0 == null && painter1 == null && painter2 == null ? AsyncImagePainter.Companion.getDefaultTransform() : new i(painter0, painter2, painter1);
    }
}

