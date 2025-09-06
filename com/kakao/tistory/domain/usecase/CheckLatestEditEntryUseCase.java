package com.kakao.tistory.domain.usecase;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.domain.entity.autosave.EditEntryEntity;
import com.kakao.tistory.domain.entity.autosave.EntryKeyEntity;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.entity.entry.DraftItemResult;
import com.kakao.tistory.domain.entity.entry.EditableEntry;
import com.kakao.tistory.domain.repository.AutoSaveRepository.DefaultImpls;
import com.kakao.tistory.domain.repository.AutoSaveRepository;
import com.kakao.tistory.domain.repository.EntryRepository;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \u000E2\u00020\u0001:\u0002\u000E\u000FB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001E\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\n2\u0006\u0010\t\u001A\u00020\bH\u0086B¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/kakao/tistory/domain/usecase/CheckLatestEditEntryUseCase;", "", "Lcom/kakao/tistory/domain/repository/EntryRepository;", "entryRepository", "Lcom/kakao/tistory/domain/repository/AutoSaveRepository;", "autoSaveRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/EntryRepository;Lcom/kakao/tistory/domain/repository/AutoSaveRepository;)V", "", "blogName", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "com/kakao/tistory/domain/usecase/a", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CheckLatestEditEntryUseCase {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/domain/usecase/CheckLatestEditEntryUseCase$Companion;", "", "", "ENTRY_NOT_FOUND", "I", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final int ENTRY_NOT_FOUND = 404;
    public final EntryRepository a;
    public final AutoSaveRepository b;

    static {
        CheckLatestEditEntryUseCase.Companion = new Companion(null);
    }

    @Inject
    public CheckLatestEditEntryUseCase(@NotNull EntryRepository entryRepository0, @NotNull AutoSaveRepository autoSaveRepository0) {
        Intrinsics.checkNotNullParameter(entryRepository0, "entryRepository");
        Intrinsics.checkNotNullParameter(autoSaveRepository0, "autoSaveRepository");
        super();
        this.a = entryRepository0;
        this.b = autoSaveRepository0;
    }

    public final Object a(String s, long v, Long long0, Continuation continuation0) {
        b b0;
        if(continuation0 instanceof b) {
            b0 = (b)continuation0;
            int v1 = b0.d;
            if((v1 & 0x80000000) == 0) {
                b0 = new b(this, continuation0);
            }
            else {
                b0.d = v1 ^ 0x80000000;
            }
        }
        else {
            b0 = new b(this, continuation0);
        }
        Object object0 = b0.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(b0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                b0.a = long0;
                b0.d = 1;
                object0 = this.a.getDraft(s, v, b0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                long0 = b0.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Result)object0) instanceof Success) {
            Date date0 = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ssXXX", Locale.getDefault()).parse(((DraftItemResult)((Success)(((Result)object0))).getData()).getDraft().getUpdatedAt());
            long v2 = 0L;
            long v3 = date0 == null ? 0L : date0.getTime();
            if(long0 != null) {
                v2 = (long)long0;
            }
            return v2 >= v3 ? com.kakao.tistory.domain.usecase.a.c : com.kakao.tistory.domain.usecase.a.b;
        }
        return !(((Result)object0) instanceof Fail) || ((Fail)(((Result)object0))).getErrorModel().getCode() != 404 ? com.kakao.tistory.domain.usecase.a.c : com.kakao.tistory.domain.usecase.a.a;
    }

    public static final Object access$getLocalEntry(CheckLatestEditEntryUseCase checkLatestEditEntryUseCase0, String s, Long long0, Long long1, Continuation continuation0) {
        return checkLatestEditEntryUseCase0.b.getAutoSavedPost(s, long0, long1, continuation0);
    }

    public final Object b(String s, long v, Long long0, Continuation continuation0) {
        c c0;
        if(continuation0 instanceof c) {
            c0 = (c)continuation0;
            int v1 = c0.d;
            if((v1 & 0x80000000) == 0) {
                c0 = new c(this, continuation0);
            }
            else {
                c0.d = v1 ^ 0x80000000;
            }
        }
        else {
            c0 = new c(this, continuation0);
        }
        Object object0 = c0.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(c0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                c0.a = long0;
                c0.d = 1;
                object0 = this.a.getEditableEntry(s, v, c0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                long0 = c0.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Result)object0) instanceof Success) {
            return (long0 == null ? 0L : ((long)long0)) >= ((EditableEntry)((Success)(((Result)object0))).getData()).getModified() * 1000L ? com.kakao.tistory.domain.usecase.a.c : com.kakao.tistory.domain.usecase.a.b;
        }
        return !(((Result)object0) instanceof Fail) || ((Fail)(((Result)object0))).getErrorModel().getCode() != 404 ? com.kakao.tistory.domain.usecase.a.c : com.kakao.tistory.domain.usecase.a.a;
    }

    @Nullable
    public final Object invoke(@NotNull String s, @NotNull Continuation continuation0) {
        EditEntryEntity editEntryEntity0;
        EditEntryEntity editEntryEntity1;
        CheckLatestEditEntryUseCase checkLatestEditEntryUseCase1;
        String s2;
        EntryKeyEntity entryKeyEntity0;
        d d0;
        if(continuation0 instanceof d) {
            d0 = (d)continuation0;
            int v = d0.f;
            if((v & 0x80000000) == 0) {
                d0 = new d(this, continuation0);
            }
            else {
                d0.f = v ^ 0x80000000;
            }
        }
        else {
            d0 = new d(this, continuation0);
        }
        Object object0 = d0.d;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(d0.f) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                d0.a = this;
                d0.b = s;
                d0.f = 1;
                object0 = DefaultImpls.checkExistSavedPost$default(this.b, s, null, null, d0, 6, null);
                if(object0 == object1) {
                    return object1;
                }
                checkLatestEditEntryUseCase1 = this;
                break;
            }
            case 1: {
                s = d0.b;
                checkLatestEditEntryUseCase1 = (CheckLatestEditEntryUseCase)d0.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 2: {
                entryKeyEntity0 = d0.c;
                String s1 = d0.b;
                CheckLatestEditEntryUseCase checkLatestEditEntryUseCase0 = (CheckLatestEditEntryUseCase)d0.a;
                ResultKt.throwOnFailure(object0);
                s2 = s1;
                checkLatestEditEntryUseCase1 = checkLatestEditEntryUseCase0;
                goto label_50;
            }
            case 3: {
                editEntryEntity1 = (EditEntryEntity)d0.a;
                ResultKt.throwOnFailure(object0);
                return ((com.kakao.tistory.domain.usecase.a)object0) != com.kakao.tistory.domain.usecase.a.c ? new Fail(new ErrorModel()) : new Success(Boxing.boxLong(editEntryEntity1.getKey().getEntryId()));
            }
            case 4: {
                editEntryEntity0 = (EditEntryEntity)d0.a;
                ResultKt.throwOnFailure(object0);
                return ((com.kakao.tistory.domain.usecase.a)object0) != com.kakao.tistory.domain.usecase.a.c ? new Fail(new ErrorModel()) : new Success(Boxing.boxLong(editEntryEntity0.getKey().getEntryId()));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((EntryKeyEntity)object0) == null) {
            return new Fail(new ErrorModel());
        }
        d0.a = checkLatestEditEntryUseCase1;
        d0.b = s;
        d0.c = (EntryKeyEntity)object0;
        d0.f = 2;
        Object object2 = checkLatestEditEntryUseCase1.b.getAutoSavedPost(s, Boxing.boxLong(((EntryKeyEntity)object0).getEntryId()), ((EntryKeyEntity)object0).getDraftSequence(), d0);
        if(object2 == object1) {
            return object1;
        }
        s2 = s;
        entryKeyEntity0 = (EntryKeyEntity)object0;
        object0 = object2;
    label_50:
        if(((EditEntryEntity)object0) == null) {
            return new Fail(new ErrorModel());
        }
        if(Long.compare(entryKeyEntity0.getEntryId(), 0L) != 0) {
            d0.a = (EditEntryEntity)object0;
            d0.b = null;
            d0.c = null;
            d0.f = 3;
            Object object3 = checkLatestEditEntryUseCase1.b(s2, entryKeyEntity0.getEntryId(), ((EditEntryEntity)object0).getSetting().getUpdatedAt(), d0);
            if(object3 == object1) {
                return object1;
            }
            EditEntryEntity editEntryEntity2 = (EditEntryEntity)object0;
            object0 = object3;
            editEntryEntity1 = editEntryEntity2;
            return ((com.kakao.tistory.domain.usecase.a)object0) != com.kakao.tistory.domain.usecase.a.c ? new Fail(new ErrorModel()) : new Success(Boxing.boxLong(editEntryEntity1.getKey().getEntryId()));
        }
        if(entryKeyEntity0.getDraftSequence() != null) {
            Long long0 = entryKeyEntity0.getDraftSequence();
            if(long0 == null || ((long)long0) != 0L) {
                d0.a = (EditEntryEntity)object0;
                d0.b = null;
                d0.c = null;
                d0.f = 4;
                Object object4 = checkLatestEditEntryUseCase1.a(s2, ((long)entryKeyEntity0.getDraftSequence()), ((EditEntryEntity)object0).getSetting().getUpdatedAt(), d0);
                if(object4 == object1) {
                    return object1;
                }
                EditEntryEntity editEntryEntity3 = (EditEntryEntity)object0;
                object0 = object4;
                editEntryEntity0 = editEntryEntity3;
                return ((com.kakao.tistory.domain.usecase.a)object0) != com.kakao.tistory.domain.usecase.a.c ? new Fail(new ErrorModel()) : new Success(Boxing.boxLong(editEntryEntity0.getKey().getEntryId()));
            }
        }
        return new Success(Boxing.boxLong(((EditEntryEntity)object0).getKey().getEntryId()));
    }
}

