package com.kakao.tistory.presentation.screen.home.item;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import com.kakao.tistory.domain.home.entity.HomeSlot.Position;
import com.kakao.tistory.presentation.main.contract.a;
import com.kakao.tistory.presentation.main.contract.c;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.concurrent.Immutable;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u000B\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001A\u001BR\u0018\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001A\u00020\bX¦\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\nR\u0012\u0010\u000B\u001A\u00020\fX¦\u0004¢\u0006\u0006\u001A\u0004\b\r\u0010\u000ER\u0016\u0010\u000F\u001A\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u000E\u0082\u0001\b\u001C\u001D\u001E\u001F !\"#¨\u0006$"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState;", "", "contents", "", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent;", "getContents", "()Ljava/util/List;", "position", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "getPosition", "()Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "slotType", "", "getSlotType", "()Ljava/lang/String;", "title", "getTitle", "Banner", "Best", "Category", "CategoryGroup", "Creator", "Focus", "FollowableContents", "Page", "Subscription", "Tip", "Today", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Banner;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Best;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Category;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Creator;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Focus;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Subscription;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Tip;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Today;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface HomeSlotUiState {
    @StabilityInferred(parameters = 0)
    @Immutable
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000E\b\u0002\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\f\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u0012J\u0016\u0010\u0018\u001A\u00020\u0007H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\n0\tH\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0016\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\r0\fH\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJ[\u0010\u001F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00072\u000E\b\u0002\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t2\u000E\b\u0002\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\fH\u00C6\u0001\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010 \u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b \u0010\u0012J\u0010\u0010\"\u001A\u00020!H\u00D6\u0001\u00A2\u0006\u0004\b\"\u0010#J\u001A\u0010\'\u001A\u00020&2\b\u0010%\u001A\u0004\u0018\u00010$H\u00D6\u0003\u00A2\u0006\u0004\b\'\u0010(R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010\u0012R\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010\u0014R\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b/\u0010*\u001A\u0004\b0\u0010\u0012R\u001D\u0010\b\u001A\u00020\u00078\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b1\u00102\u001A\u0004\b3\u0010\u0017R\u001D\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t8\u0006\u00A2\u0006\f\n\u0004\b4\u00105\u001A\u0004\b6\u0010\u001AR \u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010\u001C\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006:"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Banner;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState;", "", "slotType", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "position", "imageUrl", "Landroidx/compose/ui/graphics/Color;", "color", "Lkotlin/Function0;", "", "onClick", "", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent;", "contents", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/lang/String;JLkotlin/jvm/functions/Function0;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "component3", "component4-0d7_KjU", "()J", "component4", "component5", "()Lkotlin/jvm/functions/Function0;", "component6", "()Ljava/util/List;", "copy-Bx497Mc", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/lang/String;JLkotlin/jvm/functions/Function0;Ljava/util/List;)Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Banner;", "copy", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSlotType", "b", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "getPosition", "c", "getImageUrl", "d", "J", "getColor-0d7_KjU", "e", "Lkotlin/jvm/functions/Function0;", "getOnClick", "f", "Ljava/util/List;", "getContents", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Banner implements HomeSlotUiState {
        public static final int $stable = 8;
        public final String a;
        public final Position b;
        public final String c;
        public final long d;
        public final Function0 e;
        public final List f;

        public Banner(String s, Position homeSlot$Position0, String s1, long v, Function0 function00, List list0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            this(((v1 & 1) == 0 ? s : ""), ((v1 & 2) == 0 ? homeSlot$Position0 : Position.LEFT), s1, v, function00, ((v1 & 0x20) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList()), null);
        }

        public Banner(String s, Position homeSlot$Position0, String s1, long v, Function0 function00, List list0, DefaultConstructorMarker defaultConstructorMarker0) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(s1, "imageUrl");
            Intrinsics.checkNotNullParameter(function00, "onClick");
            Intrinsics.checkNotNullParameter(list0, "contents");
            super();
            this.a = s;
            this.b = homeSlot$Position0;
            this.c = s1;
            this.d = v;
            this.e = function00;
            this.f = list0;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final Position component2() {
            return this.b;
        }

        @NotNull
        public final String component3() {
            return this.c;
        }

        public final long component4-0d7_KjU() {
            return this.d;
        }

        @NotNull
        public final Function0 component5() {
            return this.e;
        }

        @NotNull
        public final List component6() {
            return this.f;
        }

        @NotNull
        public final Banner copy-Bx497Mc(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull String s1, long v, @NotNull Function0 function00, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(s1, "imageUrl");
            Intrinsics.checkNotNullParameter(function00, "onClick");
            Intrinsics.checkNotNullParameter(list0, "contents");
            return new Banner(s, homeSlot$Position0, s1, v, function00, list0, null);
        }

        public static Banner copy-Bx497Mc$default(Banner homeSlotUiState$Banner0, String s, Position homeSlot$Position0, String s1, long v, Function0 function00, List list0, int v1, Object object0) {
            if((v1 & 1) != 0) {
                s = homeSlotUiState$Banner0.a;
            }
            if((v1 & 2) != 0) {
                homeSlot$Position0 = homeSlotUiState$Banner0.b;
            }
            if((v1 & 4) != 0) {
                s1 = homeSlotUiState$Banner0.c;
            }
            if((v1 & 8) != 0) {
                v = homeSlotUiState$Banner0.d;
            }
            if((v1 & 16) != 0) {
                function00 = homeSlotUiState$Banner0.e;
            }
            if((v1 & 0x20) != 0) {
                list0 = homeSlotUiState$Banner0.f;
            }
            return homeSlotUiState$Banner0.copy-Bx497Mc(s, homeSlot$Position0, s1, v, function00, list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Banner)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Banner)object0).a)) {
                return false;
            }
            if(this.b != ((Banner)object0).b) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((Banner)object0).c)) {
                return false;
            }
            if(!Color.equals-impl0(this.d, ((Banner)object0).d)) {
                return false;
            }
            return Intrinsics.areEqual(this.e, ((Banner)object0).e) ? Intrinsics.areEqual(this.f, ((Banner)object0).f) : false;
        }

        public final long getColor-0d7_KjU() {
            return this.d;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @NotNull
        public List getContents() {
            return this.f;
        }

        @NotNull
        public final String getImageUrl() {
            return this.c;
        }

        @NotNull
        public final Function0 getOnClick() {
            return this.e;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @NotNull
        public Position getPosition() {
            return this.b;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @NotNull
        public String getSlotType() {
            return this.a;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @Nullable
        public String getTitle() {
            return null;
        }

        @Override
        public int hashCode() {
            return this.f.hashCode() + a.a(this.e, wb.a.a(this.d, com.kakao.tistory.presentation.common.graph.a.a(this.c, (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F, 0x1F), 0x1F), 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            String s = Color.toString-impl(this.d);
            StringBuilder stringBuilder0 = new StringBuilder("Banner(slotType=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", position=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", imageUrl=");
            androidx.room.a.w(stringBuilder0, this.c, ", color=", s, ", onClick=");
            stringBuilder0.append(this.e);
            stringBuilder0.append(", contents=");
            stringBuilder0.append(this.f);
            stringBuilder0.append(")");
            return stringBuilder0.toString();
        }
    }

    @StabilityInferred(parameters = 0)
    @Immutable
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0016\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J4\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001A\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001A\u0010\u001A\u001A\u00020\u00192\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001A\u0010\u001BR\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\fR\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\u000ER \u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\u0010¨\u0006%"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Best;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState;", "", "slotType", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "position", "", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Best;", "contents", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/util/List;)Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Best;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSlotType", "b", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "getPosition", "c", "Ljava/util/List;", "getContents", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nHomeSlotUiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeSlotUiState.kt\ncom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Best\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,433:1\n1#2:434\n*E\n"})
    public static final class Best implements HomeSlotUiState {
        public static final int $stable = 8;
        public final String a;
        public final Position b;
        public final List c;

        public Best(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(list0, "contents");
            super();
            this.a = s;
            this.b = homeSlot$Position0;
            this.c = list0;
            if(this.getContents().isEmpty()) {
                throw new IllegalArgumentException("Best contents should not be empty");
            }
        }

        public Best(String s, Position homeSlot$Position0, List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                s = "";
            }
            if((v & 2) != 0) {
                homeSlot$Position0 = Position.LEFT;
            }
            this(s, homeSlot$Position0, list0);
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final Position component2() {
            return this.b;
        }

        @NotNull
        public final List component3() {
            return this.c;
        }

        @NotNull
        public final Best copy(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(list0, "contents");
            return new Best(s, homeSlot$Position0, list0);
        }

        public static Best copy$default(Best homeSlotUiState$Best0, String s, Position homeSlot$Position0, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                s = homeSlotUiState$Best0.a;
            }
            if((v & 2) != 0) {
                homeSlot$Position0 = homeSlotUiState$Best0.b;
            }
            if((v & 4) != 0) {
                list0 = homeSlotUiState$Best0.c;
            }
            return homeSlotUiState$Best0.copy(s, homeSlot$Position0, list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Best)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Best)object0).a)) {
                return false;
            }
            return this.b == ((Best)object0).b ? Intrinsics.areEqual(this.c, ((Best)object0).c) : false;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @NotNull
        public List getContents() {
            return this.c;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @NotNull
        public Position getPosition() {
            return this.b;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @NotNull
        public String getSlotType() {
            return this.a;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @Nullable
        public String getTitle() {
            return null;
        }

        @Override
        public int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Best(slotType=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", position=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", contents=");
            return wb.a.e(stringBuilder0, this.c, ")");
        }
    }

    @StabilityInferred(parameters = 0)
    @Immutable
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u001B\b\u0087\b\u0018\u0000 D2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001DBq\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0004\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000B\u001A\u00020\n\u0012\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u0006\u0010\u000E\u001A\u00020\u0004\u0012\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\f\u0012\u0014\b\u0002\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001B\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u0018J\u0012\u0010\u001C\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u0018J\u0010\u0010\u001D\u001A\u00020\nH\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0016\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u00030\fH\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010!\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\u0018J\u0016\u0010\"\u001A\b\u0012\u0004\u0012\u00020\u000F0\fH\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010 J\u001C\u0010#\u001A\u000E\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u00C6\u0003\u00A2\u0006\u0004\b#\u0010$J\u0084\u0001\u0010%\u001A\u00020\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00042\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000B\u001A\u00020\n2\u000E\b\u0002\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00030\f2\b\b\u0002\u0010\u000E\u001A\u00020\u00042\u000E\b\u0002\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\f2\u0014\b\u0002\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u00C6\u0001\u00A2\u0006\u0004\b%\u0010&J\u0010\u0010\'\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b\'\u0010\u0018J\u0010\u0010(\u001A\u00020\u0012H\u00D6\u0001\u00A2\u0006\u0004\b(\u0010)J\u001A\u0010,\u001A\u00020\n2\b\u0010+\u001A\u0004\u0018\u00010*H\u00D6\u0003\u00A2\u0006\u0004\b,\u0010-R\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b0\u0010\u0018R\u001A\u0010\u0007\u001A\u00020\u00068\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b1\u00102\u001A\u0004\b3\u0010\u001AR\u001A\u0010\b\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b4\u0010/\u001A\u0004\b5\u0010\u0018R\u0019\u0010\t\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\b6\u0010/\u001A\u0004\b7\u0010\u0018R\u0017\u0010\u000B\u001A\u00020\n8\u0006\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b\u000B\u0010\u001ER \u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00030\f8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010 R\u0017\u0010\u000E\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b=\u0010/\u001A\u0004\b>\u0010\u0018R\u001D\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\f8\u0006\u00A2\u0006\f\n\u0004\b?\u0010;\u001A\u0004\b@\u0010 R&\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00118\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bA\u0010B\u001A\u0004\bC\u0010$\u00A8\u0006E"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Category;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Page;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Category;", "", "slotType", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "position", "title", "emoji", "", "isLoading", "", "contents", "activeCategoryGroupId", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$CategoryGroup;", "categoryGroups", "Lkotlin/Function1;", "", "", "onIndexChanged", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "component3", "component4", "component5", "()Z", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "()Lkotlin/jvm/functions/Function1;", "copy", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Category;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "h", "Ljava/lang/String;", "getSlotType", "i", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "getPosition", "j", "getTitle", "k", "getEmoji", "l", "Z", "m", "Ljava/util/List;", "getContents", "n", "getActiveCategoryGroupId", "o", "getCategoryGroups", "p", "Lkotlin/jvm/functions/Function1;", "getOnIndexChanged", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nHomeSlotUiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeSlotUiState.kt\ncom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Category\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,433:1\n1#2:434\n*E\n"})
    public static final class Category extends Page implements HomeSlotUiState {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Category$Companion;", "", "", "CONTENT_PER_PAGE", "I", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }
        }

        public static final int $stable = 0;
        public static final int CONTENT_PER_PAGE = 7;
        @NotNull
        public static final Companion Companion;
        public final String h;
        public final Position i;
        public final String j;
        public final String k;
        public final boolean l;
        public final List m;
        public final String n;
        public final List o;
        public final Function1 p;

        static {
            Category.Companion = new Companion(null);
            Category.$stable = 8;
        }

        public Category(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull String s1, @Nullable String s2, boolean z, @NotNull List list0, @NotNull String s3, @NotNull List list1, @NotNull Function1 function10) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(s1, "title");
            Intrinsics.checkNotNullParameter(list0, "contents");
            Intrinsics.checkNotNullParameter(s3, "activeCategoryGroupId");
            Intrinsics.checkNotNullParameter(list1, "categoryGroups");
            Intrinsics.checkNotNullParameter(function10, "onIndexChanged");
            Object object0 = null;
            super(7, 0, 2, null);
            this.h = s;
            this.i = homeSlot$Position0;
            this.j = s1;
            this.k = s2;
            this.l = z;
            this.m = list0;
            this.n = s3;
            this.o = list1;
            this.p = function10;
            if(this.getContents().size() < 7) {
                throw new IllegalArgumentException(("Category contents should be more than 7 but " + this.getContents().size() + " category = " + s3).toString());
            }
            if(list1.isEmpty()) {
                throw new IllegalArgumentException("Category groups should not be empty");
            }
            for(Object object1: list1) {
                if(Intrinsics.areEqual(((CategoryGroup)object1).getId(), this.n)) {
                    object0 = object1;
                    break;
                }
                if(false) {
                    break;
                }
            }
            if(object0 == null) {
                throw new IllegalArgumentException("Active category group should be in category groups");
            }
        }

        public Category(String s, Position homeSlot$Position0, String s1, String s2, boolean z, List list0, String s3, List list1, Function1 function10, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            Position homeSlot$Position1 = (v & 2) == 0 ? homeSlot$Position0 : Position.LEFT;
            Function1 function11 = (v & 0x100) == 0 ? function10 : x.a;
            this(((v & 1) == 0 ? s : ""), homeSlot$Position1, s1, s2, ((v & 16) == 0 ? z : false), list0, s3, list1, function11);
        }

        @NotNull
        public final String component1() {
            return this.h;
        }

        @NotNull
        public final Position component2() {
            return this.i;
        }

        @NotNull
        public final String component3() {
            return this.j;
        }

        @Nullable
        public final String component4() {
            return this.k;
        }

        public final boolean component5() {
            return this.l;
        }

        @NotNull
        public final List component6() {
            return this.m;
        }

        @NotNull
        public final String component7() {
            return this.n;
        }

        @NotNull
        public final List component8() {
            return this.o;
        }

        @NotNull
        public final Function1 component9() {
            return this.p;
        }

        @NotNull
        public final Category copy(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull String s1, @Nullable String s2, boolean z, @NotNull List list0, @NotNull String s3, @NotNull List list1, @NotNull Function1 function10) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(s1, "title");
            Intrinsics.checkNotNullParameter(list0, "contents");
            Intrinsics.checkNotNullParameter(s3, "activeCategoryGroupId");
            Intrinsics.checkNotNullParameter(list1, "categoryGroups");
            Intrinsics.checkNotNullParameter(function10, "onIndexChanged");
            return new Category(s, homeSlot$Position0, s1, s2, z, list0, s3, list1, function10);
        }

        public static Category copy$default(Category homeSlotUiState$Category0, String s, Position homeSlot$Position0, String s1, String s2, boolean z, List list0, String s3, List list1, Function1 function10, int v, Object object0) {
            String s4 = (v & 1) == 0 ? s : homeSlotUiState$Category0.h;
            Position homeSlot$Position1 = (v & 2) == 0 ? homeSlot$Position0 : homeSlotUiState$Category0.i;
            String s5 = (v & 4) == 0 ? s1 : homeSlotUiState$Category0.j;
            String s6 = (v & 8) == 0 ? s2 : homeSlotUiState$Category0.k;
            boolean z1 = (v & 16) == 0 ? z : homeSlotUiState$Category0.l;
            List list2 = (v & 0x20) == 0 ? list0 : homeSlotUiState$Category0.m;
            String s7 = (v & 0x40) == 0 ? s3 : homeSlotUiState$Category0.n;
            List list3 = (v & 0x80) == 0 ? list1 : homeSlotUiState$Category0.o;
            return (v & 0x100) == 0 ? homeSlotUiState$Category0.copy(s4, homeSlot$Position1, s5, s6, z1, list2, s7, list3, function10) : homeSlotUiState$Category0.copy(s4, homeSlot$Position1, s5, s6, z1, list2, s7, list3, homeSlotUiState$Category0.p);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Category)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.h, ((Category)object0).h)) {
                return false;
            }
            if(this.i != ((Category)object0).i) {
                return false;
            }
            if(!Intrinsics.areEqual(this.j, ((Category)object0).j)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.k, ((Category)object0).k)) {
                return false;
            }
            if(this.l != ((Category)object0).l) {
                return false;
            }
            if(!Intrinsics.areEqual(this.m, ((Category)object0).m)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.n, ((Category)object0).n)) {
                return false;
            }
            return Intrinsics.areEqual(this.o, ((Category)object0).o) ? Intrinsics.areEqual(this.p, ((Category)object0).p) : false;
        }

        @NotNull
        public final String getActiveCategoryGroupId() {
            return this.n;
        }

        @NotNull
        public final List getCategoryGroups() {
            return this.o;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState$Page, com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @NotNull
        public List getContents() {
            return this.m;
        }

        @Nullable
        public final String getEmoji() {
            return this.k;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState$Page
        @NotNull
        public Function1 getOnIndexChanged() {
            return this.p;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @NotNull
        public Position getPosition() {
            return this.i;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @NotNull
        public String getSlotType() {
            return this.h;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @NotNull
        public String getTitle() {
            return this.j;
        }

        @Override
        public int hashCode() {
            int v = com.kakao.tistory.presentation.common.graph.a.a(this.j, (this.i.hashCode() + this.h.hashCode() * 0x1F) * 0x1F, 0x1F);
            return this.k == null ? this.p.hashCode() + b.c(this.o, com.kakao.tistory.presentation.common.graph.a.a(this.n, b.c(this.m, c.a(this.l, v * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F) : this.p.hashCode() + b.c(this.o, com.kakao.tistory.presentation.common.graph.a.a(this.n, b.c(this.m, c.a(this.l, (v + this.k.hashCode()) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F);
        }

        public final boolean isLoading() {
            return this.l;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Category(slotType=");
            stringBuilder0.append(this.h);
            stringBuilder0.append(", position=");
            stringBuilder0.append(this.i);
            stringBuilder0.append(", title=");
            androidx.room.a.w(stringBuilder0, this.j, ", emoji=", this.k, ", isLoading=");
            stringBuilder0.append(this.l);
            stringBuilder0.append(", contents=");
            stringBuilder0.append(this.m);
            stringBuilder0.append(", activeCategoryGroupId=");
            stringBuilder0.append(this.n);
            stringBuilder0.append(", categoryGroups=");
            stringBuilder0.append(this.o);
            stringBuilder0.append(", onIndexChanged=");
            stringBuilder0.append(this.p);
            stringBuilder0.append(")");
            return stringBuilder0.toString();
        }
    }

    @StabilityInferred(parameters = 1)
    @Immutable
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000B\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u000EJ\u0012\u0010\u0010\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0016\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JL\u0010\u0015\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00052\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000EJ\u0010\u0010\u0018\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001A\u0010\u001C\u001A\u00020\u001B2\b\u0010\u001A\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001C\u0010\u001DR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010\u000ER\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001F\u001A\u0004\b\"\u0010\u000ER\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010\u0011R\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b&\u0010$\u001A\u0004\b\'\u0010\u0011R\u001D\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010\u0014¨\u0006+"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$CategoryGroup;", "", "", "id", "label", "", "iconRes", "selectedIconRes", "Lkotlin/Function0;", "", "onClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "()Lkotlin/jvm/functions/Function0;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$CategoryGroup;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "getLabel", "c", "Ljava/lang/Integer;", "getIconRes", "d", "getSelectedIconRes", "e", "Lkotlin/jvm/functions/Function0;", "getOnClick", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class CategoryGroup {
        public static final int $stable;
        public final String a;
        public final String b;
        public final Integer c;
        public final Integer d;
        public final Function0 e;

        public CategoryGroup(@NotNull String s, @NotNull String s1, @Nullable Integer integer0, @Nullable Integer integer1, @NotNull Function0 function00) {
            Intrinsics.checkNotNullParameter(s, "id");
            Intrinsics.checkNotNullParameter(s1, "label");
            Intrinsics.checkNotNullParameter(function00, "onClick");
            super();
            this.a = s;
            this.b = s1;
            this.c = integer0;
            this.d = integer1;
            this.e = function00;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final String component2() {
            return this.b;
        }

        @Nullable
        public final Integer component3() {
            return this.c;
        }

        @Nullable
        public final Integer component4() {
            return this.d;
        }

        @NotNull
        public final Function0 component5() {
            return this.e;
        }

        @NotNull
        public final CategoryGroup copy(@NotNull String s, @NotNull String s1, @Nullable Integer integer0, @Nullable Integer integer1, @NotNull Function0 function00) {
            Intrinsics.checkNotNullParameter(s, "id");
            Intrinsics.checkNotNullParameter(s1, "label");
            Intrinsics.checkNotNullParameter(function00, "onClick");
            return new CategoryGroup(s, s1, integer0, integer1, function00);
        }

        public static CategoryGroup copy$default(CategoryGroup homeSlotUiState$CategoryGroup0, String s, String s1, Integer integer0, Integer integer1, Function0 function00, int v, Object object0) {
            if((v & 1) != 0) {
                s = homeSlotUiState$CategoryGroup0.a;
            }
            if((v & 2) != 0) {
                s1 = homeSlotUiState$CategoryGroup0.b;
            }
            if((v & 4) != 0) {
                integer0 = homeSlotUiState$CategoryGroup0.c;
            }
            if((v & 8) != 0) {
                integer1 = homeSlotUiState$CategoryGroup0.d;
            }
            if((v & 16) != 0) {
                function00 = homeSlotUiState$CategoryGroup0.e;
            }
            return homeSlotUiState$CategoryGroup0.copy(s, s1, integer0, integer1, function00);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof CategoryGroup)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((CategoryGroup)object0).a)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((CategoryGroup)object0).b)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((CategoryGroup)object0).c)) {
                return false;
            }
            return Intrinsics.areEqual(this.d, ((CategoryGroup)object0).d) ? Intrinsics.areEqual(this.e, ((CategoryGroup)object0).e) : false;
        }

        @Nullable
        public final Integer getIconRes() {
            return this.c;
        }

        @NotNull
        public final String getId() {
            return this.a;
        }

        @NotNull
        public final String getLabel() {
            return this.b;
        }

        @NotNull
        public final Function0 getOnClick() {
            return this.e;
        }

        @Nullable
        public final Integer getSelectedIconRes() {
            return this.d;
        }

        @Override
        public int hashCode() {
            int v = com.kakao.tistory.presentation.common.graph.a.a(this.b, this.a.hashCode() * 0x1F, 0x1F);
            int v1 = 0;
            int v2 = this.c == null ? 0 : this.c.hashCode();
            Integer integer0 = this.d;
            if(integer0 != null) {
                v1 = integer0.hashCode();
            }
            return this.e.hashCode() + ((v + v2) * 0x1F + v1) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = b.w("CategoryGroup(id=", this.a, ", label=", this.b, ", iconRes=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", selectedIconRes=");
            stringBuilder0.append(this.d);
            stringBuilder0.append(", onClick=");
            return q.q(stringBuilder0, this.e, ")");
        }
    }

    @StabilityInferred(parameters = 0)
    @Immutable
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0019\b\u0087\b\u0018\u0000 D2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001DBo\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\t\u001A\u00020\u0005\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u0005\u0012\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000B\u0012\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00040\u000E\u0012\u0014\b\u0002\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000B\u0012\b\b\u0002\u0010\u0012\u001A\u00020\u0010\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001A\u00020\u00012\u0006\u0010\u0015\u001A\u00020\u0005H\u0016\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001A\u00020\u00012\u0006\u0010\u0015\u001A\u00020\u0005H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001B\u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001D\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001AJ\u0012\u0010\u001E\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001AJ\u001C\u0010\u001F\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000BH\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010 J\u0016\u0010!\u001A\b\u0012\u0004\u0012\u00020\u00040\u000EH\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\"J\u001C\u0010#\u001A\u000E\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000BH\u00C6\u0003\u00A2\u0006\u0004\b#\u0010 J\u0010\u0010$\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0004\b$\u0010%J\u0080\u0001\u0010&\u001A\u00020\u00002\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00052\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\r\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000B2\u000E\b\u0002\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00040\u000E2\u0014\b\u0002\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000B2\b\b\u0002\u0010\u0012\u001A\u00020\u0010H\u00C6\u0001\u00A2\u0006\u0004\b&\u0010\'J\u0010\u0010(\u001A\u00020\u0005H\u00D6\u0001\u00A2\u0006\u0004\b(\u0010\u001AJ\u0010\u0010)\u001A\u00020\u0010H\u00D6\u0001\u00A2\u0006\u0004\b)\u0010%J\u001A\u0010-\u001A\u00020,2\b\u0010+\u001A\u0004\u0018\u00010*H\u00D6\u0003\u00A2\u0006\u0004\b-\u0010.R\u001A\u0010\u0006\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u0010\u001AR\u001A\u0010\b\u001A\u00020\u00078\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u0010\u001CR\u001A\u0010\t\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b5\u00100\u001A\u0004\b6\u0010\u001AR\u0019\u0010\n\u001A\u0004\u0018\u00010\u00058\u0006\u00A2\u0006\f\n\u0004\b7\u00100\u001A\u0004\b8\u0010\u001AR#\u0010\r\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000B8\u0006\u00A2\u0006\f\n\u0004\b9\u0010:\u001A\u0004\b;\u0010 R \u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00040\u000E8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b<\u0010=\u001A\u0004\b>\u0010\"R&\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000B8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b?\u0010:\u001A\u0004\b@\u0010 R\u0017\u0010\u0012\u001A\u00020\u00108\u0006\u00A2\u0006\f\n\u0004\bA\u0010B\u001A\u0004\bC\u0010%\u00A8\u0006E"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Creator;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$FollowableContents;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Page;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Creator;", "", "slotType", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "position", "title", "emoji", "Lkotlin/Function1;", "", "onClickUrl", "", "contents", "", "onIndexChanged", "initPageIndex", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;I)V", "blogName", "follow", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState;", "unFollow", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "component3", "component4", "component5", "()Lkotlin/jvm/functions/Function1;", "component6", "()Ljava/util/List;", "component7", "component8", "()I", "copy", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;I)Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Creator;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "h", "Ljava/lang/String;", "getSlotType", "i", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "getPosition", "j", "getTitle", "k", "getEmoji", "l", "Lkotlin/jvm/functions/Function1;", "getOnClickUrl", "m", "Ljava/util/List;", "getContents", "n", "getOnIndexChanged", "o", "I", "getInitPageIndex", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nHomeSlotUiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeSlotUiState.kt\ncom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Creator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,433:1\n1#2:434\n1549#3:435\n1620#3,3:436\n1549#3:439\n1620#3,3:440\n*S KotlinDebug\n*F\n+ 1 HomeSlotUiState.kt\ncom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Creator\n*L\n109#1:435\n109#1:436,3\n119#1:439\n119#1:440,3\n*E\n"})
    public static final class Creator extends Page implements FollowableContents, HomeSlotUiState {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Creator$Companion;", "", "", "CONTENT_PER_PAGE", "I", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Creator.Companion {
            public com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Creator.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }
        }

        public static final int $stable = 0;
        public static final int CONTENT_PER_PAGE = 2;
        @NotNull
        public static final com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Creator.Companion Companion;
        public final String h;
        public final Position i;
        public final String j;
        public final String k;
        public final Function1 l;
        public final List m;
        public final Function1 n;
        public final int o;

        static {
            Creator.Companion = new com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Creator.Companion(null);
            Creator.$stable = 8;
        }

        public Creator(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull String s1, @Nullable String s2, @NotNull Function1 function10, @NotNull List list0, @NotNull Function1 function11, int v) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(s1, "title");
            Intrinsics.checkNotNullParameter(function10, "onClickUrl");
            Intrinsics.checkNotNullParameter(list0, "contents");
            Intrinsics.checkNotNullParameter(function11, "onIndexChanged");
            super(2, v);
            this.h = s;
            this.i = homeSlot$Position0;
            this.j = s1;
            this.k = s2;
            this.l = function10;
            this.m = list0;
            this.n = function11;
            this.o = v;
            if(this.getContents().size() < 2) {
                throw new IllegalArgumentException(b.e(this.getContents().size(), "Creator contents should be more than 2 but ").toString());
            }
        }

        public Creator(String s, Position homeSlot$Position0, String s1, String s2, Function1 function10, List list0, Function1 function11, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            Position homeSlot$Position1 = (v1 & 2) == 0 ? homeSlot$Position0 : Position.LEFT;
            Function1 function12 = (v1 & 0x40) == 0 ? function11 : y.a;
            this(((v1 & 1) == 0 ? s : ""), homeSlot$Position1, s1, s2, function10, list0, function12, ((v1 & 0x80) == 0 ? v : 0));
        }

        @NotNull
        public final String component1() {
            return this.h;
        }

        @NotNull
        public final Position component2() {
            return this.i;
        }

        @NotNull
        public final String component3() {
            return this.j;
        }

        @Nullable
        public final String component4() {
            return this.k;
        }

        @NotNull
        public final Function1 component5() {
            return this.l;
        }

        @NotNull
        public final List component6() {
            return this.m;
        }

        @NotNull
        public final Function1 component7() {
            return this.n;
        }

        public final int component8() {
            return this.o;
        }

        @NotNull
        public final Creator copy(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull String s1, @Nullable String s2, @NotNull Function1 function10, @NotNull List list0, @NotNull Function1 function11, int v) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(s1, "title");
            Intrinsics.checkNotNullParameter(function10, "onClickUrl");
            Intrinsics.checkNotNullParameter(list0, "contents");
            Intrinsics.checkNotNullParameter(function11, "onIndexChanged");
            return new Creator(s, homeSlot$Position0, s1, s2, function10, list0, function11, v);
        }

        public static Creator copy$default(Creator homeSlotUiState$Creator0, String s, Position homeSlot$Position0, String s1, String s2, Function1 function10, List list0, Function1 function11, int v, int v1, Object object0) {
            String s3 = (v1 & 1) == 0 ? s : homeSlotUiState$Creator0.h;
            Position homeSlot$Position1 = (v1 & 2) == 0 ? homeSlot$Position0 : homeSlotUiState$Creator0.i;
            String s4 = (v1 & 4) == 0 ? s1 : homeSlotUiState$Creator0.j;
            String s5 = (v1 & 8) == 0 ? s2 : homeSlotUiState$Creator0.k;
            Function1 function12 = (v1 & 16) == 0 ? function10 : homeSlotUiState$Creator0.l;
            List list1 = (v1 & 0x20) == 0 ? list0 : homeSlotUiState$Creator0.m;
            Function1 function13 = (v1 & 0x40) == 0 ? function11 : homeSlotUiState$Creator0.n;
            return (v1 & 0x80) == 0 ? homeSlotUiState$Creator0.copy(s3, homeSlot$Position1, s4, s5, function12, list1, function13, v) : homeSlotUiState$Creator0.copy(s3, homeSlot$Position1, s4, s5, function12, list1, function13, homeSlotUiState$Creator0.o);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Creator)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.h, ((Creator)object0).h)) {
                return false;
            }
            if(this.i != ((Creator)object0).i) {
                return false;
            }
            if(!Intrinsics.areEqual(this.j, ((Creator)object0).j)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.k, ((Creator)object0).k)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.l, ((Creator)object0).l)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.m, ((Creator)object0).m)) {
                return false;
            }
            return Intrinsics.areEqual(this.n, ((Creator)object0).n) ? this.o == ((Creator)object0).o : false;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState$FollowableContents
        @NotNull
        public HomeSlotUiState follow(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            List list0 = this.getContents();
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
            for(Object object0: list0) {
                com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Creator homeSlotUiStateContent$Creator0 = (com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Creator)object0;
                if(Intrinsics.areEqual(homeSlotUiStateContent$Creator0.getBlogName(), s)) {
                    homeSlotUiStateContent$Creator0 = homeSlotUiStateContent$Creator0.follow();
                }
                arrayList0.add(homeSlotUiStateContent$Creator0);
            }
            return Creator.copy$default(this, null, null, null, null, null, arrayList0, null, ((Number)this.getCurrentIndex().getValue()).intValue(), 0x5F, null);
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState$Page, com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState, com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState$FollowableContents
        @NotNull
        public List getContents() {
            return this.m;
        }

        @Nullable
        public final String getEmoji() {
            return this.k;
        }

        public final int getInitPageIndex() {
            return this.o;
        }

        @NotNull
        public final Function1 getOnClickUrl() {
            return this.l;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState$Page
        @NotNull
        public Function1 getOnIndexChanged() {
            return this.n;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @NotNull
        public Position getPosition() {
            return this.i;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @NotNull
        public String getSlotType() {
            return this.h;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @NotNull
        public String getTitle() {
            return this.j;
        }

        @Override
        public int hashCode() {
            int v = com.kakao.tistory.presentation.common.graph.a.a(this.j, (this.i.hashCode() + this.h.hashCode() * 0x1F) * 0x1F, 0x1F);
            return this.k == null ? this.o + com.kakao.tistory.presentation.main.contract.b.a(this.n, b.c(this.m, com.kakao.tistory.presentation.main.contract.b.a(this.l, v * 0x1F, 0x1F), 0x1F), 0x1F) : this.o + com.kakao.tistory.presentation.main.contract.b.a(this.n, b.c(this.m, com.kakao.tistory.presentation.main.contract.b.a(this.l, (v + this.k.hashCode()) * 0x1F, 0x1F), 0x1F), 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Creator(slotType=");
            stringBuilder0.append(this.h);
            stringBuilder0.append(", position=");
            stringBuilder0.append(this.i);
            stringBuilder0.append(", title=");
            androidx.room.a.w(stringBuilder0, this.j, ", emoji=", this.k, ", onClickUrl=");
            stringBuilder0.append(this.l);
            stringBuilder0.append(", contents=");
            stringBuilder0.append(this.m);
            stringBuilder0.append(", onIndexChanged=");
            stringBuilder0.append(this.n);
            stringBuilder0.append(", initPageIndex=");
            stringBuilder0.append(this.o);
            stringBuilder0.append(")");
            return stringBuilder0.toString();
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState$FollowableContents
        @NotNull
        public HomeSlotUiState unFollow(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            List list0 = this.getContents();
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
            for(Object object0: list0) {
                com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Creator homeSlotUiStateContent$Creator0 = (com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Creator)object0;
                if(Intrinsics.areEqual(homeSlotUiStateContent$Creator0.getBlogName(), s)) {
                    homeSlotUiStateContent$Creator0 = homeSlotUiStateContent$Creator0.unFollow();
                }
                arrayList0.add(homeSlotUiStateContent$Creator0);
            }
            return Creator.copy$default(this, null, null, null, null, null, arrayList0, null, ((Number)this.getCurrentIndex().getValue()).intValue(), 0x5F, null);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Nullable
        public static String getTitle(@NotNull HomeSlotUiState homeSlotUiState0) [...] // Inlined contents
    }

    @StabilityInferred(parameters = 0)
    @Immutable
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u000EJ\u0012\u0010\u0012\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0012\u0010\u000EJ\u0016\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\t0\bH\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0014JJ\u0010\u0015\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00022\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\bH\u00C6\u0001\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u0017\u0010\u000EJ\u0010\u0010\u0019\u001A\u00020\u0018H\u00D6\u0001\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u001A\u0010\u001E\u001A\u00020\u001D2\b\u0010\u001C\u001A\u0004\u0018\u00010\u001BH\u00D6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FR\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010\u000ER\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010\u0010R\u001A\u0010\u0006\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b&\u0010!\u001A\u0004\b\'\u0010\u000ER\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b(\u0010!\u001A\u0004\b)\u0010\u000ER \u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010\u0014\u00A8\u0006-"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Focus;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState;", "", "slotType", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "position", "title", "description", "", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Focus;", "contents", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Focus;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSlotType", "b", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "getPosition", "c", "getTitle", "d", "getDescription", "e", "Ljava/util/List;", "getContents", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nHomeSlotUiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeSlotUiState.kt\ncom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Focus\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,433:1\n1#2:434\n*E\n"})
    public static final class Focus implements HomeSlotUiState {
        public static final int $stable = 8;
        public final String a;
        public final Position b;
        public final String c;
        public final String d;
        public final List e;

        public Focus(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull String s1, @Nullable String s2, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(s1, "title");
            Intrinsics.checkNotNullParameter(list0, "contents");
            super();
            this.a = s;
            this.b = homeSlot$Position0;
            this.c = s1;
            this.d = s2;
            this.e = list0;
            if(this.getContents().isEmpty()) {
                throw new IllegalArgumentException("Focus contents should not be empty");
            }
        }

        public Focus(String s, Position homeSlot$Position0, String s1, String s2, List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                s = "";
            }
            if((v & 2) != 0) {
                homeSlot$Position0 = Position.RIGHT;
            }
            this(s, homeSlot$Position0, s1, s2, list0);
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final Position component2() {
            return this.b;
        }

        @NotNull
        public final String component3() {
            return this.c;
        }

        @Nullable
        public final String component4() {
            return this.d;
        }

        @NotNull
        public final List component5() {
            return this.e;
        }

        @NotNull
        public final Focus copy(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull String s1, @Nullable String s2, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(s1, "title");
            Intrinsics.checkNotNullParameter(list0, "contents");
            return new Focus(s, homeSlot$Position0, s1, s2, list0);
        }

        public static Focus copy$default(Focus homeSlotUiState$Focus0, String s, Position homeSlot$Position0, String s1, String s2, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                s = homeSlotUiState$Focus0.a;
            }
            if((v & 2) != 0) {
                homeSlot$Position0 = homeSlotUiState$Focus0.b;
            }
            if((v & 4) != 0) {
                s1 = homeSlotUiState$Focus0.c;
            }
            if((v & 8) != 0) {
                s2 = homeSlotUiState$Focus0.d;
            }
            if((v & 16) != 0) {
                list0 = homeSlotUiState$Focus0.e;
            }
            return homeSlotUiState$Focus0.copy(s, homeSlot$Position0, s1, s2, list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Focus)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Focus)object0).a)) {
                return false;
            }
            if(this.b != ((Focus)object0).b) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((Focus)object0).c)) {
                return false;
            }
            return Intrinsics.areEqual(this.d, ((Focus)object0).d) ? Intrinsics.areEqual(this.e, ((Focus)object0).e) : false;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @NotNull
        public List getContents() {
            return this.e;
        }

        @Nullable
        public final String getDescription() {
            return this.d;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @NotNull
        public Position getPosition() {
            return this.b;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @NotNull
        public String getSlotType() {
            return this.a;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @NotNull
        public String getTitle() {
            return this.c;
        }

        @Override
        public int hashCode() {
            int v = com.kakao.tistory.presentation.common.graph.a.a(this.c, (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F, 0x1F);
            return this.d == null ? this.e.hashCode() + v * 0x1F : this.e.hashCode() + (v + this.d.hashCode()) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Focus(slotType=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", position=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", title=");
            androidx.room.a.w(stringBuilder0, this.c, ", description=", this.d, ", contents=");
            return wb.a.e(stringBuilder0, this.e, ")");
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH&J\u0010\u0010\u000B\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH&R\u0018\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$FollowableContents;", "", "contents", "", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Followable;", "getContents", "()Ljava/util/List;", "follow", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState;", "blogName", "", "unFollow", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public interface FollowableContents {
        @NotNull
        HomeSlotUiState follow(@NotNull String arg1);

        @NotNull
        List getContents();

        @NotNull
        HomeSlotUiState unFollow(@NotNull String arg1);
    }

    @StabilityInferred(parameters = 0)
    @Immutable
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\t\b\'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0019\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001A\u00020\t¢\u0006\u0004\b\n\u0010\u000BR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000FR&\u0010\u0015\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R\u001B\u0010\u0019\u001A\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u000FR\u001D\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u00040\u001A8\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER#\u0010&\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!0 8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%R\u001A\u0010)\u001A\b\u0012\u0004\u0012\u00028\u00000!8&X¦\u0004¢\u0006\u0006\u001A\u0004\b\'\u0010(¨\u0006*"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Page;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent;", "T", "", "", "contentsPerPage", "initPageIndex", "<init>", "(II)V", "", "onClickMore", "()V", "a", "I", "getContentsPerPage", "()I", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function1;", "getOnIndexChanged", "()Lkotlin/jvm/functions/Function1;", "onIndexChanged", "c", "Lkotlin/Lazy;", "getTotalPages", "totalPages", "Lkotlinx/coroutines/flow/StateFlow;", "f", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentIndex", "()Lkotlinx/coroutines/flow/StateFlow;", "currentIndex", "Lkotlinx/coroutines/flow/Flow;", "", "g", "Lkotlinx/coroutines/flow/Flow;", "getCurrentPageContents", "()Lkotlinx/coroutines/flow/Flow;", "currentPageContents", "getContents", "()Ljava/util/List;", "contents", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nHomeSlotUiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeSlotUiState.kt\ncom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Page\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,433:1\n53#2:434\n55#2:438\n50#3:435\n55#3:437\n107#4:436\n*S KotlinDebug\n*F\n+ 1 HomeSlotUiState.kt\ncom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Page\n*L\n209#1:434\n209#1:438\n209#1:435\n209#1:437\n209#1:436\n*E\n"})
    public static abstract class Page {
        public static final int $stable = 8;
        public final int a;
        public final a0 b;
        public final Lazy c;
        public final Lazy d;
        public final MutableStateFlow e;
        public final StateFlow f;
        public final com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Page.special..inlined.map.1 g;

        public Page(int v, int v1) {
            this.a = v;
            this.b = a0.a;
            this.c = md.c.lazy(new b0(this));
            this.d = md.c.lazy(new z(this));
            MutableStateFlow mutableStateFlow0 = StateFlowKt.MutableStateFlow(v1);
            this.e = mutableStateFlow0;
            this.f = FlowKt.asStateFlow(mutableStateFlow0);
            this.g = new Flow() {
                @Override  // kotlinx.coroutines.flow.Flow
                @Nullable
                public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                    com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Page.special..inlined.map.1.2 homeSlotUiState$Page$special$$inlined$map$1$20 = new FlowCollector() {
                        @Override  // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public final Object emit(Object object0, @NotNull Continuation continuation0) {
                            com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Page.special..inlined.map.1.2.1 homeSlotUiState$Page$special$$inlined$map$1$2$10;
                            if(continuation0 instanceof com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Page.special..inlined.map.1.2.1) {
                                homeSlotUiState$Page$special$$inlined$map$1$2$10 = (com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Page.special..inlined.map.1.2.1)continuation0;
                                int v = homeSlotUiState$Page$special$$inlined$map$1$2$10.b;
                                if((v & 0x80000000) == 0) {
                                    homeSlotUiState$Page$special$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                        public Object a;
                                        public int b;

                                        @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @Nullable
                                        public final Object invokeSuspend(@NotNull Object object0) {
                                            this.a = object0;
                                            this.b |= 0x80000000;
                                            return continuation0.emit(null, this);
                                        }
                                    };
                                }
                                else {
                                    homeSlotUiState$Page$special$$inlined$map$1$2$10.b = v ^ 0x80000000;
                                }
                            }
                            else {
                                homeSlotUiState$Page$special$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                    public Object a;
                                    public int b;

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object0) {
                                        this.a = object0;
                                        this.b |= 0x80000000;
                                        return continuation0.emit(null, this);
                                    }
                                };
                            }
                            Object object1 = homeSlotUiState$Page$special$$inlined$map$1$2$10.a;
                            Object object2 = qd.a.getCOROUTINE_SUSPENDED();
                            switch(homeSlotUiState$Page$special$$inlined$map$1$2$10.b) {
                                case 0: {
                                    ResultKt.throwOnFailure(object1);
                                    FlowCollector flowCollector0 = this.b;
                                    int v1 = ((Number)object0).intValue();
                                    List list0 = Page.access$getContentsPages(this.b);
                                    List list1 = v1 < 0 || v1 > CollectionsKt__CollectionsKt.getLastIndex(list0) ? CollectionsKt__CollectionsKt.emptyList() : list0.get(v1);
                                    homeSlotUiState$Page$special$$inlined$map$1$2$10.b = 1;
                                    return flowCollector0.emit(list1, homeSlotUiState$Page$special$$inlined$map$1$2$10) == object2 ? object2 : Unit.INSTANCE;
                                }
                                case 1: {
                                    ResultKt.throwOnFailure(object1);
                                    return Unit.INSTANCE;
                                }
                                default: {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                            }
                        }
                    };
                    Object object0 = this.collect(homeSlotUiState$Page$special$$inlined$map$1$20, continuation0);
                    return object0 == qd.a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
                }
            };
        }

        public Page(int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v2 & 2) != 0) {
                v1 = 0;
            }
            this(v, v1);
        }

        public static final List access$getContentsPages(Page homeSlotUiState$Page0) {
            return (List)homeSlotUiState$Page0.d.getValue();
        }

        @NotNull
        public abstract List getContents();

        public final int getContentsPerPage() {
            return this.a;
        }

        @NotNull
        public final StateFlow getCurrentIndex() {
            return this.f;
        }

        @NotNull
        public final Flow getCurrentPageContents() {
            return this.g;
        }

        @NotNull
        public Function1 getOnIndexChanged() {
            return this.b;
        }

        public final int getTotalPages() {
            return ((Number)this.c.getValue()).intValue();
        }

        public final void onClickMore() {
            int v1;
            int v = ((Number)this.e.getValue()).intValue();
            if(this.getTotalPages() == 0) {
                v1 = 0;
            }
            else {
                v1 = (v + 1) % this.getTotalPages();
                if(v1 < 0) {
                    v1 += this.getTotalPages();
                }
            }
            this.e.setValue(v1);
            this.getOnIndexChanged().invoke(v1);
        }
    }

    @StabilityInferred(parameters = 0)
    @Immutable
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B[\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\t\u001A\u00020\u0005\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u0005\u0012\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00040\u000B\u0012\u0014\b\u0002\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u000F0\r\u0012\b\b\u0002\u0010\u0011\u001A\u00020\u000E\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001A\u00020\u00012\u0006\u0010\u0014\u001A\u00020\u0005H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001A\u00020\u00012\u0006\u0010\u0014\u001A\u00020\u0005H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001A\u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001C\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u0019J\u0012\u0010\u001D\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u0019J\u0016\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u00040\u000BH\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u001C\u0010 \u001A\u000E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u000F0\rH\u00C6\u0003\u00A2\u0006\u0004\b \u0010!J\u0010\u0010\"\u001A\u00020\u000EH\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010#Jj\u0010$\u001A\u00020\u00002\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00052\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u00052\u000E\b\u0002\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00040\u000B2\u0014\b\u0002\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u000F0\r2\b\b\u0002\u0010\u0011\u001A\u00020\u000EH\u00C6\u0001\u00A2\u0006\u0004\b$\u0010%J\u0010\u0010&\u001A\u00020\u0005H\u00D6\u0001\u00A2\u0006\u0004\b&\u0010\u0019J\u0010\u0010\'\u001A\u00020\u000EH\u00D6\u0001\u00A2\u0006\u0004\b\'\u0010#J\u001A\u0010+\u001A\u00020*2\b\u0010)\u001A\u0004\u0018\u00010(H\u00D6\u0003\u00A2\u0006\u0004\b+\u0010,R\u001A\u0010\u0006\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u0010\u0019R\u001A\u0010\b\u001A\u00020\u00078\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u0010\u001BR\u001A\u0010\t\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b3\u0010.\u001A\u0004\b4\u0010\u0019R\u0019\u0010\n\u001A\u0004\u0018\u00010\u00058\u0006\u00A2\u0006\f\n\u0004\b5\u0010.\u001A\u0004\b6\u0010\u0019R \u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00040\u000B8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010\u001FR&\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u000F0\r8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010!R\u0017\u0010\u0011\u001A\u00020\u000E8\u0006\u00A2\u0006\f\n\u0004\b=\u0010>\u001A\u0004\b?\u0010#\u00A8\u0006@"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Subscription;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$FollowableContents;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Page;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Subscription;", "", "slotType", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "position", "title", "emoji", "", "contents", "Lkotlin/Function1;", "", "", "onIndexChanged", "initPageIndex", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;I)V", "blogName", "follow", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState;", "unFollow", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "()Lkotlin/jvm/functions/Function1;", "component7", "()I", "copy", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;I)Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Subscription;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "h", "Ljava/lang/String;", "getSlotType", "i", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "getPosition", "j", "getTitle", "k", "getEmoji", "l", "Ljava/util/List;", "getContents", "m", "Lkotlin/jvm/functions/Function1;", "getOnIndexChanged", "n", "I", "getInitPageIndex", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nHomeSlotUiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeSlotUiState.kt\ncom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Subscription\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,433:1\n1#2:434\n1549#3:435\n1620#3,3:436\n1549#3:439\n1620#3,3:440\n*S KotlinDebug\n*F\n+ 1 HomeSlotUiState.kt\ncom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Subscription\n*L\n144#1:435\n144#1:436,3\n154#1:439\n154#1:440,3\n*E\n"})
    public static final class Subscription extends Page implements FollowableContents, HomeSlotUiState {
        public static final int $stable = 8;
        public final String h;
        public final Position i;
        public final String j;
        public final String k;
        public final List l;
        public final Function1 m;
        public final int n;

        public Subscription(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull String s1, @Nullable String s2, @NotNull List list0, @NotNull Function1 function10, int v) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(s1, "title");
            Intrinsics.checkNotNullParameter(list0, "contents");
            Intrinsics.checkNotNullParameter(function10, "onIndexChanged");
            super(1, v);
            this.h = s;
            this.i = homeSlot$Position0;
            this.j = s1;
            this.k = s2;
            this.l = list0;
            this.m = function10;
            this.n = v;
            if(this.getContents().isEmpty()) {
                throw new IllegalArgumentException("Subscription contents should not be empty");
            }
        }

        public Subscription(String s, Position homeSlot$Position0, String s1, String s2, List list0, Function1 function10, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            Position homeSlot$Position1 = (v1 & 2) == 0 ? homeSlot$Position0 : Position.RIGHT;
            Function1 function11 = (v1 & 0x20) == 0 ? function10 : c0.a;
            this(((v1 & 1) == 0 ? s : ""), homeSlot$Position1, s1, s2, list0, function11, ((v1 & 0x40) == 0 ? v : 0));
        }

        @NotNull
        public final String component1() {
            return this.h;
        }

        @NotNull
        public final Position component2() {
            return this.i;
        }

        @NotNull
        public final String component3() {
            return this.j;
        }

        @Nullable
        public final String component4() {
            return this.k;
        }

        @NotNull
        public final List component5() {
            return this.l;
        }

        @NotNull
        public final Function1 component6() {
            return this.m;
        }

        public final int component7() {
            return this.n;
        }

        @NotNull
        public final Subscription copy(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull String s1, @Nullable String s2, @NotNull List list0, @NotNull Function1 function10, int v) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(s1, "title");
            Intrinsics.checkNotNullParameter(list0, "contents");
            Intrinsics.checkNotNullParameter(function10, "onIndexChanged");
            return new Subscription(s, homeSlot$Position0, s1, s2, list0, function10, v);
        }

        public static Subscription copy$default(Subscription homeSlotUiState$Subscription0, String s, Position homeSlot$Position0, String s1, String s2, List list0, Function1 function10, int v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                s = homeSlotUiState$Subscription0.h;
            }
            if((v1 & 2) != 0) {
                homeSlot$Position0 = homeSlotUiState$Subscription0.i;
            }
            if((v1 & 4) != 0) {
                s1 = homeSlotUiState$Subscription0.j;
            }
            if((v1 & 8) != 0) {
                s2 = homeSlotUiState$Subscription0.k;
            }
            if((v1 & 16) != 0) {
                list0 = homeSlotUiState$Subscription0.l;
            }
            if((v1 & 0x20) != 0) {
                function10 = homeSlotUiState$Subscription0.m;
            }
            if((v1 & 0x40) != 0) {
                v = homeSlotUiState$Subscription0.n;
            }
            return homeSlotUiState$Subscription0.copy(s, homeSlot$Position0, s1, s2, list0, function10, v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Subscription)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.h, ((Subscription)object0).h)) {
                return false;
            }
            if(this.i != ((Subscription)object0).i) {
                return false;
            }
            if(!Intrinsics.areEqual(this.j, ((Subscription)object0).j)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.k, ((Subscription)object0).k)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.l, ((Subscription)object0).l)) {
                return false;
            }
            return Intrinsics.areEqual(this.m, ((Subscription)object0).m) ? this.n == ((Subscription)object0).n : false;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState$FollowableContents
        @NotNull
        public HomeSlotUiState follow(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            List list0 = this.getContents();
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
            for(Object object0: list0) {
                com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Subscription homeSlotUiStateContent$Subscription0 = (com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Subscription)object0;
                if(Intrinsics.areEqual(homeSlotUiStateContent$Subscription0.getBlogName(), s)) {
                    homeSlotUiStateContent$Subscription0 = homeSlotUiStateContent$Subscription0.follow();
                }
                arrayList0.add(homeSlotUiStateContent$Subscription0);
            }
            return Subscription.copy$default(this, null, null, null, null, arrayList0, null, ((Number)this.getCurrentIndex().getValue()).intValue(), 0x2F, null);
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState$Page, com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState, com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState$FollowableContents
        @NotNull
        public List getContents() {
            return this.l;
        }

        @Nullable
        public final String getEmoji() {
            return this.k;
        }

        public final int getInitPageIndex() {
            return this.n;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState$Page
        @NotNull
        public Function1 getOnIndexChanged() {
            return this.m;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @NotNull
        public Position getPosition() {
            return this.i;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @NotNull
        public String getSlotType() {
            return this.h;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @NotNull
        public String getTitle() {
            return this.j;
        }

        @Override
        public int hashCode() {
            int v = com.kakao.tistory.presentation.common.graph.a.a(this.j, (this.i.hashCode() + this.h.hashCode() * 0x1F) * 0x1F, 0x1F);
            return this.k == null ? this.n + com.kakao.tistory.presentation.main.contract.b.a(this.m, b.c(this.l, v * 0x1F, 0x1F), 0x1F) : this.n + com.kakao.tistory.presentation.main.contract.b.a(this.m, b.c(this.l, (v + this.k.hashCode()) * 0x1F, 0x1F), 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Subscription(slotType=");
            stringBuilder0.append(this.h);
            stringBuilder0.append(", position=");
            stringBuilder0.append(this.i);
            stringBuilder0.append(", title=");
            androidx.room.a.w(stringBuilder0, this.j, ", emoji=", this.k, ", contents=");
            stringBuilder0.append(this.l);
            stringBuilder0.append(", onIndexChanged=");
            stringBuilder0.append(this.m);
            stringBuilder0.append(", initPageIndex=");
            return wb.a.c(this.n, ")", stringBuilder0);
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState$FollowableContents
        @NotNull
        public HomeSlotUiState unFollow(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            List list0 = this.getContents();
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
            for(Object object0: list0) {
                com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Subscription homeSlotUiStateContent$Subscription0 = (com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Subscription)object0;
                if(Intrinsics.areEqual(homeSlotUiStateContent$Subscription0.getBlogName(), s)) {
                    homeSlotUiStateContent$Subscription0 = homeSlotUiStateContent$Subscription0.unFollow();
                }
                arrayList0.add(homeSlotUiStateContent$Subscription0);
            }
            return Subscription.copy$default(this, null, null, null, null, arrayList0, null, ((Number)this.getCurrentIndex().getValue()).intValue(), 0x2F, null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Immutable
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u000EJ\u0012\u0010\u0012\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0012\u0010\u000EJ\u0016\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\t0\bH\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0014JJ\u0010\u0015\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00022\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\bH\u00C6\u0001\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u0017\u0010\u000EJ\u0010\u0010\u0019\u001A\u00020\u0018H\u00D6\u0001\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u001A\u0010\u001E\u001A\u00020\u001D2\b\u0010\u001C\u001A\u0004\u0018\u00010\u001BH\u00D6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FR\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010\u000ER\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010\u0010R\u001A\u0010\u0006\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b&\u0010!\u001A\u0004\b\'\u0010\u000ER\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b(\u0010!\u001A\u0004\b)\u0010\u000ER \u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010\u0014\u00A8\u0006-"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Tip;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState;", "", "slotType", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "position", "title", "emoji", "", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Tip;", "contents", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Tip;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSlotType", "b", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "getPosition", "c", "getTitle", "d", "getEmoji", "e", "Ljava/util/List;", "getContents", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nHomeSlotUiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeSlotUiState.kt\ncom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Tip\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,433:1\n1#2:434\n*E\n"})
    public static final class Tip implements HomeSlotUiState {
        public static final int $stable = 8;
        public final String a;
        public final Position b;
        public final String c;
        public final String d;
        public final List e;

        public Tip(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull String s1, @Nullable String s2, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(s1, "title");
            Intrinsics.checkNotNullParameter(list0, "contents");
            super();
            this.a = s;
            this.b = homeSlot$Position0;
            this.c = s1;
            this.d = s2;
            this.e = list0;
            if(this.getContents().isEmpty()) {
                throw new IllegalArgumentException("Tip contents should not be empty");
            }
        }

        public Tip(String s, Position homeSlot$Position0, String s1, String s2, List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                s = "";
            }
            if((v & 2) != 0) {
                homeSlot$Position0 = Position.RIGHT;
            }
            this(s, homeSlot$Position0, s1, s2, list0);
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final Position component2() {
            return this.b;
        }

        @NotNull
        public final String component3() {
            return this.c;
        }

        @Nullable
        public final String component4() {
            return this.d;
        }

        @NotNull
        public final List component5() {
            return this.e;
        }

        @NotNull
        public final Tip copy(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull String s1, @Nullable String s2, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(s1, "title");
            Intrinsics.checkNotNullParameter(list0, "contents");
            return new Tip(s, homeSlot$Position0, s1, s2, list0);
        }

        public static Tip copy$default(Tip homeSlotUiState$Tip0, String s, Position homeSlot$Position0, String s1, String s2, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                s = homeSlotUiState$Tip0.a;
            }
            if((v & 2) != 0) {
                homeSlot$Position0 = homeSlotUiState$Tip0.b;
            }
            if((v & 4) != 0) {
                s1 = homeSlotUiState$Tip0.c;
            }
            if((v & 8) != 0) {
                s2 = homeSlotUiState$Tip0.d;
            }
            if((v & 16) != 0) {
                list0 = homeSlotUiState$Tip0.e;
            }
            return homeSlotUiState$Tip0.copy(s, homeSlot$Position0, s1, s2, list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Tip)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Tip)object0).a)) {
                return false;
            }
            if(this.b != ((Tip)object0).b) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((Tip)object0).c)) {
                return false;
            }
            return Intrinsics.areEqual(this.d, ((Tip)object0).d) ? Intrinsics.areEqual(this.e, ((Tip)object0).e) : false;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @NotNull
        public List getContents() {
            return this.e;
        }

        @Nullable
        public final String getEmoji() {
            return this.d;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @NotNull
        public Position getPosition() {
            return this.b;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @NotNull
        public String getSlotType() {
            return this.a;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @NotNull
        public String getTitle() {
            return this.c;
        }

        @Override
        public int hashCode() {
            int v = com.kakao.tistory.presentation.common.graph.a.a(this.c, (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F, 0x1F);
            return this.d == null ? this.e.hashCode() + v * 0x1F : this.e.hashCode() + (v + this.d.hashCode()) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Tip(slotType=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", position=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", title=");
            androidx.room.a.w(stringBuilder0, this.c, ", emoji=", this.d, ", contents=");
            return wb.a.e(stringBuilder0, this.e, ")");
        }
    }

    @StabilityInferred(parameters = 0)
    @Immutable
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0016\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J4\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001A\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001A\u0010\u001A\u001A\u00020\u00192\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001A\u0010\u001BR\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\fR\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\u000ER \u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\u0010¨\u0006%"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Today;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState;", "", "slotType", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "position", "", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Today;", "contents", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/util/List;)Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Today;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSlotType", "b", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "getPosition", "c", "Ljava/util/List;", "getContents", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nHomeSlotUiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeSlotUiState.kt\ncom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Today\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,433:1\n1#2:434\n*E\n"})
    public static final class Today implements HomeSlotUiState {
        public static final int $stable = 8;
        public final String a;
        public final Position b;
        public final List c;

        public Today(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(list0, "contents");
            super();
            this.a = s;
            this.b = homeSlot$Position0;
            this.c = list0;
            if(this.getContents().isEmpty()) {
                throw new IllegalArgumentException("Today contents should not be empty");
            }
        }

        public Today(String s, Position homeSlot$Position0, List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                s = "";
            }
            if((v & 2) != 0) {
                homeSlot$Position0 = Position.LEFT;
            }
            this(s, homeSlot$Position0, list0);
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final Position component2() {
            return this.b;
        }

        @NotNull
        public final List component3() {
            return this.c;
        }

        @NotNull
        public final Today copy(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(list0, "contents");
            return new Today(s, homeSlot$Position0, list0);
        }

        public static Today copy$default(Today homeSlotUiState$Today0, String s, Position homeSlot$Position0, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                s = homeSlotUiState$Today0.a;
            }
            if((v & 2) != 0) {
                homeSlot$Position0 = homeSlotUiState$Today0.b;
            }
            if((v & 4) != 0) {
                list0 = homeSlotUiState$Today0.c;
            }
            return homeSlotUiState$Today0.copy(s, homeSlot$Position0, list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Today)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Today)object0).a)) {
                return false;
            }
            return this.b == ((Today)object0).b ? Intrinsics.areEqual(this.c, ((Today)object0).c) : false;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @NotNull
        public List getContents() {
            return this.c;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @NotNull
        public Position getPosition() {
            return this.b;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @NotNull
        public String getSlotType() {
            return this.a;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState
        @Nullable
        public String getTitle() {
            return null;
        }

        @Override
        public int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Today(slotType=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", position=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", contents=");
            return wb.a.e(stringBuilder0, this.c, ")");
        }
    }

    @NotNull
    List getContents();

    @NotNull
    Position getPosition();

    @NotNull
    String getSlotType();

    @Nullable
    String getTitle();
}

