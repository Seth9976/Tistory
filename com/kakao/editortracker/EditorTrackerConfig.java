package com.kakao.editortracker;

import android.net.Uri.Builder;
import com.kakao.editortracker.data.Service;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001:\u0001/B9\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\u000E\u0010\t\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001A\u00020\nH\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0017JL\u0010\u0018\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\b\b\u0002\u0010\u000B\u001A\u00020\nH\u00C6\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001A\u001A\u00020\u0006H\u00D6\u0001\u00A2\u0006\u0004\b\u001A\u0010\u0013J\u0010\u0010\u001C\u001A\u00020\u001BH\u00D6\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u001A\u0010\u001F\u001A\u00020\n2\b\u0010\u001E\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b\u001F\u0010 R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010\u000FR\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\u0011R\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010\u0013R\u001F\u0010\t\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0006\u00A2\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010\u0015R\u0017\u0010\u000B\u001A\u00020\n8\u0006\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b\u000B\u0010\u0017\u00A8\u00060"}, d2 = {"Lcom/kakao/editortracker/EditorTrackerConfig;", "", "Lcom/kakao/editortracker/EditorTrackDomain;", "trackDomain", "Lcom/kakao/editortracker/data/Service;", "service", "", "editorVersion", "", "editorPlugins", "", "isTrackEnabled", "<init>", "(Lcom/kakao/editortracker/EditorTrackDomain;Lcom/kakao/editortracker/data/Service;Ljava/lang/String;Ljava/util/List;Z)V", "component1", "()Lcom/kakao/editortracker/EditorTrackDomain;", "component2", "()Lcom/kakao/editortracker/data/Service;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/List;", "component5", "()Z", "copy", "(Lcom/kakao/editortracker/EditorTrackDomain;Lcom/kakao/editortracker/data/Service;Ljava/lang/String;Ljava/util/List;Z)Lcom/kakao/editortracker/EditorTrackerConfig;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/editortracker/EditorTrackDomain;", "getTrackDomain", "b", "Lcom/kakao/editortracker/data/Service;", "getService", "c", "Ljava/lang/String;", "getEditorVersion", "d", "Ljava/util/List;", "getEditorPlugins", "e", "Z", "Builder", "editortracker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EditorTrackerConfig {
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010 \n\u0002\b\u000B\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001A\u00020\t¢\u0006\u0004\b\n\u0010\u000BR\"\u0010\u000F\u001A\u00020\f8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001A\u001A\u00020\u00138\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010!\u001A\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001E\"\u0004\b\u001F\u0010 R*\u0010)\u001A\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&\"\u0004\b\'\u0010(R\"\u0010+\u001A\u00020\f8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b*\u0010\u000E\u001A\u0004\b+\u0010\u0010\"\u0004\b,\u0010\u0012¨\u0006-"}, d2 = {"Lcom/kakao/editortracker/EditorTrackerConfig$Builder;", "", "", "serviceKey", "serviceDomain", "serviceReferrer", "serviceVersionName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/kakao/editortracker/EditorTrackerConfig;", "build", "()Lcom/kakao/editortracker/EditorTrackerConfig;", "", "e", "Z", "isDebugMode", "()Z", "setDebugMode", "(Z)V", "Lcom/kakao/editortracker/EditorTrackDomain;", "f", "Lcom/kakao/editortracker/EditorTrackDomain;", "getTrackDomain", "()Lcom/kakao/editortracker/EditorTrackDomain;", "setTrackDomain", "(Lcom/kakao/editortracker/EditorTrackDomain;)V", "trackDomain", "g", "Ljava/lang/String;", "getEditorVersion", "()Ljava/lang/String;", "setEditorVersion", "(Ljava/lang/String;)V", "editorVersion", "", "h", "Ljava/util/List;", "getEditorPlugins", "()Ljava/util/List;", "setEditorPlugins", "(Ljava/util/List;)V", "editorPlugins", "i", "isTrackEnabled", "setTrackEnabled", "editortracker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nEditorTrackerConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorTrackerConfig.kt\ncom/kakao/editortracker/EditorTrackerConfig$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
    public static final class Builder {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public boolean e;
        public EditorTrackDomain f;
        public String g;
        public List h;
        public boolean i;

        public Builder(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3) {
            Intrinsics.checkNotNullParameter(s, "serviceKey");
            Intrinsics.checkNotNullParameter(s1, "serviceDomain");
            Intrinsics.checkNotNullParameter(s2, "serviceReferrer");
            Intrinsics.checkNotNullParameter(s3, "serviceVersionName");
            super();
            this.a = s;
            this.b = s1;
            this.c = s2;
            this.d = s3;
            this.f = EditorTrackDomain.Companion.from(this.e);
            this.i = true;
        }

        @NotNull
        public final EditorTrackerConfig build() {
            EditorTrackDomain editorTrackDomain0 = this.f;
            String s = this.c;
            boolean z = p.isBlank(s);
            String s1 = this.b;
            if(z) {
                s = new Uri.Builder().scheme("https").authority(s1).toString();
                Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
            }
            EditorTrackerConfig editorTrackerConfig0 = new EditorTrackerConfig(editorTrackDomain0, new Service(this.a, s1, s, this.a + "-android-" + this.d), this.g, this.h, this.i);
            Logger.INSTANCE.setEnabled(this.e);
            return editorTrackerConfig0;
        }

        @Nullable
        public final List getEditorPlugins() {
            return this.h;
        }

        @Nullable
        public final String getEditorVersion() {
            return this.g;
        }

        @NotNull
        public final EditorTrackDomain getTrackDomain() {
            return this.f;
        }

        public final boolean isDebugMode() {
            return this.e;
        }

        public final boolean isTrackEnabled() {
            return this.i;
        }

        public final void setDebugMode(boolean z) {
            this.e = z;
        }

        public final void setEditorPlugins(@Nullable List list0) {
            this.h = list0;
        }

        public final void setEditorVersion(@Nullable String s) {
            this.g = s;
        }

        public final void setTrackDomain(@NotNull EditorTrackDomain editorTrackDomain0) {
            Intrinsics.checkNotNullParameter(editorTrackDomain0, "<set-?>");
            this.f = editorTrackDomain0;
        }

        public final void setTrackEnabled(boolean z) {
            this.i = z;
        }
    }

    public final EditorTrackDomain a;
    public final Service b;
    public final String c;
    public final List d;
    public final boolean e;

    public EditorTrackerConfig(@NotNull EditorTrackDomain editorTrackDomain0, @NotNull Service service0, @Nullable String s, @Nullable List list0, boolean z) {
        Intrinsics.checkNotNullParameter(editorTrackDomain0, "trackDomain");
        Intrinsics.checkNotNullParameter(service0, "service");
        super();
        this.a = editorTrackDomain0;
        this.b = service0;
        this.c = s;
        this.d = list0;
        this.e = z;
    }

    @NotNull
    public final EditorTrackDomain component1() {
        return this.a;
    }

    @NotNull
    public final Service component2() {
        return this.b;
    }

    @Nullable
    public final String component3() {
        return this.c;
    }

    @Nullable
    public final List component4() {
        return this.d;
    }

    public final boolean component5() {
        return this.e;
    }

    @NotNull
    public final EditorTrackerConfig copy(@NotNull EditorTrackDomain editorTrackDomain0, @NotNull Service service0, @Nullable String s, @Nullable List list0, boolean z) {
        Intrinsics.checkNotNullParameter(editorTrackDomain0, "trackDomain");
        Intrinsics.checkNotNullParameter(service0, "service");
        return new EditorTrackerConfig(editorTrackDomain0, service0, s, list0, z);
    }

    public static EditorTrackerConfig copy$default(EditorTrackerConfig editorTrackerConfig0, EditorTrackDomain editorTrackDomain0, Service service0, String s, List list0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            editorTrackDomain0 = editorTrackerConfig0.a;
        }
        if((v & 2) != 0) {
            service0 = editorTrackerConfig0.b;
        }
        if((v & 4) != 0) {
            s = editorTrackerConfig0.c;
        }
        if((v & 8) != 0) {
            list0 = editorTrackerConfig0.d;
        }
        if((v & 16) != 0) {
            z = editorTrackerConfig0.e;
        }
        return editorTrackerConfig0.copy(editorTrackDomain0, service0, s, list0, z);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof EditorTrackerConfig)) {
            return false;
        }
        if(this.a != ((EditorTrackerConfig)object0).a) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((EditorTrackerConfig)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((EditorTrackerConfig)object0).c)) {
            return false;
        }
        return Intrinsics.areEqual(this.d, ((EditorTrackerConfig)object0).d) ? this.e == ((EditorTrackerConfig)object0).e : false;
    }

    @Nullable
    public final List getEditorPlugins() {
        return this.d;
    }

    @Nullable
    public final String getEditorVersion() {
        return this.c;
    }

    @NotNull
    public final Service getService() {
        return this.b;
    }

    @NotNull
    public final EditorTrackDomain getTrackDomain() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        int v2 = 0;
        int v3 = this.c == null ? 0 : this.c.hashCode();
        List list0 = this.d;
        if(list0 != null) {
            v2 = list0.hashCode();
        }
        return Boolean.hashCode(this.e) + (((v1 + v * 0x1F) * 0x1F + v3) * 0x1F + v2) * 0x1F;
    }

    public final boolean isTrackEnabled() {
        return this.e;
    }

    @Override
    @NotNull
    public String toString() {
        return "EditorTrackerConfig(trackDomain=" + this.a + ", service=" + this.b + ", editorVersion=" + this.c + ", editorPlugins=" + this.d + ", isTrackEnabled=" + this.e + ")";
    }
}

