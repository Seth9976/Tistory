package kotlinx.serialization.builtins;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.UByte.Companion;
import kotlin.Unit;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanArraySerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.ByteArraySerializer;
import kotlinx.serialization.internal.ByteSerializer;
import kotlinx.serialization.internal.CharArraySerializer;
import kotlinx.serialization.internal.CharSerializer;
import kotlinx.serialization.internal.DoubleArraySerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.DurationSerializer;
import kotlinx.serialization.internal.FloatArraySerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntArraySerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.LongArraySerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.MapEntrySerializer;
import kotlinx.serialization.internal.NothingSerializer;
import kotlinx.serialization.internal.NullableSerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.ReferenceArraySerializer;
import kotlinx.serialization.internal.ShortArraySerializer;
import kotlinx.serialization.internal.ShortSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TripleSerializer;
import kotlinx.serialization.internal.UByteArraySerializer;
import kotlinx.serialization.internal.UByteSerializer;
import kotlinx.serialization.internal.UIntArraySerializer;
import kotlinx.serialization.internal.UIntSerializer;
import kotlinx.serialization.internal.ULongArraySerializer;
import kotlinx.serialization.internal.ULongSerializer;
import kotlinx.serialization.internal.UShortArraySerializer;
import kotlinx.serialization.internal.UShortSerializer;
import kotlinx.serialization.internal.UnitSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0090\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001AF\u0010\b\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\t0\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\n\b\u0001\u0010\n*\u0004\u0018\u0001H\u00022\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\u00020\f2\f\u0010\r\u001A\b\u0012\u0004\u0012\u0002H\n0\u0001H\u0007\u001A=\u0010\b\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\t0\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003\"\f\b\u0001\u0010\n\u0018\u0001*\u0004\u0018\u0001H\u00022\f\u0010\r\u001A\b\u0012\u0004\u0012\u0002H\n0\u0001H\u0087\b\u001A\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u000F0\u0001\u001A\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00110\u0001\u001A\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00130\u0001\u001A\f\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00150\u0001\u001A\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00170\u0001\u001A\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00190\u0001\u001A&\u0010\u001A\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u001B0\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\r\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001A\f\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u001D0\u0001\u001A@\u0010\u001E\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u0002H \u0012\u0004\u0012\u0002H!0\u001F0\u0001\"\u0004\b\u0000\u0010 \"\u0004\b\u0001\u0010!2\f\u0010\"\u001A\b\u0012\u0004\u0012\u0002H 0\u00012\f\u0010#\u001A\b\u0012\u0004\u0012\u0002H!0\u0001\u001A@\u0010$\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u0002H \u0012\u0004\u0012\u0002H!0%0\u0001\"\u0004\b\u0000\u0010 \"\u0004\b\u0001\u0010!2\f\u0010\"\u001A\b\u0012\u0004\u0012\u0002H 0\u00012\f\u0010#\u001A\b\u0012\u0004\u0012\u0002H!0\u0001\u001A\u000E\u0010&\u001A\b\u0012\u0004\u0012\u00020\'0\u0001H\u0007\u001A@\u0010(\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u0002H \u0012\u0004\u0012\u0002H!0)0\u0001\"\u0004\b\u0000\u0010 \"\u0004\b\u0001\u0010!2\f\u0010\"\u001A\b\u0012\u0004\u0012\u0002H 0\u00012\f\u0010#\u001A\b\u0012\u0004\u0012\u0002H!0\u0001\u001A&\u0010*\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020+0\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\r\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001A\f\u0010,\u001A\b\u0012\u0004\u0012\u00020-0\u0001\u001AZ\u0010.\u001A\u001A\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H0\u0012\u0004\u0012\u0002H1\u0012\u0004\u0012\u0002H20/0\u0001\"\u0004\b\u0000\u00100\"\u0004\b\u0001\u00101\"\u0004\b\u0002\u001022\f\u00103\u001A\b\u0012\u0004\u0012\u0002H00\u00012\f\u00104\u001A\b\u0012\u0004\u0012\u0002H10\u00012\f\u00105\u001A\b\u0012\u0004\u0012\u0002H20\u0001\u001A\u000E\u00106\u001A\b\u0012\u0004\u0012\u0002070\u0001H\u0007\u001A\u000E\u00108\u001A\b\u0012\u0004\u0012\u0002090\u0001H\u0007\u001A\u000E\u0010:\u001A\b\u0012\u0004\u0012\u00020;0\u0001H\u0007\u001A\u000E\u0010<\u001A\b\u0012\u0004\u0012\u00020=0\u0001H\u0007\u001A\u0015\u0010>\u001A\b\u0012\u0004\u0012\u00020?0\u0001*\u00020@\u00A2\u0006\u0002\u0010A\u001A\u0010\u0010>\u001A\b\u0012\u0004\u0012\u00020B0\u0001*\u00020C\u001A\u0010\u0010>\u001A\b\u0012\u0004\u0012\u00020D0\u0001*\u00020E\u001A\u0010\u0010>\u001A\b\u0012\u0004\u0012\u00020F0\u0001*\u00020G\u001A\u0010\u0010>\u001A\b\u0012\u0004\u0012\u00020H0\u0001*\u00020I\u001A\u0010\u0010>\u001A\b\u0012\u0004\u0012\u00020J0\u0001*\u00020K\u001A\u0010\u0010>\u001A\b\u0012\u0004\u0012\u00020L0\u0001*\u00020M\u001A\u0010\u0010>\u001A\b\u0012\u0004\u0012\u00020N0\u0001*\u00020O\u001A\u0010\u0010>\u001A\b\u0012\u0004\u0012\u00020P0\u0001*\u00020Q\u001A\u0010\u0010>\u001A\b\u0012\u0004\u0012\u00020R0\u0001*\u00020S\u001A\u0010\u0010>\u001A\b\u0012\u0004\u0012\u00020T0\u0001*\u00020U\u001A\u0010\u0010>\u001A\b\u0012\u0004\u0012\u00020V0\u0001*\u00020W\u001A\u0010\u0010>\u001A\b\u0012\u0004\u0012\u00020X0\u0001*\u00020Y\u001A\u0015\u0010>\u001A\b\u0012\u0004\u0012\u00020Z0\u0001*\u00020Z\u00A2\u0006\u0002\u0010[\u001A\u0010\u0010>\u001A\b\u0012\u0004\u0012\u00020\\0\u0001*\u00020]\"3\u0010\u0000\u001A\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00018F\u00A2\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007\u00A8\u0006^"}, d2 = {"nullable", "Lkotlinx/serialization/KSerializer;", "T", "", "getNullable$annotations", "(Lkotlinx/serialization/KSerializer;)V", "getNullable", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "ArraySerializer", "", "E", "kClass", "Lkotlin/reflect/KClass;", "elementSerializer", "BooleanArraySerializer", "", "ByteArraySerializer", "", "CharArraySerializer", "", "DoubleArraySerializer", "", "FloatArraySerializer", "", "IntArraySerializer", "", "ListSerializer", "", "LongArraySerializer", "", "MapEntrySerializer", "", "K", "V", "keySerializer", "valueSerializer", "MapSerializer", "", "NothingSerializer", "", "PairSerializer", "Lkotlin/Pair;", "SetSerializer", "", "ShortArraySerializer", "", "TripleSerializer", "Lkotlin/Triple;", "A", "B", "C", "aSerializer", "bSerializer", "cSerializer", "UByteArraySerializer", "Lkotlin/UByteArray;", "UIntArraySerializer", "Lkotlin/UIntArray;", "ULongArraySerializer", "Lkotlin/ULongArray;", "UShortArraySerializer", "Lkotlin/UShortArray;", "serializer", "", "Lkotlin/Boolean$Companion;", "(Lkotlin/jvm/internal/BooleanCompanionObject;)Lkotlinx/serialization/KSerializer;", "", "Lkotlin/Byte$Companion;", "", "Lkotlin/Char$Companion;", "", "Lkotlin/Double$Companion;", "", "Lkotlin/Float$Companion;", "", "Lkotlin/Int$Companion;", "", "Lkotlin/Long$Companion;", "", "Lkotlin/Short$Companion;", "", "Lkotlin/String$Companion;", "Lkotlin/UByte;", "Lkotlin/UByte$Companion;", "Lkotlin/UInt;", "Lkotlin/UInt$Companion;", "Lkotlin/ULong;", "Lkotlin/ULong$Companion;", "Lkotlin/UShort;", "Lkotlin/UShort$Companion;", "", "(Lkotlin/Unit;)Lkotlinx/serialization/KSerializer;", "Lkotlin/time/Duration;", "Lkotlin/time/Duration$Companion;", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class BuiltinSerializersKt {
    @ExperimentalSerializationApi
    @NotNull
    public static final KSerializer ArraySerializer(@NotNull KClass kClass0, @NotNull KSerializer kSerializer0) {
        Intrinsics.checkNotNullParameter(kClass0, "kClass");
        Intrinsics.checkNotNullParameter(kSerializer0, "elementSerializer");
        return new ReferenceArraySerializer(kClass0, kSerializer0);
    }

    @ExperimentalSerializationApi
    public static final KSerializer ArraySerializer(KSerializer kSerializer0) {
        Intrinsics.checkNotNullParameter(kSerializer0, "elementSerializer");
        Intrinsics.reifiedOperationMarker(4, "T");
        return BuiltinSerializersKt.ArraySerializer(Reflection.getOrCreateKotlinClass(Object.class), kSerializer0);
    }

    @NotNull
    public static final KSerializer BooleanArraySerializer() {
        return BooleanArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer ByteArraySerializer() {
        return ByteArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer CharArraySerializer() {
        return CharArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer DoubleArraySerializer() {
        return DoubleArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer FloatArraySerializer() {
        return FloatArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer IntArraySerializer() {
        return IntArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer ListSerializer(@NotNull KSerializer kSerializer0) {
        Intrinsics.checkNotNullParameter(kSerializer0, "elementSerializer");
        return new ArrayListSerializer(kSerializer0);
    }

    @NotNull
    public static final KSerializer LongArraySerializer() {
        return LongArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer MapEntrySerializer(@NotNull KSerializer kSerializer0, @NotNull KSerializer kSerializer1) {
        Intrinsics.checkNotNullParameter(kSerializer0, "keySerializer");
        Intrinsics.checkNotNullParameter(kSerializer1, "valueSerializer");
        return new MapEntrySerializer(kSerializer0, kSerializer1);
    }

    @NotNull
    public static final KSerializer MapSerializer(@NotNull KSerializer kSerializer0, @NotNull KSerializer kSerializer1) {
        Intrinsics.checkNotNullParameter(kSerializer0, "keySerializer");
        Intrinsics.checkNotNullParameter(kSerializer1, "valueSerializer");
        return new LinkedHashMapSerializer(kSerializer0, kSerializer1);
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final KSerializer NothingSerializer() {
        return NothingSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer PairSerializer(@NotNull KSerializer kSerializer0, @NotNull KSerializer kSerializer1) {
        Intrinsics.checkNotNullParameter(kSerializer0, "keySerializer");
        Intrinsics.checkNotNullParameter(kSerializer1, "valueSerializer");
        return new PairSerializer(kSerializer0, kSerializer1);
    }

    @NotNull
    public static final KSerializer SetSerializer(@NotNull KSerializer kSerializer0) {
        Intrinsics.checkNotNullParameter(kSerializer0, "elementSerializer");
        return new LinkedHashSetSerializer(kSerializer0);
    }

    @NotNull
    public static final KSerializer ShortArraySerializer() {
        return ShortArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer TripleSerializer(@NotNull KSerializer kSerializer0, @NotNull KSerializer kSerializer1, @NotNull KSerializer kSerializer2) {
        Intrinsics.checkNotNullParameter(kSerializer0, "aSerializer");
        Intrinsics.checkNotNullParameter(kSerializer1, "bSerializer");
        Intrinsics.checkNotNullParameter(kSerializer2, "cSerializer");
        return new TripleSerializer(kSerializer0, kSerializer1, kSerializer2);
    }

    @ExperimentalUnsignedTypes
    @ExperimentalSerializationApi
    @NotNull
    public static final KSerializer UByteArraySerializer() {
        return UByteArraySerializer.INSTANCE;
    }

    @ExperimentalUnsignedTypes
    @ExperimentalSerializationApi
    @NotNull
    public static final KSerializer UIntArraySerializer() {
        return UIntArraySerializer.INSTANCE;
    }

    @ExperimentalUnsignedTypes
    @ExperimentalSerializationApi
    @NotNull
    public static final KSerializer ULongArraySerializer() {
        return ULongArraySerializer.INSTANCE;
    }

    @ExperimentalUnsignedTypes
    @ExperimentalSerializationApi
    @NotNull
    public static final KSerializer UShortArraySerializer() {
        return UShortArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer getNullable(@NotNull KSerializer kSerializer0) {
        Intrinsics.checkNotNullParameter(kSerializer0, "<this>");
        return !kSerializer0.getDescriptor().isNullable() ? new NullableSerializer(kSerializer0) : kSerializer0;
    }

    public static void getNullable$annotations(KSerializer kSerializer0) {
    }

    @NotNull
    public static final KSerializer serializer(@NotNull Companion uByte$Companion0) {
        Intrinsics.checkNotNullParameter(uByte$Companion0, "<this>");
        return UByteSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer serializer(@NotNull kotlin.UInt.Companion uInt$Companion0) {
        Intrinsics.checkNotNullParameter(uInt$Companion0, "<this>");
        return UIntSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer serializer(@NotNull kotlin.ULong.Companion uLong$Companion0) {
        Intrinsics.checkNotNullParameter(uLong$Companion0, "<this>");
        return ULongSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer serializer(@NotNull kotlin.UShort.Companion uShort$Companion0) {
        Intrinsics.checkNotNullParameter(uShort$Companion0, "<this>");
        return UShortSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer serializer(@NotNull Unit unit0) {
        Intrinsics.checkNotNullParameter(unit0, "<this>");
        return UnitSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer serializer(@NotNull BooleanCompanionObject booleanCompanionObject0) {
        Intrinsics.checkNotNullParameter(booleanCompanionObject0, "<this>");
        return BooleanSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer serializer(@NotNull ByteCompanionObject byteCompanionObject0) {
        Intrinsics.checkNotNullParameter(byteCompanionObject0, "<this>");
        return ByteSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer serializer(@NotNull CharCompanionObject charCompanionObject0) {
        Intrinsics.checkNotNullParameter(charCompanionObject0, "<this>");
        return CharSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer serializer(@NotNull DoubleCompanionObject doubleCompanionObject0) {
        Intrinsics.checkNotNullParameter(doubleCompanionObject0, "<this>");
        return DoubleSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer serializer(@NotNull FloatCompanionObject floatCompanionObject0) {
        Intrinsics.checkNotNullParameter(floatCompanionObject0, "<this>");
        return FloatSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer serializer(@NotNull IntCompanionObject intCompanionObject0) {
        Intrinsics.checkNotNullParameter(intCompanionObject0, "<this>");
        return IntSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer serializer(@NotNull LongCompanionObject longCompanionObject0) {
        Intrinsics.checkNotNullParameter(longCompanionObject0, "<this>");
        return LongSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer serializer(@NotNull ShortCompanionObject shortCompanionObject0) {
        Intrinsics.checkNotNullParameter(shortCompanionObject0, "<this>");
        return ShortSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer serializer(@NotNull StringCompanionObject stringCompanionObject0) {
        Intrinsics.checkNotNullParameter(stringCompanionObject0, "<this>");
        return StringSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer serializer(@NotNull kotlin.time.Duration.Companion duration$Companion0) {
        Intrinsics.checkNotNullParameter(duration$Companion0, "<this>");
        return DurationSerializer.INSTANCE;
    }
}

