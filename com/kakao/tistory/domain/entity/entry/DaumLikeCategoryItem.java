package com.kakao.tistory.domain.entity.entry;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\u000E\u0010\u0006\u001A\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000BJ\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0013\u001A\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J8\u0010\u0014\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001A\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001A\u00020\u00172\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001A\u00020\u001AHÖ\u0001J\t\u0010\u001B\u001A\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001A\u0004\b\n\u0010\u000BR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0019\u0010\u0006\u001A\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u001C"}, d2 = {"Lcom/kakao/tistory/domain/entity/entry/DaumLikeCategoryItem;", "", "id", "", "label", "", "subItems", "", "Lcom/kakao/tistory/domain/entity/entry/DaumLikeItem;", "(Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLabel", "()Ljava/lang/String;", "getSubItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)Lcom/kakao/tistory/domain/entity/entry/DaumLikeCategoryItem;", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DaumLikeCategoryItem {
    @Nullable
    private final Long id;
    @Nullable
    private final String label;
    @Nullable
    private final List subItems;

    public DaumLikeCategoryItem(@Nullable Long long0, @Nullable String s, @Nullable List list0) {
        this.id = long0;
        this.label = s;
        this.subItems = list0;
    }

    public DaumLikeCategoryItem(Long long0, String s, List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            long0 = null;
        }
        if((v & 2) != 0) {
            s = null;
        }
        this(long0, s, list0);
    }

    @Nullable
    public final Long component1() {
        return this.id;
    }

    @Nullable
    public final String component2() {
        return this.label;
    }

    @Nullable
    public final List component3() {
        return this.subItems;
    }

    @NotNull
    public final DaumLikeCategoryItem copy(@Nullable Long long0, @Nullable String s, @Nullable List list0) {
        return new DaumLikeCategoryItem(long0, s, list0);
    }

    public static DaumLikeCategoryItem copy$default(DaumLikeCategoryItem daumLikeCategoryItem0, Long long0, String s, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            long0 = daumLikeCategoryItem0.id;
        }
        if((v & 2) != 0) {
            s = daumLikeCategoryItem0.label;
        }
        if((v & 4) != 0) {
            list0 = daumLikeCategoryItem0.subItems;
        }
        return daumLikeCategoryItem0.copy(long0, s, list0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DaumLikeCategoryItem)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.id, ((DaumLikeCategoryItem)object0).id)) {
            return false;
        }
        return Intrinsics.areEqual(this.label, ((DaumLikeCategoryItem)object0).label) ? Intrinsics.areEqual(this.subItems, ((DaumLikeCategoryItem)object0).subItems) : false;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final List getSubItems() {
        return this.subItems;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.id == null ? 0 : this.id.hashCode();
        int v2 = this.label == null ? 0 : this.label.hashCode();
        List list0 = this.subItems;
        if(list0 != null) {
            v = list0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("DaumLikeCategoryItem(id=");
        stringBuilder0.append(this.id);
        stringBuilder0.append(", label=");
        stringBuilder0.append(this.label);
        stringBuilder0.append(", subItems=");
        return a.e(stringBuilder0, this.subItems, ")");
    }
}

