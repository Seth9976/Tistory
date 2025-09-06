package com.kakao.tistory.data.model.common;

import com.kakao.android.base.model.ErrorModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/tistory/data/model/common/ApiResponse;", "", "()V", "Fail", "Success", "Lcom/kakao/tistory/data/model/common/ApiResponse$Fail;", "Lcom/kakao/tistory/data/model/common/ApiResponse$Success;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class ApiResponse {
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001A\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001A\u00020\u000EHÖ\u0001J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/data/model/common/ApiResponse$Fail;", "Lcom/kakao/tistory/data/model/common/ApiResponse;", "errorModel", "Lcom/kakao/android/base/model/ErrorModel;", "(Lcom/kakao/android/base/model/ErrorModel;)V", "getErrorModel", "()Lcom/kakao/android/base/model/ErrorModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Fail extends ApiResponse {
        @NotNull
        private final ErrorModel errorModel;

        public Fail(@NotNull ErrorModel errorModel0) {
            Intrinsics.checkNotNullParameter(errorModel0, "errorModel");
            super(null);
            this.errorModel = errorModel0;
        }

        @NotNull
        public final ErrorModel component1() {
            return this.errorModel;
        }

        @NotNull
        public final Fail copy(@NotNull ErrorModel errorModel0) {
            Intrinsics.checkNotNullParameter(errorModel0, "errorModel");
            return new Fail(errorModel0);
        }

        public static Fail copy$default(Fail apiResponse$Fail0, ErrorModel errorModel0, int v, Object object0) {
            if((v & 1) != 0) {
                errorModel0 = apiResponse$Fail0.errorModel;
            }
            return apiResponse$Fail0.copy(errorModel0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Fail ? Intrinsics.areEqual(this.errorModel, ((Fail)object0).errorModel) : false;
        }

        @NotNull
        public final ErrorModel getErrorModel() {
            return this.errorModel;
        }

        @Override
        public int hashCode() {
            return this.errorModel.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "Fail(errorModel=" + this.errorModel + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001A\u00028\u0000¢\u0006\u0002\u0010\u0004J\u000E\u0010\b\u001A\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001E\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001A\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000B\u001A\u00020\f2\b\u0010\r\u001A\u0004\u0018\u00010\u000EHÖ\u0003J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001A\u00020\u0012HÖ\u0001R\u0013\u0010\u0003\u001A\u00028\u0000¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/data/model/common/ApiResponse$Success;", "T", "Lcom/kakao/tistory/data/model/common/ApiResponse;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/kakao/tistory/data/model/common/ApiResponse$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Success extends ApiResponse {
        private final Object data;

        public Success(Object object0) {
            super(null);
            this.data = object0;
        }

        public final Object component1() {
            return this.data;
        }

        @NotNull
        public final Success copy(Object object0) {
            return new Success(object0);
        }

        public static Success copy$default(Success apiResponse$Success0, Object object0, int v, Object object1) {
            if((v & 1) != 0) {
                object0 = apiResponse$Success0.data;
            }
            return apiResponse$Success0.copy(object0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Success ? Intrinsics.areEqual(this.data, ((Success)object0).data) : false;
        }

        public final Object getData() {
            return this.data;
        }

        @Override
        public int hashCode() {
            return this.data == null ? 0 : this.data.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "Success(data=" + this.data + ")";
        }
    }

    private ApiResponse() {
    }

    public ApiResponse(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

