package com.kakao.tistory.domain.repository;

import androidx.lifecycle.MutableLiveData;
import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import com.kakao.tistory.domain.entity.entry.OpenGraphInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u00A8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000E\bf\u0018\u00002\u00020\u0001J\b\u0010\u0015\u001A\u00020\tH&J\u001A\u0010\u0016\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017H\u00A6@\u00A2\u0006\u0002\u0010\u001AJ$\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u001C0\u00172\u0006\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\u001F\u001A\u00020\fH\u00A6@\u00A2\u0006\u0002\u0010 J$\u0010!\u001A\b\u0012\u0004\u0012\u00020\t0\u00172\u0006\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\"\u001A\u00020\fH\u00A6@\u00A2\u0006\u0002\u0010 J$\u0010#\u001A\b\u0012\u0004\u0012\u00020\u00130\u00172\u0006\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\"\u001A\u00020\fH\u00A6@\u00A2\u0006\u0002\u0010 Jb\u0010$\u001A\b\u0012\u0004\u0012\u00020%0\u00172\u0006\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\u001F\u001A\u00020\f2\b\u0010&\u001A\u0004\u0018\u00010\u001E2\b\u0010\'\u001A\u0004\u0018\u00010\u001E2\u0010\b\u0002\u0010(\u001A\n\u0012\u0004\u0012\u00020\u001E\u0018\u00010\u00182\n\b\u0002\u0010)\u001A\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001A\u0004\u0018\u00010\u001EH\u00A6@\u00A2\u0006\u0002\u0010,J\u001C\u0010-\u001A\b\u0012\u0004\u0012\u00020.0\u00172\u0006\u0010\u001D\u001A\u00020\u001EH\u00A6@\u00A2\u0006\u0002\u0010/J(\u00100\u001A\n\u0012\u0006\u0012\u0004\u0018\u0001010\u00172\u0006\u0010\u001D\u001A\u00020\u001E2\b\u0010\"\u001A\u0004\u0018\u00010\fH\u00A6@\u00A2\u0006\u0002\u00102J$\u00103\u001A\b\u0012\u0004\u0012\u00020%0\u00172\u0006\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\u001F\u001A\u00020\fH\u00A6@\u00A2\u0006\u0002\u0010 J\u001C\u00104\u001A\b\u0012\u0004\u0012\u00020\u001C0\u00172\u0006\u0010\u001D\u001A\u00020\u001EH\u00A6@\u00A2\u0006\u0002\u0010/J(\u00105\u001A\b\u0012\u0004\u0012\u0002060\u00172\u0006\u0010\u001D\u001A\u00020\u001E2\n\b\u0002\u00107\u001A\u0004\u0018\u00010*H\u00A6@\u00A2\u0006\u0002\u00108J$\u00109\u001A\b\u0012\u0004\u0012\u00020:0\u00172\u0006\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\"\u001A\u00020\fH\u00A6@\u00A2\u0006\u0002\u0010 J.\u0010;\u001A\b\u0012\u0004\u0012\u00020\u00040\u00172\u0006\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\"\u001A\u00020\f2\b\u0010<\u001A\u0004\u0018\u00010\u001EH\u00A6@\u00A2\u0006\u0002\u0010=J.\u0010;\u001A\b\u0012\u0004\u0012\u00020\u00040\u00172\u0006\u0010\u001D\u001A\u00020\u001E2\u0006\u0010>\u001A\u00020\u001E2\b\u0010<\u001A\u0004\u0018\u00010\u001EH\u00A6@\u00A2\u0006\u0002\u0010?J\u0012\u0010@\u001A\u0004\u0018\u00010A2\u0006\u0010B\u001A\u00020\u001EH&J\u001C\u0010C\u001A\b\u0012\u0004\u0012\u00020D0\u00172\u0006\u0010\u001D\u001A\u00020\u001EH\u00A6@\u00A2\u0006\u0002\u0010/J\u00AC\u0001\u0010E\u001A\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010G0F0\u00172\u0006\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\"\u001A\u00020\f2\u0006\u0010&\u001A\u00020\u001E2\n\b\u0002\u0010)\u001A\u0004\u0018\u00010*2\u0006\u0010H\u001A\u00020I2\u0006\u0010\'\u001A\u00020\u001E2\n\b\u0002\u0010<\u001A\u0004\u0018\u00010\u001E2\n\b\u0002\u0010J\u001A\u0004\u0018\u00010\f2\u0006\u0010K\u001A\u00020*2\n\b\u0002\u0010+\u001A\u0004\u0018\u00010\u001E2\u0010\b\u0002\u0010(\u001A\n\u0012\u0004\u0012\u00020\u001E\u0018\u00010\u00182\n\b\u0002\u0010L\u001A\u0004\u0018\u00010*2\n\b\u0002\u0010M\u001A\u0004\u0018\u00010\u001EH\u00A6@\u00A2\u0006\u0002\u0010NJ,\u0010O\u001A\b\u0012\u0004\u0012\u00020P0\u00172\u0006\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\"\u001A\u00020\f2\u0006\u0010Q\u001A\u00020\u001EH\u00A6@\u00A2\u0006\u0002\u0010=J,\u0010O\u001A\b\u0012\u0004\u0012\u00020P0\u00172\u0006\u0010\u001D\u001A\u00020\u001E2\u0006\u0010>\u001A\u00020\u001E2\u0006\u0010Q\u001A\u00020\u001EH\u00A6@\u00A2\u0006\u0002\u0010?J.\u0010R\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010G0\u00172\u0006\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\"\u001A\u00020\f2\u0006\u0010M\u001A\u00020\u001EH\u00A6@\u00A2\u0006\u0002\u0010=J$\u0010S\u001A\b\u0012\u0004\u0012\u00020\u00130\u00172\u0006\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\"\u001A\u00020\fH\u00A6@\u00A2\u0006\u0002\u0010 JZ\u0010T\u001A\b\u0012\u0004\u0012\u00020%0\u00172\u0006\u0010\u001D\u001A\u00020\u001E2\b\u0010&\u001A\u0004\u0018\u00010\u001E2\b\u0010\'\u001A\u0004\u0018\u00010\u001E2\u0010\b\u0002\u0010(\u001A\n\u0012\u0004\u0012\u00020\u001E\u0018\u00010\u00182\n\b\u0002\u0010)\u001A\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001A\u0004\u0018\u00010\u001EH\u00A6@\u00A2\u0006\u0002\u0010UJ\u00AE\u0001\u0010V\u001A\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010G0F0\u00172\u0006\u0010\u001D\u001A\u00020\u001E2\b\u0010W\u001A\u0004\u0018\u00010\f2\u0006\u0010&\u001A\u00020\u001E2\n\b\u0002\u0010)\u001A\u0004\u0018\u00010*2\u0006\u0010H\u001A\u00020I2\u0006\u0010\'\u001A\u00020\u001E2\n\b\u0002\u0010<\u001A\u0004\u0018\u00010\u001E2\n\b\u0002\u0010J\u001A\u0004\u0018\u00010\f2\u0006\u0010K\u001A\u00020*2\n\b\u0002\u0010+\u001A\u0004\u0018\u00010\u001E2\u0010\b\u0002\u0010(\u001A\n\u0012\u0004\u0012\u00020\u001E\u0018\u00010\u00182\n\b\u0002\u0010L\u001A\u0004\u0018\u00010*2\n\b\u0002\u0010M\u001A\u0004\u0018\u00010\u001EH\u00A6@\u00A2\u0006\u0002\u0010XJ8\u0010Y\u001A\b\u0012\u0004\u0012\u00020\t0\u00172\u0006\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\"\u001A\u00020\f2\u0006\u0010Z\u001A\u00020\u001E2\n\b\u0002\u0010[\u001A\u0004\u0018\u00010\u001EH\u00A6@\u00A2\u0006\u0002\u0010\\J,\u0010]\u001A\b\u0012\u0004\u0012\u00020\u00040\u00172\u0006\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\"\u001A\u00020\f2\u0006\u0010H\u001A\u00020\u001EH\u00A6@\u00A2\u0006\u0002\u0010=R\u0018\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u001E\u0010\u0007\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\n\u0010\u0006R\u0018\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\f0\u0003X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\r\u0010\u0006R\u001E\u0010\u000E\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u0003X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u000F\u0010\u0006R\u001E\u0010\u0010\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0003X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0011\u0010\u0006R\u001E\u0010\u0012\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\b0\u0003X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0014\u0010\u0006\u00A8\u0006^"}, d2 = {"Lcom/kakao/tistory/domain/repository/EntryRepository;", "", "addedEntryItem", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "getAddedEntryItem", "()Landroidx/lifecycle/MutableLiveData;", "deletedEntryIds", "Landroid/util/LongSparseArray;", "", "getDeletedEntryIds", "reportedEntryId", "", "getReportedEntryId", "updatedCommentCounts", "getUpdatedCommentCounts", "updatedEntryItems", "getUpdatedEntryItems", "updatedLikeStates", "Lcom/kakao/tistory/domain/entity/entry/LikeState;", "getUpdatedLikeStates", "clearEntryChangedList", "daumLikeCategories", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "Lcom/kakao/tistory/domain/entity/entry/DaumLikeCategoryItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteDraft", "Lcom/kakao/tistory/domain/entity/common/Count;", "blogName", "", "sequence", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteEntry", "entryId", "deleteLikeIt", "editDraft", "Lcom/kakao/tistory/domain/entity/entry/DraftItemResult;", "title", "cdm", "tags", "category", "", "thumbnail", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategories", "Lcom/kakao/tistory/domain/entity/CategoryItemListModel;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChallengeRequirements", "Lcom/kakao/tistory/domain/entity/entry/ChallengeRequirements;", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDraft", "getDraftCount", "getDraftList", "Lcom/kakao/tistory/domain/entity/DraftListModel;", "page", "(Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEditableEntry", "Lcom/kakao/tistory/domain/entity/entry/EditableEntry;", "getEntry", "password", "(Ljava/lang/String;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "slogan", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOpenGraphWithAsync", "Lcom/kakao/tistory/domain/entity/entry/OpenGraphInfo;", "url", "getRecentTags", "Lcom/kakao/tistory/domain/entity/RecentTagItemListModel;", "modifyEntry", "Lkotlin/Pair;", "Lcom/kakao/tistory/domain/entity/entry/ChallengeResult;", "visibility", "Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;", "published", "acceptComment", "daumLike", "challengeCode", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ILjava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postCheckProtectedPassword", "Lcom/kakao/tistory/domain/entity/common/CheckModel;", "guestPassword", "postEntryChallenge", "postLikeIt", "postNewDraft", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postNewEntry", "draftSequence", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ILjava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postReportEntry", "reportCode", "reportMessage", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putEntryVisibility", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface EntryRepository {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object editDraft$default(EntryRepository entryRepository0, String s, long v, String s1, String s2, List list0, Integer integer0, String s3, Continuation continuation0, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: editDraft");
            }
            List list1 = (v1 & 16) == 0 ? list0 : null;
            Integer integer1 = (v1 & 0x20) == 0 ? integer0 : null;
            return (v1 & 0x40) == 0 ? entryRepository0.editDraft(s, v, s1, s2, list1, integer1, s3, continuation0) : entryRepository0.editDraft(s, v, s1, s2, list1, integer1, null, continuation0);
        }

        public static Object getDraftList$default(EntryRepository entryRepository0, String s, Integer integer0, Continuation continuation0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDraftList");
            }
            if((v & 2) != 0) {
                integer0 = null;
            }
            return entryRepository0.getDraftList(s, integer0, continuation0);
        }

        public static Object modifyEntry$default(EntryRepository entryRepository0, String s, long v, String s1, Integer integer0, EntryVisibilityType entryVisibilityType0, String s2, String s3, Long long0, int v1, String s4, List list0, Integer integer1, String s5, Continuation continuation0, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: modifyEntry");
            }
            Integer integer2 = (v2 & 8) == 0 ? integer0 : null;
            String s6 = (v2 & 0x40) == 0 ? s3 : null;
            Long long1 = (v2 & 0x80) == 0 ? long0 : null;
            String s7 = (v2 & 0x200) == 0 ? s4 : null;
            List list1 = (v2 & 0x400) == 0 ? list0 : null;
            Integer integer3 = (v2 & 0x800) == 0 ? integer1 : null;
            return (v2 & 0x1000) == 0 ? entryRepository0.modifyEntry(s, v, s1, integer2, entryVisibilityType0, s2, s6, long1, v1, s7, list1, integer3, s5, continuation0) : entryRepository0.modifyEntry(s, v, s1, integer2, entryVisibilityType0, s2, s6, long1, v1, s7, list1, integer3, null, continuation0);
        }

        public static Object postNewDraft$default(EntryRepository entryRepository0, String s, String s1, String s2, List list0, Integer integer0, String s3, Continuation continuation0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postNewDraft");
            }
            List list1 = (v & 8) == 0 ? list0 : null;
            Integer integer1 = (v & 16) == 0 ? integer0 : null;
            return (v & 0x20) == 0 ? entryRepository0.postNewDraft(s, s1, s2, list1, integer1, s3, continuation0) : entryRepository0.postNewDraft(s, s1, s2, list1, integer1, null, continuation0);
        }

        public static Object postNewEntry$default(EntryRepository entryRepository0, String s, Long long0, String s1, Integer integer0, EntryVisibilityType entryVisibilityType0, String s2, String s3, Long long1, int v, String s4, List list0, Integer integer1, String s5, Continuation continuation0, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postNewEntry");
            }
            Integer integer2 = (v1 & 8) == 0 ? integer0 : null;
            String s6 = (v1 & 0x40) == 0 ? s3 : null;
            Long long2 = (v1 & 0x80) == 0 ? long1 : null;
            String s7 = (v1 & 0x200) == 0 ? s4 : null;
            List list1 = (v1 & 0x400) == 0 ? list0 : null;
            Integer integer3 = (v1 & 0x800) == 0 ? integer1 : null;
            return (v1 & 0x1000) == 0 ? entryRepository0.postNewEntry(s, long0, s1, integer2, entryVisibilityType0, s2, s6, long2, v, s7, list1, integer3, s5, continuation0) : entryRepository0.postNewEntry(s, long0, s1, integer2, entryVisibilityType0, s2, s6, long2, v, s7, list1, integer3, null, continuation0);
        }

        public static Object postReportEntry$default(EntryRepository entryRepository0, String s, long v, String s1, String s2, Continuation continuation0, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postReportEntry");
            }
            if((v1 & 8) != 0) {
                s2 = null;
            }
            return entryRepository0.postReportEntry(s, v, s1, s2, continuation0);
        }
    }

    void clearEntryChangedList();

    @Nullable
    Object daumLikeCategories(@NotNull Continuation arg1);

    @Nullable
    Object deleteDraft(@NotNull String arg1, long arg2, @NotNull Continuation arg3);

    @Nullable
    Object deleteEntry(@NotNull String arg1, long arg2, @NotNull Continuation arg3);

    @Nullable
    Object deleteLikeIt(@NotNull String arg1, long arg2, @NotNull Continuation arg3);

    @Nullable
    Object editDraft(@NotNull String arg1, long arg2, @Nullable String arg3, @Nullable String arg4, @Nullable List arg5, @Nullable Integer arg6, @Nullable String arg7, @NotNull Continuation arg8);

    @NotNull
    MutableLiveData getAddedEntryItem();

    @Nullable
    Object getCategories(@NotNull String arg1, @NotNull Continuation arg2);

    @Nullable
    Object getChallengeRequirements(@NotNull String arg1, @Nullable Long arg2, @NotNull Continuation arg3);

    @NotNull
    MutableLiveData getDeletedEntryIds();

    @Nullable
    Object getDraft(@NotNull String arg1, long arg2, @NotNull Continuation arg3);

    @Nullable
    Object getDraftCount(@NotNull String arg1, @NotNull Continuation arg2);

    @Nullable
    Object getDraftList(@NotNull String arg1, @Nullable Integer arg2, @NotNull Continuation arg3);

    @Nullable
    Object getEditableEntry(@NotNull String arg1, long arg2, @NotNull Continuation arg3);

    @Nullable
    Object getEntry(@NotNull String arg1, long arg2, @Nullable String arg3, @NotNull Continuation arg4);

    @Nullable
    Object getEntry(@NotNull String arg1, @NotNull String arg2, @Nullable String arg3, @NotNull Continuation arg4);

    @Nullable
    OpenGraphInfo getOpenGraphWithAsync(@NotNull String arg1);

    @Nullable
    Object getRecentTags(@NotNull String arg1, @NotNull Continuation arg2);

    @NotNull
    MutableLiveData getReportedEntryId();

    @NotNull
    MutableLiveData getUpdatedCommentCounts();

    @NotNull
    MutableLiveData getUpdatedEntryItems();

    @NotNull
    MutableLiveData getUpdatedLikeStates();

    @Nullable
    Object modifyEntry(@NotNull String arg1, long arg2, @NotNull String arg3, @Nullable Integer arg4, @NotNull EntryVisibilityType arg5, @NotNull String arg6, @Nullable String arg7, @Nullable Long arg8, int arg9, @Nullable String arg10, @Nullable List arg11, @Nullable Integer arg12, @Nullable String arg13, @NotNull Continuation arg14);

    @Nullable
    Object postCheckProtectedPassword(@NotNull String arg1, long arg2, @NotNull String arg3, @NotNull Continuation arg4);

    @Nullable
    Object postCheckProtectedPassword(@NotNull String arg1, @NotNull String arg2, @NotNull String arg3, @NotNull Continuation arg4);

    @Nullable
    Object postEntryChallenge(@NotNull String arg1, long arg2, @NotNull String arg3, @NotNull Continuation arg4);

    @Nullable
    Object postLikeIt(@NotNull String arg1, long arg2, @NotNull Continuation arg3);

    @Nullable
    Object postNewDraft(@NotNull String arg1, @Nullable String arg2, @Nullable String arg3, @Nullable List arg4, @Nullable Integer arg5, @Nullable String arg6, @NotNull Continuation arg7);

    @Nullable
    Object postNewEntry(@NotNull String arg1, @Nullable Long arg2, @NotNull String arg3, @Nullable Integer arg4, @NotNull EntryVisibilityType arg5, @NotNull String arg6, @Nullable String arg7, @Nullable Long arg8, int arg9, @Nullable String arg10, @Nullable List arg11, @Nullable Integer arg12, @Nullable String arg13, @NotNull Continuation arg14);

    @Nullable
    Object postReportEntry(@NotNull String arg1, long arg2, @NotNull String arg3, @Nullable String arg4, @NotNull Continuation arg5);

    @Nullable
    Object putEntryVisibility(@NotNull String arg1, long arg2, @NotNull String arg3, @NotNull Continuation arg4);
}

