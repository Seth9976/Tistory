package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.vector.ImageVector.Builder;
import androidx.compose.ui.graphics.vector.ImageVector.Companion;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.compat.AndroidVectorParser;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A0\u0010\u0000\u001A\u00020\u00012\u000E\b\u0002\u0010\u0002\u001A\b\u0018\u00010\u0003R\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\tH\u0000\u001A*\u0010\n\u001A\u00020\u000B*\u00020\f2\u000E\b\u0002\u0010\u0002\u001A\b\u0018\u00010\u0003R\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\t\u001A\u001B\u0010\n\u001A\u00020\u000B*\u00020\f2\b\b\u0001\u0010\u000E\u001A\u00020\tH\u0007¢\u0006\u0002\u0010\u000F¨\u0006\u0010"}, d2 = {"loadVectorResourceInner", "Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "res", "parser", "Landroid/content/res/XmlResourceParser;", "changingConfigurations", "", "vectorResource", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Landroidx/compose/ui/graphics/vector/ImageVector$Companion;", "resId", "id", "(Landroidx/compose/ui/graphics/vector/ImageVector$Companion;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/ImageVector;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nVectorResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorResources.android.kt\nandroidx/compose/ui/res/VectorResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n77#2:154\n1223#3,6:155\n1#4:161\n*S KotlinDebug\n*F\n+ 1 VectorResources.android.kt\nandroidx/compose/ui/res/VectorResources_androidKt\n*L\n49#1:154\n53#1:155,6\n*E\n"})
public final class VectorResources_androidKt {
    @NotNull
    public static final ImageVectorEntry loadVectorResourceInner(@Nullable Resources.Theme resources$Theme0, @NotNull Resources resources0, @NotNull XmlResourceParser xmlResourceParser0, int v) throws XmlPullParserException {
        AttributeSet attributeSet0 = Xml.asAttributeSet(xmlResourceParser0);
        AndroidVectorParser androidVectorParser0 = new AndroidVectorParser(xmlResourceParser0, 0, 2, null);
        Builder imageVector$Builder0 = XmlVectorParser_androidKt.createVectorImageBuilder(androidVectorParser0, resources0, resources$Theme0, attributeSet0);
        int v1 = 0;
        while(!XmlVectorParser_androidKt.isAtEnd(xmlResourceParser0)) {
            v1 = XmlVectorParser_androidKt.parseCurrentVectorNode(androidVectorParser0, resources0, attributeSet0, resources$Theme0, imageVector$Builder0, v1);
            xmlResourceParser0.next();
        }
        return new ImageVectorEntry(imageVector$Builder0.build(), v);
    }

    public static ImageVectorEntry loadVectorResourceInner$default(Resources.Theme resources$Theme0, Resources resources0, XmlResourceParser xmlResourceParser0, int v, int v1, Object object0) throws XmlPullParserException {
        if((v1 & 1) != 0) {
            resources$Theme0 = null;
        }
        return VectorResources_androidKt.loadVectorResourceInner(resources$Theme0, resources0, xmlResourceParser0, v);
    }

    @Composable
    @NotNull
    public static final ImageVector vectorResource(@NotNull Companion imageVector$Companion0, @DrawableRes int v, @Nullable Composer composer0, int v1) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(44534090, v1, -1, "androidx.compose.ui.res.vectorResource (VectorResources.android.kt:47)");
        }
        Context context0 = (Context)composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        boolean z = false;
        Resources resources0 = Resources_androidKt.resources(composer0, 0);
        Resources.Theme resources$Theme0 = context0.getTheme();
        Configuration configuration0 = resources0.getConfiguration();
        if((v1 & 0x70 ^ 0x30) > 0x20 && composer0.changed(v) || (v1 & 0x30) == 0x20) {
            z = true;
        }
        boolean z1 = composer0.changed(resources0);
        boolean z2 = composer0.changed(resources$Theme0);
        boolean z3 = composer0.changed(configuration0);
        ImageVector imageVector0 = composer0.rememberedValue();
        if((z1 | z | z2 | z3) != 0 || imageVector0 == Composer.Companion.getEmpty()) {
            imageVector0 = VectorResources_androidKt.vectorResource(imageVector$Companion0, resources$Theme0, resources0, v);
            composer0.updateRememberedValue(imageVector0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return imageVector0;
    }

    @NotNull
    public static final ImageVector vectorResource(@NotNull Companion imageVector$Companion0, @Nullable Resources.Theme resources$Theme0, @NotNull Resources resources0, int v) throws XmlPullParserException {
        TypedValue typedValue0 = new TypedValue();
        resources0.getValue(v, typedValue0, true);
        XmlResourceParser xmlResourceParser0 = resources0.getXml(v);
        XmlVectorParser_androidKt.seekToStartTag(xmlResourceParser0);
        return VectorResources_androidKt.loadVectorResourceInner(resources$Theme0, resources0, xmlResourceParser0, typedValue0.changingConfigurations).getImageVector();
    }

    public static ImageVector vectorResource$default(Companion imageVector$Companion0, Resources.Theme resources$Theme0, Resources resources0, int v, int v1, Object object0) throws XmlPullParserException {
        if((v1 & 1) != 0) {
            resources$Theme0 = null;
        }
        return VectorResources_androidKt.vectorResource(imageVector$Companion0, resources$Theme0, resources0, v);
    }
}

