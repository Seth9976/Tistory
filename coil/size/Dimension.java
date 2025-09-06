package coil.size;

import androidx.annotation.Px;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcoil/size/Dimension;", "", "Pixels", "Undefined", "Lcoil/size/Dimension$Pixels;", "Lcoil/size/Dimension$Undefined;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class Dimension {
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\b\b\u0001\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001A\u00020\u00062\b\u0010\u0007\u001A\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001A\u00020\u0003H\u0016J\b\u0010\n\u001A\u00020\u000BH\u0016R\u0010\u0010\u0002\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcoil/size/Dimension$Pixels;", "Lcoil/size/Dimension;", "px", "", "(I)V", "equals", "", "other", "", "hashCode", "toString", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nDimension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dimension.kt\ncoil/size/Dimension$Pixels\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
    public static final class Pixels extends Dimension {
        @JvmField
        public final int px;

        public Pixels(@Px int v) {
            super(null);
            this.px = v;
            if(v <= 0) {
                throw new IllegalArgumentException("px must be > 0.");
            }
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof Pixels && this.px == ((Pixels)object0).px;
        }

        @Override
        public int hashCode() {
            return this.px;
        }

        @Override
        @NotNull
        public String toString() {
            return String.valueOf(this.px);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil/size/Dimension$Undefined;", "Lcoil/size/Dimension;", "", "toString", "()Ljava/lang/String;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Undefined extends Dimension {
        @NotNull
        public static final Undefined INSTANCE;

        static {
            Undefined.INSTANCE = new Undefined(null);  // 初始化器: Lcoil/size/Dimension;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override
        @NotNull
        public String toString() {
            return "Dimension.Undefined";
        }
    }

    public Dimension(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

