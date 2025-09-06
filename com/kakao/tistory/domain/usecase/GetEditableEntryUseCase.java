package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.entity.CategoryItem;
import com.kakao.tistory.domain.entity.autosave.EditEntryEntity;
import com.kakao.tistory.domain.entity.autosave.EntryEntity;
import com.kakao.tistory.domain.entity.autosave.EntryKeyEntity;
import com.kakao.tistory.domain.entity.autosave.EntrySettingEntity;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.entity.entry.DaumLikeItem;
import com.kakao.tistory.domain.entity.entry.EditableEntry;
import com.kakao.tistory.domain.repository.AutoSaveRepository.DefaultImpls;
import com.kakao.tistory.domain.repository.AutoSaveRepository;
import com.kakao.tistory.domain.repository.EntryRepository;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\nH\u0086B¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Lcom/kakao/tistory/domain/usecase/GetEditableEntryUseCase;", "", "Lcom/kakao/tistory/domain/repository/EntryRepository;", "entryRepository", "Lcom/kakao/tistory/domain/repository/AutoSaveRepository;", "autoSaveRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/EntryRepository;Lcom/kakao/tistory/domain/repository/AutoSaveRepository;)V", "", "blogName", "", "entryId", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/autosave/EditEntryEntity;", "invoke", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GetEditableEntryUseCase {
    public final EntryRepository a;
    public final AutoSaveRepository b;

    @Inject
    public GetEditableEntryUseCase(@NotNull EntryRepository entryRepository0, @NotNull AutoSaveRepository autoSaveRepository0) {
        Intrinsics.checkNotNullParameter(entryRepository0, "entryRepository");
        Intrinsics.checkNotNullParameter(autoSaveRepository0, "autoSaveRepository");
        super();
        this.a = entryRepository0;
        this.b = autoSaveRepository0;
    }

    public final Object a(String s, long v, Continuation continuation0) {
        f f0;
        if(continuation0 instanceof f) {
            f0 = (f)continuation0;
            int v1 = f0.e;
            if((v1 & 0x80000000) == 0) {
                f0 = new f(this, continuation0);
            }
            else {
                f0.e = v1 ^ 0x80000000;
            }
        }
        else {
            f0 = new f(this, continuation0);
        }
        Object object0 = f0.c;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(f0.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                f0.a = s;
                f0.b = v;
                f0.e = 1;
                object0 = this.a.getEditableEntry(s, v, f0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                long v2 = f0.b;
                String s1 = f0.a;
                ResultKt.throwOnFailure(object0);
                s = s1;
                v = v2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Result)object0) instanceof Success) {
            EditableEntry editableEntry0 = (EditableEntry)((Success)(((Result)object0))).getData();
            String s2 = null;
            EntryKeyEntity entryKeyEntity0 = new EntryKeyEntity(s, v, null);
            String s3 = editableEntry0.getCdm().toString();
            Intrinsics.checkNotNullExpressionValue(s3, "toString(...)");
            EntryEntity entryEntity0 = new EntryEntity(editableEntry0.getTitle(), s3, editableEntry0.getThumbnail());
            String s4 = editableEntry0.getVisibility().toString();
            List list0 = editableEntry0.getTags();
            int v3 = editableEntry0.getAcceptComment();
            CategoryItem categoryItem0 = editableEntry0.getCategory();
            Integer integer0 = categoryItem0 == null ? null : Boxing.boxInt(categoryItem0.getId());
            CategoryItem categoryItem1 = editableEntry0.getCategory();
            String s5 = categoryItem1 == null ? null : categoryItem1.getName();
            DaumLikeItem daumLikeItem0 = editableEntry0.getDaumLike();
            Integer integer1 = daumLikeItem0 == null ? null : Boxing.boxInt(daumLikeItem0.getId());
            DaumLikeItem daumLikeItem1 = editableEntry0.getDaumLike();
            if(daumLikeItem1 != null) {
                s2 = daumLikeItem1.getLabel();
            }
            return new Success(new EditEntryEntity(entryKeyEntity0, entryEntity0, new EntrySettingEntity(s4, list0, v3, null, null, integer0, s5, integer1, s2, editableEntry0.getPassword(), Boxing.boxLong(editableEntry0.getPublished()), Boxing.boxLong(editableEntry0.getModified())), false, 8, null));
        }
        if(!(((Result)object0) instanceof Fail)) {
            throw new NoWhenBranchMatchedException();
        }
        return (Result)object0;
    }

    public static final Object access$getLocalEntry(GetEditableEntryUseCase getEditableEntryUseCase0, String s, long v, Continuation continuation0) {
        return DefaultImpls.getAutoSavedPost$default(getEditableEntryUseCase0.b, s, Boxing.boxLong(v), null, continuation0, 4, null);
    }

    @Nullable
    public final Object invoke(@NotNull String s, long v, @NotNull Continuation continuation0) {
        EditEntryEntity editEntryEntity0;
        GetEditableEntryUseCase getEditableEntryUseCase0;
        Object object2;
        long v2;
        String s1;
        g g0;
        if(continuation0 instanceof g) {
            g0 = (g)continuation0;
            int v1 = g0.f;
            if((v1 & 0x80000000) == 0) {
                g0 = new g(this, continuation0);
            }
            else {
                g0.f = v1 ^ 0x80000000;
            }
        }
        else {
            g0 = new g(this, continuation0);
        }
        Object object0 = g0.d;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(g0.f) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                g0.a = this;
                s1 = s;
                g0.b = s1;
                v2 = v;
                g0.c = v2;
                g0.f = 1;
                object2 = DefaultImpls.getAutoSavedPost$default(this.b, s, Boxing.boxLong(v), null, g0, 4, null);
                if(object2 == object1) {
                    return object1;
                }
                getEditableEntryUseCase0 = this;
                goto label_32;
            }
            case 1: {
                long v3 = g0.c;
                String s2 = g0.b;
                getEditableEntryUseCase0 = (GetEditableEntryUseCase)g0.a;
                ResultKt.throwOnFailure(object0);
                v2 = v3;
                object2 = object0;
                s1 = s2;
            label_32:
                g0.a = (EditEntryEntity)object2;
                g0.b = null;
                g0.f = 2;
                object0 = getEditableEntryUseCase0.a(s1, v2, g0);
                if(object0 == object1) {
                    return object1;
                }
                editEntryEntity0 = (EditEntryEntity)object2;
                break;
            }
            case 2: {
                editEntryEntity0 = (EditEntryEntity)g0.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Result result0 = (Result)object0;
        if(editEntryEntity0 == null) {
            return result0;
        }
        if(result0 instanceof Success) {
            Long long0 = editEntryEntity0.getSetting().getUpdatedAt();
            long v4 = 0L;
            long v5 = long0 == null ? 0L : ((long)long0);
            result0 = (Success)result0;
            Long long1 = ((EditEntryEntity)((Success)result0).getData()).getSetting().getUpdatedAt();
            if(long1 != null) {
                v4 = (long)long1;
            }
            if(v5 < v4) {
                return result0;
            }
            editEntryEntity0.setFromLocal(true);
            return new Success(editEntryEntity0);
        }
        if(!(result0 instanceof Fail)) {
            throw new NoWhenBranchMatchedException();
        }
        return result0;
    }
}

