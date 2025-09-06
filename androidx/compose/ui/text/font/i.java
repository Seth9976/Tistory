package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.work.impl.background.systemjob.a;
import kotlin.jvm.internal.Intrinsics;

public final class i implements PlatformTypefaces {
    // 去混淆评级： 低(33)
    public static Typeface a(String s, FontWeight fontWeight0, int v) {
        if(FontStyle.equals-impl0(v, 0) && Intrinsics.areEqual(fontWeight0, FontWeight.Companion.getNormal()) && (s == null || s.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return s == null ? a.i(Typeface.DEFAULT, fontWeight0.getWeight(), FontStyle.equals-impl0(v, 1)) : a.i(Typeface.create(s, 0), fontWeight0.getWeight(), FontStyle.equals-impl0(v, 1));
    }

    @Override  // androidx.compose.ui.text.font.PlatformTypefaces
    public final Typeface createDefault-FO1MlWM(FontWeight fontWeight0, int v) {
        return i.a(null, fontWeight0, v);
    }

    @Override  // androidx.compose.ui.text.font.PlatformTypefaces
    public final Typeface createNamed-RetOiIg(GenericFontFamily genericFontFamily0, FontWeight fontWeight0, int v) {
        return i.a(genericFontFamily0.getName(), fontWeight0, v);
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
        if(Intrinsics.areEqual(s, fontFamily$Companion0.getCursive().getName())) {
            return PlatformTypefaces_androidKt.setFontVariationSettings(this.createNamed-RetOiIg(fontFamily$Companion0.getCursive(), fontWeight0, v), fontVariation$Settings0, context0);
        }
        if(s.length() == 0) {
            return PlatformTypefaces_androidKt.setFontVariationSettings(null, fontVariation$Settings0, context0);
        }
        Typeface typeface0 = i.a(s, fontWeight0, v);
        return Intrinsics.areEqual(typeface0, TypefaceHelperMethodsApi28.INSTANCE.create(Typeface.DEFAULT, fontWeight0.getWeight(), FontStyle.equals-impl0(v, 1))) || Intrinsics.areEqual(typeface0, i.a(null, fontWeight0, v)) ? PlatformTypefaces_androidKt.setFontVariationSettings(null, fontVariation$Settings0, context0) : PlatformTypefaces_androidKt.setFontVariationSettings(typeface0, fontVariation$Settings0, context0);
    }
}

