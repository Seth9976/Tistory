package com.kakao.tistory.data.database.entity;

import androidx.room.Entity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Entity(primaryKeys = {"blogName"}, tableName = "auto_save_table")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b)\n\u0002\u0010\u000B\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001B\u00BD\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\n\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u0002\u0012\u000E\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001A\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0012\u001A\u00020\n\u0012\b\u0010\u0013\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001A\u0004\u0018\u00010\u0004\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001A\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001C\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001E\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001DJ\u0012\u0010\u001F\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010\u001BJ\u0010\u0010 \u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u001BJ\u0012\u0010!\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\u001BJ\u0012\u0010\"\u001A\u0004\u0018\u00010\nH\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b$\u0010\u001BJ\u0018\u0010%\u001A\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u00C6\u0003\u00A2\u0006\u0004\b%\u0010&J\u0012\u0010\'\u001A\u0004\u0018\u00010\nH\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010#J\u0012\u0010(\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b(\u0010\u001BJ\u0012\u0010)\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b)\u0010\u001BJ\u0010\u0010*\u001A\u00020\nH\u00C6\u0003\u00A2\u0006\u0004\b*\u0010+J\u0012\u0010,\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b,\u0010\u001BJ\u0012\u0010-\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b-\u0010.J\u0012\u0010/\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b/\u0010\u001BJ\u0012\u00100\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b0\u0010.J\u0012\u00101\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b1\u0010.J\u00E4\u0001\u00102\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001A\u00020\u00022\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001A\u00020\n2\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001A\u0004\u0018\u00010\u0004H\u00C6\u0001\u00A2\u0006\u0004\b2\u00103J\u0010\u00104\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b4\u0010\u001BJ\u0010\u00105\u001A\u00020\nH\u00D6\u0001\u00A2\u0006\u0004\b5\u0010+J\u001A\u00108\u001A\u0002072\b\u00106\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010\u001BR\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b=\u0010>\u001A\u0004\b?\u0010\u001DR\u0017\u0010\u0006\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b@\u0010>\u001A\u0004\bA\u0010\u001DR\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\bB\u0010;\u001A\u0004\bC\u0010\u001BR\u0017\u0010\b\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bD\u0010;\u001A\u0004\bE\u0010\u001BR\u0019\u0010\t\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\bF\u0010;\u001A\u0004\bG\u0010\u001BR\u0019\u0010\u000B\u001A\u0004\u0018\u00010\n8\u0006\u00A2\u0006\f\n\u0004\bH\u0010I\u001A\u0004\bJ\u0010#R\u0019\u0010\f\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\bK\u0010;\u001A\u0004\bL\u0010\u001BR\u001F\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0006\u00A2\u0006\f\n\u0004\bM\u0010N\u001A\u0004\bO\u0010&R\u0019\u0010\u000F\u001A\u0004\u0018\u00010\n8\u0006\u00A2\u0006\f\n\u0004\bP\u0010I\u001A\u0004\bQ\u0010#R\u0019\u0010\u0010\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\bR\u0010;\u001A\u0004\bS\u0010\u001BR\u0019\u0010\u0011\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\bT\u0010;\u001A\u0004\bU\u0010\u001BR\u0017\u0010\u0012\u001A\u00020\n8\u0006\u00A2\u0006\f\n\u0004\bV\u0010W\u001A\u0004\bX\u0010+R\u0019\u0010\u0013\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\bY\u0010;\u001A\u0004\bZ\u0010\u001BR\u0019\u0010\u0014\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\b[\u0010\\\u001A\u0004\b]\u0010.R\u0019\u0010\u0015\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b^\u0010;\u001A\u0004\b_\u0010\u001BR\u0019\u0010\u0016\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\b`\u0010\\\u001A\u0004\ba\u0010.R\u0019\u0010\u0017\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\bb\u0010\\\u001A\u0004\bc\u0010.\u00A8\u0006d"}, d2 = {"Lcom/kakao/tistory/data/database/entity/AutoSavedModel;", "", "", "blogName", "", "entryId", "draftSequence", "title", "postJson", "thumbnail", "", "categoryId", "categoryName", "", "tags", "daumLikeId", "daumLikeName", "visibility", "commentPermit", "reserveType", "reserveTime", "passwordString", "published", "updatedAt", "<init>", "(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "component5", "component6", "component7", "()Ljava/lang/Integer;", "component8", "component9", "()Ljava/util/List;", "component10", "component11", "component12", "component13", "()I", "component14", "component15", "()Ljava/lang/Long;", "component16", "component17", "component18", "copy", "(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/kakao/tistory/data/database/entity/AutoSavedModel;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "b", "J", "getEntryId", "c", "getDraftSequence", "d", "getTitle", "e", "getPostJson", "f", "getThumbnail", "g", "Ljava/lang/Integer;", "getCategoryId", "h", "getCategoryName", "i", "Ljava/util/List;", "getTags", "j", "getDaumLikeId", "k", "getDaumLikeName", "l", "getVisibility", "m", "I", "getCommentPermit", "n", "getReserveType", "o", "Ljava/lang/Long;", "getReserveTime", "p", "getPasswordString", "q", "getPublished", "r", "getUpdatedAt", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class AutoSavedModel {
    public final String a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final Integer g;
    public final String h;
    public final List i;
    public final Integer j;
    public final String k;
    public final String l;
    public final int m;
    public final String n;
    public final Long o;
    public final String p;
    public final Long q;
    public final Long r;

    public AutoSavedModel(@NotNull String s, long v, long v1, @Nullable String s1, @NotNull String s2, @Nullable String s3, @Nullable Integer integer0, @Nullable String s4, @Nullable List list0, @Nullable Integer integer1, @Nullable String s5, @Nullable String s6, int v2, @Nullable String s7, @Nullable Long long0, @Nullable String s8, @Nullable Long long1, @Nullable Long long2) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(s2, "postJson");
        super();
        this.a = s;
        this.b = v;
        this.c = v1;
        this.d = s1;
        this.e = s2;
        this.f = s3;
        this.g = integer0;
        this.h = s4;
        this.i = list0;
        this.j = integer1;
        this.k = s5;
        this.l = s6;
        this.m = v2;
        this.n = s7;
        this.o = long0;
        this.p = s8;
        this.q = long1;
        this.r = long2;
    }

    public AutoSavedModel(String s, long v, long v1, String s1, String s2, String s3, Integer integer0, String s4, List list0, Integer integer1, String s5, String s6, int v2, String s7, Long long0, String s8, Long long1, Long long2, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(s, ((v3 & 2) == 0 ? v : 0L), ((v3 & 4) == 0 ? v1 : 0L), s1, s2, s3, integer0, s4, list0, integer1, s5, s6, ((v3 & 0x1000) == 0 ? v2 : 1), s7, long0, s8, long1, long2);
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @Nullable
    public final Integer component10() {
        return this.j;
    }

    @Nullable
    public final String component11() {
        return this.k;
    }

    @Nullable
    public final String component12() {
        return this.l;
    }

    public final int component13() {
        return this.m;
    }

    @Nullable
    public final String component14() {
        return this.n;
    }

    @Nullable
    public final Long component15() {
        return this.o;
    }

    @Nullable
    public final String component16() {
        return this.p;
    }

    @Nullable
    public final Long component17() {
        return this.q;
    }

    @Nullable
    public final Long component18() {
        return this.r;
    }

    public final long component2() {
        return this.b;
    }

    public final long component3() {
        return this.c;
    }

    @Nullable
    public final String component4() {
        return this.d;
    }

    @NotNull
    public final String component5() {
        return this.e;
    }

    @Nullable
    public final String component6() {
        return this.f;
    }

    @Nullable
    public final Integer component7() {
        return this.g;
    }

    @Nullable
    public final String component8() {
        return this.h;
    }

    @Nullable
    public final List component9() {
        return this.i;
    }

    @NotNull
    public final AutoSavedModel copy(@NotNull String s, long v, long v1, @Nullable String s1, @NotNull String s2, @Nullable String s3, @Nullable Integer integer0, @Nullable String s4, @Nullable List list0, @Nullable Integer integer1, @Nullable String s5, @Nullable String s6, int v2, @Nullable String s7, @Nullable Long long0, @Nullable String s8, @Nullable Long long1, @Nullable Long long2) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(s2, "postJson");
        return new AutoSavedModel(s, v, v1, s1, s2, s3, integer0, s4, list0, integer1, s5, s6, v2, s7, long0, s8, long1, long2);
    }

    public static AutoSavedModel copy$default(AutoSavedModel autoSavedModel0, String s, long v, long v1, String s1, String s2, String s3, Integer integer0, String s4, List list0, Integer integer1, String s5, String s6, int v2, String s7, Long long0, String s8, Long long1, Long long2, int v3, Object object0) {
        String s9 = (v3 & 1) == 0 ? s : autoSavedModel0.a;
        long v4 = (v3 & 2) == 0 ? v : autoSavedModel0.b;
        long v5 = (v3 & 4) == 0 ? v1 : autoSavedModel0.c;
        String s10 = (v3 & 8) == 0 ? s1 : autoSavedModel0.d;
        String s11 = (v3 & 16) == 0 ? s2 : autoSavedModel0.e;
        String s12 = (v3 & 0x20) == 0 ? s3 : autoSavedModel0.f;
        Integer integer2 = (v3 & 0x40) == 0 ? integer0 : autoSavedModel0.g;
        String s13 = (v3 & 0x80) == 0 ? s4 : autoSavedModel0.h;
        List list1 = (v3 & 0x100) == 0 ? list0 : autoSavedModel0.i;
        Integer integer3 = (v3 & 0x200) == 0 ? integer1 : autoSavedModel0.j;
        String s14 = (v3 & 0x400) == 0 ? s5 : autoSavedModel0.k;
        String s15 = (v3 & 0x800) == 0 ? s6 : autoSavedModel0.l;
        int v6 = (v3 & 0x1000) == 0 ? v2 : autoSavedModel0.m;
        String s16 = (v3 & 0x2000) == 0 ? s7 : autoSavedModel0.n;
        Long long3 = (v3 & 0x4000) == 0 ? long0 : autoSavedModel0.o;
        String s17 = (v3 & 0x8000) == 0 ? s8 : autoSavedModel0.p;
        Long long4 = (v3 & 0x10000) == 0 ? long1 : autoSavedModel0.q;
        return (v3 & 0x20000) == 0 ? autoSavedModel0.copy(s9, v4, v5, s10, s11, s12, integer2, s13, list1, integer3, s14, s15, v6, s16, long3, s17, long4, long2) : autoSavedModel0.copy(s9, v4, v5, s10, s11, s12, integer2, s13, list1, integer3, s14, s15, v6, s16, long3, s17, long4, autoSavedModel0.r);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AutoSavedModel)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((AutoSavedModel)object0).a)) {
            return false;
        }
        if(this.b != ((AutoSavedModel)object0).b) {
            return false;
        }
        if(this.c != ((AutoSavedModel)object0).c) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((AutoSavedModel)object0).d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((AutoSavedModel)object0).e)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.f, ((AutoSavedModel)object0).f)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.g, ((AutoSavedModel)object0).g)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.h, ((AutoSavedModel)object0).h)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.i, ((AutoSavedModel)object0).i)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.j, ((AutoSavedModel)object0).j)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.k, ((AutoSavedModel)object0).k)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.l, ((AutoSavedModel)object0).l)) {
            return false;
        }
        if(this.m != ((AutoSavedModel)object0).m) {
            return false;
        }
        if(!Intrinsics.areEqual(this.n, ((AutoSavedModel)object0).n)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.o, ((AutoSavedModel)object0).o)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.p, ((AutoSavedModel)object0).p)) {
            return false;
        }
        return Intrinsics.areEqual(this.q, ((AutoSavedModel)object0).q) ? Intrinsics.areEqual(this.r, ((AutoSavedModel)object0).r) : false;
    }

    @NotNull
    public final String getBlogName() {
        return this.a;
    }

    @Nullable
    public final Integer getCategoryId() {
        return this.g;
    }

    @Nullable
    public final String getCategoryName() {
        return this.h;
    }

    public final int getCommentPermit() {
        return this.m;
    }

    @Nullable
    public final Integer getDaumLikeId() {
        return this.j;
    }

    @Nullable
    public final String getDaumLikeName() {
        return this.k;
    }

    public final long getDraftSequence() {
        return this.c;
    }

    public final long getEntryId() {
        return this.b;
    }

    @Nullable
    public final String getPasswordString() {
        return this.p;
    }

    @NotNull
    public final String getPostJson() {
        return this.e;
    }

    @Nullable
    public final Long getPublished() {
        return this.q;
    }

    @Nullable
    public final Long getReserveTime() {
        return this.o;
    }

    @Nullable
    public final String getReserveType() {
        return this.n;
    }

    @Nullable
    public final List getTags() {
        return this.i;
    }

    @Nullable
    public final String getThumbnail() {
        return this.f;
    }

    @Nullable
    public final String getTitle() {
        return this.d;
    }

    @Nullable
    public final Long getUpdatedAt() {
        return this.r;
    }

    @Nullable
    public final String getVisibility() {
        return this.l;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = a.c(this.m, (((((((q.c((wb.a.k(this.c, wb.a.k(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F) + (this.d == null ? 0 : this.d.hashCode())) * 0x1F, 0x1F, this.e) + (this.f == null ? 0 : this.f.hashCode())) * 0x1F + (this.g == null ? 0 : this.g.hashCode())) * 0x1F + (this.h == null ? 0 : this.h.hashCode())) * 0x1F + (this.i == null ? 0 : this.i.hashCode())) * 0x1F + (this.j == null ? 0 : this.j.hashCode())) * 0x1F + (this.k == null ? 0 : this.k.hashCode())) * 0x1F + (this.l == null ? 0 : this.l.hashCode())) * 0x1F, 0x1F);
        int v2 = this.n == null ? 0 : this.n.hashCode();
        int v3 = this.o == null ? 0 : this.o.hashCode();
        int v4 = this.p == null ? 0 : this.p.hashCode();
        int v5 = this.q == null ? 0 : this.q.hashCode();
        Long long0 = this.r;
        if(long0 != null) {
            v = long0.hashCode();
        }
        return ((((v1 + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("AutoSavedModel(blogName=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", entryId=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", draftSequence=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", title=");
        androidx.room.a.w(stringBuilder0, this.d, ", postJson=", this.e, ", thumbnail=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", categoryId=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", categoryName=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", tags=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", daumLikeId=");
        stringBuilder0.append(this.j);
        stringBuilder0.append(", daumLikeName=");
        stringBuilder0.append(this.k);
        stringBuilder0.append(", visibility=");
        stringBuilder0.append(this.l);
        stringBuilder0.append(", commentPermit=");
        stringBuilder0.append(this.m);
        stringBuilder0.append(", reserveType=");
        stringBuilder0.append(this.n);
        stringBuilder0.append(", reserveTime=");
        stringBuilder0.append(this.o);
        stringBuilder0.append(", passwordString=");
        stringBuilder0.append(this.p);
        stringBuilder0.append(", published=");
        stringBuilder0.append(this.q);
        stringBuilder0.append(", updatedAt=");
        stringBuilder0.append(this.r);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

