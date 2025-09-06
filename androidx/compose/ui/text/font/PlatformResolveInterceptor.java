package androidx.compose.ui.text.font;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\u0014\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003H\u0016J\u001A\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u000BH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\tJ\u0010\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u000FH\u0016ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "", "interceptFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "interceptFontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "interceptFontStyle-T2F_aPo", "(I)I", "interceptFontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "interceptFontSynthesis-Mscr08Y", "interceptFontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface PlatformResolveInterceptor {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001A\u0010\u0007\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/font/PlatformResolveInterceptor$Companion;", "", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "b", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "getDefault$ui_text_release", "()Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "Default", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;
        public static final PlatformResolveInterceptor.Companion.Default.1 b;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.b = new PlatformResolveInterceptor.Companion.Default.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @NotNull
        public final PlatformResolveInterceptor getDefault$ui_text_release() {
            return Companion.b;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        PlatformResolveInterceptor.Companion = Companion.a;
    }

    @Nullable
    default FontFamily interceptFontFamily(@Nullable FontFamily fontFamily0) [...] // Inlined contents

    default int interceptFontStyle-T2F_aPo(int v) [...] // Inlined contents

    default int interceptFontSynthesis-Mscr08Y(int v) [...] // Inlined contents

    @NotNull
    default FontWeight interceptFontWeight(@NotNull FontWeight fontWeight0) {
        return fontWeight0;
    }
}

