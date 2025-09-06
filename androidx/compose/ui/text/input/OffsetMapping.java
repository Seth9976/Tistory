package androidx.compose.ui.text.input;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H&J\u0010\u0010\u0005\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/input/OffsetMapping;", "", "originalToTransformed", "", "offset", "transformedToOriginal", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface OffsetMapping {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/input/OffsetMapping$Companion;", "", "Landroidx/compose/ui/text/input/OffsetMapping;", "b", "Landroidx/compose/ui/text/input/OffsetMapping;", "getIdentity", "()Landroidx/compose/ui/text/input/OffsetMapping;", "Identity", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;
        public static final OffsetMapping.Companion.Identity.1 b;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.b = new OffsetMapping.Companion.Identity.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @NotNull
        public final OffsetMapping getIdentity() {
            return Companion.b;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        OffsetMapping.Companion = Companion.a;
    }

    int originalToTransformed(int arg1);

    int transformedToOriginal(int arg1);
}

