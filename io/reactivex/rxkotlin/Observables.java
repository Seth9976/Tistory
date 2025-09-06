package io.reactivex.rxkotlin;

import io.reactivex.Observable;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.BiFunction;
import jd.e;
import jd.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00C6\u0002\u0018\u00002\u00020\u0001Jl\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00020\u0005\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u0001\"\b\b\u0002\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00052\u001A\b\u0004\u0010\t\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\bH\u0087\b\u00A2\u0006\u0004\b\n\u0010\u000BJQ\u0010\n\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u0005\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0007\u00A2\u0006\u0004\b\n\u0010\rJ\u008A\u0001\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00030\u0005\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u0001\"\b\b\u0002\u0010\u000E*\u00020\u0001\"\b\b\u0003\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00020\u00052 \b\u0004\u0010\t\u001A\u001A\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0010H\u0087\b\u00A2\u0006\u0004\b\n\u0010\u0011Jo\u0010\n\u001A\u001A\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00120\u0005\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u0001\"\b\b\u0002\u0010\u000E*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00020\u0005H\u0007\u00A2\u0006\u0004\b\n\u0010\u0013J\u00A8\u0001\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00040\u0005\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u0001\"\b\b\u0002\u0010\u000E*\u00020\u0001\"\b\b\u0003\u0010\u0014*\u00020\u0001\"\b\b\u0004\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00020\u00052\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00030\u00052&\b\u0004\u0010\t\u001A \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0016H\u0087\b\u00A2\u0006\u0004\b\n\u0010\u0017J\u00C6\u0001\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00050\u0005\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u0001\"\b\b\u0002\u0010\u000E*\u00020\u0001\"\b\b\u0003\u0010\u0014*\u00020\u0001\"\b\b\u0004\u0010\u0018*\u00020\u0001\"\b\b\u0005\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00020\u00052\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00030\u00052\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00040\u00052,\b\u0004\u0010\t\u001A&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u001AH\u0087\b\u00A2\u0006\u0004\b\n\u0010\u001BJ\u00E4\u0001\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00060\u0005\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u0001\"\b\b\u0002\u0010\u000E*\u00020\u0001\"\b\b\u0003\u0010\u0014*\u00020\u0001\"\b\b\u0004\u0010\u0018*\u00020\u0001\"\b\b\u0005\u0010\u001C*\u00020\u0001\"\b\b\u0006\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00020\u00052\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00030\u00052\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00040\u00052\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u00028\u00050\u000522\b\u0004\u0010\t\u001A,\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00060\u001EH\u0087\b\u00A2\u0006\u0004\b\n\u0010\u001FJ\u0082\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00070\u0005\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u0001\"\b\b\u0002\u0010\u000E*\u00020\u0001\"\b\b\u0003\u0010\u0014*\u00020\u0001\"\b\b\u0004\u0010\u0018*\u00020\u0001\"\b\b\u0005\u0010\u001C*\u00020\u0001\"\b\b\u0006\u0010 *\u00020\u0001\"\b\b\u0007\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00020\u00052\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00030\u00052\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00040\u00052\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u00028\u00050\u00052\f\u0010!\u001A\b\u0012\u0004\u0012\u00028\u00060\u000528\b\u0004\u0010\t\u001A2\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\"H\u0087\b\u00A2\u0006\u0004\b\n\u0010#J\u00A0\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00028\b0\u0005\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u0001\"\b\b\u0002\u0010\u000E*\u00020\u0001\"\b\b\u0003\u0010\u0014*\u00020\u0001\"\b\b\u0004\u0010\u0018*\u00020\u0001\"\b\b\u0005\u0010\u001C*\u00020\u0001\"\b\b\u0006\u0010 *\u00020\u0001\"\b\b\u0007\u0010$*\u00020\u0001\"\b\b\b\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00020\u00052\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00030\u00052\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00040\u00052\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u00028\u00050\u00052\f\u0010!\u001A\b\u0012\u0004\u0012\u00028\u00060\u00052\f\u0010%\u001A\b\u0012\u0004\u0012\u00028\u00070\u00052>\b\u0004\u0010\t\u001A8\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b0&H\u0087\b\u00A2\u0006\u0004\b\n\u0010\'J\u00BE\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00028\t0\u0005\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u0001\"\b\b\u0002\u0010\u000E*\u00020\u0001\"\b\b\u0003\u0010\u0014*\u00020\u0001\"\b\b\u0004\u0010\u0018*\u00020\u0001\"\b\b\u0005\u0010\u001C*\u00020\u0001\"\b\b\u0006\u0010 *\u00020\u0001\"\b\b\u0007\u0010$*\u00020\u0001\"\b\b\b\u0010(*\u00020\u0001\"\b\b\t\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00020\u00052\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00030\u00052\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00040\u00052\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u00028\u00050\u00052\f\u0010!\u001A\b\u0012\u0004\u0012\u00028\u00060\u00052\f\u0010%\u001A\b\u0012\u0004\u0012\u00028\u00070\u00052\f\u0010)\u001A\b\u0012\u0004\u0012\u00028\b0\u00052D\b\u0004\u0010\t\u001A>\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t0*H\u0087\b\u00A2\u0006\u0004\b\n\u0010+Jl\u0010,\u001A\b\u0012\u0004\u0012\u00028\u00020\u0005\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u0001\"\b\b\u0002\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00052\u001A\b\u0004\u0010\t\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\bH\u0087\b\u00A2\u0006\u0004\b,\u0010\u000BJQ\u0010,\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u0005\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0007\u00A2\u0006\u0004\b,\u0010\rJ\u008A\u0001\u0010,\u001A\b\u0012\u0004\u0012\u00028\u00030\u0005\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u0001\"\b\b\u0002\u0010\u000E*\u00020\u0001\"\b\b\u0003\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00020\u00052 \b\u0004\u0010\t\u001A\u001A\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0010H\u0087\b\u00A2\u0006\u0004\b,\u0010\u0011Jo\u0010,\u001A\u001A\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00120\u0005\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u0001\"\b\b\u0002\u0010\u000E*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00020\u0005H\u0007\u00A2\u0006\u0004\b,\u0010\u0013J\u00A8\u0001\u0010,\u001A\b\u0012\u0004\u0012\u00028\u00040\u0005\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u0001\"\b\b\u0002\u0010\u000E*\u00020\u0001\"\b\b\u0003\u0010\u0014*\u00020\u0001\"\b\b\u0004\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00020\u00052\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00030\u00052&\b\u0004\u0010\t\u001A \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0016H\u0087\b\u00A2\u0006\u0004\b,\u0010\u0017J\u00C6\u0001\u0010,\u001A\b\u0012\u0004\u0012\u00028\u00050\u0005\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u0001\"\b\b\u0002\u0010\u000E*\u00020\u0001\"\b\b\u0003\u0010\u0014*\u00020\u0001\"\b\b\u0004\u0010\u0018*\u00020\u0001\"\b\b\u0005\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00020\u00052\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00030\u00052\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00040\u00052,\b\u0004\u0010\t\u001A&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u001AH\u0087\b\u00A2\u0006\u0004\b,\u0010\u001BJ\u00E4\u0001\u0010,\u001A\b\u0012\u0004\u0012\u00028\u00060\u0005\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u0001\"\b\b\u0002\u0010\u000E*\u00020\u0001\"\b\b\u0003\u0010\u0014*\u00020\u0001\"\b\b\u0004\u0010\u0018*\u00020\u0001\"\b\b\u0005\u0010\u001C*\u00020\u0001\"\b\b\u0006\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00020\u00052\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00030\u00052\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00040\u00052\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u00028\u00050\u000522\b\u0004\u0010\t\u001A,\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00060\u001EH\u0087\b\u00A2\u0006\u0004\b,\u0010\u001FJ\u0082\u0002\u0010,\u001A\b\u0012\u0004\u0012\u00028\u00070\u0005\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u0001\"\b\b\u0002\u0010\u000E*\u00020\u0001\"\b\b\u0003\u0010\u0014*\u00020\u0001\"\b\b\u0004\u0010\u0018*\u00020\u0001\"\b\b\u0005\u0010\u001C*\u00020\u0001\"\b\b\u0006\u0010 *\u00020\u0001\"\b\b\u0007\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00020\u00052\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00030\u00052\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00040\u00052\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u00028\u00050\u00052\f\u0010!\u001A\b\u0012\u0004\u0012\u00028\u00060\u000528\b\u0004\u0010\t\u001A2\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\"H\u0087\b\u00A2\u0006\u0004\b,\u0010#J\u00A0\u0002\u0010,\u001A\b\u0012\u0004\u0012\u00028\b0\u0005\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u0001\"\b\b\u0002\u0010\u000E*\u00020\u0001\"\b\b\u0003\u0010\u0014*\u00020\u0001\"\b\b\u0004\u0010\u0018*\u00020\u0001\"\b\b\u0005\u0010\u001C*\u00020\u0001\"\b\b\u0006\u0010 *\u00020\u0001\"\b\b\u0007\u0010$*\u00020\u0001\"\b\b\b\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00020\u00052\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00030\u00052\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00040\u00052\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u00028\u00050\u00052\f\u0010!\u001A\b\u0012\u0004\u0012\u00028\u00060\u00052\f\u0010%\u001A\b\u0012\u0004\u0012\u00028\u00070\u00052>\b\u0004\u0010\t\u001A8\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b0&H\u0087\b\u00A2\u0006\u0004\b,\u0010\'J\u00BE\u0002\u0010,\u001A\b\u0012\u0004\u0012\u00028\t0\u0005\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u0001\"\b\b\u0002\u0010\u000E*\u00020\u0001\"\b\b\u0003\u0010\u0014*\u00020\u0001\"\b\b\u0004\u0010\u0018*\u00020\u0001\"\b\b\u0005\u0010\u001C*\u00020\u0001\"\b\b\u0006\u0010 *\u00020\u0001\"\b\b\u0007\u0010$*\u00020\u0001\"\b\b\b\u0010(*\u00020\u0001\"\b\b\t\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00020\u00052\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00030\u00052\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00040\u00052\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u00028\u00050\u00052\f\u0010!\u001A\b\u0012\u0004\u0012\u00028\u00060\u00052\f\u0010%\u001A\b\u0012\u0004\u0012\u00028\u00070\u00052\f\u0010)\u001A\b\u0012\u0004\u0012\u00028\b0\u00052D\b\u0004\u0010\t\u001A>\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\t0*H\u0087\b\u00A2\u0006\u0004\b,\u0010+\u00A8\u0006-"}, d2 = {"Lio/reactivex/rxkotlin/Observables;", "", "T1", "T2", "R", "Lio/reactivex/Observable;", "source1", "source2", "Lkotlin/Function2;", "combineFunction", "combineLatest", "(Lio/reactivex/Observable;Lio/reactivex/Observable;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Observable;", "Lkotlin/Pair;", "(Lio/reactivex/Observable;Lio/reactivex/Observable;)Lio/reactivex/Observable;", "T3", "source3", "Lkotlin/Function3;", "(Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lkotlin/jvm/functions/Function3;)Lio/reactivex/Observable;", "Lkotlin/Triple;", "(Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;)Lio/reactivex/Observable;", "T4", "source4", "Lkotlin/Function4;", "(Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lkotlin/jvm/functions/Function4;)Lio/reactivex/Observable;", "T5", "source5", "Lkotlin/Function5;", "(Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lkotlin/jvm/functions/Function5;)Lio/reactivex/Observable;", "T6", "source6", "Lkotlin/Function6;", "(Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lkotlin/jvm/functions/Function6;)Lio/reactivex/Observable;", "T7", "source7", "Lkotlin/Function7;", "(Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lkotlin/jvm/functions/Function7;)Lio/reactivex/Observable;", "T8", "source8", "Lkotlin/Function8;", "(Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lkotlin/jvm/functions/Function8;)Lio/reactivex/Observable;", "T9", "source9", "Lkotlin/Function9;", "(Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lkotlin/jvm/functions/Function9;)Lio/reactivex/Observable;", "zip", "rxkotlin"}, k = 1, mv = {1, 4, 0})
public final class Observables {
    public static final Observables INSTANCE;

    static {
        Observables.INSTANCE = new Observables();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Observable combineLatest(@NotNull Observable observable0, @NotNull Observable observable1) {
        Intrinsics.checkParameterIsNotNull(observable0, "source1");
        Intrinsics.checkParameterIsNotNull(observable1, "source2");
        Observable observable2 = Observable.combineLatest(observable0, observable1, e.h);
        Intrinsics.checkExpressionValueIsNotNull(observable2, "Observable.combineLatest…> { t1, t2 -> t1 to t2 })");
        return observable2;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Observable combineLatest(@NotNull Observable observable0, @NotNull Observable observable1, @NotNull Observable observable2) {
        Intrinsics.checkParameterIsNotNull(observable0, "source1");
        Intrinsics.checkParameterIsNotNull(observable1, "source2");
        Intrinsics.checkParameterIsNotNull(observable2, "source3");
        Observable observable3 = Observable.combineLatest(observable0, observable1, observable2, f.f);
        Intrinsics.checkExpressionValueIsNotNull(observable3, "Observable.combineLatest… -> Triple(t1, t2, t3) })");
        return observable3;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Observable combineLatest(@NotNull Observable observable0, @NotNull Observable observable1, @NotNull Observable observable2, @NotNull Observable observable3, @NotNull Observable observable4, @NotNull Observable observable5, @NotNull Observable observable6, @NotNull Observable observable7, @NotNull Observable observable8, @NotNull Function9 function90) {
        Intrinsics.checkParameterIsNotNull(observable0, "source1");
        Intrinsics.checkParameterIsNotNull(observable1, "source2");
        Intrinsics.checkParameterIsNotNull(observable2, "source3");
        Intrinsics.checkParameterIsNotNull(observable3, "source4");
        Intrinsics.checkParameterIsNotNull(observable4, "source5");
        Intrinsics.checkParameterIsNotNull(observable5, "source6");
        Intrinsics.checkParameterIsNotNull(observable6, "source7");
        Intrinsics.checkParameterIsNotNull(observable7, "source8");
        Intrinsics.checkParameterIsNotNull(observable8, "source9");
        Intrinsics.checkParameterIsNotNull(function90, "combineFunction");
        Observable observable9 = Observable.combineLatest(observable0, observable1, observable2, observable3, observable4, observable5, observable6, observable7, observable8, new io.reactivex.functions.Function9() {
            @Override  // io.reactivex.functions.Function9
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1, @NotNull Object object2, @NotNull Object object3, @NotNull Object object4, @NotNull Object object5, @NotNull Object object6, @NotNull Object object7, @NotNull Object object8) {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                Intrinsics.checkParameterIsNotNull(object2, "t3");
                Intrinsics.checkParameterIsNotNull(object3, "t4");
                Intrinsics.checkParameterIsNotNull(object4, "t5");
                Intrinsics.checkParameterIsNotNull(object5, "t6");
                Intrinsics.checkParameterIsNotNull(object6, "t7");
                Intrinsics.checkParameterIsNotNull(object7, "t8");
                Intrinsics.checkParameterIsNotNull(object8, "t9");
                return this.a.invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable9, "Observable.combineLatest…4, t5, t6, t7, t8, t9) })");
        return observable9;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Observable combineLatest(@NotNull Observable observable0, @NotNull Observable observable1, @NotNull Observable observable2, @NotNull Observable observable3, @NotNull Observable observable4, @NotNull Observable observable5, @NotNull Observable observable6, @NotNull Observable observable7, @NotNull Function8 function80) {
        Intrinsics.checkParameterIsNotNull(observable0, "source1");
        Intrinsics.checkParameterIsNotNull(observable1, "source2");
        Intrinsics.checkParameterIsNotNull(observable2, "source3");
        Intrinsics.checkParameterIsNotNull(observable3, "source4");
        Intrinsics.checkParameterIsNotNull(observable4, "source5");
        Intrinsics.checkParameterIsNotNull(observable5, "source6");
        Intrinsics.checkParameterIsNotNull(observable6, "source7");
        Intrinsics.checkParameterIsNotNull(observable7, "source8");
        Intrinsics.checkParameterIsNotNull(function80, "combineFunction");
        Observable observable8 = Observable.combineLatest(observable0, observable1, observable2, observable3, observable4, observable5, observable6, observable7, new io.reactivex.functions.Function8() {
            @Override  // io.reactivex.functions.Function8
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1, @NotNull Object object2, @NotNull Object object3, @NotNull Object object4, @NotNull Object object5, @NotNull Object object6, @NotNull Object object7) {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                Intrinsics.checkParameterIsNotNull(object2, "t3");
                Intrinsics.checkParameterIsNotNull(object3, "t4");
                Intrinsics.checkParameterIsNotNull(object4, "t5");
                Intrinsics.checkParameterIsNotNull(object5, "t6");
                Intrinsics.checkParameterIsNotNull(object6, "t7");
                Intrinsics.checkParameterIsNotNull(object7, "t8");
                return this.a.invoke(object0, object1, object2, object3, object4, object5, object6, object7);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable8, "Observable.combineLatest…3, t4, t5, t6, t7, t8) })");
        return observable8;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Observable combineLatest(@NotNull Observable observable0, @NotNull Observable observable1, @NotNull Observable observable2, @NotNull Observable observable3, @NotNull Observable observable4, @NotNull Observable observable5, @NotNull Observable observable6, @NotNull Function7 function70) {
        Intrinsics.checkParameterIsNotNull(observable0, "source1");
        Intrinsics.checkParameterIsNotNull(observable1, "source2");
        Intrinsics.checkParameterIsNotNull(observable2, "source3");
        Intrinsics.checkParameterIsNotNull(observable3, "source4");
        Intrinsics.checkParameterIsNotNull(observable4, "source5");
        Intrinsics.checkParameterIsNotNull(observable5, "source6");
        Intrinsics.checkParameterIsNotNull(observable6, "source7");
        Intrinsics.checkParameterIsNotNull(function70, "combineFunction");
        Observable observable7 = Observable.combineLatest(observable0, observable1, observable2, observable3, observable4, observable5, observable6, new io.reactivex.functions.Function7() {
            @Override  // io.reactivex.functions.Function7
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1, @NotNull Object object2, @NotNull Object object3, @NotNull Object object4, @NotNull Object object5, @NotNull Object object6) {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                Intrinsics.checkParameterIsNotNull(object2, "t3");
                Intrinsics.checkParameterIsNotNull(object3, "t4");
                Intrinsics.checkParameterIsNotNull(object4, "t5");
                Intrinsics.checkParameterIsNotNull(object5, "t6");
                Intrinsics.checkParameterIsNotNull(object6, "t7");
                return this.a.invoke(object0, object1, object2, object3, object4, object5, object6);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable7, "Observable.combineLatest…2, t3, t4, t5, t6, t7) })");
        return observable7;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Observable combineLatest(@NotNull Observable observable0, @NotNull Observable observable1, @NotNull Observable observable2, @NotNull Observable observable3, @NotNull Observable observable4, @NotNull Observable observable5, @NotNull Function6 function60) {
        Intrinsics.checkParameterIsNotNull(observable0, "source1");
        Intrinsics.checkParameterIsNotNull(observable1, "source2");
        Intrinsics.checkParameterIsNotNull(observable2, "source3");
        Intrinsics.checkParameterIsNotNull(observable3, "source4");
        Intrinsics.checkParameterIsNotNull(observable4, "source5");
        Intrinsics.checkParameterIsNotNull(observable5, "source6");
        Intrinsics.checkParameterIsNotNull(function60, "combineFunction");
        Observable observable6 = Observable.combineLatest(observable0, observable1, observable2, observable3, observable4, observable5, new io.reactivex.functions.Function6() {
            @Override  // io.reactivex.functions.Function6
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1, @NotNull Object object2, @NotNull Object object3, @NotNull Object object4, @NotNull Object object5) {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                Intrinsics.checkParameterIsNotNull(object2, "t3");
                Intrinsics.checkParameterIsNotNull(object3, "t4");
                Intrinsics.checkParameterIsNotNull(object4, "t5");
                Intrinsics.checkParameterIsNotNull(object5, "t6");
                return this.a.invoke(object0, object1, object2, object3, object4, object5);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable6, "Observable.combineLatest…1, t2, t3, t4, t5, t6) })");
        return observable6;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Observable combineLatest(@NotNull Observable observable0, @NotNull Observable observable1, @NotNull Observable observable2, @NotNull Observable observable3, @NotNull Observable observable4, @NotNull Function5 function50) {
        Intrinsics.checkParameterIsNotNull(observable0, "source1");
        Intrinsics.checkParameterIsNotNull(observable1, "source2");
        Intrinsics.checkParameterIsNotNull(observable2, "source3");
        Intrinsics.checkParameterIsNotNull(observable3, "source4");
        Intrinsics.checkParameterIsNotNull(observable4, "source5");
        Intrinsics.checkParameterIsNotNull(function50, "combineFunction");
        Observable observable5 = Observable.combineLatest(observable0, observable1, observable2, observable3, observable4, new io.reactivex.functions.Function5() {
            @Override  // io.reactivex.functions.Function5
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1, @NotNull Object object2, @NotNull Object object3, @NotNull Object object4) {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                Intrinsics.checkParameterIsNotNull(object2, "t3");
                Intrinsics.checkParameterIsNotNull(object3, "t4");
                Intrinsics.checkParameterIsNotNull(object4, "t5");
                return this.a.invoke(object0, object1, object2, object3, object4);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable5, "Observable.combineLatest…on(t1, t2, t3, t4, t5) })");
        return observable5;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Observable combineLatest(@NotNull Observable observable0, @NotNull Observable observable1, @NotNull Observable observable2, @NotNull Observable observable3, @NotNull Function4 function40) {
        Intrinsics.checkParameterIsNotNull(observable0, "source1");
        Intrinsics.checkParameterIsNotNull(observable1, "source2");
        Intrinsics.checkParameterIsNotNull(observable2, "source3");
        Intrinsics.checkParameterIsNotNull(observable3, "source4");
        Intrinsics.checkParameterIsNotNull(function40, "combineFunction");
        Observable observable4 = Observable.combineLatest(observable0, observable1, observable2, observable3, new io.reactivex.functions.Function4() {
            @Override  // io.reactivex.functions.Function4
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1, @NotNull Object object2, @NotNull Object object3) {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                Intrinsics.checkParameterIsNotNull(object2, "t3");
                Intrinsics.checkParameterIsNotNull(object3, "t4");
                return this.a.invoke(object0, object1, object2, object3);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable4, "Observable.combineLatest…nction(t1, t2, t3, t4) })");
        return observable4;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Observable combineLatest(@NotNull Observable observable0, @NotNull Observable observable1, @NotNull Observable observable2, @NotNull Function3 function30) {
        Intrinsics.checkParameterIsNotNull(observable0, "source1");
        Intrinsics.checkParameterIsNotNull(observable1, "source2");
        Intrinsics.checkParameterIsNotNull(observable2, "source3");
        Intrinsics.checkParameterIsNotNull(function30, "combineFunction");
        Observable observable3 = Observable.combineLatest(observable0, observable1, observable2, new io.reactivex.functions.Function3() {
            @Override  // io.reactivex.functions.Function3
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1, @NotNull Object object2) {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                Intrinsics.checkParameterIsNotNull(object2, "t3");
                return this.a.invoke(object0, object1, object2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable3, "Observable.combineLatest…neFunction(t1, t2, t3) })");
        return observable3;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Observable combineLatest(@NotNull Observable observable0, @NotNull Observable observable1, @NotNull Function2 function20) {
        Intrinsics.checkParameterIsNotNull(observable0, "source1");
        Intrinsics.checkParameterIsNotNull(observable1, "source2");
        Intrinsics.checkParameterIsNotNull(function20, "combineFunction");
        Observable observable2 = Observable.combineLatest(observable0, observable1, new BiFunction() {
            @Override  // io.reactivex.functions.BiFunction
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1) {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                return this.a.invoke(object0, object1);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable2, "Observable.combineLatest…ombineFunction(t1, t2) })");
        return observable2;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Observable zip(@NotNull Observable observable0, @NotNull Observable observable1) {
        Intrinsics.checkParameterIsNotNull(observable0, "source1");
        Intrinsics.checkParameterIsNotNull(observable1, "source2");
        Observable observable2 = Observable.zip(observable0, observable1, e.i);
        Intrinsics.checkExpressionValueIsNotNull(observable2, "Observable.zip(source1, …> { t1, t2 -> t1 to t2 })");
        return observable2;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Observable zip(@NotNull Observable observable0, @NotNull Observable observable1, @NotNull Observable observable2) {
        Intrinsics.checkParameterIsNotNull(observable0, "source1");
        Intrinsics.checkParameterIsNotNull(observable1, "source2");
        Intrinsics.checkParameterIsNotNull(observable2, "source3");
        Observable observable3 = Observable.zip(observable0, observable1, observable2, f.g);
        Intrinsics.checkExpressionValueIsNotNull(observable3, "Observable.zip(source1, … -> Triple(t1, t2, t3) })");
        return observable3;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Observable zip(@NotNull Observable observable0, @NotNull Observable observable1, @NotNull Observable observable2, @NotNull Observable observable3, @NotNull Observable observable4, @NotNull Observable observable5, @NotNull Observable observable6, @NotNull Observable observable7, @NotNull Observable observable8, @NotNull Function9 function90) {
        Intrinsics.checkParameterIsNotNull(observable0, "source1");
        Intrinsics.checkParameterIsNotNull(observable1, "source2");
        Intrinsics.checkParameterIsNotNull(observable2, "source3");
        Intrinsics.checkParameterIsNotNull(observable3, "source4");
        Intrinsics.checkParameterIsNotNull(observable4, "source5");
        Intrinsics.checkParameterIsNotNull(observable5, "source6");
        Intrinsics.checkParameterIsNotNull(observable6, "source7");
        Intrinsics.checkParameterIsNotNull(observable7, "source8");
        Intrinsics.checkParameterIsNotNull(observable8, "source9");
        Intrinsics.checkParameterIsNotNull(function90, "combineFunction");
        Observable observable9 = Observable.zip(observable0, observable1, observable2, observable3, observable4, observable5, observable6, observable7, observable8, new io.reactivex.functions.Function9() {
            @Override  // io.reactivex.functions.Function9
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1, @NotNull Object object2, @NotNull Object object3, @NotNull Object object4, @NotNull Object object5, @NotNull Object object6, @NotNull Object object7, @NotNull Object object8) {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                Intrinsics.checkParameterIsNotNull(object2, "t3");
                Intrinsics.checkParameterIsNotNull(object3, "t4");
                Intrinsics.checkParameterIsNotNull(object4, "t5");
                Intrinsics.checkParameterIsNotNull(object5, "t6");
                Intrinsics.checkParameterIsNotNull(object6, "t7");
                Intrinsics.checkParameterIsNotNull(object7, "t8");
                Intrinsics.checkParameterIsNotNull(object8, "t9");
                return this.a.invoke(object0, object1, object2, object3, object4, object5, object6, object7, object8);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable9, "Observable.zip(source1, …4, t5, t6, t7, t8, t9) })");
        return observable9;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Observable zip(@NotNull Observable observable0, @NotNull Observable observable1, @NotNull Observable observable2, @NotNull Observable observable3, @NotNull Observable observable4, @NotNull Observable observable5, @NotNull Observable observable6, @NotNull Observable observable7, @NotNull Function8 function80) {
        Intrinsics.checkParameterIsNotNull(observable0, "source1");
        Intrinsics.checkParameterIsNotNull(observable1, "source2");
        Intrinsics.checkParameterIsNotNull(observable2, "source3");
        Intrinsics.checkParameterIsNotNull(observable3, "source4");
        Intrinsics.checkParameterIsNotNull(observable4, "source5");
        Intrinsics.checkParameterIsNotNull(observable5, "source6");
        Intrinsics.checkParameterIsNotNull(observable6, "source7");
        Intrinsics.checkParameterIsNotNull(observable7, "source8");
        Intrinsics.checkParameterIsNotNull(function80, "combineFunction");
        Observable observable8 = Observable.zip(observable0, observable1, observable2, observable3, observable4, observable5, observable6, observable7, new io.reactivex.functions.Function8() {
            @Override  // io.reactivex.functions.Function8
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1, @NotNull Object object2, @NotNull Object object3, @NotNull Object object4, @NotNull Object object5, @NotNull Object object6, @NotNull Object object7) {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                Intrinsics.checkParameterIsNotNull(object2, "t3");
                Intrinsics.checkParameterIsNotNull(object3, "t4");
                Intrinsics.checkParameterIsNotNull(object4, "t5");
                Intrinsics.checkParameterIsNotNull(object5, "t6");
                Intrinsics.checkParameterIsNotNull(object6, "t7");
                Intrinsics.checkParameterIsNotNull(object7, "t8");
                return this.a.invoke(object0, object1, object2, object3, object4, object5, object6, object7);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable8, "Observable.zip(source1, …3, t4, t5, t6, t7, t8) })");
        return observable8;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Observable zip(@NotNull Observable observable0, @NotNull Observable observable1, @NotNull Observable observable2, @NotNull Observable observable3, @NotNull Observable observable4, @NotNull Observable observable5, @NotNull Observable observable6, @NotNull Function7 function70) {
        Intrinsics.checkParameterIsNotNull(observable0, "source1");
        Intrinsics.checkParameterIsNotNull(observable1, "source2");
        Intrinsics.checkParameterIsNotNull(observable2, "source3");
        Intrinsics.checkParameterIsNotNull(observable3, "source4");
        Intrinsics.checkParameterIsNotNull(observable4, "source5");
        Intrinsics.checkParameterIsNotNull(observable5, "source6");
        Intrinsics.checkParameterIsNotNull(observable6, "source7");
        Intrinsics.checkParameterIsNotNull(function70, "combineFunction");
        Observable observable7 = Observable.zip(observable0, observable1, observable2, observable3, observable4, observable5, observable6, new io.reactivex.functions.Function7() {
            @Override  // io.reactivex.functions.Function7
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1, @NotNull Object object2, @NotNull Object object3, @NotNull Object object4, @NotNull Object object5, @NotNull Object object6) {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                Intrinsics.checkParameterIsNotNull(object2, "t3");
                Intrinsics.checkParameterIsNotNull(object3, "t4");
                Intrinsics.checkParameterIsNotNull(object4, "t5");
                Intrinsics.checkParameterIsNotNull(object5, "t6");
                Intrinsics.checkParameterIsNotNull(object6, "t7");
                return this.a.invoke(object0, object1, object2, object3, object4, object5, object6);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable7, "Observable.zip(source1, …2, t3, t4, t5, t6, t7) })");
        return observable7;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Observable zip(@NotNull Observable observable0, @NotNull Observable observable1, @NotNull Observable observable2, @NotNull Observable observable3, @NotNull Observable observable4, @NotNull Observable observable5, @NotNull Function6 function60) {
        Intrinsics.checkParameterIsNotNull(observable0, "source1");
        Intrinsics.checkParameterIsNotNull(observable1, "source2");
        Intrinsics.checkParameterIsNotNull(observable2, "source3");
        Intrinsics.checkParameterIsNotNull(observable3, "source4");
        Intrinsics.checkParameterIsNotNull(observable4, "source5");
        Intrinsics.checkParameterIsNotNull(observable5, "source6");
        Intrinsics.checkParameterIsNotNull(function60, "combineFunction");
        Observable observable6 = Observable.zip(observable0, observable1, observable2, observable3, observable4, observable5, new io.reactivex.functions.Function6() {
            @Override  // io.reactivex.functions.Function6
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1, @NotNull Object object2, @NotNull Object object3, @NotNull Object object4, @NotNull Object object5) {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                Intrinsics.checkParameterIsNotNull(object2, "t3");
                Intrinsics.checkParameterIsNotNull(object3, "t4");
                Intrinsics.checkParameterIsNotNull(object4, "t5");
                Intrinsics.checkParameterIsNotNull(object5, "t6");
                return this.a.invoke(object0, object1, object2, object3, object4, object5);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable6, "Observable.zip(source1, …1, t2, t3, t4, t5, t6) })");
        return observable6;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Observable zip(@NotNull Observable observable0, @NotNull Observable observable1, @NotNull Observable observable2, @NotNull Observable observable3, @NotNull Observable observable4, @NotNull Function5 function50) {
        Intrinsics.checkParameterIsNotNull(observable0, "source1");
        Intrinsics.checkParameterIsNotNull(observable1, "source2");
        Intrinsics.checkParameterIsNotNull(observable2, "source3");
        Intrinsics.checkParameterIsNotNull(observable3, "source4");
        Intrinsics.checkParameterIsNotNull(observable4, "source5");
        Intrinsics.checkParameterIsNotNull(function50, "combineFunction");
        Observable observable5 = Observable.zip(observable0, observable1, observable2, observable3, observable4, new io.reactivex.functions.Function5() {
            @Override  // io.reactivex.functions.Function5
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1, @NotNull Object object2, @NotNull Object object3, @NotNull Object object4) {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                Intrinsics.checkParameterIsNotNull(object2, "t3");
                Intrinsics.checkParameterIsNotNull(object3, "t4");
                Intrinsics.checkParameterIsNotNull(object4, "t5");
                return this.a.invoke(object0, object1, object2, object3, object4);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable5, "Observable.zip(source1, …on(t1, t2, t3, t4, t5) })");
        return observable5;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Observable zip(@NotNull Observable observable0, @NotNull Observable observable1, @NotNull Observable observable2, @NotNull Observable observable3, @NotNull Function4 function40) {
        Intrinsics.checkParameterIsNotNull(observable0, "source1");
        Intrinsics.checkParameterIsNotNull(observable1, "source2");
        Intrinsics.checkParameterIsNotNull(observable2, "source3");
        Intrinsics.checkParameterIsNotNull(observable3, "source4");
        Intrinsics.checkParameterIsNotNull(function40, "combineFunction");
        Observable observable4 = Observable.zip(observable0, observable1, observable2, observable3, new io.reactivex.functions.Function4() {
            @Override  // io.reactivex.functions.Function4
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1, @NotNull Object object2, @NotNull Object object3) {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                Intrinsics.checkParameterIsNotNull(object2, "t3");
                Intrinsics.checkParameterIsNotNull(object3, "t4");
                return this.a.invoke(object0, object1, object2, object3);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable4, "Observable.zip(source1, …nction(t1, t2, t3, t4) })");
        return observable4;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Observable zip(@NotNull Observable observable0, @NotNull Observable observable1, @NotNull Observable observable2, @NotNull Function3 function30) {
        Intrinsics.checkParameterIsNotNull(observable0, "source1");
        Intrinsics.checkParameterIsNotNull(observable1, "source2");
        Intrinsics.checkParameterIsNotNull(observable2, "source3");
        Intrinsics.checkParameterIsNotNull(function30, "combineFunction");
        Observable observable3 = Observable.zip(observable0, observable1, observable2, new io.reactivex.functions.Function3() {
            @Override  // io.reactivex.functions.Function3
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1, @NotNull Object object2) {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                Intrinsics.checkParameterIsNotNull(object2, "t3");
                return this.a.invoke(object0, object1, object2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable3, "Observable.zip(source1, …neFunction(t1, t2, t3) })");
        return observable3;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final Observable zip(@NotNull Observable observable0, @NotNull Observable observable1, @NotNull Function2 function20) {
        Intrinsics.checkParameterIsNotNull(observable0, "source1");
        Intrinsics.checkParameterIsNotNull(observable1, "source2");
        Intrinsics.checkParameterIsNotNull(function20, "combineFunction");
        Observable observable2 = Observable.zip(observable0, observable1, new BiFunction() {
            @Override  // io.reactivex.functions.BiFunction
            @NotNull
            public final Object apply(@NotNull Object object0, @NotNull Object object1) {
                Intrinsics.checkParameterIsNotNull(object0, "t1");
                Intrinsics.checkParameterIsNotNull(object1, "t2");
                return this.a.invoke(object0, object1);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable2, "Observable.zip(source1, …ombineFunction(t1, t2) })");
        return observable2;
    }
}

