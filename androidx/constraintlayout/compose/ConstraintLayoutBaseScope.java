package androidx.constraintlayout.compose;

import a5.b;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\'\u0018\u00002\u00020\u0001:\u0003PQRB\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\t\u0010\u0003J.\u0010\u0010\u001A\u00020\r2\u0006\u0010\u000B\u001A\u00020\n2\u0017\u0010\u000F\u001A\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f\u00A2\u0006\u0002\b\u000E\u00A2\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0010\u001A\u00020\u00132\u0006\u0010\u000B\u001A\u00020\u00122\u0017\u0010\u000F\u001A\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\f\u00A2\u0006\u0002\b\u000E\u00A2\u0006\u0004\b\u0010\u0010\u0014J\u001B\u0010\u001A\u001A\u00020\u00172\u0006\u0010\u0016\u001A\u00020\u0015\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u001B\u0010\u001C\u001A\u00020\u00172\u0006\u0010\u0016\u001A\u00020\u0015\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001B\u0010\u0019J\u0015\u0010\u001A\u001A\u00020\u00172\u0006\u0010\u001E\u001A\u00020\u001D\u00A2\u0006\u0004\b\u001A\u0010\u0019J\u0015\u0010\u001C\u001A\u00020\u00172\u0006\u0010\u001E\u001A\u00020\u001D\u00A2\u0006\u0004\b\u001C\u0010\u0019J\u001B\u0010 \u001A\u00020\u00172\u0006\u0010\u0016\u001A\u00020\u0015\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001F\u0010\u0019J\u001B\u0010\"\u001A\u00020\u00172\u0006\u0010\u0016\u001A\u00020\u0015\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b!\u0010\u0019J\u0015\u0010 \u001A\u00020\u00172\u0006\u0010\u001E\u001A\u00020\u001D\u00A2\u0006\u0004\b \u0010\u0019J\u0015\u0010\"\u001A\u00020\u00172\u0006\u0010\u001E\u001A\u00020\u001D\u00A2\u0006\u0004\b\"\u0010\u0019J\u001B\u0010&\u001A\u00020#2\u0006\u0010\u0016\u001A\u00020\u0015\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b$\u0010%J\u0015\u0010&\u001A\u00020#2\u0006\u0010\u001E\u001A\u00020\u001D\u00A2\u0006\u0004\b&\u0010%J\u001B\u0010(\u001A\u00020#2\u0006\u0010\u0016\u001A\u00020\u0015\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\'\u0010%J\u0015\u0010(\u001A\u00020#2\u0006\u0010\u001E\u001A\u00020\u001D\u00A2\u0006\u0004\b(\u0010%J1\u0010/\u001A\u00020\u00172\u0012\u0010+\u001A\n\u0012\u0006\b\u0001\u0012\u00020*0)\"\u00020*2\b\b\u0002\u0010,\u001A\u00020\u0015\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b-\u0010.J1\u00101\u001A\u00020\u00172\u0012\u0010+\u001A\n\u0012\u0006\b\u0001\u0012\u00020*0)\"\u00020*2\b\b\u0002\u0010,\u001A\u00020\u0015\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b0\u0010.J1\u00104\u001A\u00020#2\u0012\u0010+\u001A\n\u0012\u0006\b\u0001\u0012\u00020*0)\"\u00020*2\b\b\u0002\u0010,\u001A\u00020\u0015\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b2\u00103J1\u00106\u001A\u00020\u00172\u0012\u0010+\u001A\n\u0012\u0006\b\u0001\u0012\u00020*0)\"\u00020*2\b\b\u0002\u0010,\u001A\u00020\u0015\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b5\u0010.J1\u00108\u001A\u00020\u00172\u0012\u0010+\u001A\n\u0012\u0006\b\u0001\u0012\u00020*0)\"\u00020*2\b\b\u0002\u0010,\u001A\u00020\u0015\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b7\u0010.J1\u0010:\u001A\u00020#2\u0012\u0010+\u001A\n\u0012\u0006\b\u0001\u0012\u00020*0)\"\u00020*2\b\b\u0002\u0010,\u001A\u00020\u0015\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b9\u00103J+\u0010=\u001A\u00020\n2\u0012\u0010+\u001A\n\u0012\u0006\b\u0001\u0012\u00020*0)\"\u00020*2\b\b\u0002\u0010<\u001A\u00020;\u00A2\u0006\u0004\b=\u0010>J+\u0010?\u001A\u00020\u00122\u0012\u0010+\u001A\n\u0012\u0006\b\u0001\u0012\u00020*0)\"\u00020*2\b\b\u0002\u0010<\u001A\u00020;\u00A2\u0006\u0004\b?\u0010@R,\u0010F\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\f0A8\u0004X\u0084\u0004\u00A2\u0006\f\n\u0004\bB\u0010C\u001A\u0004\bD\u0010ER(\u0010O\u001A\u00020G8\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0018\n\u0004\bH\u0010I\u0012\u0004\bN\u0010\u0003\u001A\u0004\bJ\u0010K\"\u0004\bL\u0010M\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006S"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;", "", "<init>", "()V", "Landroidx/constraintlayout/compose/State;", "state", "", "applyTo", "(Landroidx/constraintlayout/compose/State;)V", "reset", "Landroidx/constraintlayout/compose/HorizontalChainReference;", "ref", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/HorizontalChainScope;", "Lkotlin/ExtensionFunctionType;", "constrainBlock", "constrain", "(Landroidx/constraintlayout/compose/HorizontalChainReference;Lkotlin/jvm/functions/Function1;)Landroidx/constraintlayout/compose/HorizontalChainScope;", "Landroidx/constraintlayout/compose/VerticalChainReference;", "Landroidx/constraintlayout/compose/VerticalChainScope;", "(Landroidx/constraintlayout/compose/VerticalChainReference;Lkotlin/jvm/functions/Function1;)Landroidx/constraintlayout/compose/VerticalChainScope;", "Landroidx/compose/ui/unit/Dp;", "offset", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "createGuidelineFromStart-0680j_4", "(F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "createGuidelineFromStart", "createGuidelineFromAbsoluteLeft-0680j_4", "createGuidelineFromAbsoluteLeft", "", "fraction", "createGuidelineFromEnd-0680j_4", "createGuidelineFromEnd", "createGuidelineFromAbsoluteRight-0680j_4", "createGuidelineFromAbsoluteRight", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "createGuidelineFromTop-0680j_4", "(F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "createGuidelineFromTop", "createGuidelineFromBottom-0680j_4", "createGuidelineFromBottom", "", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "elements", "margin", "createStartBarrier-3ABfNKs", "([Landroidx/constraintlayout/compose/ConstrainedLayoutReference;F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "createStartBarrier", "createAbsoluteLeftBarrier-3ABfNKs", "createAbsoluteLeftBarrier", "createTopBarrier-3ABfNKs", "([Landroidx/constraintlayout/compose/ConstrainedLayoutReference;F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "createTopBarrier", "createEndBarrier-3ABfNKs", "createEndBarrier", "createAbsoluteRightBarrier-3ABfNKs", "createAbsoluteRightBarrier", "createBottomBarrier-3ABfNKs", "createBottomBarrier", "Landroidx/constraintlayout/compose/ChainStyle;", "chainStyle", "createHorizontalChain", "([Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Landroidx/constraintlayout/compose/ChainStyle;)Landroidx/constraintlayout/compose/HorizontalChainReference;", "createVerticalChain", "([Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Landroidx/constraintlayout/compose/ChainStyle;)Landroidx/constraintlayout/compose/VerticalChainReference;", "", "a", "Ljava/util/List;", "getTasks", "()Ljava/util/List;", "tasks", "", "b", "I", "getHelpersHashCode", "()I", "setHelpersHashCode", "(I)V", "getHelpersHashCode$annotations", "helpersHashCode", "BaselineAnchor", "HorizontalAnchor", "VerticalAnchor", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public abstract class ConstraintLayoutBaseScope {
    @Stable
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001A\u00020\u0001HÀ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0001HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0012\u001A\u00020\u00112\b\u0010\u0010\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001A\u0010\u0002\u001A\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0006¨\u0006\u0017"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", "", "id", "<init>", "(Ljava/lang/Object;)V", "component1$compose_release", "()Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getId$compose_release", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class BaselineAnchor {
        public final Object a;

        public BaselineAnchor(@NotNull Object object0) {
            Intrinsics.checkNotNullParameter(object0, "id");
            super();
            this.a = object0;
        }

        @NotNull
        public final Object component1$compose_release() {
            return this.a;
        }

        @NotNull
        public final BaselineAnchor copy(@NotNull Object object0) {
            Intrinsics.checkNotNullParameter(object0, "id");
            return new BaselineAnchor(object0);
        }

        public static BaselineAnchor copy$default(BaselineAnchor constraintLayoutBaseScope$BaselineAnchor0, Object object0, int v, Object object1) {
            if((v & 1) != 0) {
                object0 = constraintLayoutBaseScope$BaselineAnchor0.a;
            }
            return constraintLayoutBaseScope$BaselineAnchor0.copy(object0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof BaselineAnchor ? Intrinsics.areEqual(this.a, ((BaselineAnchor)object0).a) : false;
        }

        @NotNull
        public final Object getId$compose_release() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "BaselineAnchor(id=" + this.a + ')';
        }
    }

    @Stable
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0001\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001A\u00020\u0001HÀ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\f\u001A\u00020\u0003HÀ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00012\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000BJ\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001A\u0010\u0002\u001A\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\bR\u001A\u0010\u0004\u001A\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u000B¨\u0006\u001D"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "", "id", "", "index", "<init>", "(Ljava/lang/Object;I)V", "component1$compose_release", "()Ljava/lang/Object;", "component1", "component2$compose_release", "()I", "component2", "copy", "(Ljava/lang/Object;I)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getId$compose_release", "b", "I", "getIndex$compose_release", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class HorizontalAnchor {
        public final Object a;
        public final int b;

        public HorizontalAnchor(@NotNull Object object0, int v) {
            Intrinsics.checkNotNullParameter(object0, "id");
            super();
            this.a = object0;
            this.b = v;
        }

        @NotNull
        public final Object component1$compose_release() {
            return this.a;
        }

        public final int component2$compose_release() {
            return this.b;
        }

        @NotNull
        public final HorizontalAnchor copy(@NotNull Object object0, int v) {
            Intrinsics.checkNotNullParameter(object0, "id");
            return new HorizontalAnchor(object0, v);
        }

        public static HorizontalAnchor copy$default(HorizontalAnchor constraintLayoutBaseScope$HorizontalAnchor0, Object object0, int v, int v1, Object object1) {
            if((v1 & 1) != 0) {
                object0 = constraintLayoutBaseScope$HorizontalAnchor0.a;
            }
            if((v1 & 2) != 0) {
                v = constraintLayoutBaseScope$HorizontalAnchor0.b;
            }
            return constraintLayoutBaseScope$HorizontalAnchor0.copy(object0, v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof HorizontalAnchor)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((HorizontalAnchor)object0).a) ? this.b == ((HorizontalAnchor)object0).b : false;
        }

        @NotNull
        public final Object getId$compose_release() {
            return this.a;
        }

        public final int getIndex$compose_release() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return this.b + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("HorizontalAnchor(id=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", index=");
            return b.p(stringBuilder0, this.b, ')');
        }
    }

    @Stable
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0001\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001A\u00020\u0001HÀ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\f\u001A\u00020\u0003HÀ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00012\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000BJ\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001A\u0010\u0002\u001A\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\bR\u001A\u0010\u0004\u001A\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u000B¨\u0006\u001D"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "", "id", "", "index", "<init>", "(Ljava/lang/Object;I)V", "component1$compose_release", "()Ljava/lang/Object;", "component1", "component2$compose_release", "()I", "component2", "copy", "(Ljava/lang/Object;I)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getId$compose_release", "b", "I", "getIndex$compose_release", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class VerticalAnchor {
        public final Object a;
        public final int b;

        public VerticalAnchor(@NotNull Object object0, int v) {
            Intrinsics.checkNotNullParameter(object0, "id");
            super();
            this.a = object0;
            this.b = v;
        }

        @NotNull
        public final Object component1$compose_release() {
            return this.a;
        }

        public final int component2$compose_release() {
            return this.b;
        }

        @NotNull
        public final VerticalAnchor copy(@NotNull Object object0, int v) {
            Intrinsics.checkNotNullParameter(object0, "id");
            return new VerticalAnchor(object0, v);
        }

        public static VerticalAnchor copy$default(VerticalAnchor constraintLayoutBaseScope$VerticalAnchor0, Object object0, int v, int v1, Object object1) {
            if((v1 & 1) != 0) {
                object0 = constraintLayoutBaseScope$VerticalAnchor0.a;
            }
            if((v1 & 2) != 0) {
                v = constraintLayoutBaseScope$VerticalAnchor0.b;
            }
            return constraintLayoutBaseScope$VerticalAnchor0.copy(object0, v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof VerticalAnchor)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((VerticalAnchor)object0).a) ? this.b == ((VerticalAnchor)object0).b : false;
        }

        @NotNull
        public final Object getId$compose_release() {
            return this.a;
        }

        public final int getIndex$compose_release() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return this.b + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("VerticalAnchor(id=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", index=");
            return b.p(stringBuilder0, this.b, ')');
        }
    }

    public static final int $stable = 8;
    public final ArrayList a;
    public int b;
    public final int c;
    public int d;

    public ConstraintLayoutBaseScope() {
        this.a = new ArrayList();
        this.c = 1000;
        this.d = 1000;
    }

    public final int a() {
        int v = this.d;
        this.d = v + 1;
        return v;
    }

    public final void applyTo(@NotNull State state0) {
        Intrinsics.checkNotNullParameter(state0, "state");
        for(Object object0: this.a) {
            ((Function1)object0).invoke(state0);
        }
    }

    public final void b(int v) {
        this.b = (this.b * 1009 + v) % 1000000007;
    }

    @NotNull
    public final HorizontalChainScope constrain(@NotNull HorizontalChainReference horizontalChainReference0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(horizontalChainReference0, "ref");
        Intrinsics.checkNotNullParameter(function10, "constrainBlock");
        HorizontalChainScope horizontalChainScope0 = new HorizontalChainScope(horizontalChainReference0.getId$compose_release());
        function10.invoke(horizontalChainScope0);
        this.getTasks().addAll(horizontalChainScope0.getTasks$compose_release());
        return horizontalChainScope0;
    }

    @NotNull
    public final VerticalChainScope constrain(@NotNull VerticalChainReference verticalChainReference0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(verticalChainReference0, "ref");
        Intrinsics.checkNotNullParameter(function10, "constrainBlock");
        VerticalChainScope verticalChainScope0 = new VerticalChainScope(verticalChainReference0.getId$compose_release());
        function10.invoke(verticalChainScope0);
        this.getTasks().addAll(verticalChainScope0.getTasks$compose_release());
        return verticalChainScope0;
    }

    @NotNull
    public final VerticalAnchor createAbsoluteLeftBarrier-3ABfNKs(@NotNull ConstrainedLayoutReference[] arr_constrainedLayoutReference, float f) {
        Intrinsics.checkNotNullParameter(arr_constrainedLayoutReference, "elements");
        int v = this.a();
        j j0 = new j(v, f, arr_constrainedLayoutReference, 0);
        this.a.add(j0);
        this.b(11);
        for(int v1 = 0; v1 < arr_constrainedLayoutReference.length; ++v1) {
            this.b(arr_constrainedLayoutReference[v1].hashCode());
        }
        this.b(Dp.hashCode-impl(f));
        return new VerticalAnchor(v, 0);
    }

    public static VerticalAnchor createAbsoluteLeftBarrier-3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope0, ConstrainedLayoutReference[] arr_constrainedLayoutReference, float f, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAbsoluteLeftBarrier-3ABfNKs");
        }
        if((v & 2) != 0) {
            f = 0.0f;
        }
        return constraintLayoutBaseScope0.createAbsoluteLeftBarrier-3ABfNKs(arr_constrainedLayoutReference, f);
    }

    @NotNull
    public final VerticalAnchor createAbsoluteRightBarrier-3ABfNKs(@NotNull ConstrainedLayoutReference[] arr_constrainedLayoutReference, float f) {
        Intrinsics.checkNotNullParameter(arr_constrainedLayoutReference, "elements");
        int v = this.a();
        j j0 = new j(v, f, arr_constrainedLayoutReference, 1);
        this.a.add(j0);
        this.b(14);
        for(int v1 = 0; v1 < arr_constrainedLayoutReference.length; ++v1) {
            this.b(arr_constrainedLayoutReference[v1].hashCode());
        }
        this.b(Dp.hashCode-impl(f));
        return new VerticalAnchor(v, 0);
    }

    public static VerticalAnchor createAbsoluteRightBarrier-3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope0, ConstrainedLayoutReference[] arr_constrainedLayoutReference, float f, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAbsoluteRightBarrier-3ABfNKs");
        }
        if((v & 2) != 0) {
            f = 0.0f;
        }
        return constraintLayoutBaseScope0.createAbsoluteRightBarrier-3ABfNKs(arr_constrainedLayoutReference, f);
    }

    @NotNull
    public final HorizontalAnchor createBottomBarrier-3ABfNKs(@NotNull ConstrainedLayoutReference[] arr_constrainedLayoutReference, float f) {
        Intrinsics.checkNotNullParameter(arr_constrainedLayoutReference, "elements");
        int v = this.a();
        j j0 = new j(v, f, arr_constrainedLayoutReference, 2);
        this.a.add(j0);
        this.b(15);
        for(int v1 = 0; v1 < arr_constrainedLayoutReference.length; ++v1) {
            this.b(arr_constrainedLayoutReference[v1].hashCode());
        }
        this.b(Dp.hashCode-impl(f));
        return new HorizontalAnchor(v, 0);
    }

    public static HorizontalAnchor createBottomBarrier-3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope0, ConstrainedLayoutReference[] arr_constrainedLayoutReference, float f, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBottomBarrier-3ABfNKs");
        }
        if((v & 2) != 0) {
            f = 0.0f;
        }
        return constraintLayoutBaseScope0.createBottomBarrier-3ABfNKs(arr_constrainedLayoutReference, f);
    }

    @NotNull
    public final VerticalAnchor createEndBarrier-3ABfNKs(@NotNull ConstrainedLayoutReference[] arr_constrainedLayoutReference, float f) {
        Intrinsics.checkNotNullParameter(arr_constrainedLayoutReference, "elements");
        int v = this.a();
        j j0 = new j(v, f, arr_constrainedLayoutReference, 3);
        this.a.add(j0);
        this.b(13);
        for(int v1 = 0; v1 < arr_constrainedLayoutReference.length; ++v1) {
            this.b(arr_constrainedLayoutReference[v1].hashCode());
        }
        this.b(Dp.hashCode-impl(f));
        return new VerticalAnchor(v, 0);
    }

    public static VerticalAnchor createEndBarrier-3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope0, ConstrainedLayoutReference[] arr_constrainedLayoutReference, float f, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createEndBarrier-3ABfNKs");
        }
        if((v & 2) != 0) {
            f = 0.0f;
        }
        return constraintLayoutBaseScope0.createEndBarrier-3ABfNKs(arr_constrainedLayoutReference, f);
    }

    @NotNull
    public final VerticalAnchor createGuidelineFromAbsoluteLeft(float f) {
        int v = this.a();
        k k0 = new k(f, v, 1);
        this.a.add(k0);
        this.b(4);
        this.b(Float.hashCode(f));
        return new VerticalAnchor(v, 0);
    }

    @NotNull
    public final VerticalAnchor createGuidelineFromAbsoluteLeft-0680j_4(float f) {
        int v = this.a();
        k k0 = new k(f, v, 0);
        this.a.add(k0);
        this.b(2);
        this.b(Dp.hashCode-impl(f));
        return new VerticalAnchor(v, 0);
    }

    @NotNull
    public final VerticalAnchor createGuidelineFromAbsoluteRight(float f) {
        return this.createGuidelineFromAbsoluteLeft(1.0f - f);
    }

    @NotNull
    public final VerticalAnchor createGuidelineFromAbsoluteRight-0680j_4(float f) {
        int v = this.a();
        k k0 = new k(f, v, 2);
        this.a.add(k0);
        this.b(6);
        this.b(Dp.hashCode-impl(f));
        return new VerticalAnchor(v, 0);
    }

    @NotNull
    public final HorizontalAnchor createGuidelineFromBottom(float f) {
        return this.createGuidelineFromTop(1.0f - f);
    }

    @NotNull
    public final HorizontalAnchor createGuidelineFromBottom-0680j_4(float f) {
        int v = this.a();
        k k0 = new k(f, v, 3);
        this.a.add(k0);
        this.b(9);
        this.b(Dp.hashCode-impl(f));
        return new HorizontalAnchor(v, 0);
    }

    @NotNull
    public final VerticalAnchor createGuidelineFromEnd(float f) {
        return this.createGuidelineFromStart(1.0f - f);
    }

    @NotNull
    public final VerticalAnchor createGuidelineFromEnd-0680j_4(float f) {
        int v = this.a();
        k k0 = new k(f, v, 4);
        this.a.add(k0);
        this.b(5);
        this.b(Dp.hashCode-impl(f));
        return new VerticalAnchor(v, 0);
    }

    @NotNull
    public final VerticalAnchor createGuidelineFromStart(float f) {
        int v = this.a();
        k k0 = new k(f, v, 6);
        this.a.add(k0);
        this.b(3);
        this.b(Float.hashCode(f));
        return new VerticalAnchor(v, 0);
    }

    @NotNull
    public final VerticalAnchor createGuidelineFromStart-0680j_4(float f) {
        int v = this.a();
        k k0 = new k(f, v, 5);
        this.a.add(k0);
        this.b(1);
        this.b(Dp.hashCode-impl(f));
        return new VerticalAnchor(v, 0);
    }

    @NotNull
    public final HorizontalAnchor createGuidelineFromTop(float f) {
        int v = this.a();
        k k0 = new k(f, v, 8);
        this.a.add(k0);
        this.b(8);
        this.b(Float.hashCode(f));
        return new HorizontalAnchor(v, 0);
    }

    @NotNull
    public final HorizontalAnchor createGuidelineFromTop-0680j_4(float f) {
        int v = this.a();
        k k0 = new k(f, v, 7);
        this.a.add(k0);
        this.b(7);
        this.b(Dp.hashCode-impl(f));
        return new HorizontalAnchor(v, 0);
    }

    @NotNull
    public final HorizontalChainReference createHorizontalChain(@NotNull ConstrainedLayoutReference[] arr_constrainedLayoutReference, @NotNull ChainStyle chainStyle0) {
        Intrinsics.checkNotNullParameter(arr_constrainedLayoutReference, "elements");
        Intrinsics.checkNotNullParameter(chainStyle0, "chainStyle");
        int v = this.a();
        l l0 = new l(v, arr_constrainedLayoutReference, chainStyle0, 0);
        this.a.add(l0);
        this.b(16);
        for(int v1 = 0; v1 < arr_constrainedLayoutReference.length; ++v1) {
            this.b(arr_constrainedLayoutReference[v1].hashCode());
        }
        this.b(chainStyle0.hashCode());
        return new HorizontalChainReference(v);
    }

    public static HorizontalChainReference createHorizontalChain$default(ConstraintLayoutBaseScope constraintLayoutBaseScope0, ConstrainedLayoutReference[] arr_constrainedLayoutReference, ChainStyle chainStyle0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createHorizontalChain");
        }
        if((v & 2) != 0) {
            chainStyle0 = ChainStyle.Companion.getSpread();
        }
        return constraintLayoutBaseScope0.createHorizontalChain(arr_constrainedLayoutReference, chainStyle0);
    }

    @NotNull
    public final VerticalAnchor createStartBarrier-3ABfNKs(@NotNull ConstrainedLayoutReference[] arr_constrainedLayoutReference, float f) {
        Intrinsics.checkNotNullParameter(arr_constrainedLayoutReference, "elements");
        int v = this.a();
        j j0 = new j(v, f, arr_constrainedLayoutReference, 4);
        this.a.add(j0);
        this.b(10);
        for(int v1 = 0; v1 < arr_constrainedLayoutReference.length; ++v1) {
            this.b(arr_constrainedLayoutReference[v1].hashCode());
        }
        this.b(Dp.hashCode-impl(f));
        return new VerticalAnchor(v, 0);
    }

    public static VerticalAnchor createStartBarrier-3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope0, ConstrainedLayoutReference[] arr_constrainedLayoutReference, float f, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createStartBarrier-3ABfNKs");
        }
        if((v & 2) != 0) {
            f = 0.0f;
        }
        return constraintLayoutBaseScope0.createStartBarrier-3ABfNKs(arr_constrainedLayoutReference, f);
    }

    @NotNull
    public final HorizontalAnchor createTopBarrier-3ABfNKs(@NotNull ConstrainedLayoutReference[] arr_constrainedLayoutReference, float f) {
        Intrinsics.checkNotNullParameter(arr_constrainedLayoutReference, "elements");
        int v = this.a();
        j j0 = new j(v, f, arr_constrainedLayoutReference, 5);
        this.a.add(j0);
        this.b(12);
        for(int v1 = 0; v1 < arr_constrainedLayoutReference.length; ++v1) {
            this.b(arr_constrainedLayoutReference[v1].hashCode());
        }
        this.b(Dp.hashCode-impl(f));
        return new HorizontalAnchor(v, 0);
    }

    public static HorizontalAnchor createTopBarrier-3ABfNKs$default(ConstraintLayoutBaseScope constraintLayoutBaseScope0, ConstrainedLayoutReference[] arr_constrainedLayoutReference, float f, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createTopBarrier-3ABfNKs");
        }
        if((v & 2) != 0) {
            f = 0.0f;
        }
        return constraintLayoutBaseScope0.createTopBarrier-3ABfNKs(arr_constrainedLayoutReference, f);
    }

    @NotNull
    public final VerticalChainReference createVerticalChain(@NotNull ConstrainedLayoutReference[] arr_constrainedLayoutReference, @NotNull ChainStyle chainStyle0) {
        Intrinsics.checkNotNullParameter(arr_constrainedLayoutReference, "elements");
        Intrinsics.checkNotNullParameter(chainStyle0, "chainStyle");
        int v = this.a();
        l l0 = new l(v, arr_constrainedLayoutReference, chainStyle0, 1);
        this.a.add(l0);
        this.b(17);
        for(int v1 = 0; v1 < arr_constrainedLayoutReference.length; ++v1) {
            this.b(arr_constrainedLayoutReference[v1].hashCode());
        }
        this.b(chainStyle0.hashCode());
        return new VerticalChainReference(v);
    }

    public static VerticalChainReference createVerticalChain$default(ConstraintLayoutBaseScope constraintLayoutBaseScope0, ConstrainedLayoutReference[] arr_constrainedLayoutReference, ChainStyle chainStyle0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createVerticalChain");
        }
        if((v & 2) != 0) {
            chainStyle0 = ChainStyle.Companion.getSpread();
        }
        return constraintLayoutBaseScope0.createVerticalChain(arr_constrainedLayoutReference, chainStyle0);
    }

    public final int getHelpersHashCode() {
        return this.b;
    }

    @PublishedApi
    public static void getHelpersHashCode$annotations() {
    }

    @NotNull
    public final List getTasks() {
        return this.a;
    }

    public void reset() {
        this.a.clear();
        this.d = this.c;
        this.b = 0;
    }

    public final void setHelpersHashCode(int v) {
        this.b = v;
    }
}

