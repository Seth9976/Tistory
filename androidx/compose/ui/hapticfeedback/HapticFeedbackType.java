package androidx.compose.ui.hapticfeedback;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000B\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001A\u0010\u0010\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000E\u0010\u000F\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class HapticFeedbackType {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\b\u001A\u00020\u00038Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0007R\u0017\u0010\n\u001A\u00020\u00038Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\t\u0010\u0007\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/hapticfeedback/HapticFeedbackType$Companion;", "", "", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "values", "()Ljava/util/List;", "getLongPress-5zf0vsI", "()I", "LongPress", "getTextHandleMove-5zf0vsI", "TextHandleMove", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final int getLongPress-5zf0vsI() {
            return 0;
        }

        // 去混淆评级： 低(20)
        public final int getTextHandleMove-5zf0vsI() {
            return 9;
        }

        @NotNull
        public final List values() {
            return CollectionsKt__CollectionsKt.listOf(new HapticFeedbackType[]{HapticFeedbackType.box-impl(this.getLongPress-5zf0vsI()), HapticFeedbackType.box-impl(this.getTextHandleMove-5zf0vsI())});
        }
    }

    @NotNull
    public static final Companion Companion;
    public final int a;

    static {
        HapticFeedbackType.Companion = new Companion(null);
    }

    public HapticFeedbackType(int v) {
        this.a = v;
    }

    public static final HapticFeedbackType box-impl(int v) {
        return new HapticFeedbackType(v);
    }

    public static int constructor-impl(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return HapticFeedbackType.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(int v, Object object0) {
        return object0 instanceof HapticFeedbackType ? v == ((HapticFeedbackType)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(int v, int v1) {
        return v == v1;
    }

    @Override
    public int hashCode() {
        return HapticFeedbackType.hashCode-impl(this.a);
    }

    public static int hashCode-impl(int v) {
        return v;
    }

    @Override
    @NotNull
    public String toString() {
        return HapticFeedbackType.toString-impl(this.a);
    }

    @NotNull
    public static String toString-impl(int v) {
        Companion hapticFeedbackType$Companion0 = HapticFeedbackType.Companion;
        if(HapticFeedbackType.equals-impl0(v, hapticFeedbackType$Companion0.getLongPress-5zf0vsI())) {
            return "LongPress";
        }
        return HapticFeedbackType.equals-impl0(v, hapticFeedbackType$Companion0.getTextHandleMove-5zf0vsI()) ? "TextHandleMove" : "Invalid";
    }

    public final int unbox-impl() {
        return this.a;
    }
}

