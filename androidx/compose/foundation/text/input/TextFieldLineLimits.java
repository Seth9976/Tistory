package androidx.compose.foundation.text.input;

import a5.b;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "", "Companion", "MultiLine", "SingleLine", "Landroidx/compose/foundation/text/input/TextFieldLineLimits$MultiLine;", "Landroidx/compose/foundation/text/input/TextFieldLineLimits$SingleLine;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface TextFieldLineLimits {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldLineLimits$Companion;", "", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "b", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "getDefault", "()Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "Default", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;
        public static final MultiLine b;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.b = new MultiLine(0, 0, 3, null);
        }

        @NotNull
        public final TextFieldLineLimits getDefault() {
            return Companion.b;
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001B\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\r\u001A\u00020\f2\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001A\u0004\b\u0015\u0010\u0010¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldLineLimits$MultiLine;", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "", "minHeightInLines", "maxHeightInLines", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "getMinHeightInLines", "b", "getMaxHeightInLines", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class MultiLine implements TextFieldLineLimits {
        public static final int $stable;
        public final int a;
        public final int b;

        public MultiLine() {
            this(0, 0, 3, null);
        }

        public MultiLine(int v, int v1) {
            this.a = v;
            this.b = v1;
            if(1 > v || v > v1) {
                throw new IllegalArgumentException(("Expected 1 ≤ minHeightInLines ≤ maxHeightInLines, were " + v + ", " + v1).toString());
            }
        }

        public MultiLine(int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v2 & 1) != 0) {
                v = 1;
            }
            if((v2 & 2) != 0) {
                v1 = 0x7FFFFFFF;
            }
            this(v, v1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 == null) {
                return false;
            }
            Class class0 = object0.getClass();
            if(MultiLine.class != class0) {
                return false;
            }
            return this.a == ((MultiLine)object0).a ? this.b == ((MultiLine)object0).b : false;
        }

        public final int getMaxHeightInLines() {
            return this.b;
        }

        public final int getMinHeightInLines() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a * 0x1F + this.b;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("MultiLine(minHeightInLines=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", maxHeightInLines=");
            return b.p(stringBuilder0, this.b, ')');
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldLineLimits$SingleLine;", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "", "toString", "()Ljava/lang/String;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class SingleLine implements TextFieldLineLimits {
        public static final int $stable;
        @NotNull
        public static final SingleLine INSTANCE;

        static {
            SingleLine.INSTANCE = new SingleLine();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override
        @NotNull
        public String toString() {
            return "TextFieldLineLimits.SingleLine";
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        TextFieldLineLimits.Companion = Companion.a;
    }
}

