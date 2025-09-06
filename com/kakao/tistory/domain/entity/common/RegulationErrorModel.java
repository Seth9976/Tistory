package com.kakao.tistory.domain.entity.common;

import com.kakao.android.base.model.ErrorModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000B\u0010\u0007\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001A\u00020\u000EHÖ\u0001J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/domain/entity/common/RegulationErrorModel;", "Lcom/kakao/android/base/model/ErrorModel;", "data", "Lcom/kakao/tistory/domain/entity/common/RegulationLink;", "(Lcom/kakao/tistory/domain/entity/common/RegulationLink;)V", "getData", "()Lcom/kakao/tistory/domain/entity/common/RegulationLink;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class RegulationErrorModel extends ErrorModel {
    @Nullable
    private final RegulationLink data;

    public RegulationErrorModel() {
        this(null, 1, null);
    }

    public RegulationErrorModel(@Nullable RegulationLink regulationLink0) {
        this.data = regulationLink0;
    }

    public RegulationErrorModel(RegulationLink regulationLink0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            regulationLink0 = null;
        }
        this(regulationLink0);
    }

    @Nullable
    public final RegulationLink component1() {
        return this.data;
    }

    @NotNull
    public final RegulationErrorModel copy(@Nullable RegulationLink regulationLink0) {
        return new RegulationErrorModel(regulationLink0);
    }

    public static RegulationErrorModel copy$default(RegulationErrorModel regulationErrorModel0, RegulationLink regulationLink0, int v, Object object0) {
        if((v & 1) != 0) {
            regulationLink0 = regulationErrorModel0.data;
        }
        return regulationErrorModel0.copy(regulationLink0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof RegulationErrorModel ? Intrinsics.areEqual(this.data, ((RegulationErrorModel)object0).data) : false;
    }

    @Nullable
    public final RegulationLink getData() {
        return this.data;
    }

    @Override
    public int hashCode() {
        return this.data == null ? 0 : this.data.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "RegulationErrorModel(data=" + this.data + ")";
    }
}

