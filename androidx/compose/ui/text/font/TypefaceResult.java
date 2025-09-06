package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bR\u0012\u0010\u0003\u001A\u00020\u0004X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000BÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceResult;", "Landroidx/compose/runtime/State;", "", "cacheable", "", "getCacheable", "()Z", "Async", "Immutable", "Landroidx/compose/ui/text/font/TypefaceResult$Async;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface TypefaceResult extends State {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000F\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001A\u0010\u0005\u001A\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u0014\u0010\u000E\u001A\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001A\u00020\u000F8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceResult$Async;", "Landroidx/compose/ui/text/font/TypefaceResult;", "Landroidx/compose/runtime/State;", "", "Landroidx/compose/ui/text/font/AsyncFontListLoader;", "current", "<init>", "(Landroidx/compose/ui/text/font/AsyncFontListLoader;)V", "a", "Landroidx/compose/ui/text/font/AsyncFontListLoader;", "getCurrent$ui_text_release", "()Landroidx/compose/ui/text/font/AsyncFontListLoader;", "getValue", "()Ljava/lang/Object;", "value", "", "getCacheable", "()Z", "cacheable", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Async implements State, TypefaceResult {
        public static final int $stable;
        public final AsyncFontListLoader a;

        public Async(@NotNull AsyncFontListLoader asyncFontListLoader0) {
            this.a = asyncFontListLoader0;
        }

        @Override  // androidx.compose.ui.text.font.TypefaceResult
        public boolean getCacheable() {
            return this.a.getCacheable$ui_text_release();
        }

        @NotNull
        public final AsyncFontListLoader getCurrent$ui_text_release() {
            return this.a;
        }

        @Override  // androidx.compose.runtime.State
        @NotNull
        public Object getValue() {
            return this.a.getValue();
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "Landroidx/compose/ui/text/font/TypefaceResult;", "", "value", "", "cacheable", "<init>", "(Ljava/lang/Object;Z)V", "a", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "b", "Z", "getCacheable", "()Z", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Immutable implements TypefaceResult {
        public static final int $stable;
        public final Object a;
        public final boolean b;

        public Immutable(@NotNull Object object0, boolean z) {
            this.a = object0;
            this.b = z;
        }

        public Immutable(Object object0, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 2) != 0) {
                z = true;
            }
            this(object0, z);
        }

        @Override  // androidx.compose.ui.text.font.TypefaceResult
        public boolean getCacheable() {
            return this.b;
        }

        @Override  // androidx.compose.runtime.State
        @NotNull
        public Object getValue() {
            return this.a;
        }
    }

    boolean getCacheable();
}

