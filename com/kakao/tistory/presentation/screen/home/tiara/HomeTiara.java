package com.kakao.tistory.presentation.screen.home.tiara;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tiara.data.ActionKind;
import com.kakao.tiara.data.Click;
import com.kakao.tiara.data.Meta.Builder;
import com.kakao.tistory.domain.home.entity.HomeSlotContent.TodayType;
import com.kakao.tistory.presentation.common.tiara.TiaraExtensionKt;
import com.kakao.tistory.presentation.common.tiara.TiaraPage;
import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import com.kakao.tistory.presentation.common.tiara.TistoryTiaraActionType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0014\b\u00C7\u0002\u0018\u00002\u00020\u0001:\u0003456J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001A\u00020\u00022\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005H\u0007\u00A2\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\r\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0015\u0010\u000F\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\t\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0015\u0010\u0013\u001A\u00020\u00022\u0006\u0010\u0012\u001A\u00020\u0011\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001A\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u0011\u00A2\u0006\u0004\b\u0016\u0010\u0014J\u001D\u0010\u0017\u001A\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u00112\u0006\u0010\n\u001A\u00020\t\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001A\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u0011\u00A2\u0006\u0004\b\u0019\u0010\u0014J\u0015\u0010\u001C\u001A\u00020\u00022\u0006\u0010\u001B\u001A\u00020\u001A\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0015\u0010\u001E\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\t\u00A2\u0006\u0004\b\u001E\u0010\u0010J\r\u0010\u001F\u001A\u00020\u0002\u00A2\u0006\u0004\b\u001F\u0010 J\r\u0010!\u001A\u00020\u0002\u00A2\u0006\u0004\b!\u0010 J\u001D\u0010%\u001A\u00020\u00022\u0006\u0010\"\u001A\u00020\u00112\u0006\u0010$\u001A\u00020#\u00A2\u0006\u0004\b%\u0010&J\u0015\u0010\'\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\t\u00A2\u0006\u0004\b\'\u0010\u0010J\u0015\u0010(\u001A\u00020\u00022\u0006\u0010\u001B\u001A\u00020\u001A\u00A2\u0006\u0004\b(\u0010\u001DJ\r\u0010)\u001A\u00020\u0002\u00A2\u0006\u0004\b)\u0010 J\u0015\u0010*\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\t\u00A2\u0006\u0004\b*\u0010\u0010J\r\u0010+\u001A\u00020\u0002\u00A2\u0006\u0004\b+\u0010 J\u001D\u0010-\u001A\u00020\u00022\u0006\u0010,\u001A\u00020\u00112\u0006\u0010\n\u001A\u00020\t\u00A2\u0006\u0004\b-\u0010\u0018J\u0015\u0010.\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\t\u00A2\u0006\u0004\b.\u0010\u0010R\u001A\u0010,\u001A\u00020\u00118\u0016X\u0096D\u00A2\u0006\f\n\u0004\b,\u0010/\u001A\u0004\b0\u00101R\u001A\u00102\u001A\u00020\u00118\u0016X\u0096D\u00A2\u0006\f\n\u0004\b2\u0010/\u001A\u0004\b3\u00101\u00A8\u00067"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/tiara/HomeTiara;", "Lcom/kakao/tistory/presentation/common/tiara/TiaraPage;", "", "TrackPage", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/kakao/tistory/presentation/screen/home/tiara/HomeTiara$LastSlotInfo;", "lastSlotInfo", "TrackUsage", "(Lcom/kakao/tistory/presentation/screen/home/tiara/HomeTiara$LastSlotInfo;Landroidx/compose/runtime/Composer;I)V", "Lcom/kakao/tistory/presentation/screen/home/tiara/HomeTiara$ClickEntry;", "clickEntry", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$TodayType;", "type", "trackClickToday", "(Lcom/kakao/tistory/presentation/screen/home/tiara/HomeTiara$ClickEntry;Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$TodayType;)V", "trackClickBest", "(Lcom/kakao/tistory/presentation/screen/home/tiara/HomeTiara$ClickEntry;)V", "", "url", "trackClickBanner", "(Ljava/lang/String;)V", "category", "trackClickCategoryGroup", "trackClickCategoryEntry", "(Ljava/lang/String;Lcom/kakao/tistory/presentation/screen/home/tiara/HomeTiara$ClickEntry;)V", "trackClickCategoryMore", "", "needFollowing", "trackClickCreatorFollow", "(Z)V", "trackClickCreatorEntry", "trackClickCreatorBlog", "()V", "trackClickCreatorMore", "blogName", "", "setNum", "trackClickSubscriptionBlog", "(Ljava/lang/String;I)V", "trackClickSubscriptionEntry", "trackClickSubscriptionFollow", "trackClickSubscriptionMore", "trackClickSupportEntry", "trackClickSupportMore", "section", "trackClickFocusEntry", "trackClickTipEntry", "Ljava/lang/String;", "getSection", "()Ljava/lang/String;", "page", "getPage", "ClickEntry", "com/kakao/tistory/presentation/screen/home/tiara/a", "LastSlotInfo", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHomeTiara.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeTiara.kt\ncom/kakao/tistory/presentation/screen/home/tiara/HomeTiara\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,353:1\n135#2,9:354\n215#2:363\n216#2:365\n144#2:366\n1#3:364\n1#3:367\n*S KotlinDebug\n*F\n+ 1 HomeTiara.kt\ncom/kakao/tistory/presentation/screen/home/tiara/HomeTiara\n*L\n349#1:354,9\n349#1:363\n349#1:365\n349#1:366\n349#1:364\n*E\n"})
public final class HomeTiara implements TiaraPage {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u001B\n\u0002\u0010\u000B\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u0002\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0015J\u0012\u0010\u0018\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u0015J\u0012\u0010\u001A\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u0015J\u0012\u0010\u001B\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJx\u0010\u001D\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u0002H\u00C6\u0001\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\u001F\u001A\u00020\u0006H\u00D6\u0001\u00A2\u0006\u0004\b\u001F\u0010\u0015J\u0010\u0010 \u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b \u0010\u0011J\u001A\u0010#\u001A\u00020\"2\b\u0010!\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010\u0011R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010\u0013R\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b-\u0010\u0015R\u0019\u0010\b\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\b.\u0010,\u001A\u0004\b/\u0010\u0015R\u0019\u0010\t\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\b0\u0010,\u001A\u0004\b1\u0010\u0015R\u0019\u0010\n\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\b2\u0010,\u001A\u0004\b3\u0010\u0015R\u0019\u0010\u000B\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\b4\u0010,\u001A\u0004\b5\u0010\u0015R\u0019\u0010\f\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\b6\u0010,\u001A\u0004\b7\u0010\u0015R\u0019\u0010\r\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010\u001C\u00A8\u0006;"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/tiara/HomeTiara$ClickEntry;", "", "", "order", "", "entryId", "", "entryTitle", "entryImage", "category", "categoryId", "blogName", "plink", "setNum", "<init>", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()I", "component2", "()J", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "component9", "()Ljava/lang/Integer;", "copy", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/kakao/tistory/presentation/screen/home/tiara/HomeTiara$ClickEntry;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getOrder", "b", "J", "getEntryId", "c", "Ljava/lang/String;", "getEntryTitle", "d", "getEntryImage", "e", "getCategory", "f", "getCategoryId", "g", "getBlogName", "h", "getPlink", "i", "Ljava/lang/Integer;", "getSetNum", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ClickEntry {
        public static final int $stable;
        public final int a;
        public final long b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final Integer i;

        public ClickEntry(int v, long v1, @Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5, @Nullable Integer integer0) {
            this.a = v;
            this.b = v1;
            this.c = s;
            this.d = s1;
            this.e = s2;
            this.f = s3;
            this.g = s4;
            this.h = s5;
            this.i = integer0;
        }

        public ClickEntry(int v, long v1, String s, String s1, String s2, String s3, String s4, String s5, Integer integer0, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
            this(v, v1, s, s1, s2, s3, s4, s5, ((v2 & 0x100) == 0 ? integer0 : null));
        }

        public final int component1() {
            return this.a;
        }

        public final long component2() {
            return this.b;
        }

        @Nullable
        public final String component3() {
            return this.c;
        }

        @Nullable
        public final String component4() {
            return this.d;
        }

        @Nullable
        public final String component5() {
            return this.e;
        }

        @Nullable
        public final String component6() {
            return this.f;
        }

        @Nullable
        public final String component7() {
            return this.g;
        }

        @Nullable
        public final String component8() {
            return this.h;
        }

        @Nullable
        public final Integer component9() {
            return this.i;
        }

        @NotNull
        public final ClickEntry copy(int v, long v1, @Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5, @Nullable Integer integer0) {
            return new ClickEntry(v, v1, s, s1, s2, s3, s4, s5, integer0);
        }

        public static ClickEntry copy$default(ClickEntry homeTiara$ClickEntry0, int v, long v1, String s, String s1, String s2, String s3, String s4, String s5, Integer integer0, int v2, Object object0) {
            int v3 = (v2 & 1) == 0 ? v : homeTiara$ClickEntry0.a;
            long v4 = (v2 & 2) == 0 ? v1 : homeTiara$ClickEntry0.b;
            String s6 = (v2 & 4) == 0 ? s : homeTiara$ClickEntry0.c;
            String s7 = (v2 & 8) == 0 ? s1 : homeTiara$ClickEntry0.d;
            String s8 = (v2 & 16) == 0 ? s2 : homeTiara$ClickEntry0.e;
            String s9 = (v2 & 0x20) == 0 ? s3 : homeTiara$ClickEntry0.f;
            String s10 = (v2 & 0x40) == 0 ? s4 : homeTiara$ClickEntry0.g;
            String s11 = (v2 & 0x80) == 0 ? s5 : homeTiara$ClickEntry0.h;
            return (v2 & 0x100) == 0 ? homeTiara$ClickEntry0.copy(v3, v4, s6, s7, s8, s9, s10, s11, integer0) : homeTiara$ClickEntry0.copy(v3, v4, s6, s7, s8, s9, s10, s11, homeTiara$ClickEntry0.i);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ClickEntry)) {
                return false;
            }
            if(this.a != ((ClickEntry)object0).a) {
                return false;
            }
            if(this.b != ((ClickEntry)object0).b) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((ClickEntry)object0).c)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.d, ((ClickEntry)object0).d)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.e, ((ClickEntry)object0).e)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.f, ((ClickEntry)object0).f)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.g, ((ClickEntry)object0).g)) {
                return false;
            }
            return Intrinsics.areEqual(this.h, ((ClickEntry)object0).h) ? Intrinsics.areEqual(this.i, ((ClickEntry)object0).i) : false;
        }

        @Nullable
        public final String getBlogName() {
            return this.g;
        }

        @Nullable
        public final String getCategory() {
            return this.e;
        }

        @Nullable
        public final String getCategoryId() {
            return this.f;
        }

        public final long getEntryId() {
            return this.b;
        }

        @Nullable
        public final String getEntryImage() {
            return this.d;
        }

        @Nullable
        public final String getEntryTitle() {
            return this.c;
        }

        public final int getOrder() {
            return this.a;
        }

        @Nullable
        public final String getPlink() {
            return this.h;
        }

        @Nullable
        public final Integer getSetNum() {
            return this.i;
        }

        @Override
        public int hashCode() {
            int v = a.k(this.b, this.a * 0x1F, 0x1F);
            int v1 = 0;
            int v2 = this.c == null ? 0 : this.c.hashCode();
            int v3 = this.d == null ? 0 : this.d.hashCode();
            int v4 = this.e == null ? 0 : this.e.hashCode();
            int v5 = this.f == null ? 0 : this.f.hashCode();
            int v6 = this.g == null ? 0 : this.g.hashCode();
            int v7 = this.h == null ? 0 : this.h.hashCode();
            Integer integer0 = this.i;
            if(integer0 != null) {
                v1 = integer0.hashCode();
            }
            return ((((((v + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v1;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("ClickEntry(order=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", entryId=");
            stringBuilder0.append(this.b);
            androidx.room.a.w(stringBuilder0, ", entryTitle=", this.c, ", entryImage=", this.d);
            androidx.room.a.w(stringBuilder0, ", category=", this.e, ", categoryId=", this.f);
            androidx.room.a.w(stringBuilder0, ", blogName=", this.g, ", plink=", this.h);
            stringBuilder0.append(", setNum=");
            stringBuilder0.append(this.i);
            stringBuilder0.append(")");
            return stringBuilder0.toString();
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0012\u001A\u00020\u00112\b\u0010\u0010\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\bR\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001A\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/tiara/HomeTiara$LastSlotInfo;", "", "", "slotType", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tistory/presentation/screen/home/tiara/HomeTiara$LastSlotInfo;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSlotType", "b", "getTitle", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class LastSlotInfo {
        public static final int $stable;
        public final String a;
        public final String b;

        public LastSlotInfo(@NotNull String s, @Nullable String s1) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            super();
            this.a = s;
            this.b = s1;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @Nullable
        public final String component2() {
            return this.b;
        }

        @NotNull
        public final LastSlotInfo copy(@NotNull String s, @Nullable String s1) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            return new LastSlotInfo(s, s1);
        }

        public static LastSlotInfo copy$default(LastSlotInfo homeTiara$LastSlotInfo0, String s, String s1, int v, Object object0) {
            if((v & 1) != 0) {
                s = homeTiara$LastSlotInfo0.a;
            }
            if((v & 2) != 0) {
                s1 = homeTiara$LastSlotInfo0.b;
            }
            return homeTiara$LastSlotInfo0.copy(s, s1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof LastSlotInfo)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((LastSlotInfo)object0).a) ? Intrinsics.areEqual(this.b, ((LastSlotInfo)object0).b) : false;
        }

        @NotNull
        public final String getSlotType() {
            return this.a;
        }

        @Nullable
        public final String getTitle() {
            return this.b;
        }

        @Override
        public int hashCode() {
            int v = this.a.hashCode();
            return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "LastSlotInfo(slotType=" + this.a + ", title=" + this.b + ")";
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[TodayType.values().length];
            try {
                arr_v[TodayType.NOTIFICATION.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TodayType.ENTRY.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TodayType.EVENT.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable;
    @NotNull
    public static final HomeTiara INSTANCE;

    static {
        HomeTiara.INSTANCE = new HomeTiara();
    }

    @Composable
    public final void TrackPage(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1769075036);
        int v1 = (v & 14) == 0 ? (composer1.changed(this) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1769075036, v1, -1, "com.kakao.tistory.presentation.screen.home.tiara.HomeTiara.TrackPage (HomeTiara.kt:24)");
            }
            TiaraExtensionKt.TrackPage("홈", "홈", null, ActionKind.ViewContentList, null, composer1, 0xC00, 20);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b(this, v));
        }
    }

    @Composable
    public final void TrackUsage(@Nullable LastSlotInfo homeTiara$LastSlotInfo0, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xE512F48E);
        int v1 = (v & 14) == 0 ? (composer1.changed(homeTiara$LastSlotInfo0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(this) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE512F48E, v1, -1, "com.kakao.tistory.presentation.screen.home.tiara.HomeTiara.TrackUsage (HomeTiara.kt:31)");
            }
            String s = null;
            Pair pair0 = TuplesKt.to("area", (homeTiara$LastSlotInfo0 == null ? null : homeTiara$LastSlotInfo0.getSlotType()));
            if(homeTiara$LastSlotInfo0 != null) {
                s = homeTiara$LastSlotInfo0.getTitle();
            }
            TiaraExtensionKt.TrackUsage("홈", "홈", "티스토리 홈의 완독률", null, HomeTiara.a(x.mapOf(new Pair[]{pair0, TuplesKt.to("title", s)})), composer1, 0x8180, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c(this, homeTiara$LastSlotInfo0, v));
        }
    }

    public static Map a(Map map0) {
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = map0.entrySet().iterator();
        while(true) {
            Map map1 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            Object object1 = ((Map.Entry)object0).getKey();
            Object object2 = ((Map.Entry)object0).getValue();
            if(object1 != null && object2 != null) {
                map1 = TuplesKt.to(object1, object2);
            }
            if(map1 != null) {
                arrayList0.add(map1);
            }
        }
        if(arrayList0.isEmpty()) {
            arrayList0 = null;
        }
        return arrayList0 == null ? null : x.toMap(arrayList0);
    }

    public final void a(TistoryTiaraActionType tistoryTiaraActionType0, String s, String s1) {
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, s, s1, "refreshbtn", null, null, null, null, null, null, null, 0x3F8, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "홈", "홈", tistoryTiaraActionType0, null, click0, null, null, null, 0xE8, null);
    }

    public final void a(TistoryTiaraActionType tistoryTiaraActionType0, String s, String s1, ClickEntry homeTiara$ClickEntry0, Map map0) {
        Integer integer0 = homeTiara$ClickEntry0.getSetNum();
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "홈", "홈", tistoryTiaraActionType0, ActionKind.ClickContent, TistoryTiara.createClick$default(TistoryTiara.INSTANCE, s, s1, "contents", homeTiara$ClickEntry0.getPlink(), (integer0 == null ? null : integer0.toString()), String.valueOf(homeTiara$ClickEntry0.getOrder()), homeTiara$ClickEntry0.getEntryTitle(), homeTiara$ClickEntry0.getEntryImage(), null, null, 0x300, null), new Builder().id(String.valueOf(homeTiara$ClickEntry0.getEntryId())).name(homeTiara$ClickEntry0.getEntryTitle()).category(homeTiara$ClickEntry0.getCategory()).categoryId(homeTiara$ClickEntry0.getCategoryId()).provider(homeTiara$ClickEntry0.getBlogName()).plink(homeTiara$ClickEntry0.getPlink()).build(), (map0 == null ? null : HomeTiara.a(map0)), null, 0x80, null);
    }

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getPage() [...] // Inlined contents

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getSection() [...] // Inlined contents

    public final void trackClickBanner(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "url");
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, null, null, null, s, null, null, null, null, null, null, 0x3F7, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "홈", "홈", TistoryTiaraActionType.CLICK_HOME_SLOT_BANNER, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickBest(@NotNull ClickEntry homeTiara$ClickEntry0) {
        Intrinsics.checkNotNullParameter(homeTiara$ClickEntry0, "clickEntry");
        this.a(TistoryTiaraActionType.CLICK_HOME_SLOT_BEST, "인기", "TOP5", homeTiara$ClickEntry0, null);
    }

    public final void trackClickCategoryEntry(@NotNull String s, @NotNull ClickEntry homeTiara$ClickEntry0) {
        Intrinsics.checkNotNullParameter(s, "category");
        Intrinsics.checkNotNullParameter(homeTiara$ClickEntry0, "clickEntry");
        this.a(TistoryTiaraActionType.CLICK_HOME_SLOT_CATEGORY_ENTRY, "인기", s, homeTiara$ClickEntry0, null);
    }

    public final void trackClickCategoryGroup(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "category");
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "인기", s, "btn", null, null, null, null, null, null, null, 0x3F8, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "홈", "홈", TistoryTiaraActionType.CLICK_HOME_SLOT_CATEGORY_GROUP, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickCategoryMore(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "category");
        this.a(TistoryTiaraActionType.CLICK_HOME_SLOT_CATEGORY_MORE, "인기", s);
    }

    public final void trackClickCreatorBlog() {
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "크리에이터", "추천", "profile", null, null, null, null, null, null, null, 0x3F8, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "홈", "홈", TistoryTiaraActionType.CLICK_HOME_SLOT_CREATOR_BLOG, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickCreatorEntry(@NotNull ClickEntry homeTiara$ClickEntry0) {
        Intrinsics.checkNotNullParameter(homeTiara$ClickEntry0, "clickEntry");
        this.a(TistoryTiaraActionType.CLICK_HOME_SLOT_CREATOR_ENTRY, "크리에이터", "추천", homeTiara$ClickEntry0, null);
    }

    public final void trackClickCreatorFollow(boolean z) {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "홈", "홈", TistoryTiaraActionType.CLICK_HOME_SLOT_CREATOR_FOLLOW, ActionKind.Follow, TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "크리에이터", "추천", "btn", null, null, null, (z ? "구독하기" : "구독취소"), null, null, null, 952, null), null, null, null, 0xE0, null);
    }

    public final void trackClickCreatorMore() {
        this.a(TistoryTiaraActionType.CLICK_HOME_SLOT_CREATOR_MORE, "크리에이터", "추천");
    }

    public final void trackClickFocusEntry(@NotNull String s, @NotNull ClickEntry homeTiara$ClickEntry0) {
        Intrinsics.checkNotNullParameter(s, "section");
        Intrinsics.checkNotNullParameter(homeTiara$ClickEntry0, "clickEntry");
        this.a(TistoryTiaraActionType.CLICK_HOME_SLOT_FOCUS, "섹션", s, homeTiara$ClickEntry0, null);
    }

    public final void trackClickSubscriptionBlog(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "크리에이터", "구독급상승", "blog", null, String.valueOf(v), null, s, null, null, null, 936, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "홈", "홈", TistoryTiaraActionType.CLICK_HOME_SLOT_SUBSCRIPTION_BLOG, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickSubscriptionEntry(@NotNull ClickEntry homeTiara$ClickEntry0) {
        Intrinsics.checkNotNullParameter(homeTiara$ClickEntry0, "clickEntry");
        this.a(TistoryTiaraActionType.CLICK_HOME_SLOT_SUBSCRIPTION_ENTRY, "크리에이터", "구독급상승", homeTiara$ClickEntry0, null);
    }

    public final void trackClickSubscriptionFollow(boolean z) {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "홈", "홈", TistoryTiaraActionType.CLICK_HOME_SLOT_SUBSCRIPTION_FOLLOW, ActionKind.Follow, TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "크리에이터", "구독급상승", "btn", null, null, null, (z ? "구독하기" : "구독취소"), null, null, null, 952, null), null, null, null, 0xE0, null);
    }

    public final void trackClickSubscriptionMore() {
        this.a(TistoryTiaraActionType.CLICK_HOME_SLOT_SUBSCRIPTION_MORE, "크리에이터", "구독급상승");
    }

    public final void trackClickSupportEntry(@NotNull ClickEntry homeTiara$ClickEntry0) {
        Intrinsics.checkNotNullParameter(homeTiara$ClickEntry0, "clickEntry");
        this.a(TistoryTiaraActionType.CLICK_HOME_SLOT_SUPPORT, "크리에이터", "응원", homeTiara$ClickEntry0, null);
    }

    public final void trackClickSupportMore() {
        this.a(TistoryTiaraActionType.CLICK_HOME_SLOT_SUPPORT_MORE, "크리에이터", "응원");
    }

    public final void trackClickTipEntry(@NotNull ClickEntry homeTiara$ClickEntry0) {
        Intrinsics.checkNotNullParameter(homeTiara$ClickEntry0, "clickEntry");
        this.a(TistoryTiaraActionType.CLICK_HOME_SLOT_TIP, "팁", "글", homeTiara$ClickEntry0, null);
    }

    public final void trackClickToday(@NotNull ClickEntry homeTiara$ClickEntry0, @NotNull TodayType homeSlotContent$TodayType0) {
        String s;
        Intrinsics.checkNotNullParameter(homeTiara$ClickEntry0, "clickEntry");
        Intrinsics.checkNotNullParameter(homeSlotContent$TodayType0, "type");
        TistoryTiaraActionType tistoryTiaraActionType0 = TistoryTiaraActionType.CLICK_HOME_SLOT_TODAY;
        switch(WhenMappings.$EnumSwitchMapping$0[homeSlotContent$TodayType0.ordinal()]) {
            case 1: {
                s = "notice";
                break;
            }
            case 2: {
                s = "contents";
                break;
            }
            case 3: {
                s = "event";
                break;
            }
            default: {
                s = null;
            }
        }
        this.a(tistoryTiaraActionType0, "투데이", "커버", homeTiara$ClickEntry0, w.mapOf(TuplesKt.to("type", s)));
    }
}

