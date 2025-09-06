package androidx.compose.ui.text;

import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.LinkedHashMap;
import java.util.Map;

public final class f implements ResourceLoader {
    public final Resolver a;
    public static final DeprecatedBridgeFontResourceLoader.Companion b;
    public static Map c;
    public static final SynchronizedObject d;

    static {
        f.b = new DeprecatedBridgeFontResourceLoader.Companion(null);
        f.c = new LinkedHashMap();
        f.d = Synchronization_jvmKt.createSynchronizedObject();
    }

    public f(Resolver fontFamily$Resolver0) {
        this.a = fontFamily$Resolver0;
    }

    @Override  // androidx.compose.ui.text.font.Font$ResourceLoader
    public final Object load(Font font0) {
        FontFamily fontFamily0 = FontKt.toFontFamily(font0);
        FontWeight fontWeight0 = font0.getWeight();
        int v = font0.getStyle-_-LCdwA();
        return Resolver.resolve-DPcqOEQ$default(this.a, fontFamily0, fontWeight0, v, 0, 8, null).getValue();
    }
}

