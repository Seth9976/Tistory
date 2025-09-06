package com.kakao.tistory.presentation.main.contract;

import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.presentation.common.event.ShowToastEvent;
import com.kakao.tistory.presentation.main.navigation.MainDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000B\f\r\u000E\u000F¨\u0006\u0010"}, d2 = {"Lcom/kakao/tistory/presentation/main/contract/MainEvent;", "", "ChangeMainDestination", "FinishApp", "GoEditor", "RedirectUrl", "ShowDialog", "ShowToast", "ShowWelcomeDialog", "Lcom/kakao/tistory/presentation/main/contract/MainEvent$ChangeMainDestination;", "Lcom/kakao/tistory/presentation/main/contract/MainEvent$FinishApp;", "Lcom/kakao/tistory/presentation/main/contract/MainEvent$GoEditor;", "Lcom/kakao/tistory/presentation/main/contract/MainEvent$RedirectUrl;", "Lcom/kakao/tistory/presentation/main/contract/MainEvent$ShowDialog;", "Lcom/kakao/tistory/presentation/main/contract/MainEvent$ShowToast;", "Lcom/kakao/tistory/presentation/main/contract/MainEvent$ShowWelcomeDialog;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface MainEvent {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/main/contract/MainEvent$ChangeMainDestination;", "Lcom/kakao/tistory/presentation/main/contract/MainEvent;", "Lcom/kakao/tistory/presentation/main/navigation/MainDestination;", "destination", "<init>", "(Lcom/kakao/tistory/presentation/main/navigation/MainDestination;)V", "component1", "()Lcom/kakao/tistory/presentation/main/navigation/MainDestination;", "copy", "(Lcom/kakao/tistory/presentation/main/navigation/MainDestination;)Lcom/kakao/tistory/presentation/main/contract/MainEvent$ChangeMainDestination;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/main/navigation/MainDestination;", "getDestination", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeMainDestination implements MainEvent {
        public static final int $stable;
        public final MainDestination a;

        public ChangeMainDestination(@NotNull MainDestination mainDestination0) {
            Intrinsics.checkNotNullParameter(mainDestination0, "destination");
            super();
            this.a = mainDestination0;
        }

        @NotNull
        public final MainDestination component1() {
            return this.a;
        }

        @NotNull
        public final ChangeMainDestination copy(@NotNull MainDestination mainDestination0) {
            Intrinsics.checkNotNullParameter(mainDestination0, "destination");
            return new ChangeMainDestination(mainDestination0);
        }

        public static ChangeMainDestination copy$default(ChangeMainDestination mainEvent$ChangeMainDestination0, MainDestination mainDestination0, int v, Object object0) {
            if((v & 1) != 0) {
                mainDestination0 = mainEvent$ChangeMainDestination0.a;
            }
            return mainEvent$ChangeMainDestination0.copy(mainDestination0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangeMainDestination ? this.a == ((ChangeMainDestination)object0).a : false;
        }

        @NotNull
        public final MainDestination getDestination() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangeMainDestination(destination=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/main/contract/MainEvent$FinishApp;", "Lcom/kakao/tistory/presentation/main/contract/MainEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class FinishApp implements MainEvent {
        public static final int $stable;
        @NotNull
        public static final FinishApp INSTANCE;

        static {
            FinishApp.INSTANCE = new FinishApp();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof FinishApp;
        }

        @Override
        public int hashCode() {
            return 2127725900;
        }

        @Override
        @NotNull
        public String toString() {
            return "FinishApp";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0012\u001A\u00020\u00022\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/kakao/tistory/presentation/main/contract/MainEvent$GoEditor;", "Lcom/kakao/tistory/presentation/main/contract/MainEvent;", "", "openLatestEdit", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/kakao/tistory/presentation/main/contract/MainEvent$GoEditor;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getOpenLatestEdit", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GoEditor implements MainEvent {
        public static final int $stable;
        public final boolean a;

        public GoEditor() {
            this(false, 1, null);
        }

        public GoEditor(boolean z) {
            this.a = z;
        }

        public GoEditor(boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                z = false;
            }
            this(z);
        }

        public final boolean component1() {
            return this.a;
        }

        @NotNull
        public final GoEditor copy(boolean z) {
            return new GoEditor(z);
        }

        public static GoEditor copy$default(GoEditor mainEvent$GoEditor0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                z = mainEvent$GoEditor0.a;
            }
            return mainEvent$GoEditor0.copy(z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof GoEditor ? this.a == ((GoEditor)object0).a : false;
        }

        public final boolean getOpenLatestEdit() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.a);
        }

        @Override
        @NotNull
        public String toString() {
            return "GoEditor(openLatestEdit=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/main/contract/MainEvent$RedirectUrl;", "Lcom/kakao/tistory/presentation/main/contract/MainEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/main/contract/MainEvent$RedirectUrl;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getUrl", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RedirectUrl implements MainEvent {
        public static final int $stable;
        public final String a;

        public RedirectUrl(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "url");
            super();
            this.a = s;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final RedirectUrl copy(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "url");
            return new RedirectUrl(s);
        }

        public static RedirectUrl copy$default(RedirectUrl mainEvent$RedirectUrl0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = mainEvent$RedirectUrl0.a;
            }
            return mainEvent$RedirectUrl0.copy(s);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof RedirectUrl ? Intrinsics.areEqual(this.a, ((RedirectUrl)object0).a) : false;
        }

        @NotNull
        public final String getUrl() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "RedirectUrl(url=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\bR\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001A\u0004\b\u0019\u0010\b¨\u0006\u001A"}, d2 = {"Lcom/kakao/tistory/presentation/main/contract/MainEvent$ShowDialog;", "Lcom/kakao/tistory/presentation/main/contract/MainEvent;", "", "title", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tistory/presentation/main/contract/MainEvent$ShowDialog;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "b", "getMessage", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowDialog implements MainEvent {
        public static final int $stable;
        public final String a;
        public final String b;

        public ShowDialog(@NotNull String s, @Nullable String s1) {
            Intrinsics.checkNotNullParameter(s, "title");
            super();
            this.a = s;
            this.b = s1;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @Nullable
        public final String component2() {
            return this.b;
        }

        @NotNull
        public final ShowDialog copy(@NotNull String s, @Nullable String s1) {
            Intrinsics.checkNotNullParameter(s, "title");
            return new ShowDialog(s, s1);
        }

        public static ShowDialog copy$default(ShowDialog mainEvent$ShowDialog0, String s, String s1, int v, Object object0) {
            if((v & 1) != 0) {
                s = mainEvent$ShowDialog0.a;
            }
            if((v & 2) != 0) {
                s1 = mainEvent$ShowDialog0.b;
            }
            return mainEvent$ShowDialog0.copy(s, s1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ShowDialog)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((ShowDialog)object0).a) ? Intrinsics.areEqual(this.b, ((ShowDialog)object0).b) : false;
        }

        @Nullable
        public final String getMessage() {
            return this.b;
        }

        @NotNull
        public final String getTitle() {
            return this.a;
        }

        @Override
        public int hashCode() {
            int v = this.a.hashCode();
            return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ShowDialog(title=" + this.a + ", message=" + this.b + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001F\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000B\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ(\u0010\r\u001A\u00020\u00002\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001A\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000F\u0010\nJ\u0010\u0010\u0010\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001C\u0010\u0004\u001A\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\nR\u001C\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\f¨\u0006\u001D"}, d2 = {"Lcom/kakao/tistory/presentation/main/contract/MainEvent$ShowToast;", "Lcom/kakao/tistory/presentation/main/contract/MainEvent;", "Lcom/kakao/tistory/presentation/common/event/ShowToastEvent;", "", "message", "", "messageRes", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/kakao/tistory/presentation/main/contract/MainEvent$ShowToast;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMessage", "b", "Ljava/lang/Integer;", "getMessageRes", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowToast implements ShowToastEvent, MainEvent {
        public static final int $stable;
        public final String a;
        public final Integer b;

        public ShowToast() {
            this(null, null, 3, null);
        }

        public ShowToast(@Nullable String s, @StringRes @Nullable Integer integer0) {
            this.a = s;
            this.b = integer0;
        }

        public ShowToast(String s, Integer integer0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                s = null;
            }
            if((v & 2) != 0) {
                integer0 = null;
            }
            this(s, integer0);
        }

        @Nullable
        public final String component1() {
            return this.a;
        }

        @Nullable
        public final Integer component2() {
            return this.b;
        }

        @NotNull
        public final ShowToast copy(@Nullable String s, @StringRes @Nullable Integer integer0) {
            return new ShowToast(s, integer0);
        }

        public static ShowToast copy$default(ShowToast mainEvent$ShowToast0, String s, Integer integer0, int v, Object object0) {
            if((v & 1) != 0) {
                s = mainEvent$ShowToast0.a;
            }
            if((v & 2) != 0) {
                integer0 = mainEvent$ShowToast0.b;
            }
            return mainEvent$ShowToast0.copy(s, integer0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ShowToast)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((ShowToast)object0).a) ? Intrinsics.areEqual(this.b, ((ShowToast)object0).b) : false;
        }

        @Override  // com.kakao.tistory.presentation.common.event.ShowToastEvent
        @Nullable
        public String getMessage() {
            return this.a;
        }

        @Override  // com.kakao.tistory.presentation.common.event.ShowToastEvent
        @Nullable
        public Integer getMessageRes() {
            return this.b;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.a == null ? 0 : this.a.hashCode();
            Integer integer0 = this.b;
            if(integer0 != null) {
                v = integer0.hashCode();
            }
            return v1 * 0x1F + v;
        }

        @Override
        @NotNull
        public String toString() {
            return "ShowToast(message=" + this.a + ", messageRes=" + this.b + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/main/contract/MainEvent$ShowWelcomeDialog;", "Lcom/kakao/tistory/presentation/main/contract/MainEvent;", "", "userName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/main/contract/MainEvent$ShowWelcomeDialog;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getUserName", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowWelcomeDialog implements MainEvent {
        public static final int $stable;
        public final String a;

        public ShowWelcomeDialog(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "userName");
            super();
            this.a = s;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final ShowWelcomeDialog copy(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "userName");
            return new ShowWelcomeDialog(s);
        }

        public static ShowWelcomeDialog copy$default(ShowWelcomeDialog mainEvent$ShowWelcomeDialog0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = mainEvent$ShowWelcomeDialog0.a;
            }
            return mainEvent$ShowWelcomeDialog0.copy(s);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ShowWelcomeDialog ? Intrinsics.areEqual(this.a, ((ShowWelcomeDialog)object0).a) : false;
        }

        @NotNull
        public final String getUserName() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ShowWelcomeDialog(userName=" + this.a + ")";
        }
    }

}

