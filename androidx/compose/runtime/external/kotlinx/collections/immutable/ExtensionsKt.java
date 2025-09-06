package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.o;
import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u001C\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u0002\n\u0002\u0010%\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001AQ\u0010\u0000\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u0004\u001A\u0016\u0012\u0012\b\u0001\u0012\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005\"\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0006H\u0001\u00A2\u0006\u0002\u0010\u0007\u001A-\u0010\b\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\u0012\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005\"\u0002H\nH\u0001\u00A2\u0006\u0002\u0010\f\u001A\u0014\u0010\r\u001A\b\u0012\u0004\u0012\u0002H\n0\u000E\"\u0004\b\u0000\u0010\nH\u0001\u001A-\u0010\r\u001A\b\u0012\u0004\u0012\u0002H\n0\u000E\"\u0004\b\u0000\u0010\n2\u0012\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005\"\u0002H\nH\u0001\u00A2\u0006\u0002\u0010\u000F\u001AQ\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u0004\u001A\u0016\u0012\u0012\b\u0001\u0012\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005\"\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0006H\u0001\u00A2\u0006\u0002\u0010\u0007\u001A\u0014\u0010\u0011\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\nH\u0001\u001A-\u0010\u0011\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\u0012\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005\"\u0002H\nH\u0001\u00A2\u0006\u0002\u0010\f\u001A \u0010\u0012\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0000\u001AQ\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u0004\u001A\u0016\u0012\u0012\b\u0001\u0012\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005\"\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0006H\u0000\u00A2\u0006\u0002\u0010\u0007\u001A\u0014\u0010\u0013\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\nH\u0000\u001A-\u0010\u0013\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\u0012\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005\"\u0002H\nH\u0000\u00A2\u0006\u0002\u0010\f\u001A\u0014\u0010\u0014\u001A\b\u0012\u0004\u0012\u0002H\n0\u000E\"\u0004\b\u0000\u0010\nH\u0000\u001A-\u0010\u0014\u001A\b\u0012\u0004\u0012\u0002H\n0\u000E\"\u0004\b\u0000\u0010\n2\u0012\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005\"\u0002H\nH\u0000\u00A2\u0006\u0002\u0010\u000F\u001A \u0010\u0015\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0000\u001AQ\u0010\u0015\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u0004\u001A\u0016\u0012\u0012\b\u0001\u0012\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005\"\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0006H\u0000\u00A2\u0006\u0002\u0010\u0007\u001A\u0014\u0010\u0016\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\nH\u0000\u001A-\u0010\u0016\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\u0012\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005\"\u0002H\nH\u0000\u00A2\u0006\u0002\u0010\f\u001A-\u0010\u0017\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0004\u001A-\u0010\u0017\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0004\u001A,\u0010\u001A\u001A\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\u0006\u0010\u001B\u001A\u0002H\nH\u0080\n\u00A2\u0006\u0002\u0010\u001C\u001A4\u0010\u001A\u001A\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\u000E\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005H\u0080\u0002\u00A2\u0006\u0002\u0010\u001D\u001A-\u0010\u001A\u001A\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0002\u001A-\u0010\u001A\u001A\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u001EH\u0080\u0002\u001A,\u0010\u001A\u001A\b\u0012\u0004\u0012\u0002H\n0\u000E\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000E2\u0006\u0010\u001B\u001A\u0002H\nH\u0080\n\u00A2\u0006\u0002\u0010\u001F\u001A4\u0010\u001A\u001A\b\u0012\u0004\u0012\u0002H\n0\u000E\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000E2\u000E\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005H\u0080\u0002\u00A2\u0006\u0002\u0010 \u001A-\u0010\u001A\u001A\b\u0012\u0004\u0012\u0002H\n0\u000E\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000E2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0002\u001A-\u0010\u001A\u001A\b\u0012\u0004\u0012\u0002H\n0\u000E\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000E2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u001EH\u0080\u0002\u001A@\u0010\u001A\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010!\u001A\u0002H\u0002H\u0080\u0002\u00A2\u0006\u0002\u0010\"\u001AH\u0010\u001A\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u000E\u0010#\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005H\u0080\u0002\u00A2\u0006\u0002\u0010$\u001AA\u0010\u001A\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010#\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0019H\u0080\u0002\u001AA\u0010\u001A\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010#\u001A\b\u0012\u0004\u0012\u0002H\u00020\u001EH\u0080\u0002\u001A,\u0010\u001A\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\u0006\u0010\u001B\u001A\u0002H\nH\u0080\n\u00A2\u0006\u0002\u0010%\u001A4\u0010\u001A\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\u000E\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005H\u0080\u0002\u00A2\u0006\u0002\u0010&\u001A-\u0010\u001A\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0002\u001A-\u0010\u001A\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u001EH\u0080\u0002\u001A9\u0010\'\u001A\b\u0012\u0004\u0012\u0002H(0\u000E\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u000E2\u0018\u0010)\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H(0+\u0012\u0004\u0012\u00020,0*H\u0080\b\u001AS\u0010\'\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001E\u0010)\u001A\u001A\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030-\u0012\u0004\u0012\u00020,0*H\u0080\b\u001A9\u0010\'\u001A\b\u0012\u0004\u0012\u0002H(0\t\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\t2\u0018\u0010)\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H(0.\u0012\u0004\u0012\u00020,0*H\u0080\b\u001A,\u0010/\u001A\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\u0006\u0010\u001B\u001A\u0002H\nH\u0080\n\u00A2\u0006\u0002\u0010\u001C\u001A4\u0010/\u001A\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\u000E\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005H\u0080\u0002\u00A2\u0006\u0002\u0010\u001D\u001A-\u0010/\u001A\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0002\u001A-\u0010/\u001A\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u001EH\u0080\u0002\u001A,\u0010/\u001A\b\u0012\u0004\u0012\u0002H\n0\u000E\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000E2\u0006\u0010\u001B\u001A\u0002H\nH\u0080\n\u00A2\u0006\u0002\u0010\u001F\u001A4\u0010/\u001A\b\u0012\u0004\u0012\u0002H\n0\u000E\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000E2\u000E\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005H\u0080\u0002\u00A2\u0006\u0002\u0010 \u001A-\u0010/\u001A\b\u0012\u0004\u0012\u0002H\n0\u000E\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000E2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0002\u001A-\u0010/\u001A\b\u0012\u0004\u0012\u0002H\n0\u000E\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000E2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u001EH\u0080\u0002\u001AT\u0010/\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001A\u0010\u0004\u001A\u0016\u0012\u0012\b\u0001\u0012\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005H\u0080\n\u00A2\u0006\u0002\u00100\u001AG\u0010/\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u00101\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0006H\u0080\n\u001AM\u0010/\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u0004\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0019H\u0080\n\u001AI\u0010/\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0014\u00102\u001A\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303H\u0080\n\u001AM\u0010/\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u0004\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u001EH\u0080\n\u001A,\u0010/\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\u0006\u0010\u001B\u001A\u0002H\nH\u0080\n\u00A2\u0006\u0002\u0010%\u001A4\u0010/\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\u000E\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005H\u0080\u0002\u00A2\u0006\u0002\u0010&\u001A-\u0010/\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0002\u001A-\u0010/\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u001EH\u0080\u0002\u001AS\u00104\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001A\u0010\u0004\u001A\u0016\u0012\u0012\b\u0001\u0012\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005H\u0000\u00A2\u0006\u0002\u00100\u001AL\u00104\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u0004\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0019H\u0000\u001AH\u00104\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0014\u00102\u001A\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303H\u0000\u001AL\u00104\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u0004\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u001EH\u0000\u001A\u0012\u00105\u001A\b\u0012\u0004\u0012\u00020706*\u000208H\u0000\u001A\u001E\u00105\u001A\b\u0012\u0004\u0012\u0002H(06\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u0019H\u0000\u001A\u001E\u00105\u001A\b\u0012\u0004\u0012\u0002H(06\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u001EH\u0000\u001A0\u00109\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030:\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303H\u0000\u001A\u0012\u0010;\u001A\b\u0012\u0004\u0012\u0002070\t*\u000208H\u0000\u001A\u001E\u0010;\u001A\b\u0012\u0004\u0012\u0002H(0<\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u0019H\u0000\u001A\u001E\u0010;\u001A\b\u0012\u0004\u0012\u0002H(0<\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u001EH\u0000\u001A0\u0010=\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303H\u0000\u001A\u0012\u0010>\u001A\b\u0012\u0004\u0012\u0002070\t*\u000208H\u0000\u001A\u001E\u0010>\u001A\b\u0012\u0004\u0012\u0002H(0\t\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u0019H\u0000\u001A\u001E\u0010>\u001A\b\u0012\u0004\u0012\u0002H(0\t\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u001EH\u0000\u001A\u0012\u0010?\u001A\b\u0012\u0004\u0012\u0002070\u000E*\u000208H\u0000\u001A\u001E\u0010?\u001A\b\u0012\u0004\u0012\u0002H(0\u000E\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u0019H\u0000\u001A\u001E\u0010?\u001A\b\u0012\u0004\u0012\u0002H(0\u000E\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u001EH\u0000\u001A0\u0010@\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303H\u0000\u001A\u0012\u0010A\u001A\b\u0012\u0004\u0012\u0002070\t*\u000208H\u0000\u001A\u001E\u0010A\u001A\b\u0012\u0004\u0012\u0002H(0\t\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u0019H\u0000\u001A\u001E\u0010A\u001A\b\u0012\u0004\u0012\u0002H(0\t\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u001EH\u0000\u00A8\u0006B"}, d2 = {"immutableHashMapOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "K", "V", "pairs", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "immutableHashSetOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "E", "elements", "([Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "immutableListOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "([Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "immutableMapOf", "immutableSetOf", "persistentHashMapOf", "persistentHashSetOf", "persistentListOf", "persistentMapOf", "persistentSetOf", "intersect", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "", "minus", "element", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "Lkotlin/sequences/Sequence;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "key", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "keys", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "mutate", "T", "mutator", "Lkotlin/Function1;", "", "", "", "", "plus", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;[Lkotlin/Pair;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "pair", "map", "", "putAll", "toImmutableList", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "", "", "toImmutableMap", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableMap;", "toImmutableSet", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "toPersistentHashMap", "toPersistentHashSet", "toPersistentList", "toPersistentMap", "toPersistentSet", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nextensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,741:1\n41#1:743\n41#1:744\n41#1:745\n41#1:746\n41#1:747\n41#1:748\n31#1:749\n31#1:750\n31#1:751\n31#1:752\n31#1:753\n31#1:754\n31#1:755\n53#1:756\n53#1:757\n53#1:758\n53#1:759\n53#1:760\n53#1:761\n53#1:762\n53#1:763\n41#1:764\n31#1:765\n31#1:766\n1#2:742\n*S KotlinDebug\n*F\n+ 1 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n158#1:743\n169#1:744\n180#1:745\n192#1:746\n203#1:747\n214#1:748\n241#1:749\n250#1:750\n259#1:751\n271#1:752\n282#1:753\n293#1:754\n304#1:755\n385#1:756\n394#1:757\n403#1:758\n423#1:759\n432#1:760\n441#1:761\n489#1:762\n505#1:763\n616#1:764\n672#1:765\n701#1:766\n*E\n"})
public final class ExtensionsKt {
    @Deprecated(message = "Use persistentHashMapOf instead.", replaceWith = @ReplaceWith(expression = "persistentHashMapOf(*pairs)", imports = {}))
    @NotNull
    public static final PersistentMap immutableHashMapOf(@NotNull Pair[] arr_pair) {
        return ExtensionsKt.persistentHashMapOf(((Pair[])Arrays.copyOf(arr_pair, arr_pair.length)));
    }

    @Deprecated(message = "Use persistentHashSetOf instead.", replaceWith = @ReplaceWith(expression = "persistentHashSetOf(*elements)", imports = {}))
    @NotNull
    public static final PersistentSet immutableHashSetOf(@NotNull Object[] arr_object) {
        return ExtensionsKt.persistentHashSetOf(Arrays.copyOf(arr_object, arr_object.length));
    }

    @Deprecated(message = "Use persistentListOf instead.", replaceWith = @ReplaceWith(expression = "persistentListOf()", imports = {}))
    @NotNull
    public static final PersistentList immutableListOf() {
        return ExtensionsKt.persistentListOf();
    }

    @Deprecated(message = "Use persistentListOf instead.", replaceWith = @ReplaceWith(expression = "persistentListOf(*elements)", imports = {}))
    @NotNull
    public static final PersistentList immutableListOf(@NotNull Object[] arr_object) {
        return ExtensionsKt.persistentListOf(Arrays.copyOf(arr_object, arr_object.length));
    }

    @Deprecated(message = "Use persistentMapOf instead.", replaceWith = @ReplaceWith(expression = "persistentMapOf(*pairs)", imports = {}))
    @NotNull
    public static final PersistentMap immutableMapOf(@NotNull Pair[] arr_pair) {
        return ExtensionsKt.persistentMapOf(((Pair[])Arrays.copyOf(arr_pair, arr_pair.length)));
    }

    @Deprecated(message = "Use persistentSetOf instead.", replaceWith = @ReplaceWith(expression = "persistentSetOf()", imports = {}))
    @NotNull
    public static final PersistentSet immutableSetOf() {
        return ExtensionsKt.persistentSetOf();
    }

    @Deprecated(message = "Use persistentSetOf instead.", replaceWith = @ReplaceWith(expression = "persistentSetOf(*elements)", imports = {}))
    @NotNull
    public static final PersistentSet immutableSetOf(@NotNull Object[] arr_object) {
        return ExtensionsKt.persistentSetOf(Arrays.copyOf(arr_object, arr_object.length));
    }

    @NotNull
    public static final PersistentSet intersect(@NotNull PersistentCollection persistentCollection0, @NotNull Iterable iterable0) {
        return ExtensionsKt.intersect(ExtensionsKt.toPersistentSet(persistentCollection0), iterable0);
    }

    @NotNull
    public static final PersistentSet intersect(@NotNull PersistentSet persistentSet0, @NotNull Iterable iterable0) {
        if(iterable0 instanceof Collection) {
            return persistentSet0.retainAll(((Collection)iterable0));
        }
        Builder persistentSet$Builder0 = persistentSet0.builder();
        o.retainAll(persistentSet$Builder0, iterable0);
        return persistentSet$Builder0.build();
    }

    @NotNull
    public static final PersistentCollection minus(@NotNull PersistentCollection persistentCollection0, @NotNull Iterable iterable0) {
        if(iterable0 instanceof Collection) {
            return persistentCollection0.removeAll(((Collection)iterable0));
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder persistentCollection$Builder0 = persistentCollection0.builder();
        o.removeAll(persistentCollection$Builder0, iterable0);
        return persistentCollection$Builder0.build();
    }

    @NotNull
    public static final PersistentCollection minus(@NotNull PersistentCollection persistentCollection0, Object object0) {
        return persistentCollection0.remove(object0);
    }

    @NotNull
    public static final PersistentCollection minus(@NotNull PersistentCollection persistentCollection0, @NotNull Sequence sequence0) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder persistentCollection$Builder0 = persistentCollection0.builder();
        o.removeAll(persistentCollection$Builder0, sequence0);
        return persistentCollection$Builder0.build();
    }

    @NotNull
    public static final PersistentCollection minus(@NotNull PersistentCollection persistentCollection0, @NotNull Object[] arr_object) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder persistentCollection$Builder0 = persistentCollection0.builder();
        o.removeAll(persistentCollection$Builder0, arr_object);
        return persistentCollection$Builder0.build();
    }

    @NotNull
    public static final PersistentList minus(@NotNull PersistentList persistentList0, @NotNull Iterable iterable0) {
        if(iterable0 instanceof Collection) {
            return persistentList0.removeAll(((Collection)iterable0));
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder persistentList$Builder0 = persistentList0.builder();
        o.removeAll(persistentList$Builder0, iterable0);
        return persistentList$Builder0.build();
    }

    @NotNull
    public static final PersistentList minus(@NotNull PersistentList persistentList0, Object object0) {
        return persistentList0.remove(object0);
    }

    @NotNull
    public static final PersistentList minus(@NotNull PersistentList persistentList0, @NotNull Sequence sequence0) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder persistentList$Builder0 = persistentList0.builder();
        o.removeAll(persistentList$Builder0, sequence0);
        return persistentList$Builder0.build();
    }

    @NotNull
    public static final PersistentList minus(@NotNull PersistentList persistentList0, @NotNull Object[] arr_object) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder persistentList$Builder0 = persistentList0.builder();
        o.removeAll(persistentList$Builder0, arr_object);
        return persistentList$Builder0.build();
    }

    @NotNull
    public static final PersistentMap minus(@NotNull PersistentMap persistentMap0, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNull(persistentMap0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder persistentMap$Builder0 = persistentMap0.builder();
        o.removeAll(persistentMap$Builder0.keySet(), iterable0);
        return persistentMap$Builder0.build();
    }

    @NotNull
    public static final PersistentMap minus(@NotNull PersistentMap persistentMap0, Object object0) {
        Intrinsics.checkNotNull(persistentMap0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.minus, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.minus>");
        return persistentMap0.remove(object0);
    }

    @NotNull
    public static final PersistentMap minus(@NotNull PersistentMap persistentMap0, @NotNull Sequence sequence0) {
        Intrinsics.checkNotNull(persistentMap0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder persistentMap$Builder0 = persistentMap0.builder();
        o.removeAll(persistentMap$Builder0.keySet(), sequence0);
        return persistentMap$Builder0.build();
    }

    @NotNull
    public static final PersistentMap minus(@NotNull PersistentMap persistentMap0, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNull(persistentMap0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder persistentMap$Builder0 = persistentMap0.builder();
        o.removeAll(persistentMap$Builder0.keySet(), arr_object);
        return persistentMap$Builder0.build();
    }

    @NotNull
    public static final PersistentSet minus(@NotNull PersistentSet persistentSet0, @NotNull Iterable iterable0) {
        if(iterable0 instanceof Collection) {
            return persistentSet0.removeAll(((Collection)iterable0));
        }
        Builder persistentSet$Builder0 = persistentSet0.builder();
        o.removeAll(persistentSet$Builder0, iterable0);
        return persistentSet$Builder0.build();
    }

    @NotNull
    public static final PersistentSet minus(@NotNull PersistentSet persistentSet0, Object object0) {
        return persistentSet0.remove(object0);
    }

    @NotNull
    public static final PersistentSet minus(@NotNull PersistentSet persistentSet0, @NotNull Sequence sequence0) {
        Builder persistentSet$Builder0 = persistentSet0.builder();
        o.removeAll(persistentSet$Builder0, sequence0);
        return persistentSet$Builder0.build();
    }

    @NotNull
    public static final PersistentSet minus(@NotNull PersistentSet persistentSet0, @NotNull Object[] arr_object) {
        Builder persistentSet$Builder0 = persistentSet0.builder();
        o.removeAll(persistentSet$Builder0, arr_object);
        return persistentSet$Builder0.build();
    }

    @NotNull
    public static final PersistentList mutate(@NotNull PersistentList persistentList0, @NotNull Function1 function10) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder persistentList$Builder0 = persistentList0.builder();
        function10.invoke(persistentList$Builder0);
        return persistentList$Builder0.build();
    }

    @NotNull
    public static final PersistentMap mutate(@NotNull PersistentMap persistentMap0, @NotNull Function1 function10) {
        Intrinsics.checkNotNull(persistentMap0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder persistentMap$Builder0 = persistentMap0.builder();
        function10.invoke(persistentMap$Builder0);
        return persistentMap$Builder0.build();
    }

    @NotNull
    public static final PersistentSet mutate(@NotNull PersistentSet persistentSet0, @NotNull Function1 function10) {
        Builder persistentSet$Builder0 = persistentSet0.builder();
        function10.invoke(persistentSet$Builder0);
        return persistentSet$Builder0.build();
    }

    @NotNull
    public static final PersistentMap persistentHashMapOf() {
        return PersistentHashMap.Companion.emptyOf$runtime_release();
    }

    @NotNull
    public static final PersistentMap persistentHashMapOf(@NotNull Pair[] arr_pair) {
        PersistentHashMap persistentHashMap0 = PersistentHashMap.Companion.emptyOf$runtime_release();
        Intrinsics.checkNotNull(persistentHashMap0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder persistentMap$Builder0 = persistentHashMap0.builder();
        x.putAll(persistentMap$Builder0, arr_pair);
        return persistentMap$Builder0.build();
    }

    @NotNull
    public static final PersistentSet persistentHashSetOf() {
        return PersistentHashSet.Companion.emptyOf$runtime_release();
    }

    @NotNull
    public static final PersistentSet persistentHashSetOf(@NotNull Object[] arr_object) {
        return PersistentHashSet.Companion.emptyOf$runtime_release().addAll(ArraysKt___ArraysJvmKt.asList(arr_object));
    }

    @NotNull
    public static final PersistentList persistentListOf() {
        return UtilsKt.persistentVectorOf();
    }

    @NotNull
    public static final PersistentList persistentListOf(@NotNull Object[] arr_object) {
        return UtilsKt.persistentVectorOf().addAll(ArraysKt___ArraysJvmKt.asList(arr_object));
    }

    @NotNull
    public static final PersistentMap persistentMapOf() {
        return PersistentOrderedMap.Companion.emptyOf$runtime_release();
    }

    @NotNull
    public static final PersistentMap persistentMapOf(@NotNull Pair[] arr_pair) {
        PersistentOrderedMap persistentOrderedMap0 = PersistentOrderedMap.Companion.emptyOf$runtime_release();
        Intrinsics.checkNotNull(persistentOrderedMap0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder persistentMap$Builder0 = persistentOrderedMap0.builder();
        x.putAll(persistentMap$Builder0, arr_pair);
        return persistentMap$Builder0.build();
    }

    @NotNull
    public static final PersistentSet persistentSetOf() {
        return PersistentOrderedSet.Companion.emptyOf$runtime_release();
    }

    @NotNull
    public static final PersistentSet persistentSetOf(@NotNull Object[] arr_object) {
        return PersistentOrderedSet.Companion.emptyOf$runtime_release().addAll(ArraysKt___ArraysJvmKt.asList(arr_object));
    }

    @NotNull
    public static final PersistentCollection plus(@NotNull PersistentCollection persistentCollection0, @NotNull Iterable iterable0) {
        if(iterable0 instanceof Collection) {
            return persistentCollection0.addAll(((Collection)iterable0));
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder persistentCollection$Builder0 = persistentCollection0.builder();
        o.addAll(persistentCollection$Builder0, iterable0);
        return persistentCollection$Builder0.build();
    }

    @NotNull
    public static final PersistentCollection plus(@NotNull PersistentCollection persistentCollection0, Object object0) {
        return persistentCollection0.add(object0);
    }

    @NotNull
    public static final PersistentCollection plus(@NotNull PersistentCollection persistentCollection0, @NotNull Sequence sequence0) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder persistentCollection$Builder0 = persistentCollection0.builder();
        o.addAll(persistentCollection$Builder0, sequence0);
        return persistentCollection$Builder0.build();
    }

    @NotNull
    public static final PersistentCollection plus(@NotNull PersistentCollection persistentCollection0, @NotNull Object[] arr_object) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder persistentCollection$Builder0 = persistentCollection0.builder();
        o.addAll(persistentCollection$Builder0, arr_object);
        return persistentCollection$Builder0.build();
    }

    @NotNull
    public static final PersistentList plus(@NotNull PersistentList persistentList0, @NotNull Iterable iterable0) {
        if(iterable0 instanceof Collection) {
            return persistentList0.addAll(((Collection)iterable0));
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder persistentList$Builder0 = persistentList0.builder();
        o.addAll(persistentList$Builder0, iterable0);
        return persistentList$Builder0.build();
    }

    @NotNull
    public static final PersistentList plus(@NotNull PersistentList persistentList0, Object object0) {
        return persistentList0.add(object0);
    }

    @NotNull
    public static final PersistentList plus(@NotNull PersistentList persistentList0, @NotNull Sequence sequence0) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder persistentList$Builder0 = persistentList0.builder();
        o.addAll(persistentList$Builder0, sequence0);
        return persistentList$Builder0.build();
    }

    @NotNull
    public static final PersistentList plus(@NotNull PersistentList persistentList0, @NotNull Object[] arr_object) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder persistentList$Builder0 = persistentList0.builder();
        o.addAll(persistentList$Builder0, arr_object);
        return persistentList$Builder0.build();
    }

    @NotNull
    public static final PersistentMap plus(@NotNull PersistentMap persistentMap0, @NotNull Iterable iterable0) {
        return ExtensionsKt.putAll(persistentMap0, iterable0);
    }

    @NotNull
    public static final PersistentMap plus(@NotNull PersistentMap persistentMap0, @NotNull Map map0) {
        return ExtensionsKt.putAll(persistentMap0, map0);
    }

    @NotNull
    public static final PersistentMap plus(@NotNull PersistentMap persistentMap0, @NotNull Pair pair0) {
        Intrinsics.checkNotNull(persistentMap0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.plus, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.plus>");
        return persistentMap0.put(pair0.getFirst(), pair0.getSecond());
    }

    @NotNull
    public static final PersistentMap plus(@NotNull PersistentMap persistentMap0, @NotNull Sequence sequence0) {
        return ExtensionsKt.putAll(persistentMap0, sequence0);
    }

    @NotNull
    public static final PersistentMap plus(@NotNull PersistentMap persistentMap0, @NotNull Pair[] arr_pair) {
        return ExtensionsKt.putAll(persistentMap0, arr_pair);
    }

    @NotNull
    public static final PersistentSet plus(@NotNull PersistentSet persistentSet0, @NotNull Iterable iterable0) {
        if(iterable0 instanceof Collection) {
            return persistentSet0.addAll(((Collection)iterable0));
        }
        Builder persistentSet$Builder0 = persistentSet0.builder();
        o.addAll(persistentSet$Builder0, iterable0);
        return persistentSet$Builder0.build();
    }

    @NotNull
    public static final PersistentSet plus(@NotNull PersistentSet persistentSet0, Object object0) {
        return persistentSet0.add(object0);
    }

    @NotNull
    public static final PersistentSet plus(@NotNull PersistentSet persistentSet0, @NotNull Sequence sequence0) {
        Builder persistentSet$Builder0 = persistentSet0.builder();
        o.addAll(persistentSet$Builder0, sequence0);
        return persistentSet$Builder0.build();
    }

    @NotNull
    public static final PersistentSet plus(@NotNull PersistentSet persistentSet0, @NotNull Object[] arr_object) {
        Builder persistentSet$Builder0 = persistentSet0.builder();
        o.addAll(persistentSet$Builder0, arr_object);
        return persistentSet$Builder0.build();
    }

    @NotNull
    public static final PersistentMap putAll(@NotNull PersistentMap persistentMap0, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNull(persistentMap0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder persistentMap$Builder0 = persistentMap0.builder();
        x.putAll(persistentMap$Builder0, iterable0);
        return persistentMap$Builder0.build();
    }

    @NotNull
    public static final PersistentMap putAll(@NotNull PersistentMap persistentMap0, @NotNull Map map0) {
        Intrinsics.checkNotNull(persistentMap0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.putAll, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.putAll>");
        return persistentMap0.putAll(map0);
    }

    @NotNull
    public static final PersistentMap putAll(@NotNull PersistentMap persistentMap0, @NotNull Sequence sequence0) {
        Intrinsics.checkNotNull(persistentMap0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder persistentMap$Builder0 = persistentMap0.builder();
        x.putAll(persistentMap$Builder0, sequence0);
        return persistentMap$Builder0.build();
    }

    @NotNull
    public static final PersistentMap putAll(@NotNull PersistentMap persistentMap0, @NotNull Pair[] arr_pair) {
        Intrinsics.checkNotNull(persistentMap0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder persistentMap$Builder0 = persistentMap0.builder();
        x.putAll(persistentMap$Builder0, arr_pair);
        return persistentMap$Builder0.build();
    }

    @NotNull
    public static final ImmutableList toImmutableList(@NotNull CharSequence charSequence0) {
        return ExtensionsKt.toPersistentList(charSequence0);
    }

    @NotNull
    public static final ImmutableList toImmutableList(@NotNull Iterable iterable0) {
        ImmutableList immutableList0 = iterable0 instanceof ImmutableList ? ((ImmutableList)iterable0) : null;
        return immutableList0 == null ? ExtensionsKt.toPersistentList(iterable0) : immutableList0;
    }

    @NotNull
    public static final ImmutableList toImmutableList(@NotNull Sequence sequence0) {
        return ExtensionsKt.toPersistentList(sequence0);
    }

    @NotNull
    public static final ImmutableMap toImmutableMap(@NotNull Map map0) {
        PersistentMap persistentMap0 = null;
        ImmutableMap immutableMap0 = map0 instanceof ImmutableMap ? ((ImmutableMap)map0) : null;
        if(immutableMap0 == null) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder persistentMap$Builder0 = map0 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder ? ((androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder)map0) : null;
            if(persistentMap$Builder0 != null) {
                persistentMap0 = persistentMap$Builder0.build();
            }
            return persistentMap0 == null ? ExtensionsKt.persistentMapOf().putAll(map0) : persistentMap0;
        }
        return immutableMap0;
    }

    @NotNull
    public static final ImmutableSet toImmutableSet(@NotNull Iterable iterable0) {
        PersistentSet persistentSet0 = null;
        ImmutableSet immutableSet0 = iterable0 instanceof ImmutableSet ? ((ImmutableSet)iterable0) : null;
        if(immutableSet0 == null) {
            Builder persistentSet$Builder0 = iterable0 instanceof Builder ? ((Builder)iterable0) : null;
            if(persistentSet$Builder0 != null) {
                persistentSet0 = persistentSet$Builder0.build();
            }
            return persistentSet0 == null ? ExtensionsKt.plus(ExtensionsKt.persistentSetOf(), iterable0) : persistentSet0;
        }
        return immutableSet0;
    }

    @NotNull
    public static final ImmutableSet toImmutableSet(@NotNull Sequence sequence0) {
        return ExtensionsKt.toPersistentSet(sequence0);
    }

    @NotNull
    public static final PersistentSet toImmutableSet(@NotNull CharSequence charSequence0) {
        return ExtensionsKt.toPersistentSet(charSequence0);
    }

    @NotNull
    public static final PersistentMap toPersistentHashMap(@NotNull Map map0) {
        PersistentHashMap persistentHashMap0 = null;
        PersistentMap persistentMap0 = map0 instanceof PersistentHashMap ? ((PersistentHashMap)map0) : null;
        if(persistentMap0 == null) {
            PersistentHashMapBuilder persistentHashMapBuilder0 = map0 instanceof PersistentHashMapBuilder ? ((PersistentHashMapBuilder)map0) : null;
            if(persistentHashMapBuilder0 != null) {
                persistentHashMap0 = persistentHashMapBuilder0.build();
            }
            return persistentHashMap0 != null ? persistentHashMap0 : PersistentHashMap.Companion.emptyOf$runtime_release().putAll(map0);
        }
        return persistentMap0;
    }

    @NotNull
    public static final PersistentSet toPersistentHashSet(@NotNull CharSequence charSequence0) {
        Builder persistentSet$Builder0 = ExtensionsKt.persistentHashSetOf().builder();
        StringsKt___StringsKt.toCollection(charSequence0, persistentSet$Builder0);
        return persistentSet$Builder0.build();
    }

    @NotNull
    public static final PersistentSet toPersistentHashSet(@NotNull Iterable iterable0) {
        PersistentHashSet persistentHashSet0 = null;
        PersistentSet persistentSet0 = iterable0 instanceof PersistentHashSet ? ((PersistentHashSet)iterable0) : null;
        if(persistentSet0 == null) {
            PersistentHashSetBuilder persistentHashSetBuilder0 = iterable0 instanceof PersistentHashSetBuilder ? ((PersistentHashSetBuilder)iterable0) : null;
            if(persistentHashSetBuilder0 != null) {
                persistentHashSet0 = persistentHashSetBuilder0.build();
            }
            return persistentHashSet0 != null ? persistentHashSet0 : ExtensionsKt.plus(PersistentHashSet.Companion.emptyOf$runtime_release(), iterable0);
        }
        return persistentSet0;
    }

    @NotNull
    public static final PersistentSet toPersistentHashSet(@NotNull Sequence sequence0) {
        return ExtensionsKt.plus(ExtensionsKt.persistentHashSetOf(), sequence0);
    }

    @NotNull
    public static final PersistentList toPersistentList(@NotNull CharSequence charSequence0) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder persistentList$Builder0 = ExtensionsKt.persistentListOf().builder();
        StringsKt___StringsKt.toCollection(charSequence0, persistentList$Builder0);
        return persistentList$Builder0.build();
    }

    @NotNull
    public static final PersistentList toPersistentList(@NotNull Iterable iterable0) {
        PersistentList persistentList0 = null;
        PersistentList persistentList1 = iterable0 instanceof PersistentList ? ((PersistentList)iterable0) : null;
        if(persistentList1 == null) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder persistentList$Builder0 = iterable0 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder ? ((androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder)iterable0) : null;
            if(persistentList$Builder0 != null) {
                persistentList0 = persistentList$Builder0.build();
            }
            return persistentList0 == null ? ExtensionsKt.plus(ExtensionsKt.persistentListOf(), iterable0) : persistentList0;
        }
        return persistentList1;
    }

    @NotNull
    public static final PersistentList toPersistentList(@NotNull Sequence sequence0) {
        return ExtensionsKt.plus(ExtensionsKt.persistentListOf(), sequence0);
    }

    @NotNull
    public static final PersistentMap toPersistentMap(@NotNull Map map0) {
        PersistentMap persistentMap0 = null;
        PersistentMap persistentMap1 = map0 instanceof PersistentOrderedMap ? ((PersistentOrderedMap)map0) : null;
        if(persistentMap1 == null) {
            PersistentOrderedMapBuilder persistentOrderedMapBuilder0 = map0 instanceof PersistentOrderedMapBuilder ? ((PersistentOrderedMapBuilder)map0) : null;
            if(persistentOrderedMapBuilder0 != null) {
                persistentMap0 = persistentOrderedMapBuilder0.build();
            }
            return persistentMap0 == null ? PersistentOrderedMap.Companion.emptyOf$runtime_release().putAll(map0) : persistentMap0;
        }
        return persistentMap1;
    }

    @NotNull
    public static final PersistentSet toPersistentSet(@NotNull CharSequence charSequence0) {
        Builder persistentSet$Builder0 = ExtensionsKt.persistentSetOf().builder();
        StringsKt___StringsKt.toCollection(charSequence0, persistentSet$Builder0);
        return persistentSet$Builder0.build();
    }

    @NotNull
    public static final PersistentSet toPersistentSet(@NotNull Iterable iterable0) {
        PersistentSet persistentSet0 = null;
        PersistentSet persistentSet1 = iterable0 instanceof PersistentOrderedSet ? ((PersistentOrderedSet)iterable0) : null;
        if(persistentSet1 == null) {
            PersistentOrderedSetBuilder persistentOrderedSetBuilder0 = iterable0 instanceof PersistentOrderedSetBuilder ? ((PersistentOrderedSetBuilder)iterable0) : null;
            if(persistentOrderedSetBuilder0 != null) {
                persistentSet0 = persistentOrderedSetBuilder0.build();
            }
            return persistentSet0 == null ? ExtensionsKt.plus(PersistentOrderedSet.Companion.emptyOf$runtime_release(), iterable0) : persistentSet0;
        }
        return persistentSet1;
    }

    @NotNull
    public static final PersistentSet toPersistentSet(@NotNull Sequence sequence0) {
        return ExtensionsKt.plus(ExtensionsKt.persistentSetOf(), sequence0);
    }
}

