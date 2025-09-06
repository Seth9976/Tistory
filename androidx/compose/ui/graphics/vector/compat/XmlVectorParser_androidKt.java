package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector.Builder;
import androidx.compose.ui.graphics.vector.PathParser;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\u001A\u0013\u0010\u0002\u001A\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001AC\u0010\u000F\u001A\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u00072\u000E\b\u0002\u0010\n\u001A\b\u0018\u00010\tR\u00020\u00052\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0000¢\u0006\u0004\b\u000F\u0010\u0010\u001A\u0013\u0010\u0011\u001A\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001A1\u0010\u0013\u001A\u00020\u000B*\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00052\f\u0010\n\u001A\b\u0018\u00010\tR\u00020\u00052\u0006\u0010\b\u001A\u00020\u0007H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001A9\u0010\u0016\u001A\u00020\u0015*\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00052\f\u0010\n\u001A\b\u0018\u00010\tR\u00020\u00052\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\u000BH\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001A9\u0010\u0018\u001A\u00020\u0015*\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00052\f\u0010\n\u001A\b\u0018\u00010\tR\u00020\u00052\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\u000BH\u0000¢\u0006\u0004\b\u0018\u0010\u0017\u001A9\u0010\u0019\u001A\u00020\u0015*\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00052\f\u0010\n\u001A\b\u0018\u00010\tR\u00020\u00052\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\u000BH\u0000¢\u0006\u0004\b\u0019\u0010\u0017¨\u0006\u001A"}, d2 = {"Lorg/xmlpull/v1/XmlPullParser;", "", "isAtEnd", "(Lorg/xmlpull/v1/XmlPullParser;)Z", "Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;", "Landroid/content/res/Resources;", "res", "Landroid/util/AttributeSet;", "attrs", "Landroid/content/res/Resources$Theme;", "theme", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "builder", "", "nestedGroups", "parseCurrentVectorNode", "(Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;Landroidx/compose/ui/graphics/vector/ImageVector$Builder;I)I", "seekToStartTag", "(Lorg/xmlpull/v1/XmlPullParser;)Lorg/xmlpull/v1/XmlPullParser;", "createVectorImageBuilder", "(Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "", "parsePath", "(Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;Landroidx/compose/ui/graphics/vector/ImageVector$Builder;)V", "parseClipPath", "parseGroup", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nXmlVectorParser.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlVectorParser.android.kt\nandroidx/compose/ui/graphics/vector/compat/XmlVectorParser_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,724:1\n168#2:725\n168#2:726\n*S KotlinDebug\n*F\n+ 1 XmlVectorParser.android.kt\nandroidx/compose/ui/graphics/vector/compat/XmlVectorParser_androidKt\n*L\n237#1:725\n238#1:726\n*E\n"})
public final class XmlVectorParser_androidKt {
    @NotNull
    public static final Builder createVectorImageBuilder(@NotNull AndroidVectorParser androidVectorParser0, @NotNull Resources resources0, @Nullable Resources.Theme resources$Theme0, @NotNull AttributeSet attributeSet0) {
        int v1;
        long v;
        TypedArray typedArray0 = androidVectorParser0.obtainAttributes(resources0, resources$Theme0, attributeSet0, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY());
        boolean z = androidVectorParser0.getNamedBoolean(typedArray0, "autoMirrored", 5, false);
        float f = androidVectorParser0.getNamedFloat(typedArray0, "viewportWidth", 7, 0.0f);
        float f1 = androidVectorParser0.getNamedFloat(typedArray0, "viewportHeight", 8, 0.0f);
        if(f <= 0.0f) {
            throw new XmlPullParserException(typedArray0.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if(f1 <= 0.0f) {
            throw new XmlPullParserException(typedArray0.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float f2 = androidVectorParser0.getDimension(typedArray0, 3, 0.0f);
        float f3 = androidVectorParser0.getDimension(typedArray0, 2, 0.0f);
        if(typedArray0.hasValue(1)) {
            TypedValue typedValue0 = new TypedValue();
            typedArray0.getValue(1, typedValue0);
            if(typedValue0.type == 2) {
                v = 0L;
            }
            else {
                ColorStateList colorStateList0 = androidVectorParser0.getNamedColorStateList(typedArray0, resources$Theme0, "tint", 1);
                v = colorStateList0 == null ? 0L : ColorKt.Color(colorStateList0.getDefaultColor());
            }
        }
        else {
            v = 0L;
        }
        switch(androidVectorParser0.getInt(typedArray0, 6, -1)) {
            case -1: {
                v1 = 5;
                break;
            }
            case 3: {
                v1 = 3;
                break;
            }
            case 5: {
                v1 = 5;
                break;
            }
            case 9: {
                v1 = 9;
                break;
            }
            case 14: {
                v1 = 13;
                break;
            }
            case 15: {
                v1 = 14;
                break;
            }
            case 16: {
                v1 = 12;
                break;
            }
            default: {
                v1 = 5;
            }
        }
        float f4 = Dp.constructor-impl(f2 / resources0.getDisplayMetrics().density);
        float f5 = Dp.constructor-impl(f3 / resources0.getDisplayMetrics().density);
        typedArray0.recycle();
        return new Builder(null, f4, f5, f, f1, v, v1, z, 1, null);
    }

    public static final boolean isAtEnd(@NotNull XmlPullParser xmlPullParser0) {
        return xmlPullParser0.getEventType() == 1 || xmlPullParser0.getDepth() < 1 && xmlPullParser0.getEventType() == 3;
    }

    public static final void parseClipPath(@NotNull AndroidVectorParser androidVectorParser0, @NotNull Resources resources0, @Nullable Resources.Theme resources$Theme0, @NotNull AttributeSet attributeSet0, @NotNull Builder imageVector$Builder0) {
        TypedArray typedArray0 = androidVectorParser0.obtainAttributes(resources0, resources$Theme0, attributeSet0, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH());
        String s = androidVectorParser0.getString(typedArray0, 0);
        if(s == null) {
            s = "";
        }
        String s1 = androidVectorParser0.getString(typedArray0, 1);
        List list0 = s1 == null ? VectorKt.getEmptyPath() : PathParser.pathStringToNodes$default(androidVectorParser0.pathParser, s1, null, 2, null);
        typedArray0.recycle();
        Builder.addGroup$default(imageVector$Builder0, s, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, list0, 0xFE, null);
    }

    public static final int parseCurrentVectorNode(@NotNull AndroidVectorParser androidVectorParser0, @NotNull Resources resources0, @NotNull AttributeSet attributeSet0, @Nullable Resources.Theme resources$Theme0, @NotNull Builder imageVector$Builder0, int v) {
        switch(androidVectorParser0.getXmlParser().getEventType()) {
            case 2: {
                String s = androidVectorParser0.getXmlParser().getName();
                if(s != null) {
                    switch(s) {
                        case "clip-path": {
                            XmlVectorParser_androidKt.parseClipPath(androidVectorParser0, resources0, resources$Theme0, attributeSet0, imageVector$Builder0);
                            return v + 1;
                        }
                        case "group": {
                            XmlVectorParser_androidKt.parseGroup(androidVectorParser0, resources0, resources$Theme0, attributeSet0, imageVector$Builder0);
                            return v;
                        }
                        case "path": {
                            XmlVectorParser_androidKt.parsePath(androidVectorParser0, resources0, resources$Theme0, attributeSet0, imageVector$Builder0);
                            return v;
                        }
                        default: {
                            return v;
                        }
                    }
                }
                break;
            }
            case 3: {
                if(Intrinsics.areEqual("group", androidVectorParser0.getXmlParser().getName())) {
                    for(int v1 = 0; v1 < v + 1; ++v1) {
                        imageVector$Builder0.clearGroup();
                    }
                    return 0;
                }
                break;
            }
            default: {
                return v;
            }
        }
        return v;
    }

    public static int parseCurrentVectorNode$default(AndroidVectorParser androidVectorParser0, Resources resources0, AttributeSet attributeSet0, Resources.Theme resources$Theme0, Builder imageVector$Builder0, int v, int v1, Object object0) {
        if((v1 & 4) != 0) {
            resources$Theme0 = null;
        }
        return XmlVectorParser_androidKt.parseCurrentVectorNode(androidVectorParser0, resources0, attributeSet0, resources$Theme0, imageVector$Builder0, v);
    }

    public static final void parseGroup(@NotNull AndroidVectorParser androidVectorParser0, @NotNull Resources resources0, @Nullable Resources.Theme resources$Theme0, @NotNull AttributeSet attributeSet0, @NotNull Builder imageVector$Builder0) {
        TypedArray typedArray0 = androidVectorParser0.obtainAttributes(resources0, resources$Theme0, attributeSet0, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_GROUP());
        float f = androidVectorParser0.getNamedFloat(typedArray0, "rotation", 5, 0.0f);
        float f1 = androidVectorParser0.getFloat(typedArray0, 1, 0.0f);
        float f2 = androidVectorParser0.getFloat(typedArray0, 2, 0.0f);
        float f3 = androidVectorParser0.getNamedFloat(typedArray0, "scaleX", 3, 1.0f);
        float f4 = androidVectorParser0.getNamedFloat(typedArray0, "scaleY", 4, 1.0f);
        float f5 = androidVectorParser0.getNamedFloat(typedArray0, "translateX", 6, 0.0f);
        float f6 = androidVectorParser0.getNamedFloat(typedArray0, "translateY", 7, 0.0f);
        String s = androidVectorParser0.getString(typedArray0, 0);
        if(s == null) {
            s = "";
        }
        typedArray0.recycle();
        imageVector$Builder0.addGroup(s, f, f1, f2, f3, f4, f5, f6, VectorKt.getEmptyPath());
    }

    public static final void parsePath(@NotNull AndroidVectorParser androidVectorParser0, @NotNull Resources resources0, @Nullable Resources.Theme resources$Theme0, @NotNull AttributeSet attributeSet0, @NotNull Builder imageVector$Builder0) throws IllegalArgumentException {
        ShaderBrush shaderBrush2;
        ShaderBrush shaderBrush1;
        int v1;
        int v;
        TypedArray typedArray0 = androidVectorParser0.obtainAttributes(resources0, resources$Theme0, attributeSet0, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH());
        if(!TypedArrayUtils.hasAttribute(androidVectorParser0.getXmlParser(), "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String s = androidVectorParser0.getString(typedArray0, 0);
        if(s == null) {
            s = "";
        }
        String s1 = androidVectorParser0.getString(typedArray0, 2);
        List list0 = s1 == null ? VectorKt.getEmptyPath() : PathParser.pathStringToNodes$default(androidVectorParser0.pathParser, s1, null, 2, null);
        ComplexColorCompat complexColorCompat0 = androidVectorParser0.getNamedComplexColor(typedArray0, resources$Theme0, "fillColor", 1, 0);
        float f = androidVectorParser0.getNamedFloat(typedArray0, "fillAlpha", 12, 1.0f);
        switch(androidVectorParser0.getNamedInt(typedArray0, "strokeLineCap", 8, -1)) {
            case 0: {
                v = 0;
                break;
            }
            case 1: {
                v = 1;
                break;
            }
            case 2: {
                v = 2;
                break;
            }
            default: {
                v = 0;
            }
        }
        switch(androidVectorParser0.getNamedInt(typedArray0, "strokeLineJoin", 9, -1)) {
            case 0: {
                v1 = 0;
                break;
            }
            case 1: {
                v1 = 1;
                break;
            }
            case 2: {
                v1 = 2;
                break;
            }
            default: {
                v1 = 2;
            }
        }
        float f1 = androidVectorParser0.getNamedFloat(typedArray0, "strokeMiterLimit", 10, 1.0f);
        ComplexColorCompat complexColorCompat1 = androidVectorParser0.getNamedComplexColor(typedArray0, resources$Theme0, "strokeColor", 3, 0);
        float f2 = androidVectorParser0.getNamedFloat(typedArray0, "strokeAlpha", 11, 1.0f);
        float f3 = androidVectorParser0.getNamedFloat(typedArray0, "strokeWidth", 4, 1.0f);
        float f4 = androidVectorParser0.getNamedFloat(typedArray0, "trimPathEnd", 6, 1.0f);
        float f5 = androidVectorParser0.getNamedFloat(typedArray0, "trimPathOffset", 7, 0.0f);
        float f6 = androidVectorParser0.getNamedFloat(typedArray0, "trimPathStart", 5, 0.0f);
        int v2 = androidVectorParser0.getNamedInt(typedArray0, "fillType", 13, 0);
        typedArray0.recycle();
        if(complexColorCompat0.willDraw()) {
            Shader shader0 = complexColorCompat0.getShader();
            ShaderBrush shaderBrush0 = shader0 == null ? new SolidColor(ColorKt.Color(complexColorCompat0.getColor()), null) : BrushKt.ShaderBrush(shader0);
            shaderBrush1 = shaderBrush0;
        }
        else {
            shaderBrush1 = null;
        }
        if(complexColorCompat1.willDraw()) {
            Shader shader1 = complexColorCompat1.getShader();
            shaderBrush2 = shader1 == null ? new SolidColor(ColorKt.Color(complexColorCompat1.getColor()), null) : BrushKt.ShaderBrush(shader1);
        }
        else {
            shaderBrush2 = null;
        }
        imageVector$Builder0.addPath-oIyEayM(list0, (v2 == 0 ? 0 : 1), s, shaderBrush1, f, shaderBrush2, f2, f3, v, v1, f1, f6, f4, f5);
    }

    @NotNull
    public static final XmlPullParser seekToStartTag(@NotNull XmlPullParser xmlPullParser0) throws XmlPullParserException {
        int v;
        for(v = xmlPullParser0.next(); v != 1 && v != 2; v = xmlPullParser0.next()) {
        }
        if(v != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        return xmlPullParser0;
    }
}

