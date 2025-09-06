package com.kakao.tistory.presentation.screen.blog.main.contract;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import com.kakao.tistory.presentation.common.graph.a;
import com.kakao.tistory.presentation.main.contract.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BottomSheetType;", "", "Category", "EntryModify", "OthersBlogMenu", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BottomSheetType$Category;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BottomSheetType$EntryModify;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BottomSheetType$OthersBlogMenu;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface BottomSheetType {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BottomSheetType$Category;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BottomSheetType;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Category implements BottomSheetType {
        public static final int $stable;
        @NotNull
        public static final Category INSTANCE;

        static {
            Category.INSTANCE = new Category();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof Category;
        }

        @Override
        public int hashCode() {
            return 1387035837;
        }

        @Override
        @NotNull
        public String toString() {
            return "Category";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012JD\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u001A\u001A\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001A\u0010\u001BJ\u001A\u0010\u001E\u001A\u00020\u00042\b\u0010\u001D\u001A\u0004\u0018\u00010\u001CHÖ\u0003¢\u0006\u0004\b\u001E\u0010\u001FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010\u000ER\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b\u0005\u0010\u0010R\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010\u0012R\u0017\u0010\t\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010\u0014R\u0019\u0010\n\u001A\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b+\u0010&\u001A\u0004\b,\u0010\u0012¨\u0006-"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BottomSheetType$EntryModify;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BottomSheetType;", "", "entryId", "", "isEntryModifiable", "", "entryTitle", "Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;", "visibilityType", "password", "<init>", "(JZLjava/lang/String;Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;Ljava/lang/String;)V", "component1", "()J", "component2", "()Z", "component3", "()Ljava/lang/String;", "component4", "()Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;", "component5", "copy", "(JZLjava/lang/String;Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;Ljava/lang/String;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BottomSheetType$EntryModify;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getEntryId", "b", "Z", "c", "Ljava/lang/String;", "getEntryTitle", "d", "Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;", "getVisibilityType", "e", "getPassword", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class EntryModify implements BottomSheetType {
        public static final int $stable;
        public final long a;
        public final boolean b;
        public final String c;
        public final EntryVisibilityType d;
        public final String e;

        public EntryModify(long v, boolean z, @NotNull String s, @NotNull EntryVisibilityType entryVisibilityType0, @Nullable String s1) {
            Intrinsics.checkNotNullParameter(s, "entryTitle");
            Intrinsics.checkNotNullParameter(entryVisibilityType0, "visibilityType");
            super();
            this.a = v;
            this.b = z;
            this.c = s;
            this.d = entryVisibilityType0;
            this.e = s1;
        }

        public final long component1() {
            return this.a;
        }

        public final boolean component2() {
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

        @Nullable
        public final String component5() {
            return this.e;
        }

        @NotNull
        public final EntryModify copy(long v, boolean z, @NotNull String s, @NotNull EntryVisibilityType entryVisibilityType0, @Nullable String s1) {
            Intrinsics.checkNotNullParameter(s, "entryTitle");
            Intrinsics.checkNotNullParameter(entryVisibilityType0, "visibilityType");
            return new EntryModify(v, z, s, entryVisibilityType0, s1);
        }

        public static EntryModify copy$default(EntryModify bottomSheetType$EntryModify0, long v, boolean z, String s, EntryVisibilityType entryVisibilityType0, String s1, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = bottomSheetType$EntryModify0.a;
            }
            if((v1 & 2) != 0) {
                z = bottomSheetType$EntryModify0.b;
            }
            if((v1 & 4) != 0) {
                s = bottomSheetType$EntryModify0.c;
            }
            if((v1 & 8) != 0) {
                entryVisibilityType0 = bottomSheetType$EntryModify0.d;
            }
            if((v1 & 16) != 0) {
                s1 = bottomSheetType$EntryModify0.e;
            }
            return bottomSheetType$EntryModify0.copy(v, z, s, entryVisibilityType0, s1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof EntryModify)) {
                return false;
            }
            if(this.a != ((EntryModify)object0).a) {
                return false;
            }
            if(this.b != ((EntryModify)object0).b) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((EntryModify)object0).c)) {
                return false;
            }
            return this.d == ((EntryModify)object0).d ? Intrinsics.areEqual(this.e, ((EntryModify)object0).e) : false;
        }

        public final long getEntryId() {
            return this.a;
        }

        @NotNull
        public final String getEntryTitle() {
            return this.c;
        }

        @Nullable
        public final String getPassword() {
            return this.e;
        }

        @NotNull
        public final EntryVisibilityType getVisibilityType() {
            return this.d;
        }

        @Override
        public int hashCode() {
            int v = a.a(this.c, c.a(this.b, Long.hashCode(this.a) * 0x1F, 0x1F), 0x1F);
            int v1 = this.d.hashCode();
            return this.e == null ? (v1 + v) * 0x1F : (v1 + v) * 0x1F + this.e.hashCode();
        }

        public final boolean isEntryModifiable() {
            return this.b;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("EntryModify(entryId=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", isEntryModifiable=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", entryTitle=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", visibilityType=");
            stringBuilder0.append(this.d);
            return b.q(stringBuilder0, ", password=", this.e, ")");
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BottomSheetType$OthersBlogMenu;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BottomSheetType;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class OthersBlogMenu implements BottomSheetType {
        public static final int $stable;
        @NotNull
        public static final OthersBlogMenu INSTANCE;

        static {
            OthersBlogMenu.INSTANCE = new OthersBlogMenu();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof OthersBlogMenu;
        }

        @Override
        public int hashCode() {
            return 0x8BAE8123;
        }

        @Override
        @NotNull
        public String toString() {
            return "OthersBlogMenu";
        }
    }

}

