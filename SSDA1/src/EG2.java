/* Generated By:JavaCC: Do not edit this line. EG2.java */
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class EG2 implements EG2Constants {
  static String x1,x2,x3,x4,x10,x6,x11,x15;
  static ArrayList<String> x5 = new ArrayList<String>();
   static ArrayList<String> x7 = new ArrayList<String>();
   static ArrayList<String> x8 = new ArrayList<String>();
   static ArrayList<String> x18 = new ArrayList<String>();
 static int n,x;

  public EG2() {

  }
 public static String getid() {
   return x1;
}
public static String getagent() {
   return x2;
}
 public static String getverb() {
   return x3;
}
public static String getop() {
   return x4;
}
public static ArrayList getobj() {

   return x5;
}
public static String getcondition() {

   return x10;
}
 public static String getopMode() {

   return x6;
}
public static ArrayList getstakeholders() {

   return x7;
}
public static ArrayList getparameters() {

   return x8;
}
public static String getvalue() {

   return x11;
}
public static String geteffect() {

   return x15;
}
public static ArrayList gets() {

   return x18;
}

  static final public int start() throws ParseException {
    wff();
    {if (true) return 0;}  // returns 0 on successful parse

    throw new Error("Missing return statement in function");
  }

  static final public void wff() throws ParseException {
    x5.clear();x7.clear(); x8.clear();x18.clear();x10=null;
    event();
  }

  static final public void event() throws ParseException {
 Token a;
    a = jj_consume_token(ID);
 x1=a.toString();
 System.out.println("ID: "+ a);
    jj_consume_token(21);
    label_1:
    while (true) {
      if (jj_2_1(2)) {
        ;
      } else {
        break label_1;
      }
      jj_consume_token(22);
      action();
    }
    label_2:
    while (true) {
      if (jj_2_2(2)) {
        ;
      } else {
        break label_2;
      }
      jj_consume_token(22);
      condition();
    }
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 22:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_3;
      }
      effect();
    }
    jj_consume_token(23);
  }

  static final public void action() throws ParseException {
 Token b,c,d,e,f,i,s,g;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 24:
    case 25:
    case 26:
    case 27:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 24:
        jj_consume_token(24);
        break;
      case 25:
        jj_consume_token(25);
        break;
      case 26:
        jj_consume_token(26);
        break;
      case 27:
        jj_consume_token(27);
        break;
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    default:
      jj_la1[2] = jj_gen;
      ;
    }
    b = jj_consume_token(AGENT);
  x2=b.toString();
  System.out.println("AGENT: "+ b);
    if (jj_2_3(2)) {
      jj_consume_token(22);
      c = jj_consume_token(VERB);
 x3=c.toString();
  System.out.println("VERB: "+ c);
    } else {
      ;
    }
    if (jj_2_4(2)) {
      jj_consume_token(22);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 28:
        jj_consume_token(28);
        break;
      default:
        jj_la1[3] = jj_gen;
        ;
      }
      d = jj_consume_token(OpMode);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 29:
        jj_consume_token(29);
        break;
      default:
        jj_la1[4] = jj_gen;
        ;
      }
 x6=d.toString();
  System.out.println("OpMode: "+ d);
    } else {
      ;
    }
    jj_consume_token(22);
    e = jj_consume_token(OPERATION);
 x4=e.toString();
  System.out.println("OPERATION: "+ e);
    jj_consume_token(22);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 24:
    case 25:
    case 26:
    case 30:
    case 31:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 24:
        jj_consume_token(24);
        break;
      case 25:
        jj_consume_token(25);
        break;
      case 26:
        jj_consume_token(26);
        break;
      case 30:
        jj_consume_token(30);
        break;
      case 31:
        jj_consume_token(31);
        break;
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    default:
      jj_la1[6] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 32:
      jj_consume_token(32);
      break;
    default:
      jj_la1[7] = jj_gen;
      ;
    }
    f = jj_consume_token(OBJECT);
 x5.add(f.toString());

  System.out.println("OBJECT: "+ f);
    label_4:
    while (true) {
      if (jj_2_5(4)) {
        ;
      } else {
        break label_4;
      }
      jj_consume_token(22);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 24:
      case 25:
      case 26:
      case 30:
      case 31:
      case 33:
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 24:
          jj_consume_token(24);
          break;
        case 25:
          jj_consume_token(25);
          break;
        case 26:
          jj_consume_token(26);
          break;
        case 31:
          jj_consume_token(31);
          break;
        case 30:
          jj_consume_token(30);
          break;
        case 33:
          jj_consume_token(33);
          break;
        default:
          jj_la1[8] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
      default:
        jj_la1[9] = jj_gen;
        ;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 25:
        jj_consume_token(25);
        break;
      default:
        jj_la1[10] = jj_gen;
        ;
      }
      i = jj_consume_token(OBJECT);
 x5.add(i.toString());

  System.out.println("OBJECT: "+ i);
    }
    label_5:
    while (true) {
      if (jj_2_6(2)) {
        ;
      } else {
        break label_5;
      }
      stakeholders();
    }
    label_6:
    while (true) {
      if (jj_2_7(2)) {
        ;
      } else {
        break label_6;
      }
      jj_consume_token(22);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 34:
        jj_consume_token(34);
        break;
      default:
        jj_la1[11] = jj_gen;
        ;
      }
      parameter();
    }
  }

  static final public void condition() throws ParseException {
 Token z,b,c,d,e,f;
    z = jj_consume_token(CONDITION);
  x10=z.toString();
  System.out.println("CONDITION: "+ z);
    label_7:
    while (true) {
      if (jj_2_8(3)) {
        ;
      } else {
        break label_7;
      }
      jj_consume_token(22);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 24:
      case 25:
      case 26:
      case 35:
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 24:
          jj_consume_token(24);
          break;
        case 25:
          jj_consume_token(25);
          break;
        case 26:
          jj_consume_token(26);
          break;
        case 35:
          jj_consume_token(35);
          break;
        default:
          jj_la1[12] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
      default:
        jj_la1[13] = jj_gen;
        ;
      }
      b = jj_consume_token(AGENT);
 x2=b.toString();
  System.out.println("AGENT: "+ b);
    }
    if (jj_2_9(2)) {
      jj_consume_token(22);
      c = jj_consume_token(VERB);
  x3=c.toString();
  System.out.println("VERB: "+ c);
    } else {
      ;
    }
    if (jj_2_10(2)) {
      jj_consume_token(22);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 28:
        jj_consume_token(28);
        break;
      default:
        jj_la1[14] = jj_gen;
        ;
      }
      d = jj_consume_token(OpMode);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 29:
        jj_consume_token(29);
        break;
      default:
        jj_la1[15] = jj_gen;
        ;
      }
 x6=d.toString();
  System.out.println("OpMode: "+ d);
    } else {
      ;
    }
    label_8:
    while (true) {
      if (jj_2_11(2)) {
        ;
      } else {
        break label_8;
      }
      jj_consume_token(22);
      e = jj_consume_token(OPERATION);
 x4=e.toString();
System.out.println("OPERATION: "+ e);
    }
    label_9:
    while (true) {
      if (jj_2_12(2)) {
        ;
      } else {
        break label_9;
      }
      jj_consume_token(22);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 24:
      case 25:
      case 26:
      case 30:
      case 31:
      case 36:
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 24:
          jj_consume_token(24);
          break;
        case 25:
          jj_consume_token(25);
          break;
        case 26:
          jj_consume_token(26);
          break;
        case 30:
          jj_consume_token(30);
          break;
        case 31:
          jj_consume_token(31);
          break;
        case 36:
          jj_consume_token(36);
          break;
        default:
          jj_la1[16] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
      default:
        jj_la1[17] = jj_gen;
        ;
      }
      f = jj_consume_token(OBJECT);
  x5.add(f.toString());

System.out.println("OBJECT: "+ f);
    }
    label_10:
    while (true) {
      if (jj_2_13(2)) {
        ;
      } else {
        break label_10;
      }
      jj_consume_token(22);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 24:
      case 25:
      case 26:
      case 30:
      case 31:
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 24:
          jj_consume_token(24);
          break;
        case 25:
          jj_consume_token(25);
          break;
        case 26:
          jj_consume_token(26);
          break;
        case 30:
          jj_consume_token(30);
          break;
        case 31:
          jj_consume_token(31);
          break;
        default:
          jj_la1[18] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
      default:
        jj_la1[19] = jj_gen;
        ;
      }
      f = jj_consume_token(OBJECT);
 x5.add(f.toString());

System.out.println("OBJECT: "+ f);
    }
    label_11:
    while (true) {
      if (jj_2_14(2)) {
        ;
      } else {
        break label_11;
      }
      status();
      label_12:
      while (true) {
        if (jj_2_15(3)) {
          ;
        } else {
          break label_12;
        }
        jj_consume_token(22);
        z = jj_consume_token(Conj);
        status();
      }
    }
    label_13:
    while (true) {
      if (jj_2_16(2)) {
        ;
      } else {
        break label_13;
      }
      jj_consume_token(22);
      z = jj_consume_token(VALUE);
  x11=z.toString();
 System.out.println("VALUE: "+ z);
    }
  }

  static final public void effect() throws ParseException {
 Token y,i;
    jj_consume_token(22);
    y = jj_consume_token(EFFECT);
 x15=y.toString();
  System.out.println("EFFECT: "+ y);
    label_14:
    while (true) {
      if (jj_2_17(2)) {
        ;
      } else {
        break label_14;
      }
      jj_consume_token(22);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 24:
      case 25:
      case 26:
      case 30:
      case 31:
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 24:
          jj_consume_token(24);
          break;
        case 25:
          jj_consume_token(25);
          break;
        case 26:
          jj_consume_token(26);
          break;
        case 31:
          jj_consume_token(31);
          break;
        case 30:
          jj_consume_token(30);
          break;
        default:
          jj_la1[20] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
      default:
        jj_la1[21] = jj_gen;
        ;
      }
      i = jj_consume_token(OBJECT);
 x5.add(i.toString());
System.out.println("OBJECT: "+ i);
    }
    label_15:
    while (true) {
      if (jj_2_18(2)) {
        ;
      } else {
        break label_15;
      }
      status();
    }
  }

  static final public void stakeholders() throws ParseException {
 Token s=null;String s1 = "";int i=0;
    jj_consume_token(22);
    s = jj_consume_token(STAKEHOLDERS);
 s1 = s.toString();
String[] words = { "users", "application","customer","admin"};
for (String word : words) {
int loc = s1.indexOf(word);
while (loc != -1) {
   i=loc;
   loc = s1.indexOf(word, loc + 1); } }

   s1=s1.substring(i);
   x7.add(s1.toString());
   System.out.println("STAKEHOLDERS: "+ s1);
  }

  static final public void parameter() throws ParseException {
 Token p,j,z;
    p = jj_consume_token(Parameter);
 x8.add(p.toString());System.out.println("Parameters: "+ p);
    label_16:
    while (true) {
      if (jj_2_19(2)) {
        ;
      } else {
        break label_16;
      }
      jj_consume_token(22);
      z = jj_consume_token(Conj);
      jj_consume_token(22);
      j = jj_consume_token(Parameter);
 x8.add(j.toString());System.out.println("Parameters: "+ j);
    }
  }

  static final public void status() throws ParseException {
 Token h;
    jj_consume_token(22);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 37:
      jj_consume_token(37);
      break;
    default:
      jj_la1[22] = jj_gen;
      ;
    }
    h = jj_consume_token(STATUS);
 x18.add(h.toString());
  System.out.println("STATUS: "+ h);
  }

  static private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  static private boolean jj_2_2(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  static private boolean jj_2_3(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  static private boolean jj_2_4(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_4(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  static private boolean jj_2_5(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_5(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(4, xla); }
  }

  static private boolean jj_2_6(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_6(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(5, xla); }
  }

  static private boolean jj_2_7(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_7(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(6, xla); }
  }

  static private boolean jj_2_8(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_8(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(7, xla); }
  }

  static private boolean jj_2_9(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_9(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(8, xla); }
  }

  static private boolean jj_2_10(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_10(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(9, xla); }
  }

  static private boolean jj_2_11(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_11(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(10, xla); }
  }

  static private boolean jj_2_12(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_12(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(11, xla); }
  }

  static private boolean jj_2_13(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_13(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(12, xla); }
  }

  static private boolean jj_2_14(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_14(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(13, xla); }
  }

  static private boolean jj_2_15(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_15(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(14, xla); }
  }

  static private boolean jj_2_16(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_16(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(15, xla); }
  }

  static private boolean jj_2_17(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_17(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(16, xla); }
  }

  static private boolean jj_2_18(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_18(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(17, xla); }
  }

  static private boolean jj_2_19(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_19(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(18, xla); }
  }

  static private boolean jj_3_6() {
    if (jj_3R_20()) return true;
    return false;
  }

  static private boolean jj_3R_19() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(24)) {
    jj_scanpos = xsp;
    if (jj_scan_token(25)) {
    jj_scanpos = xsp;
    if (jj_scan_token(26)) {
    jj_scanpos = xsp;
    if (jj_scan_token(31)) {
    jj_scanpos = xsp;
    if (jj_scan_token(30)) {
    jj_scanpos = xsp;
    if (jj_scan_token(33)) return true;
    }
    }
    }
    }
    }
    return false;
  }

  static private boolean jj_3_1() {
    if (jj_scan_token(22)) return true;
    if (jj_3R_17()) return true;
    return false;
  }

  static private boolean jj_3R_20() {
    if (jj_scan_token(22)) return true;
    if (jj_scan_token(STAKEHOLDERS)) return true;
    return false;
  }

  static private boolean jj_3_12() {
    if (jj_scan_token(22)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_23()) jj_scanpos = xsp;
    if (jj_scan_token(OBJECT)) return true;
    return false;
  }

  static private boolean jj_3_5() {
    if (jj_scan_token(22)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_19()) jj_scanpos = xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(25)) jj_scanpos = xsp;
    if (jj_scan_token(OBJECT)) return true;
    return false;
  }

  static private boolean jj_3_11() {
    if (jj_scan_token(22)) return true;
    if (jj_scan_token(OPERATION)) return true;
    return false;
  }

  static private boolean jj_3_18() {
    if (jj_3R_25()) return true;
    return false;
  }

  static private boolean jj_3R_26() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(24)) {
    jj_scanpos = xsp;
    if (jj_scan_token(25)) {
    jj_scanpos = xsp;
    if (jj_scan_token(26)) {
    jj_scanpos = xsp;
    if (jj_scan_token(31)) {
    jj_scanpos = xsp;
    if (jj_scan_token(30)) return true;
    }
    }
    }
    }
    return false;
  }

  static private boolean jj_3_10() {
    if (jj_scan_token(22)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(28)) jj_scanpos = xsp;
    if (jj_scan_token(OpMode)) return true;
    return false;
  }

  static private boolean jj_3R_25() {
    if (jj_scan_token(22)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(37)) jj_scanpos = xsp;
    if (jj_scan_token(STATUS)) return true;
    return false;
  }

  static private boolean jj_3_17() {
    if (jj_scan_token(22)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_26()) jj_scanpos = xsp;
    if (jj_scan_token(OBJECT)) return true;
    return false;
  }

  static private boolean jj_3_9() {
    if (jj_scan_token(22)) return true;
    if (jj_scan_token(VERB)) return true;
    return false;
  }

  static private boolean jj_3R_22() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(24)) {
    jj_scanpos = xsp;
    if (jj_scan_token(25)) {
    jj_scanpos = xsp;
    if (jj_scan_token(26)) {
    jj_scanpos = xsp;
    if (jj_scan_token(35)) return true;
    }
    }
    }
    return false;
  }

  static private boolean jj_3_4() {
    if (jj_scan_token(22)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(28)) jj_scanpos = xsp;
    if (jj_scan_token(OpMode)) return true;
    return false;
  }

  static private boolean jj_3_19() {
    if (jj_scan_token(22)) return true;
    if (jj_scan_token(Conj)) return true;
    return false;
  }

  static private boolean jj_3_8() {
    if (jj_scan_token(22)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_22()) jj_scanpos = xsp;
    if (jj_scan_token(AGENT)) return true;
    return false;
  }

  static private boolean jj_3_3() {
    if (jj_scan_token(22)) return true;
    if (jj_scan_token(VERB)) return true;
    return false;
  }

  static private boolean jj_3R_21() {
    if (jj_scan_token(Parameter)) return true;
    return false;
  }

  static private boolean jj_3R_27() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(24)) {
    jj_scanpos = xsp;
    if (jj_scan_token(25)) {
    jj_scanpos = xsp;
    if (jj_scan_token(26)) {
    jj_scanpos = xsp;
    if (jj_scan_token(27)) return true;
    }
    }
    }
    return false;
  }

  static private boolean jj_3R_17() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_27()) jj_scanpos = xsp;
    if (jj_scan_token(AGENT)) return true;
    return false;
  }

  static private boolean jj_3_16() {
    if (jj_scan_token(22)) return true;
    if (jj_scan_token(VALUE)) return true;
    return false;
  }

  static private boolean jj_3R_18() {
    if (jj_scan_token(CONDITION)) return true;
    return false;
  }

  static private boolean jj_3_15() {
    if (jj_scan_token(22)) return true;
    if (jj_scan_token(Conj)) return true;
    if (jj_3R_25()) return true;
    return false;
  }

  static private boolean jj_3R_24() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(24)) {
    jj_scanpos = xsp;
    if (jj_scan_token(25)) {
    jj_scanpos = xsp;
    if (jj_scan_token(26)) {
    jj_scanpos = xsp;
    if (jj_scan_token(30)) {
    jj_scanpos = xsp;
    if (jj_scan_token(31)) return true;
    }
    }
    }
    }
    return false;
  }

  static private boolean jj_3_14() {
    if (jj_3R_25()) return true;
    return false;
  }

  static private boolean jj_3_7() {
    if (jj_scan_token(22)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(34)) jj_scanpos = xsp;
    if (jj_3R_21()) return true;
    return false;
  }

  static private boolean jj_3R_23() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(24)) {
    jj_scanpos = xsp;
    if (jj_scan_token(25)) {
    jj_scanpos = xsp;
    if (jj_scan_token(26)) {
    jj_scanpos = xsp;
    if (jj_scan_token(30)) {
    jj_scanpos = xsp;
    if (jj_scan_token(31)) {
    jj_scanpos = xsp;
    if (jj_scan_token(36)) return true;
    }
    }
    }
    }
    }
    return false;
  }

  static private boolean jj_3_2() {
    if (jj_scan_token(22)) return true;
    if (jj_3R_18()) return true;
    return false;
  }

  static private boolean jj_3_13() {
    if (jj_scan_token(22)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_24()) jj_scanpos = xsp;
    if (jj_scan_token(OBJECT)) return true;
    return false;
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public EG2TokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private Token jj_scanpos, jj_lastpos;
  static private int jj_la;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[23];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x400000,0xf000000,0xf000000,0x10000000,0x20000000,0xc7000000,0xc7000000,0x0,0xc7000000,0xc7000000,0x2000000,0x0,0x7000000,0x7000000,0x10000000,0x20000000,0xc7000000,0xc7000000,0xc7000000,0xc7000000,0xc7000000,0xc7000000,0x0,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x1,0x2,0x2,0x0,0x4,0x8,0x8,0x0,0x0,0x10,0x10,0x0,0x0,0x0,0x0,0x20,};
   }
  static final private JJCalls[] jj_2_rtns = new JJCalls[19];
  static private boolean jj_rescan = false;
  static private int jj_gc = 0;

  /** Constructor with InputStream. */
  public EG2(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public EG2(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new EG2TokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 23; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 23; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public EG2(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new EG2TokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 23; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 23; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public EG2(EG2TokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 23; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(EG2TokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 23; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  static final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  static private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;
  static private int[] jj_lasttokens = new int[100];
  static private int jj_endpos;

  static private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[38];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 23; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 38; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

  static private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 19; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
            case 3: jj_3_4(); break;
            case 4: jj_3_5(); break;
            case 5: jj_3_6(); break;
            case 6: jj_3_7(); break;
            case 7: jj_3_8(); break;
            case 8: jj_3_9(); break;
            case 9: jj_3_10(); break;
            case 10: jj_3_11(); break;
            case 11: jj_3_12(); break;
            case 12: jj_3_13(); break;
            case 13: jj_3_14(); break;
            case 14: jj_3_15(); break;
            case 15: jj_3_16(); break;
            case 16: jj_3_17(); break;
            case 17: jj_3_18(); break;
            case 18: jj_3_19(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  static private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
