package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;

public final class j implements PlatformTypefaces {
    public static Typeface a(String s, FontWeight fontWeight0, int v) {
        if(FontStyle.equals-impl0(v, 0) && Intrinsics.areEqual(fontWeight0, FontWeight.Companion.getNormal()) && (s == null || s.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int v1 = AndroidFontUtils_androidKt.getAndroidTypefaceStyle-FO1MlWM(fontWeight0, v);
        return s == null || s.length() == 0 ? Typeface.defaultFromStyle(v1) : Typeface.create(s, v1);
    }

    public static Typeface b(String s, FontWeight fontWeight0, int v) {
        if(s.length() == 0) {
            return null;
        }
        Typeface typeface0 = j.a(s, fontWeight0, v);
        return Intrinsics.areEqual(typeface0, Typeface.create(Typeface.DEFAULT, AndroidFontUtils_androidKt.getAndroidTypefaceStyle-FO1MlWM(fontWeight0, v))) || Intrinsics.areEqual(typeface0, j.a(null, fontWeight0, v)) ? null : typeface0;
    }

    @Override  // androidx.compose.ui.text.font.PlatformTypefaces
    public final Typeface createDefault-FO1MlWM(FontWeight fontWeight0, int v) {
        return j.a(null, fontWeight0, v);
    }

    @Override  // androidx.compose.ui.text.font.PlatformTypefaces
    public final Typeface createNamed-RetOiIg(GenericFontFamily genericFontFamily0, FontWeight fontWeight0, int v) {
        Typeface typeface0 = j.b(PlatformTypefaces_androidKt.getWeightSuffixForFallbackFamilyName(genericFontFamily0.getName(), fontWeight0), fontWeight0, v);
        return typeface0 == null ? j.a(genericFontFamily0.getName(), fontWeight0, v) : typeface0;
    }

    @Override  // androidx.compose.ui.text.font.PlatformTypefaces
    public final Typeface optionalOnDeviceFontFamilyByName-78DK7lM(String s, FontWeight fontWeight0, int v, Settings fontVariation$Settings0, Context context0) {
        Companion fontFamily$Companion0 = FontFamily.Companion;
        if(Intrinsics.areEqual(s, "sans-serif")) {
            return PlatformTypefaces_androidKt.setFontVariationSettings(this.createNamed-RetOiIg(fontFamily$Companion0.getSansSerif(), fontWeight0, v), fontVariation$Settings0, context0);
        }
        if(Intrinsics.areEqual(s, fontFamily$Companion0.getSerif().getName())) {
            return PlatformTypefaces_androidKt.setFontVariationSettings(this.createNamed-RetOiIg(fontFamily$Companion0.getSerif(), fontWeight0, v), fontVariation$Settings0, context0);
        }
        if(Intrinsics.areEqual(s, fontFamily$Companion0.getMonospace().getName())) {
            return PlatformTypefaces_androidKt.setFontVariationSettings(this.createNamed-RetOiIg(fontFamily$Companion0.getMonospace(), fontWeight0, v), fontVariation$Settings0, context0);
        }
        return Intrinsics.areEqual(s, fontFamily$Companion0.getCursive().getName()) ? PlatformTypefaces_androidKt.setFontVariationSettings(this.createNamed-RetOiIg(fontFamily$Companion0.getCursive(), fontWeight0, v), fontVariation$Settings0, context0) : PlatformTypefaces_androidKt.setFontVariationSettings(j.b(s, fontWeight0, v), fontVariation$Settings0, context0);
    }
}

