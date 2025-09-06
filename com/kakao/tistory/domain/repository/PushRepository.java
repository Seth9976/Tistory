package com.kakao.tistory.domain.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.kakao.tistory.domain.entity.PushSetting;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u000F\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00100\u000FH¦@¢\u0006\u0002\u0010\u0011J\u001C\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\u000F2\u0006\u0010\u0012\u001A\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014J\u001C\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00100\u000F2\u0006\u0010\u0012\u001A\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014Jh\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u000B0\u000F2\u0006\u0010\u0012\u001A\u00020\u00132\u0006\u0010\u0017\u001A\u00020\u00042\u0006\u0010\u0018\u001A\u00020\u00042\u0006\u0010\u0019\u001A\u00020\u00042\u0006\u0010\u001A\u001A\u00020\u00042\u0006\u0010\u001B\u001A\u00020\u00042\u0006\u0010\u001C\u001A\u00020\u00042\u0006\u0010\u001D\u001A\u00020\u00042\b\u0010\u001E\u001A\u0004\u0018\u00010\u00132\b\u0010\u001F\u001A\u0004\u0018\u00010\u0013H¦@¢\u0006\u0002\u0010 J\u0012\u0010!\u001A\u00020\u00102\b\u0010\t\u001A\u0004\u0018\u00010\u000BH&R\u0018\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u000B0\nX¦\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\r¨\u0006\""}, d2 = {"Lcom/kakao/tistory/domain/repository/PushRepository;", "", "etiquetteEnabled", "Landroidx/lifecycle/LiveData;", "", "getEtiquetteEnabled", "()Landroidx/lifecycle/LiveData;", "pushEnabled", "getPushEnabled", "pushSetting", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kakao/tistory/domain/entity/PushSetting;", "getPushSetting", "()Landroidx/lifecycle/MutableLiveData;", "deletePushToken", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "token", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postPushToken", "putPushSetting", "enable", "comment", "invite", "subscription", "newEntry", "challenge", "etiquette", "etiquetteStart", "etiquetteFinish", "(Ljava/lang/String;ZZZZZZZLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savePushSetting", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface PushRepository {
    @Nullable
    Object deletePushToken(@NotNull Continuation arg1);

    @NotNull
    LiveData getEtiquetteEnabled();

    @NotNull
    LiveData getPushEnabled();

    @NotNull
    MutableLiveData getPushSetting();

    @Nullable
    Object getPushSetting(@NotNull String arg1, @NotNull Continuation arg2);

    @Nullable
    Object postPushToken(@NotNull String arg1, @NotNull Continuation arg2);

    @Nullable
    Object putPushSetting(@NotNull String arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, @Nullable String arg9, @Nullable String arg10, @NotNull Continuation arg11);

    void savePushSetting(@Nullable PushSetting arg1);
}

