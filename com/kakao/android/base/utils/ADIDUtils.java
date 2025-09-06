package com.kakao.android.base.utils;

import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.kakao.android.base.BaseKt;
import i9.a;
import i9.b;
import java.io.IOException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001J%\u0010\u0006\u001A\u00020\u00042\u0016\b\u0002\u0010\u0005\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/kakao/android/base/utils/ADIDUtils;", "", "Lkotlin/Function1;", "Lcom/kakao/android/base/model/AdInfo;", "", "onSuccess", "requestAdInfo", "(Lkotlin/jvm/functions/Function1;)V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ADIDUtils {
    @NotNull
    public static final ADIDUtils INSTANCE;

    static {
        ADIDUtils.INSTANCE = new ADIDUtils();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static final Info access$getAdInfo(ADIDUtils aDIDUtils0) {
        aDIDUtils0.getClass();
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(BaseKt.getAppContext());
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

    public final void requestAdInfo(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "onSuccess");
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new b(function10, null), 3, null);
    }

    public static void requestAdInfo$default(ADIDUtils aDIDUtils0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = a.w;
        }
        aDIDUtils0.requestAdInfo(function10);
    }
}

