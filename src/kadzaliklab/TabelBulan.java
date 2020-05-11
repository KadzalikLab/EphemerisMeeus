package kadzaliklab;

public class TabelBulan {
    public  static double[]sukuPeriodik(double t,double l1){
        double l1_r=Math.toRadians(l1);
        //elongsi rata2 bulan
        double d=(297.8502042+445267.1115168*t-0.00163*t*t+t*t*t/545868-t*t*t*t/113065000)%360;
        double d_r=Math.toRadians(d);

        //anomali rata2 matahari
        double m=(357.5291092+35999.0502909*t-0.0001536*t*t+t*t*t/24490000)%360;
        double m_r=Math.toRadians(m);

        //anomali rata2 bulan
        double ma=(134.9634114+477198.8676313*t+0.008997*t*t+t*t*t/69699-t*t*t*t/14712000)%360;
        double ma_r=Math.toRadians(ma);

        //Argumen bujur bulan
        double f=(93.2720993+483202.0175273*t-0.0034029*t*t-t*t*t/3526000+t*t*t*t/863310000)%360;
        double f_r=Math.toRadians(f);

        //eksentrisitas orbit
        double e=1-0.002516*t-0.0000074*t*t;

        //koreksi suku periodik bujur ekliptika bulan (sinus)
        double bujur_bulan=0;

double D1=0; double M1=0; double MA1=1;double F1=0; double koefisien1=6288774;
double D2=2; double M2=0; double MA2=-1;double F2=0; double koefisien2=1274027;
double D3=2; double M3=0; double MA3=0;double F3=0; double koefisien3=658314;
double D4=0;  double M4=0;  double MA4=2;double F4=0; double koefisien4=213618;
double D5=0;  double M5=1;  double MA5=0;double F5=0; double koefisien5=-185116;
double D6=0;  double M6=0;  double MA6=0;double F6=2; double koefisien6=-114332;
double D7=2;  double M7=0;  double MA7=-2;double F7=0; double koefisien7=58793;
double D8=2;  double M8=-1;  double MA8=-1;double F8=0; double koefisien8=57066;
double D9=2;  double M9=0;  double MA9=1;double F9=0; double koefisien9=53322;
double D10=2; double M10=-1; double MA10=0;double F10=0; double koefisien10=45758;
double D11=0; double M11=1; double MA11=-1;double F11=0; double koefisien11=-40923;
double D12=1; double M12=0; double MA12=0;double F12=0; double koefisien12=-34720;
double D13=0; double M13=1; double MA13=1;double F13=0; double koefisien13=-30383;
double D14=2; double M14=0; double MA14=0;double F14=-2; double koefisien14=15327;
double D15=0; double M15=0; double MA15=1;double F15=2; double koefisien15=-12528;
double D16=0; double M16=0; double MA16=1;double F16=-2; double koefisien16=10980;
double D17=4; double M17=0; double MA17=-1;double F17=0; double koefisien17=10675;
double D18=0; double M18=0; double MA18=3;double F18=0; double koefisien18=10034;
double D19=4; double M19=0; double MA19=-2;double F19=0; double koefisien19=8548;
double D20=2; double M20=1; double MA20=-1;double F20=0; double koefisien20=-7888;
double D21=2; double M21=1; double MA21=0;double F21=0; double koefisien21=-6766;
double D22=1; double M22=0; double MA22=-1;double F22=0; double koefisien22=-5163;
double D23=1; double M23=1; double MA23=0;double F23=0; double koefisien23=4987;
double D24=2; double M24=-1; double MA24=1;double F24=0; double koefisien24=4036;
double D25=2; double M25=0; double MA25=2;double F25=0; double koefisien25=3994;
double D26=4; double M26=0; double MA26=0;double F26=0; double koefisien26=3861;
double D27=2; double M27=0; double MA27=-3;double F27=0; double koefisien27=3665;
double D28=0; double M28=1; double MA28=-2;double F28=0; double koefisien28=-2689;
double D29=2; double M29=0; double MA29=-1;double F29=2; double koefisien29=-2602;
double D30=2; double M30=-1; double MA30=-2;double F30=0; double koefisien30=2390;
double D31=1; double M31=0; double MA31=1;double F31=0; double koefisien31=-2348;
double D32=2; double M32=-2; double MA32=0;double F32=0; double koefisien32=2236;
double D33=0; double M33=1; double MA33=2;double F33=0; double koefisien33=-2120;
double D34=0; double M34=2; double MA34=0;double F34=0; double koefisien34=-2069;
double D35=2; double M35=-2; double MA35=-1;double F35=0; double koefisien35=2048;
double D36=2; double M36=0; double MA36=1;double F36=-2; double koefisien36=-1773;
double D37=2; double M37=0; double MA37=0;double F37=2; double koefisien37=-1595;
double D38=4; double M38=-1; double MA38=-1;double F38=0; double koefisien38=1215;
double D39=0; double M39=0; double MA39=2;double F39=2; double koefisien39=-1110;
double D40=3; double M40=0; double MA40=-1;double F40=0; double koefisien40=-892;
double D41=2; double M41=1; double MA41=1;double F41=0; double koefisien41=-810;
double D42=4; double M42=-1; double MA42=-2;double F42=0; double koefisien42=759;
double D43=0; double M43=2; double MA43=-1;double F43=0; double koefisien43=-713;
double D44=2; double M44=2; double MA44=-1;double F44=0; double koefisien44=-700;
double D45=2; double M45=1; double MA45=-2;double F45=0; double koefisien45=691;
double D46=2; double M46=-1; double MA46=0;double F46=-2; double koefisien46=596;
double D47=4; double M47=0; double MA47=1;double F47=0; double koefisien47=549;
double D48=0; double M48=0; double MA48=4;double F48=0; double koefisien48=537;
double D49=4; double M49=-1; double MA49=0;double F49=0; double koefisien49=520;
double D50=1; double M50=0; double MA50=-2;double F50=0; double koefisien50=-487;
double D51=2; double M51=1; double MA51=0;double F51=-2; double koefisien51=-399;
double D52=0; double M52=0; double MA52=2;double F52=-2; double koefisien52=-381;
double D53=1; double M53=1; double MA53=1;double F53=0; double koefisien53=351;
double D54=3; double M54=0; double MA54=-2;double F54=0; double koefisien54=-340;
double D55=4; double M55=0; double MA55=-3;double F55=0; double koefisien55=330;
double D56=2; double M56=-1; double MA56=2;double F56=0; double koefisien56=327;
double D57=0; double M57=2; double MA57=1;double F57=0; double koefisien57=-323;
double D58=1; double M58=1; double MA58=-1;double F58=0; double koefisien58=299;
double D59=2; double M59=0; double MA59=3;double F59=0; double koefisien59=294;

        bujur_bulan+=koefisien1*(Math.pow(e,Math.abs(M1)))*Math.sin(D1*d_r+M1*m_r+MA1*ma_r+F1*f_r);
        bujur_bulan+=koefisien2*(Math.pow(e,Math.abs(M2)))*Math.sin(D2*d_r+M2*m_r+MA2*ma_r+F2*f_r);
        bujur_bulan+=koefisien3*(Math.pow(e,Math.abs(M3)))*Math.sin(D3*d_r+M3*m_r+MA3*ma_r+F3*f_r);
        bujur_bulan+=koefisien4*(Math.pow(e,Math.abs(M4)))*Math.sin(D4*d_r+M4*m_r+MA4*ma_r+F4*f_r);
        bujur_bulan+=koefisien5*(Math.pow(e,Math.abs(M5)))*Math.sin(D5*d_r+M5*m_r+MA5*ma_r+F5*f_r);
        bujur_bulan+=koefisien6*(Math.pow(e,Math.abs(M6)))*Math.sin(D6*d_r+M6*m_r+MA6*ma_r+F6*f_r);
        bujur_bulan+=koefisien7*(Math.pow(e,Math.abs(M7)))*Math.sin(D7*d_r+M7*m_r+MA7*ma_r+F7*f_r);
        bujur_bulan+=koefisien8*(Math.pow(e,Math.abs(M8)))*Math.sin(D8*d_r+M8*m_r+MA8*ma_r+F8*f_r);
        bujur_bulan+=koefisien9*(Math.pow(e,Math.abs(M9)))*Math.sin(D9*d_r+M9*m_r+MA9*ma_r+F9*f_r);
        bujur_bulan+=koefisien10*(Math.pow(e,Math.abs(M10)))*Math.sin(D10*d_r+M10*m_r+MA10*ma_r+F10*f_r);
        bujur_bulan+=koefisien11*(Math.pow(e,Math.abs(M11)))*Math.sin(D11*d_r+M11*m_r+MA11*ma_r+F11*f_r);
        bujur_bulan+=koefisien12*(Math.pow(e,Math.abs(M12)))*Math.sin(D12*d_r+M12*m_r+MA12*ma_r+F12*f_r);
        bujur_bulan+=koefisien13*(Math.pow(e,Math.abs(M13)))*Math.sin(D13*d_r+M13*m_r+MA13*ma_r+F13*f_r);
        bujur_bulan+=koefisien14*(Math.pow(e,Math.abs(M14)))*Math.sin(D14*d_r+M14*m_r+MA14*ma_r+F14*f_r);
        bujur_bulan+=koefisien15*(Math.pow(e,Math.abs(M15)))*Math.sin(D15*d_r+M15*m_r+MA15*ma_r+F15*f_r);
        bujur_bulan+=koefisien16*(Math.pow(e,Math.abs(M16)))*Math.sin(D16*d_r+M16*m_r+MA16*ma_r+F16*f_r);
        bujur_bulan+=koefisien17*(Math.pow(e,Math.abs(M17)))*Math.sin(D17*d_r+M17*m_r+MA17*ma_r+F17*f_r);
        bujur_bulan+=koefisien18*(Math.pow(e,Math.abs(M18)))*Math.sin(D18*d_r+M18*m_r+MA18*ma_r+F18*f_r);
        bujur_bulan+=koefisien19*(Math.pow(e,Math.abs(M19)))*Math.sin(D19*d_r+M19*m_r+MA19*ma_r+F19*f_r);
        bujur_bulan+=koefisien20*(Math.pow(e,Math.abs(M20)))*Math.sin(D20*d_r+M20*m_r+MA20*ma_r+F20*f_r);
        bujur_bulan+=koefisien21*(Math.pow(e,Math.abs(M21)))*Math.sin(D21*d_r+M21*m_r+MA21*ma_r+F21*f_r);
        bujur_bulan+=koefisien22*(Math.pow(e,Math.abs(M22)))*Math.sin(D22*d_r+M22*m_r+MA22*ma_r+F22*f_r);
        bujur_bulan+=koefisien23*(Math.pow(e,Math.abs(M23)))*Math.sin(D23*d_r+M23*m_r+MA23*ma_r+F23*f_r);
        bujur_bulan+=koefisien24*(Math.pow(e,Math.abs(M24)))*Math.sin(D24*d_r+M24*m_r+MA24*ma_r+F24*f_r);
        bujur_bulan+=koefisien25*(Math.pow(e,Math.abs(M25)))*Math.sin(D25*d_r+M25*m_r+MA25*ma_r+F25*f_r);
        bujur_bulan+=koefisien26*(Math.pow(e,Math.abs(M26)))*Math.sin(D26*d_r+M26*m_r+MA26*ma_r+F26*f_r);
        bujur_bulan+=koefisien27*(Math.pow(e,Math.abs(M27)))*Math.sin(D27*d_r+M27*m_r+MA27*ma_r+F27*f_r);
        bujur_bulan+=koefisien28*(Math.pow(e,Math.abs(M28)))*Math.sin(D28*d_r+M28*m_r+MA28*ma_r+F28*f_r);
        bujur_bulan+=koefisien29*(Math.pow(e,Math.abs(M29)))*Math.sin(D29*d_r+M29*m_r+MA29*ma_r+F29*f_r);
        bujur_bulan+=koefisien30*(Math.pow(e,Math.abs(M30)))*Math.sin(D30*d_r+M30*m_r+MA30*ma_r+F30*f_r);
        bujur_bulan+=koefisien31*(Math.pow(e,Math.abs(M31)))*Math.sin(D31*d_r+M31*m_r+MA31*ma_r+F31*f_r);
        bujur_bulan+=koefisien32*(Math.pow(e,Math.abs(M32)))*Math.sin(D32*d_r+M32*m_r+MA32*ma_r+F32*f_r);
        bujur_bulan+=koefisien33*(Math.pow(e,Math.abs(M33)))*Math.sin(D33*d_r+M33*m_r+MA33*ma_r+F33*f_r);
        bujur_bulan+=koefisien34*(Math.pow(e,Math.abs(M34)))*Math.sin(D34*d_r+M34*m_r+MA34*ma_r+F34*f_r);
        bujur_bulan+=koefisien35*(Math.pow(e,Math.abs(M35)))*Math.sin(D35*d_r+M35*m_r+MA35*ma_r+F35*f_r);
        bujur_bulan+=koefisien36*(Math.pow(e,Math.abs(M36)))*Math.sin(D36*d_r+M36*m_r+MA36*ma_r+F36*f_r);
        bujur_bulan+=koefisien37*(Math.pow(e,Math.abs(M37)))*Math.sin(D37*d_r+M37*m_r+MA37*ma_r+F37*f_r);
        bujur_bulan+=koefisien38*(Math.pow(e,Math.abs(M38)))*Math.sin(D38*d_r+M38*m_r+MA38*ma_r+F38*f_r);
        bujur_bulan+=koefisien39*(Math.pow(e,Math.abs(M39)))*Math.sin(D39*d_r+M39*m_r+MA39*ma_r+F39*f_r);
        bujur_bulan+=koefisien40*(Math.pow(e,Math.abs(M40)))*Math.sin(D40*d_r+M40*m_r+MA40*ma_r+F40*f_r);
        bujur_bulan+=koefisien41*(Math.pow(e,Math.abs(M41)))*Math.sin(D41*d_r+M41*m_r+MA41*ma_r+F41*f_r);
        bujur_bulan+=koefisien42*(Math.pow(e,Math.abs(M42)))*Math.sin(D42*d_r+M42*m_r+MA42*ma_r+F42*f_r);
        bujur_bulan+=koefisien43*(Math.pow(e,Math.abs(M43)))*Math.sin(D43*d_r+M43*m_r+MA43*ma_r+F43*f_r);
        bujur_bulan+=koefisien44*(Math.pow(e,Math.abs(M44)))*Math.sin(D44*d_r+M44*m_r+MA44*ma_r+F44*f_r);
        bujur_bulan+=koefisien45*(Math.pow(e,Math.abs(M45)))*Math.sin(D45*d_r+M45*m_r+MA45*ma_r+F45*f_r);
        bujur_bulan+=koefisien46*(Math.pow(e,Math.abs(M46)))*Math.sin(D46*d_r+M46*m_r+MA46*ma_r+F46*f_r);
        bujur_bulan+=koefisien47*(Math.pow(e,Math.abs(M47)))*Math.sin(D47*d_r+M47*m_r+MA47*ma_r+F47*f_r);
        bujur_bulan+=koefisien48*(Math.pow(e,Math.abs(M48)))*Math.sin(D48*d_r+M48*m_r+MA48*ma_r+F48*f_r);
        bujur_bulan+=koefisien49*(Math.pow(e,Math.abs(M49)))*Math.sin(D49*d_r+M49*m_r+MA49*ma_r+F49*f_r);
        bujur_bulan+=koefisien50*(Math.pow(e,Math.abs(M50)))*Math.sin(D50*d_r+M50*m_r+MA50*ma_r+F50*f_r);
        bujur_bulan+=koefisien51*(Math.pow(e,Math.abs(M51)))*Math.sin(D51*d_r+M51*m_r+MA51*ma_r+F51*f_r);
        bujur_bulan+=koefisien52*(Math.pow(e,Math.abs(M52)))*Math.sin(D52*d_r+M52*m_r+MA52*ma_r+F52*f_r);
        bujur_bulan+=koefisien53*(Math.pow(e,Math.abs(M53)))*Math.sin(D53*d_r+M53*m_r+MA53*ma_r+F53*f_r);
        bujur_bulan+=koefisien54*(Math.pow(e,Math.abs(M54)))*Math.sin(D54*d_r+M54*m_r+MA54*ma_r+F54*f_r);
        bujur_bulan+=koefisien55*(Math.pow(e,Math.abs(M55)))*Math.sin(D55*d_r+M55*m_r+MA55*ma_r+F55*f_r);
        bujur_bulan+=koefisien56*(Math.pow(e,Math.abs(M56)))*Math.sin(D56*d_r+M56*m_r+MA56*ma_r+F56*f_r);
        bujur_bulan+=koefisien57*(Math.pow(e,Math.abs(M57)))*Math.sin(D57*d_r+M57*m_r+MA57*ma_r+F57*f_r);
        bujur_bulan+=koefisien58*(Math.pow(e,Math.abs(M58)))*Math.sin(D58*d_r+M58*m_r+MA58*ma_r+F58*f_r);
        bujur_bulan+=koefisien59*(Math.pow(e,Math.abs(M59)))*Math.sin(D59*d_r+M59*m_r+MA59*ma_r+F59*f_r);

        double argumenA1=(119.75+131.849*t)%360;
        double argumenA2=(53.09+479264.29*t)%360;
        double argumenA3=(313.45+481266.484*t)%360;
        double aA1_r=Math.toRadians(argumenA1);
        double aA2_r=Math.toRadians(argumenA2);
        double aA3_r=Math.toRadians(argumenA3);

       bujur_bulan=(bujur_bulan+3958*Math.sin(aA1_r)+1962*Math.sin(l1_r-f_r)+318*Math.sin(aA2_r))/1000000;

       //mengambil nilai lintang bulan yg ada pada fungsi periodikLintang
        double lintang_bulan=periodikLintang(e,d_r,m_r,ma_r,f_r,l1_r,aA1_r, aA3_r)[1];

        //mengambil nilai jarak bumi bulan
        double jarakBulan=jarakBumiBulan(e,d_r,m_r,ma_r,f_r)[1];

        //mengembalikan nilai dalam bentuk variable array
        return new double[]{0,d,m,ma,f,e,bujur_bulan,lintang_bulan,jarakBulan};


    }

    public static double[] periodikLintang(double e, double d_r, double m_r, double ma_r, double f_r, double l1_r, double aA1_r, double aA3_r){

        double D1=0; double M1=0; double MA1=0;double F1=1; double koefisien1=5128122;
        double D2=0; double M2=0; double MA2=1;double F2=1; double koefisien2=280602;
        double D3=0; double M3=0; double MA3=1;double F3=-1; double koefisien3=277693;
        double D4=2; double M4=0; double MA4=0;double F4=-1; double koefisien4=173237;
        double D5=2; double M5=0; double MA5=-1;double F5=1; double koefisien5=55413;
        double D6=2; double M6=0; double MA6=-1;double F6=-1; double koefisien6=46271;
        double D7=2; double M7=0; double MA7=0;double F7=1; double koefisien7=32573;
        double D8=0; double M8=0; double MA8=2;double F8=1; double koefisien8=17198;
        double D9=2; double M9=0; double MA9=1;double F9=-1; double koefisien9=9266;
        double D10=0; double M10=0; double MA10=2;double F10=-1; double koefisien10=8822;
        double D11=2; double M11=-1; double MA11=0;double F11=-1; double koefisien11=8216;
        double D12=2; double M12=0; double MA12=-2;double F12=-1; double koefisien12=4324;
        double D13=2; double M13=0; double MA13=1;double F13=1; double koefisien13=4200;
        double D14=2; double M14=1; double MA14=0;double F14=-1; double koefisien14=-3359;
        double D15=2; double M15=-1; double MA15=-1;double F15=1; double koefisien15=2463;
        double D16=2; double M16=-1; double MA16=0;double F16=1; double koefisien16=2211;
        double D17=2; double M17=-1; double MA17=-1;double F17=-1; double koefisien17=2065;
        double D18=0; double M18=1; double MA18=-1;double F18=-1; double koefisien18=-1870;
        double D19=4; double M19=0; double MA19=-1;double F19=-1; double koefisien19=1828;
        double D20=0; double M20=1; double MA20=0;double F20=1; double koefisien20=-1794;
        double D21=0; double M21=0; double MA21=0;double F21=3; double koefisien21=-1749;
        double D22=0; double M22=1; double MA22=-1;double F22=1; double koefisien22=-1565;
        double D23=1; double M23=0; double MA23=0;double F23=1; double koefisien23=-1491;
        double D24=0; double M24=1; double MA24=1;double F24=1; double koefisien24=-1475;
        double D25=0; double M25=1; double MA25=1;double F25=-1; double koefisien25=-1410;
        double D26=0; double M26=1; double MA26=0;double F26=-1; double koefisien26=-1344;
        double D27=1; double M27=0; double MA27=0;double F27=-1; double koefisien27=-1335;
        double D28=0; double M28=0; double MA28=3;double F28=1; double koefisien28=1107;
        double D29=4; double M29=0; double MA29=0;double F29=-1; double koefisien29=1021;
        double D30=4; double M30=0; double MA30=-1;double F30=1; double koefisien30=833;
        double D31=0; double M31=0; double MA31=1;double F31=-3; double koefisien31=777;
        double D32=4; double M32=0; double MA32=-2;double F32=1; double koefisien32=671;
        double D33=2; double M33=0; double MA33=0;double F33=-3; double koefisien33=607;
        double D34=2; double M34=0; double MA34=2;double F34=-1; double koefisien34=596;
        double D35=2; double M35=-1; double MA35=1;double F35=-1; double koefisien35=491;
        double D36=2; double M36=0; double MA36=-2;double F36=1; double koefisien36=-451;
        double D37=0; double M37=0; double MA37=3;double F37=-1; double koefisien37=439;
        double D38=2; double M38=0; double MA38=2;double F38=1; double koefisien38=422;
        double D39=2; double M39=0; double MA39=-3;double F39=-1; double koefisien39=421;
        double D40=2; double M40=1; double MA40=-1;double F40=1; double koefisien40=-366;
        double D41=2; double M41=1; double MA41=0;double F41=1; double koefisien41=-351;
        double D42=4; double M42=0; double MA42=0;double F42=1; double koefisien42=331;
        double D43=2; double M43=-1; double MA43=1;double F43=1; double koefisien43=315;
        double D44=2; double M44=-2; double MA44=0;double F44=-1; double koefisien44=302;
        double D45=0; double M45=0; double MA45=1;double F45=3; double koefisien45=-283;
        double D46=2; double M46=1; double MA46=1;double F46=-1; double koefisien46=-229;
        double D47=1; double M47=1; double MA47=0;double F47=-1; double koefisien47=223;
        double D48=1; double M48=1; double MA48=0;double F48=1; double koefisien48=223;
        double D49=0; double M49=1; double MA49=-2;double F49=-1; double koefisien49=-220;
        double D50=2; double M50=1; double MA50=-1;double F50=-1; double koefisien50=-220;
        double D51=1; double M51=0; double MA51=1;double F51=1; double koefisien51=-185;
        double D52=2; double M52=-1; double MA52=-2;double F52=-1; double koefisien52=181;
        double D53=0; double M53=1; double MA53=2;double F53=1; double koefisien53=-177;
        double D54=4; double M54=0; double MA54=-2;double F54=-1; double koefisien54=176;
        double D55=4; double M55=-1; double MA55=-1;double F55=-1; double koefisien55=166;
        double D56=1; double M56=0; double MA56=1;double F56=-1; double koefisien56=-164;
        double D57=4; double M57=0; double MA57=1;double F57=-1; double koefisien57=132;
        double D58=1; double M58=0; double MA58=-1;double F58=-1; double koefisien58=-119;
        double D59=4; double M59=-1; double MA59=0;double F59=-1; double koefisien59=115;
        double D60=2; double M60=-2; double MA60=0;double F60=1; double koefisien60=107;

        double lintang_bulan=0;
        lintang_bulan+=koefisien1*(Math.pow(e,Math.abs(M1)))*Math.sin(D1*d_r+M1*m_r+MA1*ma_r+F1*f_r);
        lintang_bulan+=koefisien2*(Math.pow(e,Math.abs(M2)))*Math.sin(D2*d_r+M2*m_r+MA2*ma_r+F2*f_r);
        lintang_bulan+=koefisien3*(Math.pow(e,Math.abs(M3)))*Math.sin(D3*d_r+M3*m_r+MA3*ma_r+F3*f_r);
        lintang_bulan+=koefisien4*(Math.pow(e,Math.abs(M4)))*Math.sin(D4*d_r+M4*m_r+MA4*ma_r+F4*f_r);
        lintang_bulan+=koefisien5*(Math.pow(e,Math.abs(M5)))*Math.sin(D5*d_r+M5*m_r+MA5*ma_r+F5*f_r);
        lintang_bulan+=koefisien6*(Math.pow(e,Math.abs(M6)))*Math.sin(D6*d_r+M6*m_r+MA6*ma_r+F6*f_r);
        lintang_bulan+=koefisien7*(Math.pow(e,Math.abs(M7)))*Math.sin(D7*d_r+M7*m_r+MA7*ma_r+F7*f_r);
        lintang_bulan+=koefisien8*(Math.pow(e,Math.abs(M8)))*Math.sin(D8*d_r+M8*m_r+MA8*ma_r+F8*f_r);
        lintang_bulan+=koefisien9*(Math.pow(e,Math.abs(M9)))*Math.sin(D9*d_r+M9*m_r+MA9*ma_r+F9*f_r);
        lintang_bulan+=koefisien10*(Math.pow(e,Math.abs(M10)))*Math.sin(D10*d_r+M10*m_r+MA10*ma_r+F10*f_r);
        lintang_bulan+=koefisien11*(Math.pow(e,Math.abs(M11)))*Math.sin(D11*d_r+M11*m_r+MA11*ma_r+F11*f_r);
        lintang_bulan+=koefisien12*(Math.pow(e,Math.abs(M12)))*Math.sin(D12*d_r+M12*m_r+MA12*ma_r+F12*f_r);
        lintang_bulan+=koefisien13*(Math.pow(e,Math.abs(M13)))*Math.sin(D13*d_r+M13*m_r+MA13*ma_r+F13*f_r);
        lintang_bulan+=koefisien14*(Math.pow(e,Math.abs(M14)))*Math.sin(D14*d_r+M14*m_r+MA14*ma_r+F14*f_r);
        lintang_bulan+=koefisien15*(Math.pow(e,Math.abs(M15)))*Math.sin(D15*d_r+M15*m_r+MA15*ma_r+F15*f_r);
        lintang_bulan+=koefisien16*(Math.pow(e,Math.abs(M16)))*Math.sin(D16*d_r+M16*m_r+MA16*ma_r+F16*f_r);
        lintang_bulan+=koefisien17*(Math.pow(e,Math.abs(M17)))*Math.sin(D17*d_r+M17*m_r+MA17*ma_r+F17*f_r);
        lintang_bulan+=koefisien18*(Math.pow(e,Math.abs(M18)))*Math.sin(D18*d_r+M18*m_r+MA18*ma_r+F18*f_r);
        lintang_bulan+=koefisien19*(Math.pow(e,Math.abs(M19)))*Math.sin(D19*d_r+M19*m_r+MA19*ma_r+F19*f_r);
        lintang_bulan+=koefisien20*(Math.pow(e,Math.abs(M20)))*Math.sin(D20*d_r+M20*m_r+MA20*ma_r+F20*f_r);
        lintang_bulan+=koefisien21*(Math.pow(e,Math.abs(M21)))*Math.sin(D21*d_r+M21*m_r+MA21*ma_r+F21*f_r);
        lintang_bulan+=koefisien22*(Math.pow(e,Math.abs(M22)))*Math.sin(D22*d_r+M22*m_r+MA22*ma_r+F22*f_r);
        lintang_bulan+=koefisien23*(Math.pow(e,Math.abs(M23)))*Math.sin(D23*d_r+M23*m_r+MA23*ma_r+F23*f_r);
        lintang_bulan+=koefisien24*(Math.pow(e,Math.abs(M24)))*Math.sin(D24*d_r+M24*m_r+MA24*ma_r+F24*f_r);
        lintang_bulan+=koefisien25*(Math.pow(e,Math.abs(M25)))*Math.sin(D25*d_r+M25*m_r+MA25*ma_r+F25*f_r);
        lintang_bulan+=koefisien26*(Math.pow(e,Math.abs(M26)))*Math.sin(D26*d_r+M26*m_r+MA26*ma_r+F26*f_r);
        lintang_bulan+=koefisien27*(Math.pow(e,Math.abs(M27)))*Math.sin(D27*d_r+M27*m_r+MA27*ma_r+F27*f_r);
        lintang_bulan+=koefisien28*(Math.pow(e,Math.abs(M28)))*Math.sin(D28*d_r+M28*m_r+MA28*ma_r+F28*f_r);
        lintang_bulan+=koefisien29*(Math.pow(e,Math.abs(M29)))*Math.sin(D29*d_r+M29*m_r+MA29*ma_r+F29*f_r);
        lintang_bulan+=koefisien30*(Math.pow(e,Math.abs(M30)))*Math.sin(D30*d_r+M30*m_r+MA30*ma_r+F30*f_r);
        lintang_bulan+=koefisien31*(Math.pow(e,Math.abs(M31)))*Math.sin(D31*d_r+M31*m_r+MA31*ma_r+F31*f_r);
        lintang_bulan+=koefisien32*(Math.pow(e,Math.abs(M32)))*Math.sin(D32*d_r+M32*m_r+MA32*ma_r+F32*f_r);
        lintang_bulan+=koefisien33*(Math.pow(e,Math.abs(M33)))*Math.sin(D33*d_r+M33*m_r+MA33*ma_r+F33*f_r);
        lintang_bulan+=koefisien34*(Math.pow(e,Math.abs(M34)))*Math.sin(D34*d_r+M34*m_r+MA34*ma_r+F34*f_r);
        lintang_bulan+=koefisien35*(Math.pow(e,Math.abs(M35)))*Math.sin(D35*d_r+M35*m_r+MA35*ma_r+F35*f_r);
        lintang_bulan+=koefisien36*(Math.pow(e,Math.abs(M36)))*Math.sin(D36*d_r+M36*m_r+MA36*ma_r+F36*f_r);
        lintang_bulan+=koefisien37*(Math.pow(e,Math.abs(M37)))*Math.sin(D37*d_r+M37*m_r+MA37*ma_r+F37*f_r);
        lintang_bulan+=koefisien38*(Math.pow(e,Math.abs(M38)))*Math.sin(D38*d_r+M38*m_r+MA38*ma_r+F38*f_r);
        lintang_bulan+=koefisien39*(Math.pow(e,Math.abs(M39)))*Math.sin(D39*d_r+M39*m_r+MA39*ma_r+F39*f_r);
        lintang_bulan+=koefisien40*(Math.pow(e,Math.abs(M40)))*Math.sin(D40*d_r+M40*m_r+MA40*ma_r+F40*f_r);
        lintang_bulan+=koefisien41*(Math.pow(e,Math.abs(M41)))*Math.sin(D41*d_r+M41*m_r+MA41*ma_r+F41*f_r);
        lintang_bulan+=koefisien42*(Math.pow(e,Math.abs(M42)))*Math.sin(D42*d_r+M42*m_r+MA42*ma_r+F42*f_r);
        lintang_bulan+=koefisien43*(Math.pow(e,Math.abs(M43)))*Math.sin(D43*d_r+M43*m_r+MA43*ma_r+F43*f_r);
        lintang_bulan+=koefisien44*(Math.pow(e,Math.abs(M44)))*Math.sin(D44*d_r+M44*m_r+MA44*ma_r+F44*f_r);
        lintang_bulan+=koefisien45*(Math.pow(e,Math.abs(M45)))*Math.sin(D45*d_r+M45*m_r+MA45*ma_r+F45*f_r);
        lintang_bulan+=koefisien46*(Math.pow(e,Math.abs(M46)))*Math.sin(D46*d_r+M46*m_r+MA46*ma_r+F46*f_r);
        lintang_bulan+=koefisien47*(Math.pow(e,Math.abs(M47)))*Math.sin(D47*d_r+M47*m_r+MA47*ma_r+F47*f_r);
        lintang_bulan+=koefisien48*(Math.pow(e,Math.abs(M48)))*Math.sin(D48*d_r+M48*m_r+MA48*ma_r+F48*f_r);
        lintang_bulan+=koefisien49*(Math.pow(e,Math.abs(M49)))*Math.sin(D49*d_r+M49*m_r+MA49*ma_r+F49*f_r);
        lintang_bulan+=koefisien50*(Math.pow(e,Math.abs(M50)))*Math.sin(D50*d_r+M50*m_r+MA50*ma_r+F50*f_r);
        lintang_bulan+=koefisien51*(Math.pow(e,Math.abs(M51)))*Math.sin(D51*d_r+M51*m_r+MA51*ma_r+F51*f_r);
        lintang_bulan+=koefisien52*(Math.pow(e,Math.abs(M52)))*Math.sin(D52*d_r+M52*m_r+MA52*ma_r+F52*f_r);
        lintang_bulan+=koefisien53*(Math.pow(e,Math.abs(M53)))*Math.sin(D53*d_r+M53*m_r+MA53*ma_r+F53*f_r);
        lintang_bulan+=koefisien54*(Math.pow(e,Math.abs(M54)))*Math.sin(D54*d_r+M54*m_r+MA54*ma_r+F54*f_r);
        lintang_bulan+=koefisien55*(Math.pow(e,Math.abs(M55)))*Math.sin(D55*d_r+M55*m_r+MA55*ma_r+F55*f_r);
        lintang_bulan+=koefisien56*(Math.pow(e,Math.abs(M56)))*Math.sin(D56*d_r+M56*m_r+MA56*ma_r+F56*f_r);
        lintang_bulan+=koefisien57*(Math.pow(e,Math.abs(M57)))*Math.sin(D57*d_r+M57*m_r+MA57*ma_r+F57*f_r);
        lintang_bulan+=koefisien58*(Math.pow(e,Math.abs(M58)))*Math.sin(D58*d_r+M58*m_r+MA58*ma_r+F58*f_r);
        lintang_bulan+=koefisien59*(Math.pow(e,Math.abs(M59)))*Math.sin(D59*d_r+M59*m_r+MA59*ma_r+F59*f_r);
        lintang_bulan+=koefisien60*(Math.pow(e,Math.abs(M60)))*Math.sin(D60*d_r+M60*m_r+MA60*ma_r+F60*f_r);

        lintang_bulan=(lintang_bulan-2235*Math.sin(l1_r)+382*Math.sin(aA3_r)+175*Math.sin(aA1_r-f_r)+175*Math.sin(aA1_r+f_r)+127*Math.sin(l1_r-ma_r)-115*Math.sin(l1_r+ma_r))/1000000;





        return new double[]{0,lintang_bulan};
    }

    public static double[] jarakBumiBulan(double e, double d_r, double m_r, double ma_r, double f_r) {
        double D1=0; double M1=0; double MA1=1;double F1=0; double koefisien1=-20905355;
        double D2=2; double M2=0; double MA2=-1;double F2=0; double koefisien2=-3699111;
        double D3=2; double M3=0; double MA3=0;double F3=0; double koefisien3=-2955968;
        double D4=0; double M4=0; double MA4=2;double F4=0; double koefisien4=-569925;
        double D5=2; double M5=0; double MA5=-2;double F5=0; double koefisien5=246158;
        double D6=2; double M6=-1; double MA6=0;double F6=0; double koefisien6=-204586;
        double D7=2; double M7=0; double MA7=1;double F7=0; double koefisien7=-170733;
        double D8=2; double M8=-1; double MA8=-1;double F8=0; double koefisien8=-152138;
        double D9=0; double M9=1; double MA9=-1;double F9=0; double koefisien9=-129620;
        double D10=1; double M10=0; double MA10=0;double F10=0; double koefisien10=108743;
        double D11=0; double M11=1; double MA11=1;double F11=0; double koefisien11=104755;
        double D12=0; double M12=0; double MA12=1;double F12=-2; double koefisien12=79661;
        double D13=0; double M13=1; double MA13=0;double F13=0; double koefisien13=48888;
        double D14=4; double M14=0; double MA14=-1;double F14=0; double koefisien14=-34782;
        double D15=2; double M15=1; double MA15=0;double F15=0; double koefisien15=30824;
        double D16=2; double M16=1; double MA16=-1;double F16=0; double koefisien16=24208;
        double D17=0; double M17=0; double MA17=3;double F17=0; double koefisien17=-23210;
        double D18=4; double M18=0; double MA18=-2;double F18=0; double koefisien18=-21636;
        double D19=1; double M19=1; double MA19=0;double F19=0; double koefisien19=-16675;
        double D20=2; double M20=0; double MA20=-3;double F20=0; double koefisien20=14403;
        double D21=2; double M21=-1; double MA21=1;double F21=0; double koefisien21=-12831;
        double D22=4; double M22=0; double MA22=0;double F22=0; double koefisien22=-11650;
        double D23=2; double M23=0; double MA23=2;double F23=0; double koefisien23=-10445;
        double D24=2; double M24=0; double MA24=0;double F24=-2; double koefisien24=10321;
        double D25=2; double M25=-1; double MA25=-2;double F25=0; double koefisien25=10056;
        double D26=2; double M26=-2; double MA26=0;double F26=0; double koefisien26=-9884;
        double D27=2; double M27=0; double MA27=-1;double F27=-2; double koefisien27=8752;
        double D28=1; double M28=0; double MA28=-1;double F28=0; double koefisien28=-8379;
        double D29=0; double M29=1; double MA29=-2;double F29=0; double koefisien29=-7003;
        double D30=1; double M30=0; double MA30=1;double F30=0; double koefisien30=6322;
        double D31=0; double M31=1; double MA31=2;double F31=0; double koefisien31=5751;
        double D32=2; double M32=-2; double MA32=-1;double F32=0; double koefisien32=-4950;
        double D33=0; double M33=0; double MA33=2;double F33=-2; double koefisien33=-4421;
        double D34=2; double M34=0; double MA34=1;double F34=-2; double koefisien34=4130;
        double D35=4; double M35=-1; double MA35=-1;double F35=0; double koefisien35=-3958;
        double D36=3; double M36=0; double MA36=-1;double F36=0; double koefisien36=3258;
        double D37=0; double M37=0; double MA37=0;double F37=2; double koefisien37=-3149;
        double D38=2; double M38=1; double MA38=1;double F38=0; double koefisien38=2616;
        double D39=2; double M39=2; double MA39=-1;double F39=0; double koefisien39=2354;
        double D40=0; double M40=2; double MA40=-1;double F40=0; double koefisien40=-2117;
        double D41=4; double M41=-1; double MA41=-2;double F41=0; double koefisien41=-1897;
        double D42=1; double M42=0; double MA42=-2;double F42=0; double koefisien42=-1739;
        double D43=4; double M43=-1; double MA43=0;double F43=0; double koefisien43=-1571;
        double D44=4; double M44=0; double MA44=1;double F44=0; double koefisien44=-1423;
        double D45=0; double M45=2; double MA45=1;double F45=0; double koefisien45=1165;
        double D46=0; double M46=0; double MA46=4;double F46=0; double koefisien46=-1117;

        double jarakBulan=0;
        jarakBulan+=koefisien1*(Math.pow(e,Math.abs(M1)))*Math.cos(D1*d_r+M1*m_r+MA1*ma_r+F1*f_r);
        jarakBulan+=koefisien2*(Math.pow(e,Math.abs(M2)))*Math.cos(D2*d_r+M2*m_r+MA2*ma_r+F2*f_r);
        jarakBulan+=koefisien3*(Math.pow(e,Math.abs(M3)))*Math.cos(D3*d_r+M3*m_r+MA3*ma_r+F3*f_r);
        jarakBulan+=koefisien4*(Math.pow(e,Math.abs(M4)))*Math.cos(D4*d_r+M4*m_r+MA4*ma_r+F4*f_r);
        jarakBulan+=koefisien5*(Math.pow(e,Math.abs(M5)))*Math.cos(D5*d_r+M5*m_r+MA5*ma_r+F5*f_r);
        jarakBulan+=koefisien6*(Math.pow(e,Math.abs(M6)))*Math.cos(D6*d_r+M6*m_r+MA6*ma_r+F6*f_r);
        jarakBulan+=koefisien7*(Math.pow(e,Math.abs(M7)))*Math.cos(D7*d_r+M7*m_r+MA7*ma_r+F7*f_r);
        jarakBulan+=koefisien8*(Math.pow(e,Math.abs(M8)))*Math.cos(D8*d_r+M8*m_r+MA8*ma_r+F8*f_r);
        jarakBulan+=koefisien9*(Math.pow(e,Math.abs(M9)))*Math.cos(D9*d_r+M9*m_r+MA9*ma_r+F9*f_r);
        jarakBulan+=koefisien10*(Math.pow(e,Math.abs(M10)))*Math.cos(D10*d_r+M10*m_r+MA10*ma_r+F10*f_r);
        jarakBulan+=koefisien11*(Math.pow(e,Math.abs(M11)))*Math.cos(D11*d_r+M11*m_r+MA11*ma_r+F11*f_r);
        jarakBulan+=koefisien12*(Math.pow(e,Math.abs(M12)))*Math.cos(D12*d_r+M12*m_r+MA12*ma_r+F12*f_r);
        jarakBulan+=koefisien13*(Math.pow(e,Math.abs(M13)))*Math.cos(D13*d_r+M13*m_r+MA13*ma_r+F13*f_r);
        jarakBulan+=koefisien14*(Math.pow(e,Math.abs(M14)))*Math.cos(D14*d_r+M14*m_r+MA14*ma_r+F14*f_r);
        jarakBulan+=koefisien15*(Math.pow(e,Math.abs(M15)))*Math.cos(D15*d_r+M15*m_r+MA15*ma_r+F15*f_r);
        jarakBulan+=koefisien16*(Math.pow(e,Math.abs(M16)))*Math.cos(D16*d_r+M16*m_r+MA16*ma_r+F16*f_r);
        jarakBulan+=koefisien17*(Math.pow(e,Math.abs(M17)))*Math.cos(D17*d_r+M17*m_r+MA17*ma_r+F17*f_r);
        jarakBulan+=koefisien18*(Math.pow(e,Math.abs(M18)))*Math.cos(D18*d_r+M18*m_r+MA18*ma_r+F18*f_r);
        jarakBulan+=koefisien19*(Math.pow(e,Math.abs(M19)))*Math.cos(D19*d_r+M19*m_r+MA19*ma_r+F19*f_r);
        jarakBulan+=koefisien20*(Math.pow(e,Math.abs(M20)))*Math.cos(D20*d_r+M20*m_r+MA20*ma_r+F20*f_r);
        jarakBulan+=koefisien21*(Math.pow(e,Math.abs(M21)))*Math.cos(D21*d_r+M21*m_r+MA21*ma_r+F21*f_r);
        jarakBulan+=koefisien22*(Math.pow(e,Math.abs(M22)))*Math.cos(D22*d_r+M22*m_r+MA22*ma_r+F22*f_r);
        jarakBulan+=koefisien23*(Math.pow(e,Math.abs(M23)))*Math.cos(D23*d_r+M23*m_r+MA23*ma_r+F23*f_r);
        jarakBulan+=koefisien24*(Math.pow(e,Math.abs(M24)))*Math.cos(D24*d_r+M24*m_r+MA24*ma_r+F24*f_r);
        jarakBulan+=koefisien25*(Math.pow(e,Math.abs(M25)))*Math.cos(D25*d_r+M25*m_r+MA25*ma_r+F25*f_r);
        jarakBulan+=koefisien26*(Math.pow(e,Math.abs(M26)))*Math.cos(D26*d_r+M26*m_r+MA26*ma_r+F26*f_r);
        jarakBulan+=koefisien27*(Math.pow(e,Math.abs(M27)))*Math.cos(D27*d_r+M27*m_r+MA27*ma_r+F27*f_r);
        jarakBulan+=koefisien28*(Math.pow(e,Math.abs(M28)))*Math.cos(D28*d_r+M28*m_r+MA28*ma_r+F28*f_r);
        jarakBulan+=koefisien29*(Math.pow(e,Math.abs(M29)))*Math.cos(D29*d_r+M29*m_r+MA29*ma_r+F29*f_r);
        jarakBulan+=koefisien30*(Math.pow(e,Math.abs(M30)))*Math.cos(D30*d_r+M30*m_r+MA30*ma_r+F30*f_r);
        jarakBulan+=koefisien31*(Math.pow(e,Math.abs(M31)))*Math.cos(D31*d_r+M31*m_r+MA31*ma_r+F31*f_r);
        jarakBulan+=koefisien32*(Math.pow(e,Math.abs(M32)))*Math.cos(D32*d_r+M32*m_r+MA32*ma_r+F32*f_r);
        jarakBulan+=koefisien33*(Math.pow(e,Math.abs(M33)))*Math.cos(D33*d_r+M33*m_r+MA33*ma_r+F33*f_r);
        jarakBulan+=koefisien34*(Math.pow(e,Math.abs(M34)))*Math.cos(D34*d_r+M34*m_r+MA34*ma_r+F34*f_r);
        jarakBulan+=koefisien35*(Math.pow(e,Math.abs(M35)))*Math.cos(D35*d_r+M35*m_r+MA35*ma_r+F35*f_r);
        jarakBulan+=koefisien36*(Math.pow(e,Math.abs(M36)))*Math.cos(D36*d_r+M36*m_r+MA36*ma_r+F36*f_r);
        jarakBulan+=koefisien37*(Math.pow(e,Math.abs(M37)))*Math.cos(D37*d_r+M37*m_r+MA37*ma_r+F37*f_r);
        jarakBulan+=koefisien38*(Math.pow(e,Math.abs(M38)))*Math.cos(D38*d_r+M38*m_r+MA38*ma_r+F38*f_r);
        jarakBulan+=koefisien39*(Math.pow(e,Math.abs(M39)))*Math.cos(D39*d_r+M39*m_r+MA39*ma_r+F39*f_r);
        jarakBulan+=koefisien40*(Math.pow(e,Math.abs(M40)))*Math.cos(D40*d_r+M40*m_r+MA40*ma_r+F40*f_r);
        jarakBulan+=koefisien41*(Math.pow(e,Math.abs(M41)))*Math.cos(D41*d_r+M41*m_r+MA41*ma_r+F41*f_r);
        jarakBulan+=koefisien42*(Math.pow(e,Math.abs(M42)))*Math.cos(D42*d_r+M42*m_r+MA42*ma_r+F42*f_r);
        jarakBulan+=koefisien43*(Math.pow(e,Math.abs(M43)))*Math.cos(D43*d_r+M43*m_r+MA43*ma_r+F43*f_r);
        jarakBulan+=koefisien44*(Math.pow(e,Math.abs(M44)))*Math.cos(D44*d_r+M44*m_r+MA44*ma_r+F44*f_r);
        jarakBulan+=koefisien45*(Math.pow(e,Math.abs(M45)))*Math.cos(D45*d_r+M45*m_r+MA45*ma_r+F45*f_r);
        jarakBulan+=koefisien46*(Math.pow(e,Math.abs(M46)))*Math.cos(D46*d_r+M46*m_r+MA46*ma_r+F46*f_r);

        jarakBulan=jarakBulan/1000;

        return new double[]{0,jarakBulan};

    }

    }
