package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0019\u0010\u0003\u001A\u00020\u00022\b\b\u0001\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "id", "Landroidx/compose/ui/graphics/painter/Painter;", "painterResource", "(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPainterResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterResources.android.kt\nandroidx/compose/ui/res/PainterResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,130:1\n77#2:131\n77#2:132\n77#2:133\n77#2:140\n1223#3,6:134\n*S KotlinDebug\n*F\n+ 1 PainterResources.android.kt\nandroidx/compose/ui/res/PainterResources_androidKt\n*L\n59#1:131\n62#1:132\n64#1:133\n93#1:140\n74#1:134,6\n*E\n"})
public final class PainterResources_androidKt {
    @Composable
    @NotNull
    public static final Painter painterResource(@DrawableRes int v, @Nullable Composer composer0, int v1) {
        Painter painter0;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1C403A8F, v1, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:57)");
        }
        Context context0 = (Context)composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer0.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources0 = context0.getResources();
        TypedValue typedValue0 = ((ResourceIdCache)composer0.consume(AndroidCompositionLocals_androidKt.getLocalResourceIdCache())).resolveResourcePath(resources0, v);
        CharSequence charSequence0 = typedValue0.string;
        boolean z = true;
        if(charSequence0 == null || !StringsKt__StringsKt.endsWith$default(charSequence0, ".xml", false, 2, null)) {
            composer0.startReplaceGroup(0xD024F3BD);
            Resources.Theme resources$Theme1 = context0.getTheme();
            boolean z1 = composer0.changed(charSequence0);
            if(((v1 & 14 ^ 6) <= 4 || !composer0.changed(v)) && (v1 & 6) != 4) {
                z = false;
            }
            boolean z2 = composer0.changed(resources$Theme1);
            ImageBitmap imageBitmap0 = composer0.rememberedValue();
            if((z1 | z | z2) != 0 || imageBitmap0 == Composer.Companion.getEmpty()) {
                try {
                    imageBitmap0 = ImageResources_androidKt.imageResource(ImageBitmap.Companion, resources0, v);
                }
                catch(Exception exception0) {
                    throw new ResourceResolutionException("Error attempting to load resource: " + charSequence0, exception0);
                }
                composer0.updateRememberedValue(imageBitmap0);
            }
            painter0 = new BitmapPainter(imageBitmap0, 0L, 0L, 6, null);
        }
        else {
            composer0.startReplaceGroup(-803040357);
            Resources.Theme resources$Theme0 = context0.getTheme();
            int v2 = typedValue0.changingConfigurations;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x14D7D89, v1 << 6 & 0x380, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:91)");
            }
            ImageVectorCache imageVectorCache0 = (ImageVectorCache)composer0.consume(AndroidCompositionLocals_androidKt.getLocalImageVectorCache());
            Key imageVectorCache$Key0 = new Key(resources$Theme0, v);
            ImageVectorEntry imageVectorCache$ImageVectorEntry0 = imageVectorCache0.get(imageVectorCache$Key0);
            if(imageVectorCache$ImageVectorEntry0 == null) {
                XmlResourceParser xmlResourceParser0 = resources0.getXml(v);
                if(!Intrinsics.areEqual(XmlVectorParser_androidKt.seekToStartTag(xmlResourceParser0).getName(), "vector")) {
                    throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                }
                imageVectorCache$ImageVectorEntry0 = VectorResources_androidKt.loadVectorResourceInner(resources$Theme0, resources0, xmlResourceParser0, v2);
                imageVectorCache0.set(imageVectorCache$Key0, imageVectorCache$ImageVectorEntry0);
            }
            ImageVector imageVector0 = imageVectorCache$ImageVectorEntry0.getImageVector();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            painter0 = VectorPainterKt.rememberVectorPainter(imageVector0, composer0, 0);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return painter0;
    }
}

