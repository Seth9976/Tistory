package com.kakao.tistory.data.database.entity;

import androidx.room.Entity;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Entity
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\'\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ\u0012\u0010\f\u001A\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000E\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ4\u0010\u0010\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001A\u0010\u0017\u001A\u00020\u00162\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001C\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u000BR\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\rR\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\u000F¨\u0006\""}, d2 = {"Lcom/kakao/tistory/data/database/entity/SearchKeyword;", "", "", "id", "", "keyword", "Ljava/util/Date;", "date", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Date;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/Date;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Date;)Lcom/kakao/tistory/data/database/entity/SearchKeyword;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "getId", "b", "Ljava/lang/String;", "getKeyword", "c", "Ljava/util/Date;", "getDate", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SearchKeyword {
    public final Integer a;
    public final String b;
    public final Date c;

    public SearchKeyword(@Nullable Integer integer0, @Nullable String s, @Nullable Date date0) {
        this.a = integer0;
        this.b = s;
        this.c = date0;
    }

    public SearchKeyword(Integer integer0, String s, Date date0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            integer0 = null;
        }
        this(integer0, s, date0);
    }

    @Nullable
    public final Integer component1() {
        return this.a;
    }

    @Nullable
    public final String component2() {
        return this.b;
    }

    @Nullable
    public final Date component3() {
        return this.c;
    }

    @NotNull
    public final SearchKeyword copy(@Nullable Integer integer0, @Nullable String s, @Nullable Date date0) {
        return new SearchKeyword(integer0, s, date0);
    }

    public static SearchKeyword copy$default(SearchKeyword searchKeyword0, Integer integer0, String s, Date date0, int v, Object object0) {
        if((v & 1) != 0) {
            integer0 = searchKeyword0.a;
        }
        if((v & 2) != 0) {
            s = searchKeyword0.b;
        }
        if((v & 4) != 0) {
            date0 = searchKeyword0.c;
        }
        return searchKeyword0.copy(integer0, s, date0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SearchKeyword)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((SearchKeyword)object0).a)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((SearchKeyword)object0).b) ? Intrinsics.areEqual(this.c, ((SearchKeyword)object0).c) : false;
    }

    @Nullable
    public final Date getDate() {
        return this.c;
    }

    @Nullable
    public final Integer getId() {
        return this.a;
    }

    @Nullable
    public final String getKeyword() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        Date date0 = this.c;
        if(date0 != null) {
            v = date0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    @NotNull
    public String toString() {
        return "SearchKeyword(id=" + this.a + ", keyword=" + this.b + ", date=" + this.c + ")";
    }
}

