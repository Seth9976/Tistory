package com.kakao.tistory.presentation.screen.blog.main.contract;

import a5.b;
import androidx.compose.runtime.Immutable;
import com.kakao.tistory.domain.blog.entity.ChallengeStatus;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.main.contract.a;
import com.kakao.tistory.presentation.main.contract.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainChallenge;", "", "status", "Lcom/kakao/tistory/domain/blog/entity/ChallengeStatus;", "getStatus", "()Lcom/kakao/tistory/domain/blog/entity/ChallengeStatus;", "Participant", "ParticipationStatus", "Preview", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainChallenge$Participant;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainChallenge$Preview;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface BlogMainChallenge {
    @Immutable
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001D\n\u0002\u0010\u0000\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0004\u0012\u0006\u0010\t\u001A\u00020\u0004\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\f\u001A\u00020\u0004\u0012\u0006\u0010\r\u001A\u00020\n\u0012\u0006\u0010\u000E\u001A\u00020\n\u0012\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\n0\u000F\u0012\u0006\u0010\u0011\u001A\u00020\u0004\u0012\u0006\u0010\u0013\u001A\u00020\u0012\u0012\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00150\u0014\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001A\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001C\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001E\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010 \u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u001DJ\u0010\u0010!\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\u001DJ\u0010\u0010\"\u001A\u00020\nH\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b$\u0010\u001DJ\u0010\u0010%\u001A\u00020\nH\u00C6\u0003\u00A2\u0006\u0004\b%\u0010#J\u0010\u0010&\u001A\u00020\nH\u00C6\u0003\u00A2\u0006\u0004\b&\u0010#J\u0016\u0010\'\u001A\b\u0012\u0004\u0012\u00020\n0\u000FH\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010(J\u0010\u0010)\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b)\u0010\u001DJ\u0010\u0010*\u001A\u00020\u0012H\u00C6\u0003\u00A2\u0006\u0004\b*\u0010+J\u0016\u0010,\u001A\b\u0012\u0004\u0012\u00020\u00150\u0014H\u00C6\u0003\u00A2\u0006\u0004\b,\u0010-J\u0016\u0010.\u001A\b\u0012\u0004\u0012\u00020\u00150\u0014H\u00C6\u0003\u00A2\u0006\u0004\b.\u0010-J\u00AE\u0001\u0010/\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00042\b\b\u0002\u0010\t\u001A\u00020\u00042\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\f\u001A\u00020\u00042\b\b\u0002\u0010\r\u001A\u00020\n2\b\b\u0002\u0010\u000E\u001A\u00020\n2\u000E\b\u0002\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\n0\u000F2\b\b\u0002\u0010\u0011\u001A\u00020\u00042\b\b\u0002\u0010\u0013\u001A\u00020\u00122\u000E\b\u0002\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00150\u00142\u000E\b\u0002\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00150\u0014H\u00C6\u0001\u00A2\u0006\u0004\b/\u00100J\u0010\u00101\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b1\u0010\u001DJ\u0010\u00102\u001A\u00020\nH\u00D6\u0001\u00A2\u0006\u0004\b2\u0010#J\u001A\u00105\u001A\u00020\u00122\b\u00104\u001A\u0004\u0018\u000103H\u00D6\u0003\u00A2\u0006\u0004\b5\u00106R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010\u001BR\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010\u001DR\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b=\u0010>\u001A\u0004\b?\u0010\u001FR\u0017\u0010\b\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b@\u0010;\u001A\u0004\bA\u0010\u001DR\u0017\u0010\t\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bB\u0010;\u001A\u0004\bC\u0010\u001DR\u0017\u0010\u000B\u001A\u00020\n8\u0006\u00A2\u0006\f\n\u0004\bD\u0010E\u001A\u0004\bF\u0010#R\u0017\u0010\f\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bG\u0010;\u001A\u0004\bH\u0010\u001DR\u0017\u0010\r\u001A\u00020\n8\u0006\u00A2\u0006\f\n\u0004\bI\u0010E\u001A\u0004\bJ\u0010#R\u0017\u0010\u000E\u001A\u00020\n8\u0006\u00A2\u0006\f\n\u0004\bK\u0010E\u001A\u0004\bL\u0010#R\u001D\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\n0\u000F8\u0006\u00A2\u0006\f\n\u0004\bM\u0010N\u001A\u0004\bO\u0010(R\u0017\u0010\u0011\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bP\u0010;\u001A\u0004\bQ\u0010\u001DR\u0017\u0010\u0013\u001A\u00020\u00128\u0006\u00A2\u0006\f\n\u0004\bR\u0010S\u001A\u0004\b\u0013\u0010+R\u001D\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006\u00A2\u0006\f\n\u0004\bT\u0010U\u001A\u0004\bV\u0010-R\u001D\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006\u00A2\u0006\f\n\u0004\bW\u0010U\u001A\u0004\bX\u0010-\u00A8\u0006Y"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainChallenge$Participant;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainChallenge;", "Lcom/kakao/tistory/domain/blog/entity/ChallengeStatus;", "status", "", "title", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainChallenge$ParticipationStatus;", "participationStatus", "startDate", "endDate", "", "percentage", "message", "current", "total", "", "prizeInfo", "description", "", "isAgeAuthed", "Lkotlin/Function0;", "", "onClickAuth", "onClickChallenge", "<init>", "(Lcom/kakao/tistory/domain/blog/entity/ChallengeStatus;Ljava/lang/String;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainChallenge$ParticipationStatus;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/util/List;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "component1", "()Lcom/kakao/tistory/domain/blog/entity/ChallengeStatus;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainChallenge$ParticipationStatus;", "component4", "component5", "component6", "()I", "component7", "component8", "component9", "component10", "()Ljava/util/List;", "component11", "component12", "()Z", "component13", "()Lkotlin/jvm/functions/Function0;", "component14", "copy", "(Lcom/kakao/tistory/domain/blog/entity/ChallengeStatus;Ljava/lang/String;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainChallenge$ParticipationStatus;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/util/List;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainChallenge$Participant;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/domain/blog/entity/ChallengeStatus;", "getStatus", "b", "Ljava/lang/String;", "getTitle", "c", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainChallenge$ParticipationStatus;", "getParticipationStatus", "d", "getStartDate", "e", "getEndDate", "f", "I", "getPercentage", "g", "getMessage", "h", "getCurrent", "i", "getTotal", "j", "Ljava/util/List;", "getPrizeInfo", "k", "getDescription", "l", "Z", "m", "Lkotlin/jvm/functions/Function0;", "getOnClickAuth", "n", "getOnClickChallenge", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Participant implements BlogMainChallenge {
        public static final int $stable;
        public final ChallengeStatus a;
        public final String b;
        public final ParticipationStatus c;
        public final String d;
        public final String e;
        public final int f;
        public final String g;
        public final int h;
        public final int i;
        public final List j;
        public final String k;
        public final boolean l;
        public final Function0 m;
        public final Function0 n;

        public Participant(@NotNull ChallengeStatus challengeStatus0, @NotNull String s, @NotNull ParticipationStatus blogMainChallenge$ParticipationStatus0, @NotNull String s1, @NotNull String s2, int v, @NotNull String s3, int v1, int v2, @NotNull List list0, @NotNull String s4, boolean z, @NotNull Function0 function00, @NotNull Function0 function01) {
            Intrinsics.checkNotNullParameter(challengeStatus0, "status");
            Intrinsics.checkNotNullParameter(s, "title");
            Intrinsics.checkNotNullParameter(blogMainChallenge$ParticipationStatus0, "participationStatus");
            Intrinsics.checkNotNullParameter(s1, "startDate");
            Intrinsics.checkNotNullParameter(s2, "endDate");
            Intrinsics.checkNotNullParameter(s3, "message");
            Intrinsics.checkNotNullParameter(list0, "prizeInfo");
            Intrinsics.checkNotNullParameter(s4, "description");
            Intrinsics.checkNotNullParameter(function00, "onClickAuth");
            Intrinsics.checkNotNullParameter(function01, "onClickChallenge");
            super();
            this.a = challengeStatus0;
            this.b = s;
            this.c = blogMainChallenge$ParticipationStatus0;
            this.d = s1;
            this.e = s2;
            this.f = v;
            this.g = s3;
            this.h = v1;
            this.i = v2;
            this.j = list0;
            this.k = s4;
            this.l = z;
            this.m = function00;
            this.n = function01;
        }

        @NotNull
        public final ChallengeStatus component1() {
            return this.a;
        }

        @NotNull
        public final List component10() {
            return this.j;
        }

        @NotNull
        public final String component11() {
            return this.k;
        }

        public final boolean component12() {
            return this.l;
        }

        @NotNull
        public final Function0 component13() {
            return this.m;
        }

        @NotNull
        public final Function0 component14() {
            return this.n;
        }

        @NotNull
        public final String component2() {
            return this.b;
        }

        @NotNull
        public final ParticipationStatus component3() {
            return this.c;
        }

        @NotNull
        public final String component4() {
            return this.d;
        }

        @NotNull
        public final String component5() {
            return this.e;
        }

        public final int component6() {
            return this.f;
        }

        @NotNull
        public final String component7() {
            return this.g;
        }

        public final int component8() {
            return this.h;
        }

        public final int component9() {
            return this.i;
        }

        @NotNull
        public final Participant copy(@NotNull ChallengeStatus challengeStatus0, @NotNull String s, @NotNull ParticipationStatus blogMainChallenge$ParticipationStatus0, @NotNull String s1, @NotNull String s2, int v, @NotNull String s3, int v1, int v2, @NotNull List list0, @NotNull String s4, boolean z, @NotNull Function0 function00, @NotNull Function0 function01) {
            Intrinsics.checkNotNullParameter(challengeStatus0, "status");
            Intrinsics.checkNotNullParameter(s, "title");
            Intrinsics.checkNotNullParameter(blogMainChallenge$ParticipationStatus0, "participationStatus");
            Intrinsics.checkNotNullParameter(s1, "startDate");
            Intrinsics.checkNotNullParameter(s2, "endDate");
            Intrinsics.checkNotNullParameter(s3, "message");
            Intrinsics.checkNotNullParameter(list0, "prizeInfo");
            Intrinsics.checkNotNullParameter(s4, "description");
            Intrinsics.checkNotNullParameter(function00, "onClickAuth");
            Intrinsics.checkNotNullParameter(function01, "onClickChallenge");
            return new Participant(challengeStatus0, s, blogMainChallenge$ParticipationStatus0, s1, s2, v, s3, v1, v2, list0, s4, z, function00, function01);
        }

        public static Participant copy$default(Participant blogMainChallenge$Participant0, ChallengeStatus challengeStatus0, String s, ParticipationStatus blogMainChallenge$ParticipationStatus0, String s1, String s2, int v, String s3, int v1, int v2, List list0, String s4, boolean z, Function0 function00, Function0 function01, int v3, Object object0) {
            ChallengeStatus challengeStatus1 = (v3 & 1) == 0 ? challengeStatus0 : blogMainChallenge$Participant0.a;
            String s5 = (v3 & 2) == 0 ? s : blogMainChallenge$Participant0.b;
            ParticipationStatus blogMainChallenge$ParticipationStatus1 = (v3 & 4) == 0 ? blogMainChallenge$ParticipationStatus0 : blogMainChallenge$Participant0.c;
            String s6 = (v3 & 8) == 0 ? s1 : blogMainChallenge$Participant0.d;
            String s7 = (v3 & 16) == 0 ? s2 : blogMainChallenge$Participant0.e;
            int v4 = (v3 & 0x20) == 0 ? v : blogMainChallenge$Participant0.f;
            String s8 = (v3 & 0x40) == 0 ? s3 : blogMainChallenge$Participant0.g;
            int v5 = (v3 & 0x80) == 0 ? v1 : blogMainChallenge$Participant0.h;
            int v6 = (v3 & 0x100) == 0 ? v2 : blogMainChallenge$Participant0.i;
            List list1 = (v3 & 0x200) == 0 ? list0 : blogMainChallenge$Participant0.j;
            String s9 = (v3 & 0x400) == 0 ? s4 : blogMainChallenge$Participant0.k;
            boolean z1 = (v3 & 0x800) == 0 ? z : blogMainChallenge$Participant0.l;
            Function0 function02 = (v3 & 0x1000) == 0 ? function00 : blogMainChallenge$Participant0.m;
            return (v3 & 0x2000) == 0 ? blogMainChallenge$Participant0.copy(challengeStatus1, s5, blogMainChallenge$ParticipationStatus1, s6, s7, v4, s8, v5, v6, list1, s9, z1, function02, function01) : blogMainChallenge$Participant0.copy(challengeStatus1, s5, blogMainChallenge$ParticipationStatus1, s6, s7, v4, s8, v5, v6, list1, s9, z1, function02, blogMainChallenge$Participant0.n);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Participant)) {
                return false;
            }
            if(this.a != ((Participant)object0).a) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((Participant)object0).b)) {
                return false;
            }
            if(this.c != ((Participant)object0).c) {
                return false;
            }
            if(!Intrinsics.areEqual(this.d, ((Participant)object0).d)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.e, ((Participant)object0).e)) {
                return false;
            }
            if(this.f != ((Participant)object0).f) {
                return false;
            }
            if(!Intrinsics.areEqual(this.g, ((Participant)object0).g)) {
                return false;
            }
            if(this.h != ((Participant)object0).h) {
                return false;
            }
            if(this.i != ((Participant)object0).i) {
                return false;
            }
            if(!Intrinsics.areEqual(this.j, ((Participant)object0).j)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.k, ((Participant)object0).k)) {
                return false;
            }
            if(this.l != ((Participant)object0).l) {
                return false;
            }
            return Intrinsics.areEqual(this.m, ((Participant)object0).m) ? Intrinsics.areEqual(this.n, ((Participant)object0).n) : false;
        }

        public final int getCurrent() {
            return this.h;
        }

        @NotNull
        public final String getDescription() {
            return this.k;
        }

        @NotNull
        public final String getEndDate() {
            return this.e;
        }

        @NotNull
        public final String getMessage() {
            return this.g;
        }

        @NotNull
        public final Function0 getOnClickAuth() {
            return this.m;
        }

        @NotNull
        public final Function0 getOnClickChallenge() {
            return this.n;
        }

        @NotNull
        public final ParticipationStatus getParticipationStatus() {
            return this.c;
        }

        public final int getPercentage() {
            return this.f;
        }

        @NotNull
        public final List getPrizeInfo() {
            return this.j;
        }

        @NotNull
        public final String getStartDate() {
            return this.d;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainChallenge
        @NotNull
        public ChallengeStatus getStatus() {
            return this.a;
        }

        @NotNull
        public final String getTitle() {
            return this.b;
        }

        public final int getTotal() {
            return this.i;
        }

        @Override
        public int hashCode() {
            return this.n.hashCode() + a.a(this.m, c.a(this.l, com.kakao.tistory.presentation.common.graph.a.a(this.k, b.c(this.j, com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.i, com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.h, com.kakao.tistory.presentation.common.graph.a.a(this.g, com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.f, com.kakao.tistory.presentation.common.graph.a.a(this.e, com.kakao.tistory.presentation.common.graph.a.a(this.d, (this.c.hashCode() + com.kakao.tistory.presentation.common.graph.a.a(this.b, this.a.hashCode() * 0x1F, 0x1F)) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
        }

        public final boolean isAgeAuthed() {
            return this.l;
        }

        @Override
        @NotNull
        public String toString() {
            return "Participant(status=" + this.a + ", title=" + this.b + ", participationStatus=" + this.c + ", startDate=" + this.d + ", endDate=" + this.e + ", percentage=" + this.f + ", message=" + this.g + ", current=" + this.h + ", total=" + this.i + ", prizeInfo=" + this.j + ", description=" + this.k + ", isAgeAuthed=" + this.l + ", onClickAuth=" + this.m + ", onClickChallenge=" + this.n + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\r\u001A\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u001D\u0010\u0010\u001A\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000E\u0010\n\u001A\u0004\b\u000F\u0010\fj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainChallenge$ParticipationStatus;", "", "", "a", "I", "getLabelRes", "()I", "labelRes", "Landroidx/compose/ui/graphics/Color;", "b", "J", "getTextColor-0d7_KjU", "()J", "textColor", "c", "getBorderColor-0d7_KjU", "borderColor", "NOT_PARTICIPATED", "PARTICIPATED", "ENDED", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum ParticipationStatus {
        NOT_PARTICIPATED(string.label_blog_challenge_status_not_participated, 0L, 0L),
        PARTICIPATED(string.label_blog_challenge_status_participated, 0L, 0L),
        ENDED(string.label_blog_challenge_status_ended, 0L, 0L);

        public final int a;
        public final long b;
        public final long c;
        public static final ParticipationStatus[] d;
        public static final EnumEntries e;

        static {
            ParticipationStatus.d = arr_blogMainChallenge$ParticipationStatus;
            Intrinsics.checkNotNullParameter(arr_blogMainChallenge$ParticipationStatus, "entries");
            ParticipationStatus.e = new sd.a(arr_blogMainChallenge$ParticipationStatus);
        }

        public ParticipationStatus(int v1, long v2, long v3) {
            this.a = v1;
            this.b = v2;
            this.c = v3;
        }

        public final long getBorderColor-0d7_KjU() {
            return this.c;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return ParticipationStatus.e;
        }

        public final int getLabelRes() {
            return this.a;
        }

        public final long getTextColor-0d7_KjU() {
            return this.b;
        }
    }

    @Immutable
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0016\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J4\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000EJ\u0010\u0010\u0015\u001A\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001A\u0010\u001A\u001A\u00020\u00192\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001A\u0010\u001BR\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\fR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\u000ER\u001D\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\u0010¨\u0006%"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainChallenge$Preview;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainChallenge;", "Lcom/kakao/tistory/domain/blog/entity/ChallengeStatus;", "status", "", "image", "Lkotlin/Function0;", "", "onClickChallenge", "<init>", "(Lcom/kakao/tistory/domain/blog/entity/ChallengeStatus;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "component1", "()Lcom/kakao/tistory/domain/blog/entity/ChallengeStatus;", "component2", "()Ljava/lang/String;", "component3", "()Lkotlin/jvm/functions/Function0;", "copy", "(Lcom/kakao/tistory/domain/blog/entity/ChallengeStatus;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainChallenge$Preview;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/domain/blog/entity/ChallengeStatus;", "getStatus", "b", "Ljava/lang/String;", "getImage", "c", "Lkotlin/jvm/functions/Function0;", "getOnClickChallenge", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Preview implements BlogMainChallenge {
        public static final int $stable;
        public final ChallengeStatus a;
        public final String b;
        public final Function0 c;

        public Preview(@NotNull ChallengeStatus challengeStatus0, @NotNull String s, @NotNull Function0 function00) {
            Intrinsics.checkNotNullParameter(challengeStatus0, "status");
            Intrinsics.checkNotNullParameter(s, "image");
            Intrinsics.checkNotNullParameter(function00, "onClickChallenge");
            super();
            this.a = challengeStatus0;
            this.b = s;
            this.c = function00;
        }

        @NotNull
        public final ChallengeStatus component1() {
            return this.a;
        }

        @NotNull
        public final String component2() {
            return this.b;
        }

        @NotNull
        public final Function0 component3() {
            return this.c;
        }

        @NotNull
        public final Preview copy(@NotNull ChallengeStatus challengeStatus0, @NotNull String s, @NotNull Function0 function00) {
            Intrinsics.checkNotNullParameter(challengeStatus0, "status");
            Intrinsics.checkNotNullParameter(s, "image");
            Intrinsics.checkNotNullParameter(function00, "onClickChallenge");
            return new Preview(challengeStatus0, s, function00);
        }

        public static Preview copy$default(Preview blogMainChallenge$Preview0, ChallengeStatus challengeStatus0, String s, Function0 function00, int v, Object object0) {
            if((v & 1) != 0) {
                challengeStatus0 = blogMainChallenge$Preview0.a;
            }
            if((v & 2) != 0) {
                s = blogMainChallenge$Preview0.b;
            }
            if((v & 4) != 0) {
                function00 = blogMainChallenge$Preview0.c;
            }
            return blogMainChallenge$Preview0.copy(challengeStatus0, s, function00);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Preview)) {
                return false;
            }
            if(this.a != ((Preview)object0).a) {
                return false;
            }
            return Intrinsics.areEqual(this.b, ((Preview)object0).b) ? Intrinsics.areEqual(this.c, ((Preview)object0).c) : false;
        }

        @NotNull
        public final String getImage() {
            return this.b;
        }

        @NotNull
        public final Function0 getOnClickChallenge() {
            return this.c;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainChallenge
        @NotNull
        public ChallengeStatus getStatus() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.c.hashCode() + com.kakao.tistory.presentation.common.graph.a.a(this.b, this.a.hashCode() * 0x1F, 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Preview(status=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", image=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", onClickChallenge=");
            return q.q(stringBuilder0, this.c, ")");
        }
    }

    @NotNull
    ChallengeStatus getStatus();
}

