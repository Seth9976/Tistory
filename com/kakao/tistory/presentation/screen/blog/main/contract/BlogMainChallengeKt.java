package com.kakao.tistory.presentation.screen.blog.main.contract;

import com.kakao.tistory.domain.blog.entity.Challenge;
import com.kakao.tistory.domain.blog.entity.ChallengeStatus;
import com.kakao.tistory.domain.blog.entity.ParticipantInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u0011\u0010\u0002\u001A\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001A\u0089\u0001\u0010\u0011\u001A\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00050\u00042K\u0010\u000E\u001AG\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000B\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00062!\u0010\u0010\u001A\u001D\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000B\u0012\u0004\u0012\u00020\r0\u000F¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainChallengeList;", "", "needRefresh", "(Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainChallengeList;)Z", "", "Lcom/kakao/tistory/domain/blog/entity/Challenge;", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "url", "title", "isPreview", "", "onClickChallenge", "Lkotlin/Function1;", "onClickAuth", "toBlogMainChallengeList", "(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainChallengeList;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogMainChallenge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogMainChallenge.kt\ncom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainChallengeKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,115:1\n1747#2,3:116\n1603#2,9:119\n1855#2:128\n1856#2:130\n1612#2:131\n1#3:129\n1#3:132\n*S KotlinDebug\n*F\n+ 1 BlogMainChallenge.kt\ncom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainChallengeKt\n*L\n63#1:116,3\n68#1:119,9\n68#1:128\n68#1:130\n68#1:131\n68#1:129\n*E\n"})
public final class BlogMainChallengeKt {
    public static final boolean needRefresh(@NotNull BlogMainChallengeList blogMainChallengeList0) {
        Intrinsics.checkNotNullParameter(blogMainChallengeList0, "<this>");
        List list0 = blogMainChallengeList0.getList();
        if(!(list0 instanceof Collection) || !list0.isEmpty()) {
            for(Object object0: list0) {
                if(((BlogMainChallenge)object0).getStatus() == ChallengeStatus.OPEN || ((BlogMainChallenge)object0).getStatus() == ChallengeStatus.PRE) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    @Nullable
    public static final BlogMainChallengeList toBlogMainChallengeList(@NotNull List list0, @NotNull Function3 function30, @NotNull Function1 function10) {
        ParticipationStatus blogMainChallenge$ParticipationStatus0;
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "onClickChallenge");
        Intrinsics.checkNotNullParameter(function10, "onClickAuth");
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = list0.iterator();
        while(true) {
            BlogMainChallengeList blogMainChallengeList0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            Challenge challenge0 = (Challenge)object0;
            ChallengeStatus challengeStatus0 = challenge0.getChallengeInfo().getStatus();
            ParticipantInfo participantInfo0 = challenge0.getParticipantInfo();
            if(participantInfo0 != null) {
                ChallengeStatus challengeStatus1 = ChallengeStatus.OPEN;
                if(challengeStatus0 == challengeStatus1 || challengeStatus0 == ChallengeStatus.END) {
                    if(challengeStatus0 != challengeStatus1 || !participantInfo0.isPostedToday()) {
                        blogMainChallenge$ParticipationStatus0 = challengeStatus0 == challengeStatus1 ? ParticipationStatus.NOT_PARTICIPATED : ParticipationStatus.ENDED;
                    }
                    else {
                        blogMainChallenge$ParticipationStatus0 = ParticipationStatus.PARTICIPATED;
                    }
                    blogMainChallengeList0 = new Participant(challengeStatus0, "", blogMainChallenge$ParticipationStatus0, "", "", participantInfo0.getPercentage(), participantInfo0.getMessage(), participantInfo0.getCurrent(), challenge0.getChallengeInfo().getTotal(), challenge0.getChallengeInfo().getPrizeInfo(), participantInfo0.getDescription(), participantInfo0.isAgeAuthed(), new d(function10, challenge0), new e(function30, challenge0));
                }
            }
            else if(challengeStatus0 == ChallengeStatus.PRE || challengeStatus0 == ChallengeStatus.OPEN) {
                blogMainChallengeList0 = new Preview(challengeStatus0, "", new f(function30, challenge0));
            }
            if(blogMainChallengeList0 != null) {
                arrayList0.add(blogMainChallengeList0);
            }
        }
        if(arrayList0.isEmpty()) {
            arrayList0 = null;
        }
        return arrayList0 == null ? null : new BlogMainChallengeList(arrayList0);
    }
}

