package androidx.work.impl.constraints;

import a5.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/work/impl/constraints/ConstraintsState;", "", "ConstraintsMet", "ConstraintsNotMet", "Landroidx/work/impl/constraints/ConstraintsState$ConstraintsMet;", "Landroidx/work/impl/constraints/ConstraintsState$ConstraintsNotMet;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class ConstraintsState {
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/constraints/ConstraintsState$ConstraintsMet;", "Landroidx/work/impl/constraints/ConstraintsState;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class ConstraintsMet extends ConstraintsState {
        @NotNull
        public static final ConstraintsMet INSTANCE;

        static {
            ConstraintsMet.INSTANCE = new ConstraintsMet(null);  // 初始化器: Landroidx/work/impl/constraints/ConstraintsState;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Landroidx/work/impl/constraints/ConstraintsState$ConstraintsNotMet;", "Landroidx/work/impl/constraints/ConstraintsState;", "", "reason", "<init>", "(I)V", "component1", "()I", "copy", "(I)Landroidx/work/impl/constraints/ConstraintsState$ConstraintsNotMet;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getReason", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class ConstraintsNotMet extends ConstraintsState {
        public final int a;

        public ConstraintsNotMet(int v) {
            super(null);
            this.a = v;
        }

        public final int component1() {
            return this.a;
        }

        @NotNull
        public final ConstraintsNotMet copy(int v) {
            return new ConstraintsNotMet(v);
        }

        public static ConstraintsNotMet copy$default(ConstraintsNotMet constraintsState$ConstraintsNotMet0, int v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = constraintsState$ConstraintsNotMet0.a;
            }
            return constraintsState$ConstraintsNotMet0.copy(v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ConstraintsNotMet ? this.a == ((ConstraintsNotMet)object0).a : false;
        }

        public final int getReason() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a;
        }

        @Override
        @NotNull
        public String toString() {
            return b.p(new StringBuilder("ConstraintsNotMet(reason="), this.a, ')');
        }
    }

    public ConstraintsState(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

