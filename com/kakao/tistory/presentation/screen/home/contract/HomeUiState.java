package com.kakao.tistory.presentation.screen.home.contract;

import androidx.compose.runtime.Immutable;
import com.kakao.tistory.presentation.main.contract.a;
import com.kakao.tistory.presentation.main.contract.c;
import com.kakao.tistory.presentation.screen.item.ViewState.Loading;
import com.kakao.tistory.presentation.screen.item.ViewState.Success;
import com.kakao.tistory.presentation.screen.item.ViewState;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0014\b\u0002\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001A\u00020\t\u0012\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u000B\u0012\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u001B\u0010\u0011\u001A\u00020\u00002\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u001C\u0010\u0013\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001A\u0004\u0018\u00010\u000BH\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0016\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u0016J\\\u0010\u001C\u001A\u00020\u00002\u0014\b\u0002\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001A\u00020\t2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u000B2\u000E\b\u0002\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00C6\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001F\u001A\u00020\u001EH\u00D6\u0001\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010\"\u001A\u00020!H\u00D6\u0001\u00A2\u0006\u0004\b\"\u0010#J\u001A\u0010%\u001A\u00020\t2\b\u0010$\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b%\u0010&R#\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010\u0014R\u001D\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00A2\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010\u0016R\u0017\u0010\n\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b\n\u0010\u0018R\u0019\u0010\f\u001A\u0004\u0018\u00010\u000B8\u0006\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u0010\u001AR\u001D\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00A2\u0006\f\n\u0004\b2\u0010+\u001A\u0004\b3\u0010\u0016R\u001D\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006\u00A2\u0006\f\n\u0004\b4\u00105\u001A\u0004\b6\u00107\u00A8\u00068"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/contract/HomeUiState;", "", "Lcom/kakao/tistory/presentation/screen/item/ViewState;", "", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState;", "state", "Lkotlin/Function0;", "", "refresh", "", "isRefreshing", "Lcom/kakao/tistory/presentation/screen/home/contract/DialogType;", "dialog", "onDismissDialog", "<init>", "(Lcom/kakao/tistory/presentation/screen/item/ViewState;Lkotlin/jvm/functions/Function0;ZLcom/kakao/tistory/presentation/screen/home/contract/DialogType;Lkotlin/jvm/functions/Function0;)V", "slotList", "updateSlotList", "(Ljava/util/List;)Lcom/kakao/tistory/presentation/screen/home/contract/HomeUiState;", "component1", "()Lcom/kakao/tistory/presentation/screen/item/ViewState;", "component2", "()Lkotlin/jvm/functions/Function0;", "component3", "()Z", "component4", "()Lcom/kakao/tistory/presentation/screen/home/contract/DialogType;", "component5", "copy", "(Lcom/kakao/tistory/presentation/screen/item/ViewState;Lkotlin/jvm/functions/Function0;ZLcom/kakao/tistory/presentation/screen/home/contract/DialogType;Lkotlin/jvm/functions/Function0;)Lcom/kakao/tistory/presentation/screen/home/contract/HomeUiState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/screen/item/ViewState;", "getState", "b", "Lkotlin/jvm/functions/Function0;", "getRefresh", "c", "Z", "d", "Lcom/kakao/tistory/presentation/screen/home/contract/DialogType;", "getDialog", "e", "getOnDismissDialog", "f", "Ljava/util/List;", "getSlotList", "()Ljava/util/List;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class HomeUiState {
    public static final int $stable;
    public final ViewState a;
    public final Function0 b;
    public final boolean c;
    public final DialogType d;
    public final Function0 e;
    public final List f;

    public HomeUiState(@NotNull ViewState viewState0, @NotNull Function0 function00, boolean z, @Nullable DialogType dialogType0, @NotNull Function0 function01) {
        Intrinsics.checkNotNullParameter(viewState0, "state");
        List list0;
        Intrinsics.checkNotNullParameter(function00, "refresh");
        Intrinsics.checkNotNullParameter(function01, "onDismissDialog");
        super();
        this.a = viewState0;
        this.b = function00;
        this.c = z;
        this.d = dialogType0;
        this.e = function01;
        Success viewState$Success0 = viewState0 instanceof Success ? ((Success)viewState0) : null;
        if(viewState$Success0 == null) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        else {
            list0 = (List)viewState$Success0.getItem();
            if(list0 == null) {
                list0 = CollectionsKt__CollectionsKt.emptyList();
            }
        }
        this.f = list0;
    }

    public HomeUiState(ViewState viewState0, Function0 function00, boolean z, DialogType dialogType0, Function0 function01, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            viewState0 = Loading.INSTANCE;
        }
        if((v & 4) != 0) {
            z = false;
        }
        if((v & 8) != 0) {
            dialogType0 = null;
        }
        this(viewState0, function00, z, dialogType0, function01);
    }

    @NotNull
    public final ViewState component1() {
        return this.a;
    }

    @NotNull
    public final Function0 component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    @Nullable
    public final DialogType component4() {
        return this.d;
    }

    @NotNull
    public final Function0 component5() {
        return this.e;
    }

    @NotNull
    public final HomeUiState copy(@NotNull ViewState viewState0, @NotNull Function0 function00, boolean z, @Nullable DialogType dialogType0, @NotNull Function0 function01) {
        Intrinsics.checkNotNullParameter(viewState0, "state");
        Intrinsics.checkNotNullParameter(function00, "refresh");
        Intrinsics.checkNotNullParameter(function01, "onDismissDialog");
        return new HomeUiState(viewState0, function00, z, dialogType0, function01);
    }

    public static HomeUiState copy$default(HomeUiState homeUiState0, ViewState viewState0, Function0 function00, boolean z, DialogType dialogType0, Function0 function01, int v, Object object0) {
        if((v & 1) != 0) {
            viewState0 = homeUiState0.a;
        }
        if((v & 2) != 0) {
            function00 = homeUiState0.b;
        }
        if((v & 4) != 0) {
            z = homeUiState0.c;
        }
        if((v & 8) != 0) {
            dialogType0 = homeUiState0.d;
        }
        if((v & 16) != 0) {
            function01 = homeUiState0.e;
        }
        return homeUiState0.copy(viewState0, function00, z, dialogType0, function01);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof HomeUiState)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((HomeUiState)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((HomeUiState)object0).b)) {
            return false;
        }
        if(this.c != ((HomeUiState)object0).c) {
            return false;
        }
        return Intrinsics.areEqual(this.d, ((HomeUiState)object0).d) ? Intrinsics.areEqual(this.e, ((HomeUiState)object0).e) : false;
    }

    @Nullable
    public final DialogType getDialog() {
        return this.d;
    }

    @NotNull
    public final Function0 getOnDismissDialog() {
        return this.e;
    }

    @NotNull
    public final Function0 getRefresh() {
        return this.b;
    }

    @NotNull
    public final List getSlotList() {
        return this.f;
    }

    @NotNull
    public final ViewState getState() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = c.a(this.c, a.a(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F);
        return this.d == null ? this.e.hashCode() + v * 0x1F : this.e.hashCode() + (v + this.d.hashCode()) * 0x1F;
    }

    public final boolean isRefreshing() {
        return this.c;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("HomeUiState(state=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", refresh=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", isRefreshing=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", dialog=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", onDismissDialog=");
        return q.q(stringBuilder0, this.e, ")");
    }

    @NotNull
    public final HomeUiState updateSlotList(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "slotList");
        return this.a instanceof Success ? HomeUiState.copy$default(this, ((Success)this.a).copy(list0), null, false, null, null, 30, null) : this;
    }
}

