package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nR\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000B\f\r¨\u0006\u000E"}, d2 = {"Landroidx/paging/LoadState;", "", "", "a", "Z", "getEndOfPaginationReached", "()Z", "endOfPaginationReached", "Error", "Loading", "NotLoading", "Landroidx/paging/LoadState$Error;", "Landroidx/paging/LoadState$Loading;", "Landroidx/paging/LoadState$NotLoading;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class LoadState {
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001A\u0010\t\u001A\u00020\b2\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/paging/LoadState$Error;", "Landroidx/paging/LoadState;", "", "error", "<init>", "(Ljava/lang/Throwable;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Error extends LoadState {
        public final Throwable b;

        public Error(@NotNull Throwable throwable0) {
            Intrinsics.checkNotNullParameter(throwable0, "error");
            super(false, null);
            this.b = throwable0;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return object0 instanceof Error && this.getEndOfPaginationReached() == ((Error)object0).getEndOfPaginationReached() && Intrinsics.areEqual(this.b, ((Error)object0).b);
        }

        @NotNull
        public final Throwable getError() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode() + Boolean.hashCode(this.getEndOfPaginationReached());
        }

        @Override
        @NotNull
        public String toString() {
            return "Error(endOfPaginationReached=" + this.getEndOfPaginationReached() + ", error=" + this.b + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001A\u0010\b\u001A\u00020\u00072\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Landroidx/paging/LoadState$Loading;", "Landroidx/paging/LoadState;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Loading extends LoadState {
        @NotNull
        public static final Loading INSTANCE;

        static {
            Loading.INSTANCE = new Loading(false, null);  // 初始化器: Landroidx/paging/LoadState;-><init>(ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            return object0 instanceof Loading && this.getEndOfPaginationReached() == ((Loading)object0).getEndOfPaginationReached();
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.getEndOfPaginationReached());
        }

        @Override
        @NotNull
        public String toString() {
            return "Loading(endOfPaginationReached=" + this.getEndOfPaginationReached() + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001A\u00020\u00032\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\b\u001A\u00020\tH\u0016J\b\u0010\n\u001A\u00020\u000BH\u0016¨\u0006\r"}, d2 = {"Landroidx/paging/LoadState$NotLoading;", "Landroidx/paging/LoadState;", "endOfPaginationReached", "", "(Z)V", "equals", "other", "", "hashCode", "", "toString", "", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class NotLoading extends LoadState {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001A\u0010\u0007\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/paging/LoadState$NotLoading$Companion;", "", "Landroidx/paging/LoadState$NotLoading;", "Complete", "Landroidx/paging/LoadState$NotLoading;", "getComplete$paging_common_release", "()Landroidx/paging/LoadState$NotLoading;", "Incomplete", "getIncomplete$paging_common_release", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final NotLoading getComplete$paging_common_release() {
                return NotLoading.b;
            }

            @NotNull
            public final NotLoading getIncomplete$paging_common_release() {
                return NotLoading.c;
            }
        }

        @NotNull
        public static final Companion Companion;
        public static final NotLoading b;
        public static final NotLoading c;

        static {
            NotLoading.Companion = new Companion(null);
            NotLoading.b = new NotLoading(true);
            NotLoading.c = new NotLoading(false);
        }

        public NotLoading(boolean z) {
            super(z, null);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            return object0 instanceof NotLoading && this.getEndOfPaginationReached() == ((NotLoading)object0).getEndOfPaginationReached();
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.getEndOfPaginationReached());
        }

        @Override
        @NotNull
        public String toString() {
            return "NotLoading(endOfPaginationReached=" + this.getEndOfPaginationReached() + ')';
        }
    }

    public final boolean a;

    public LoadState(boolean z, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = z;
    }

    public final boolean getEndOfPaginationReached() {
        return this.a;
    }
}

