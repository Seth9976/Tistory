package androidx.compose.ui.text;

import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R.\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00078\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR\u0017\u0010\u000F\u001A\u00020\u000E8\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"androidx/compose/ui/text/DeprecatedBridgeFontResourceLoader$Companion", "", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "from", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;)Landroidx/compose/ui/text/font/Font$ResourceLoader;", "", "cache", "Ljava/util/Map;", "getCache", "()Ljava/util/Map;", "setCache", "(Ljava/util/Map;)V", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "lock", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "getLock", "()Landroidx/compose/ui/text/platform/SynchronizedObject;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextLayoutResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader$Companion\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,610:1\n26#2:611\n1#3:612\n*S KotlinDebug\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader$Companion\n*L\n290#1:611\n*E\n"})
public final class DeprecatedBridgeFontResourceLoader.Companion {
    public DeprecatedBridgeFontResourceLoader.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @NotNull
    public final ResourceLoader from(@NotNull Resolver fontFamily$Resolver0) {
        synchronized(this.getLock()) {
            DeprecatedBridgeFontResourceLoader.Companion deprecatedBridgeFontResourceLoader$Companion0 = f.b;
            ResourceLoader font$ResourceLoader0 = (ResourceLoader)deprecatedBridgeFontResourceLoader$Companion0.getCache().get(fontFamily$Resolver0);
            if(font$ResourceLoader0 != null) {
                return font$ResourceLoader0;
            }
            ResourceLoader font$ResourceLoader1 = new f(fontFamily$Resolver0);
            deprecatedBridgeFontResourceLoader$Companion0.getCache().put(fontFamily$Resolver0, font$ResourceLoader1);
            return font$ResourceLoader1;
        }
    }

    @NotNull
    public final Map getCache() {
        return f.c;
    }

    @NotNull
    public final SynchronizedObject getLock() {
        return f.d;
    }

    public final void setCache(@NotNull Map map0) {
        f.c = map0;
    }
}

