package com.kakao.tistory.presentation.screen.blog.main.contract;

import androidx.annotation.StringRes;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003:\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsState;", "T", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem;", "", "Error", "Loading", "Success", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsState$Error;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsState$Loading;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsState$Success;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface StatisticsState {
    @Immutable
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001F\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000B\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ(\u0010\r\u001A\u00020\u00002\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001A\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000F\u0010\nJ\u0010\u0010\u0010\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\nR\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\f¨\u0006\u001D"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsState$Error;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsState;", "", "", "message", "", "messageRes", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsState$Error;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMessage", "b", "Ljava/lang/Integer;", "getMessageRes", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Error implements StatisticsState {
        public static final int $stable;
        public final String a;
        public final Integer b;

        public Error() {
            this(null, null, 3, null);
        }

        public Error(@Nullable String s, @StringRes @Nullable Integer integer0) {
            this.a = s;
            this.b = integer0;
        }

        public Error(String s, Integer integer0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                s = null;
            }
            if((v & 2) != 0) {
                integer0 = null;
            }
            this(s, integer0);
        }

        @Nullable
        public final String component1() {
            return this.a;
        }

        @Nullable
        public final Integer component2() {
            return this.b;
        }

        @NotNull
        public final Error copy(@Nullable String s, @StringRes @Nullable Integer integer0) {
            return new Error(s, integer0);
        }

        public static Error copy$default(Error statisticsState$Error0, String s, Integer integer0, int v, Object object0) {
            if((v & 1) != 0) {
                s = statisticsState$Error0.a;
            }
            if((v & 2) != 0) {
                integer0 = statisticsState$Error0.b;
            }
            return statisticsState$Error0.copy(s, integer0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Error)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((Error)object0).a) ? Intrinsics.areEqual(this.b, ((Error)object0).b) : false;
        }

        @Nullable
        public final String getMessage() {
            return this.a;
        }

        @Nullable
        public final Integer getMessageRes() {
            return this.b;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.a == null ? 0 : this.a.hashCode();
            Integer integer0 = this.b;
            if(integer0 != null) {
                v = integer0.hashCode();
            }
            return v1 * 0x1F + v;
        }

        @Override
        @NotNull
        public String toString() {
            return "Error(message=" + this.a + ", messageRes=" + this.b + ")";
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001A\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\f\u001A\u00020\u000B2\b\u0010\n\u001A\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsState$Loading;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsState;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Loading implements StatisticsState {
        public static final int $stable;
        @NotNull
        public static final Loading INSTANCE;

        static {
            Loading.INSTANCE = new Loading();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof Loading;
        }

        @Override
        public int hashCode() {
            return 2000867197;
        }

        @Override
        @NotNull
        public String toString() {
            return "Loading";
        }
    }

    @Immutable
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u000F\u0012\u0006\u0010\u0004\u001A\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001A\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001A\u00028\u0001HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001A\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsState$Success;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem;", "T", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsState;", "item", "<init>", "(Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem;)V", "component1", "()Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem;", "copy", "(Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsState$Success;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem;", "getItem", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Success implements StatisticsState {
        public static final int $stable;
        public final StatisticsItem a;

        public Success(@NotNull StatisticsItem statisticsItem0) {
            Intrinsics.checkNotNullParameter(statisticsItem0, "item");
            super();
            this.a = statisticsItem0;
        }

        @NotNull
        public final StatisticsItem component1() {
            return this.a;
        }

        @NotNull
        public final Success copy(@NotNull StatisticsItem statisticsItem0) {
            Intrinsics.checkNotNullParameter(statisticsItem0, "item");
            return new Success(statisticsItem0);
        }

        public static Success copy$default(Success statisticsState$Success0, StatisticsItem statisticsItem0, int v, Object object0) {
            if((v & 1) != 0) {
                statisticsItem0 = statisticsState$Success0.a;
            }
            return statisticsState$Success0.copy(statisticsItem0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Success ? Intrinsics.areEqual(this.a, ((Success)object0).a) : false;
        }

        @NotNull
        public final StatisticsItem getItem() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "Success(item=" + this.a + ")";
        }
    }

}

