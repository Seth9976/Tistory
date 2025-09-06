package androidx.datastore.preferences.core;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.okio.OkioSerializer;
import androidx.datastore.preferences.PreferencesMapCompat;
import androidx.datastore.preferences.PreferencesProto.PreferenceMap.Builder;
import androidx.datastore.preferences.PreferencesProto.PreferenceMap;
import androidx.datastore.preferences.PreferencesProto.StringSet;
import androidx.datastore.preferences.PreferencesProto.Value.ValueCase;
import androidx.datastore.preferences.PreferencesProto.Value;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.BufferedSink;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0003H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000B\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\bH\u0096@¢\u0006\u0004\b\u000B\u0010\fR\u0014\u0010\u000E\u001A\u00020\r8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000E\u0010\u000FR\u0014\u0010\u0012\u001A\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/datastore/preferences/core/PreferencesSerializer;", "Landroidx/datastore/core/okio/OkioSerializer;", "Landroidx/datastore/preferences/core/Preferences;", "Lokio/BufferedSource;", "source", "readFrom", "(Lokio/BufferedSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "Lokio/BufferedSink;", "sink", "", "writeTo", "(Landroidx/datastore/preferences/core/Preferences;Lokio/BufferedSink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "fileExtension", "Ljava/lang/String;", "getDefaultValue", "()Landroidx/datastore/preferences/core/Preferences;", "defaultValue", "datastore-preferences-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPreferencesSerializer.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreferencesSerializer.jvm.kt\nandroidx/datastore/preferences/core/PreferencesSerializer\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,115:1\n215#2,2:116\n*S KotlinDebug\n*F\n+ 1 PreferencesSerializer.jvm.kt\nandroidx/datastore/preferences/core/PreferencesSerializer\n*L\n50#1:116,2\n*E\n"})
public final class PreferencesSerializer implements OkioSerializer {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[ValueCase.values().length];
            try {
                arr_v[ValueCase.BOOLEAN.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ValueCase.FLOAT.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ValueCase.DOUBLE.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ValueCase.INTEGER.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ValueCase.LONG.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ValueCase.STRING.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ValueCase.STRING_SET.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ValueCase.BYTES.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ValueCase.VALUE_NOT_SET.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @NotNull
    public static final PreferencesSerializer INSTANCE = null;
    @NotNull
    public static final String fileExtension = "preferences_pb";

    static {
        PreferencesSerializer.INSTANCE = new PreferencesSerializer();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public Preferences getDefaultValue() {
        return PreferencesFactory.createEmpty();
    }

    @Override  // androidx.datastore.core.okio.OkioSerializer
    public Object getDefaultValue() {
        return this.getDefaultValue();
    }

    @Override  // androidx.datastore.core.okio.OkioSerializer
    @Nullable
    public Object readFrom(@NotNull BufferedSource bufferedSource0, @NotNull Continuation continuation0) throws IOException, CorruptionException {
        InputStream inputStream0 = bufferedSource0.inputStream();
        PreferenceMap preferencesProto$PreferenceMap0 = PreferencesMapCompat.Companion.readFrom(inputStream0);
        MutablePreferences mutablePreferences0 = PreferencesFactory.createMutable(new Pair[0]);
        Map map0 = preferencesProto$PreferenceMap0.getPreferencesMap();
        Intrinsics.checkNotNullExpressionValue(map0, "preferencesProto.preferencesMap");
        for(Object object0: map0.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            Value preferencesProto$Value0 = (Value)((Map.Entry)object0).getValue();
            Intrinsics.checkNotNullExpressionValue(s, "name");
            Intrinsics.checkNotNullExpressionValue(preferencesProto$Value0, "value");
            PreferencesSerializer.INSTANCE.getClass();
            ValueCase preferencesProto$Value$ValueCase0 = preferencesProto$Value0.getValueCase();
            switch((preferencesProto$Value$ValueCase0 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[preferencesProto$Value$ValueCase0.ordinal()])) {
                case -1: {
                    throw new CorruptionException("Value case is null.", null, 2, null);
                }
                case 1: {
                    mutablePreferences0.set(PreferencesKeys.booleanKey(s), Boolean.valueOf(preferencesProto$Value0.getBoolean()));
                    break;
                }
                case 2: {
                    mutablePreferences0.set(PreferencesKeys.floatKey(s), preferencesProto$Value0.getFloat());
                    break;
                }
                case 3: {
                    mutablePreferences0.set(PreferencesKeys.doubleKey(s), preferencesProto$Value0.getDouble());
                    break;
                }
                case 4: {
                    mutablePreferences0.set(PreferencesKeys.intKey(s), preferencesProto$Value0.getInteger());
                    break;
                }
                case 5: {
                    mutablePreferences0.set(PreferencesKeys.longKey(s), preferencesProto$Value0.getLong());
                    break;
                }
                case 6: {
                    Key preferences$Key0 = PreferencesKeys.stringKey(s);
                    Intrinsics.checkNotNullExpressionValue("", "value.string");
                    mutablePreferences0.set(preferences$Key0, "");
                    break;
                }
                case 7: {
                    Key preferences$Key1 = PreferencesKeys.stringSetKey(s);
                    List list0 = preferencesProto$Value0.getStringSet().getStringsList();
                    Intrinsics.checkNotNullExpressionValue(list0, "value.stringSet.stringsList");
                    mutablePreferences0.set(preferences$Key1, CollectionsKt___CollectionsKt.toSet(list0));
                    break;
                }
                case 8: {
                    Key preferences$Key2 = PreferencesKeys.byteArrayKey(s);
                    byte[] arr_b = preferencesProto$Value0.getBytes().toByteArray();
                    Intrinsics.checkNotNullExpressionValue(arr_b, "value.bytes.toByteArray()");
                    mutablePreferences0.set(preferences$Key2, arr_b);
                    break;
                }
                case 9: {
                    throw new CorruptionException("Value not set.", null, 2, null);
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return mutablePreferences0.toPreferences();
    }

    @Nullable
    public Object writeTo(@NotNull Preferences preferences0, @NotNull BufferedSink bufferedSink0, @NotNull Continuation continuation0) throws IOException, CorruptionException {
        Value preferencesProto$Value0;
        Map map0 = preferences0.asMap();
        Builder preferencesProto$PreferenceMap$Builder0 = PreferenceMap.newBuilder();
        for(Object object0: map0.entrySet()) {
            Key preferences$Key0 = (Key)((Map.Entry)object0).getKey();
            Object object1 = ((Map.Entry)object0).getValue();
            String s = preferences$Key0.getName();
            if(object1 instanceof Boolean) {
                GeneratedMessageLite generatedMessageLite0 = Value.newBuilder().setBoolean(((Boolean)object1).booleanValue()).build();
                Intrinsics.checkNotNullExpressionValue(generatedMessageLite0, "newBuilder().setBoolean(value).build()");
                preferencesProto$Value0 = (Value)generatedMessageLite0;
            }
            else if(object1 instanceof Float) {
                GeneratedMessageLite generatedMessageLite1 = Value.newBuilder().setFloat(((Number)object1).floatValue()).build();
                Intrinsics.checkNotNullExpressionValue(generatedMessageLite1, "newBuilder().setFloat(value).build()");
                preferencesProto$Value0 = (Value)generatedMessageLite1;
            }
            else if(object1 instanceof Double) {
                GeneratedMessageLite generatedMessageLite2 = Value.newBuilder().setDouble(((Number)object1).doubleValue()).build();
                Intrinsics.checkNotNullExpressionValue(generatedMessageLite2, "newBuilder().setDouble(value).build()");
                preferencesProto$Value0 = (Value)generatedMessageLite2;
            }
            else if(object1 instanceof Integer) {
                GeneratedMessageLite generatedMessageLite3 = Value.newBuilder().setInteger(((Number)object1).intValue()).build();
                Intrinsics.checkNotNullExpressionValue(generatedMessageLite3, "newBuilder().setInteger(value).build()");
                preferencesProto$Value0 = (Value)generatedMessageLite3;
            }
            else if(object1 instanceof Long) {
                GeneratedMessageLite generatedMessageLite4 = Value.newBuilder().setLong(((Number)object1).longValue()).build();
                Intrinsics.checkNotNullExpressionValue(generatedMessageLite4, "newBuilder().setLong(value).build()");
                preferencesProto$Value0 = (Value)generatedMessageLite4;
            }
            else if(object1 instanceof String) {
                GeneratedMessageLite generatedMessageLite5 = Value.newBuilder().setString(((String)object1)).build();
                Intrinsics.checkNotNullExpressionValue(generatedMessageLite5, "newBuilder().setString(value).build()");
                preferencesProto$Value0 = (Value)generatedMessageLite5;
            }
            else if(object1 instanceof Set) {
                androidx.datastore.preferences.PreferencesProto.Value.Builder preferencesProto$Value$Builder0 = Value.newBuilder();
                androidx.datastore.preferences.PreferencesProto.StringSet.Builder preferencesProto$StringSet$Builder0 = StringSet.newBuilder();
                Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                GeneratedMessageLite generatedMessageLite6 = preferencesProto$Value$Builder0.setStringSet(preferencesProto$StringSet$Builder0.addAllStrings(((Set)object1))).build();
                Intrinsics.checkNotNullExpressionValue(generatedMessageLite6, "newBuilder().setStringSe…                ).build()");
                preferencesProto$Value0 = (Value)generatedMessageLite6;
            }
            else {
                if(!(object1 instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: " + object1.getClass().getName());
                }
                GeneratedMessageLite generatedMessageLite7 = Value.newBuilder().setBytes(ByteString.copyFrom(((byte[])object1))).build();
                Intrinsics.checkNotNullExpressionValue(generatedMessageLite7, "newBuilder().setBytes(By….copyFrom(value)).build()");
                preferencesProto$Value0 = (Value)generatedMessageLite7;
            }
            preferencesProto$PreferenceMap$Builder0.putPreferences(s, preferencesProto$Value0);
        }
        ((PreferenceMap)preferencesProto$PreferenceMap$Builder0.build()).writeTo(bufferedSink0.outputStream());
        return Unit.INSTANCE;
    }

    @Override  // androidx.datastore.core.okio.OkioSerializer
    public Object writeTo(Object object0, BufferedSink bufferedSink0, Continuation continuation0) {
        return this.writeTo(((Preferences)object0), bufferedSink0, continuation0);
    }
}

