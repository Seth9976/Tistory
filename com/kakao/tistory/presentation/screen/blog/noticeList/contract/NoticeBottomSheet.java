package com.kakao.tistory.presentation.screen.blog.noticeList.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import com.kakao.tistory.presentation.common.graph.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/NoticeBottomSheet;", "", "Modify", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/NoticeBottomSheet$Modify;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface NoticeBottomSheet {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000F\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000EJ\u0010\u0010\u0012\u001A\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001A\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JB\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000EJ\u0010\u0010\u001A\u001A\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001A\u0010\u001BJ\u001A\u0010\u001E\u001A\u00020\t2\b\u0010\u001D\u001A\u0004\u0018\u00010\u001CHÖ\u0003¢\u0006\u0004\b\u001E\u0010\u001FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010\u000ER\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010\u0010R\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010!\u001A\u0004\b\'\u0010\u000ER\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010\u0013R\u0017\u0010\n\u001A\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b-\u0010\u0015¨\u0006."}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/NoticeBottomSheet$Modify;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/NoticeBottomSheet;", "", "blogName", "", "id", "title", "Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;", "visibilityType", "", "modifiable", "<init>", "(Ljava/lang/String;JLjava/lang/String;Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;Z)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "()Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;", "component5", "()Z", "copy", "(Ljava/lang/String;JLjava/lang/String;Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;Z)Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/NoticeBottomSheet$Modify;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "b", "J", "getId", "c", "getTitle", "d", "Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;", "getVisibilityType", "e", "Z", "getModifiable", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Modify implements NoticeBottomSheet {
        public static final int $stable;
        public final String a;
        public final long b;
        public final String c;
        public final EntryVisibilityType d;
        public final boolean e;

        public Modify(@NotNull String s, long v, @NotNull String s1, @NotNull EntryVisibilityType entryVisibilityType0, boolean z) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            Intrinsics.checkNotNullParameter(s1, "title");
            Intrinsics.checkNotNullParameter(entryVisibilityType0, "visibilityType");
            super();
            this.a = s;
            this.b = v;
            this.c = s1;
            this.d = entryVisibilityType0;
            this.e = z;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        public final long component2() {
            return this.b;
        }

        @NotNull
        public final String component3() {
            return this.c;
        }

        @NotNull
        public final EntryVisibilityType component4() {
            return this.d;
        }

        public final boolean component5() {
            return this.e;
        }

        @NotNull
        public final Modify copy(@NotNull String s, long v, @NotNull String s1, @NotNull EntryVisibilityType entryVisibilityType0, boolean z) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            Intrinsics.checkNotNullParameter(s1, "title");
            Intrinsics.checkNotNullParameter(entryVisibilityType0, "visibilityType");
            return new Modify(s, v, s1, entryVisibilityType0, z);
        }

        public static Modify copy$default(Modify noticeBottomSheet$Modify0, String s, long v, String s1, EntryVisibilityType entryVisibilityType0, boolean z, int v1, Object object0) {
            if((v1 & 1) != 0) {
                s = noticeBottomSheet$Modify0.a;
            }
            if((v1 & 2) != 0) {
                v = noticeBottomSheet$Modify0.b;
            }
            if((v1 & 4) != 0) {
                s1 = noticeBottomSheet$Modify0.c;
            }
            if((v1 & 8) != 0) {
                entryVisibilityType0 = noticeBottomSheet$Modify0.d;
            }
            if((v1 & 16) != 0) {
                z = noticeBottomSheet$Modify0.e;
            }
            return noticeBottomSheet$Modify0.copy(s, v, s1, entryVisibilityType0, z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Modify)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Modify)object0).a)) {
                return false;
            }
            if(this.b != ((Modify)object0).b) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((Modify)object0).c)) {
                return false;
            }
            return this.d == ((Modify)object0).d ? this.e == ((Modify)object0).e : false;
        }

        @NotNull
        public final String getBlogName() {
            return this.a;
        }

        public final long getId() {
            return this.b;
        }

        public final boolean getModifiable() {
            return this.e;
        }

        @NotNull
        public final String getTitle() {
            return this.c;
        }

        @NotNull
        public final EntryVisibilityType getVisibilityType() {
            return this.d;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.e) + (this.d.hashCode() + a.a(this.c, wb.a.k(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F)) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "Modify(blogName=" + this.a + ", id=" + this.b + ", title=" + this.c + ", visibilityType=" + this.d + ", modifiable=" + this.e + ")";
        }
    }

}

