package i2;

import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.font.TypefaceRequest;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.font.c;
import androidx.compose.ui.text.font.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function1 {
    public final int w;
    public final FontFamilyResolverImpl x;

    public g(FontFamilyResolverImpl fontFamilyResolverImpl0, int v) {
        this.w = v;
        this.x = fontFamilyResolverImpl0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            FontFamilyResolverImpl fontFamilyResolverImpl0 = this.x;
            TypefaceResult typefaceResult0 = fontFamilyResolverImpl0.d.resolve(((TypefaceRequest)object0), fontFamilyResolverImpl0.getPlatformFontLoader$ui_text_release(), c.w, fontFamilyResolverImpl0.f);
            if(typefaceResult0 == null) {
                typefaceResult0 = fontFamilyResolverImpl0.e.resolve(((TypefaceRequest)object0), fontFamilyResolverImpl0.getPlatformFontLoader$ui_text_release(), d.w, fontFamilyResolverImpl0.f);
                if(typefaceResult0 == null) {
                    throw new IllegalStateException("Could not load font");
                }
            }
            return typefaceResult0;
        }
        TypefaceRequest typefaceRequest0 = TypefaceRequest.copy-e1PVR60$default(((TypefaceRequest)object0), null, null, 0, 0, null, 30, null);
        return FontFamilyResolverImpl.access$resolve(this.x, typefaceRequest0).getValue();
    }
}

