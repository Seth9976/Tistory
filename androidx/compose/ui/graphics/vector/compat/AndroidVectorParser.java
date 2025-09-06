package androidx.compose.ui.graphics.vector.compat;

import a5.b;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.StyleableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.vector.PathParser;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u0011\u001A\u00020\u00102\u0006\u0010\t\u001A\u00020\b2\f\u0010\u000B\u001A\b\u0018\u00010\nR\u00020\b2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000E\u00A2\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0018\u001A\u00020\u00042\u0006\u0010\u0013\u001A\u00020\u00102\u0006\u0010\u0015\u001A\u00020\u00142\b\b\u0001\u0010\u0016\u001A\u00020\u00042\u0006\u0010\u0017\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u0013\u001A\u00020\u00102\u0006\u0010\u0015\u001A\u00020\u00142\b\b\u0001\u0010\u0016\u001A\u00020\u00042\u0006\u0010\u0017\u001A\u00020\u001A\u00A2\u0006\u0004\b\u001B\u0010\u001CJ/\u0010\u001E\u001A\u00020\u001D2\u0006\u0010\u0013\u001A\u00020\u00102\u0006\u0010\u0015\u001A\u00020\u00142\b\b\u0001\u0010\u0016\u001A\u00020\u00042\u0006\u0010\u0017\u001A\u00020\u001D\u00A2\u0006\u0004\b\u001E\u0010\u001FJ%\u0010!\u001A\u00020\u001A2\u0006\u0010\u0013\u001A\u00020\u00102\u0006\u0010 \u001A\u00020\u00042\u0006\u0010\u0017\u001A\u00020\u001A\u00A2\u0006\u0004\b!\u0010\"J%\u0010#\u001A\u00020\u00042\u0006\u0010\u0013\u001A\u00020\u00102\u0006\u0010 \u001A\u00020\u00042\u0006\u0010\u0017\u001A\u00020\u0004\u00A2\u0006\u0004\b#\u0010$J\u001F\u0010%\u001A\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001A\u00020\u00102\u0006\u0010 \u001A\u00020\u0004\u00A2\u0006\u0004\b%\u0010&J%\u0010(\u001A\u00020\u001A2\u0006\u0010\u0013\u001A\u00020\u00102\u0006\u0010 \u001A\u00020\u00042\u0006\u0010\'\u001A\u00020\u001A\u00A2\u0006\u0004\b(\u0010\"J?\u0010*\u001A\u00020)2\u0006\u0010\u0013\u001A\u00020\u00102\f\u0010\u000B\u001A\b\u0018\u00010\nR\u00020\b2\u0006\u0010\u0015\u001A\u00020\u00142\b\b\u0001\u0010\u0016\u001A\u00020\u00042\b\b\u0001\u0010\u0017\u001A\u00020\u0004\u00A2\u0006\u0004\b*\u0010+J7\u0010-\u001A\u0004\u0018\u00010,2\u0006\u0010\u0013\u001A\u00020\u00102\f\u0010\u000B\u001A\b\u0018\u00010\nR\u00020\b2\u0006\u0010\u0015\u001A\u00020\u00142\b\b\u0001\u0010\u0016\u001A\u00020\u0004\u00A2\u0006\u0004\b-\u0010.J\u0010\u0010/\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b/\u00100J\u0010\u00101\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b1\u00102J$\u00103\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004H\u00C6\u0001\u00A2\u0006\u0004\b3\u00104J\u0010\u00105\u001A\u00020\u0014H\u00D6\u0001\u00A2\u0006\u0004\b5\u00106J\u0010\u00107\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b7\u00102J\u001A\u00109\u001A\u00020\u001D2\b\u00108\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b;\u0010<\u001A\u0004\b=\u00100R\"\u0010\u0005\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b>\u0010?\u001A\u0004\b@\u00102\"\u0004\bA\u0010BR\u0014\u0010D\u001A\u00020C8\u0000X\u0081\u0004\u00A2\u0006\u0006\n\u0004\bD\u0010E\u00A8\u0006F"}, d2 = {"Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;", "", "Lorg/xmlpull/v1/XmlPullParser;", "xmlParser", "", "config", "<init>", "(Lorg/xmlpull/v1/XmlPullParser;I)V", "Landroid/content/res/Resources;", "res", "Landroid/content/res/Resources$Theme;", "theme", "Landroid/util/AttributeSet;", "set", "", "attrs", "Landroid/content/res/TypedArray;", "obtainAttributes", "(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;", "typedArray", "", "attrName", "resId", "defaultValue", "getNamedInt", "(Landroid/content/res/TypedArray;Ljava/lang/String;II)I", "", "getNamedFloat", "(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F", "", "getNamedBoolean", "(Landroid/content/res/TypedArray;Ljava/lang/String;IZ)Z", "index", "getFloat", "(Landroid/content/res/TypedArray;IF)F", "getInt", "(Landroid/content/res/TypedArray;II)I", "getString", "(Landroid/content/res/TypedArray;I)Ljava/lang/String;", "defValue", "getDimension", "Landroidx/core/content/res/ComplexColorCompat;", "getNamedComplexColor", "(Landroid/content/res/TypedArray;Landroid/content/res/Resources$Theme;Ljava/lang/String;II)Landroidx/core/content/res/ComplexColorCompat;", "Landroid/content/res/ColorStateList;", "getNamedColorStateList", "(Landroid/content/res/TypedArray;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Landroid/content/res/ColorStateList;", "component1", "()Lorg/xmlpull/v1/XmlPullParser;", "component2", "()I", "copy", "(Lorg/xmlpull/v1/XmlPullParser;I)Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/xmlpull/v1/XmlPullParser;", "getXmlParser", "b", "I", "getConfig", "setConfig", "(I)V", "Landroidx/compose/ui/graphics/vector/PathParser;", "pathParser", "Landroidx/compose/ui/graphics/vector/PathParser;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidVectorParser {
    public static final int $stable = 8;
    public final XmlPullParser a;
    public int b;
    @JvmField
    @NotNull
    public final PathParser pathParser;

    public AndroidVectorParser(@NotNull XmlPullParser xmlPullParser0, int v) {
        this.a = xmlPullParser0;
        this.b = v;
        this.pathParser = new PathParser();
    }

    public AndroidVectorParser(XmlPullParser xmlPullParser0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        this(xmlPullParser0, v);
    }

    public final void a(int v) {
        this.b |= v;
    }

    @NotNull
    public final XmlPullParser component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    @NotNull
    public final AndroidVectorParser copy(@NotNull XmlPullParser xmlPullParser0, int v) {
        return new AndroidVectorParser(xmlPullParser0, v);
    }

    public static AndroidVectorParser copy$default(AndroidVectorParser androidVectorParser0, XmlPullParser xmlPullParser0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            xmlPullParser0 = androidVectorParser0.a;
        }
        if((v1 & 2) != 0) {
            v = androidVectorParser0.b;
        }
        return androidVectorParser0.copy(xmlPullParser0, v);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AndroidVectorParser)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((AndroidVectorParser)object0).a) ? this.b == ((AndroidVectorParser)object0).b : false;
    }

    public final int getConfig() {
        return this.b;
    }

    public final float getDimension(@NotNull TypedArray typedArray0, int v, float f) {
        float f1 = typedArray0.getDimension(v, f);
        this.a(typedArray0.getChangingConfigurations());
        return f1;
    }

    public final float getFloat(@NotNull TypedArray typedArray0, int v, float f) {
        float f1 = typedArray0.getFloat(v, f);
        this.a(typedArray0.getChangingConfigurations());
        return f1;
    }

    public final int getInt(@NotNull TypedArray typedArray0, int v, int v1) {
        int v2 = typedArray0.getInt(v, v1);
        this.a(typedArray0.getChangingConfigurations());
        return v2;
    }

    public final boolean getNamedBoolean(@NotNull TypedArray typedArray0, @NotNull String s, @StyleableRes int v, boolean z) {
        boolean z1 = TypedArrayUtils.getNamedBoolean(typedArray0, this.a, s, v, z);
        this.a(typedArray0.getChangingConfigurations());
        return z1;
    }

    @Nullable
    public final ColorStateList getNamedColorStateList(@NotNull TypedArray typedArray0, @Nullable Resources.Theme resources$Theme0, @NotNull String s, @StyleableRes int v) {
        ColorStateList colorStateList0 = TypedArrayUtils.getNamedColorStateList(typedArray0, this.a, resources$Theme0, s, v);
        this.a(typedArray0.getChangingConfigurations());
        return colorStateList0;
    }

    @NotNull
    public final ComplexColorCompat getNamedComplexColor(@NotNull TypedArray typedArray0, @Nullable Resources.Theme resources$Theme0, @NotNull String s, @StyleableRes int v, @ColorInt int v1) {
        ComplexColorCompat complexColorCompat0 = TypedArrayUtils.getNamedComplexColor(typedArray0, this.a, resources$Theme0, s, v, v1);
        this.a(typedArray0.getChangingConfigurations());
        return complexColorCompat0;
    }

    public final float getNamedFloat(@NotNull TypedArray typedArray0, @NotNull String s, @StyleableRes int v, float f) {
        float f1 = TypedArrayUtils.getNamedFloat(typedArray0, this.a, s, v, f);
        this.a(typedArray0.getChangingConfigurations());
        return f1;
    }

    public final int getNamedInt(@NotNull TypedArray typedArray0, @NotNull String s, @StyleableRes int v, int v1) {
        int v2 = TypedArrayUtils.getNamedInt(typedArray0, this.a, s, v, v1);
        this.a(typedArray0.getChangingConfigurations());
        return v2;
    }

    @Nullable
    public final String getString(@NotNull TypedArray typedArray0, int v) {
        String s = typedArray0.getString(v);
        this.a(typedArray0.getChangingConfigurations());
        return s;
    }

    @NotNull
    public final XmlPullParser getXmlParser() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.b + this.a.hashCode() * 0x1F;
    }

    @NotNull
    public final TypedArray obtainAttributes(@NotNull Resources resources0, @Nullable Resources.Theme resources$Theme0, @NotNull AttributeSet attributeSet0, @NotNull int[] arr_v) {
        TypedArray typedArray0 = TypedArrayUtils.obtainAttributes(resources0, resources$Theme0, attributeSet0, arr_v);
        this.a(typedArray0.getChangingConfigurations());
        return typedArray0;
    }

    public final void setConfig(int v) {
        this.b = v;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("AndroidVectorParser(xmlParser=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", config=");
        return b.p(stringBuilder0, this.b, ')');
    }
}

