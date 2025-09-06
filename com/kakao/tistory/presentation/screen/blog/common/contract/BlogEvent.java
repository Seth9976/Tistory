package com.kakao.tistory.presentation.screen.blog.common.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.presentation.common.event.ShowToastEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogEvent;", "", "Finish", "ShowToast", "Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogEvent$Finish;", "Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogEvent$ShowToast;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface BlogEvent {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogEvent$Finish;", "Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Finish implements BlogEvent {
        public static final int $stable;
        @NotNull
        public static final Finish INSTANCE;

        static {
            Finish.INSTANCE = new Finish();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof Finish;
        }

        @Override
        public int hashCode() {
            return 0x9E5C16FA;
        }

        @Override
        @NotNull
        public String toString() {
            return "Finish";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001F\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000B\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ(\u0010\r\u001A\u00020\u00002\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000F\u0010\nJ\u0010\u0010\u0010\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001C\u0010\u0004\u001A\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\nR\u001C\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\f¨\u0006\u001D"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogEvent$ShowToast;", "Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogEvent;", "Lcom/kakao/tistory/presentation/common/event/ShowToastEvent;", "", "message", "", "messageRes", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogEvent$ShowToast;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMessage", "b", "Ljava/lang/Integer;", "getMessageRes", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowToast implements ShowToastEvent, BlogEvent {
        public static final int $stable;
        public final String a;
        public final Integer b;

        public ShowToast() {
            this(null, null, 3, null);
        }

        public ShowToast(@Nullable String s, @Nullable Integer integer0) {
            this.a = s;
            this.b = integer0;
        }

        public ShowToast(String s, Integer integer0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
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
        public final ShowToast copy(@Nullable String s, @Nullable Integer integer0) {
            return new ShowToast(s, integer0);
        }

        public static ShowToast copy$default(ShowToast blogEvent$ShowToast0, String s, Integer integer0, int v, Object object0) {
            if((v & 1) != 0) {
                s = blogEvent$ShowToast0.a;
            }
            if((v & 2) != 0) {
                integer0 = blogEvent$ShowToast0.b;
            }
            return blogEvent$ShowToast0.copy(s, integer0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ShowToast)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((ShowToast)object0).a) ? Intrinsics.areEqual(this.b, ((ShowToast)object0).b) : false;
        }

        @Override  // com.kakao.tistory.presentation.common.event.ShowToastEvent
        @Nullable
        public String getMessage() {
            return this.a;
        }

        @Override  // com.kakao.tistory.presentation.common.event.ShowToastEvent
        @Nullable
        public Integer getMessageRes() {
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
            return "ShowToast(message=" + this.a + ", messageRes=" + this.b + ")";
        }
    }

}

