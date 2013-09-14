/* The following code was generated by JFlex 1.4.3 on 9/09/13 1:08 PM */

package org.jetbrains.haskell.parser;

import java.util.*;
import com.intellij.lexer.*;
import com.intellij.psi.*;
import org.jetbrains.haskell.parser.token.*;
import com.intellij.psi.tree.IElementType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 9/09/13 1:08 PM from the specification file
 * <tt>/home/atsky/Dropbox/haskell-plugin/src/org/jetbrains/haskell/parser/Haskell.flex</tt>
 */
class _HaskellLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int STRING = 2;
  public static final int BLOCK_COMMENT = 4;
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\2\1\3\1\0\1\2\23\0\1\2\1\0\1\5\1\51"+
    "\3\0\1\53\1\12\1\13\2\0\1\17\1\4\1\16\1\0\12\1"+
    "\1\14\1\15\1\0\1\20\1\23\2\0\32\54\1\10\1\22\1\11"+
    "\3\0\1\25\1\46\1\27\1\31\1\30\1\45\1\47\1\40\1\34"+
    "\2\0\1\36\1\42\1\35\1\33\1\44\1\0\1\41\1\26\1\32"+
    "\1\43\1\0\1\37\1\0\1\50\1\0\1\7\1\21\1\6\u2114\0"+
    "\1\24\155\0\1\52\uddff\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\3\1\4\1\1\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\16\1\1\24\1\1"+
    "\1\25\1\26\1\0\1\27\1\0\1\30\3\0\1\31"+
    "\4\1\1\32\2\1\1\33\15\1\2\0\1\34\1\0"+
    "\1\35\1\30\1\36\1\0\1\37\10\1\1\40\14\1"+
    "\2\34\1\0\1\41\2\1\1\42\1\43\1\44\2\1"+
    "\1\45\13\1\1\0\1\1\1\46\2\1\1\47\5\1"+
    "\1\50\3\1\1\51\1\52\2\1\1\53\1\54\1\55"+
    "\1\1\1\56\1\57\1\1\1\60\5\1\1\61\1\62"+
    "\2\1\1\63\1\1\1\64";

  private static int [] zzUnpackAction() {
    int [] result = new int[162];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\55\0\132\0\207\0\264\0\341\0\u010e\0\u013b"+
    "\0\u0168\0\55\0\u0195\0\55\0\55\0\55\0\55\0\207"+
    "\0\55\0\u01c2\0\55\0\207\0\207\0\55\0\207\0\u01ef"+
    "\0\u021c\0\u0249\0\u0276\0\u02a3\0\u02d0\0\u02fd\0\u032a\0\u0357"+
    "\0\u0384\0\u03b1\0\u03de\0\u040b\0\u0438\0\207\0\u0465\0\u0492"+
    "\0\u04bf\0\u04ec\0\u0519\0\u0168\0\55\0\u0546\0\u0573\0\u05a0"+
    "\0\207\0\u05cd\0\u05fa\0\u0627\0\u0654\0\207\0\u0681\0\u06ae"+
    "\0\u06db\0\u0708\0\u0735\0\u0762\0\u078f\0\u07bc\0\u07e9\0\u0816"+
    "\0\u0843\0\u0870\0\u089d\0\u08ca\0\u08f7\0\u0924\0\u0951\0\u097e"+
    "\0\207\0\u09ab\0\55\0\u0168\0\55\0\u09d8\0\55\0\u0a05"+
    "\0\u0a32\0\u0a5f\0\u0a8c\0\u0ab9\0\u0ae6\0\u0b13\0\u0b40\0\207"+
    "\0\u0b6d\0\u0b9a\0\u0bc7\0\u0bf4\0\u0c21\0\u0c4e\0\u0c7b\0\u0ca8"+
    "\0\u0cd5\0\u0d02\0\u0d2f\0\u0d5c\0\55\0\u0951\0\u0d89\0\207"+
    "\0\u0db6\0\u0de3\0\207\0\207\0\207\0\u0e10\0\u0e3d\0\207"+
    "\0\u0e6a\0\u0e97\0\u0ec4\0\u0ef1\0\u0f1e\0\u0f4b\0\u0f78\0\u0fa5"+
    "\0\u0fd2\0\u0fff\0\u102c\0\u1059\0\u1086\0\207\0\u10b3\0\u10e0"+
    "\0\207\0\u110d\0\u113a\0\u1167\0\u1194\0\u11c1\0\207\0\u11ee"+
    "\0\u121b\0\u1248\0\207\0\u09d8\0\u1275\0\u12a2\0\207\0\207"+
    "\0\207\0\u12cf\0\207\0\207\0\u12fc\0\207\0\u1329\0\u1356"+
    "\0\u1383\0\u13b0\0\u13dd\0\207\0\207\0\u140a\0\u1437\0\207"+
    "\0\u1464\0\207";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[162];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\4\1\27\1\30\1\4\1\31"+
    "\1\4\1\32\1\33\1\34\1\35\1\4\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\4\4\1\46"+
    "\1\47\1\50\55\0\4\51\1\52\50\51\2\4\2\0"+
    "\1\4\7\0\1\4\3\0\2\4\1\0\32\4\1\0"+
    "\1\5\55\0\1\6\54\0\1\7\52\0\2\4\2\0"+
    "\1\53\7\0\1\4\3\0\2\4\1\0\1\27\31\4"+
    "\5\54\1\55\14\54\1\56\32\54\4\0\1\57\66\0"+
    "\1\60\36\0\2\4\2\0\1\4\7\0\1\4\3\0"+
    "\2\4\1\0\3\4\1\61\30\4\2\0\1\4\7\0"+
    "\1\4\3\0\2\4\1\0\2\4\1\62\5\4\1\63"+
    "\2\4\1\64\20\4\2\0\1\4\7\0\1\4\3\0"+
    "\2\4\1\0\2\4\1\65\5\4\1\66\23\4\2\0"+
    "\1\4\7\0\1\4\3\0\2\4\1\0\25\4\1\67"+
    "\6\4\2\0\1\4\7\0\1\4\3\0\2\4\1\0"+
    "\21\4\1\70\12\4\2\0\1\4\7\0\1\4\3\0"+
    "\2\4\1\0\12\4\1\71\4\4\1\72\14\4\2\0"+
    "\1\4\7\0\1\4\3\0\2\4\1\0\5\4\1\73"+
    "\26\4\2\0\1\4\7\0\1\4\3\0\2\4\1\0"+
    "\11\4\1\74\3\4\1\75\16\4\2\0\1\4\7\0"+
    "\1\4\3\0\2\4\1\0\11\4\1\76\22\4\2\0"+
    "\1\4\7\0\1\4\3\0\2\4\1\0\5\4\1\77"+
    "\26\4\2\0\1\4\7\0\1\4\3\0\2\4\1\0"+
    "\10\4\1\100\7\4\1\101\13\4\2\0\1\4\7\0"+
    "\1\4\3\0\2\4\1\0\3\4\1\102\30\4\2\0"+
    "\1\4\7\0\1\4\3\0\2\4\1\0\10\4\1\103"+
    "\7\4\1\104\13\4\2\0\1\4\7\0\1\4\3\0"+
    "\2\4\1\0\10\4\1\105\1\106\20\4\2\47\2\107"+
    "\1\47\7\107\1\47\3\107\2\47\1\110\30\47\1\111"+
    "\1\47\2\50\2\0\1\50\7\0\1\50\3\0\2\50"+
    "\1\0\32\50\4\51\1\112\56\51\1\113\46\51\3\53"+
    "\1\0\51\53\5\54\1\114\14\54\1\56\32\54\51\115"+
    "\1\116\3\115\16\0\1\117\36\0\2\4\2\0\1\4"+
    "\7\0\1\4\3\0\2\4\1\0\3\4\1\120\30\4"+
    "\2\0\1\4\7\0\1\4\3\0\2\4\1\0\12\4"+
    "\1\121\21\4\2\0\1\4\7\0\1\4\3\0\2\4"+
    "\1\0\2\4\1\122\31\4\2\0\1\4\7\0\1\4"+
    "\3\0\2\4\1\0\7\4\1\123\24\4\2\0\1\4"+
    "\7\0\1\4\3\0\2\4\1\0\21\4\1\124\12\4"+
    "\2\0\1\4\7\0\1\4\3\0\2\4\1\0\5\4"+
    "\1\125\26\4\2\0\1\4\7\0\1\4\3\0\2\4"+
    "\1\0\3\4\1\126\30\4\2\0\1\4\7\0\1\4"+
    "\3\0\2\4\1\0\21\4\1\127\12\4\2\0\1\4"+
    "\7\0\1\4\3\0\2\4\1\0\7\4\1\130\24\4"+
    "\2\0\1\4\7\0\1\4\3\0\2\4\1\0\7\4"+
    "\1\131\24\4\2\0\1\4\7\0\1\4\3\0\2\4"+
    "\1\0\5\4\1\132\26\4\2\0\1\4\7\0\1\4"+
    "\3\0\2\4\1\0\6\4\1\133\25\4\2\0\1\4"+
    "\7\0\1\4\3\0\2\4\1\0\4\4\1\134\5\4"+
    "\1\135\21\4\2\0\1\4\7\0\1\4\3\0\2\4"+
    "\1\0\6\4\1\136\25\4\2\0\1\4\7\0\1\4"+
    "\3\0\2\4\1\0\7\4\1\137\24\4\2\0\1\4"+
    "\7\0\1\4\3\0\2\4\1\0\11\4\1\140\22\4"+
    "\2\0\1\4\7\0\1\4\3\0\2\4\1\0\3\4"+
    "\1\141\30\4\2\0\1\4\7\0\1\4\3\0\2\4"+
    "\1\0\23\4\1\142\10\4\2\0\1\4\7\0\1\4"+
    "\3\0\2\4\1\0\16\4\1\143\15\4\2\0\1\4"+
    "\7\0\1\4\3\0\2\4\1\0\5\4\1\144\24\4"+
    "\22\107\1\110\30\107\1\145\23\107\1\110\30\107\1\146"+
    "\1\107\6\51\1\0\46\51\3\116\1\0\45\116\1\147"+
    "\3\116\2\4\2\0\1\4\7\0\1\4\3\0\2\4"+
    "\1\0\5\4\1\150\26\4\2\0\1\4\7\0\1\4"+
    "\3\0\2\4\1\0\3\4\1\151\30\4\2\0\1\4"+
    "\7\0\1\4\3\0\2\4\1\0\3\4\1\152\30\4"+
    "\2\0\1\4\7\0\1\4\3\0\2\4\1\0\2\4"+
    "\1\153\31\4\2\0\1\4\7\0\1\4\3\0\2\4"+
    "\1\0\5\4\1\154\26\4\2\0\1\4\7\0\1\4"+
    "\3\0\2\4\1\0\12\4\1\155\21\4\2\0\1\4"+
    "\7\0\1\4\3\0\2\4\1\0\7\4\1\156\24\4"+
    "\2\0\1\4\7\0\1\4\3\0\2\4\1\0\10\4"+
    "\1\157\23\4\2\0\1\4\7\0\1\4\3\0\2\4"+
    "\1\0\15\4\1\160\16\4\2\0\1\4\7\0\1\4"+
    "\3\0\2\4\1\0\16\4\1\161\15\4\2\0\1\4"+
    "\7\0\1\4\3\0\2\4\1\0\11\4\1\162\22\4"+
    "\2\0\1\4\7\0\1\4\3\0\2\4\1\0\10\4"+
    "\1\163\23\4\2\0\1\4\7\0\1\4\3\0\2\4"+
    "\1\0\2\4\1\164\31\4\2\0\1\4\7\0\1\4"+
    "\3\0\2\4\1\0\20\4\1\165\13\4\2\0\1\4"+
    "\7\0\1\4\3\0\2\4\1\0\20\4\1\166\13\4"+
    "\2\0\1\4\7\0\1\4\3\0\2\4\1\0\12\4"+
    "\1\167\21\4\2\0\1\4\7\0\1\4\3\0\2\4"+
    "\1\0\7\4\1\170\24\4\2\0\1\4\7\0\1\4"+
    "\3\0\2\4\1\0\13\4\1\171\20\4\2\0\1\4"+
    "\7\0\1\4\3\0\2\4\1\0\2\4\1\172\31\4"+
    "\2\0\1\4\7\0\1\4\3\0\2\4\1\0\13\4"+
    "\1\173\16\4\3\116\1\0\1\174\44\116\1\147\3\116"+
    "\2\4\2\0\1\4\7\0\1\4\3\0\2\4\1\0"+
    "\7\4\1\175\24\4\2\0\1\4\7\0\1\4\3\0"+
    "\2\4\1\0\3\4\1\176\30\4\2\0\1\4\7\0"+
    "\1\4\3\0\2\4\1\0\2\4\1\177\31\4\2\0"+
    "\1\4\7\0\1\4\3\0\2\4\1\0\16\4\1\200"+
    "\15\4\2\0\1\4\7\0\1\4\3\0\2\4\1\0"+
    "\5\4\1\201\26\4\2\0\1\4\7\0\1\4\3\0"+
    "\2\4\1\0\12\4\1\202\21\4\2\0\1\4\7\0"+
    "\1\4\3\0\2\4\1\0\16\4\1\203\15\4\2\0"+
    "\1\4\7\0\1\4\3\0\2\4\1\0\17\4\1\204"+
    "\14\4\2\0\1\4\7\0\1\4\3\0\2\4\1\0"+
    "\13\4\1\205\20\4\2\0\1\4\7\0\1\4\3\0"+
    "\2\4\1\0\2\4\1\206\31\4\2\0\1\4\7\0"+
    "\1\4\3\0\2\4\1\0\24\4\1\207\7\4\2\0"+
    "\1\4\7\0\1\4\3\0\2\4\1\0\20\4\1\210"+
    "\13\4\2\0\1\4\7\0\1\4\3\0\2\4\1\0"+
    "\11\4\1\211\22\4\2\0\1\4\7\0\1\4\3\0"+
    "\2\4\1\0\13\4\1\212\20\4\2\0\1\4\7\0"+
    "\1\4\3\0\2\4\1\0\6\4\1\213\23\4\3\116"+
    "\1\0\2\116\1\214\42\116\1\147\3\116\2\4\2\0"+
    "\1\4\7\0\1\4\3\0\2\4\1\0\16\4\1\215"+
    "\15\4\2\0\1\4\7\0\1\4\3\0\2\4\1\0"+
    "\12\4\1\216\21\4\2\0\1\4\7\0\1\4\3\0"+
    "\2\4\1\0\7\4\1\217\24\4\2\0\1\4\7\0"+
    "\1\4\3\0\2\4\1\0\24\4\1\220\7\4\2\0"+
    "\1\4\7\0\1\4\3\0\2\4\1\0\6\4\1\221"+
    "\25\4\2\0\1\4\7\0\1\4\3\0\2\4\1\0"+
    "\11\4\1\222\22\4\2\0\1\4\7\0\1\4\3\0"+
    "\2\4\1\0\5\4\1\223\26\4\2\0\1\4\7\0"+
    "\1\4\3\0\2\4\1\0\13\4\1\224\20\4\2\0"+
    "\1\4\7\0\1\4\3\0\2\4\1\0\13\4\1\225"+
    "\20\4\2\0\1\4\7\0\1\4\3\0\2\4\1\0"+
    "\4\4\1\226\27\4\2\0\1\4\7\0\1\4\3\0"+
    "\2\4\1\0\13\4\1\46\20\4\2\0\1\4\7\0"+
    "\1\4\3\0\2\4\1\0\20\4\1\227\13\4\2\0"+
    "\1\4\7\0\1\4\3\0\2\4\1\0\4\4\1\230"+
    "\27\4\2\0\1\4\7\0\1\4\3\0\2\4\1\0"+
    "\12\4\1\231\21\4\2\0\1\4\7\0\1\4\3\0"+
    "\2\4\1\0\2\4\1\232\31\4\2\0\1\4\7\0"+
    "\1\4\3\0\2\4\1\0\4\4\1\233\27\4\2\0"+
    "\1\4\7\0\1\4\3\0\2\4\1\0\5\4\1\234"+
    "\26\4\2\0\1\4\7\0\1\4\3\0\2\4\1\0"+
    "\24\4\1\235\7\4\2\0\1\4\7\0\1\4\3\0"+
    "\2\4\1\0\7\4\1\236\24\4\2\0\1\4\7\0"+
    "\1\4\3\0\2\4\1\0\7\4\1\237\24\4\2\0"+
    "\1\4\7\0\1\4\3\0\2\4\1\0\5\4\1\240"+
    "\26\4\2\0\1\4\7\0\1\4\3\0\2\4\1\0"+
    "\10\4\1\241\23\4\2\0\1\4\7\0\1\4\3\0"+
    "\2\4\1\0\16\4\1\242\13\4";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5265];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\10\1\0\6\1\1\11\1\1\4\11\1\1"+
    "\1\11\1\1\1\11\2\1\1\11\23\1\1\0\1\1"+
    "\1\0\1\11\3\0\26\1\2\0\1\1\1\0\1\11"+
    "\1\1\1\11\1\0\1\11\25\1\1\11\1\1\1\0"+
    "\24\1\1\0\46\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[162];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */



  _HaskellLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  _HaskellLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 128) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
      return;

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 52: 
          { return HaskellTokenTypes.CONSTRUCTOR_KEYWORD;
          }
        case 53: break;
        case 40: 
          { return HaskellTokenTypes.USING_KEYWORD;
          }
        case 54: break;
        case 31: 
          { return HaskellTokenTypes.THREE_DOTS;
          }
        case 55: break;
        case 7: 
          { return HaskellTokenTypes.LEFT_BRACE;
          }
        case 56: break;
        case 50: 
          { return HaskellTokenTypes.RENAMING_KEYWORD;
          }
        case 57: break;
        case 11: 
          { return HaskellTokenTypes.RIGHT_PAREN;
          }
        case 58: break;
        case 14: 
          { return HaskellTokenTypes.DOT;
          }
        case 59: break;
        case 22: 
          { return HaskellTokenTypes.COMMENT;
          }
        case 60: break;
        case 24: 
          { return HaskellTokenTypes.STRING;
          }
        case 61: break;
        case 1: 
          { return HaskellTokenTypes.ID;
          }
        case 62: break;
        case 3: 
          { return TokenType.WHITE_SPACE;
          }
        case 63: break;
        case 8: 
          { return HaskellTokenTypes.LEFT_BRACKET;
          }
        case 64: break;
        case 19: 
          { return HaskellTokenTypes.ARROW;
          }
        case 65: break;
        case 27: 
          { return HaskellTokenTypes.IN_KEYWORD;
          }
        case 66: break;
        case 6: 
          { return HaskellTokenTypes.RIGHT_BRACE;
          }
        case 67: break;
        case 38: 
          { return HaskellTokenTypes.CLASS_KEYWORD;
          }
        case 68: break;
        case 26: 
          { return HaskellTokenTypes.DO_KEYWORD;
          }
        case 69: break;
        case 33: 
          { return HaskellTokenTypes.CASE_KEYWORD;
          }
        case 70: break;
        case 21: 
          { return HaskellTokenTypes.TYPE_CONS;
          }
        case 71: break;
        case 4: 
          { return TokenType.NEW_LINE_INDENT;
          }
        case 72: break;
        case 41: 
          { return HaskellTokenTypes.FIELD_KEYWORD;
          }
        case 73: break;
        case 28: 
          { return HaskellTokenTypes.CHARACTER;
          }
        case 74: break;
        case 46: 
          { return HaskellTokenTypes.MODULE_KEYWORD;
          }
        case 75: break;
        case 43: 
          { return HaskellTokenTypes.IMPORT_KEYWORD;
          }
        case 76: break;
        case 15: 
          { return HaskellTokenTypes.COMMA;
          }
        case 77: break;
        case 49: 
          { return HaskellTokenTypes.INSTANCE_KEYWORD;
          }
        case 78: break;
        case 2: 
          { return HaskellTokenTypes.NUMBER;
          }
        case 79: break;
        case 36: 
          { return HaskellTokenTypes.OPEN_KEYWORD;
          }
        case 80: break;
        case 12: 
          { return HaskellTokenTypes.COLON;
          }
        case 81: break;
        case 5: 
          { return TokenType.BAD_CHARACTER;
          }
        case 82: break;
        case 34: 
          { return HaskellTokenTypes.DATA_KEYWORD;
          }
        case 83: break;
        case 17: 
          { return HaskellTokenTypes.VERTICAL_BAR;
          }
        case 84: break;
        case 48: 
          { return HaskellTokenTypes.PUBLIC_KEYWORD;
          }
        case 85: break;
        case 47: 
          { return HaskellTokenTypes.MUTUAL_KEYWORD;
          }
        case 86: break;
        case 10: 
          { return HaskellTokenTypes.LEFT_PAREN;
          }
        case 87: break;
        case 45: 
          { return HaskellTokenTypes.RECORD_KEYWORD;
          }
        case 88: break;
        case 37: 
          { return HaskellTokenTypes.WITH_KEYWORD;
          }
        case 89: break;
        case 23: 
          { return HaskellTokenTypes.END_OF_LINE_COMMENT;
          }
        case 90: break;
        case 29: 
          { yybegin(YYINITIAL); return HaskellTokenTypes.COMMENT;
          }
        case 91: break;
        case 16: 
          { return HaskellTokenTypes.ASSIGNMENT;
          }
        case 92: break;
        case 20: 
          { return HaskellTokenTypes.FORALL;
          }
        case 93: break;
        case 44: 
          { return HaskellTokenTypes.HIDING_KEYWORD;
          }
        case 94: break;
        case 25: 
          { return HaskellTokenTypes.AS_KEYWORD;
          }
        case 95: break;
        case 9: 
          { return HaskellTokenTypes.RIGHT_BRACKET;
          }
        case 96: break;
        case 51: 
          { return HaskellTokenTypes.POSTULATE_KEYWORD;
          }
        case 97: break;
        case 35: 
          { return HaskellTokenTypes.TYPE_KEYWORD;
          }
        case 98: break;
        case 18: 
          { return HaskellTokenTypes.LAMBDA;
          }
        case 99: break;
        case 30: 
          { yybegin(BLOCK_COMMENT); return HaskellTokenTypes.COMMENT;
          }
        case 100: break;
        case 39: 
          { return HaskellTokenTypes.WHERE_KEYWORD;
          }
        case 101: break;
        case 32: 
          { return HaskellTokenTypes.LET_KEYWORD;
          }
        case 102: break;
        case 42: 
          { return HaskellTokenTypes.PRAGMA;
          }
        case 103: break;
        case 13: 
          { return HaskellTokenTypes.SEMICOLON;
          }
        case 104: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}