package androidx.datastore.preferences;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/datastore/preferences/PreferencesMapCompat;", "", "()V", "Companion", "datastore-preferences-proto"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PreferencesMapCompat {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/datastore/preferences/PreferencesMapCompat$Companion;", "", "Ljava/io/InputStream;", "input", "Landroidx/datastore/preferences/PreferencesProto$PreferenceMap;", "readFrom", "(Ljava/io/InputStream;)Landroidx/datastore/preferences/PreferencesProto$PreferenceMap;", "datastore-preferences-proto"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final PreferenceMap readFrom(@NotNull InputStream inputStream0) {
            Intrinsics.checkNotNullParameter(inputStream0, "input");
            try {
                PreferenceMap preferencesProto$PreferenceMap0 = PreferenceMap.parseFrom(inputStream0);
                Intrinsics.checkNotNullExpressionValue(preferencesProto$PreferenceMap0, "{\n                Prefer…From(input)\n            }");
                return preferencesProto$PreferenceMap0;
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                throw new CorruptionException("Unable to parse preferences proto.", invalidProtocolBufferException0);
            }
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        PreferencesMapCompat.Companion = new Companion(null);
    }
}

