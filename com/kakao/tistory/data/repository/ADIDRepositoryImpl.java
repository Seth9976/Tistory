package com.kakao.tistory.data.repository;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.kakao.android.base.utils.Logger;
import com.kakao.tistory.domain.entity.AdInfo;
import com.kakao.tistory.domain.repository.ADIDRepository;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.io.IOException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR$\u0010\u0011\u001A\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/kakao/tistory/data/repository/ADIDRepositoryImpl;", "Lcom/kakao/tistory/data/repository/BaseRepository;", "Lcom/kakao/tistory/domain/repository/ADIDRepository;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "init", "()V", "Lcom/kakao/tistory/domain/entity/AdInfo;", "b", "Lcom/kakao/tistory/domain/entity/AdInfo;", "getAdInfo", "()Lcom/kakao/tistory/domain/entity/AdInfo;", "setAdInfo", "(Lcom/kakao/tistory/domain/entity/AdInfo;)V", "adInfo", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ADIDRepositoryImpl extends BaseRepository implements ADIDRepository {
    public final Context a;
    public AdInfo b;

    @Inject
    public ADIDRepositoryImpl(@ApplicationContext @NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super();
        this.a = context0;
        if(this.getAdInfo() == null) {
            this.init();
        }
    }

    public static final Info access$getAdInfo(ADIDRepositoryImpl aDIDRepositoryImpl0) {
        aDIDRepositoryImpl0.getClass();
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(aDIDRepositoryImpl0.a);
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            if(exception0 instanceof IOException) {
                Logger.INSTANCE.log("getAdInfo() : GooglePlayServices 연결이 실패하였습니다.");
                return null;
            }
            if(exception0 instanceof IllegalStateException) {
                Logger.INSTANCE.log("getAdInfo() : IllegalStateException");
                return null;
            }
            if(exception0 instanceof GooglePlayServicesRepairableException) {
                Logger.INSTANCE.log("getAdInfo() : 기기에 GooglePlay 가 설치되어있지 않습니다.");
                return null;
            }
            if(exception0 instanceof GooglePlayServicesNotAvailableException) {
                Logger.INSTANCE.log("getAdInfo() : GooglePlayServices 를 사용하다 에러가 발생하였습니다.");
            }
            return null;
        }
    }

    @Override  // com.kakao.tistory.domain.repository.ADIDRepository
    @Nullable
    public AdInfo getAdInfo() {
        return this.b;
    }

    @Override  // com.kakao.tistory.domain.repository.ADIDRepository
    public void init() {
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new a(this, null), 3, null);
    }

    @Override  // com.kakao.tistory.domain.repository.ADIDRepository
    public void setAdInfo(@Nullable AdInfo adInfo0) {
        this.b = adInfo0;
    }
}

