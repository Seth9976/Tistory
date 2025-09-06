package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgd extends zzkf implements zzln {
    private String zzA;
    private long zzB;
    private int zzC;
    private String zzD;
    private String zzE;
    private boolean zzF;
    private zzkm zzG;
    private String zzH;
    private int zzI;
    private int zzJ;
    private int zzK;
    private String zzL;
    private long zzM;
    private long zzN;
    private String zzO;
    private String zzP;
    private int zzQ;
    private String zzR;
    private zzgg zzS;
    private zzkk zzT;
    private long zzU;
    private long zzV;
    private String zzW;
    private String zzX;
    private int zzY;
    private boolean zzZ;
    public static final int zza;
    private String zzaa;
    private boolean zzab;
    private zzfz zzac;
    private String zzad;
    private zzkm zzae;
    private String zzaf;
    private static final zzgd zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private zzkm zzh;
    private zzkm zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private int zzs;
    private String zzt;
    private String zzu;
    private String zzv;
    private long zzw;
    private long zzx;
    private String zzy;
    private boolean zzz;

    static {
        zzgd zzgd0 = new zzgd();
        zzgd.zzd = zzgd0;
        zzkf.zzbL(zzgd.class, zzgd0);
    }

    public zzgd() {
        this.zzh = zzkf.zzbE();
        this.zzi = zzkf.zzbE();
        this.zzo = "";
        this.zzp = "";
        this.zzq = "";
        this.zzr = "";
        this.zzt = "";
        this.zzu = "";
        this.zzv = "";
        this.zzy = "";
        this.zzA = "";
        this.zzD = "";
        this.zzE = "";
        this.zzG = zzkf.zzbE();
        this.zzH = "";
        this.zzL = "";
        this.zzO = "";
        this.zzP = "";
        this.zzR = "";
        this.zzT = zzkf.zzbB();
        this.zzW = "";
        this.zzX = "";
        this.zzaa = "";
        this.zzad = "";
        this.zzae = zzkf.zzbE();
        this.zzaf = "";
    }

    public static void A(zzgd zzgd0) {
        zzgd0.zze &= 0xFFFBFFFF;
        zzgd0.zzA = zzgd.zzd.zzA;
    }

    public static void B(zzgd zzgd0, long v) {
        zzgd0.zze |= 0x80000;
        zzgd0.zzB = v;
    }

    public static void C(zzgd zzgd0, int v) {
        zzgd0.zze |= 0x100000;
        zzgd0.zzC = v;
    }

    public static void D(zzgd zzgd0, String s) {
        zzgd0.zze |= 0x200000;
        zzgd0.zzD = s;
    }

    public static void E(zzgd zzgd0) {
        zzgd0.zze &= 0xFFDFFFFF;
        zzgd0.zzD = zzgd.zzd.zzD;
    }

    public static void F(zzgd zzgd0, String s) {
        s.getClass();
        zzgd0.zze |= 0x400000;
        zzgd0.zzE = s;
    }

    public static void G(zzgd zzgd0, boolean z) {
        zzgd0.zze |= 0x800000;
        zzgd0.zzF = z;
    }

    public static void H(zzgd zzgd0, Iterable iterable0) {
        zzkm zzkm0 = zzgd0.zzG;
        if(!zzkm0.zzc()) {
            zzgd0.zzG = zzkf.zzbF(zzkm0);
        }
        zzio.zzbt(iterable0, zzgd0.zzG);
    }

    public static void I(zzgd zzgd0) {
        zzgd0.zzG = zzkf.zzbE();
    }

    public static void J(zzgd zzgd0, String s) {
        s.getClass();
        zzgd0.zze |= 0x1000000;
        zzgd0.zzH = s;
    }

    public static void K(zzgd zzgd0, int v) {
        zzgd0.zze |= 0x2000000;
        zzgd0.zzI = v;
    }

    public static void L(zzgd zzgd0) {
        zzgd0.zze |= 1;
        zzgd0.zzg = 1;
    }

    public static void M(zzgd zzgd0) {
        zzgd0.zze &= 0xEFFFFFFF;
        zzgd0.zzL = zzgd.zzd.zzL;
    }

    public static void N(zzgd zzgd0, long v) {
        zzgd0.zze |= 0x20000000;
        zzgd0.zzM = v;
    }

    public static void O(zzgd zzgd0, String s) {
        s.getClass();
        zzgd0.zzf |= 0x2000;
        zzgd0.zzad = s;
    }

    public static void P(zzgd zzgd0) {
        zzgd0.zzf &= 0xFFFFDFFF;
        zzgd0.zzad = zzgd.zzd.zzad;
    }

    public static void Q(zzgd zzgd0, Iterable iterable0) {
        zzkm zzkm0 = zzgd0.zzae;
        if(!zzkm0.zzc()) {
            zzgd0.zzae = zzkf.zzbF(zzkm0);
        }
        zzio.zzbt(iterable0, zzgd0.zzae);
    }

    public static void R(zzgd zzgd0) {
        zzgd0.zzh = zzkf.zzbE();
    }

    public static void S(zzgd zzgd0, String s) {
        s.getClass();
        zzgd0.zzf |= 0x4000;
        zzgd0.zzaf = s;
    }

    public static void T(zzgd zzgd0, int v) {
        zzgd0.o0();
        zzgd0.zzh.remove(v);
    }

    public static void U(zzgd zzgd0, int v, zzgm zzgm0) {
        zzgm0.getClass();
        zzgd0.p0();
        zzgd0.zzi.set(v, zzgm0);
    }

    public static void V(zzgd zzgd0, zzgm zzgm0) {
        zzgm0.getClass();
        zzgd0.p0();
        zzgd0.zzi.add(zzgm0);
    }

    public static void W(zzgd zzgd0, Iterable iterable0) {
        zzgd0.p0();
        zzio.zzbt(iterable0, zzgd0.zzi);
    }

    public static void X(zzgd zzgd0, int v) {
        zzgd0.p0();
        zzgd0.zzi.remove(v);
    }

    public static void Y(zzgd zzgd0, long v) {
        zzgd0.zze |= 2;
        zzgd0.zzj = v;
    }

    public static void Z(zzgd zzgd0, long v) {
        zzgd0.zze |= 4;
        zzgd0.zzk = v;
    }

    public static void a0(zzgd zzgd0, long v) {
        zzgd0.zze |= 8;
        zzgd0.zzl = v;
    }

    public static void b0(zzgd zzgd0, long v) {
        zzgd0.zze |= 16;
        zzgd0.zzm = v;
    }

    public static void c0(zzgd zzgd0) {
        zzgd0.zze &= -17;
        zzgd0.zzm = 0L;
    }

    public static void d0(zzgd zzgd0, long v) {
        zzgd0.zze |= 0x20;
        zzgd0.zzn = v;
    }

    public static void e0(zzgd zzgd0) {
        zzgd0.zze &= -33;
        zzgd0.zzn = 0L;
    }

    public static void f0(zzgd zzgd0) {
        zzgd0.zze |= 0x40;
        zzgd0.zzo = "android";
    }

    public static void g0(zzgd zzgd0, String s) {
        s.getClass();
        zzgd0.zze |= 0x80;
        zzgd0.zzp = s;
    }

    public static void h(zzgd zzgd0) {
        zzgd0.zze &= 0x7FFFFFFF;
        zzgd0.zzO = zzgd.zzd.zzO;
    }

    public static void h0(zzgd zzgd0) {
        zzgd0.zze &= 0xFFFFFF7F;
        zzgd0.zzp = zzgd.zzd.zzp;
    }

    public static void i(zzgd zzgd0, int v) {
        zzgd0.zzf |= 2;
        zzgd0.zzQ = v;
    }

    public static void i0(zzgd zzgd0, String s) {
        s.getClass();
        zzgd0.zze |= 0x100;
        zzgd0.zzq = s;
    }

    public static void j(zzgd zzgd0, int v, zzft zzft0) {
        zzft0.getClass();
        zzgd0.o0();
        zzgd0.zzh.set(v, zzft0);
    }

    public static void j0(zzgd zzgd0) {
        zzgd0.zze &= 0xFFFFFEFF;
        zzgd0.zzq = zzgd.zzd.zzq;
    }

    public static void k(zzgd zzgd0, String s) {
        s.getClass();
        zzgd0.zzf |= 4;
        zzgd0.zzR = s;
    }

    public static void k0(zzgd zzgd0, String s) {
        s.getClass();
        zzgd0.zze |= 0x200;
        zzgd0.zzr = s;
    }

    public static void l(zzgd zzgd0, zzgg zzgg0) {
        zzgg0.getClass();
        zzgd0.zzS = zzgg0;
        zzgd0.zzf |= 8;
    }

    public static void l0(zzgd zzgd0, int v) {
        zzgd0.zze |= 0x400;
        zzgd0.zzs = v;
    }

    public static void m(zzgd zzgd0, Iterable iterable0) {
        zzkk zzkk0 = zzgd0.zzT;
        if(!zzkk0.zzc()) {
            int v = zzkk0.size();
            zzgd0.zzT = zzkk0.zzg((v == 0 ? 10 : v + v));
        }
        zzio.zzbt(iterable0, zzgd0.zzT);
    }

    public static void m0(zzgd zzgd0, String s) {
        s.getClass();
        zzgd0.zze |= 0x800;
        zzgd0.zzt = s;
    }

    public static void n(zzgd zzgd0, zzft zzft0) {
        zzft0.getClass();
        zzgd0.o0();
        zzgd0.zzh.add(zzft0);
    }

    public static void n0(zzgd zzgd0, String s) {
        s.getClass();
        zzgd0.zze |= 0x1000;
        zzgd0.zzu = s;
    }

    public static void o(zzgd zzgd0, long v) {
        zzgd0.zzf |= 16;
        zzgd0.zzU = v;
    }

    public final void o0() {
        zzkm zzkm0 = this.zzh;
        if(!zzkm0.zzc()) {
            this.zzh = zzkf.zzbF(zzkm0);
        }
    }

    public static void p(zzgd zzgd0, long v) {
        zzgd0.zzf |= 0x20;
        zzgd0.zzV = v;
    }

    public final void p0() {
        zzkm zzkm0 = this.zzi;
        if(!zzkm0.zzc()) {
            this.zzi = zzkf.zzbF(zzkm0);
        }
    }

    public static void q(zzgd zzgd0, String s) {
        zzgd0.zzf |= 0x80;
        zzgd0.zzX = s;
    }

    public static void r(zzgd zzgd0, Iterable iterable0) {
        zzgd0.o0();
        zzio.zzbt(iterable0, zzgd0.zzh);
    }

    public static void s(zzgd zzgd0, String s) {
        s.getClass();
        zzgd0.zze |= 0x2000;
        zzgd0.zzv = s;
    }

    public static void t(zzgd zzgd0, long v) {
        zzgd0.zze |= 0x4000;
        zzgd0.zzw = v;
    }

    public static void u(zzgd zzgd0) {
        zzgd0.zze |= 0x8000;
        zzgd0.zzx = 74029L;
    }

    public static void v(zzgd zzgd0, String s) {
        s.getClass();
        zzgd0.zze |= 0x10000;
        zzgd0.zzy = s;
    }

    public static void w(zzgd zzgd0) {
        zzgd0.zze &= 0xFFFEFFFF;
        zzgd0.zzy = zzgd.zzd.zzy;
    }

    public static void x(zzgd zzgd0, boolean z) {
        zzgd0.zze |= 0x20000;
        zzgd0.zzz = z;
    }

    public static void y(zzgd zzgd0) {
        zzgd0.zze &= 0xFFFDFFFF;
        zzgd0.zzz = false;
    }

    public static void z(zzgd zzgd0, String s) {
        s.getClass();
        zzgd0.zze |= 0x40000;
        zzgd0.zzA = s;
    }

    public final String zzA() [...] // 潜在的解密器

    public final String zzB() [...] // 潜在的解密器

    public final String zzC() [...] // 潜在的解密器

    public final String zzD() [...] // 潜在的解密器

    public final String zzE() [...] // 潜在的解密器

    public final String zzF() [...] // 潜在的解密器

    public final String zzG() [...] // 潜在的解密器

    public final String zzH() [...] // 潜在的解密器

    public final String zzI() [...] // 潜在的解密器

    public final String zzJ() [...] // 潜在的解密器

    public final String zzK() [...] // 潜在的解密器

    public final String zzL() [...] // 潜在的解密器

    public final List zzM() {
        return this.zzG;
    }

    public final List zzN() {
        return this.zzh;
    }

    public final List zzO() {
        return this.zzi;
    }

    public final int zza() {
        return this.zzI;
    }

    public final boolean zzaW() {
        return this.zzz;
    }

    public final boolean zzaX() {
        return this.zzF;
    }

    public final boolean zzaY() {
        return (this.zze & 0x2000000) != 0;
    }

    public final boolean zzaZ() {
        return (this.zze & 0x100000) != 0;
    }

    public final int zzb() {
        return this.zzC;
    }

    public final boolean zzba() {
        return (this.zze & 0x20000000) != 0;
    }

    public final boolean zzbb() {
        return (this.zzf & 0x80) != 0;
    }

    public final boolean zzbc() {
        return (this.zze & 0x80000) != 0;
    }

    public final boolean zzbd() {
        return (this.zzf & 16) != 0;
    }

    public final boolean zzbe() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzbf() {
        return (this.zze & 0x4000) != 0;
    }

    public final boolean zzbg() {
        return (this.zze & 0x20000) != 0;
    }

    public final boolean zzbh() {
        return (this.zze & 0x20) != 0;
    }

    public final boolean zzbi() {
        return (this.zze & 16) != 0;
    }

    public final boolean zzbj() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzbk() {
        return (this.zzf & 2) != 0;
    }

    public final boolean zzbl() {
        return (this.zze & 0x800000) != 0;
    }

    public final boolean zzbm() {
        return (this.zzf & 0x2000) != 0;
    }

    public final boolean zzbn() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzbo() {
        return (this.zze & 0x400) != 0;
    }

    public final boolean zzbp() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzbq() {
        return (this.zze & 0x8000) != 0;
    }

    public final int zzc() {
        return this.zzh.size();
    }

    public final int zzd() {
        return this.zzg;
    }

    public final int zze() {
        return this.zzQ;
    }

    public final int zzf() {
        return this.zzs;
    }

    public final int zzg() {
        return this.zzi.size();
    }

    public final long zzh() {
        return this.zzM;
    }

    public final long zzi() {
        return this.zzB;
    }

    public final long zzj() {
        return this.zzU;
    }

    public final long zzk() {
        return this.zzl;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkf
    public final Object zzl(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzkf.zzbI(zzgd.zzd, "\u00014\u0000\u0002\u0001A4\u0000\u0005\u0000\u0001င\u0000\u0002\u001B\u0003\u001B\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000Bဈ\t\fင\n\rဈ\u000B\u000Eဈ\f\u0010ဈ\r\u0011ဂ\u000E\u0012ဂ\u000F\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001Aဂ\u0004\u001Cဇ\u0017\u001D\u001B\u001Eဈ\u0018\u001Fင\u0019 င\u001A!င\u001B\"ဈ\u001C#ဂ\u001D$ဂ\u001E%ဈ\u001F&ဈ \'င!)ဈ\",ဉ#-\u001D.ဂ$/ဂ%2ဈ&4ဈ\'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001AAဈ.", new Object[]{"zze", "zzf", "zzg", "zzh", zzft.class, "zzi", zzgm.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzm", "zzF", "zzG", zzfp.class, "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", a0.d, "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf"});
            }
            case 3: {
                return new zzgd();
            }
            case 4: {
                return new zzgc(zzgd.zzd);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Lcom/google/android/gms/internal/measurement/zzkf;)V
            }
            case 5: {
                return zzgd.zzd;
            }
            default: {
                return null;
            }
        }
    }

    public final long zzm() {
        return this.zzw;
    }

    public final long zzn() {
        return this.zzn;
    }

    public final long zzo() {
        return this.zzm;
    }

    public final long zzp() {
        return this.zzk;
    }

    public final long zzq() {
        return this.zzj;
    }

    public final long zzr() {
        return this.zzx;
    }

    public final zzft zzs(int v) {
        return (zzft)this.zzh.get(v);
    }

    public static zzgc zzt() {
        return (zzgc)zzgd.zzd.zzbx();
    }

    public final zzgm zzv(int v) {
        return (zzgm)this.zzi.get(v);
    }

    public final String zzw() [...] // 潜在的解密器

    public final String zzx() [...] // 潜在的解密器

    public final String zzy() [...] // 潜在的解密器

    public final String zzz() [...] // 潜在的解密器
}

