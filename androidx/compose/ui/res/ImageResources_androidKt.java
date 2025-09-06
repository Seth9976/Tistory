package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap.Companion;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001A\u001C\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\b\b\u0001\u0010\u0005\u001A\u00020\u0006\u001A\u001B\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0005\u001A\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"imageResource", "Landroidx/compose/ui/graphics/ImageBitmap;", "Landroidx/compose/ui/graphics/ImageBitmap$Companion;", "res", "Landroid/content/res/Resources;", "id", "", "(Landroidx/compose/ui/graphics/ImageBitmap$Companion;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/ImageBitmap;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nImageResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageResources.android.kt\nandroidx/compose/ui/res/ImageResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,60:1\n77#2:61\n1223#3,6:62\n1223#3,6:68\n*S KotlinDebug\n*F\n+ 1 ImageResources.android.kt\nandroidx/compose/ui/res/ImageResources_androidKt\n*L\n54#1:61\n55#1:62,6\n58#1:68,6\n*E\n"})
public final class ImageResources_androidKt {
    @Composable
    @NotNull
    public static final ImageBitmap imageResource(@NotNull Companion imageBitmap$Companion0, @DrawableRes int v, @Nullable Composer composer0, int v1) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-304919470, v1, -1, "androidx.compose.ui.res.imageResource (ImageResources.android.kt:52)");
        }
        Context context0 = (Context)composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        TypedValue typedValue0 = composer0.rememberedValue();
        androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
        if(typedValue0 == composer$Companion0.getEmpty()) {
            typedValue0 = new TypedValue();
            composer0.updateRememberedValue(typedValue0);
        }
        context0.getResources().getValue(v, typedValue0, true);
        CharSequence charSequence0 = typedValue0.string;
        Intrinsics.checkNotNull(charSequence0);
        boolean z = composer0.changed(charSequence0.toString());
        ImageBitmap imageBitmap0 = composer0.rememberedValue();
        if(z || imageBitmap0 == composer$Companion0.getEmpty()) {
            imageBitmap0 = ImageResources_androidKt.imageResource(imageBitmap$Companion0, context0.getResources(), v);
            composer0.updateRememberedValue(imageBitmap0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return imageBitmap0;
    }

    @NotNull
    public static final ImageBitmap imageResource(@NotNull Companion imageBitmap$Companion0, @NotNull Resources resources0, @DrawableRes int v) {
        Drawable drawable0 = resources0.getDrawable(v, null);
        Intrinsics.checkNotNull(drawable0, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return AndroidImageBitmap_androidKt.asImageBitmap(((BitmapDrawable)drawable0).getBitmap());
    }
}

