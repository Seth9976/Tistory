package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import androidx.annotation.AnyRes;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleableRes;
import c3.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u001B\u0010\u0004\u001A\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001A\u00020\u0001\u00A2\u0006\u0004\b\u0004\u0010\u0005\u001A\u001D\u0010\u0006\u001A\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001A\u00020\u0001H\u0007\u00A2\u0006\u0004\b\u0006\u0010\u0007\u001A\u001B\u0010\t\u001A\u00020\b*\u00020\u00002\b\b\u0001\u0010\u0002\u001A\u00020\u0001\u00A2\u0006\u0004\b\t\u0010\n\u001A\u001B\u0010\f\u001A\u00020\u000B*\u00020\u00002\b\b\u0001\u0010\u0002\u001A\u00020\u0001\u00A2\u0006\u0004\b\f\u0010\r\u001A\u001D\u0010\u000E\u001A\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001A\u00020\u0001H\u0007\u00A2\u0006\u0004\b\u000E\u0010\u0007\u001A\u001D\u0010\u000F\u001A\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001A\u00020\u0001H\u0007\u00A2\u0006\u0004\b\u000F\u0010\u0007\u001A\u001B\u0010\u0011\u001A\u00020\u0010*\u00020\u00002\b\b\u0001\u0010\u0002\u001A\u00020\u0001\u00A2\u0006\u0004\b\u0011\u0010\u0012\u001A\u001B\u0010\u0013\u001A\u00020\u000B*\u00020\u00002\b\b\u0001\u0010\u0002\u001A\u00020\u0001\u00A2\u0006\u0004\b\u0013\u0010\r\u001A\u001D\u0010\u0015\u001A\u00020\u0014*\u00020\u00002\b\b\u0001\u0010\u0002\u001A\u00020\u0001H\u0007\u00A2\u0006\u0004\b\u0015\u0010\u0016\u001A\u001B\u0010\u0017\u001A\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001A\u00020\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0007\u001A\u001B\u0010\u0018\u001A\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001A\u00020\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0007\u001A\u001D\u0010\u0019\u001A\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001A\u00020\u0001H\u0007\u00A2\u0006\u0004\b\u0019\u0010\u0007\u001A\u001B\u0010\u001B\u001A\u00020\u001A*\u00020\u00002\b\b\u0001\u0010\u0002\u001A\u00020\u0001\u00A2\u0006\u0004\b\u001B\u0010\u001C\u001A\u001B\u0010\u001E\u001A\u00020\u001D*\u00020\u00002\b\b\u0001\u0010\u0002\u001A\u00020\u0001\u00A2\u0006\u0004\b\u001E\u0010\u001F\u001A!\u0010!\u001A\b\u0012\u0004\u0012\u00020\u001D0 *\u00020\u00002\b\b\u0001\u0010\u0002\u001A\u00020\u0001\u00A2\u0006\u0004\b!\u0010\"\u001A.\u0010&\u001A\u00028\u0000\"\u0004\b\u0000\u0010#*\u00020\u00002\u0012\u0010%\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000$H\u0086\b\u00A2\u0006\u0004\b&\u0010\'\u00A8\u0006("}, d2 = {"Landroid/content/res/TypedArray;", "", "index", "", "getBooleanOrThrow", "(Landroid/content/res/TypedArray;I)Z", "getColorOrThrow", "(Landroid/content/res/TypedArray;I)I", "Landroid/content/res/ColorStateList;", "getColorStateListOrThrow", "(Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;", "", "getDimensionOrThrow", "(Landroid/content/res/TypedArray;I)F", "getDimensionPixelOffsetOrThrow", "getDimensionPixelSizeOrThrow", "Landroid/graphics/drawable/Drawable;", "getDrawableOrThrow", "(Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;", "getFloatOrThrow", "Landroid/graphics/Typeface;", "getFontOrThrow", "(Landroid/content/res/TypedArray;I)Landroid/graphics/Typeface;", "getIntOrThrow", "getIntegerOrThrow", "getResourceIdOrThrow", "", "getStringOrThrow", "(Landroid/content/res/TypedArray;I)Ljava/lang/String;", "", "getTextOrThrow", "(Landroid/content/res/TypedArray;I)Ljava/lang/CharSequence;", "", "getTextArrayOrThrow", "(Landroid/content/res/TypedArray;I)[Ljava/lang/CharSequence;", "R", "Lkotlin/Function1;", "block", "use", "(Landroid/content/res/TypedArray;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TypedArrayKt {
    public static final void a(TypedArray typedArray0, int v) {
        if(!typedArray0.hasValue(v)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static final boolean getBooleanOrThrow(@NotNull TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        return typedArray0.getBoolean(v, false);
    }

    @ColorInt
    public static final int getColorOrThrow(@NotNull TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        return typedArray0.getColor(v, 0);
    }

    @NotNull
    public static final ColorStateList getColorStateListOrThrow(@NotNull TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        ColorStateList colorStateList0 = typedArray0.getColorStateList(v);
        if(colorStateList0 == null) {
            throw new IllegalStateException("Attribute value was not a color or color state list.");
        }
        return colorStateList0;
    }

    public static final float getDimensionOrThrow(@NotNull TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        return typedArray0.getDimension(v, 0.0f);
    }

    @Dimension
    public static final int getDimensionPixelOffsetOrThrow(@NotNull TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        return typedArray0.getDimensionPixelOffset(v, 0);
    }

    @Dimension
    public static final int getDimensionPixelSizeOrThrow(@NotNull TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        return typedArray0.getDimensionPixelSize(v, 0);
    }

    @NotNull
    public static final Drawable getDrawableOrThrow(@NotNull TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        Drawable drawable0 = typedArray0.getDrawable(v);
        Intrinsics.checkNotNull(drawable0);
        return drawable0;
    }

    public static final float getFloatOrThrow(@NotNull TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        return typedArray0.getFloat(v, 0.0f);
    }

    @RequiresApi(26)
    @NotNull
    public static final Typeface getFontOrThrow(@NotNull TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        return i.a(typedArray0, v);
    }

    public static final int getIntOrThrow(@NotNull TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        return typedArray0.getInt(v, 0);
    }

    public static final int getIntegerOrThrow(@NotNull TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        return typedArray0.getInteger(v, 0);
    }

    @AnyRes
    public static final int getResourceIdOrThrow(@NotNull TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        return typedArray0.getResourceId(v, 0);
    }

    @NotNull
    public static final String getStringOrThrow(@NotNull TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        String s = typedArray0.getString(v);
        if(s == null) {
            throw new IllegalStateException("Attribute value could not be coerced to String.");
        }
        return s;
    }

    @NotNull
    public static final CharSequence[] getTextArrayOrThrow(@NotNull TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        return typedArray0.getTextArray(v);
    }

    @NotNull
    public static final CharSequence getTextOrThrow(@NotNull TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        CharSequence charSequence0 = typedArray0.getText(v);
        if(charSequence0 == null) {
            throw new IllegalStateException("Attribute value could not be coerced to CharSequence.");
        }
        return charSequence0;
    }

    public static final Object use(@NotNull TypedArray typedArray0, @NotNull Function1 function10) {
        Object object0 = function10.invoke(typedArray0);
        typedArray0.recycle();
        return object0;
    }
}

