package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.TistoryDispatchers;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.AutoSaveRepository;
import com.kakao.tistory.domain.repository.SearchRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000EH\u0086B¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/kakao/tistory/domain/usecase/LeaveUseCase;", "", "Lcom/kakao/tistory/domain/usecase/DeletePushTokenUseCase;", "deletePushTokenUseCase", "Lcom/kakao/tistory/domain/usecase/GetCurrentBlogNameUseCase;", "getCurrentBlogNameUseCase", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "Lcom/kakao/tistory/domain/repository/AutoSaveRepository;", "autoSaveRepository", "Lcom/kakao/tistory/domain/repository/SearchRepository;", "searchRepository", "<init>", "(Lcom/kakao/tistory/domain/usecase/DeletePushTokenUseCase;Lcom/kakao/tistory/domain/usecase/GetCurrentBlogNameUseCase;Lcom/kakao/tistory/domain/repository/AccountRepository;Lcom/kakao/tistory/domain/repository/AutoSaveRepository;Lcom/kakao/tistory/domain/repository/SearchRepository;)V", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLeaveUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LeaveUseCase.kt\ncom/kakao/tistory/domain/usecase/LeaveUseCase\n+ 2 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt\n*L\n1#1,41:1\n15#2,5:42\n*S KotlinDebug\n*F\n+ 1 LeaveUseCase.kt\ncom/kakao/tistory/domain/usecase/LeaveUseCase\n*L\n29#1:42,5\n*E\n"})
public final class LeaveUseCase {
    public final DeletePushTokenUseCase a;
    public final GetCurrentBlogNameUseCase b;
    public final AccountRepository c;
    public final AutoSaveRepository d;
    public final SearchRepository e;

    @Inject
    public LeaveUseCase(@NotNull DeletePushTokenUseCase deletePushTokenUseCase0, @NotNull GetCurrentBlogNameUseCase getCurrentBlogNameUseCase0, @NotNull AccountRepository accountRepository0, @NotNull AutoSaveRepository autoSaveRepository0, @NotNull SearchRepository searchRepository0) {
        Intrinsics.checkNotNullParameter(deletePushTokenUseCase0, "deletePushTokenUseCase");
        Intrinsics.checkNotNullParameter(getCurrentBlogNameUseCase0, "getCurrentBlogNameUseCase");
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        Intrinsics.checkNotNullParameter(autoSaveRepository0, "autoSaveRepository");
        Intrinsics.checkNotNullParameter(searchRepository0, "searchRepository");
        super();
        this.a = deletePushTokenUseCase0;
        this.b = getCurrentBlogNameUseCase0;
        this.c = accountRepository0;
        this.d = autoSaveRepository0;
        this.e = searchRepository0;
    }

    @Nullable
    public final Object invoke(@NotNull Continuation continuation0) {
        LeaveUseCase leaveUseCase0;
        i i0;
        if(continuation0 instanceof i) {
            i0 = (i)continuation0;
            int v = i0.d;
            if((v & 0x80000000) == 0) {
                i0 = new i(this, continuation0);
            }
            else {
                i0.d = v ^ 0x80000000;
            }
        }
        else {
            i0 = new i(this, continuation0);
        }
        Object object0 = i0.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(i0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                i0.a = this;
                i0.d = 1;
                if(this.a.invoke(i0) == object1) {
                    return object1;
                }
                leaveUseCase0 = this;
                goto label_25;
            }
            case 1: {
                leaveUseCase0 = (LeaveUseCase)i0.a;
                ResultKt.throwOnFailure(object0);
            label_25:
                i0.a = leaveUseCase0;
                i0.d = 2;
                object0 = leaveUseCase0.c.leave(i0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                leaveUseCase0 = (LeaveUseCase)i0.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 3: {
                Object object2 = i0.a;
                ResultKt.throwOnFailure(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Result)object0) instanceof Success) {
            CoroutineDispatcher coroutineDispatcher0 = TistoryDispatchers.INSTANCE.getIO();
            j j0 = new j(leaveUseCase0, null);
            i0.a = object0;
            i0.d = 3;
            return BuildersKt.withContext(coroutineDispatcher0, j0, i0) == object1 ? object1 : object0;
        }
        return object0;
    }
}

