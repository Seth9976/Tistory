package com.kakao.tistory.data.repository;

import android.util.LongSparseArray;
import androidx.lifecycle.MutableLiveData;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.data.service.EntryService;
import com.kakao.tistory.domain.ErrorStatusKt;
import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import com.kakao.tistory.domain.entity.common.ItemModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.entry.ChallengeResult;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.domain.entity.entry.OpenGraphInfo;
import com.kakao.tistory.domain.repository.EntryRepository;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import retrofit2.Response;

@Metadata(d1 = {"\u0000\u00B8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\b\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\b\u0010\tJ0\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00100\u000F2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f2\b\u0010\u000E\u001A\u0004\u0018\u00010\nH\u0096@\u00A2\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00100\u000F2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0013\u001A\u00020\n2\b\u0010\u000E\u001A\u0004\u0018\u00010\nH\u0096@\u00A2\u0006\u0004\b\u0011\u0010\u0014J&\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00070\u000F2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\fH\u0096@\u00A2\u0006\u0004\b\u0015\u0010\u0016J8\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00070\u000F2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u0017\u001A\u00020\n2\b\u0010\u0018\u001A\u0004\u0018\u00010\nH\u0096@\u00A2\u0006\u0004\b\u0019\u0010\u001AJ.\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00100\u000F2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u001B\u001A\u00020\nH\u0096@\u00A2\u0006\u0004\b\u001C\u0010\u0012J.\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u001E0\u000F2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0013\u001A\u00020\n2\u0006\u0010\u001D\u001A\u00020\nH\u0096@\u00A2\u0006\u0004\b\u001F\u0010\u0014J.\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u001E0\u000F2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u001D\u001A\u00020\nH\u0096@\u00A2\u0006\u0004\b\u001F\u0010\u0012J\u00A2\u0001\u0010/\u001A\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010.0-0\u000F2\u0006\u0010\u000B\u001A\u00020\n2\b\u0010 \u001A\u0004\u0018\u00010\f2\u0006\u0010!\u001A\u00020\n2\b\u0010#\u001A\u0004\u0018\u00010\"2\u0006\u0010\u001B\u001A\u00020$2\u0006\u0010%\u001A\u00020\n2\b\u0010\u000E\u001A\u0004\u0018\u00010\n2\b\u0010&\u001A\u0004\u0018\u00010\f2\u0006\u0010\'\u001A\u00020\"2\b\u0010(\u001A\u0004\u0018\u00010\n2\u000E\u0010*\u001A\n\u0012\u0004\u0012\u00020\n\u0018\u00010)2\b\u0010+\u001A\u0004\u0018\u00010\"2\b\u0010,\u001A\u0004\u0018\u00010\nH\u0096@\u00A2\u0006\u0004\b/\u00100J\u00A0\u0001\u00101\u001A\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010.0-0\u000F2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010!\u001A\u00020\n2\b\u0010#\u001A\u0004\u0018\u00010\"2\u0006\u0010\u001B\u001A\u00020$2\u0006\u0010%\u001A\u00020\n2\b\u0010\u000E\u001A\u0004\u0018\u00010\n2\b\u0010&\u001A\u0004\u0018\u00010\f2\u0006\u0010\'\u001A\u00020\"2\b\u0010(\u001A\u0004\u0018\u00010\n2\u000E\u0010*\u001A\n\u0012\u0004\u0012\u00020\n\u0018\u00010)2\b\u0010+\u001A\u0004\u0018\u00010\"2\b\u0010,\u001A\u0004\u0018\u00010\nH\u0096@\u00A2\u0006\u0004\b1\u00102J&\u00104\u001A\b\u0012\u0004\u0012\u0002030\u000F2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\fH\u0096@\u00A2\u0006\u0004\b4\u0010\u0016J\u001E\u00106\u001A\b\u0012\u0004\u0012\u0002050\u000F2\u0006\u0010\u000B\u001A\u00020\nH\u0096@\u00A2\u0006\u0004\b6\u00107J\u001C\u00109\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002080)0\u000FH\u0096@\u00A2\u0006\u0004\b9\u0010:J\u001E\u0010<\u001A\b\u0012\u0004\u0012\u00020;0\u000F2\u0006\u0010\u000B\u001A\u00020\nH\u0096@\u00A2\u0006\u0004\b<\u00107J&\u0010>\u001A\b\u0012\u0004\u0012\u00020=0\u000F2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\fH\u0096@\u00A2\u0006\u0004\b>\u0010\u0016J&\u0010?\u001A\b\u0012\u0004\u0012\u00020=0\u000F2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\fH\u0096@\u00A2\u0006\u0004\b?\u0010\u0016J\u0019\u0010B\u001A\u0004\u0018\u00010A2\u0006\u0010@\u001A\u00020\nH\u0016\u00A2\u0006\u0004\bB\u0010CJV\u0010E\u001A\b\u0012\u0004\u0012\u00020D0\u000F2\u0006\u0010\u000B\u001A\u00020\n2\b\u0010!\u001A\u0004\u0018\u00010\n2\b\u0010%\u001A\u0004\u0018\u00010\n2\u000E\u0010*\u001A\n\u0012\u0004\u0012\u00020\n\u0018\u00010)2\b\u0010#\u001A\u0004\u0018\u00010\"2\b\u0010(\u001A\u0004\u0018\u00010\nH\u0096@\u00A2\u0006\u0004\bE\u0010FJ^\u0010H\u001A\b\u0012\u0004\u0012\u00020D0\u000F2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010G\u001A\u00020\f2\b\u0010!\u001A\u0004\u0018\u00010\n2\b\u0010%\u001A\u0004\u0018\u00010\n2\u000E\u0010*\u001A\n\u0012\u0004\u0012\u00020\n\u0018\u00010)2\b\u0010#\u001A\u0004\u0018\u00010\"2\b\u0010(\u001A\u0004\u0018\u00010\nH\u0096@\u00A2\u0006\u0004\bH\u0010IJ(\u0010L\u001A\b\u0012\u0004\u0012\u00020K0\u000F2\u0006\u0010\u000B\u001A\u00020\n2\b\u0010J\u001A\u0004\u0018\u00010\"H\u0096@\u00A2\u0006\u0004\bL\u0010MJ&\u0010O\u001A\b\u0012\u0004\u0012\u00020N0\u000F2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010G\u001A\u00020\fH\u0096@\u00A2\u0006\u0004\bO\u0010\u0016J&\u0010P\u001A\b\u0012\u0004\u0012\u00020D0\u000F2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010G\u001A\u00020\fH\u0096@\u00A2\u0006\u0004\bP\u0010\u0016J\u001E\u0010Q\u001A\b\u0012\u0004\u0012\u00020N0\u000F2\u0006\u0010\u000B\u001A\u00020\nH\u0096@\u00A2\u0006\u0004\bQ\u00107J*\u0010S\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010R0\u000F2\u0006\u0010\u000B\u001A\u00020\n2\b\u0010\r\u001A\u0004\u0018\u00010\fH\u0096@\u00A2\u0006\u0004\bS\u0010TJ0\u0010U\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u000F2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010,\u001A\u00020\nH\u0096@\u00A2\u0006\u0004\bU\u0010\u0012R&\u0010\\\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070W0V8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bX\u0010Y\u001A\u0004\bZ\u0010[R&\u0010_\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100W0V8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b]\u0010Y\u001A\u0004\b^\u0010[R&\u0010b\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0W0V8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b`\u0010Y\u001A\u0004\ba\u0010[R&\u0010e\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0W0V8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bc\u0010Y\u001A\u0004\bd\u0010[R \u0010h\u001A\b\u0012\u0004\u0012\u00020\u00100V8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bf\u0010Y\u001A\u0004\bg\u0010[R \u0010k\u001A\b\u0012\u0004\u0012\u00020\f0V8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bi\u0010Y\u001A\u0004\bj\u0010[\u00A8\u0006l"}, d2 = {"Lcom/kakao/tistory/data/repository/EntryRepositoryImpl;", "Lcom/kakao/tistory/data/repository/BaseRepository;", "Lcom/kakao/tistory/domain/repository/EntryRepository;", "Lcom/kakao/tistory/data/service/EntryService;", "entryService", "<init>", "(Lcom/kakao/tistory/data/service/EntryService;)V", "", "clearEntryChangedList", "()V", "", "blogName", "", "entryId", "password", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "getEntry", "(Ljava/lang/String;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "slogan", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteEntry", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportCode", "reportMessage", "postReportEntry", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "visibility", "putEntryVisibility", "guestPassword", "Lcom/kakao/tistory/domain/entity/common/CheckModel;", "postCheckProtectedPassword", "draftSequence", "title", "", "category", "Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;", "cdm", "published", "acceptComment", "thumbnail", "", "tags", "daumLike", "challengeCode", "Lkotlin/Pair;", "Lcom/kakao/tistory/domain/entity/entry/ChallengeResult;", "postNewEntry", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ILjava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "modifyEntry", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ILjava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/tistory/domain/entity/entry/EditableEntry;", "getEditableEntry", "Lcom/kakao/tistory/domain/entity/CategoryItemListModel;", "getCategories", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/tistory/domain/entity/entry/DaumLikeCategoryItem;", "daumLikeCategories", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/tistory/domain/entity/RecentTagItemListModel;", "getRecentTags", "Lcom/kakao/tistory/domain/entity/entry/LikeState;", "postLikeIt", "deleteLikeIt", "url", "Lcom/kakao/tistory/domain/entity/entry/OpenGraphInfo;", "getOpenGraphWithAsync", "(Ljava/lang/String;)Lcom/kakao/tistory/domain/entity/entry/OpenGraphInfo;", "Lcom/kakao/tistory/domain/entity/entry/DraftItemResult;", "postNewDraft", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sequence", "editDraft", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "page", "Lcom/kakao/tistory/domain/entity/DraftListModel;", "getDraftList", "(Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/tistory/domain/entity/common/Count;", "deleteDraft", "getDraft", "getDraftCount", "Lcom/kakao/tistory/domain/entity/entry/ChallengeRequirements;", "getChallengeRequirements", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postEntryChallenge", "Landroidx/lifecycle/MutableLiveData;", "Landroid/util/LongSparseArray;", "b", "Landroidx/lifecycle/MutableLiveData;", "getDeletedEntryIds", "()Landroidx/lifecycle/MutableLiveData;", "deletedEntryIds", "c", "getUpdatedEntryItems", "updatedEntryItems", "d", "getUpdatedLikeStates", "updatedLikeStates", "e", "getUpdatedCommentCounts", "updatedCommentCounts", "f", "getAddedEntryItem", "addedEntryItem", "g", "getReportedEntryId", "reportedEntryId", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEntryRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntryRepositoryImpl.kt\ncom/kakao/tistory/data/repository/EntryRepositoryImpl\n+ 2 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository\n+ 3 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository$checkError$2\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt\n+ 6 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt$process$2\n*L\n1#1,401:1\n26#2,27:402\n53#2:430\n26#2,27:431\n53#2:459\n35#2:460\n26#2,27:461\n53#2:489\n35#2:490\n26#2,27:492\n53#2:520\n35#2:521\n26#2,27:522\n53#2:550\n35#2:551\n26#2,27:552\n53#2:580\n35#2:581\n26#2,27:582\n53#2:610\n35#2:611\n26#2,27:612\n53#2:640\n35#2:641\n26#2,27:642\n53#2:670\n35#2:671\n26#2,27:672\n53#2:700\n35#2:701\n26#2,27:702\n53#2:730\n35#2:731\n26#2,27:732\n53#2:760\n35#2:761\n26#2,27:762\n53#2:790\n35#2:791\n26#2,27:792\n53#2:820\n35#2:821\n26#2,27:822\n53#2:850\n35#2:851\n26#2,27:861\n53#2:889\n35#2:890\n26#2,27:891\n53#2:919\n35#2:920\n26#2,27:921\n53#2:949\n35#2:950\n26#2,27:951\n53#2:979\n35#2:980\n26#2,27:981\n53#2:1009\n35#2:1010\n26#2,27:1011\n53#2:1039\n35#2:1040\n26#2,27:1041\n53#2:1069\n35#2:1070\n26#2,27:1071\n53#2:1099\n35#2:1100\n39#3:429\n39#3:458\n39#3:488\n39#3:519\n39#3:549\n39#3:579\n39#3:609\n39#3:639\n39#3:669\n39#3:699\n39#3:729\n39#3:759\n39#3:789\n39#3:819\n39#3:849\n39#3:888\n39#3:918\n39#3:948\n39#3:978\n39#3:1008\n39#3:1038\n39#3:1068\n39#3:1098\n1#4:491\n11#5,7:852\n19#5:860\n13#6:859\n*S KotlinDebug\n*F\n+ 1 EntryRepositoryImpl.kt\ncom/kakao/tistory/data/repository/EntryRepositoryImpl\n*L\n46#1:402,27\n46#1:430\n54#1:431,27\n54#1:459\n54#1:460\n61#1:461,27\n61#1:489\n61#1:490\n82#1:492,27\n82#1:520\n82#1:521\n105#1:522,27\n105#1:550\n105#1:551\n124#1:552,27\n124#1:580\n124#1:581\n142#1:582,27\n142#1:610\n142#1:611\n170#1:612,27\n170#1:640\n170#1:641\n221#1:642,27\n221#1:670\n221#1:671\n265#1:672,27\n265#1:700\n265#1:701\n269#1:702,27\n269#1:730\n269#1:731\n273#1:732,27\n273#1:760\n273#1:761\n277#1:762,27\n277#1:790\n277#1:791\n284#1:792,27\n284#1:820\n284#1:821\n305#1:822,27\n305#1:850\n305#1:851\n332#1:861,27\n332#1:889\n332#1:890\n353#1:891,27\n353#1:919\n353#1:920\n370#1:921,27\n370#1:949\n370#1:950\n377#1:951,27\n377#1:979\n377#1:980\n382#1:981,27\n382#1:1009\n382#1:1010\n387#1:1011,27\n387#1:1039\n387#1:1040\n391#1:1041,27\n391#1:1069\n391#1:1070\n399#1:1071,27\n399#1:1099\n399#1:1100\n46#1:429\n54#1:458\n61#1:488\n82#1:519\n105#1:549\n124#1:579\n142#1:609\n170#1:639\n221#1:669\n265#1:699\n269#1:729\n273#1:759\n277#1:789\n284#1:819\n305#1:849\n332#1:888\n353#1:918\n370#1:948\n377#1:978\n382#1:1008\n387#1:1038\n391#1:1068\n399#1:1098\n307#1:852,7\n307#1:860\n307#1:859\n*E\n"})
public final class EntryRepositoryImpl extends BaseRepository implements EntryRepository {
    public final EntryService a;
    public final MutableLiveData b;
    public final MutableLiveData c;
    public final MutableLiveData d;
    public final MutableLiveData e;
    public final MutableLiveData f;
    public final MutableLiveData g;

    @Inject
    public EntryRepositoryImpl(@NotNull EntryService entryService0) {
        Intrinsics.checkNotNullParameter(entryService0, "entryService");
        super();
        this.a = entryService0;
        this.b = new MutableLiveData();
        this.c = new MutableLiveData();
        this.d = new MutableLiveData();
        this.e = new MutableLiveData();
        this.f = new MutableLiveData();
        this.g = new MutableLiveData();
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    public void clearEntryChangedList() {
        this.getAddedEntryItem().setValue(null);
        LongSparseArray longSparseArray0 = (LongSparseArray)this.getDeletedEntryIds().getValue();
        if(longSparseArray0 != null) {
            longSparseArray0.clear();
        }
        LongSparseArray longSparseArray1 = (LongSparseArray)this.getUpdatedEntryItems().getValue();
        if(longSparseArray1 != null) {
            longSparseArray1.clear();
        }
        LongSparseArray longSparseArray2 = (LongSparseArray)this.getUpdatedLikeStates().getValue();
        if(longSparseArray2 != null) {
            longSparseArray2.clear();
        }
        LongSparseArray longSparseArray3 = (LongSparseArray)this.getUpdatedCommentCounts().getValue();
        if(longSparseArray3 != null) {
            longSparseArray3.clear();
        }
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @Nullable
    public Object daumLikeCategories(@NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        q0 q00;
        if(continuation0 instanceof q0) {
            q00 = (q0)continuation0;
            int v = q00.d;
            if((v & 0x80000000) == 0) {
                q00 = new q0(this, continuation0);
            }
            else {
                q00.d = v ^ 0x80000000;
            }
        }
        else {
            q00 = new q0(this, continuation0);
        }
        Object object0 = q00.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(q00.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    q00.a = this;
                    q00.d = 1;
                    object0 = this.a.getDaumLikeCategories(q00);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    q00.a = baseRepository1;
                    q00.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, q00) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository1 = this;
                break;
            }
            case 1: {
                baseRepository1 = (BaseRepository)q00.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    q00.a = baseRepository1;
                    q00.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, q00) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)q00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)q00.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)q00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(((ItemModel)object0).getData());
        }
        catch(CancellationException cancellationException0) {
            q00.a = baseRepository1;
            q00.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, q00) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        q00.a = baseRepository1;
        q00.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, q00);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            q00.a = (ErrorModel)object0;
            q00.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), q00) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            q00.a = (ErrorModel)object0;
            q00.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), q00) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @Nullable
    public Object deleteDraft(@NotNull String s, long v, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        r0 r00;
        if(continuation0 instanceof r0) {
            r00 = (r0)continuation0;
            int v1 = r00.d;
            if((v1 & 0x80000000) == 0) {
                r00 = new r0(this, continuation0);
            }
            else {
                r00.d = v1 ^ 0x80000000;
            }
        }
        else {
            r00 = new r0(this, continuation0);
        }
        Object object0 = r00.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(r00.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    r00.a = this;
                    r00.d = 1;
                    object0 = this.a.deleteDraft(s, v, r00);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    r00.a = baseRepository0;
                    r00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, r00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository0 = this;
                break;
            }
            case 1: {
                baseRepository0 = (BaseRepository)r00.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    r00.a = baseRepository0;
                    r00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, r00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)r00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)r00.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)r00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(object0);
        }
        catch(CancellationException cancellationException0) {
            r00.a = baseRepository0;
            r00.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, r00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        r00.a = baseRepository0;
        r00.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, r00);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            r00.a = (ErrorModel)object0;
            r00.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), r00) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            r00.a = (ErrorModel)object0;
            r00.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), r00) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @Nullable
    public Object deleteEntry(@NotNull String s, long v, @NotNull Continuation continuation0) {
        Object object2;
        BaseRepository baseRepository0;
        ErrorModel errorModel0;
        long v2;
        BaseRepository baseRepository2;
        BaseRepository baseRepository1;
        BaseRepository baseRepository3;
        BaseRepository baseRepository4;
        s0 s00;
        if(continuation0 instanceof s0) {
            s00 = (s0)continuation0;
            int v1 = s00.f;
            if((v1 & 0x80000000) == 0) {
                s00 = new s0(this, continuation0);
            }
            else {
                s00.f = v1 ^ 0x80000000;
            }
        }
        else {
            s00 = new s0(this, continuation0);
        }
        Object object0 = s00.d;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(s00.f) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    s00.a = this;
                    s00.b = this;
                    s00.c = v;
                    s00.f = 1;
                    if(this.a.deleteEntry(s, v, s00) == object1) {
                        return object1;
                    }
                    baseRepository4 = this;
                    baseRepository2 = baseRepository4;
                    break;
                }
                catch(CancellationException cancellationException1) {
                    cancellationException0 = cancellationException1;
                    baseRepository4 = this;
                    baseRepository2 = baseRepository4;
                    goto label_56;
                }
                catch(Throwable throwable1) {
                    throwable0 = throwable1;
                    baseRepository4 = this;
                    baseRepository2 = baseRepository4;
                    goto label_68;
                }
                return object1;
            }
            case 1: {
                v = s00.c;
                baseRepository4 = (BaseRepository)s00.b;
                baseRepository2 = s00.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    goto label_56;
                }
                catch(Throwable throwable0) {
                    goto label_68;
                }
            }
            case 2: {
                v2 = s00.c;
                baseRepository3 = (BaseRepository)s00.b;
                baseRepository0 = s00.a;
                ResultKt.throwOnFailure(object0);
                object2 = new Fail(baseRepository3.createCoroutineCancelErrorModel());
                goto label_96;
            }
            case 3: {
                v2 = s00.c;
                baseRepository1 = (BaseRepository)s00.b;
                baseRepository2 = s00.a;
                ResultKt.throwOnFailure(object0);
                goto label_77;
            }
            case 4: 
            case 5: {
                v2 = s00.c;
                errorModel0 = (ErrorModel)s00.b;
                baseRepository0 = s00.a;
                ResultKt.throwOnFailure(object0);
                goto label_95;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            object2 = new Success(Unit.INSTANCE);
            goto label_98;
        }
        catch(CancellationException cancellationException0) {
        label_56:
            s00.a = baseRepository2;
            s00.b = baseRepository4;
            s00.c = v;
            s00.f = 2;
            if(baseRepository4.sendError("coroutine cancel", cancellationException0, s00) == object1) {
                return object1;
            }
            baseRepository0 = baseRepository2;
            baseRepository3 = baseRepository4;
            v2 = v;
            object2 = new Fail(baseRepository3.createCoroutineCancelErrorModel());
            goto label_96;
        }
        catch(Throwable throwable0) {
        }
    label_68:
        s00.a = baseRepository2;
        s00.b = baseRepository4;
        s00.c = v;
        s00.f = 3;
        object0 = baseRepository4.createErrorModel(throwable0, s00);
        if(object0 == object1) {
            return object1;
        }
        baseRepository1 = baseRepository4;
        v2 = v;
    label_77:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            s00.a = baseRepository2;
            s00.b = (ErrorModel)object0;
            s00.c = v2;
            s00.f = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), s00) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            s00.a = baseRepository2;
            s00.b = (ErrorModel)object0;
            s00.c = v2;
            s00.f = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), s00) == object1) {
                return object1;
            }
        }
        errorModel0 = (ErrorModel)object0;
        baseRepository0 = baseRepository2;
    label_95:
        object2 = new Fail(errorModel0);
    label_96:
        v = v2;
        baseRepository2 = baseRepository0;
    label_98:
        if(object2 instanceof Success) {
            MutableLiveData mutableLiveData0 = ((EntryRepositoryImpl)baseRepository2).getDeletedEntryIds();
            LongSparseArray longSparseArray0 = (LongSparseArray)((EntryRepositoryImpl)baseRepository2).getDeletedEntryIds().getValue();
            if(longSparseArray0 == null) {
                longSparseArray0 = new LongSparseArray();
            }
            longSparseArray0.put(v, Unit.INSTANCE);
            mutableLiveData0.setValue(longSparseArray0);
        }
        return object2;
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @Nullable
    public Object deleteLikeIt(@NotNull String s, long v, @NotNull Continuation continuation0) {
        Object object2;
        BaseRepository baseRepository0;
        ErrorModel errorModel0;
        long v2;
        BaseRepository baseRepository2;
        BaseRepository baseRepository1;
        BaseRepository baseRepository3;
        BaseRepository baseRepository4;
        t0 t00;
        if(continuation0 instanceof t0) {
            t00 = (t0)continuation0;
            int v1 = t00.f;
            if((v1 & 0x80000000) == 0) {
                t00 = new t0(this, continuation0);
            }
            else {
                t00.f = v1 ^ 0x80000000;
            }
        }
        else {
            t00 = new t0(this, continuation0);
        }
        Object object0 = t00.d;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(t00.f) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    t00.a = this;
                    t00.b = this;
                    t00.c = v;
                    t00.f = 1;
                    object0 = this.a.deleteLikeIt(s, v, t00);
                }
                catch(CancellationException cancellationException1) {
                    cancellationException0 = cancellationException1;
                    baseRepository4 = this;
                    baseRepository2 = baseRepository4;
                    goto label_57;
                }
                catch(Throwable throwable1) {
                    throwable0 = throwable1;
                    baseRepository4 = this;
                    baseRepository2 = baseRepository4;
                    goto label_69;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository4 = this;
                baseRepository2 = baseRepository4;
                break;
            }
            case 1: {
                v = t00.c;
                baseRepository4 = (BaseRepository)t00.b;
                baseRepository2 = t00.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    goto label_57;
                }
                catch(Throwable throwable0) {
                    goto label_69;
                }
            }
            case 2: {
                v2 = t00.c;
                baseRepository3 = (BaseRepository)t00.b;
                baseRepository0 = t00.a;
                ResultKt.throwOnFailure(object0);
                object2 = new Fail(baseRepository3.createCoroutineCancelErrorModel());
                goto label_97;
            }
            case 3: {
                v2 = t00.c;
                baseRepository1 = (BaseRepository)t00.b;
                baseRepository2 = t00.a;
                ResultKt.throwOnFailure(object0);
                goto label_78;
            }
            case 4: 
            case 5: {
                v2 = t00.c;
                errorModel0 = (ErrorModel)t00.b;
                baseRepository0 = t00.a;
                ResultKt.throwOnFailure(object0);
                goto label_96;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            object2 = new Success(object0);
            goto label_99;
        }
        catch(CancellationException cancellationException0) {
        label_57:
            t00.a = baseRepository2;
            t00.b = baseRepository4;
            t00.c = v;
            t00.f = 2;
            if(baseRepository4.sendError("coroutine cancel", cancellationException0, t00) == object1) {
                return object1;
            }
            baseRepository0 = baseRepository2;
            baseRepository3 = baseRepository4;
            v2 = v;
            object2 = new Fail(baseRepository3.createCoroutineCancelErrorModel());
            goto label_97;
        }
        catch(Throwable throwable0) {
        }
    label_69:
        t00.a = baseRepository2;
        t00.b = baseRepository4;
        t00.c = v;
        t00.f = 3;
        object0 = baseRepository4.createErrorModel(throwable0, t00);
        if(object0 == object1) {
            return object1;
        }
        baseRepository1 = baseRepository4;
        v2 = v;
    label_78:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            t00.a = baseRepository2;
            t00.b = (ErrorModel)object0;
            t00.c = v2;
            t00.f = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), t00) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            t00.a = baseRepository2;
            t00.b = (ErrorModel)object0;
            t00.c = v2;
            t00.f = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), t00) == object1) {
                return object1;
            }
        }
        errorModel0 = (ErrorModel)object0;
        baseRepository0 = baseRepository2;
    label_96:
        object2 = new Fail(errorModel0);
    label_97:
        v = v2;
        baseRepository2 = baseRepository0;
    label_99:
        if(object2 instanceof Success) {
            MutableLiveData mutableLiveData0 = ((EntryRepositoryImpl)baseRepository2).getUpdatedLikeStates();
            LongSparseArray longSparseArray0 = (LongSparseArray)((EntryRepositoryImpl)baseRepository2).getUpdatedLikeStates().getValue();
            if(longSparseArray0 == null) {
                longSparseArray0 = new LongSparseArray();
            }
            longSparseArray0.put(v, ((Success)object2).getData());
            mutableLiveData0.setValue(longSparseArray0);
        }
        return object2;
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @Nullable
    public Object editDraft(@NotNull String s, long v, @Nullable String s1, @Nullable String s2, @Nullable List list0, @Nullable Integer integer0, @Nullable String s3, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        u0 u00;
        if(continuation0 instanceof u0) {
            u00 = (u0)continuation0;
            int v1 = u00.d;
            if((v1 & 0x80000000) == 0) {
                u00 = new u0(this, continuation0);
            }
            else {
                u00.d = v1 ^ 0x80000000;
            }
        }
        else {
            u00 = new u0(this, continuation0);
        }
        Object object0 = u00.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(u00.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    u00.a = this;
                    u00.d = 1;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    u00.a = baseRepository1;
                    u00.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, u00) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                try {
                    object0 = this.a.postEditDraft(s, v, s1, s2, list0, integer0, s3, u00);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    u00.a = baseRepository1;
                    u00.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, u00) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository1 = this;
                break;
            }
            case 1: {
                baseRepository1 = (BaseRepository)u00.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    u00.a = baseRepository1;
                    u00.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, u00) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)u00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)u00.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)u00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(object0);
        }
        catch(CancellationException cancellationException0) {
            u00.a = baseRepository1;
            u00.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, u00) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        u00.a = baseRepository1;
        u00.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, u00);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            u00.a = (ErrorModel)object0;
            u00.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), u00) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            u00.a = (ErrorModel)object0;
            u00.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), u00) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @NotNull
    public MutableLiveData getAddedEntryItem() {
        return this.f;
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @Nullable
    public Object getCategories(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        v0 v00;
        if(continuation0 instanceof v0) {
            v00 = (v0)continuation0;
            int v = v00.d;
            if((v & 0x80000000) == 0) {
                v00 = new v0(this, continuation0);
            }
            else {
                v00.d = v ^ 0x80000000;
            }
        }
        else {
            v00 = new v0(this, continuation0);
        }
        Object object0 = v00.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(v00.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    v00.a = this;
                    v00.d = 1;
                    object0 = this.a.getCategories(s, v00);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    v00.a = baseRepository0;
                    v00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, v00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository0 = this;
                break;
            }
            case 1: {
                baseRepository0 = (BaseRepository)v00.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    v00.a = baseRepository0;
                    v00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, v00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)v00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)v00.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)v00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(object0);
        }
        catch(CancellationException cancellationException0) {
            v00.a = baseRepository0;
            v00.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, v00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        v00.a = baseRepository0;
        v00.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, v00);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            v00.a = (ErrorModel)object0;
            v00.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), v00) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            v00.a = (ErrorModel)object0;
            v00.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), v00) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @Nullable
    public Object getChallengeRequirements(@NotNull String s, @Nullable Long long0, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        w0 w00;
        if(continuation0 instanceof w0) {
            w00 = (w0)continuation0;
            int v = w00.d;
            if((v & 0x80000000) == 0) {
                w00 = new w0(this, continuation0);
            }
            else {
                w00.d = v ^ 0x80000000;
            }
        }
        else {
            w00 = new w0(this, continuation0);
        }
        Object object0 = w00.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(w00.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    EntryService entryService0 = this.a;
                    if(long0 == null || long0.longValue() <= 0L) {
                        long0 = null;
                    }
                    w00.a = this;
                    w00.d = 1;
                    object0 = entryService0.getChallengeRequirements(s, long0, w00);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    w00.a = baseRepository0;
                    w00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, w00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_50;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository0 = this;
                break;
            }
            case 1: {
                baseRepository0 = (BaseRepository)w00.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    w00.a = baseRepository0;
                    w00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, w00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_50;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)w00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)w00.a;
                ResultKt.throwOnFailure(object0);
                goto label_55;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)w00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(((ItemModel)object0).getData());
        }
        catch(CancellationException cancellationException0) {
            w00.a = baseRepository0;
            w00.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, w00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_50:
        w00.a = baseRepository0;
        w00.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, w00);
        if(object0 == object1) {
            return object1;
        }
    label_55:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            w00.a = (ErrorModel)object0;
            w00.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), w00) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            w00.a = (ErrorModel)object0;
            w00.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), w00) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @NotNull
    public MutableLiveData getDeletedEntryIds() {
        return this.b;
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @Nullable
    public Object getDraft(@NotNull String s, long v, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        x0 x00;
        if(continuation0 instanceof x0) {
            x00 = (x0)continuation0;
            int v1 = x00.d;
            if((v1 & 0x80000000) == 0) {
                x00 = new x0(this, continuation0);
            }
            else {
                x00.d = v1 ^ 0x80000000;
            }
        }
        else {
            x00 = new x0(this, continuation0);
        }
        Object object0 = x00.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(x00.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    x00.a = this;
                    x00.d = 1;
                    object0 = this.a.getDraft(s, v, x00);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    x00.a = baseRepository0;
                    x00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, x00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository0 = this;
                break;
            }
            case 1: {
                baseRepository0 = (BaseRepository)x00.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    x00.a = baseRepository0;
                    x00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, x00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)x00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)x00.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)x00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(object0);
        }
        catch(CancellationException cancellationException0) {
            x00.a = baseRepository0;
            x00.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, x00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        x00.a = baseRepository0;
        x00.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, x00);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            x00.a = (ErrorModel)object0;
            x00.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), x00) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            x00.a = (ErrorModel)object0;
            x00.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), x00) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @Nullable
    public Object getDraftCount(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        y0 y00;
        if(continuation0 instanceof y0) {
            y00 = (y0)continuation0;
            int v = y00.d;
            if((v & 0x80000000) == 0) {
                y00 = new y0(this, continuation0);
            }
            else {
                y00.d = v ^ 0x80000000;
            }
        }
        else {
            y00 = new y0(this, continuation0);
        }
        Object object0 = y00.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(y00.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    y00.a = this;
                    y00.d = 1;
                    object0 = this.a.getDraftCount(s, y00);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    y00.a = baseRepository0;
                    y00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, y00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository0 = this;
                break;
            }
            case 1: {
                baseRepository0 = (BaseRepository)y00.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    y00.a = baseRepository0;
                    y00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, y00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)y00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)y00.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)y00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(object0);
        }
        catch(CancellationException cancellationException0) {
            y00.a = baseRepository0;
            y00.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, y00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        y00.a = baseRepository0;
        y00.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, y00);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            y00.a = (ErrorModel)object0;
            y00.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), y00) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            y00.a = (ErrorModel)object0;
            y00.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), y00) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @Nullable
    public Object getDraftList(@NotNull String s, @Nullable Integer integer0, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        z0 z00;
        if(continuation0 instanceof z0) {
            z00 = (z0)continuation0;
            int v = z00.d;
            if((v & 0x80000000) == 0) {
                z00 = new z0(this, continuation0);
            }
            else {
                z00.d = v ^ 0x80000000;
            }
        }
        else {
            z00 = new z0(this, continuation0);
        }
        Object object0 = z00.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(z00.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    z00.a = this;
                    z00.d = 1;
                    object0 = this.a.getDraftList(s, integer0, z00);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    z00.a = baseRepository0;
                    z00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, z00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository0 = this;
                break;
            }
            case 1: {
                baseRepository0 = (BaseRepository)z00.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    z00.a = baseRepository0;
                    z00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, z00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)z00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)z00.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)z00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(object0);
        }
        catch(CancellationException cancellationException0) {
            z00.a = baseRepository0;
            z00.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, z00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        z00.a = baseRepository0;
        z00.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, z00);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            z00.a = (ErrorModel)object0;
            z00.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), z00) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            z00.a = (ErrorModel)object0;
            z00.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), z00) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @Nullable
    public Object getEditableEntry(@NotNull String s, long v, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        a1 a10;
        if(continuation0 instanceof a1) {
            a10 = (a1)continuation0;
            int v1 = a10.d;
            if((v1 & 0x80000000) == 0) {
                a10 = new a1(this, continuation0);
            }
            else {
                a10.d = v1 ^ 0x80000000;
            }
        }
        else {
            a10 = new a1(this, continuation0);
        }
        Object object0 = a10.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(a10.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    a10.a = this;
                    a10.d = 1;
                    object0 = this.a.getEditableEntry(s, v, a10);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    a10.a = baseRepository0;
                    a10.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, a10) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository0 = this;
                break;
            }
            case 1: {
                baseRepository0 = (BaseRepository)a10.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    a10.a = baseRepository0;
                    a10.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, a10) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)a10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)a10.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)a10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(object0);
        }
        catch(CancellationException cancellationException0) {
            a10.a = baseRepository0;
            a10.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, a10) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        a10.a = baseRepository0;
        a10.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, a10);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            a10.a = (ErrorModel)object0;
            a10.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), a10) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            a10.a = (ErrorModel)object0;
            a10.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), a10) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @Nullable
    public Object getEntry(@NotNull String s, long v, @Nullable String s1, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        b1 b10;
        if(continuation0 instanceof b1) {
            b10 = (b1)continuation0;
            int v1 = b10.d;
            if((v1 & 0x80000000) == 0) {
                b10 = new b1(this, continuation0);
            }
            else {
                b10.d = v1 ^ 0x80000000;
            }
        }
        else {
            b10 = new b1(this, continuation0);
        }
        Object object0 = b10.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(b10.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    b10.a = this;
                    b10.d = 1;
                    object0 = this.a.getEntry(s, v, s1, b10);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    b10.a = baseRepository1;
                    b10.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, b10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository1 = this;
                break;
            }
            case 1: {
                baseRepository1 = (BaseRepository)b10.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    b10.a = baseRepository1;
                    b10.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, b10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)b10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)b10.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)b10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(object0);
        }
        catch(CancellationException cancellationException0) {
            b10.a = baseRepository1;
            b10.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, b10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        b10.a = baseRepository1;
        b10.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, b10);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            b10.a = (ErrorModel)object0;
            b10.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), b10) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            b10.a = (ErrorModel)object0;
            b10.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), b10) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @Nullable
    public Object getEntry(@NotNull String s, @NotNull String s1, @Nullable String s2, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        c1 c10;
        if(continuation0 instanceof c1) {
            c10 = (c1)continuation0;
            int v = c10.d;
            if((v & 0x80000000) == 0) {
                c10 = new c1(this, continuation0);
            }
            else {
                c10.d = v ^ 0x80000000;
            }
        }
        else {
            c10 = new c1(this, continuation0);
        }
        Object object0 = c10.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(c10.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    c10.a = this;
                    c10.d = 1;
                    object0 = this.a.getEntry(s, s1, s2, c10);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    c10.a = baseRepository0;
                    c10.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, c10) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository0 = this;
                break;
            }
            case 1: {
                baseRepository0 = (BaseRepository)c10.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    c10.a = baseRepository0;
                    c10.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, c10) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)c10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)c10.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)c10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(object0);
        }
        catch(CancellationException cancellationException0) {
            c10.a = baseRepository0;
            c10.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, c10) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        c10.a = baseRepository0;
        c10.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, c10);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            c10.a = (ErrorModel)object0;
            c10.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), c10) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            c10.a = (ErrorModel)object0;
            c10.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), c10) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @Nullable
    public OpenGraphInfo getOpenGraphWithAsync(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "url");
        Response response0 = this.a.getOpenGraph(s).execute();
        return response0.code() == 200 ? ((OpenGraphInfo)response0.body()) : null;
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @Nullable
    public Object getRecentTags(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        d1 d10;
        if(continuation0 instanceof d1) {
            d10 = (d1)continuation0;
            int v = d10.d;
            if((v & 0x80000000) == 0) {
                d10 = new d1(this, continuation0);
            }
            else {
                d10.d = v ^ 0x80000000;
            }
        }
        else {
            d10 = new d1(this, continuation0);
        }
        Object object0 = d10.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(d10.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    d10.a = this;
                    d10.d = 1;
                    object0 = this.a.getRecentTags(s, d10);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    d10.a = baseRepository0;
                    d10.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, d10) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository0 = this;
                break;
            }
            case 1: {
                baseRepository0 = (BaseRepository)d10.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    d10.a = baseRepository0;
                    d10.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, d10) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)d10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)d10.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)d10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(object0);
        }
        catch(CancellationException cancellationException0) {
            d10.a = baseRepository0;
            d10.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, d10) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        d10.a = baseRepository0;
        d10.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, d10);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            d10.a = (ErrorModel)object0;
            d10.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), d10) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            d10.a = (ErrorModel)object0;
            d10.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), d10) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @NotNull
    public MutableLiveData getReportedEntryId() {
        return this.g;
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @NotNull
    public MutableLiveData getUpdatedCommentCounts() {
        return this.e;
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @NotNull
    public MutableLiveData getUpdatedEntryItems() {
        return this.c;
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @NotNull
    public MutableLiveData getUpdatedLikeStates() {
        return this.d;
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @Nullable
    public Object modifyEntry(@NotNull String s, long v, @NotNull String s1, @Nullable Integer integer0, @NotNull EntryVisibilityType entryVisibilityType0, @NotNull String s2, @Nullable String s3, @Nullable Long long0, int v1, @Nullable String s4, @Nullable List list0, @Nullable Integer integer1, @Nullable String s5, @NotNull Continuation continuation0) {
        BaseRepository baseRepository6;
        Fail result$Fail0;
        BaseRepository baseRepository5;
        Object object4;
        BaseRepository baseRepository4;
        BaseRepository baseRepository3;
        ItemModel itemModel0;
        EntryItem entryItem0;
        String s7;
        BaseRepository baseRepository2;
        long v3;
        BaseRepository baseRepository1;
        BaseRepository baseRepository0;
        Object object3;
        Object object2;
        String s6;
        e1 e10;
        if(continuation0 instanceof e1) {
            e10 = (e1)continuation0;
            int v2 = e10.h;
            if((v2 & 0x80000000) == 0) {
                e10 = new e1(this, continuation0);
            }
            else {
                e10.h = v2 ^ 0x80000000;
            }
        }
        else {
            e10 = new e1(this, continuation0);
        }
        Object object0 = e10.f;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(e10.h) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                e10.a = this;
                s6 = s;
                e10.b = s6;
                e10.c = s5;
                e10.d = this;
                e10.e = v;
                e10.h = 1;
                object2 = object1;
                try {
                    object3 = this.a.postEditEntry(s, v, s1, integer0, entryVisibilityType0, s2, s3, long0, v1, s4, list0, integer1, e10);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    baseRepository1 = baseRepository0;
                    v3 = v;
                    goto label_106;
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    baseRepository1 = baseRepository0;
                    v3 = v;
                    goto label_118;
                }
                if(object3 == object2) {
                    return object2;
                }
                try {
                    baseRepository2 = this;
                    baseRepository1 = baseRepository2;
                    s7 = s5;
                    v3 = v;
                    entryItem0 = (EntryItem)object3;
                    goto label_66;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = baseRepository2;
                    goto label_106;
                }
                catch(Throwable throwable0) {
                    baseRepository0 = baseRepository2;
                    goto label_118;
                }
            }
            case 1: {
                v3 = e10.e;
                baseRepository0 = e10.d;
                s7 = (String)e10.c;
                String s8 = (String)e10.b;
                baseRepository1 = e10.a;
                try {
                    object2 = object1;
                    ResultKt.throwOnFailure(object0);
                    object2 = object1;
                    s6 = s8;
                    baseRepository2 = baseRepository0;
                }
                catch(CancellationException cancellationException0) {
                    object2 = object1;
                    goto label_106;
                }
                catch(Throwable throwable0) {
                    goto label_118;
                }
                try {
                    entryItem0 = (EntryItem)object0;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = baseRepository2;
                    goto label_106;
                }
                catch(Throwable throwable0) {
                    baseRepository0 = baseRepository2;
                    goto label_118;
                }
            label_66:
                if(s7 == null) {
                    itemModel0 = null;
                }
                else {
                    try {
                        e10.a = baseRepository1;
                        e10.b = baseRepository2;
                        e10.c = entryItem0;
                        e10.d = null;
                        e10.e = v3;
                        e10.h = 2;
                        object0 = ((EntryRepositoryImpl)baseRepository1).a.postEntryChallenge(s6, v3, s7, e10);
                    }
                    catch(Throwable unused_ex) {
                        baseRepository3 = baseRepository2;
                        baseRepository4 = baseRepository1;
                        baseRepository1 = baseRepository4;
                        itemModel0 = null;
                        object4 = new Success(TuplesKt.to(entryItem0, (itemModel0 == null ? null : ((ChallengeResult)itemModel0.getData()))));
                        break;
                    }
                    if(object0 == object2) {
                        return object2;
                    }
                    baseRepository3 = baseRepository2;
                    baseRepository4 = baseRepository1;
                    goto label_92;
                }
                goto label_99;
            }
            case 2: {
                v3 = e10.e;
                entryItem0 = (EntryItem)e10.c;
                baseRepository3 = (BaseRepository)e10.b;
                baseRepository4 = e10.a;
                try {
                    object2 = object1;
                    ResultKt.throwOnFailure(object0);
                    object2 = object1;
                label_92:
                    itemModel0 = (ItemModel)object0;
                    baseRepository1 = baseRepository4;
                    baseRepository2 = baseRepository3;
                }
                catch(Throwable unused_ex) {
                    baseRepository1 = baseRepository4;
                    itemModel0 = null;
                    object4 = new Success(TuplesKt.to(entryItem0, (itemModel0 == null ? null : ((ChallengeResult)itemModel0.getData()))));
                    break;
                }
            label_99:
                baseRepository3 = baseRepository2;
                try {
                    object4 = new Success(TuplesKt.to(entryItem0, (itemModel0 == null ? null : ((ChallengeResult)itemModel0.getData()))));
                    break;
                label_105:
                    baseRepository0 = baseRepository3;
                }
                catch(CancellationException cancellationException0) {
                    goto label_105;
                }
                catch(Throwable throwable0) {
                    goto label_117;
                }
            label_106:
                e10.a = baseRepository1;
                e10.b = baseRepository0;
                e10.c = null;
                e10.d = null;
                e10.e = v3;
                e10.h = 3;
                if(baseRepository0.sendError("coroutine cancel", cancellationException0, e10) == object2) {
                    return object2;
                }
                baseRepository5 = baseRepository1;
                result$Fail0 = new Fail(baseRepository0.createCoroutineCancelErrorModel());
                object4 = result$Fail0;
                baseRepository1 = baseRepository5;
                break;
            label_117:
                baseRepository0 = baseRepository3;
            label_118:
                e10.a = baseRepository1;
                e10.b = baseRepository0;
                e10.c = null;
                e10.d = null;
                e10.e = v3;
                e10.h = 4;
                object0 = baseRepository0.createErrorModel(throwable0, e10);
                if(object0 == object2) {
                    return object2;
                }
                baseRepository6 = baseRepository1;
                goto label_140;
            }
            case 3: {
                v3 = e10.e;
                baseRepository0 = (BaseRepository)e10.b;
                baseRepository5 = e10.a;
                ResultKt.throwOnFailure(object0);
                result$Fail0 = new Fail(baseRepository0.createCoroutineCancelErrorModel());
                object4 = result$Fail0;
                baseRepository1 = baseRepository5;
                break;
            }
            case 4: {
                v3 = e10.e;
                baseRepository0 = (BaseRepository)e10.b;
                baseRepository6 = e10.a;
                ResultKt.throwOnFailure(object0);
                object2 = object1;
            label_140:
                if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
                    MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
                    e10.a = baseRepository6;
                    e10.b = (ErrorModel)object0;
                    e10.e = v3;
                    e10.h = 5;
                    if(mutableSharedFlow0.emit(((ErrorModel)object0), e10) == object2) {
                        return object2;
                    }
                }
                else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
                    MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
                    e10.a = baseRepository6;
                    e10.b = (ErrorModel)object0;
                    e10.e = v3;
                    e10.h = 6;
                    if(mutableSharedFlow1.emit(((ErrorModel)object0), e10) == object2) {
                        return object2;
                    }
                }
                baseRepository5 = baseRepository6;
                result$Fail0 = new Fail(((ErrorModel)object0));
                object4 = result$Fail0;
                baseRepository1 = baseRepository5;
                break;
            }
            case 5: 
            case 6: {
                v3 = e10.e;
                ErrorModel errorModel0 = (ErrorModel)e10.b;
                baseRepository5 = e10.a;
                ResultKt.throwOnFailure(object0);
                object4 = new Fail(errorModel0);
                baseRepository1 = baseRepository5;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(object4 instanceof Success) {
            Pair pair0 = (Pair)((Success)object4).getData();
            EntryItem entryItem1 = (EntryItem)pair0.component1();
            ChallengeResult challengeResult0 = (ChallengeResult)pair0.component2();
            MutableLiveData mutableLiveData0 = ((EntryRepositoryImpl)baseRepository1).getUpdatedEntryItems();
            LongSparseArray longSparseArray0 = (LongSparseArray)((EntryRepositoryImpl)baseRepository1).getUpdatedEntryItems().getValue();
            if(longSparseArray0 == null) {
                longSparseArray0 = new LongSparseArray();
            }
            longSparseArray0.put(v3, entryItem1);
            mutableLiveData0.setValue(longSparseArray0);
        }
        return object4;
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @Nullable
    public Object postCheckProtectedPassword(@NotNull String s, long v, @NotNull String s1, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        g1 g10;
        if(continuation0 instanceof g1) {
            g10 = (g1)continuation0;
            int v1 = g10.d;
            if((v1 & 0x80000000) == 0) {
                g10 = new g1(this, continuation0);
            }
            else {
                g10.d = v1 ^ 0x80000000;
            }
        }
        else {
            g10 = new g1(this, continuation0);
        }
        Object object0 = g10.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(g10.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    g10.a = this;
                    g10.d = 1;
                    object0 = this.a.postCheckProtectedPassword(s, v, s1, g10);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    g10.a = baseRepository1;
                    g10.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, g10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository1 = this;
                break;
            }
            case 1: {
                baseRepository1 = (BaseRepository)g10.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    g10.a = baseRepository1;
                    g10.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, g10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)g10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)g10.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)g10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(object0);
        }
        catch(CancellationException cancellationException0) {
            g10.a = baseRepository1;
            g10.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, g10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        g10.a = baseRepository1;
        g10.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, g10);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            g10.a = (ErrorModel)object0;
            g10.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), g10) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            g10.a = (ErrorModel)object0;
            g10.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), g10) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @Nullable
    public Object postCheckProtectedPassword(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        f1 f10;
        if(continuation0 instanceof f1) {
            f10 = (f1)continuation0;
            int v = f10.d;
            if((v & 0x80000000) == 0) {
                f10 = new f1(this, continuation0);
            }
            else {
                f10.d = v ^ 0x80000000;
            }
        }
        else {
            f10 = new f1(this, continuation0);
        }
        Object object0 = f10.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(f10.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    f10.a = this;
                    f10.d = 1;
                    object0 = this.a.postCheckProtectedPassword(s, s1, s2, f10);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    f10.a = baseRepository0;
                    f10.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, f10) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository0 = this;
                break;
            }
            case 1: {
                baseRepository0 = (BaseRepository)f10.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    f10.a = baseRepository0;
                    f10.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, f10) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)f10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)f10.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)f10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(object0);
        }
        catch(CancellationException cancellationException0) {
            f10.a = baseRepository0;
            f10.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, f10) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        f10.a = baseRepository0;
        f10.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, f10);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            f10.a = (ErrorModel)object0;
            f10.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), f10) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            f10.a = (ErrorModel)object0;
            f10.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), f10) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @Nullable
    public Object postEntryChallenge(@NotNull String s, long v, @NotNull String s1, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        h1 h10;
        if(continuation0 instanceof h1) {
            h10 = (h1)continuation0;
            int v1 = h10.d;
            if((v1 & 0x80000000) == 0) {
                h10 = new h1(this, continuation0);
            }
            else {
                h10.d = v1 ^ 0x80000000;
            }
        }
        else {
            h10 = new h1(this, continuation0);
        }
        Object object0 = h10.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(h10.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    h10.a = this;
                    h10.d = 1;
                    object0 = this.a.postEntryChallenge(s, v, s1, h10);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    h10.a = baseRepository1;
                    h10.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, h10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository1 = this;
                break;
            }
            case 1: {
                baseRepository1 = (BaseRepository)h10.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    h10.a = baseRepository1;
                    h10.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, h10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)h10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)h10.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)h10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(((ItemModel)object0).getData());
        }
        catch(CancellationException cancellationException0) {
            h10.a = baseRepository1;
            h10.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, h10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        h10.a = baseRepository1;
        h10.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, h10);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            h10.a = (ErrorModel)object0;
            h10.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), h10) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            h10.a = (ErrorModel)object0;
            h10.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), h10) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @Nullable
    public Object postLikeIt(@NotNull String s, long v, @NotNull Continuation continuation0) {
        Object object2;
        BaseRepository baseRepository0;
        ErrorModel errorModel0;
        long v2;
        BaseRepository baseRepository2;
        BaseRepository baseRepository1;
        BaseRepository baseRepository3;
        BaseRepository baseRepository4;
        i1 i10;
        if(continuation0 instanceof i1) {
            i10 = (i1)continuation0;
            int v1 = i10.f;
            if((v1 & 0x80000000) == 0) {
                i10 = new i1(this, continuation0);
            }
            else {
                i10.f = v1 ^ 0x80000000;
            }
        }
        else {
            i10 = new i1(this, continuation0);
        }
        Object object0 = i10.d;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(i10.f) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    i10.a = this;
                    i10.b = this;
                    i10.c = v;
                    i10.f = 1;
                    object0 = this.a.postLikeIt(s, v, i10);
                }
                catch(CancellationException cancellationException1) {
                    cancellationException0 = cancellationException1;
                    baseRepository4 = this;
                    baseRepository2 = baseRepository4;
                    goto label_57;
                }
                catch(Throwable throwable1) {
                    throwable0 = throwable1;
                    baseRepository4 = this;
                    baseRepository2 = baseRepository4;
                    goto label_69;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository4 = this;
                baseRepository2 = baseRepository4;
                break;
            }
            case 1: {
                v = i10.c;
                baseRepository4 = (BaseRepository)i10.b;
                baseRepository2 = i10.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    goto label_57;
                }
                catch(Throwable throwable0) {
                    goto label_69;
                }
            }
            case 2: {
                v2 = i10.c;
                baseRepository3 = (BaseRepository)i10.b;
                baseRepository0 = i10.a;
                ResultKt.throwOnFailure(object0);
                object2 = new Fail(baseRepository3.createCoroutineCancelErrorModel());
                goto label_97;
            }
            case 3: {
                v2 = i10.c;
                baseRepository1 = (BaseRepository)i10.b;
                baseRepository2 = i10.a;
                ResultKt.throwOnFailure(object0);
                goto label_78;
            }
            case 4: 
            case 5: {
                v2 = i10.c;
                errorModel0 = (ErrorModel)i10.b;
                baseRepository0 = i10.a;
                ResultKt.throwOnFailure(object0);
                goto label_96;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            object2 = new Success(object0);
            goto label_99;
        }
        catch(CancellationException cancellationException0) {
        label_57:
            i10.a = baseRepository2;
            i10.b = baseRepository4;
            i10.c = v;
            i10.f = 2;
            if(baseRepository4.sendError("coroutine cancel", cancellationException0, i10) == object1) {
                return object1;
            }
            baseRepository0 = baseRepository2;
            baseRepository3 = baseRepository4;
            v2 = v;
            object2 = new Fail(baseRepository3.createCoroutineCancelErrorModel());
            goto label_97;
        }
        catch(Throwable throwable0) {
        }
    label_69:
        i10.a = baseRepository2;
        i10.b = baseRepository4;
        i10.c = v;
        i10.f = 3;
        object0 = baseRepository4.createErrorModel(throwable0, i10);
        if(object0 == object1) {
            return object1;
        }
        baseRepository1 = baseRepository4;
        v2 = v;
    label_78:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            i10.a = baseRepository2;
            i10.b = (ErrorModel)object0;
            i10.c = v2;
            i10.f = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), i10) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            i10.a = baseRepository2;
            i10.b = (ErrorModel)object0;
            i10.c = v2;
            i10.f = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), i10) == object1) {
                return object1;
            }
        }
        errorModel0 = (ErrorModel)object0;
        baseRepository0 = baseRepository2;
    label_96:
        object2 = new Fail(errorModel0);
    label_97:
        v = v2;
        baseRepository2 = baseRepository0;
    label_99:
        if(object2 instanceof Success) {
            MutableLiveData mutableLiveData0 = ((EntryRepositoryImpl)baseRepository2).getUpdatedLikeStates();
            LongSparseArray longSparseArray0 = (LongSparseArray)((EntryRepositoryImpl)baseRepository2).getUpdatedLikeStates().getValue();
            if(longSparseArray0 == null) {
                longSparseArray0 = new LongSparseArray();
            }
            longSparseArray0.put(v, ((Success)object2).getData());
            mutableLiveData0.setValue(longSparseArray0);
        }
        return object2;
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @Nullable
    public Object postNewDraft(@NotNull String s, @Nullable String s1, @Nullable String s2, @Nullable List list0, @Nullable Integer integer0, @Nullable String s3, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        j1 j10;
        if(continuation0 instanceof j1) {
            j10 = (j1)continuation0;
            int v = j10.d;
            if((v & 0x80000000) == 0) {
                j10 = new j1(this, continuation0);
            }
            else {
                j10.d = v ^ 0x80000000;
            }
        }
        else {
            j10 = new j1(this, continuation0);
        }
        Object object0 = j10.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(j10.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    j10.a = this;
                    j10.d = 1;
                    object0 = this.a.postNewDraft(s, s1, s2, list0, integer0, s3, j10);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    j10.a = baseRepository1;
                    j10.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, j10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository1 = this;
                break;
            }
            case 1: {
                baseRepository1 = (BaseRepository)j10.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    j10.a = baseRepository1;
                    j10.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, j10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)j10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)j10.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)j10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(object0);
        }
        catch(CancellationException cancellationException0) {
            j10.a = baseRepository1;
            j10.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, j10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        j10.a = baseRepository1;
        j10.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, j10);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            j10.a = (ErrorModel)object0;
            j10.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), j10) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            j10.a = (ErrorModel)object0;
            j10.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), j10) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @Nullable
    public Object postNewEntry(@NotNull String s, @Nullable Long long0, @NotNull String s1, @Nullable Integer integer0, @NotNull EntryVisibilityType entryVisibilityType0, @NotNull String s2, @Nullable String s3, @Nullable Long long1, int v, @Nullable String s4, @Nullable List list0, @Nullable Integer integer1, @Nullable String s5, @NotNull Continuation continuation0) {
        BaseRepository baseRepository5;
        BaseRepository baseRepository4;
        Object object5;
        ItemModel itemModel0;
        EntryItem entryItem1;
        BaseRepository baseRepository3;
        BaseRepository baseRepository2;
        Object object4;
        EntryItem entryItem0;
        String s7;
        String s6;
        BaseRepository baseRepository1;
        BaseRepository baseRepository0;
        Object object3;
        Object object2;
        k1 k10;
        if(continuation0 instanceof k1) {
            k10 = (k1)continuation0;
            int v1 = k10.g;
            if((v1 & 0x80000000) == 0) {
                k10 = new k1(this, continuation0);
            }
            else {
                k10.g = v1 ^ 0x80000000;
            }
        }
        else {
            k10 = new k1(this, continuation0);
        }
        Object object0 = k10.e;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(k10.g) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                k10.a = this;
                k10.b = s;
                k10.c = s5;
                k10.d = this;
                k10.g = 1;
                object2 = object1;
                try {
                    object3 = this.a.postNewEntry(s, long0, s1, integer0, entryVisibilityType0, s2, s3, long1, v, s4, list0, integer1, k10);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    baseRepository1 = baseRepository0;
                    goto label_90;
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    baseRepository1 = baseRepository0;
                    goto label_101;
                }
                if(object3 == object2) {
                    return object2;
                }
                try {
                    baseRepository1 = this;
                    s6 = s5;
                    s7 = s;
                    baseRepository0 = baseRepository1;
                    entryItem0 = (EntryItem)object3;
                    goto label_50;
                }
                catch(CancellationException cancellationException0) {
                    goto label_90;
                }
                catch(Throwable throwable0) {
                    goto label_101;
                }
            }
            case 1: {
                baseRepository0 = k10.d;
                s6 = (String)k10.c;
                s7 = (String)k10.b;
                baseRepository1 = k10.a;
                try {
                    object2 = object1;
                    ResultKt.throwOnFailure(object0);
                    object2 = object1;
                    goto label_49;
                }
                catch(CancellationException cancellationException0) {
                }
                catch(Throwable throwable0) {
                    goto label_101;
                }
                object2 = object1;
                goto label_90;
                try {
                label_49:
                    entryItem0 = (EntryItem)object0;
                }
                catch(CancellationException cancellationException0) {
                    goto label_90;
                }
                catch(Throwable throwable0) {
                    goto label_101;
                }
                try {
                label_50:
                    Long long2 = entryItem0.getId();
                    if(s6 == null || long2 == null) {
                        itemModel0 = null;
                        object5 = new Success(TuplesKt.to(entryItem0, (itemModel0 == null ? null : ((ChallengeResult)itemModel0.getData()))));
                        break;
                    }
                    else {
                        k10.a = baseRepository1;
                        k10.b = baseRepository0;
                        k10.c = entryItem0;
                        k10.d = null;
                        k10.g = 2;
                        object4 = ((EntryRepositoryImpl)baseRepository1).a.postEntryChallenge(s7, ((long)long2), s6, k10);
                        goto label_63;
                    }
                    object5 = new Success(TuplesKt.to(entryItem0, (itemModel0 == null ? null : ((ChallengeResult)itemModel0.getData()))));
                    break;
                }
                catch(Throwable unused_ex) {
                    baseRepository2 = baseRepository0;
                    baseRepository3 = baseRepository1;
                    entryItem1 = entryItem0;
                    goto label_83;
                }
            label_63:
                if(object4 == object2) {
                    return object2;
                }
                baseRepository3 = baseRepository1;
                entryItem1 = entryItem0;
                object0 = object4;
                baseRepository2 = baseRepository0;
                goto label_78;
            }
            case 2: {
                entryItem1 = (EntryItem)k10.c;
                baseRepository2 = (BaseRepository)k10.b;
                baseRepository3 = k10.a;
                try {
                    object2 = object1;
                    ResultKt.throwOnFailure(object0);
                    object2 = object1;
                label_78:
                    itemModel0 = (ItemModel)object0;
                    entryItem0 = entryItem1;
                    baseRepository0 = baseRepository2;
                    baseRepository1 = baseRepository3;
                }
                catch(Throwable unused_ex) {
                label_83:
                    entryItem0 = entryItem1;
                    baseRepository0 = baseRepository2;
                    baseRepository1 = baseRepository3;
                    itemModel0 = null;
                }
                try {
                    object5 = new Success(TuplesKt.to(entryItem0, (itemModel0 == null ? null : ((ChallengeResult)itemModel0.getData()))));
                    break;
                }
                catch(CancellationException cancellationException0) {
                }
                catch(Throwable throwable0) {
                    goto label_101;
                }
            label_90:
                k10.a = baseRepository1;
                k10.b = baseRepository0;
                k10.c = null;
                k10.d = null;
                k10.g = 3;
                if(baseRepository0.sendError("coroutine cancel", cancellationException0, k10) == object2) {
                    return object2;
                }
                baseRepository4 = baseRepository1;
                object5 = new Fail(baseRepository0.createCoroutineCancelErrorModel());
                baseRepository1 = baseRepository4;
                break;
            label_101:
                k10.a = baseRepository1;
                k10.b = baseRepository0;
                k10.c = null;
                k10.d = null;
                k10.g = 4;
                object0 = baseRepository0.createErrorModel(throwable0, k10);
                if(object0 == object2) {
                    return object2;
                }
                baseRepository5 = baseRepository1;
                goto label_120;
            }
            case 3: {
                baseRepository0 = (BaseRepository)k10.b;
                baseRepository4 = k10.a;
                ResultKt.throwOnFailure(object0);
                object5 = new Fail(baseRepository0.createCoroutineCancelErrorModel());
                baseRepository1 = baseRepository4;
                break;
            }
            case 4: {
                baseRepository0 = (BaseRepository)k10.b;
                baseRepository5 = k10.a;
                ResultKt.throwOnFailure(object0);
                object2 = object1;
            label_120:
                if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
                    MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
                    k10.a = baseRepository5;
                    k10.b = (ErrorModel)object0;
                    k10.g = 5;
                    if(mutableSharedFlow0.emit(((ErrorModel)object0), k10) == object2) {
                        return object2;
                    }
                }
                else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
                    MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
                    k10.a = baseRepository5;
                    k10.b = (ErrorModel)object0;
                    k10.g = 6;
                    if(mutableSharedFlow1.emit(((ErrorModel)object0), k10) == object2) {
                        return object2;
                    }
                }
                baseRepository4 = baseRepository5;
                object5 = new Fail(((ErrorModel)object0));
                baseRepository1 = baseRepository4;
                break;
            }
            case 5: 
            case 6: {
                ErrorModel errorModel0 = (ErrorModel)k10.b;
                baseRepository4 = k10.a;
                ResultKt.throwOnFailure(object0);
                object5 = new Fail(errorModel0);
                baseRepository1 = baseRepository4;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(object5 instanceof Success) {
            ((EntryRepositoryImpl)baseRepository1).getAddedEntryItem().setValue(((Pair)((Success)object5).getData()).getFirst());
        }
        return object5;
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @Nullable
    public Object postReportEntry(@NotNull String s, long v, @NotNull String s1, @Nullable String s2, @NotNull Continuation continuation0) {
        Object object2;
        BaseRepository baseRepository0;
        ErrorModel errorModel0;
        long v2;
        BaseRepository baseRepository2;
        BaseRepository baseRepository1;
        l1 l10;
        if(continuation0 instanceof l1) {
            l10 = (l1)continuation0;
            int v1 = l10.f;
            if((v1 & 0x80000000) == 0) {
                l10 = new l1(this, continuation0);
            }
            else {
                l10.f = v1 ^ 0x80000000;
            }
        }
        else {
            l10 = new l1(this, continuation0);
        }
        Object object0 = l10.d;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(l10.f) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    l10.a = this;
                    l10.b = this;
                    l10.c = v;
                    l10.f = 1;
                    if(this.a.postReportEntry(s, v, s1, s2, l10) == object1) {
                        return object1;
                    }
                    v2 = v;
                    baseRepository1 = this;
                    baseRepository2 = baseRepository1;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    v2 = v;
                    baseRepository1 = this;
                    baseRepository2 = baseRepository1;
                    goto label_57;
                }
                catch(Throwable throwable0) {
                    v2 = v;
                    baseRepository1 = this;
                    baseRepository2 = baseRepository1;
                    goto label_67;
                }
                return object1;
            }
            case 1: {
                v2 = l10.c;
                baseRepository1 = (BaseRepository)l10.b;
                baseRepository2 = l10.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    goto label_57;
                }
                catch(Throwable throwable0) {
                    goto label_67;
                }
            }
            case 2: {
                v2 = l10.c;
                baseRepository1 = (BaseRepository)l10.b;
                baseRepository0 = l10.a;
                ResultKt.throwOnFailure(object0);
                object2 = new Fail(baseRepository1.createCoroutineCancelErrorModel());
                goto label_93;
            }
            case 3: {
                v2 = l10.c;
                baseRepository1 = (BaseRepository)l10.b;
                baseRepository2 = l10.a;
                ResultKt.throwOnFailure(object0);
                goto label_74;
            }
            case 4: 
            case 5: {
                v2 = l10.c;
                errorModel0 = (ErrorModel)l10.b;
                baseRepository0 = l10.a;
                ResultKt.throwOnFailure(object0);
                goto label_92;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            object2 = new Success(Unit.INSTANCE);
            goto label_94;
        }
        catch(CancellationException cancellationException0) {
        label_57:
            l10.a = baseRepository2;
            l10.b = baseRepository1;
            l10.c = v2;
            l10.f = 2;
            if(baseRepository1.sendError("coroutine cancel", cancellationException0, l10) == object1) {
                return object1;
            }
            baseRepository0 = baseRepository2;
            object2 = new Fail(baseRepository1.createCoroutineCancelErrorModel());
            goto label_93;
        }
        catch(Throwable throwable0) {
        }
    label_67:
        l10.a = baseRepository2;
        l10.b = baseRepository1;
        l10.c = v2;
        l10.f = 3;
        object0 = baseRepository1.createErrorModel(throwable0, l10);
        if(object0 == object1) {
            return object1;
        }
    label_74:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            l10.a = baseRepository2;
            l10.b = (ErrorModel)object0;
            l10.c = v2;
            l10.f = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), l10) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            l10.a = baseRepository2;
            l10.b = (ErrorModel)object0;
            l10.c = v2;
            l10.f = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), l10) == object1) {
                return object1;
            }
        }
        errorModel0 = (ErrorModel)object0;
        baseRepository0 = baseRepository2;
    label_92:
        object2 = new Fail(errorModel0);
    label_93:
        baseRepository2 = baseRepository0;
    label_94:
        if(object2 instanceof Success) {
            ((EntryRepositoryImpl)baseRepository2).getReportedEntryId().setValue(Boxing.boxLong(v2));
        }
        return object2;
    }

    @Override  // com.kakao.tistory.domain.repository.EntryRepository
    @Nullable
    public Object putEntryVisibility(@NotNull String s, long v, @NotNull String s1, @NotNull Continuation continuation0) {
        Fail result$Fail0;
        Object object2;
        BaseRepository baseRepository0;
        ErrorModel errorModel0;
        long v2;
        BaseRepository baseRepository2;
        BaseRepository baseRepository1;
        long v4;
        m1 m10;
        if(continuation0 instanceof m1) {
            m10 = (m1)continuation0;
            int v1 = m10.f;
            if((v1 & 0x80000000) == 0) {
                m10 = new m1(this, continuation0);
            }
            else {
                m10.f = v1 ^ 0x80000000;
            }
        }
        else {
            m10 = new m1(this, continuation0);
        }
        Object object0 = m10.d;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(m10.f) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                m10.a = this;
                m10.b = this;
                v4 = v;
                try {
                    m10.c = v4;
                    m10.f = 1;
                    object0 = this.a.putEntryVisibility(s, v, s1, m10);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    baseRepository2 = baseRepository1;
                    goto label_61;
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    baseRepository2 = baseRepository1;
                    goto label_72;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository1 = this;
                baseRepository2 = baseRepository1;
                break;
            }
            case 1: {
                long v3 = m10.c;
                baseRepository1 = (BaseRepository)m10.b;
                baseRepository2 = m10.a;
                try {
                    v4 = v3;
                    ResultKt.throwOnFailure(object0);
                    v4 = v3;
                    break;
                }
                catch(CancellationException cancellationException0) {
                }
                catch(Throwable throwable0) {
                    goto label_72;
                }
                v4 = v3;
                goto label_61;
            }
            case 2: {
                v2 = m10.c;
                baseRepository1 = (BaseRepository)m10.b;
                baseRepository0 = m10.a;
                ResultKt.throwOnFailure(object0);
                result$Fail0 = new Fail(baseRepository1.createCoroutineCancelErrorModel());
                goto label_99;
            }
            case 3: {
                v2 = m10.c;
                baseRepository1 = (BaseRepository)m10.b;
                baseRepository2 = m10.a;
                ResultKt.throwOnFailure(object0);
                goto label_80;
            }
            case 4: 
            case 5: {
                v2 = m10.c;
                errorModel0 = (ErrorModel)m10.b;
                baseRepository0 = m10.a;
                ResultKt.throwOnFailure(object0);
                goto label_98;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            object2 = new Success(object0);
            goto label_102;
        }
        catch(CancellationException cancellationException0) {
        label_61:
            m10.a = baseRepository2;
            m10.b = baseRepository1;
            m10.c = v4;
            m10.f = 2;
            if(baseRepository1.sendError("coroutine cancel", cancellationException0, m10) == object1) {
                return object1;
            }
            baseRepository0 = baseRepository2;
            v2 = v4;
            result$Fail0 = new Fail(baseRepository1.createCoroutineCancelErrorModel());
            goto label_99;
        }
        catch(Throwable throwable0) {
        }
    label_72:
        m10.a = baseRepository2;
        m10.b = baseRepository1;
        m10.c = v4;
        m10.f = 3;
        object0 = baseRepository1.createErrorModel(throwable0, m10);
        if(object0 == object1) {
            return object1;
        }
        v2 = v4;
    label_80:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            m10.a = baseRepository2;
            m10.b = (ErrorModel)object0;
            m10.c = v2;
            m10.f = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), m10) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            m10.a = baseRepository2;
            m10.b = (ErrorModel)object0;
            m10.c = v2;
            m10.f = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), m10) == object1) {
                return object1;
            }
        }
        errorModel0 = (ErrorModel)object0;
        baseRepository0 = baseRepository2;
    label_98:
        result$Fail0 = new Fail(errorModel0);
    label_99:
        baseRepository2 = baseRepository0;
        v4 = v2;
        object2 = result$Fail0;
    label_102:
        if(!(object2 instanceof Fail) && object2 instanceof Success) {
            MutableLiveData mutableLiveData0 = ((EntryRepositoryImpl)baseRepository2).getUpdatedEntryItems();
            LongSparseArray longSparseArray0 = (LongSparseArray)((EntryRepositoryImpl)baseRepository2).getUpdatedEntryItems().getValue();
            if(longSparseArray0 == null) {
                longSparseArray0 = new LongSparseArray();
            }
            longSparseArray0.put(v4, ((Success)object2).getData());
            mutableLiveData0.setValue(longSparseArray0);
        }
        return object2;
    }
}

